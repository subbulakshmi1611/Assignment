package Week1.Day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int x=0;
		int y=1;
		
		for(int i=0;i<=range;i++)
		{
			if(i<range)
			{
				System.out.println("The Fibonacci series are "+x);
				int z=x;
				x=y;
				y=y+z;

			}
		}

	}

}
