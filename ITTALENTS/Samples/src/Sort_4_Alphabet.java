
public class Sort_4_Alphabet {

	static  String Array[]={"Hello" , "ha" , "is", "Sorting", "Example"};
	String  temp; 

	public static void main(String[] args)

	{    

	 for(int j=0; j<Array.length;j++)
	 {
	     for (int i=j+1 ; i<Array.length; i++)
	     {
	         if(Array[i].compareToIgnoreCase(Array[j])<0)
	         {
	             String temp= Array[j];
	             Array[j]= Array[i]; 
	             Array[i]=temp;


	         }
	     }

	     System.out.print(Array[j]+" ");
	 }
	}
}
