import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculoCalendar {
    public static void main(String[] args) throws ParseException {
        
        Calendar calendar = Calendar.getInstance(); //pega a data atual 
        
        //simular que a data vem do banco de dados
        calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("28-07-2021"));//definindo data qualquer

        calendar.add(Calendar.DAY_OF_MONTH, 5);//adiciona 5 dias à data acima(28-07-2021)
       // calendar.add(Calendar.DAY_OF_MONTH, -5);//diminui 5 dias à data
        System.out.println("Somando dia do mes: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

        calendar.add(Calendar.MONTH, 2);
        System.out.println("Somando um mes: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

        calendar.add(Calendar.YEAR, 5);
        System.out.println("Somando 5 anos: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));



    }
}
