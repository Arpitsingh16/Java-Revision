import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning){
        System.out.print("Enter a number to find even or odd: ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("True");
        }
        else{
        System.out.println("False");
        }
    }
        sc.close();
    }
    
}
 
    
