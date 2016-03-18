package bigTable;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Go {

	public static void main(String[] args) {
		BigDatabase[] values=new BigDatabase[1000];
		
		BigDatabase.GenerateServiceTypeTable();
		BigDatabase.GenerateCountryTable();
		BigDatabase.GenerateWinChanceTable();
		BigDatabase.GenerateResponseTable();
		
		
		
		
		
		for (int i = 0; i < values.length; i++) {
			values[i]=new BigDatabase();
			System.out.println(values[i].toString());
			Write(values[i].toString(),"../output/noPun.txt");
		}
		
		

	}
	
	public static void Write(String string,String output){
		try {				
//					FileWriter fileStream = new FileWriter(outPutFile);
					FileWriter fileStream = new FileWriter(output, true);
					
					BufferedWriter writer = new BufferedWriter(fileStream);

					
					
						
						writer.write(string);
						writer.newLine();
						writer.close();
					
			
			}
			catch (Exception e) {
				System.out.println("Error while reading a file.");
				System.out.println(e.getMessage());
				System.exit(0);
			}
	}

}
