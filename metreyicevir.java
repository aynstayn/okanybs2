import java.util.Scanner;
public class metreyicevir {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int milimetre = 1000;
	int santimetre = 100;
	int desimetre = 10;
	int metre;	
	
	System.out.println("Lutfen metre degerini giriniz: ");
	metre = input.nextInt();	
	
	
	System.out.println("Metre\tDesimetre\tSantimetre\tMilimetre");
	System.out.println("--------------------------------------------------");
	
	System.out.println(metre+"\t"+metre*desimetre+"\t\t"+metre*santimetre+"\t\t"+metre*milimetre);
	
	
	
	
	
	}

}
