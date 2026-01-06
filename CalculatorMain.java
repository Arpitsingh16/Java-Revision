import java.util.Scanner;
public class CalculatorMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator myCalculator = new Calculator();

    boolean isRunning = true;

    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();

   int addition =  myCalculator.add(num1,num2);
   int subtraction = myCalculator.subtract(num1,num2);
   int multiplication = myCalculator.multiply(num1,num2);
   int division =  myCalculator.divide(num1,num2);
   int moduloReal = myCalculator.modulo(num1,num2);    
    while(isRunning){
    System.out.println("Enter the operation you want to perform +,-,*,/,% and 6 to exit");
    char op = sc.next().charAt(0);
    switch(op){
        case '+':
            if(op=='+'){
                System.out.println(addition);
            }
        
        case '-':
            if(op=='-'){
                System.out.println(subtraction);
            }

        case '*':
            if(op=='*'){
                System.out.println(multiplication);
            }

        case '/':
            if(op=='/'){
                System.out.println(division);
            }

        case '%':
            if(op=='%'){
                System.out.println(moduloReal);
            }

        case 6:
            if(op == 'N'){
        isRunning = false;
            }

        default:{
            System.out.println("Invalid Operator");
                    }


        }
    }




    // System.out.println(addition);
    // System.out.println(subtraction);
    // System.out.println(multiplication);
    // System.out.println(division);
    // System.out.println(moduloReal);

    sc.close();



}
    
}
