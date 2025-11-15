package source;

import java.util.Scanner;

public class Tax {
	
	public void taxDeduction(int i, String[][] data, Scanner sc)
	{
		String tax = "";
		String status = "";
		int num_children = 0;
		
		while(true)
		{
			System.out.print(" Status (S/M)     :\t");
			status = sc.nextLine().trim().toUpperCase();
			
			if(status.equals("S"))
			{
				tax = "0.06";
				num_children = 0;
				break;
			}
			else if(status.equals("M"))
			{
				status = maritalType(i, sc);
				num_children = numberChildren(i, sc);
				tax = computeTax(num_children);
				break;
			}
			else
			{
				System.out.println(" Invalid input. Please enter 'S' or 'M' only.");
			}
		}
		
		data[i][8] = status;
		data[i][9] = Integer.toString(num_children);
		data[i][10] = tax;
		
	}
	
	private String maritalType(int i, Scanner sc)
	{
		String marital_type = "";
		
		while(true)
		{
			System.out.print(" Married, Widowed, or Head of the family (M/W/H):\t");
			marital_type = sc.nextLine().trim().toUpperCase();
			
			if(marital_type.equals("M") || marital_type.equals("W") || marital_type.equals("H"))
			{				
				return marital_type;
			}
			else
			{
				System.out.println(" Invalid input. Please enter 'M', 'W', or 'H' only.");
			}
		}
		
	}
	
	private int numberChildren(int i, Scanner sc)
	{
		int children = 0;
		
		while(true)
		{
			System.out.print(" No of Children:\t");
			children = sc.nextInt();
			
			sc.nextLine();
			
			if(children >= 0) return children;
			else System.out.println("Please enter a correct number of your children.");
		}
		
	}
	
	
	private String computeTax(int num_children)
	{
		String tax = "";
		
		if(num_children == 0) tax = "0.06";
		else if(num_children == 1) tax = "0.04";
		else if(num_children == 2) tax = "0.02";
		else tax = "0.00";
		
		return tax;
	}

}
