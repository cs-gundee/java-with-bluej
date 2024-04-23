public class Тойрог extends Дүрс
{
    protected double радиус;
    
    public Тойрог(String name, double rad) {
        super(name);
        this.радиус = rad;
    }
    
    public double талбайБодох() {
        return Math.PI * радиус * радиус ;
    }
    
    public double периметрБодох() {
        return 2 * радиус * Math.PI;
    }
    
    public String toString() {
        return super.toString() + " радиус = " + this.радиус;
    }
}
