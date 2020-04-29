import java.util.*;

import javax.xml.transform.SourceLocator;

public class WhileScannerExample {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("값[정수]을 입력하세요.");
            int inputValue = scn.nextInt();
            if (inputValue > 0) {
                System.out.println("현재까지의 합:" + sum);
                sum = sum + inputValue;
            } else {
                break;
            }
        }
        System.out.println("sum : " + sum);
        scn.close();
    }
}