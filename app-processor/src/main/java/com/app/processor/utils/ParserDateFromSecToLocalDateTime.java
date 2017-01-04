package com.app.processor.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;


public class ParserDateFromSecToLocalDateTime {

    public static void main (String [] a){
        int sec1 = 1483509600;
        int sec2 = 1483538591;

        LocalDateTime time = LocalDateTime.of(1999,04,1,12,12,00);

        System.out.println(time);
    }

    public static String fromSecToLLT(int sec) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(sec), ZoneId.systemDefault()).format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
