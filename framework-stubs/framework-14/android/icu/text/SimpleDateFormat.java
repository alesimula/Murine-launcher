package android.icu.text;

public class SimpleDateFormat extends android.icu.text.DateFormat {
    public SimpleDateFormat() { super(); }
    public SimpleDateFormat(java.lang.String p0) { super(); }
    public SimpleDateFormat(java.lang.String p0, java.util.Locale p1) { super(); }
    public SimpleDateFormat(java.lang.String p0, android.icu.util.ULocale p1) { super(); }
    public SimpleDateFormat(java.lang.String p0, java.lang.String p1, android.icu.util.ULocale p2) { super(); }
    public SimpleDateFormat(java.lang.String p0, android.icu.text.DateFormatSymbols p1) { super(); }
    public void set2DigitYearStart(java.util.Date p0) {}
    public java.util.Date get2DigitYearStart() { return null; }
    public void setContext(android.icu.text.DisplayContext p0) {}
    public java.lang.StringBuffer format(android.icu.util.Calendar p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    protected android.icu.text.DateFormat.Field patternCharToDateFormatField(char p0) { return null; }
    protected java.lang.String subFormat(char p0, int p1, int p2, java.text.FieldPosition p3, android.icu.text.DateFormatSymbols p4, android.icu.util.Calendar p5) throws java.lang.IllegalArgumentException { return null; }
    public void setNumberFormat(android.icu.text.NumberFormat p0) {}
    protected java.lang.String zeroPaddingNumber(long p0, int p1, int p2) { return null; }
    public void parse(java.lang.String p0, android.icu.util.Calendar p1, java.text.ParsePosition p2) {}
    protected int matchString(java.lang.String p0, int p1, int p2, java.lang.String[] p3, android.icu.util.Calendar p4) { return 0; }
    protected int matchQuarterString(java.lang.String p0, int p1, int p2, java.lang.String[] p3, android.icu.util.Calendar p4) { return 0; }
    protected int subParse(java.lang.String p0, int p1, char p2, int p3, boolean p4, boolean p5, boolean[] p6, android.icu.util.Calendar p7) { return 0; }
    public java.lang.String toPattern() { return null; }
    public java.lang.String toLocalizedPattern() { return null; }
    public void applyPattern(java.lang.String p0) {}
    public void applyLocalizedPattern(java.lang.String p0) {}
    public android.icu.text.DateFormatSymbols getDateFormatSymbols() { return null; }
    public void setDateFormatSymbols(android.icu.text.DateFormatSymbols p0) {}
    protected android.icu.text.DateFormatSymbols getSymbols() { return null; }
    public android.icu.text.TimeZoneFormat getTimeZoneFormat() { return null; }
    public void setTimeZoneFormat(android.icu.text.TimeZoneFormat p0) {}
    public java.lang.Object clone() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object p0) { return null; }
    public void setNumberFormat(java.lang.String p0, android.icu.text.NumberFormat p1) {}
    public android.icu.text.NumberFormat getNumberFormat(char p0) { return null; }
}
