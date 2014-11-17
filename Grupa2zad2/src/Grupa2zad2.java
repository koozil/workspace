public class Grupa2zad2 {
	public static int sumanp4 = 0, iloscnp4;

	public static void main(String[] args) {
		int[][] tab = new int[5][5];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = -46 + (int) (Math.random() * 92);
			}
		}
		System.out.println("Oto wszystkie liczby: ");
		System.out.println();
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++)

				System.out.printf("%3d", tab[i][j]);

			System.out.println();
		}
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] % 4 != 0) {
					sumanp4 += tab[i][j];
				}

if(tab[i][j]%4!=0)
	iloscnp4++;
				
				
			}
		}
		System.out.println();
		System.out.println("Suma liczb niepodzielnych przez 4: " + sumanp4);
		System.out.println();
		System.out.println("Iloœæ liczb niepodzielnych przez 4: " + iloscnp4);
		System.out.println();
		System.out.println("Autor: Filip Koz³owski (github.com/koozil)");
	}
}