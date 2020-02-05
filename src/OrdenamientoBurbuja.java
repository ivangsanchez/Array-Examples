
public class OrdenamientoBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arreglo= {5,10,4,47,2,10,45,14};
		
		
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int aux = arreglo[j+1];

                    arreglo[j+1] = arreglo[j];

                    arreglo[j] = aux;
                }
            }
        }
        
        //Imprime en Pantalla el arreglo Ordenado
        for(int i = 0;i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]+"\n");
        }

    }

}


