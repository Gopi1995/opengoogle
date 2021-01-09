package NumberPrograms;

public class OddorEven {

	public static void main(String[] args) {
		
		int x=20;
		
		if(x%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		//Print below 100 even numbers
		for(int j=0;j<100;j++)
			if(j%2==0)
			{
				System.out.println("The even numbers are "+j);
			}
		//Print below odd numbers	
			/*else
			{
				System.out.println("The even numbers are "+j);
			}*/
	}

}
