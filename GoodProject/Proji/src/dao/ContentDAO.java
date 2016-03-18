package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import exceptions.InvalidDAOException;
import model.Content;


public class ContentDAO extends AbstractDAO implements IContentDAO{

	@Override
	public int createContent(String category, int userId, String path, String title) throws InvalidDAOException {
		if (category!=null && path!=null){
			try {
				PreparedStatement ps = getCon ().prepareStatement("INSERT INTO contents VALUES (null, ?, ?,?,?,?,?,?);",
						PreparedStatement.RETURN_GENERATED_KEYS);
				
				//int userid,int points,int number of comments,int type id,int category id,timestamp timestamp
				
				ps.setInt(1, 0);
				ps.setInt(2, 0);
				
				String typeName=getTypeName(path);
				int typeId= getTypeByName(typeName);
				ps.setInt(3, typeId);
				int categoryId= getCategoryByName(category);
				ps.setInt(4, categoryId);
				ps.setString(5, title);
				
				ps.setString(7, path);
				
				
				Content content= new Content(category, title, path);
				//slaganeto na datata oshte go mucha
				//ps.setDate(5, content.getDate());
				  
				ps.executeUpdate();

				ResultSet result = ps.getGeneratedKeys();
				result.next();
				int contentId=result.getInt(1);
				content.setId(contentId);
				return contentId;


				
			} catch (SQLException e) {
				
				e.printStackTrace();
				throw new InvalidDAOException("Your content cannot be created -sorry. ");
			}
		} else {
			throw new InvalidDAOException("You have entered incorrect values.Try again");
		}
	}

	@Override
	public Content getContentById(int contentId) throws InvalidDAOException {
		
		Content contentToReturn = null;
		
		try {
			PreparedStatement ps = getCon().prepareStatement("SELECT * FROM contents WHERE content_id = ?");
			ps.setInt(1, contentId);
			ResultSet result = ps.executeQuery();
			result.next();
			
			
			
			
			int categoryId=result.getInt(6);
			String title=result.getString(8);
			String path=result.getString(9);
			String category =getCategoryById(categoryId);
			
			
			contentToReturn=new Content(category, title, path);
			return contentToReturn;
			

			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new InvalidDAOException("The user with id " + contentId + " cannot be found . Try again later.");

		}
	}
	
	
	
	public int getCategoryByName (String categoryName) throws InvalidDAOException {
		int categoryId = 0;
		
		try {
			PreparedStatement ps = getCon().prepareStatement("SELECT category_id FROM categories WHERE name = ?");
			
			ps.setString(1, categoryName);
			ResultSet result = ps.executeQuery();
			result.next();
			
			
			categoryId=result.getInt(1);
			
			return categoryId;
			

			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new InvalidDAOException("This type cannot be found and is probably not supported . Sorry about that.");

		}
		
		
	
}
	public int getTypeByName(String typeName) throws InvalidDAOException {
		int typeId = 0;
		
		try {
			PreparedStatement ps = getCon().prepareStatement("SELECT type_id FROM types WHERE name = ?");
			
			ps.setString(1, typeName);
			ResultSet result = ps.executeQuery();
			result.next();
			
			
			typeId=result.getInt(1);
			
			return typeId;
			

			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new InvalidDAOException("This type cannot be found and is probably not supported . Sorry about that.");
			

		}

		
	}
	
	private String getTypeName(String path){
		String [] typeName=path.split(".");
		return typeName[1];
		
	}
	private String getCategoryById( int categoryId) throws InvalidDAOException{
		PreparedStatement ps;
		
		try {
			ps = getCon().prepareStatement("SELECT name FROM categories WHERE category_id = ?");
			ps.setInt(1, categoryId);
			ResultSet result = ps.executeQuery();
			result.next();
			
			
			String category=result.getString(2);
			return category;
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new InvalidDAOException("No such category");
		}
		
		
		
	}
}
