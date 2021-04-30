import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TempClass
{
    public static void main(String args[])  //static method
    {
        System.out.println("Hello World");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}


