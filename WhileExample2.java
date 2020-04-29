
public class WhileExample2 {
    public static void main(final String[] args) {
        int i = 1;
        int sum;
        while (i <= 1) {
            if (i % 3 == 0) {
                sum = i;
            }
            System.out.println("3의배수 : " + i);
        }

    }
}
