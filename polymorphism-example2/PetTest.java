public class PetTest
{
    public static void main(String args[]) {
        IAnimal pets[] = { new Dog("Банхар"), new Dog("Чиуа"), new Parrot("Кокатэл") };
        
        for(int i = 0; i < pets.length; i++){            
            System.out.println(pets[i].speak());
        }
    }
}
