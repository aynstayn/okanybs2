package akdikan;
import java.util.Scanner;
public class yasmaasorta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i, yas, maas;
		int yasTop=0, maasTop=0, KirkYasTop=0, kirkYasSay=0, kirkMaasTop=0;
		System.out.println("Kisi sayisini giriniz: ");
		int ks = input.nextInt();
		for (i = 0 ; i<=ks ; i++) {
			System.out.println("yasi giriniz: ");
			yas = input.nextInt();
			System.out.println("maasi giriniz: ");
			maas = input.nextInt();
			yasTop+=yas;
			maasTop+=maas;
			
			if (yas>40) {
				KirkYasTop+=yas;
				kirkMaasTop+=maas;
			}
		} 
			System.out.println("Yas ortalamasi: " + (yasTop/ks));
			System.out.println("Maas ortalamasi: " + (maasTop/ks));
			System.out.println("40 tan buyuklerin yas ortalamasi: " + (KirkYasTop/kirkYasSay));
			System.out.println("4* tan buyhuklerin maas ortalamasi: " + (kirkMaasTop/kirkYasSay));
	
			
		}
		
	}


