
public class NumPrimo {

	public static void main(String[] args) {
		
		int num=3;
		boolean isPrime=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				 isPrime=false;
			}
		}
		
		System.out.println(isPrime);

	}

}
