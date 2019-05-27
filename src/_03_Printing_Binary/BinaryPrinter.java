package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printShortBinary((short) 222); 
		System.out.println();
		bp.printShortBinary((short) 32700);
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

	}

	public void printLongBinary(long l) {

	} 	// 11011110
		//111111110111100
}
