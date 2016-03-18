package dao;

import exceptions.InvalidDAOException;
import model.Content;

public interface IContentDAO {
	
	public int createContent(String category, int userId, String path, String title) throws InvalidDAOException;

	
	
	Content getContentById(int contentId) throws InvalidDAOException;


}
