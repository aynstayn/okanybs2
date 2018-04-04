package mathsinif;

import java.util.Random;
import java.util.Scanner;

public class randomnesne0404 {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner (System.in);
		System.out.println("Ust sinir giriniz: ");
		int us = giris.nextInt();
		Random r = new Random();
		int a = r.nextInt(us);
		System.out.println("uretilen integer sayi : " + a);
		System.out.println("uretilen boolean sayi : " + r.nextBoolean());
		System.out.println("uretilen double sayi : " + r.nextDouble());
		System.out.println("uretilen Gaussian sayi : " + r.nextGaussian());
		System.out.println("pi sayisi: " +Math.PI);
	}

}
