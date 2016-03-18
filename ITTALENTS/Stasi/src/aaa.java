
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class aaa {

	public static void main(String[] args) {
		
		readWrite("..\\files\\programming.txt","../output/noPun.txt");
		
	}
	
	public static void readWrite(String path,String output){
		try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					
				String line = bufferedReader.readLine();
					String noPunctoation = line.replaceAll("[^a-zA-Z ]", "");
					System.out.println(noPunctoation);
					
					
//					FileWriter fileStream = new FileWriter(outPutFile);
					FileWriter fileStream = new FileWriter(output, true);
					
					BufferedWriter writer = new BufferedWriter(fileStream);

					
					
						
						writer.write(noPunctoation);
						writer.newLine();
						writer.close();
					
			}
			
			bufferedReader.close();
			}
			catch (Exception e) {
				System.out.println("Error while reading a file.");
				System.out.println(e.getMessage());
				System.exit(0);
			}
	}

}