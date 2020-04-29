
/*public class Example {
    public static void main(String[] args) {
        // 2또는 3의 배수 출력 , 2와 3의 배수출력(공통배수 표시)
        for (int i = 1; i <= 20; i++) {
            if((i % 2 == 0) || (i % 3 == 0)){
                System.out.println("2 또는 3 : " + i);
            }
            if((i % 2 == 0) && (i % 3 == 0)){
                System.out.println("2 와 3 : " + i);
            }
        }
               System.out.println("end of program");
    }
}*/

public class Example {
    public static void main(String[] args) {
        // 2또는 3의 배수 출력 , 2와 3의 배수출력(공통배수 표시)
        for (int i = 1; i <= 20; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println("2 와 3 : " + i);
            } else if ((i % 2 == 0) || (i % 3 == 0)) {
                System.out.println("2 또는 3 : " + i);
            }
        }
        System.out.println("end of program");
    }
}