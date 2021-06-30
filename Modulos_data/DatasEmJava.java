import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
    public static void main(String[] args) throws ParseException {

        Calendar cal = Calendar.getInstance();
        System.out.println("Calendar em milisegundos: " + cal.getTimeInMillis());
        System.out.println("Calendar  mês: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar Dia da semana: " + (cal.get(Calendar.DAY_OF_WEEK)-1));
        System.out.println("Calendar Hora do dia: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Calendar Minuto do dia: " + cal.get(Calendar.MINUTE));
        System.out.println("Calendar Segundo do dia: " + cal.get(Calendar.SECOND));
        System.out.println("Calendar ano: " + cal.get(Calendar.YEAR));

        System.out.println("-------------------------------------");

        Date date = new Date();
        System.out.println("Data em milisegundos: " + date.getTime());
        System.out.println("Dia do mês: " + date.getDate());
        System.out.println("Dia da semana: " + date.getDay());
        System.out.println("Hora do dia: " + date.getHours());
        System.out.println("Minuto da hora: " + date.getMinutes());
        System.out.println("Segundos da hora: " + date.getSeconds());
        System.out.println("Ano: " + (date.getYear() + 1900));
       
//Simple Date Format --> converter dataMatricula
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");//tem que se informar o formato que se pretende mostrar

System.out.println("Data atual em formato padrão e String: " + simpleDateFormat.format(date));

simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

System.out.println("Data em formato para Banco de Dados: " + simpleDateFormat.format(date));
System.out.println("Objeto Date: " + simpleDateFormat.parse("1980-07-25 20:10.1"));//aqui vai dar um erro ao usar o parse, porque tem q se add a exceção


simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
System.out.println("Objeto Date: " + simpleDateFormat.parse("1980-07-25"));

    }
}
