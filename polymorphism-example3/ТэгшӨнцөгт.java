public class ТэгшӨнцөгт extends Дүрс
{
    protected double урт, өргөн;
    
    public ТэгшӨнцөгт(String name, double len, double wid) {
        super(name);
        this.урт = len;
        this.өргөн = wid;
    }
    
    public double талбайБодох() {
        return урт * өргөн;
    }
    
    public double периметрБодох() {
        return 2 * (урт + өргөн);
    }
    
    public String toString() {
        return super.toString() + " урт = " + урт + " өргөн = " + өргөн;
    }
}
