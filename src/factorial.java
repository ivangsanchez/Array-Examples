import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		int numero=0;
		int factorial=1;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Ingrese el numero para Factorial:");
		numero=input.nextInt();
		
		while (numero!=0) {
			  factorial=factorial*numero;
			  numero--;
			}
		
		System.out.println(factorial);

	}

}
