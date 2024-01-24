import java.util.Scanner;

public class SwitchDemo
{
    // гараас оролтын утга авч, сонголтыг боловсруулах программ бичицгээе.
    public static void main(){    
        Scanner sc = new Scanner(System.in);
        
        // int төрлийн утга хадгалах хувьсагч зарлая.
        int dayOfWeek;
        System.out.println("1-ээс 7 хооронд утга оруулна уу:");
        
        dayOfWeek = sc.nextInt();
        // 1-ээс 7 хооронд утга оруулсан эсэхийг шалгая.
        // && нь хоёр талын нөхцөлт илэрхийлэл хоёул үнэн байхыг шаардана.
        // dayOfWeek нь нэгээс их буюу тэнцүү ба dayOfWeek нь долоогоос бага буюу тэнцүү гэсэн нөхцөл.
        if(dayOfWeek >= 1 && dayOfWeek <= 7) {
            String dayName;
            
            switch(dayOfWeek) {
                case 1: dayName = "Даваа"; break;
                case 2: dayName = "Мягмар"; break;
                case 3: dayName = "Лхагва"; break;
                case 4: dayName = "Пүрэв"; break;
                case 5: dayName = "Баасан"; break;
                case 6: dayName = "Бямба"; break;
                // товчхон бичээд туршиж үзье.
                default: dayName = "Ням"; break;
            }            
            System.out.println(dayOfWeek + " ==> " + dayName); 
        } else {
            System.out.println("Таны оруулсан утга хязгаарт хамааралгүй байна.");
        }
    }
}
