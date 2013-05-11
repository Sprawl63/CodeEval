public class tables {
	public static void main(String[] args) {
		for (int x = 1; x < 13; x++) {
			for (int y = 1; y < 13; y++) {
				if (y != 1) {
					if (new Integer(x*y).toString().length() == 1) {
						System.out.print("   ");
					}
					if (new Integer(x*y).toString().length() == 2) {
						System.out.print("  ");
					}
					if (new Integer(x*y).toString().length() == 3) {
						System.out.print(" ");
					}
				}
				System.out.print(x*y);
			}
			System.out.print("\n");
		}
	}
}
