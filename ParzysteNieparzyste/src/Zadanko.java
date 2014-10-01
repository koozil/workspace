import java.util.Scanner;

public class Zadanko {
	private static Scanner odczyt;

	static Double a, b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Podaj pocz¹tek przedzia³u: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextDouble();
		System.out.println("Podaj koniec przedzia³u: ");
		b = odczyt.nextDouble();
		System.out.println("Liczby parzyste w tym przedziale: " + (a + b));
		System.out.println("Liczby nieparzyste: " + (a - b));
	}

}