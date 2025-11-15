package source;

public class Transaction {
	
	public void compute(String[][] data)
	{
		double basic_salary = 0;
		double overtime_pay = 0;
		double gross = 0;
		double undertime_deduction = 0;
		double total_tax = 0;
		double total_deduction = 0;
		double net = 0;
		
		for(int i = 0; i < data.length; i++)
		{
			basic_salary = Double.parseDouble(data[i][2]) * Double.parseDouble(data[i][3]);
			overtime_pay = Double.parseDouble(data[i][4]) * Double.parseDouble(data[i][5]);
			gross = basic_salary + overtime_pay;
			undertime_deduction = Double.parseDouble(data[i][6]) * Double.parseDouble(data[i][7]);
			total_tax = gross * Double.parseDouble(data[i][10]);
			total_deduction =  total_tax + undertime_deduction + Double.parseDouble(data[i][11]);
			net = gross - total_deduction;
			
			data[i][12] = Double.toString(total_deduction);
			data[i][13] = Double.toString(overtime_pay);
			data[i][14] = Double.toString(basic_salary);
			data[i][15] = Double.toString(gross);
			data[i][16] = Double.toString(net);
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
 