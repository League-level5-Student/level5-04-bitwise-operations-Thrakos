package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printLongBinary(38662395639663l);
		System.out.println();
		bp.printLongBinary(3857395739573957398l);
	}

	public void printByteBinary(byte b) {
		for (int i = 7; i >= 0; i--) {
			int thing = (int) Math.pow(2, i);
			if ((b & thing) > 0) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
		}
	}

	public void printShortBinary(short s) {
		byte first = (byte) ((s & 0b1111111100000000) >> 8);
		byte second = (byte) (s & 0b0000000011111111);
		printByteBinary(first);
		printByteBinary(second);
	}

	public void printIntBinary(int i) {
		short first = (short) ((i & 0b11111111111111110000000000000000) >> 16);
		short second = (short) (i & 0b00000000000000001111111111111111);
		printShortBinary(first);
		printShortBinary(second);
	}

	public void printLongBinary(long l) {
		int first = (int) (l >> 32);
		int second = (int) (l & 0b11111111111111111111111111111111);
		printIntBinary(first);
		printIntBinary(second);
	}	// 38662395639663 = 1000110010100111001010010110111011011101101111
		//					1000110010100111001010010110111011011101101111
		// 3857395739573957398 = 11010110001000001110001111110011011111011010010011001100010110
		//						 11010110001000001110001111110011011111011010010011001100010110
}
