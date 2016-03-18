package dao;

import exceptions.InvalidDAOException;
import model.Comment;

public interface ICommentDAO {
	
	int createComment(Comment comment) throws InvalidDAOException;

	
	void updateComment(Comment comment) throws InvalidDAOException;

	
	
	Comment getCommentById(int commentId) throws InvalidDAOException;

;



}
