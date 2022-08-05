import java.util.*;

/**
 * program to print the binary, octal and hexadecimal equivalent of a number.
 * 
 * @author ss
 *
 */
public class Conversion {
	void Conversion_method(int number) {
		String hexadecimal = Integer.toHexString(number);
		String octalvalue = Integer.toOctalString(number);
		String binaryvalue = Integer.toBinaryString(number);
		System.out.println(hexadecimal);
		System.out.println(octalvalue);
		System.out.println(binaryvalue);
	}

	public static void main(String args[]) {
		Conversion conversion = new Conversion();
		conversion.Conversion_method(2);

	}
}
