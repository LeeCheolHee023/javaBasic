
public class MathodExample {
    public static void main(String[] args) {
        /*int result = sum(10, 29);
        System.out.println("result:" + sum(10, 20));
        System.out.println("result:" + sum(10, 20, 30));
        System.out.println("1~5 합:" + toSum(1,5)); 
        printStar(1,3);
        printdouble(20,3);*/
        //printString("Good Mornig", "hi");
        //printStar(3,"str");\
        //printGugudan(7);
        printTriangle(4);
    }
    public static void printTriangle(int a){
        for(int i=0; i<=a; i++){
            for(int j=0; j-a-1<=j; j--){
                System.out.println();
            }
        }
    }
    public static void printGugudan(int dan){
        for(int i=1; i<=9; i++){
            System.out.println(dan+"*"+i+"="+dan*i);

        }
    }

    public static void printString(String str, String name){
        System.out.println(str + ", " + name);
    }
    
    public static void printStar(int a, String str){
        for(int i=1; i<=a; i++){
            System.out.println("lunch time");
        }
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static int sum(int c, int d, int e) {
        int sum = 0;
        sum = c + d + e;
        return sum;

    }
    public static void printdouble(int a, int b){

        b=a*b;
        System.out.println("결과값 : " + b);

    }
    public static int toSum(int num1, int num2){
        int sum =0;
        for(int i=num1; i<=num2; i++){
            sum +=i;
        }
        return sum;

    }

}


