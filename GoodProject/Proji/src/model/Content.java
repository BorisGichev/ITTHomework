package model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class Content implements  IPoints {
	
	
	private String myCategory;
	private int points;
	private String description;
	private ArrayList<Comment> comments;
	private int numberOfComments;
	private int id;
	private String path;
	private Date date;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	static String url = "jdbc:mysql://127.0.0.1:3306/9gag?useSSL=false";
	static String user = "boris";
	static String password = "Istinataboli1@";
	static Connection myConn = null;

	protected Content(String myCategory,String path) {
		this.points = 0;
		
		this.setDescription(" ");
		this.date=new Date();
		this.numberOfComments=0;
		this.setMyCategory(myCategory);
		comments = new ArrayList();
		this.path=path;

	}

	public Content(String myCategory,String description,String path) {
		this(myCategory,path);
		this.setDescription(description);
		
		
		
		

	}
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		if (description != null) {
			this.description = description;
		} else {
			this.description = " ";
		}
	}

	public String getMyCategory() {
		return myCategory;
	}

	public void setMyCategory(String myCategory2) {
		
		this.myCategory = myCategory2;
	}
	
	public static void createContent(String myCategory,Integer userID){
		Statement myStmt = null;
		ResultSet myRs = null;
		try {

			myConn = DriverManager.getConnection(url, user, password);

			myStmt = myConn.createStatement();

			myRs = myStmt.executeQuery("select ID from 9gag.category where name ='"+myCategory+"';");

			if(myRs.next()){
//				myStmt = myConn.createStatement();

				String sql = "insert into content " + " (Category,Uploader)"
						+ " values(  '" + myRs.getInt("ID") + "','"+userID+"')";

				myStmt.executeUpdate(sql);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (myStmt != null) {
				try {
					myStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (myConn != null) {
				try {
					myConn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	

	@Override
	public void pointsUp() {
		this.setPoints(points + 1);

	}

	@Override
	public void pointsDown() {
		this.setPoints(points - 1);

	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void addComments(Comment comment) {
		
		this.comments.add(comment);
		this.numberOfComments++;
	}

	public void deleteComment(int index) {
		comments.remove(index);
		this.numberOfComments--;

	}
	public int getNumberOfComments() {
		return numberOfComments;
	}
	
	

	
}
