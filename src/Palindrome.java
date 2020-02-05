
public class Palindrome {

	public static void main(String[] args) {
		String palabra="Amigo no gima";
		palabra=palabra.toLowerCase();
		palabra= palabra.replace(" ", "");
		palabra= palabra.replace(".","");
		
        int ini=0;
		int fin = palabra.length()-1;
        boolean isPalin=true;
        
        while(ini < fin){
            if(palabra.charAt(ini)!=palabra.charAt(fin)){
                isPalin=false;
            }
        ini++;
        fin--;
        }
        
        
        if(isPalin)
            System.out.println("Es palindromo.");
        else
            System.out.println("No es palindromo.");
		

	}

}
