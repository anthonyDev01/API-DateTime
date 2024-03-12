package modulo_datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataEmJava7 {
    public static void main(String[] args) {
        LocalDate dataAntiga = LocalDate.of(2020, 8, 27);
        LocalDate dataNova = LocalDate.of(2024, 3, 11);

        System.out.println("Data antiga é maior que a nova: " + dataAntiga.isAfter(dataNova));
        System.out.println("Data antiga é igual a nova: " + dataAntiga.isBefore(dataNova));
        System.out.println("Data antiga é anterior que a nova: " + dataAntiga.isEqual(dataNova));

        Period periodo = Period.between(dataAntiga, dataNova);

        System.out.println("o periodo em dias entre: " + dataAntiga + " e " + dataNova + " é " + periodo.getMonths() + " dias " + periodo.getMonths() + " meses e " + periodo.getYears() + " anos");
    }
}
