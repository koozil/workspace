import java.util.Scanner;

public class Zadaniafunkcje9 {
	public static int x, y, z, h;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		menu();
	}

	public static void menu() {
		System.out.println();
		System.out.println("0 = Wy��cz program");
		System.out.println("1 = Kwadrat");
		System.out.println("2 = Prostok�t");
		System.out.println("3 = R�wnoleg�obok");
		System.out.println("4 = Romb");
		System.out.println("5 = Tr�jk�t");
		System.out.println("6 = Ko�o");
		System.out.println("Wybierz co mamy oblicza�:");
		x = odczyt.nextInt();
		switch (x) {
		case 0:
			break;
		case 1: {
			kwadrat();
			break;
		}
		case 2: {
			prostokat();
			break;
		}
		case 3: {
			rownoleglobok();
			break;
		}
		case 4: {
			romb();
			break;
		}
		case 5: {
			trojkat();
			break;
		}
		case 6: {
			kolo();
			break;
		}
		default: {
			System.out.println("Error");
			menu();
		}
			;
		}
	}

	public static void kwadrat() {
		System.out.println("Podaj bok kwadratu: ");
		x = odczyt.nextInt();
		System.out.println("Pole: " + x * x);
		System.out.println("Obw�d:" + 4 * x);
		menu();
	}

	public static void prostokat() {
		System.out.println("Podaj podstawe prostokata: ");
		x = odczyt.nextInt();
		System.out.println("Podaj wysoko�� prostokata: ");
		y = odczyt.nextInt();
		System.out.println("Pole: " + x * y);
		System.out.println("Obw�d:" + (x * 2 + y * 2));
		menu();
	}

	public static void rownoleglobok() {
		System.out.println("Podaj podstaw�: ");
		x = odczyt.nextInt();
		System.out.println("Podaj bok: ");
		y = odczyt.nextInt();
		System.out.println("Podaj wysoko��: ");
		z = odczyt.nextInt();
		System.out.println("Pole: " + x * z);
		System.out.println("Obw�d:" + (2 * x + 2 * y));
		menu();
	}

	public static void romb() {
		System.out.println("Podaj bok rombu: ");
		x = odczyt.nextInt();
		System.out.println("Podaj wysoko�� rombu: ");
		y = odczyt.nextInt();
		System.out.println("Pole: " + x * y);
		System.out.println("Obw�d:" + 4 * x);
		menu();
	}

	public static void trojkat() {
		System.out.println("Podaj bok A: ");
		x = odczyt.nextInt();
		System.out.println("Podaj bok B: ");
		y = odczyt.nextInt();
		System.out.println("Podaj bok C: ");
		z = odczyt.nextInt();
		System.out.println("Podaj wysoko��: ");
		h = odczyt.nextInt();
		System.out.println("Pole: " + ((x * h) / 2));
		System.out.println("Obw�d:" + (x + y + z));
		menu();
	}

	public static void kolo() {
		System.out.println("Podaj promie�: ");
		x = odczyt.nextInt();
		System.out.println("Pole: " + (3.14 * (x * x)));
		System.out.println("Obw�d:" + (6.28 * x));
		menu();
	}
}