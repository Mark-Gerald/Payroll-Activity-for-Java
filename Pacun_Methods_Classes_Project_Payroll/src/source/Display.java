package source;

public class Display {
	public void printResult(String[][] data)
	{
		System.out.println("\n ================================================================= \n");
		System.out.println(" ____________________ EMPLOYEE PAYROLL REPORT ____________________ ");
		System.out.println("\n ================================================================= \n");
		
		System.out.printf(" %-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-24s%-23s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID NUM", "NAME", "HOUR(S)", "RATE", "OT", "OTR", "UT", "UTR", "STATUS", "NO. CHILDREN", "TAX PERCENT", "ODED", "TOTDED", "OTP", "BSALARY", "GROSS", "NET");

		for(int i = 0; i < data.length; i++)
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
			
			
			System.out.printf(" %-15s%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15s%-24s%-23s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n", data[i][0], data[i][1], rendered_hours, rate, overtime, overtime_rate, undertime, undertime_rate, data[i][8], data[i][9], data[i][10], other_deduction, total_deduction, overtime_pay, basic_salary, gross, net);
		}
		
		
	}
}


/*	
 *  [0] ID NUMBER
 * 	[1] NAME
 * 	[2] RENDERED HOURS
 * 	[3] RATE PER HOUR
 * 	[4] OVERTIME
 * 	[5] OVERTIME RATE
 *  [6] UNDERTIME
 *  [7] UNDERTIME RATE
 *  [8] STATUS
 *  [9] NUMBER OF CHILDREN
 *  [10] TAX PEPCENTAGE
 *  [11] OTHER DEDUCTION
 *  [12] TOTAL DEDUCTION
 *  [13] OVERTIME PAY
 *  [14] BASIC SALARY
 *  [15] GROSS
 *  [16] NET
 *  
 * */