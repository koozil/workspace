package podstawy;

import java.util.Scanner;

public class Pierwsza {
	
	public static boolean poda(int a)
	{
		int d=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			  d++;	
		}
		if(d<2)
		  return true;
	    else
	      return false;
	}
	
public static Scanner cin;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);
		int d1,d2,d3;
		System.out.println("Podaj Liczb�");
		d1=cin.nextInt();
		/*System.out.println("Podaj Liczba drug�");
		d2=cin.nextInt();
		System.out.println("Podaj Liczba treci�");
		d3=cin.nextInt();
		System.out.println("Liczby Podzielne przez : "+d3);*/
		if (poda(d1))
			System.out.println("Liczba Pierwsza");
		else
			System.out.println("Liczba Z�o�ona");
		
	}

}
