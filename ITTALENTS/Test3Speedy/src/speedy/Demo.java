package speedy;

import java.time.LocalDateTime;

import dao.IProtocolDao;
import dao.ProtocolDAO;
import exceptions.ProtocolDAOException;

public class Demo {

	public static void main(String[] args) {
		
		/*
		 * Ne moga da si predstawq logikata kolkoto i da go mislq
		 * drugite neshta gi napravih, kakto trqbvashe da gi napravq i na kontrolnoto a ne da mycha  
		 * samo logikata na predavaniqta na pratkite....
		 */
		

		Client sender = new Client("Blagoi", "321354", "cheresha");
		Client reciever = new Client("mundio", "321354", "qgoda");

		Office sof = new Office("Sofiq");
		Office var = new Office("Varna");
		
//		sof.printAllClientsOrderedByNames();
//		sof.printAllPacksByTakenTime();
//		sof.showInfoForPack(1);
//		sof.showAllProtocolsForPack(1);
		
		sender.setOffice(sof);
		reciever.setOffice(var);

		Pack temp = new Pack(sender, reciever, "qica");
		temp.setWorker(sender);
		temp.setUniqueId();
		temp.setTimeTaken(LocalDateTime.now());;

		Protocol pro = new Protocol(sender, reciever);
		pro.addPack(temp);

//		System.out.println(pro.toString());
//		System.out.println(temp.toString());

//		IPackDao packDAO = new PackDAO();
		IProtocolDao protocolDAO = new ProtocolDAO();

		
		try {
			protocolDAO.addProtocol(pro);
		} catch (ProtocolDAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
