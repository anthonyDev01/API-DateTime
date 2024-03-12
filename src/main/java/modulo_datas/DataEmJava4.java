package modulo_datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEmJava4 {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();

        System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalTime horaAtual = LocalTime.now();

        System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm.ss")));

        LocalDateTime horaDataAtual = LocalDateTime.now();

        System.out.println("Hora e Data atual: " + horaDataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
    }
}
