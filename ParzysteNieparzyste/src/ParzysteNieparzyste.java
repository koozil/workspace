public class ParzysteNieparzyste {

	public static <Scanner> void main(String[] args) {
		// TODO Auto-generated method stub
		int poczatek;
		int koniec;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj pierwsza liczbe:");
		poczatek = ((Object) odczyt).nextInt();
		System.out.println("Podaj druga liczbe:");
		Scanner odczytaj = new Scanner(System.in);
		koniec = ((Object) odczytaj).nextInt();
		System.out.println("Liczby parzyste: ");
		if (poczatek % 2 != 0)
			poczatek++;
		for (int i = poczatek; i <= koniec; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("Liczby nieparzyste: ");
		if (poczatek % 2 == 0)
			poczatek++;
		for (int i = poczatek; i <= koniec; i = i + 2) {

			System.out.println(i);
		}
	}

}