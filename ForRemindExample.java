
public class ForRemindExample {
    public static void main(String[] args) {
        //1~10부터 출력
        int sum=0;
        int i;
        for(i=1; i<=10; i++){
            if(i%2==0){
                sum= sum+i;
            }
            System.out.println(i);
        }
        System.out.println("짝수의 합 : " + sum);
    }    
}
