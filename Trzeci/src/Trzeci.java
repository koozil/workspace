import java.util.Scanner;

public class Trzeci {

private static Scanner odczyt;

static Double a,b;

public static void main(String[] args) {
System.out.println ("Podaj pierwszš zmiennš: ");
odczyt = new Scanner(System.in);
a = odczyt.nextDouble();
System.out.println ("Podaj druga zmiennš: ");
b = odczyt.nextDouble();
System.out.println ("Wynik dodawania: "+(a+b));
System.out.println ("Wynik odejmowania: "+(a-b));
System.out.println ("Wynik mno¿enia: "+(a*b));
System.out.println ("Wynik dzielenia: "+(a/b));
}

}