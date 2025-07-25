package startProject;

class Bank{
	private int accountNumber;
	private int pin;

	public void setaccountNumber(int accountNumber)//used to access account number set the date
	{
		this.accountNumber=accountNumber; //  facing shadowing problem 
	}
	public void setpin(int pin)//create one more method/set the pin number
	{
		this.pin = pin;
	}
	public int getaccountNumber()
	{
		return accountNumber;
	}
	public int getpin() 
	{
		return pin;
	}
}


public class Encapsulation {

	public static void main(String[]args) {

		Bank b=new Bank();
		b.setaccountNumber(87768000);
		b.setpin(9800);
		System.out.println(b.getaccountNumber());
		System.out.println(b.getpin());


	}

}
