import java.io.*;
import java.util.*;

public class PhoneParser {
	/*
	 * Parses a phone data string, in the following format:
	 * 
	 * model screenSize batteryCapacity
	 * 
	 * The model name is encoded with underscores instead of spaces.
	 */
	public static Phone parse(String data) {
		// TODO: parse the phone data string, and return a Phone object.
		// you may use string manipulation, a regex, or a Scanner
		Scanner sc = new Scanner(data);

		String PhM = sc.next();
		PhM = PhM.replace("_", " ");
		double SS = Double.parseDouble(sc.next());
		int BC = sc.nextInt();

		return new Phone(PhM, SS, BC);

	}

	/*
	 * Returns a PhoneList by parsing a text file containing the phone data.
	 */
	public static PhoneList parseFile(String filename) throws IOException {
		// TODO: create a PhoneList
		PhoneList PhL = new PhoneList();
		// TODO: create a BufferedReader to read from the file
		BufferedReader file = new BufferedReader(new FileReader(filename));
		// TODO: for each line, parse it as a Phone and add it to the list
		while (true) {
			String Ph = file.readLine();
			if (Ph == null) {
				file.close();
				break;
			}
			PhL.addPhone(parse(Ph));
		}
		return PhL;
	}
}
