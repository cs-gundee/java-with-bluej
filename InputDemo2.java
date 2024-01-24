// оролт, гаралтын сан дуудна.
// * тэмдэглэгээ нь тухайн багц дахь бүгдийг дуудна.
import java.io.*;

public class InputDemo2 
{
    // InputStreamReader ба BufferedReader ашиглан оролтын утга авах
    public static void main() throws IOException {
        // InputStreamReader объект үүсгэе
        InputStreamReader inStream = new InputStreamReader(System.in);
        //InputStreamReader - класс
        // inStream - object нэр
        // new - объект үүсгэх түлхүүр үг
        // InputStreamReader(System.in) - InputStreamReader классын байгуулагч
        
        // BufferedReader объект үүсгэнэ
        // InputStreamReader классын объектыг BufferedReader классын байгуулагч руу дамжуулна.
        BufferedReader stdin = new BufferedReader(inStream);
        
        String data;
        System.out.println("Оролтын утга:");
        // Энэ аргыг ашиглах үедээ онцгой тохиолдлыг заавал тооцоолох ёстой!
        data = stdin.readLine();
        System.out.println("Таны оруулан өгөгдөл: " + data);
        
    }
}
