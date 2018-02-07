import java.util.Scanner;
public class hafta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner tara = new Scanner (System.in);
		System.out.print("Kac kisiler: ");
		int kackisi = tara.nextInt();
		
		String[ ] isimler = new String[kackisi];
		int [] yas = new int [kackisi];
		int [] maas = new int [kackisi];
		
		int yasortalamasi=0 , maasortalamasi=0;
		
		for (int i=0 ; i<kackisi ; i++) 
		{
			System.out.println("İsim: " );
			isimler[i] = tara.next();
			
			System.out.println("Yas: " );
			yas[i] = tara.nextInt();
			
			System.out.println("Maas: " );
			maas[i] = tara.nextInt();
			
			yasortalamasi += yas[i];
			maasortalamasi += maas[i];
		
		}
			
			yasortalamasi /= kackisi;
			maasortalamasi /= kackisi;
			
			System.out.println("yas ortalamasi: " + yasortalamasi);
			System.out.println("maas ortalamasi: " + maasortalamasi);
		
			for ( int i=0; i<kackisi ; i++) {
			System.out.print(
					"Adı: " + isimler[i] + "\n" +
					"Yasi: " + yas[i] + "\n" +
					"Maasi: " + maas[i] + "\n" 
					);
		
			
	}
			System.out.println("yasi ortalamadan kücükler: " );
			for ( int i=0 ; i< kackisi; i++) {
				if ( yasortalamasi >= yas[i] )
					System.out.println (
							"Adı: " + isimler[i] + "\n" +
							"Yasi: " + yas[i] + "\n" +
							"Maasi: " + maas[i] + "\n" 
							);
			}
				
			System.out.println("maasi ortalamadan büyükler:" );
			for ( int i=0 ; i< kackisi; i++ ) {
				if ( maasortalamasi <= maas[i] )
					System.out.println (
							"Adı: " + isimler[i] + "\n" +
							"Yasi: " + yas[i] + "\n" +
							"Maasi: " + maas[i] + "\n" );
					
			}
			
			
	
	
			
}
}



