
import java.io.IOException;
import java.util.Scanner;

public class areateste {
 
    public static void main(String[] args) throws IOException {
 
       Scanner  scanner = new Scanner (System.in);
		
        System.out.println("Informe o número:");
		Double raio= scanner.nextDouble ();
		
		
		Double n = 3.14159; 
		Double area = n * Math.pow(raio, 2);
	
		
		System.out.printf("Area =  %.4f %n ", + area);
		
		scanner.close();
    }
    }
 