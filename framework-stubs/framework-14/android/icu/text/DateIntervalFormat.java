package android.icu.text;

public class DateIntervalFormat extends android.icu.text.UFormat {
    DateIntervalFormat() { super(); }
    public static final android.icu.text.DateIntervalFormat getInstance(java.lang.String p0) { return null; }
    public static final android.icu.text.DateIntervalFormat getInstance(java.lang.String p0, java.util.Locale p1) { return null; }
    public static final android.icu.text.DateIntervalFormat getInstance(java.lang.String p0, android.icu.util.ULocale p1) { return null; }
    public static final android.icu.text.DateIntervalFormat getInstance(java.lang.String p0, android.icu.text.DateIntervalInfo p1) { return null; }
    public static final android.icu.text.DateIntervalFormat getInstance(java.lang.String p0, java.util.Locale p1, android.icu.text.DateIntervalInfo p2) { return null; }
    public static final android.icu.text.DateIntervalFormat getInstance(java.lang.String p0, android.icu.util.ULocale p1, android.icu.text.DateIntervalInfo p2) { return null; }
    public synchronized java.lang.Object clone() { return null; }
    public final java.lang.StringBuffer format(java.lang.Object p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public final java.lang.StringBuffer format(android.icu.util.DateInterval p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public android.icu.text.DateIntervalFormat.FormattedDateInterval formatToValue(android.icu.util.DateInterval p0) { return null; }
    public final java.lang.StringBuffer format(android.icu.util.Calendar p0, android.icu.util.Calendar p1, java.lang.StringBuffer p2, java.text.FieldPosition p3) { return null; }
    public android.icu.text.DateIntervalFormat.FormattedDateInterval formatToValue(android.icu.util.Calendar p0, android.icu.util.Calendar p1) { return null; }
    @java.lang.Deprecated
    public java.lang.Object parseObject(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public android.icu.text.DateIntervalInfo getDateIntervalInfo() { return null; }
    public void setDateIntervalInfo(android.icu.text.DateIntervalInfo p0) {}
    public android.icu.util.TimeZone getTimeZone() { return null; }
    public void setTimeZone(android.icu.util.TimeZone p0) {}
    public void setContext(android.icu.text.DisplayContext p0) {}
    public android.icu.text.DisplayContext getContext(android.icu.text.DisplayContext.Type p0) { return null; }
    public synchronized android.icu.text.DateFormat getDateFormat() { return null; }

    public static final class FormattedDateInterval implements android.icu.text.FormattedValue {
        FormattedDateInterval() {}
        public java.lang.String toString() { return null; }
        public int length() { return 0; }
        public char charAt(int p0) { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public <A extends java.lang.Appendable> A appendTo(A p0) { return null; }
        public boolean nextPosition(android.icu.text.ConstrainedFieldPosition p0) { return false; }
        public java.text.AttributedCharacterIterator toCharacterIterator() { return null; }
    }
}
