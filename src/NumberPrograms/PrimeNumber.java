package NumberPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
	 int n=9;
	 int m=n/2;
	 
	 for(int i=2;i<m;i++)
		 
		 if(n%i==0)
		 {
			 System.out.println("Not Prime");
			 break;
		 }
		 else
		 {
			 System.out.println("prime");
			 
		 }
	}
		
}