import java.util.*;

class UserId{
	Scanner sc = new Scanner(System.in);
	String uid,IFSC;
	int pwd;
	int History,Withdraw,Deposit,Trans,Ac;
	static int Balance;

	void putdata() {
		System.out.print("Enter User ID : \n");
		uid=sc.nextLine();
		System.out.print("Enter Passward : \n");
		pwd=sc.nextInt();
		
	   	if(uid.equals("darshan") && pwd==1345){
			while(true) {
			System.out.print("1. Transactions History\n2. Withdraw\n3. Deposit\n4. Transfer\n5. Quit \n");
			System.out.println("Press the Number");
			int Num=sc.nextInt();
			
			switch (Num) {
			case 1:
				System.out.print("Transcation History:\n"+"+"+Balance+"\n");
				break;
			case 2:
				System.out.print("\nEnter Amount to be Withdrawn:\n");
				Withdraw=sc.nextInt();
				if(Balance>= Withdraw) {
					Balance=Balance-Withdraw;
					System.out.println("Please Collect Your Money\n");
				}
				else {
					System.out.println("Insufficient Balance\n");
				}
				break;
			case 3:
				System.out.print("Enter Amount For Deposite\n");
				Deposit=sc.nextInt();
				Balance=Balance+Deposit;
				System.out.println("Your Money has been Deposited Successfully\n");
				
				break;
			case 4:
				
				System.out.print("Enter IFSC Code:\n");
				IFSC=sc.next();
				System.out.println("Enter A/C Number:");
				Ac=sc.nextInt();
				
				System.out.println("Enter Amount For Transfer:");
				Withdraw=sc.nextInt();
				if(Balance>= Withdraw) {
					Balance=Balance-Withdraw;
					System.out.println("Money has been Transfer Successfully\n");
				}
				else {
					System.out.println("Insufficient Balance\n");
				}
				
				break;
			case 5:
				System.out.print("\"Thank You Welcome Again\"");
				System.exit(Num);
	        }
    	}
	 }
	   	else {
	   		System.out.println("You Enter Worng ID & Passward");
	   	}
	
  }
}

public class AtmInterface {
	public static void main(String[] args) {
		UserId obj=new UserId();
		obj.putdata();
	}

}
