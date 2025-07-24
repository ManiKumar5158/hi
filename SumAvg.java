public class SumAvg {
public static void main(String[] args) {
int sum = 0;
for(int i = 1; i <= 10; i++) sum += i;
double avg = sum / 10.0;
System.out.println("Sum: " + sum + ", Average: " +avg);
}
}