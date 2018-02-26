package akdikan;

import java.util.Scanner;

public class Donguler261018 {

	public static void main(String[] args) {
		
		/* while (koşul) {
		 * 
		 * 							Önce kosula bakar kosul saglamıyorsa isleme bakar
		 * 	}
		 *
		 * 
		 *  do (yapilacak islemler)
		 *  önce islemi yapar sonra kosula bakar
		 *  
		 *  
		 * 
		 * 
		 */
		Scanner giris=new Scanner (System.in);
		int sayac =0;
							System.out.println("-----While Dongusu-----");
		while (sayac>5) { // Kosul saglanmazsa asla calısmaz donguye girmez.
			System.out.println("Sayac degeri " +sayac + "\n-------------------------------");
			sayac++;
		}	// while sonu
			System.out.println("-----Do Dongusu-----");
			sayac =0;
			do { // kosul saglanmasa da donguye mutlaka 1 kez girer.
				System.out.println("Sayac degeri " + sayac);
				sayac++;
			int bekle = giris.nextInt();
			} while(sayac>5);
		
		
	}

}
