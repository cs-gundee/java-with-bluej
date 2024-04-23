public class Assistant extends Teacher
{
    private String assistantType;
    
    public Assistant(String name, String tCode, String aType) {
        super(name, tCode);
        this.assistantType = aType;
    }
    
    public String getMajor() {
        return "Туслах";
    }
    
    public String toString() {
        return "Нэр: " + this.name + ", Код: " + this.teacherCode + ", Туслах хэлбэр: " + this.assistantType;
    }
}
