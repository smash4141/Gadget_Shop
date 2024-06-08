package project;

import java.util.Scanner;
import java.util.ArrayList;

//import java.awt.Desktop;


interface Registration

{
	void login();

	void signup();

}

class Regi implements Registration {
	private String name = "Akash Gupta";
	// Data Hiding
	private long contact = 7083101530L;
	private String email;
    String address;
	private String password = "admin@123";

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public long getContact() {

		return contact;
	}

	public void setContact() { // Method Recursion
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your contact no");
		contact = sc.nextLong();
		if (contact > 999999999L && contact < 10000000000L) {
			System.out.println("Contact Number Valid");
		} else {
			System.out.println("Please enter 10 digits");
			setContact();
		}
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Contact: ");
		long contact = sc.nextLong();
		sc.nextLine();
		System.out.print("Enter the password : ");
		String password = sc.nextLine();
		if (this.contact == contact && this.password.equals(password)) {
			

			System.out.println("-----------------------------------------------------------------------");
//this.setName(getName());
			System.out.println("Logged in Successfully>>>>>>> " + getName()  );
			System.out.println("-----------------------------------------------------------------------");

		} else {
			System.out.println("Please Try Again");
			login();
		}
	}

	public void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();
		setContact();
		System.out.println("Enter your email");
		email = sc.nextLine();
		System.out.println("Enter your address");
		address = sc.nextLine();
		System.out.println("Enter your password");
		password = sc.nextLine();
		this.setName(getName());
		System.out.println("SignUp Successfully>>>>>>>>> " + getName()  );
		System.out.println("-----------------------------------------------------------------------");

		System.out.println("SignUp Successfully");
		
	}

}

class Airconditioner {
	String brand;
	String model;
	String rating;
	double price;
	String powerconsumption;
}

class LG extends Airconditioner {

	LG(String brand, String model, String rating, double price, String powerconsumption) {
		this.brand = brand;
		this.model = model;
		this.rating = rating;
		this.price = price;
		this.powerconsumption = powerconsumption;

	}

}

class GODREJ extends Airconditioner {
	GODREJ(String brand, String model, String rating, double price, String powerconsumption) {
		this.brand = brand;
		this.model = model;
		this.rating = rating;
		this.price = price;
		this.powerconsumption = powerconsumption;
	}

}

class BlueStar extends Airconditioner {
	BlueStar(String brand, String model, String rating, double price, String powerconsumption) {
		this.brand = brand;
		this.model = model;
		this.rating = rating;
		this.price = price;
		this.powerconsumption = powerconsumption;
	}

}

//TELEVISION

class TELEVISION {
	String brand;
	String model;
	String displaysize;
    double price;
	String features;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

// MI//
class MI extends TELEVISION {
	MI(String brand, String model, String displaysize, double price, String features) {
		this.brand = brand;
		this.model = model;
		this.displaysize = displaysize;
		// this.price=price;
		this.features = features;
	}

}

// SAMSUNG//
class SAMSUNG extends TELEVISION {
	SAMSUNG(String brand, String model, String displaysize, double price, String features) {
		this.brand = brand;
		this.model = model;
		this.displaysize = displaysize;
		// this.price=price;
		this.features = features;
	}

}

class Realme extends TELEVISION {
	Realme(String brand, String model, String displaysize, double price, String features) {
		this.brand = brand;
		this.model = model;
		this.displaysize = displaysize;
		// this.price=price;
		this.features = features;
	}

}

//MOBILE PHONES

class MOBILES {
	String brand;
	String model;
	String displaysize;
	double price;
	String ramandrom;
	int chargingw;
	String chargertype;
	String display;
}

class iphone extends MOBILES {
	iphone(String brand, String model, String displaysize, double price, String ramandrom, int chargingw,
			String chargertype, String display) {
		this.brand = brand;
		this.model = model;
		this.displaysize = displaysize;
		this.price = price;
		this.ramandrom = ramandrom;
		this.chargingw = chargingw;
		this.chargertype = chargertype;
		this.display = display;

	}
}

class oneplus extends MOBILES {
	oneplus(String brand, String model, String displaysize, double price, String ramandrom, int chargingw,
			String chargertype, String display) {
		this.brand = brand;
		this.model = model;
		this.displaysize = displaysize;
		this.price = price;
		this.ramandrom = ramandrom;
		this.chargingw = chargingw;
		this.chargertype = chargertype;
		this.display = display;

	}
}

class vivio extends MOBILES {
	vivio(String brand, String model, String displaysize, double price, String ramandrom, int chargingw,
			String chargertype, String display) {
		this.brand = brand;
		this.model = model;
		this.displaysize = displaysize;
		this.price = price;
		this.ramandrom = ramandrom;
		this.chargingw = chargingw;
		this.chargertype = chargertype;
		this.display = display;

	}
}


class WASHINGMACHINE {
	String brand;
	String model;
	String type;
	double price;
	String HWD ;
	int powerwts;
	String capacity;
	String weight;
}

class GODERJ extends WASHINGMACHINE {
	GODERJ(String brand, String model, String type, double price, String HWD, int powerwts,String capacity, String weight) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.HWD = HWD;
		this.powerwts = powerwts;
		this.capacity = capacity;
		this.weight = weight;

	}
}

class SAMSUNGWACHINGMACHINE extends WASHINGMACHINE {
	SAMSUNGWACHINGMACHINE(String brand, String model, String type, double price, String HWD, int powerwts,String capacity, String weight) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.HWD = HWD;
		this.powerwts = powerwts;
		this.capacity = capacity;
		this.weight = weight;

	}
}

class WHIRLPOOL extends WASHINGMACHINE {
	WHIRLPOOL(String brand, String model, String type, double price, String HWD, int powerwts,String capacity, String weight) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.HWD = HWD;
		this.powerwts = powerwts;
		this.capacity = capacity;
		this.weight = weight;
	}
}

class WATCH {
	String brand;
	String Battary;
	String model;
	String Voiceassistant;
	double price;
	String Fitness;
	String Gps;
	String Display;
}

// MI//
class FIREBOLT extends WATCH {
	FIREBOLT(String brand, String Battary, String model,String Voiceassistant, double price, String Fitness,String Gps,String Display) {
		this.brand = brand;
		this.Battary=Battary;
		this.model = model;
		
		this.Voiceassistant = Voiceassistant;
		this.price = price;
		this.Fitness = Fitness;
		this.Gps=Gps;
		this.Display=Display;
	}

}

// SAMSUNG//
class BOAT extends WATCH {
	BOAT(String brand, String Battary, String model,String Voiceassistant, double price, String Fitness,String Gps,String Display) {
		this.brand = brand;
		this.Battary=Battary;
		this.model = model;
		
		this.Voiceassistant = Voiceassistant;
		this.price = price;
		this.Fitness = Fitness;
		this.Gps=Gps;
		this.Display=Display;
	}

}

class APPLE extends WATCH {
	APPLE(String brand, String Battary, String model,String Voiceassistant, double price, String Fitness,String Gps,String Display) {
		this.brand = brand;
		this.Battary=Battary;
		this.model = model;
		
		this.Voiceassistant = Voiceassistant;
		this.price = price;
		this.Fitness = Fitness;
		this.Gps=Gps;
		this.Display=Display;
	}
	

}

//SOUNDBAR

class SOUNDBAR {
	String brand;
	String model;
	String connectivity;
	double price;
	String size;
}

class SONY extends SOUNDBAR {

	SONY(String brand, String model, String connectivity, double price, String size) {
		this.brand = brand;
		this.model = model;
		this.connectivity = connectivity;
		this.price = price;
		this.size = size;

	}

}

class JBL extends SOUNDBAR {
	JBL(String brand, String model, String connectivity, double price, String size) {
		this.brand = brand;
		this.model = model;
		this.connectivity = connectivity;
		this.price = price;
		this.size = size;
	}

}

class Philips extends SOUNDBAR {
	Philips(String brand, String model, String connectivity, double price, String size) {
		this.brand = brand;
		this.model = model;
		this.connectivity = connectivity;
		this.price = price;
		this.size = size;
	}

}

class efk {
	static {
		System.out.println("WELCOME TO MY GADGETS SHOP");

		System.out.println("=============================================================================");
		System.out.println("Please pay money while going");
		System.out.println("No credit!!! Main khud gareeb BEROZGHAR hu");
		System.out.println("=============================================================================");
	}

	public static void sm()throws Exception
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details for regardings");
		System.out.println("PRESS 1 FOR AC");
		System.out.println("PRESS 2 FOR TV");
		System.out.println("PRESS 3 FOR MOBILES");
		System.out.println("PRESS 4 FOR SMART WATCH");
		System.out.println("PRESS 5 FOR WASHING MACHINES");
		System.out.println("PRESS 6 FOR SOUND BAR ");
		

		int type = sc.nextInt();

		if (type == 1) {

			System.out.println("---------------------FOR LG --------------------");

			System.out.println("ENTER 1 for LG    RS-Q19YNZE ");
			System.out.println("ENTER 2 for LG    RS-Q19JNXE ");
			System.out.println("ENTER 3 for LG   PS-Q19APZF. ");
			System.out.println("ENTER 4 for LG  RS-Q24ENXE. ");

			System.out.println("---------------------FOR GODREJ --------------------");

			System.out.println(" ENTER  5 FOR    GODREJ AC" + " RS-Q19YNZE");
			System.out.println(" ENTER  6 FOR    GODREJ AC" + " GIC 18PGC5-WVA");
			System.out.println(" ENTER  7 FOR   GODREJ AC" + " GIC 18WTC3-WSB");

			System.out.println(" ENTER  8 FOR    GODREJ AC" + " SIC 12TTC3-WWA");

			System.out.println("---------------------FOR BLUESTAR --------------------");

			System.out.println(" ENTER  9 FOR    BlueStar AC" + " IA318FNU");
			System.out.println(" ENTER  10 FOR    BlueStar AC" + " IA518FLU");
			System.out.println(" ENTER  11 FOR   BlueStar AC" + " FS318EBTU");

			System.out.println(" ENTER  12 FOR    BlueStar AC" + " IC518EBTU");

			Scanner rew = new Scanner(System.in);

			LG ac1 = new LG("LG AC", " RS-Q19YNZE", "5 START *****", 44490, "Power Consumption : 685.26 W");
			LG ac2 = new LG("LG AC", " RS-Q19JNXE", "3 STAR  ***", 35999, "Power Consumption : 968.04 W");
			LG ac3 = new LG("LG AC", " PS-Q19APZF.", "5 START *****", 49990, "Power Consumption  : 818.32 kWh");
			LG ac4 = new LG("LG  AC", " RS-Q24ENXE", "3 STAR  ***", 54990, "Power Consumption :  2065 W");

			System.out.println("");
			// GODREJ COMPANY//
			GODREJ ba = new GODREJ("GODREJ AC", " RS-Q19YNZE", "5 START *****", 44490, "Power Consumption : 685.26 W");
			GODREJ re = new GODREJ("GODREJ AC", "GIC 18PGC5-WVA", "5 START *****", 40500,
					"Power Consumption : 240V, 50Hz");
			GODREJ re1 = new GODREJ("GODREJ AC", "GIC 18WTC3-WSB", "3 START ***", 34900,
					"Power Consumption : 240V, 50Hz");
			GODREJ re2 = new GODREJ("GODREJ AC", "SIC 12TTC3-WWA", "3 START ***", 27500,
					"Power Consumption : 694.03 kWh");

			System.out.println("");
			// BlueStar//

			BlueStar satr1 = new BlueStar("BlueStar AC", " IA318FNU", "3 START ***", 35950,
					"Power Consumption : 1570 W");
			BlueStar satr2 = new BlueStar("BlueStar AC", "IA518FLU", "5 START *****", 40499,
					"Power Consumption : 1365 W");
			BlueStar satr3 = new BlueStar("BlueStar AC", "FS318EBTU", "3 START ***", 38490,
					"Power Consumption : 1124.78 W");
			BlueStar satr4 = new BlueStar("BlueStar AC", "IC518EBTU", "5 START *****", 43990,
					"Power Consumption : 836.04 WW");
			System.out.println("");

			// Scanner rew = new Scanner(System.in);

			int i = rew.nextInt();
			switch (i) {
			case 1:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + ac1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + ac1.model);
				System.out.println("AC RATING : " + ac1.rating);
				System.out.println("AC PRICE : " + ac1.price);
				System.out.println(ac1.powerconsumption);
				System.out.println("");

				//////// PAYMENT DETAILS//////////////////////////////////////////////////
				System.out.println("//////////////// enter 1 for  ANY THING OTHER PRODUCT////////////////  ");
				System.out.println("////////////////enter 2 for UPI////////////////  ");
			
				System.out.println("////////////////enter 3 for COD////////////////  ");
				int E39 = rew.nextInt();
				if (E39==1) {
					sm();
					
				}
				else if(E39==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ac1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE :"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					System.out.println("LANDMARK"+address1);
					System.out.println("CITY"+address2);
					System.out.println("PINCODE" +address3);
					System.out.println(wf);
					System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ac1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E39==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 2:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + ac2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + ac2.model);
				System.out.println("AC RATING : " + ac2.rating);
				System.out.println("AC PRICE : " + ac2.price);
				System.out.println(ac2.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for UPI////////////////  ");
			
				System.out.println("////////////////enter 3 for COD////////////////  ");
				int E38 = rew.nextInt();
				if (E38==1) {
					sm();
					
				}
				else if(E38==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ac2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE :"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ac2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E38==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 3:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + ac3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + ac3.model);
				System.out.println("AC RATING : " + ac3.rating);
				System.out.println("AC PRICE : " + ac3.price);
				System.out.println(ac3.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E37 = rew.nextInt();
				if (E37==1) {
					sm();
					
				}
				else if(E37==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ac3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ac3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E37==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 4:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + ac4.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + ac4.model);
				System.out.println("AC RATING : " + ac4.rating);
				System.out.println("AC PRICE : " + ac4.price);
				System.out.println(ac4.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E36 = rew.nextInt();
				if (E36==1) {
					sm();
					
				}
				else if(E36==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ac4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCCESSFULLY PLACED =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ac4);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E36==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

//	    		System.out.println("                                                               GODREJ BRAND                                 ");

//	    		ELECTRONICSHOPSD ref2=new ELECTRONICSHOPSD();

			case 5:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + ba.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + ba.model);
				System.out.println("AC RATING : " + ba.rating);
				System.out.println("AC PRICE : " + ba.price);
				System.out.println(ac1.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER PRODUCT ////////////////  ");
				System.out.println("////////////////enter 2 for UPI////////////////  ");
			
				System.out.println("////////////////enter 3 for COD////////////////  ");
				int E35 = rew.nextInt();
				if (E35==1) {
					sm();
					
				}
				else if(E35==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ba.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ba);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E35==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 6:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + re.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + re.model);
				System.out.println("AC RATING : " + re.rating);
				System.out.println("AC PRICE : " + re.price);
				System.out.println(ac1.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER PRODUCT////////////////  ");
				System.out.println("////////////////enter 2 for UPI////////////////  ");
			
				System.out.println("////////////////enter 3 for COD////////////////  ");
				int E34 = rew.nextInt();
				if (E34==1) {
					sm();
					
				}
				else if(E34==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(re.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCCESSFULLY PLACED =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+re);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E34==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 7:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + re1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + re1.model);
				System.out.println("AC RATING : " + re1.rating);
				System.out.println("AC PRICE : " + re1.price);
				System.out.println(ac1.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E33 = rew.nextInt();
				if (E33==1) {
					sm();
					
				}
				else if(E33==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(re1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACED =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+re1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E33==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 8:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + re2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + re2.model);
				System.out.println("AC RATING : " + re2.rating);
				System.out.println("AC PRICE : " + re2.price);
				System.out.println(ac1.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E32 = rew.nextInt();
				if (E32==1) {
					sm();
					
				}
				else if(E32==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(re2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCCESSFULLY PLACED =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+re2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E32==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 9:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr1.model);
				System.out.println("AC RATING : " + satr1.rating);
				System.out.println("AC PRICE : " + satr1.price);
				System.out.println(ac1.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E31 = rew.nextInt();
				if (E31==1) {
					sm();
					
				}
				else if(E31==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCCESSFULLY PLACED =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E31==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 10:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr2.model);
				System.out.println("AC RATING : " + satr2.rating);
				System.out.println("AC PRICE : " + satr2.price);
				System.out.println(ac1.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E30 = rew.nextInt();
				if (E30==1) {
					sm();
					
				}
				else if(E30==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACED =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E30==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;
			case 11:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr3.model);
				System.out.println("AC RATING : " + satr3.rating);
				System.out.println("AC PRICE : " + satr3.price);
				System.out.println(ac1.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E29 = rew.nextInt();
				if (E29==1) {
					sm();
					
				}
				else if(E29==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E29==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 12:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr4.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr4.model);
				System.out.println("AC RATING : " + satr4.rating);
				System.out.println("AC PRICE : " + satr4.price);
				System.out.println(ac1.powerconsumption);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E28 = rew.nextInt();
				if (E28==1) {
					sm();
					
				}
				else if(E28==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr4);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E28==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			}

		}

		else if (type == 2) {
			System.out.println("---------------------MI TV --------------------");

			System.out.println("ENTER 1 MI TV     L32M8-5AIN ");
			System.out.println("ENTER 2 MI TV    ELA4692IN ");
			System.out.println("ENTER 3 MI TV    ELA4696IN. ");
			System.out.println("ENTER 4 MI TV   ELA4666IN. ");

			System.out.println("---------------------SAMSUNG TV --------------------");

			System.out.println(" ENTER  5 FOR   SAMSUNG TV" + "60BU8000K");
			System.out.println(" ENTER  6 FOR    SAMSUNG TV" + "50CU8000");
			System.out.println(" ENTER  7 FOR   SAMSUNG TV" + "65Q80A");

			System.out.println(" ENTER  8 FOR    SAMSUNG TV" + " UA32T4340BKXXL");

			System.out.println("---------------------Realme Tv --------------------");

			System.out.println(" ENTER  9 FOR    Realme Tv " + " 492796729");
			System.out.println(" ENTER  10 FOR      Realme Tv" + " 491973485");
			System.out.println(" ENTER  11 FOR    Realme Tv" + " 491973486");

			System.out.println(" ENTER  12 FOR     Realme Tv" + " 491973484");

			Scanner rew = new Scanner(System.in);

			MI TV1 = new MI("Mi TV", " L32M8-5AIN", "80 cm (32 inch)", 12499,
					"Smart Google TV 2023 Edition with HD |Dolby Audio | DTS:HD | Vivid Picture Engine");
			MI TV2 = new MI("Mi TV", " ELA4692IN", "97 cm (43 inch)", 29990, " Ultra HD (4K) LED Smart TV, 5X,");
			MI TV3 = new MI("Mi TV", " ELA4696IN", " 123cm (55 inch)", 44990,
					" Mi 139.70 cm (55 inch) Ultra HD (4K) LED Smart TV, 5X, ");
			MI TV4 = new MI("Mi TV", " ELA4666IN", " 80 (32 inch)", 12999, "  HD Ready 4C Smart LED TV ");
			System.out.println("");

			// ..SAMSUNG..//
			SAMSUNG SAM1 = new SAMSUNG("SAMSUNG TV", "60BU8000K", "152 cm (60 inch)", 75490,
					"Ultra HD (4K) Smart LED TV");

			SAMSUNG SAM2 = new SAMSUNG("SAMSUNG TV", " 50CU8000", "127 cm (50 inch)", 60990, " UHD Smart LED TV, 5X,");
			SAMSUNG SAM3 = new SAMSUNG("SAMSUNGMi TV", " 65Q80A", " 163cm (65 inch)", 109990, " QLED (4K) Smart TV ");
			SAMSUNG SAM4 = new SAMSUNG("SAMSUNG TV", " UA32T4340BKXXL", " 80 (32 inch)", 14999,
					"   Smart HD Ready TV ");
			System.out.println("");

			// realme//

			Realme ral1 = new Realme("Realme TV", "492796729", "32 cm (80 inch)", 11999, "HD LED Smart TV, Neo ");

			Realme ral2 = new Realme("Realme TV", " 491973485", "108 cm (43 inch)", 21999, " Full HD LED Smart TV");

			Realme ral3 = new Realme("Realme TV", " 491973486", " 139cm (55 inch)", 38999, " LED Smart TV ");

			Realme ral4 = new Realme("Realme TV", " 491973484", " 80 (32 inch)", 11990, "   HD Ready LED Smart TV ");
			System.out.println("");

//		     	Scanner rew = new Scanner(System.in);

			int tv = rew.nextInt();
			switch (tv) {
			case 1:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + TV1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + TV1.model);
				System.out.println("TV DISPLAY SIZE  : " + TV1.displaysize);
// private setprice 
				
				System.out.println("TV PRICE : " + TV1.price);
				System.out.println("TV FEATURES : " + TV1.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E27 = rew.nextInt();
				if (E27==1) {
					sm();
					
				}
				else if(E27==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(TV1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+TV1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E27==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;
			case 2:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + TV2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + TV2.model);
				System.out.println("TV DISPLAY SIZE  : " + TV2.displaysize);
				System.out.println("TV PRICE : " + TV2.price);
				System.out.println("TV FEATURES : " + TV2.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E26 = rew.nextInt();
				if (E26==1) {
					sm();
					
				}
				else if(E26==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(TV2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+TV2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E26==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 3:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + TV3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + TV3.model);
				System.out.println("TV DISPLAY SIZE  : " + TV3.displaysize);
				System.out.println("TV PRICE : " + TV3.price);
				System.out.println("TV FEATURES : " + TV3.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E25 = rew.nextInt();
				if (E25==1) {
					sm();
					
				}
				else if(E25==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(TV3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+TV3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E25==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 4:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + TV4.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + TV4.model);
				System.out.println("TV DISPLAY SIZE  : " + TV4.displaysize);
				System.out.println("TV PRICE : " + TV4.price);
				System.out.println("TV FEATURES : " + TV4.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E24 = rew.nextInt();
				if (E24==1) {
					sm();
					
				}
				else if(E24==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(TV4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+TV4);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E24==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			// SAMSUNG///

			case 5:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + SAM1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + SAM1.model);
				System.out.println("TV DISPLAY SIZE  : " + SAM1.displaysize);
				System.out.println("TV PRICE : " + SAM1.price);
				System.out.println("TV FEATURES : " + SAM1.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E23 = rew.nextInt();
				if (E23==1) {
					sm();
					
				}
				else if(E23==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(SAM1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+SAM1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E23==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
				break;

			case 6:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + SAM2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + SAM2.model);
				System.out.println("TV DISPLAY SIZE  : " + SAM2.displaysize);
				System.out.println("TV PRICE : " + SAM2.price);
				System.out.println("TV FEATURES : " + SAM2.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E22 = rew.nextInt();
				if (E22==1) {
					sm();
					
				}
				else if(E22==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(SAM2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+SAM2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E22==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 7:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + SAM3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + SAM3.model);
				System.out.println("TV DISPLAY SIZE  : " + SAM3.displaysize);
				System.out.println("TV PRICE : " + SAM3.price);
				System.out.println("TV FEATURES : " + SAM3.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E21 = rew.nextInt();
				if (E21==1) {
					sm();
					
				}
				else if(E21==2) {
					
					
//		
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(SAM3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+SAM3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E21==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;

			case 8:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + SAM4.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + SAM4.model);
				System.out.println("TV DISPLAY SIZE  : " + SAM4.displaysize);
				System.out.println("TV PRICE : " + SAM4.price);
				System.out.println("TV FEATURES : " + SAM4.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E20 = rew.nextInt();
				if (E20==1) {
					sm();
					
				}
				else if(E20==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(SAM4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+SAM4);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E20==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
				break;

			case 9:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + ral1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + ral1.model);
				System.out.println("TV DISPLAY SIZE  : " + ral1.displaysize);
				System.out.println("TV PRICE : " + ral1.price);
				System.out.println("TV FEATURES : " + ral1.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E19 = rew.nextInt();
				if (E19==1) {
					sm();
					
				}
				else if(E19==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ral1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ral1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E19==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
			

			
				break;

			case 10:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + ral2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + ral2.model);
				System.out.println("TV DISPLAY SIZE  : " + ral2.displaysize);
				System.out.println("TV PRICE : " + ral2.price);
				System.out.println("TV FEATURES : " + ral2.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E18 = rew.nextInt();
				if (E18==1) {
					sm();
					
				}
				else if(E18==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ral2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ral2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E18==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
			
				break;

			case 11:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + ral3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + ral3.model);
				System.out.println("TV DISPLAY SIZE  : " + ral3.displaysize);
				System.out.println("TV PRICE : " + ral3.price);
				System.out.println("TV FEATURES : " + ral3.features);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E17 = rew.nextInt();
				if (E17==1) {
					sm();
					
				}
				else if(E17==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ral3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ral3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E17==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
			
				break;

			case 12:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("TV BRAND NAME : " + ral4.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("TV MODEL NUMBER : " + ral4.model);
				System.out.println("TV DISPLAY SIZE  : " + ral4.displaysize);
				System.out.println("TV PRICE : " + ral4.getPrice());
				System.out.println("TV FEATURES : " + ral4.features);

				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E16 = rew.nextInt();
				if (E16==1) {
					sm();
					
				}
				else if(E16==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ral4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ral4);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E16==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
				break;

			}

		}

		else if (type == 3) {
			System.out.println("---------------------IPHONE --------------------");

			System.out.println("ENTER 1 IPHONE     L32M8-5AIN ");
			System.out.println("ENTER 2 IPHONE    ELA4692IN ");
			System.out.println("ENTER 3 IPHONE    ELA4696IN. ");
			System.out.println("ENTER 4 IPHONE   ELA4666IN. ");

			System.out.println("---------------------ONE PLUS --------------------");

			System.out.println(" ENTER  5 FOR   ONE PLUS " + "60BU8000K");
			System.out.println(" ENTER  6 FOR    ONE PLUS" + "50CU8000");
			System.out.println(" ENTER  7 FOR   ONE PLUS" + "65Q80A");

			System.out.println(" ENTER  8 FOR    ONE PLUS" + " UA32T4340BKXXL");

			System.out.println("---------------------Realme --------------------");

			System.out.println(" ENTER  9 FOR    Realme  " + " 492796729");
			System.out.println(" ENTER  10 FOR      Realme " + " 491973485");
			System.out.println(" ENTER  11 FOR    Realme " + " 491973486");

			System.out.println(" ENTER  12 FOR     Realme " + " 491973484");

			Scanner rew = new Scanner(System.in);

			iphone satr8 = new iphone("IPHONE", " Apple iPhone 14", "15.40 cm (6.1 inch)", 66900, "128 GB", 15,
					"USB-C Power Adapter", "Super Retina XDR OLED Display");
			iphone satr9 = new iphone("IPHONE  ", " Apple iPhone 14 Plus", "16.95 cm (6.7 Inch)", 79900, "128 GB", 15,
					"USB-C Power Adapter", " OLED Display");
			iphone satr10 = new iphone("IPHONE  ", " Apple iPhone 15", "15.40 cm (6.1 inch)", 89900, "256 GB", 15,
					"USB-C Power Adapter", " Super Retina XDR Display");
			iphone satr11 = new iphone("IPHONE  ", " Apple iPhone 15 Pro", "15.54 cm (6.1 inch) ", 164900, "512 GB", 15,
					"USB-C Power Adapter", "  Super Retina XDR Display");

			System.out.println("");

			/// ONEPLUS

			oneplus on0 = new oneplus("ONEPLUS", "  OnePlus Nord CE 3 5G", " 6.7 Inches", 26999,
					" 8GB RAM, 128GB Storage", 80, "SUPERVC Fast-charging",
					"120 Hz AMOLED FHD+, Resolution: 2412 x 1080 pixels");
			oneplus on1 = new oneplus("ONEPLUS  ", " OnePlus Nord 3 5G", "6.74 Inches", 33999,
					" 8GB RAM, 128GB Storage", 80, "SUPERVOOC Fast-charging",
					" 120 Hz AMOLED FHD+ Display with Corning Gorilla Glass Victus");
			oneplus on2 = new oneplus("ONEPLUS  ", " OnePlus Nord N20 SE", "16.66 cm (6.56 inch)", 14999,
					" 4 GB RAM   128 GB Storage", 80, "USB-C Power Adapter", " Super Retina XDR Display");
			oneplus on3 = new oneplus("ONEPLUS  ", " OnePlus 10T 5G ", "6.7(INCHES) ", 54999,
					" 12GB RAM, 256GB Storage", 150, " 4800 mAh with 150W SuperVOOC",
					"  120 Hz Fluid AMOLED Display with Corning Gorilla Glass");
			System.out.println("");

			// REALME
			// we not alloted the values

			vivio real0 = new vivio("REALME", "  realme narzo 60X 5G", " 6.72 Inches", 14499, " 6GB,128GB Storage", 33,
					"Segments only 33W Supervooc Charge type C", "90Hz Super AMOLED Display.");
			vivio real1 = new vivio("REALME  ", "realme 11 Pro 5G ", "6.7 inches", 23315, " 8GB RAM, 256GB Storage", 67,
					"67W SUPERVOOC  Charge type C ",
					"Curved Vision Display,It comes with an array of features like 2160 Hz PWM dimming");
			vivio real2 = new vivio("REALME  ", " realme narzo N53", "(6.47 inch)", 8999, " 4 GB RAM   64 GB Storage",
					33, "SUPERVOOC  Charge type C", " Super Retina XDR Display");
			vivio real3 = new vivio("REALME  ", " OnePlus 10T 5G ", "6.7(INCHES) ", 54999, " 12GB RAM, 256GB Storage",
					150, " 4800 mAh with 150W SuperVOOC", "  Slimmest Phone in Segment | 90 Hz Smooth Display");
			/// casefro change mobile

			System.out.println("");

			int k = rew.nextInt();
			switch (k) {
			case 1:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr8.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr8.model);
				System.out.println("display size : " + satr8.displaysize);
				System.out.println("mobile PRICE : " + satr8.price);
				System.out.println("mobile ram : " + satr8.ramandrom);
				System.out.println("mobile wats : " + satr8.chargingw);
				System.out.println("mobile c : " + satr8.chargertype);
				System.out.println("mobile display : " + satr8.display);
				// System.out.println(a);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E15 = rew.nextInt();
				if (E15==1) {
					sm();
					
				}
				else if(E15==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr8.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr8);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E15==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
				
			
				break;

			case 2:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr9.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr9.model);
				System.out.println("display size : " + satr9.displaysize);
				System.out.println("mobile PRICE : " + satr9.price);
				System.out.println("mobile ram : " + satr9.ramandrom);
				System.out.println("mobile wats : " + satr9.chargingw);
				System.out.println("mobile c : " + satr9.chargertype);
				System.out.println("mobile display : " + satr9.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E14 = rew.nextInt();
				if (E14==1) {
					sm();
					
				}
				else if(E14==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr9.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr9);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E14==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
				
				break;

			case 3:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr10.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr10.model);
				System.out.println("display size : " + satr10.displaysize);
				System.out.println("mobile PRICE : " + satr10.price);
				System.out.println("mobile ram : " + satr10.ramandrom);
				System.out.println("mobile wats : " + satr10.chargingw);
				System.out.println("mobile c : " + satr10.chargertype);
				System.out.println("mobile display : " + satr10.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E13 = rew.nextInt();
				if (E13==1) {
					sm();
					
				}
				else if(E13==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr10.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr10);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E13==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
				break;
			case 4:

				System.out.println("********************************");
				System.out.println("");

				System.out.println("BRAND NAME : " + satr11.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr11.model);
				System.out.println("display size : " + satr11.displaysize);
				System.out.println("mobile PRICE : " + satr11.price);
				System.out.println("mobile ram : " + satr11.ramandrom);
				System.out.println("mobile wats : " + satr11.chargingw);
				System.out.println("mobile c : " + satr11.chargertype);
				System.out.println("mobile display : " + satr11.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E12 = rew.nextInt();
				if (E12==1) {
					sm();
					
				}
				else if(E12==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr11.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr11);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E12==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
				
				break;

			case 5:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + on0.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + on0.model);
				System.out.println("display size : " + on0.displaysize);
				System.out.println("mobile PRICE : " + on0.price);
				System.out.println("mobile ram : " + on0.ramandrom);
				System.out.println("mobile wats : " + on0.chargingw);
				System.out.println("mobile c : " + on0.chargertype);
				System.out.println("mobile display : " + on0.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E11 = rew.nextInt();
				if (E11==1) {
					sm();
					
				}
				else if(E11==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(on0.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+on0);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E11==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
			
				break;

			case 6:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + on1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + on1.model);
				System.out.println("display size : " + on1.displaysize);
				System.out.println("mobile PRICE : " + on1.price);
				System.out.println("mobile ram : " + on1.ramandrom);
				System.out.println("mobile wats : " + on1.chargingw);
				System.out.println("mobile c : " + on1.chargertype);
				System.out.println("mobile display : " + on1.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E10 = rew.nextInt();
				if (E10==1) {
					sm();
					
				}
				else if(E10==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(on1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+on1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E10==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
			
				break;

			case 7:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + on2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + on2.model);
				System.out.println("display size : " + on2.displaysize);
				System.out.println("mobile PRICE : " + on2.price);
				System.out.println("mobile ram : " + on2.ramandrom);
				System.out.println("mobile wats : " + on2.chargingw);
				System.out.println("mobile c : " + on2.chargertype);
				System.out.println("mobile display : " + on2.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E9 = rew.nextInt();
				if (E9==1) {
					sm();
					
				}
				else if(E9==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(on2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+on2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E9==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				break;
			case 8:
				System.out.println("********************************");

				System.out.println("");
				System.out.println("BRAND NAME : " + on3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + on3.model);
				System.out.println("display size : " + on3.displaysize);
				System.out.println("mobile PRICE : " + on3.price);
				System.out.println("mobile ram : " + on3.ramandrom);
				System.out.println("mobile wats : " + on3.chargingw);
				System.out.println("mobile c : " + on3.chargertype);
				System.out.println("mobile display : " + on3.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E8 = rew.nextInt();
				if (E8==1) {
					sm();
					
				}
				else if(E8==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(on3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+on3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E8==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
				break;

			case 9:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + real0.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + real0.model);
				System.out.println("display size : " + real0.displaysize);
				System.out.println("mobile PRICE : " + real0.price);
				System.out.println("mobile ram : " + real0.ramandrom);
				System.out.println("mobile wats : " + real0.chargingw);
				System.out.println("mobile c : " + real0.chargertype);
				System.out.println("mobile display : " + real0.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E7 = rew.nextInt();
				if (E7==1) {
					sm();
					
				}
				else if(E7==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(real0.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRESS IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+real0);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E7==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
				
				break;

			case 10:
				System.out.println("********************************");
				System.out.println("");

				System.out.println("BRAND NAME : " + real1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + real1.model);
				System.out.println("display size : " + real1.displaysize);
				System.out.println("mobile PRICE : " + real1.price);
				System.out.println("mobile ram : " + real1.ramandrom);
				System.out.println("mobile wats : " + real1.chargingw);
				System.out.println("mobile c : " + real1.chargertype);
				System.out.println("mobile display : " + real1.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E6 = rew.nextInt();
				if (E6==1) {
					sm();
					
				}
				else if(E6==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(real1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVERY ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+real1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E6==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				

				break;

			case 11:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + real2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + real2.model);
				System.out.println("display size : " + real2.displaysize);
				System.out.println("mobile PRICE : " + real2.price);
				System.out.println("mobile ram : " + real2.ramandrom);
				System.out.println("mobile wats : " + real2.chargingw);
				System.out.println("mobile c : " + real2.chargertype);
				System.out.println("mobile display : " + real2.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E5 = rew.nextInt();
				if (E5==1) {
					sm();
					
				}
				else if(E5==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(real2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+real2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E5==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
				
				break;

			case 12:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + real3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + real3.model);
				System.out.println("display size : " + real3.displaysize);
				System.out.println("mobile PRICE : " + real3.price);
				System.out.println("mobile ram : " + real3.ramandrom);
				System.out.println("mobile wats : " + real3.chargingw);
				System.out.println("mobile c : " + real3.chargertype);
				System.out.println("mobile display : " + real3.display);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E4 = rew.nextInt();
				if (E4==1) {
					sm();
					
				}
				else if(E4==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(real3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+real3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E4==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				

				break;

			}

		}

		else if (type == 4) {
			System.out.println("---------------------FIREBOLT --------------------");

			System.out.println("ENTER 1 FIREBOLT SMART WATCH     L32M8-5AIN ");
			System.out.println("ENTER 2 FIREBOLT SMART WATCH   ELA4692IN ");
			System.out.println("ENTER 3 FIREBOLT SMART WATCH    ELA4696IN. ");
			System.out.println("ENTER 4 FIREBOLT SMART WATCH   ELA4666IN. ");

			System.out.println("---------------------BOAT WATCH --------------------");

			System.out.println(" ENTER  5 FOR   BOAT SMART WATCH " + "60BU8000K");
			System.out.println(" ENTER  6 FOR     BOAT SMART WATCH" + "50CU8000");
			System.out.println(" ENTER  7 FOR    BOAT SMART WATCH" + "65Q80A");

			System.out.println(" ENTER  8 FOR     BOAT SMART WATCH" + " UA32T4340BKXXL");

			System.out.println("---------------------APPLE WATCH --------------------");

			System.out.println(" ENTER  9 FOR     APPLE SMART WATCH  " + " 492796729");
			System.out.println(" ENTER  10 FOR      APPLE SMART WATCH " + " 491973485");
			System.out.println(" ENTER  11 FOR    APPLE SMART WATCH " + " 491973486");

			System.out.println(" ENTER  12 FOR     APPLE SMART WATCH " + " 491973484");

			Scanner rew = new Scanner(System.in);
			
			
			FIREBOLT wa1 = new FIREBOLT("FIREBOLT SMART WATCH", " UPTO 7 DAYS ", "beatXP Vega Neo ","AI Voice Assistant ", 12499," tracks your heart rate, sp02, and even your sleep","YES Avialable"," 1.43\" (3.6 cm) Super AMOLED Display");
			FIREBOLT wa2 = new 	FIREBOLT("FIREBOLT SMART WATCH", " UPTO 7 DAYS ", "Fire-Boltt Invincible Plus ","AI Voice Assistant ", 3999," tracks your heart rate AND 300+ Sports Modes","YES Avialable","1.43 AMOLED Display");		
			FIREBOLT wa3= new FIREBOLT("FIREBOLT SMART WATCH", " UPTO 7 DAYS ", "Fire-Boltt Ninja Call Pro ","AI Voice Assistant ", 1049,"  100 Sports Modes, with SpO2 & Heart Rate Monitoring","YES Avialable"," 1.69\" Display");
			FIREBOLT wa4 = new FIREBOLT("FIREBOLT SMART WATCH", " UPTO 7 DAYS ", "Fire-Boltt Combat "," Voice Assistant BT Calling", 1599," tracks your heart rate, sp02, and even your sleep","YES Avialable"," 1.95\" Large Display");
			System.out.println("");

			// ..BOAT WATCH..//
			BOAT BO = new BOAT("BOAT", " UPTO 7 DAYS ", " Lunar Comet Smart Watch ","AI Voice Assistant ", 1399," 100 Watch Faces, Heart Rate & SPO2 Monitoring","YES Avialable","1.39\" HD Display");
		
			BOAT BO2 = new BOAT("BOAT", " UPTO 7 DAYS ", "boAt Wave Fury  ","Bluetooth Calling  ", 1099," tracks your heart rate, sp02, and even your sleep","YES Avialable"," 1.83'' HD Display");
			
			BOAT BO3 = new BOAT("BOAT", " UPTO 7 DAYS ", "beat WAVE GENESIS ","AI Voice Assistant ", 1999," tracks your heart rate, sp02, and even your sleep","YES Avialable"," 1.96'' HD Display, ");
			
			BOAT BO4 = new BOAT("BOAT", " UPTO 7 DAYS ", "boAt Lunar Call Pro","AI Voice Assistant ", 3499," tracks your heart rate, sp02, and even your sleep","YES Avialable","  1.39” AMOLED Display ");
			
			System.out.println("");

			// APPLE SMART WATCH//

			APPLE AP = new APPLE("APPLE", " UPTO 7 DAYS ", "Apple Watch SE (2nd Gen)","AI Voice Assistant ", 27299,"Sleep Tracker, Crash Detection, Heart Rate Monitor","YES Avialable GPS 44 mm","Retina Display ");
			
			APPLE AP2 = new APPLE("APPLE", " UPTO 7 DAYS ", "Apple Watch Ultra 2","AI Voice Assistant ", 89900," Fitness Tracker, Precision GPS, Action Button","YES Avialable [GPS + Cellular 49mm]","  Bright Retina Display ");
			

			APPLE AP3 = new APPLE("APPLE", " UPTO 7 DAYS ", "Apple Watch Series 9","AI Voice Assistant ", 44900," Fitness Tracker, Blood Oxygen & ECG Apps","YES Avialable"," Always-On Retina Display ");
			
			APPLE AP4 = new APPLE("APPLE", " UPTO 7 DAYS ", "R4Rich Ultra 2.11","AI Voice Assistant ", 1980," tracks your heart rate, sp02, and even your sleep","YES Avialable","  1.39” AMOLED Display ");
			
			System.out.println("");

//				     	Scanner rew = new Scanner(System.in);

			int tv = rew.nextInt();
			switch (tv) {
			
	
			
			/*this.brand = brand;
		this.Battary=Battary;
		this.model = model;
		
		this.Voiceassistant = Voiceassistant;
		this.price = price;
		this.Fitness = Fitness;
		this.Gps=Gps;
		this.Display=Display;*/
			case 1:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + wa1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + wa1.Battary);
				System.out.println("watch model : " + wa1.model);
				System.out.println("watch Voiceassistant : " + wa1.Voiceassistant);
				System.out.println("watch PRICE : " + wa1.price);
				System.out.println("watch fitness : " + wa1.Fitness);
				System.out.println("watch gps : " + wa1.Gps);
				System.out.println("watch Display : " + wa1.Display);
				System.out.println("");

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E42 = rew.nextInt();
				if (E42==1) {
					sm();
					
				}
				else if(E42==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(wa1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+wa1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E42==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
				break;
			case 2:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + wa2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + wa2.Battary);
				System.out.println("watch model : " + wa2.model);
				System.out.println("watch Voiceassistant : " + wa2.Voiceassistant);
				System.out.println("watch PRICE : " + wa2.price);
				System.out.println("watch fitness : " + wa2.Fitness);
				System.out.println("watch gps : " + wa2.Gps);
				System.out.println("watch Display : " + wa2.Display);
				System.out.println("");

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E45 = rew.nextInt();
				if (E45==1) {
					sm();
					
				}
				else if(E45==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(wa2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+wa2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E45==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
				break;

			case 3:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + wa3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + wa3.Battary);
				System.out.println("watch model : " + wa3.model);
				System.out.println("watch Voiceassistant : " + wa3.Voiceassistant);
				System.out.println("watch PRICE : " + wa3.price);
				System.out.println("watch fitness : " + wa3.Fitness);
				System.out.println("watch gps : " + wa3.Gps);
				System.out.println("watch Display : " + wa3.Display);
				System.out.println("");

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E46= rew.nextInt();
				if (E46==1) {
					sm();
					
				}
				else if(E46==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(AP4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+wa3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E46==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
				break;

			case 4:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + wa4.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + wa4.Battary);
				System.out.println("watch model : " + wa4.model);
				System.out.println("watch Voiceassistant : " + wa4.Voiceassistant);
				System.out.println("watch PRICE : " + wa4.price);
				System.out.println("watch fitness : " + wa4.Fitness);
				System.out.println("watch gps : " + wa4.Gps);
				System.out.println("watch Display : " + wa4.Display);
				System.out.println("");
			


				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E47 = rew.nextInt();
				if (E47==1) {
					sm();
					
				}
				else if(E47==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(wa4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+wa4);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E47==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
				break;

			// SAMSUNG///

			case 5:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + BO.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + BO.Battary);
				System.out.println("watch model : " + BO.model);
				System.out.println("watch Voiceassistant : " + BO.Voiceassistant);
				System.out.println("watch PRICE : " + BO.price);
				System.out.println("watch fitness : " + BO.Fitness);
				System.out.println("watch gps : " + BO.Gps);
				System.out.println("watch Display : " + BO.Display);
				System.out.println("");
			


				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E48 = rew.nextInt();
				if (E48==1) {
					sm();
					
				}
				else if(E48==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(BO.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+BO);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E48==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
				break;

			case 6:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + BO2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + BO2.Battary);
				System.out.println("watch model : " + BO2.model);
				System.out.println("watch Voiceassistant : " + BO2.Voiceassistant);
				System.out.println("watch PRICE : " + BO2.price);
				System.out.println("watch fitness : " + BO2.Fitness);
				System.out.println("watch gps : " + BO2.Gps);
				System.out.println("watch Display : " + BO2.Display);
				System.out.println("");
				

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E49 = rew.nextInt();
				if (E49==1) {
					sm();
					
				}
				else if(E49==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(BO2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+BO2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E49==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
				break;

			case 7:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + BO3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + BO3.Battary);
				System.out.println("watch model : " + BO3.model);
				System.out.println("watch Voiceassistant : " + BO3.Voiceassistant);
				System.out.println("watch PRICE : " + BO3.price);
				System.out.println("watch fitness : " + BO3.Fitness);
				System.out.println("watch gps : " + BO3.Gps);
				System.out.println("watch Display : " + BO3.Display);
				System.out.println("");
				

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E50 = rew.nextInt();
				if (E50==1) {
					sm();
					
				}
				else if(E50==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(BO3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+BO3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E50==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
				break;

			case 8:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + BO4.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + BO4.Battary);
				System.out.println("watch model : " + BO4.model);
				System.out.println("watch Voiceassistant : " + BO4.Voiceassistant);
				System.out.println("watch PRICE : " + BO4.price);
				System.out.println("watch fitness : " + BO4.Fitness);
				System.out.println("watch gps : " + BO4.Gps);
				System.out.println("watch Display : " + BO4.Display);
				System.out.println("");
				System.out.println("////////////////ANY THING OTHER ////////////////  ");
				System.out.println("");

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E51 = rew.nextInt();
				if (E51==1) {
					sm();
					
				}
				else if(E51==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(BO4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+BO4);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E51==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					

				
				break;

			case 9:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + AP.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + AP.Battary);
				System.out.println("watch model : " + AP.model);
				System.out.println("watch Voiceassistant : " + AP.Voiceassistant);
				System.out.println("watch PRICE : " + AP.price);
				System.out.println("watch fitness : " + AP.Fitness);
				System.out.println("watch gps : " + AP.Gps);
				System.out.println("watch Display : " + AP.Display);
				System.out.println("");
				System.out.println("////////////////ANY THING OTHER ////////////////  ");
				System.out.println("");

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E52 = rew.nextInt();
				if (E52==1) {
					sm();
					
				}
				else if(E52==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(AP.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+AP);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E52==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					

				
				break;

			case 10:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + AP2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + AP2.Battary);
				System.out.println("watch model : " + AP2.model);
				System.out.println("watch Voiceassistant : " + AP2.Voiceassistant);
				System.out.println("watch PRICE : " + AP2.price);
				System.out.println("watch fitness : " + AP2.Fitness);
				System.out.println("watch gps : " + AP2.Gps);
				System.out.println("watch Display : " + AP2.Display);
				System.out.println("");

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E57 = rew.nextInt();
				if (E57==1) {
					sm();
					
				}
				else if(E57==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(AP2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+AP2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E57==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
				break;

			case 11:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + AP3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + AP3.Battary);
				System.out.println("watch model : " + AP3.model);
				System.out.println("watch Voiceassistant : " + AP3.Voiceassistant);
				System.out.println("watch PRICE : " + AP3.price);
				System.out.println("watch fitness : " + AP3.Fitness);
				System.out.println("watch gps : " + AP3.Gps);
				System.out.println("watch Display : " + AP3.Display);
				System.out.println("");
				System.out.println("////////////////ANY THING OTHER ////////////////  ");
				System.out.println("");
				

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E56 = rew.nextInt();
				if (E56==1) {
					sm();
					
				}
				else if(E56==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(AP3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+AP3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E56==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					

				
				break;

			case 12:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("watch BRAND NAME : " + AP4.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("watch Battary : " + AP4.Battary);
				System.out.println("watch model : " + AP4.model);
				System.out.println("watch Voiceassistant : " + AP4.Voiceassistant);
				System.out.println("watch PRICE : " + AP4.price);
				System.out.println("watch fitness : " + AP4.Fitness);
				System.out.println("watch gps : " + AP4.Gps);
				System.out.println("watch Display : " + AP4.Display);
				System.out.println("");
				
				System.out.println("");

				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
			
				System.out.println("////////////////enter 3 for cod////////////////  ");
				int E55 = rew.nextInt();
				if (E55==1) {
					sm();
					
				}
				else if(E55==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(AP4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+AP4);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(E55==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
			
					
					
					
					
				
			}

		}

		else if (type == 5) {
			System.out.println("---------------------GODERJ --------------------");

			System.out.println("ENTER 1 GODERJ    WF Eon 8014 PASC GR ");
			System.out.println("ENTER 2 GODERJ    WF Eon 7012 PASC SV ");
			System.out.println("ENTER 3 GODERJ    WF Eon 600 PAEC White. ");
			System.out.println("ENTER 4 GODERJ   WF Eon 7012 PASC GR. ");

			System.out.println("---------------------SAMSUNG WACHING MACHINE --------------------");

			System.out.println(" ENTER  5 FOR   SAMSUNG WACHING MACHINE " + "SENATOR WSS 8014");
			System.out.println(" ENTER  6 FOR    SAMSUNG WACHING MACHINE" + "WA65T4262GG/TL,");
			System.out.println(" ENTER  7 FOR   SAMSUNG WACHING MACHINE" + "WW70T4020EE/TL");

			System.out.println(" ENTER  8 FOR    SAMSUNG WACHING MACHINE" + " WA10BG4546BDTL");

			System.out.println("---------------------WHIRLPOOL --------------------");

			System.out.println(" ENTER  9 FOR    WHIRLPOOL  " + "MAGIC CLEAN 70S");
			System.out.println(" ENTER  10 FOR      WHIRLPOOL " + " STAINWASH PRO ");
			System.out.println(" ENTER  11 FOR    WHIRLPOOL " + " MAGIC CLEAN 8.5 ");

			System.out.println(" ENTER  12 FOR     WHIRLPOOL " + " MAGIC CLEAN 6.5 GENx");

			Scanner rew = new Scanner(System.in);
			
			
			

			GODERJ satr8 = new GODERJ("GODERJ", "  WF Eon 8014 PASC GR", "Fully Automatic Front Load Washing Machines",47500 , "840 x 595 x 585", 220-240/50,"8 kg", "71 kg");
			GODERJ satr9 = new GODERJ("GODERJ", " WF Eon 7012 PASC SV", "Fully Automatic Front Load Washing Machines",44500 , "845 x 597 x 527", 220-240/50,"7 kg", "63 kg");
			GODERJ satr10 = new GODERJ("GODERJ", "  WF Eon 600 PAEC White", "Fully Automatic Front Load Washing Machines",34400 , "845x597x497", 220-240/50,"6 kg", "56.5 kg");
			GODERJ satr11 = new GODERJ("GODERJ", "  WF Eon 7012 PASC GR", "Fully Automatic Front Load Washing Machines",45500 , "845x597x527", 220-240/50,"7 kg", "63 kg");

			System.out.println("");

			/// ONEPLUS

			SAMSUNGWACHINGMACHINE on0 = new SAMSUNGWACHINGMACHINE("SAMSUNG wasing machine", " SENATOR WSS 8014", "Fully Automatic Front Load Washing Machines",38490 , "61.5 x 59.8 x 87.5", 220-240/50,"8 kg", "75 kg");
			SAMSUNGWACHINGMACHINE on1 = new SAMSUNGWACHINGMACHINE("AMSUNG wasing machine", " WA65T4262GG/TL", "Fully Automatic Front Load Washing Machines",15490 , "56.8 x 54 x 99.5 ", 220-240/50,"7 kg", "73 kg");
			SAMSUNGWACHINGMACHINE on2 = new SAMSUNGWACHINGMACHINE("AMSUNG wasing machine", " WW70T4020EE/TL", "Fully Automatic Front Load Washing Machines",27990 , "845 x 597 x 527", 220-240/50,"7 kg", "65 kg");
			SAMSUNGWACHINGMACHINE on3 = new SAMSUNGWACHINGMACHINE("AMSUNG wasing machine", " WA10BG4546BDTL", "Fully Automatic Front Load Washing Machines",23390 , "56.8 x 54 x 100.8", 220-240/50,"10 +kg", "30 kg");
			System.out.println("");

			// REALME
			// we not alloted the values

			WHIRLPOOL real0 = new WHIRLPOOL("WHIRLPOOL", "  MAGIC CLEAN 70S", "Fully Automatic Front Load Washing Machines",9990 , "80.5 x 95 x 52", 220-240/50,"7 kg", "30 kg");
			WHIRLPOOL real1 = new WHIRLPOOL("WHIRLPOOL", " STAINWASH PRO ", "Fully Automatic Front Load Washing Machines",17990 , "58 x 101x 58", 220-240/50,"7.5 kg", "35 kg");
			WHIRLPOOL real2 = new WHIRLPOOL("WHIRLPOOL", "MAGIC CLEAN 8.5 ", "Fully Automatic Front Load Washing Machines",12990 , "84.5 x 94 x 50", 220-240/50,"8.5 kg", "25 kg");
			WHIRLPOOL real3 = new WHIRLPOOL("WHIRLPOOL", "  MAGIC CLEAN 6.5 GENx", "Fully Automatic Front Load Washing Machines",14240 , "54x 87 x 86.5", 220-240/50,"6.5 kg", "28 kg");
			/// casefro change mobile

			System.out.println("");

			int k = rew.nextInt();
			switch (k) {
			case 1:
				

			

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr8.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr8.model);
				System.out.println("display size : " + satr8.type);
				System.out.println(" PRICE : " + satr8.price);
				System.out.println(" ram : " + satr8.HWD);
				System.out.println(" wats : " + satr8.powerwts);
				System.out.println(" capacity : " + satr8.capacity);
				System.out.println(" display : " + satr8.weight);
				// System.out.println(a);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa79 = rew.nextInt();
				if (pa79==1) {
					sm();
					
				}
				else if(pa79==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+satr8);
					System.out.println(satr8.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr8);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa79==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
				
				
			case 2:


				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr9.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr9.model);
				System.out.println("display size : " + satr9.type);
				System.out.println(" PRICE : " + satr9.price);
				System.out.println(" ram : " + satr9.HWD);
				System.out.println(" wats : " + satr9.powerwts);
				System.out.println(" capacity : " + satr9.capacity);
				System.out.println(" display : " + satr9.weight);		
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa78 = rew.nextInt();
				if (pa78==1) {
					sm();
					
				}
				else if(pa78==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+satr9);
					System.out.println(satr9.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr9);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa78==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
				
				

			case 3:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr10.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr10.model);
				System.out.println("display size : " + satr10.type);
				System.out.println(" PRICE : " + satr10.price);
				System.out.println(" ram : " + satr10.HWD);
				System.out.println(" wats : " + satr10.powerwts);
				System.out.println(" capacity : " + satr10.capacity);
				System.out.println(" display : " + satr10.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa77 = rew.nextInt();
				if (pa77==1) {
					sm();
					
				}
				else if(pa77==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+satr10);
					System.out.println(satr10.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRESS======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr10);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa77==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
				
				//
			case 4:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr11.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr11.model);
				System.out.println("display size : " + satr11.type);
				System.out.println(" PRICE : " + satr11.price);
				System.out.println(" ram : " + satr11.HWD);
				System.out.println(" wats : " + satr11.powerwts);
				System.out.println("capacityc : " + satr11.capacity);
				System.out.println(" display : " + satr11.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa76 = rew.nextInt();
				if (pa76==1) {
					sm();
					
				}
				else if(pa76==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+satr11);
					System.out.println(satr11.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr11);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa76==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
					

		
	

			case 5:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + on0.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + on0.model);
				System.out.println("display size : " + on0.type);
				System.out.println(" PRICE : " + on0.price);
				System.out.println(" ram : " + on0.HWD);
				System.out.println(" wats : " + on0.powerwts);
				System.out.println(" capacity : " + on0.capacity);
				System.out.println(" display : " + on0.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa75 = rew.nextInt();
				if (pa75==1) {
					sm();
					
				}
				else if(pa75==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+on0);
					System.out.println(on0.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+on0);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa75==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
			case 6:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + on1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + on1.model);
				System.out.println("display size : " + on1.type);
				System.out.println(" PRICE : " + on1.price);
				System.out.println(" ram : " + on1.HWD);
				System.out.println(" wats : " + on1.powerwts);
				System.out.println(" capacity : " + on1.capacity);
				System.out.println(" display : " + on1.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa74 = rew.nextInt();
				if (pa74==1) {
					sm();
					
				}
				else if(pa74==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+on1);
					System.out.println(on1.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+on1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa74==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
				
			case 7:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + on2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + on2.model);
				System.out.println("display size : " + on2.type);
				System.out.println(" PRICE : " + on2.price);
				System.out.println(" ram : " + on2.HWD);
				System.out.println(" wats : " + on2.powerwts);
				System.out.println("capacity : " + on2.capacity);
				System.out.println(" display : " + on2.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa = rew.nextInt();
				if (pa==1) {
					sm();
					
				}
				else if(pa==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+on2);
					System.out.println(on3.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+on2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
				
				
			case 8:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + on3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + on3.model);
				System.out.println("display size : " + on3.type);
				System.out.println(" PRICE : " + on3.price);
				System.out.println(" ram : " + on3.HWD);
				System.out.println(" wats : " + on3.powerwts);
				System.out.println(" capacity : " + on3.capacity);
				System.out.println(" display : " + on3.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa1 = rew.nextInt();
				if (pa1==1) {
					sm();
					
				}
				else if(pa1==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+on3);
					System.out.println(on3.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+on3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa1==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
				
			case 9:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + real0.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + real0.model);
				System.out.println("display size : " + real0.type);
				System.out.println(" PRICE : " + real0.price);
				System.out.println(" ram : " + real0.HWD);
				System.out.println(" wats : " + real0.powerwts);
				System.out.println(" capacity : " + real0.capacity);
				System.out.println(" display : " + real0.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa4 = rew.nextInt();
				if (pa4==1) {
					sm();
					
				}
				else if(pa4==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real0);
					System.out.println(real0.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+real0);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa4==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
				
				

				

			case 10:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + real1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + real1.model);
				System.out.println("display size : " + real1.type);
				System.out.println(" PRICE : " + real1.price);
				System.out.println(" ram : " + real1.HWD);
				System.out.println(" wats : " + real1.powerwts);
				System.out.println(" capacity : " + real1.capacity);
				System.out.println(" display : " + real1.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa5 = rew.nextInt();
				if (pa5==1) {
					sm();
					
				}
				else if(pa5==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real1);
					System.out.println(real1.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+real1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa5==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
					
				
				

			case 11:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + real2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + real2.model);
				System.out.println("display size : " + real2.type);
				System.out.println(" PRICE : " + real2.price);
				System.out.println(" ram : " + real2.HWD);
				System.out.println(" wats : " + real2.powerwts);
				System.out.println(" capacity : " + real2.capacity);
				System.out.println(" display : " + real2.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int pa6 = rew.nextInt();
				if (pa6==1) {
					sm();
					
				}
				else if(pa6==2) {
					
					
//					Desktop d= Desktop.getDesktop();
					System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real2);
					System.out.println(real2.price);
 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");

					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+real2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					}
					
					
				}
				else if(pa6==3) {
					System.out.println("tension mat le chinde chor gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					break;
				
				
				

				

			case 12:
				System.out.println("********************************");

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + real3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + real3.model);
				System.out.println("display size : " + real3.type);
				System.out.println(" PRICE : " + real3.price);
				System.out.println(" ram : " + real3.HWD);
				System.out.println(" wats : " + real3.powerwts);
				System.out.println(" capacity : " + real3.capacity);
				System.out.println(" display : " + real3.weight);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int kl = rew.nextInt();
				if (kl==1) {
					sm();
					
				}
				else if(kl==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(real3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+real3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(kl==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
			
					
					
					
					
					}
				}
				

		else if (type == 6) {

			System.out.println("---------------------SONY LG --------------------");

			System.out.println("ENTER 1 for SONY   Sony HT-S40R Real 5.1ch Dolby Audio Soundbar  ");
			System.out.println("ENTER 2 for SONY    RS-Q19JNXE ");
			System.out.println("ENTER 3 for SONY   PS-Q19APZF. ");
			System.out.println("ENTER 4 for SONY  RS-Q24ENXE. ");

			System.out.println("---------------------JBL GODREJ --------------------");

			System.out.println(" ENTER  5 FOR    JBL " + " RS-Q19YNZE");
			System.out.println(" ENTER  6 FOR    JBL " + " GIC 18PGC5-WVA");
			System.out.println(" ENTER  7 FOR   JBL" + " GIC 18WTC3-WSB");

			System.out.println(" ENTER  8 FOR   JBL" + " SIC 12TTC3-WWA");

			System.out.println("--------------------- Philips --------------------");

			System.out.println(" ENTER  9 FOR    Philips " + " IA318FNU");
			System.out.println(" ENTER  10 FOR    Philips " + " IA518FLU");
			System.out.println(" ENTER  11 FOR   Philips " + " FS318EBTU");

			System.out.println(" ENTER  12 FOR    Philips" + " IC518EBTU");

			Scanner rew = new Scanner(System.in);

			SONY sound = new SONY("sony  soundbar", " Sony HT-S40R Real ", " Theatre System (600W, Bluetooth & USB Connectivity, HDMI & Optical Connectivity", 24061, " 5.1ch Dolby Audio Soundbar");
			SONY sound1 = new SONY("sony  soundbar", "Sony HT-A7000 A ", "Theatre System with Dolby Atmos and Wireless", 200977, " 9.1.4ch 8K/4K 360 SSM Home Theatre");
			SONY sound2 = new SONY("sony  soundbar", "Sony HT-G700  4K Dolby", "System (400W, Surround Sound,Bluetooth Connectivity, HDMI & Optical Connectivity,", 38699, "3.1ch 4K Dolby Atmos/DTS:X");
			SONY sound3 = new SONY("sony  soundbar", " Sony HT-S400", "(330W, Wireless Connectivity, Bluetooth)", 19490, "2.1ch soundbar with Powerful Wireless subwoofer, S-Force PRO Front Surround Sound and Dolby Digital ");

			System.out.println("");
			// GODREJ COMPANY//
			JBL ba = new JBL("jbl soundbar", "JBL Cinema SB241", "Remote, HDMI ARC, Bluetooth & Optical Connectivity (110W)", 7499, "3.1ch 4K Dolby Atmos/DTS:X");
			JBL re = new JBL("jbl soundbar", "JBL Cinema SB271", "HDMI ARC, Bluetooth & Optical Connectivity (220W)", 10999,	"3.1ch Dolby Digital Soundbar with Wireless Subwoofer for Extra Deep Bass");
			JBL re1 = new JBL("jbl soundbar", "JBL Cinema SB190", "Sound Mode for Voice Clarity, HDMI eARC, Bluetooth & Optical Connectivity (380W)", 19998,"3.1 ch  Dolby Atmos Soundbar with Wireless Subwoofer for Extra Deep Bass");
			JBL re2 = new JBL("jbl soundbar", "JBL Bar 5.1", "HDMI ARC, Bluetooth, AUX & Optical Connectivity (510W)", 46999," 4K Ultra HD Soundbar with 10\"(25cm)");
	
			System.out.println("");
			// BlueStar//

			Philips satr1 = new Philips("Philips soundbar", " Philips Soundbar TAB5305", "Bluetooth Enabled, Optical Connectivity, HDMI ARC", 6999,"2.1 ch Wireless Subwoofer");
			Philips satr2 = new Philips(" Philips soundbar", "Philips Audio HTL8162", " HDMI ARC, Metal Grille", 14699,"2.1CH 160W Bluetooth Soundbar with Wireless Subwoofer");
			Philips satr3 = new Philips(" Philips soundbar", "Philips Soundbar TAB8967", "HDMI eARC", 39999," 7.1 Ch (5.1.2) Real Surround, Dolby Atmos");
			Philips satr4 = new Philips(" Philips soundbar", "Philips Soundbar TAB8947", "HDMI ARC, Metal Grille", 32999,"5.1 Ch (3.1.2) Dolby Atmos, Wireless Subwoofer UP-Firing Speakers,");
			System.out.println("");

			// Scanner rew = new Scanner(System.in);

			int i = rew.nextInt();
			switch (i) {
			case 1:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + sound.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + sound.model);
				System.out.println("SOUND CONNECTIVITY : " + sound.connectivity);
				System.out.println("SOUND BAR PRICE : " + sound.price);
				System.out.println("BAR CHANNELS "+sound.size);
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int kl = rew.nextInt();
				if (kl==1) {
					sm();
					
				}
				else if(kl==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(sound.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+sound);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(kl==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					

				sm();
				break;

			case 2:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + sound1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + sound1.model);
				System.out.println("BAR CONNECTIVITY : " + sound1.connectivity);
				System.out.println("SOUND BAR PRICE : " + sound1.price);
				System.out.println("BAR CHANNELS"+sound1.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int kls = rew.nextInt();
				if (kls==1) {
					sm();
					
				}
				else if(kls==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(sound1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+sound1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(kls==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
					
			

			
				break;

			case 3:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + sound2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + sound2.model);
				System.out.println("SOUND BAR  CONNECTIVITY : " + sound2.connectivity);
				System.out.println("SOUND BAR PRICE : " + sound2.price);
				System.out.println("SOUND BAR CHANNELS : "  +sound2.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int klse = rew.nextInt();
				if (klse==1) {
					sm();
					
				}
				else if(klse==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(sound2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+sound2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(klse==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				

				break;

			case 4:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + sound3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + sound3.model);
				System.out.println("SOUND BAR CONNECTIVITY : " + sound3.connectivity);
				System.out.println("SOUND BAR PRICE" + sound3.price);
				System.out.println("SOUND BAR CHANL : "+sound3.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int hj = rew.nextInt();
				if (hj==1) {
					sm();
					
				}
				else if(hj==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(sound3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+sound3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(hj==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
				
				break;

//	    		System.out.println("                                                               GODREJ BRAND                                 ");

//	    		ELECTRONICSHOPSD ref2=new ELECTRONICSHOPSD();

			case 5:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + ba.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + ba.model);
				System.out.println("SOUND BAR CONNECTIVITY : " + ba.connectivity);
				System.out.println("SOUND BAR PRICE : " + ba.price);
				System.out.println("SOUND BAR CHNL S : "+ba.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int sou = rew.nextInt();
				if (sou==1) {
					sm();
					
				}
				else if(sou==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(ba.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//						d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+ba);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(sou==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
			
				break;

			case 6:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + re.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + re.model);
				System.out.println("SOUND BAR CONNECTIVITY : " + re.connectivity);
				System.out.println("SOUND BAR PRICE : " + re.price);
				System.out.println("SOUND BAR CHNL : "+sound.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int soun = rew.nextInt();
				if (soun==1) {
					sm();
					
				}
				else if(soun==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(re.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+re);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(soun==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
				break;

			case 7:
				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + re1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + re1.model);
				System.out.println("SOUND BAR CONNECTIVITY : " + re1.connectivity);
				System.out.println("SOUND BAR PRICE : " + re1.price);
				System.out.println("SOUND BAR CHNL"+sound.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int ss = rew.nextInt();
				if (ss==1) {
					sm();
					
				}
				else if(ss==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(re1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+re1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(ss==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
				
				break;

			case 8:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + re2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + re2.model);
				System.out.println("SOUND BAR CONNECTIVTY : " + re2.connectivity);
				System.out.println("SOUND BAR  PRICE : " + re2.price);
				System.out.println("SOUND BAR  CHNL"+sound.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int ssa = rew.nextInt();
				if (ssa==1) {
					sm();
					
				}
				else if(ssa==2) {
					
					
//				 d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(re2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+re2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(ssa==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
				break;

			case 9:

				System.out.println("*********4***********************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr1.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr1.model);
				System.out.println("SOUND BAR  CONNECTIVITY : " + satr1.connectivity);
				System.out.println("SOUND BAR  PRICE : " + satr1.price);
				System.out.println("SOUND BAR  CHNL : "+sound.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int klds = rew.nextInt();
				if (klds==1) {
					sm();
					
				}
				else if(klds==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr1.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr1);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(klds==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
				
				break;

			case 10:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr2.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr2.model);
				System.out.println("SOUND BAR  CONNECTIVITY : " + satr2.connectivity);
				System.out.println("SOUND BAR  PRICE : " + satr2.price);
				System.out.println("SOUND BAR CHNL :" + sound.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int klss = rew.nextInt();
				if (klss==1) {
					sm();
					
				}
				else if(klss==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr2.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr2);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(klss==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
								break;
			case 11:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr3.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr3.model);
				System.out.println("SOUND BAR  CONNECTIVITY : " + satr3.connectivity);
				System.out.println("SOUND BAR  PRICE : " + satr3.price);
				System.out.println("SOUND BAR CHNL : "+sound.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				System.out.println("////////////////enter 4 To add cart////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int klsw = rew.nextInt();
				if (klsw==1) {
					sm();
					
				}
				else if(klsw==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr3.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr3);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(klsw==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}
				
				break;

			case 12:

				System.out.println("********************************");
				System.out.println("");
				System.out.println("BRAND NAME : " + satr4.brand);
				System.out.println("");
				System.out.println("********************************");
				System.out.println("BRAND MODEL : " + satr4.model);
				System.out.println("SOUND BAR  CONNECTIVITY : " + satr4.connectivity);
				System.out.println("SOUND BAR  PRICE : " + satr4.price);
				System.out.println("SOUND BAR  CHNL : "+sound.size);
				System.out.println("");
				System.out.println("//////////////// enter 1 for  ANY THING OTHER ////////////////  ");
				System.out.println("////////////////enter 2 for upi////////////////  ");
				
				System.out.println("////////////////enter 3 for cod////////////////  ");
				System.out.println("////////////////enter 4 To add cart////////////////  ");
				//System.out.println("////////////////ANY THING OTHER ////////////////  ");
				int klms = rew.nextInt();
				if (klms==1) {
					sm();
					
				}
				else if(klms==2) {
					
					
//					Desktop d= Desktop.getDesktop();
				//1	System.out.println("==================YOUR TRACKING SERIAL NUMBER =================="+real3);
					System.out.println(satr4.price);
					
					
					
					 
				    
					System.out.println("======ENTER YOUR DELIVER ADDRES======");
/////WE HAVE TO CREATE A METHOD///
					
				
					String address = rew.nextLine();
					
					
					System.out.println("LANDMARK :     "+address);
					String address1 = rew.nextLine();
					System.out.println("city :"+address);
					String address2 = rew.nextLine();
					System.out.println("pincode :"+address);
					String address3 = rew.nextLine();
					System.out.println("state :"+address);
					String address4 = rew.nextLine();
					
					
					
					
					System.out.println("press 1 FOR QR");
					
					int pay = rew.nextInt();
					switch (pay) {
					case 1:
//					d.browse(new URI("https://drive.google.com/file/d/1ZRXAf7TsO8aciEt11mWrcleHzpgMQ4uv/view?usp=share_link"));
					
					
					ArrayList wf= new ArrayList();
					wf.add("LANDMARK : "+address1);
					wf.add("CITY : "+address2);
					wf.add("PINCODE :" + address3);
					wf.add("STATE"+address4);
					System.out.println("=============================================== ORDER SUCESSFULLY PLACES =============================================== ");
					System.out.println("====================");
					
					System.out.println("YOUR DELIVERY ADDRES IS ::");
					System.out.println("====================");
					//System.out.println("LANDMARK"+address1);
					//System.out.println("CITY"+address2);
					//System.out.println("PINCODE" +address3);
					System.out.println(wf);
					//System.out.println("STATE"+ address4);
					System.out.println("====================");
					System.out.println("YOUR TRACKING SERIAL NUMBER ::"+satr4);
					System.out.println("[][][][]][][][][][][]][][][][]][][][][][][][][][");
					System.out.println("PRODUCT WILL DELIVERY TO YOUR HOME IN 2 - 3 WORKING DAYS");
					System.out.println("**********************************************************");
					
					
				}
				}
				else if(klms==3) {
					System.out.println("tension mat le  gharpe ayga");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<THANK YOU BHAI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
				}else if(klms==4){
					ArrayList s=new ArrayList();
					s.add(satr4);
					
					 System.out.println(s);
					
				}
				
				
				//break;

			}

		}
		
	//	System.out.println(s);


				
			

		
		else {
			System.out.println("<===================================================invalid intput it is ===================================================>");
			sm();
		}
	}
	

}

public class pro {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Registration r = new Regi(); // Upcasting
		System.out.println("Press 1 for signup.");
		System.out.println("Press 2 for login.");
		System.out.println("Press 0 for exit." );
		
		
		System.out.println("Enter your option : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			r.signup();
			break;
		case 2:
			r.login();
			break;
		case 0:
			System.exit(0);
			break;
		default:
			System.out.println("invalid input.");
			
		}
		efk ref = new efk();
		ref.sm();

	}

}
