package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");

        Date dataAtual = simpleDateFormat.parse("10/03/2024");

        if (dataVencimentoBoleto.after(dataAtual)){
            System.out.println("Boleto não vencido");
        }
        else System.out.println("Boleto vencido - Urgente");

    }

}
