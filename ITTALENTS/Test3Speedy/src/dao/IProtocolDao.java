package dao;

import speedy.Protocol;
import exceptions.ProtocolDAOException;

public interface IProtocolDao {
	public int addProtocol(Protocol protocol) throws ProtocolDAOException;

}
