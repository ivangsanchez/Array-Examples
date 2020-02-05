
//busqueda de un numero en un arreglo y retorna la posición del numero en el arreglo
public class BusquedaSecuencial {

	public static void main(String[] args) {
		int [] miArreglo= {1,4,6,7,9,5};
		int numero=7;
		int pos=0;
		
		for(int i=0;i<miArreglo.length;i++) {
			
			if(miArreglo[i]==numero) {
				pos=i;
			}
			
		}
		
		pos=pos+1;
		
		System.out.println("El numero "+numero+ " se encuentra en la posición: "+pos);

	}

}
