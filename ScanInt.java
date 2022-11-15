import java.util.Scanner;
public class ScanInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
         int c=2;
         while(c< num){
             if(num % c==0)
             {
                 System.out.println("not prime");
                 break;
             }
             c++;
             System.out.println("prime");
             break;

         }
    }
}
