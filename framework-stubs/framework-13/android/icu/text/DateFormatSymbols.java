package android.icu.text;

public class DateFormatSymbols implements java.io.Serializable, java.lang.Cloneable {
    public static final int ABBREVIATED = 0;
    public static final int FORMAT = 0;
    public static final int NARROW = 2;
    public static final int SHORT = 3;
    public static final int STANDALONE = 1;
    public static final int WIDE = 1;
    public DateFormatSymbols() {}
    public DateFormatSymbols(java.util.Locale p0) {}
    public DateFormatSymbols(android.icu.util.ULocale p0) {}
    public DateFormatSymbols(android.icu.util.Calendar p0, java.util.Locale p1) {}
    public DateFormatSymbols(android.icu.util.Calendar p0, android.icu.util.ULocale p1) {}
    public DateFormatSymbols(java.lang.Class<? extends android.icu.util.Calendar> p0, java.util.Locale p1) {}
    public DateFormatSymbols(java.lang.Class<? extends android.icu.util.Calendar> p0, android.icu.util.ULocale p1) {}
    public DateFormatSymbols(java.util.ResourceBundle p0, java.util.Locale p1) {}
    public DateFormatSymbols(java.util.ResourceBundle p0, android.icu.util.ULocale p1) {}
    public static android.icu.text.DateFormatSymbols getInstance() { return null; }
    public static android.icu.text.DateFormatSymbols getInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.DateFormatSymbols getInstance(android.icu.util.ULocale p0) { return null; }
    public static java.util.Locale[] getAvailableLocales() { return null; }
    public java.lang.String[] getEras() { return null; }
    public void setEras(java.lang.String[] p0) {}
    public java.lang.String[] getEraNames() { return null; }
    public void setEraNames(java.lang.String[] p0) {}
    public java.lang.String[] getNarrowEras() { return null; }
    public void setNarrowEras(java.lang.String[] p0) {}
    public java.lang.String[] getMonths() { return null; }
    public java.lang.String[] getMonths(int p0, int p1) { return null; }
    public void setMonths(java.lang.String[] p0) {}
    public void setMonths(java.lang.String[] p0, int p1, int p2) {}
    public java.lang.String[] getShortMonths() { return null; }
    public void setShortMonths(java.lang.String[] p0) {}
    public java.lang.String[] getWeekdays() { return null; }
    public java.lang.String[] getWeekdays(int p0, int p1) { return null; }
    public void setWeekdays(java.lang.String[] p0, int p1, int p2) {}
    public void setWeekdays(java.lang.String[] p0) {}
    public java.lang.String[] getShortWeekdays() { return null; }
    public void setShortWeekdays(java.lang.String[] p0) {}
    public java.lang.String[] getQuarters(int p0, int p1) { return null; }
    public void setQuarters(java.lang.String[] p0, int p1, int p2) {}
    public java.lang.String[] getYearNames(int p0, int p1) { return null; }
    public void setYearNames(java.lang.String[] p0, int p1, int p2) {}
    public java.lang.String[] getZodiacNames(int p0, int p1) { return null; }
    public void setZodiacNames(java.lang.String[] p0, int p1, int p2) {}
    public java.lang.String[] getAmPmStrings() { return null; }
    public void setAmPmStrings(java.lang.String[] p0) {}
    public java.lang.String[][] getZoneStrings() { return null; }
    public void setZoneStrings(java.lang.String[][] p0) {}
    public java.lang.String getLocalPatternChars() { return null; }
    public void setLocalPatternChars(java.lang.String p0) {}
    public java.lang.Object clone() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    protected void initializeData(android.icu.util.ULocale p0, java.lang.String p1) {}
}
