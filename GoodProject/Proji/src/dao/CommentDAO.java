package dao;

import exceptions.InvalidDAOException;
import model.Comment;

public class CommentDAO extends AbstractDAO implements ICommentDAO{

	@Override
	public int createComment(Comment comment) throws InvalidDAOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateComment(Comment comment) throws InvalidDAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comment getCommentById(int commentId) throws InvalidDAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
