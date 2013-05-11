import java.io.File;

public class filesize {
	public static void main(String[] args) {
		File inputFile = null;
		try {
			inputFile = new File(args[0]);
		}
		catch (Exception e) {
			System.err.println("Invalid file input");
		}
		System.out.println(inputFile.length());
	}
}
