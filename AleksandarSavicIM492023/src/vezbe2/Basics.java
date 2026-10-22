package vezbe2;

import java.util.Scanner;

public class Basics {

	public static void prvaVezba() {
		int broj = 50;
		
		double c;
		
		c = 20.25;
		
		String tekst = "cao";
		
		System.out.println(broj);
		c = 22.10;
		System.out.println(c);
		System.out.println(tekst);
	}
	
	public static void drugaVezba()  {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite celobrojnu vrednost");
		int broj = scanner.nextInt ();
		if (broj % 2 == 0) {
			System.out.println(broj + " je paran");
			}
		else {
			System.out.println(broj + " je neparan");
		}
		
		
	}
	
	public static void trecaVezba() {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Unesite broj:");
		int broj = scanner.nextInt ();
		
		for (int brojac = 1; brojac <= broj; brojac++) {
			System.out.println(brojac);
		}
		int brojac = 1;
		while(brojac < broj) {
			System.out.println(brojac);
			brojac++;
		}
	}
	
	public static void main(String[] args) {
	//	prvaVezba();
	//	drugaVezba();
		trecaVezba();
	}

}
