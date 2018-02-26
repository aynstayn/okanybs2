import java.util.Scanner;
package akdikan;

public class donguler260218 {

	public static void main(String[] args) {
		Scanner giris = new Scanner (System.in);
		int s1,s2,s3,s4,s5;
		System.out.println("Lutfen 5 adet sayi giriniz: ");
		s1 = giris.nextInt();
		s2 = giris.nextInt();
		s3 = giris.nextInt();
		s4 = giris.nextInt();
		s5 = giris.nextInt();
		
		System.out.println("Girdiginiz 5 sayininin toplami: " + s1+s2+s3+s4+s5 + "\n" +
						" Girdiginiz 5 sayinin ortalamasi: " + (s1+s2+s3+s4+s5)/5 );
			
		} 
		

	}


