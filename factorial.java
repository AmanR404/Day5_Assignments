import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your no. to fact : ");
        int value = sc.nextInt();
        
        int result = 1;
        for (int i = value; i>0;i--){
            result = result * i;
        }
        System.out.println(result);
    }
}