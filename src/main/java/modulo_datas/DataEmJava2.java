package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DataEmJava2 {
    public static void main(String[] args) throws ParseException {

        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2024-03-01"), LocalDate.now());

        System.out.println("Possui " + dias + " entre a faixa de data");
    }
}
