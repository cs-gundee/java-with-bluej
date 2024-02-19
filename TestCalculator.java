public class TestCalculator
{
    public static void main(String args[]) {
        System.out.print("\u000C");
        
        Calculator calc1 = new Calculator();
        float result1 = calc1.add(105, 99.5f);
        System.out.println(result1);
        
        float result2 = calc1.subtract(105, 99.5f);
        System.out.println(result2);
        
        float result3 = calc1.add(255, 2024.5f);
        System.out.println(result3);
    }
}
