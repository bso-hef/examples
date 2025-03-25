package de.bso.java.examples.date;

import java.util.Calendar;
import java.util.Locale;

public class FactoryClient {
    public static void main(String[] args) {
        Locale aLocale = new Locale.Builder().setLanguage("th").setRegion("TH")
                .setExtension(Locale.UNICODE_LOCALE_EXTENSION, "nu-thai").build();
        Calendar cal1 = Calendar.getInstance(aLocale);
        Calendar cal2 = Calendar.getInstance(Locale.getDefault());
        System.out.println("");
    }
}
