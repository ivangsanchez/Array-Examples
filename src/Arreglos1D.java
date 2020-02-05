
//verifica sí en un arreglo hay valores repetidos
public class Arreglos1D {

	public static void main(String[] args) {
		
		char [] valores= {'a','b','c','a'};
		//char [] valorRep= new char[3];
		
		int longitud=valores.length;
		
		boolean isRepeat=false;
		
		for(int i=0;i<longitud;i++) {
			
			for(int j=i+1;j<longitud;j++)
			{
				if(valores[i]==valores[j]) {
					isRepeat=true;
				}
			}
		}
		
		System.out.println(isRepeat);
		

	}

}
