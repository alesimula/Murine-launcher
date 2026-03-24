package android.icu.text;

public abstract class NumberFormat extends android.icu.text.UFormat {
    public static final int ACCOUNTINGCURRENCYSTYLE = 7;
    public static final int CASHCURRENCYSTYLE = 8;
    public static final int CURRENCYSTYLE = 1;
    public static final int FRACTION_FIELD = 1;
    public static final int INTEGERSTYLE = 4;
    public static final int INTEGER_FIELD = 0;
    public static final int ISOCURRENCYSTYLE = 5;
    public static final int NUMBERSTYLE = 0;
    public static final int PERCENTSTYLE = 2;
    public static final int PLURALCURRENCYSTYLE = 6;
    public static final int SCIENTIFICSTYLE = 3;
    public static final int STANDARDCURRENCYSTYLE = 9;
    public NumberFormat() { super(); }
    public java.lang.StringBuffer format(java.lang.Object p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public final java.lang.Object parseObject(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public final java.lang.String format(double p0) { return null; }
    public final java.lang.String format(long p0) { return null; }
    public final java.lang.String format(java.math.BigInteger p0) { return null; }
    public final java.lang.String format(java.math.BigDecimal p0) { return null; }
    public final java.lang.String format(android.icu.math.BigDecimal p0) { return null; }
    public final java.lang.String format(android.icu.util.CurrencyAmount p0) { return null; }
    public abstract java.lang.StringBuffer format(double p0, java.lang.StringBuffer p1, java.text.FieldPosition p2);
    public abstract java.lang.StringBuffer format(long p0, java.lang.StringBuffer p1, java.text.FieldPosition p2);
    public abstract java.lang.StringBuffer format(java.math.BigInteger p0, java.lang.StringBuffer p1, java.text.FieldPosition p2);
    public abstract java.lang.StringBuffer format(java.math.BigDecimal p0, java.lang.StringBuffer p1, java.text.FieldPosition p2);
    public abstract java.lang.StringBuffer format(android.icu.math.BigDecimal p0, java.lang.StringBuffer p1, java.text.FieldPosition p2);
    public java.lang.StringBuffer format(android.icu.util.CurrencyAmount p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public abstract java.lang.Number parse(java.lang.String p0, java.text.ParsePosition p1);
    public java.lang.Number parse(java.lang.String p0) throws java.text.ParseException { return null; }
    public android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence p0, java.text.ParsePosition p1) { return null; }
    public boolean isParseIntegerOnly() { return false; }
    public void setParseIntegerOnly(boolean p0) {}
    public void setParseStrict(boolean p0) {}
    public boolean isParseStrict() { return false; }
    public void setContext(android.icu.text.DisplayContext p0) {}
    public android.icu.text.DisplayContext getContext(android.icu.text.DisplayContext.Type p0) { return null; }
    public static final android.icu.text.NumberFormat getInstance() { return null; }
    public static android.icu.text.NumberFormat getInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.NumberFormat getInstance(android.icu.util.ULocale p0) { return null; }
    public static final android.icu.text.NumberFormat getInstance(int p0) { return null; }
    public static android.icu.text.NumberFormat getInstance(java.util.Locale p0, int p1) { return null; }
    public static final android.icu.text.NumberFormat getNumberInstance() { return null; }
    public static android.icu.text.NumberFormat getNumberInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.NumberFormat getNumberInstance(android.icu.util.ULocale p0) { return null; }
    public static final android.icu.text.NumberFormat getIntegerInstance() { return null; }
    public static android.icu.text.NumberFormat getIntegerInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.NumberFormat getIntegerInstance(android.icu.util.ULocale p0) { return null; }
    public static final android.icu.text.NumberFormat getCurrencyInstance() { return null; }
    public static android.icu.text.NumberFormat getCurrencyInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.NumberFormat getCurrencyInstance(android.icu.util.ULocale p0) { return null; }
    public static final android.icu.text.NumberFormat getPercentInstance() { return null; }
    public static android.icu.text.NumberFormat getPercentInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.NumberFormat getPercentInstance(android.icu.util.ULocale p0) { return null; }
    public static final android.icu.text.NumberFormat getScientificInstance() { return null; }
    public static android.icu.text.NumberFormat getScientificInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.NumberFormat getScientificInstance(android.icu.util.ULocale p0) { return null; }
    public static java.util.Locale[] getAvailableLocales() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.Object clone() { return null; }
    public boolean isGroupingUsed() { return false; }
    public void setGroupingUsed(boolean p0) {}
    public int getMaximumIntegerDigits() { return 0; }
    public void setMaximumIntegerDigits(int p0) {}
    public int getMinimumIntegerDigits() { return 0; }
    public void setMinimumIntegerDigits(int p0) {}
    public int getMaximumFractionDigits() { return 0; }
    public void setMaximumFractionDigits(int p0) {}
    public int getMinimumFractionDigits() { return 0; }
    public void setMinimumFractionDigits(int p0) {}
    public void setCurrency(android.icu.util.Currency p0) {}
    public android.icu.util.Currency getCurrency() { return null; }
    public int getRoundingMode() { return 0; }
    public void setRoundingMode(int p0) {}
    public static android.icu.text.NumberFormat getInstance(android.icu.util.ULocale p0, int p1) { return null; }
    protected static java.lang.String getPattern(android.icu.util.ULocale p0, int p1) { return null; }

    public static class Field extends java.text.Format.Field {
        public static final android.icu.text.NumberFormat.Field COMPACT = null;
        public static final android.icu.text.NumberFormat.Field CURRENCY = null;
        public static final android.icu.text.NumberFormat.Field DECIMAL_SEPARATOR = null;
        public static final android.icu.text.NumberFormat.Field EXPONENT = null;
        public static final android.icu.text.NumberFormat.Field EXPONENT_SIGN = null;
        public static final android.icu.text.NumberFormat.Field EXPONENT_SYMBOL = null;
        public static final android.icu.text.NumberFormat.Field FRACTION = null;
        public static final android.icu.text.NumberFormat.Field GROUPING_SEPARATOR = null;
        public static final android.icu.text.NumberFormat.Field INTEGER = null;
        public static final android.icu.text.NumberFormat.Field MEASURE_UNIT = null;
        public static final android.icu.text.NumberFormat.Field PERCENT = null;
        public static final android.icu.text.NumberFormat.Field PERMILLE = null;
        public static final android.icu.text.NumberFormat.Field SIGN = null;
        protected Field(java.lang.String p0) { super(null); }
        protected java.lang.Object readResolve() throws java.io.InvalidObjectException { return null; }
    }
}
