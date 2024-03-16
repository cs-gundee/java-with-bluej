public class Factorial
{
    public int calcFact(int n) {
        if (n == 1) 
            return 1;
        else
            return n * calcFact(n-1);
    }
}
