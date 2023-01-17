import java.io.FileNotFoundException;
import java.io.IOException;

public class FindBestPhones {
	public static String PHONES_FILE = "phone-data.txt";

	public static void main(String[] args) {
		// TODO Auto-generated catch block
		try {
			
			
			// TODO: use the parseFile method to get the phone data from the file
			PhoneList pl = PhoneParser.parseFile(PHONES_FILE);
			
			// TODO: print the model names of all the best phones
			for (Phone phone : pl.getBestPhones()) {
				System.out.println(phone.getModel());
			}
			// TODO: handle I/O failures by printing an error message
		} catch (IOException e) {

			System.out.println("File not found: " + PHONES_FILE);

		}
	}
}
