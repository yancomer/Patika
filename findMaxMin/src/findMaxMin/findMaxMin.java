package findMaxMin;
import java.util.Scanner;
import java.util.Arrays;

public class findMaxMin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		System.out.println("Sayý gir:");
	    int n = input.nextInt();
	   	    
	    Arrays.sort(list);
	    int min = list[0];
	    int max = list[list.length-1];
	  
	    for(int i=0; i < list.length; i++) {
	    	if(list[i] < n) {
	    		if(list[i] > min)
	    			min = list[i];
	    	}
	    	if(list[i] > n) {
	    		if(list[i] < max)
	    			max = list[i];
	    	}
	    }

        System.out.println("Sayýdan Küçük Maximum Deðer " + min);
        System.out.println("Sayýdan Büyük Minimum Deðer " + max);

        input.close();
	}

}