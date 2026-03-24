package android.icu.text;

public class CompactDecimalFormat extends android.icu.text.DecimalFormat {
    CompactDecimalFormat() { super(); }
    public static android.icu.text.CompactDecimalFormat getInstance(android.icu.util.ULocale p0, android.icu.text.CompactDecimalFormat.CompactStyle p1) { return null; }
    public static android.icu.text.CompactDecimalFormat getInstance(java.util.Locale p0, android.icu.text.CompactDecimalFormat.CompactStyle p1) { return null; }
    public java.lang.Number parse(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence p0, java.text.ParsePosition p1) { return null; }

    public static enum CompactStyle {
        SHORT,
        LONG;
        private CompactStyle() {}
    }
}
