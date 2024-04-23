public class Employee
{
    protected String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public String getMajor() {
        return "Ажилтан";
    }
    
    public String toString() {
        return "Нэр: " + this.name;
    }
}
