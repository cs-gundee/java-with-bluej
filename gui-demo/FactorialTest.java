import java.util.Scanner;

public class FactorialTest
{
    public static void main(String args[]) {
        Factorial f = new Factorial();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Факториал олох тоо: ");
        int too = sc.nextInt();
        
        int hariu = f.calcFact(too);
        System.out.println("Хариу: " + hariu);
    }
}
