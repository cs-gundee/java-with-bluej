public class Teacher extends Employee
{
    protected String teacherCode;
    
    public Teacher(String name, String tCode) {
        super(name);
        this.teacherCode = tCode;
    }
    
    public String getMajor() {
        return "Багш";
    }
    
    public String toString() {
        return "Нэр: " + this.name + ", Код: " + this.teacherCode;
    }
}
