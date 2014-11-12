package Podstawy;

import java.util.Scanner;

public class Zadaniafunkcje2 {
	public static Scanner odczyt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int lol;
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê:");
 lol = odczyt.nextInt();
dzielniki(lol);
	}
	
public static void dzielniki (int lol){
	for (int i=1;i<=lol;i++);
	
	int i;
	if(lol%i==0)
		System.out.println(i);

}
}