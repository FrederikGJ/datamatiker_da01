import java.util.Random;

public class MathWork
{

	

	public static void main (String [] args)
	{
		divisible(3);

		getRandom();

		minusOne(20);
	}

		public static void divisible(int num)
		{
		for(int i = 0; i < 100; i++)
		{
			if(i%num == 0)
			{
				System.out.println(i + ", ");
			}
		}

		} 

		public static int getRandom()
		{
		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
		int rnd = new Random().nextInt(arr.length);
		System.out.println("this is the random number " + rnd);
		return arr[rnd];
		}


		public static int minusOne(int inte)
		{
			if(inte < 0) return -1;
			System.out.println("num " + inte);
			return minusOne(inte -1);

		}
}