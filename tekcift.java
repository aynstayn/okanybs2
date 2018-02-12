package hafta4;

import java.util.Scanner;

public class tekcift {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
		System.out.println("Eleman sayisini giriniz: ");
		int es= input.nextInt();
		int sayi[] = new int [es];
		byte i;
		for (i=0 ; i<es; i++) {
			
			System.out.println(i+ " elemani giriniz: ");
			sayi[i] = input.nextInt();
			
		int tt=0, ts=0;
		for (i=0 ; i<es ; i++) {
			if(sayi[i] %2 ==1) {
				tt = tt+sayi[i];
				ts++;
				
			}
		}
		
		System.out.println("Teklerin Ortalamasi: " + (tt/ts));
		
		
		}
		
		
		int ct=0 , cs=0;
		for (i=0 ; i<es ; i++ ) {
			if (sayi[i] %2 ==0) {
				ct = ct+sayi[i] ;
				cs++;
		System.out.println("Ciftlerin ortalasi: " +(ct/cs));	
		}
		}
		
		
		
		
				
			
		}
		
		

	}

