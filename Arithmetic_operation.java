public class ArithmeticOperations {
public static void main(String[] args) {
int num1 = 10;
int num2 = 3;
int sum = num1 + num2;
int difference = num1 - num2;
int product = num1 * num2;
if (num2 != 0) {
int quotient = num1 / num2;
int remainder = num1 % num2;
System.out.println("Addition: " + sum);
System.out.println("Subtraction: " + difference);
System.out.println("Multiplication: " + product);
System.out.println("Division: " + quotient);
System.out.println("Modulus: " + remainder);
} else {
System.out.println("Division and modulus by zero is not allowed.");
}
}
}