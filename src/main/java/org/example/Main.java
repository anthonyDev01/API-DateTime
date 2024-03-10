package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        System.out.println("Data em milisegundos: " + date.getTime());
        System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());

        System.out.println("Dia do mes: " + date.getDate());
        System.out.println("Calendar Dia do mes: " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Dia da semana: " + date.getDay());
        System.out.println("Calendar Dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) -1));

        System.out.println("Hora do dia: " + date.getHours());
        System.out.println("Calendar Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));

        System.out.println("minutos da hora: " + date.getMinutes());
        System.out.println("Calendar minutos da hora: " + calendar.get(Calendar.MINUTE));

        System.out.println("segundos: " + date.getSeconds());
        System.out.println("Calendar segundos: " + calendar.get(Calendar.SECOND));

        System.out.println("Ano: " + (date.getYear() + 1900));
        System.out.println("Ano: " + calendar.get(Calendar.YEAR));

        /*------------------Simple Date Format------------------*/

        SimpleDateFormat simpleDateSimpleFormatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data atual formato padrao: " + simpleDateSimpleFormatter.format(date));

        simpleDateSimpleFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

        System.out.println("Data aem formato para banco de dados: " + simpleDateSimpleFormatter.format(date));

        System.out.println("Data atual formato padrao: " + simpleDateSimpleFormatter.parse("1987-10-18 17:21.32"));
    }
}