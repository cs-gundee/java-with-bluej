public class Parrot extends Pet implements IAnimal
{    
    public Parrot(String uilder) {
        super(uilder);
    }
    
    public String speak() { return "Жив жив"; }
    public int getLegCount() { return 2; }
}