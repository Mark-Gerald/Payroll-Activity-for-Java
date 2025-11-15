package source;

import java.util.Scanner;

public class Search {
	
	public void searchEmployee(String[][] data, Scanner sc)
	{
		while(true)
		{
			System.out.println();
			System.out.print(" Search Employee(Y/N):\t");
			String answer = sc.nextLine().trim().toUpperCase();
			
			if(answer.equals("Y"))
			{
				System.out.print(" ID Number         :\t");
				String id_num = sc.nextLine().trim();
				System.out.print(" Name              :\t");
				String name = sc.nextLine();
				boolean employee_found = false;
				
				for(int i = 0; i < data.length; i++)
				{
					
					if(id_num.equals(data[i][0]) && name.equals(data[i][1]))
					{
						
						double rendered_hours = Double.parseDouble(data[i][2]);
						double rate = Double.parseDouble(data[i][3]);
						double overtime = Double.parseDouble(data[i][4]);
						double overtime_rate = Double.parseDouble(data[i][5]);
						double undertime = Double.parseDouble(data[i][6]);
						double undertime_rate = Double.parseDouble(data[i][7]);
						double other_deduction = Double.parseDouble(data[i][11]);
						double total_deduction = Double.parseDouble(data[i][12]);
						double overtime_pay = Double.parseDouble(data[i][13]);
						double basic_salary = Double.parseDouble(data[i][14]);
						double gross = Double.parseDouble(data[i][15]);
						double net = Double.parseDouble(data[i][16]);
						
						System.out.printf("\n%90s\n\n", "____________________ EMPLOYEE FOUND ____________________");
						
						System.out.printf(" %-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-24s%-23s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID NUM", "NAME", "HOUR(S)", "RATE", "OT", "OTR", "UT", "UTR", "STATUS", "NO. CHILDREN", "TAX PERCENT", "ODED", "TOTDED", "OTP", "BSALARY", "GROSS", "NET");
						
						System.out.printf(" %-15s%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15s%-24s%-23s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n", data[i][0], data[i][1], rendered_hours, rate, overtime, overtime_rate, undertime, undertime_rate, data[i][8], data[i][9], data[i][10], other_deduction, total_deduction, overtime_pay, basic_salary, gross, net);
						
						System.out.println();
						
						employee_found = true;
					}
				}
				
				if(!employee_found)
				{
					System.out.println();
					System.out.println(" Employee Not Found.");
				}
				
				employee_found = false;
			}
			else if(answer.equals("N"))
			{
				
				System.out.printf("\n%90s\n", "____________________ PAYROLL PROJECT ____________________");
				break;
			}
			else
			{
				System.out.println();
				System.out.println(" Invalid input. Please Enter 'Y' or 'N'.");
			}
			
		}
	}
}
