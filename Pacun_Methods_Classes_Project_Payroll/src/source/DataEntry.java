package source;

import java.util.Scanner;

public class DataEntry {
	
	public String[][] inputInfo(Scanner sc)
	{
		Tax tax = new Tax();
		
		System.out.printf("\n%90s\n", "____________________ PAYROLL PROJECT ____________________");
		
		System.out.println();
		
		System.out.print(" How Many Employee(s):\t");
		int num_employee = sc.nextInt();
		
		sc.nextLine();
		
		String[][] data = new String[num_employee][17];
		
		for(int i = 0; i < num_employee; i++)
		{
			System.out.println("\n ____________________ Employee (" + (i + 1) + ") ____________________ \n");
			
			System.out.print(" ID Number        :\t");
			data[i][0] = sc.nextLine();
			
			System.out.print(" Name             :\t");
			data[i][1] = sc.nextLine();
			
			System.out.print(" Rendered Hour(s) :\t");
			data[i][2] = sc.nextLine();
			
			System.out.print(" Rate Per Hour(s) :\t");
			data[i][3] = sc.nextLine();
			
			System.out.print(" Overtime         :\t");
			data[i][4] = sc.nextLine();
			
			System.out.print(" Overtime Rate    :\t");
			data[i][5] = sc.nextLine();
			
			System.out.print(" Undertime        :\t");
			data[i][6] = sc.nextLine();
			
			System.out.print(" Undertime Rate   :\t");
			data[i][7] = sc.nextLine();
			
			tax.taxDeduction(i,data,sc);
			
			System.out.print(" Other Deduction  :\t");
			data[i][11] = sc.nextLine();
			
			
		}
		
		return data; 
	}
}
