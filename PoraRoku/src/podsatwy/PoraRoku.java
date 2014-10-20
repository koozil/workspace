package podsatwy;

import java.util.Scanner;

public class PoraRoku {

	public static boolean poda(int a) {
		int d = 0;
		for (int i = 1; i <= a / 2; i++) {
			if (a % i == 0)
				d++;
		}
		if (d < 2)
			return true;
		else
			return false;
	}

	public static boolean czykat(int a, int b, int c) {
		if ((a + b > c) && (a + c > b) && (b + c > a))
			return true;
		else
			return false;
	}

	public static boolean czykatp(int a, int b, int c) {
		if ((a * a + b * b - c * c) * (a * a + c * c - b * b)
				* (b * b + c * c - a * a) == 0)
			return true;
		else
			return false;
	}

	public static Scanner cin;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);

		int d1, d2, d3;
		System.out.println("Podaj Miesi¹c");
		d1 = cin.nextInt();
		System.out.println("Podaj Dzieñ");
		d2 = cin.nextInt();
		/*
		 * System.out.println("Podaj Bok 3"); d3=cin.nextInt();
		 * //System.out.println("Liczby Podzielne przez : "+d3);
		 */
		switch (d1) {
		case 1:
			;
		}
		if ((d1 > 13) & (d2 > 32))
			System.out.println("Z³e liczby");
		else if ((d1 >= 3) && (d1 <= 6))
			if ((d2 >= 21) && (d2 <= 22))
				System.out.println("Wiosna");
			else
				;
		else if ((d1 >= 6) && (d1 <= 9) && (d2 >= 22) && (d2 <= 23))
			System.out.println("Lato");
		else if ((d1 >= 9) && (d1 <= 12) && (d2 >= 23) && (d2 <= 22))
			System.out.println("Jesieñ");
		else
			System.out.println("Zima");
	}

}
