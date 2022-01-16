package com.calculator;

import java.util.Scanner;

public class Calculator {

	public void calciOperation()
	{
		int result=0;
		System.out.println("There are Four Operation Perform");
		
		System.out.println("1. For Addition");
		System.out.println("2. For Subtraction");
		System.out.println("3. For Multiplication");
		System.out.println("4. For Division");
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int choice=sc1.nextInt();
		
		switch (choice) {
		case 1:
		{
			System.out.println("Enter the First Number");
			int firstNum=sc1.nextInt();
			System.out.println("Enter the Second Number");
			int secNum=sc1.nextInt();
			result=firstNum+secNum;
			System.out.println("Addition of  Given Two Numbers is "+result);
			System.out.println("Program Ended");
			break;
		}
		
		case 2:
		{
			System.out.println("Enter the First Number");
			int firstNum=sc1.nextInt();
			System.out.println("Enter the Second Number");
			int secNum=sc1.nextInt();
			result=firstNum-secNum;
			System.out.println("Subtraction of  Given Two Numbers is "+result);
			System.out.println("Program Ended");
			break;
		}
		case 3:
		{
			System.out.println("Enter the First Number");
			int firstNum=sc1.nextInt();
			System.out.println("Enter the Second Number");
			int secNum=sc1.nextInt();
			result=firstNum*secNum;
			System.out.println("Multiplication of  Given Two Numbers is "+result);
			System.out.println("Program Ended");
			break;
		}
		case 4:
		{
			System.out.println("Enter the First Number");
			int firstNum=sc1.nextInt();
			System.out.println("Enter the Second Number");
			int secNum=sc1.nextInt();
			try {
			result=firstNum/secNum;
			System.out.println("Division of  Given Two Numbers is "+result);
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Please Enter the Correct 2 Input");
			}
			//System.out.println("Division of  Given Two Numbers is "+result);
			System.out.println("Program Ended");
			break;
		}
		
		default:
			System.out.println(" Please Enter the Correct Choice");
			break;
		}
		
	}
	
	
}
