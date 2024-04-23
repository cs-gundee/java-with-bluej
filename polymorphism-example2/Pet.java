public class Pet
{
    protected String uilderName;
    
    public Pet(String uilder) {
        this.uilderName = uilder;
    }
    
    public String getUilderName() { return this.uilderName; }
    public void setUilderName(String uname) { this.uilderName = uname; }
    
    public String speak() { return "Тэжээвэр амьтан"; }
    public int getLegCount() { return -1; }
}
