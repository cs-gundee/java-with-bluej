public class ДүрсТест
{
    public static void main(String args[]) {
        Дүрс[] shapes = new Дүрс[5];
        shapes[0] = new ТэгшӨнцөгт("Тэгш өнцөгт", 3.0, 4.0);
        shapes[1] = new Тойрог("Тойрог", 2.5);
        shapes[2] = new ТэгшӨнцөгт("Тэгш өнцөгт", 3.0, 4.0);
        shapes[3] = new Тойрог("Тойрог", 4.5);
        shapes[4] = new ТэгшӨнцөгт("Тэгш өнцөгт", 5.0, 4.0);
        
        for(int i = 0; i < shapes.length; i++) {
            System.out.println("\n" + shapes[i].toString());
            System.out.print("S = " + shapes[i].талбайБодох());
            System.out.println("\t P = " + shapes[i].периметрБодох());
        }
    }
}
