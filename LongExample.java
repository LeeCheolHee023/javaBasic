
public class LongExample
{
	public static void main(String[] args)
	{
		long num1 = 100;
		long num2 = 20L;
		long num3 = 1000000000000L;
		
		int num4 = Integer.MAX_VALUE;
		int num5 =1;
		num4 = 2147483647;
			if (num4 <= Integer.MAX_VALUE - num5)
				{
				int result = num4 + num5;
				System.out.println("result : " + result);
				} 
			else 
				{
				System.out.println("overflow maxvalue");
				}
			
				int num6 = 100000;
				int num7 = 100000000;
			if (num6 <= Integer.MAX_VALUE/ num7)
				{
					int result = num6 * num7;
					System.out.println("result : " + result);
				}
			else
				{
					System.out.println("overflow maxvalue");
				}				
		
	}			
}   