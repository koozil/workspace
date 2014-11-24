import java.util.Scanner;

public class Zadaniafunkcje8 {
	public static int i1, i2, x, y;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj pocz�tek, a nast�pnie koniec przedzia�u:");
		i1 = odczyt.nextInt();
		i2 = odczyt.nextInt();
		for (int i = i1; i <= i2; i++) {
			System.out.printf(i + "=" + pierwsza(i));
			System.out.println();
		}
	}

	public static int pierwsza(int a) {
		x = 1;
		y = 2;
		while (x == 1 && y < Math.sqrt(a)) {
			if (a % y == 0)
				x = 0;
			y++;
		}
		return x;
	}
}