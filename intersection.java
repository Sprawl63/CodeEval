import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class intersection {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		}
		catch (Exception e) {
			System.err.println("Invalid file input");
		}
		while (inputScanner.hasNextLine()) {
			String input = inputScanner.nextLine();
			String[][] set = new String[2][];
			set[0] = input.split(";")[0].split(",");
			set[1] = input.split(";")[1].split(",");
			HashSet<Integer> outputSet = new HashSet<Integer>();
			for (int x = 0; x < set[0].length; x++) {
				for (int y = 0; y < set[1].length; y++) {
					if (set[0][x].equals(set[1][y])) {
						outputSet.add(Integer.parseInt(set[0][x]));
						break;
					}
				}
			}
			Iterator<Integer> outputIterator = outputSet.iterator();
			int[] outputArray = new int[outputSet.size()];
			for (int x = 0; x < outputArray.length; x++) {
				outputArray[x] = outputIterator.next();
			}
			Arrays.sort(outputArray);
			for (int x = 0; x < outputArray.length; x++) {
				System.out.print(outputArray[x]);
				if (x != outputArray.length - 1) {
					System.out.print(",");
				}
			}
			System.out.print("\n");
		}
	}
}
