import java.util.Scanner;

public class Zadaniafunkcje7 {
	public static int i1, i2, x;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj pocz�tek, a nast�pnie koniec przedzia�u:");
		i1 = odczyt.nextInt();
		i2 = odczyt.nextInt();
		System.out.println("Liczby parzyste:");
		parzyste(i1, i2);
		System.out.println();
		System.out.println("Liczby nieparzyste:");
		nieparzyste(i1, i2);
	}

	public static void parzyste(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0)
				System.out.print(i + ", ");
		}
	}

	public static void nieparzyste(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0)
				System.out.print(i + ", ");
		}
	}
}