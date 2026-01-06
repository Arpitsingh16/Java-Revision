public class CalculatorMain {
    public static void main(String[] args) {
    Calculator myCalculator = new Calculator();

   int addition =  myCalculator.add(5,7);
   int subtraction = myCalculator.subtract(45,11);
   int multiplication = myCalculator.multiply(12,34);
   int division =  myCalculator.divide(5,7);
   int moduloReal = myCalculator.modulo(5,7);    

    System.out.println(addition);
    System.out.println(subtraction);
    System.out.println(multiplication);
    System.out.println(division);
    System.out.println(moduloReal);



}
    
}
