public class Car
{
    // 17 тэмдэгттэй тээврийн хэрэгслийн таних дугаар - vehicle identification number
    private String vinNumber;
    private String model;
    private int year;
    
    public Car(String carModel){
        model = carModel;
    }
    
    public String getVinNumber(){
        return vinNumber;
    }
    
    public void setVinNumber(String newVinNumber){
        vinNumber = newVinNumber;
    }
}
