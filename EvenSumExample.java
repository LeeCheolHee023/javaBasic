
public class EvenSumExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 2 == 0)
            {
                System.out.println("2또는 3의 배수 : " + i);
            }
            if ((i % 2 == 0) && (i % 3 == 0))
            {
                System.out.println("2와 3의 배수 : " + i);
            }
        }
    }
}
