import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparaDatas {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date dataVencimentoFatura = sdf.parse("2021-06-30");

        Date dataAtualHoje = sdf.parse("2021-06-28");
        //after: a data 1 é maior que data 2.
        //before: a data 1 é menor que data 2.
        if(dataVencimentoFatura.after(dataAtualHoje)){
            System.out.println("Boleto em dia!");
        }else{
            System.out.println("Boleto vencido");
        }

     
}
}