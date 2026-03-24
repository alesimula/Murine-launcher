package android.icu.text;

public class MeasureFormat extends android.icu.text.UFormat {
    MeasureFormat() { super(); }
    public static android.icu.text.MeasureFormat getInstance(android.icu.util.ULocale p0, android.icu.text.MeasureFormat.FormatWidth p1) { return null; }
    public static android.icu.text.MeasureFormat getInstance(java.util.Locale p0, android.icu.text.MeasureFormat.FormatWidth p1) { return null; }
    public static android.icu.text.MeasureFormat getInstance(android.icu.util.ULocale p0, android.icu.text.MeasureFormat.FormatWidth p1, android.icu.text.NumberFormat p2) { return null; }
    public static android.icu.text.MeasureFormat getInstance(java.util.Locale p0, android.icu.text.MeasureFormat.FormatWidth p1, android.icu.text.NumberFormat p2) { return null; }
    public java.lang.StringBuffer format(java.lang.Object p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public android.icu.util.Measure parseObject(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public final java.lang.String formatMeasures(android.icu.util.Measure... p0) { return null; }
    public java.lang.StringBuilder formatMeasurePerUnit(android.icu.util.Measure p0, android.icu.util.MeasureUnit p1, java.lang.StringBuilder p2, java.text.FieldPosition p3) { return null; }
    public java.lang.StringBuilder formatMeasures(java.lang.StringBuilder p0, java.text.FieldPosition p1, android.icu.util.Measure... p2) { return null; }
    public java.lang.String getUnitDisplayName(android.icu.util.MeasureUnit p0) { return null; }
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public android.icu.text.MeasureFormat.FormatWidth getWidth() { return null; }
    public final android.icu.util.ULocale getLocale() { return null; }
    public android.icu.text.NumberFormat getNumberFormat() { return null; }
    public static android.icu.text.MeasureFormat getCurrencyFormat(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.MeasureFormat getCurrencyFormat(java.util.Locale p0) { return null; }
    public static android.icu.text.MeasureFormat getCurrencyFormat() { return null; }

    public static enum FormatWidth {
        WIDE,
        SHORT,
        NARROW,
        NUMERIC;
        private FormatWidth() {}
    }
}
