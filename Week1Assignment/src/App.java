
public class App {

	public static void main(String[] args) {
		
		//Items
		double itemPrice1 = 120.45;
		double itemPrice2 = 20.12;
		String itemMSG1 = "Price of Item1:";
		System.out.println(itemMSG1 + itemPrice1);
		String itemMSG2 = "Price of item2:";
		System.out.println(itemMSG2 + itemPrice2);
		
		//Wallet Amounts
		double wallet1 = 380.67;
		double wallet2 = 90.67;
		String walletPRE1 = "Wallet1 amount before purchase:";
		System.out.println(walletPRE1 + wallet1);
		String walletPRE2 = "Wallet2 amount before purchase:";
		System.out.println(walletPRE2 + wallet2);
		
		//Friend numbers
		int friendNum1 = 1;
		String friendPRE1 = "Number of Jasons friends:";
		int friendNum2 = 7;
		System.out.println(friendPRE1 + friendNum1);
		String friendPRE2 = "Number of Buzzs friends:";
		System.out.println(friendPRE2 + friendNum2);
		
		//Age
		int age1 = 19;
		String ageMSG1 = "Buzz is";
		String ageMSG2 = "Jason is";
		String ageMSG3 = "years old.";
		int age2 = 23; 
		System.out.println(ageMSG1 +" " + age1 + " " + ageMSG3);
		System.out.println(ageMSG2 + " " +age2 + " " + ageMSG3);
		
		//Firstnames
		String firstName1 = "Jason";
		String firstMSG1 = "First name is:";
		String firstName2 = "Buzz";
		System.out.println(firstMSG1 + " " + firstName1);
		System.out.println(firstMSG1 + " " + firstName2);
		
		//Lastnames
		String lastName1 = "Howard";
		String lastMSG1 = "Last name is:";
		String lastName2 = "Redben";
		System.out.println(lastMSG1 + " " + lastName1);
		System.out.println(lastMSG1 + " " + lastName2);
		
		//MiddleInitial
		char middleIn1 = 'M';
		String middleMSG1 = "Middle initial is:";
		char middleIn2 = 'C';
		System.out.println(middleMSG1 + " " + middleIn1);
		System.out.println(middleMSG1 + " " + middleIn2);
		
		//Wallet Purchases
		String walletMSG1 = "Wallet1 Ammount after purchase of item1:";
		double walletAmt1 = wallet1 - itemPrice1;
		System.out.println(walletMSG1);
		System.out.println(walletAmt1);
		
		String walletMSG2 = "Wallet2 Ammount after purchase of item2:";
		double walletAmt2 = wallet2 - itemPrice2;
		System.out.println(walletMSG2);
		System.out.println(walletAmt2);
		
		//Friend numbers
		double avg1 = friendNum1 / age2;
		String friendMSG1 = "Jasons friends made per year:";
		System.out.println(friendMSG1 + " " + avg1);
		String friendMSG2 = "Buzzs friends made per year:";
		double avg2 = age1 / friendNum2;
		System.out.println(friendMSG2 + " " + avg2);
		
		
		//Fullnames
		String fullName1 = firstName1 +" " + middleIn1 + " " + lastName1;
		System.out.println("My full name is:" + fullName1);
		
		String fullName2 = firstName2 +" " + middleIn2 + " " + lastName2;
		System.out.println("My full name is:" + fullName2);
		
		
	}

}
