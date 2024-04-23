public class Test
{
    public static void main(){
        Employee ajiltan1 = new Employee("Бат");
        System.out.println(ajiltan1.toString());
        System.out.println(ajiltan1.getMajor());
        System.out.println("===\n");
        
        Employee ajiltan2 = new Teacher("Гэрэл", "SW01");
        System.out.println(ajiltan2.toString());
        System.out.println(ajiltan2.getMajor());
        System.out.println("===\n");
        
        Employee ajiltan3 = new Assistant("Итгэл", "ASW01", "Туслах багш");
        System.out.println(ajiltan3.toString());
        System.out.println(ajiltan3.getMajor());
        System.out.println("===\n");
    }
}
