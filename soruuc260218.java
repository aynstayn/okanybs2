package akdikan;

import java.util.Scanner;

public class soruuc260218 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int sayi;
		int i=1;
		int toplam=0;
		
		do {
			System.out.println(i+" nci sayiyi giriniz: ");
			sayi = input.nextInt();
			toplam+=sayi;
			
		} while (sayi%2==0);
		System.out.println("");

		
		
		
	}

}
