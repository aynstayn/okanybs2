package mathsinif;

import java.util.Scanner;

public class hesapmakinasi040418 {

	public static void main(String[] args) {
		Scanner giris = new Scanner (System.in);
		
		int s1 ,s2;
		System.out.println("1.sayiyi giriniz: ");
		s1 = giris.nextInt();
		System.out.println("2.sayiyi giriniz: ");
		s2 = giris.nextInt();
		Toplama(s1,s2);
		Metotlar.Toplama(s1,s2); //farkli class cagir
		
	}

	private static void Toplama(int s1, int s2) {
		System.out.println((s1+s2));
		
	}

}
