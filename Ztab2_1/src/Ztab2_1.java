public class Ztab2_1 {

	public static void main(String[] args) {
		int[] tab = new int[20];
		for (int i = 0; i < tab.length; i++) {

			tab[i] = 1 + (int) (Math.random() * 100);
		}

		int size = tab.length - 1;
		for (int i = 0; i < tab.length - 1; i++) {
			for (int j = 0; j < size; j++) {
				if (tab[j] > tab[j + 1]) {
					int temp = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = temp;
				}
			}
			size--;

		}
		System.out.println();
		for (int i = 0; i < tab.length; i++) {
			System.out.printf("%4d", tab[i]);

		}
	}

}
