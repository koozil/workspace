public class Grupa2zad1 {
	public static int sumap = 0, suman = 0;

	public static void main(String[] args) {
		int[] tab = new int[10];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = -40 + (int) (Math.random() * 80);
		}
		System.out.println("Oto wszystkie liczby: ");
		for (int i = 0; i < tab.length; i++) {

			System.out.print(tab[i]);
			System.out.println();
		}
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				sumap += tab[i];
			}
			if (tab[i] % 2 != 0) {
				suman += tab[i];
			}
		}
		System.out.println();
		System.out.println("Suma wszystkich liczb parzystych: " + sumap);
		System.out.println();
		System.out.println("Suma wszystkich liczb nieparzystych: " + suman);
		System.out.println();
		System.out.println("Autor: Filip Koz³owski (github.com/koozil)");
	}

}
