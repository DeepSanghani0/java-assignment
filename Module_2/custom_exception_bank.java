package Module_2;

import java.util.Scanner;

/*
	 	• W.A.J.P to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount
		  will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 2500
		  Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.
*/

class custom_exception_bank
{
	int deposit, withdraw;
	private int balance = 2000;
	
	public int balance()
	{
		return balance;
	}
	
	void deposit(int amount)
	{
		balance += amount;
	}
	
	void withdraw(int amount) throws InsufficientFundException
	{
		
		if(amount > balance)
		{
			throw new InsufficientFundException(String.format("Sorry, insufficient balance, you need more %d Rs.\nTo perform "
					+ "this transaction",(amount-balance)));
		}
		else
		{
			balance -= amount;
			System.out.println("Current balance: " + balance);
		}
		
	}
	
	public static void main(String[] args) throws InsufficientFundException 
	{
		custom_exception_bank b1 =new custom_exception_bank();
		
		System.out.println("Your previous Balance: "+b1.balance());
		Scanner sc = new Scanner(System.in);
		System.out.println("How much amount do you want to widthdraw?: ");
		int x = sc.nextInt();
		
		
		b1.withdraw(x);
		
		
		
		
	}
}
