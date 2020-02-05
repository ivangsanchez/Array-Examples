
//Busqueda binaria en un arreglo
//EL ARREGLO DEBE DE ESTAR ORDENADO
public class BusquedaBinaria {

	public static void main(String[] args) {
		int [] miArreglo= {1,2,3,4,5,6,7,8,9,10};
		int tam=miArreglo.length;
		
		int num_buscado=1;
		int inferior=0;
		int centro;
		int superior=tam-1;
		
		while(inferior <= superior) {
			centro=(superior + inferior)/2;
			
			if(miArreglo[centro]==num_buscado) {
				System.out.println("El numero está en la posición: "+centro);
				break;
			}
			else if(num_buscado<miArreglo[centro]) {
				superior = centro-1;
			}
			else {
				inferior =centro +1;
			}
			
			
		}

	}

}
