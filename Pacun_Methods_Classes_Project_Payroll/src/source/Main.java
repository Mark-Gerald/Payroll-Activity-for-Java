package source;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DataEntry data_entry = new DataEntry();
		Transaction transaction = new Transaction();
		Display display = new Display();
		Search search = new Search();

		String[][] payroll = data_entry.inputInfo(sc);
		
		transaction.compute(payroll);
		display.printResult(payroll);
		search.searchEmployee(payroll, sc);
		
	}

}
