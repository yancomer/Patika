package harmonikOrt;
import java.util.Scanner;

public class HarmonikOrt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		float toplam = 0f;
		
		for(int i=1; i<=sayi; i++) {
			toplam += (1.0/i);
		}
		
		System.out.println(toplam);
		input.close();
	}

}
