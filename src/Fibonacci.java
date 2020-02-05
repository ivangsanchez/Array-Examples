
public class Fibonacci {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int aux;
		int limite=20;
		
		System.out.println(num1);
		System.out.println(num2);
		
		while(num2+num1 <= limite) {
			aux=num1; //aux=0
			num1=num2;//num1=1
			num2=aux+num1;
			System.out.println(num2);
		}
		

	}

}
