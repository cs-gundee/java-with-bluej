

public class Mountain
{
    // классын гишүүн өгөгдөл тодорхойлъё.
    private String name; // уулын нэр
    private int elevation; // өндөр
    private String location; // байршил
    
    // одоо getter, setter аргуудыг тодорхойлъё.
    // get арга нь гишүүн өгөгдлийн утгыг буцаах үүрэгтэй байна. Тиймээс оролтын параметр шаардахгүй.
    public String getName(){
        return name;
    }
    
    // set арга нь гишүүн өгөгдлийн утгыг өөрчлөх зорилготой тул ямар утгаар солихыг оролтын параметрт дамжуулна.
    // параметрт дамжуулах өгөгдлийн төрөл нь өөрчлөх гэж буй гишүүн өгөгдлийн өгөгдлийн төрөлтэй адил байх!
    public void setName(String newName){
        name = newName;
    }
    
    public int getElevation(){
        return elevation;
    }
    
    public void setElevation(int newElevation){
        elevation = newElevation;
    }
    
    public String getLocation(){
        return location;
    }
    
    public void setLocation(String newLocation){
        location = newLocation;
    }
    
    public String toString(){
        return "Нэр: " + name + " Байрлал: " + location + " Өндөр: " + elevation;
    }
}
