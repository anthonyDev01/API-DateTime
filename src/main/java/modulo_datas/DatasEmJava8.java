package modulo_datas;

import java.time.LocalDate;

public class DatasEmJava8 {
    public static void main(String[] args) {
        LocalDate dataBase = LocalDate.parse("2019-10-05");

        System.out.println("Mais 5 dias: " + dataBase.plusDays(5));

        System.out.println("Mais 5 semanas: " + dataBase.plusWeeks(5));

        System.out.println("Mais 5 anos: " + dataBase.plusYears(5));

        System.out.println("Mais 5 meses: " + dataBase.plusMonths(5));

        System.out.println("Menos 5 meses: " + dataBase.minusMonths(5));
    }
}
