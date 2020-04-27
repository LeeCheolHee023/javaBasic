import javax.sound.sampled.SourceDataLine;

public class CharOperationExample
{

    public static void main(String[] args)
    {
        int v1 = 5;
        int v2 = 2;

        int result = v1 / v2;
        double result1 = (double) v1 / v2;
        System.out.println("result1 = " + result);

        result = sum(10, 15);
        System.out.println("retult2 = " + result);

        result1 = divide(10,15);
        System.out.println("result3 = " + result1);
    }

    public static int sum(int num1, int num2)
    {
        int result = num1 + num2;
        return result;

    }
    public static double divide(int num1, int num2)
    {   double result = (double) num1 / num2;
        return result;

    }
              
}