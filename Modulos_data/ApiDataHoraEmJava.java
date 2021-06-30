import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiDataHoraEmJava {
    public static void main(String[] args) {

        //nova api de data a partir do java 8
        LocalDate dataAtual = LocalDate.now();//--> trabalha com data 
        System.out.println("Data atual: " + dataAtual);


        LocalTime horaAtual = LocalTime.now();//--> trabalha com horas
        System.out.println("Hora atual: " + horaAtual);


        LocalDateTime DataHoraAtual = LocalDateTime.now();//--> trabalha com data e hora juntos
        System.out.println("Data e Hora atual: " +(DataHoraAtual.format(DateTimeFormatter.ISO_DATE)));
    }
}
