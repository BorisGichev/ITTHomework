package bigTable;

public class BigDatabase {
	static int cCNumberStatic = 100;
	static String[] serviceTypeTable;
	static String[] countryTable;
	static String[] winChanceTable;
	static String[] responseTable;
	
	int cCnumber;
	int[] cCReceiveDate;
	String serviceType;
	String country;
	boolean Expedite;
	String winChance;
	int lineItemsCount;
	boolean fastTrade;
	boolean mapRequest;
	String response;
	int[] responseDate;
	
	
	boolean becomeAnOrder;

	public BigDatabase() {
		this.cCnumber = BigDatabase.cCNumberStatic;
		BigDatabase.cCNumberStatic++;

		this.cCReceiveDate = this.genarateDate();
		
		this.serviceType = BigDatabase.serviceTypeTable[(int) (Math.random() * BigDatabase.serviceTypeTable.length)];
		
	    this.country = BigDatabase.countryTable[(int) (Math.random() * BigDatabase.countryTable.length)];
	    
	    this.Expedite=(int)(Math.random()*2)==1 ? true:false;
	    
	    this.winChance = BigDatabase.winChanceTable[(int) (Math.random() * BigDatabase.winChanceTable.length)];
	    
	    
	    int randomForItemsCount=(int)(Math.random()*24);
	    if (randomForItemsCount<9) {
			this.lineItemsCount=1;
		}
	    if (randomForItemsCount>8&&randomForItemsCount<17) {
			this.lineItemsCount=2;
		}
	    if (randomForItemsCount>16&&randomForItemsCount<21) {
			this.lineItemsCount=3;
		}
	    if (randomForItemsCount>20) {
			this.lineItemsCount=4;
		}
	    
	    this.fastTrade=(int)(Math.random()*2)==1 ? true:false;
	    
	    this.mapRequest=(int)(Math.random()*2)==1 ? true:false;
	    
	    this.response = BigDatabase.responseTable[(int) (Math.random() * BigDatabase.responseTable.length)];
	    
	    this.responseDate=this.genarateResponceDate();
	    
	    if (this.response.equals(BigDatabase.responseTable[0])||this.response.equals(BigDatabase.responseTable[1])) {
			this.becomeAnOrder=(int)(Math.random()*2)==1 ? true:false;
		}
	    if (this.response.equals(BigDatabase.responseTable[2])) {
			this.becomeAnOrder=false;
		}
	}
	
	

	private int[] genarateDate() {
		int date[] = new int[3];
		date[1] = (int) (Math.random() * 29+1);
		date[0] = (int) (Math.random() * 11+1);
		date[2] = (int) (Math.random() * 3 + 2013);
		return date;
	}

	static void GenerateCountryTable() {
		BigDatabase.countryTable = new String[] { "10 Gbps eternet protected",
				"10 Gbps eternet unprotected", "10 Gbps eternet unprotected",
				"1 Gbps eternet protected", "1 Gbps eternet unprotected",
				"STM 1 SDH protected", "STM 1 SDH unprotected",
				"STM 4 SDH protected", "STM 4 SDH unprotected",
				"STM 16 SDH protected", "STM 16 SDH unprotected" };

	}

	static void GenerateServiceTypeTable() {
		BigDatabase.serviceTypeTable = new String[] { "ALB", "AND", "AUT",
				"BLR", "BEL", "BIH", "BGR", "HRV", "CYP", "CZE", "DNK", "EST",
				"FRO", "FIN", "FRA", "DEU", "GIB", "GRC", "HUN", "ISL", "IRL",
				"ITA", "LVA", "LIE", "LTU", "LUX", "MKD", "MLT", "MDA", "MCO",
				"NLD", "NOR", "POL", "PRT", "ROU", "RUS", "SMR", "SRB", "SVK",
				"SVN", "ESP", "SWE", "CHE", "UKR", "GBR", "VAT", "RSB", "IMN",
				"XKX", "MNE" };

	}
	
	static void GenerateWinChanceTable() {
		BigDatabase.winChanceTable = new String[] { "25",
				"50",
				"70",
				"80",
				"99",
				"100"};


	}
	
	static void GenerateResponseTable() {
		BigDatabase.responseTable = new String[] { "Capacity is available",
				"Capacity is available with lead time",
				"Capacity is not available"};


	}
	
	private int[] genarateResponceDate() {
		int[] date = new int[3];
		date[0] = this.cCReceiveDate[0];
		date[1] = this.cCReceiveDate[1];
		date[2] = this.cCReceiveDate[2];
		
		date[1] = date[1]+(int) (Math.random() * 2+1);
		
		if (date[1]>30) {
			date[1]=date[0]%30;
			date[0]++;
		}
		if (date[0]>12) {
			date[2]++;
		}
		return date;
	}
	
	public String toString(){
		String name= this.cCnumber+";"+this.cCReceiveDate[0]+"/"+this.cCReceiveDate[1]+"/"+this.cCReceiveDate[2]+";"+this.serviceType+";"+this.country+";"+this.Expedite+";"+this.winChance+";"+this.lineItemsCount+";"+this.fastTrade+";"+this.mapRequest+";"+this.response+";"+this.responseDate[0]+"/"+this.responseDate[1]+"/"+this.responseDate[2]+";"+this.becomeAnOrder;
		
		return name;
	}

}
