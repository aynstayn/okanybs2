package mathsinif;

import java.util.Scanner;

public class oyun040418 {

	public static void main(String[] args) {
		Scanner giris = new Scanner (System.in);
		System.out.println("Ust sinir giriniz: ");
		int us= giris.nextInt();
		System.out.println("Alt sinir giriniz: ");
		int as = giris.nextInt();
		int uretilen = as+(int) ( (Math.random() )*(us-as)) ;
		System.out.println("Random sayi uretme: " +uretilen);
		int i,sayac=0,sayi;
		
		for(;;) {
			System.out.println("Sayiyi giriniz: ");
			sayi = giris.nextInt();
			sayac++;
			if (sayi<uretilen) {
				System.out.println("Daha buyuk sayi giriniz: ");
			} else if (sayi > uretilen) {
				System.out.println("Daha kucuk sayi giriniz: ");
			} else {
				System.out.println(" sayiyi " + sayac + " defada buldunuz. ");
			}
			
		}
		

	}

}
