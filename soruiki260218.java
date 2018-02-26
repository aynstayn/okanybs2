package akdikan;
import java.util.Scanner;
public class soruiki260218 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int teksayi=0, ciftsayi=0;
		int sayi;
		for ( int i=1 ; i<=5; i++) {
			System.out.println(i+ " inci sayiyi giriniz.");
			sayi = input.nextInt();
		
		if  (sayi%2==0) {
			ciftsayi+=sayi;
			
		}
		else {
			teksayi+=sayi;
		}	
		
		/* ****************************************************************************************                */
		 
		 																												
		}
	System.out.println("Tek sayilarin toplami: " + teksayi );
		System.out.println("Cift sayialrin toplami: " + ciftsayi);
		
		
	}	


}
