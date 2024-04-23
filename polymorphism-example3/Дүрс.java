public abstract class Дүрс
{
    protected String дүрсНэр;
    
    public Дүрс(String name) {
        this.дүрсНэр = name;
    }
    
    public abstract double талбайБодох();
    public abstract double периметрБодох();
    
    public String toString() {
        return this.дүрсНэр;
    }
}
