public class Dog extends Pet implements IAnimal
{    
    public Dog(String uilder) {
        super(uilder);
    }
    
    public String speak() { return "Хов хов"; }
    public int getLegCount() { return 4; }
}
