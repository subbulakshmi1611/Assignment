package Week1.Day2;

public class IsPrime {

	public static void main(String[] args) {
		int number=29;
		
		for(int i=2;i<number;i++)
		{
            if(number%i==0)
            {
            System.out.println(" 29 is Not a Prime number");
            break;
            }
            else
            {
            System.out.println("29 is Prime number");
            break;
          }
	}

	}

}
