
package aakdika;


public class haftaa3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ]sayi = {50,20,30,10,60};
		for( int i=0;i<sayi.length-1;i++) {
		System.out.println(i+" sayimiz : "+ sayi[i]);
		}
		System.out.println("2 indisindeki deger : " + sayi[2]);
		sayi[0]=80;
		for (int i=0; i < sayi.length; i ++) {
			System.out.println(i+ " sayimiz : " + sayi[i]);
		}
		int toplam=0;
		for (int i = 0; i<sayi.length; i++) {
			toplam+=sayi[i];
		}
		System.out.println("Ortalama : "+ (toplam/sayi.length));
		
	}

}
