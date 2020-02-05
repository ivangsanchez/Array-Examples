
public class cadenaBienConstruida {
	
	public static void main(String args[]) {
		String palabra="(n(m(i)k)p))";
		int contador=0;
		int contador2=0;
		
		for(int i=0;i<palabra.length();i++) {
			if(palabra.charAt(i)=='(') {
				contador++;
			}
			if(palabra.charAt(i)==')') {
				contador2++;
			}
		}
		
		if(contador==contador2) {
			System.out.println("Cadena BIEN Construida");
		}
		else {
			System.out.println("Cadena MAL Construida");
		}
		
		
	}
		
		
}
