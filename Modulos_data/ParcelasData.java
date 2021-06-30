import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ParcelasData {
    public static void main(String[] args) throws ParseException {
        
      Date dataInicial =  new SimpleDateFormat("dd-MM-yyyy").parse("29-06-2021");//data inicial 

      Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataInicial);

        for (int parcela = 1; parcela <=12; parcela++){
            calendar.add(Calendar.MONTH, 1);//add adiciona um mes. A cada iteração do for, vai add um mes

            System.out.println("Parcela número " + parcela + ": " + " vence em " +new SimpleDateFormat("dd-MM-yyyy").
            format(calendar.getTime()));
        }
    }
}
