package android.icu.util;

public class Currency extends android.icu.util.MeasureUnit {
    public static final int FORMAL_SYMBOL_NAME = 4;
    public static final int LONG_NAME = 1;
    public static final int NARROW_SYMBOL_NAME = 3;
    public static final int PLURAL_LONG_NAME = 2;
    public static final int SYMBOL_NAME = 0;
    public static final int VARIANT_SYMBOL_NAME = 5;
    protected Currency(java.lang.String p0) { super(); }
    public static android.icu.util.Currency getInstance(java.util.Locale p0) { return null; }
    public static android.icu.util.Currency getInstance(android.icu.util.ULocale p0) { return null; }
    public static java.lang.String[] getAvailableCurrencyCodes(android.icu.util.ULocale p0, java.util.Date p1) { return null; }
    public static java.lang.String[] getAvailableCurrencyCodes(java.util.Locale p0, java.util.Date p1) { return null; }
    public static java.util.Set<android.icu.util.Currency> getAvailableCurrencies() { return null; }
    public static android.icu.util.Currency getInstance(java.lang.String p0) { return null; }
    public static android.icu.util.Currency fromJavaCurrency(java.util.Currency p0) { return null; }
    public java.util.Currency toJavaCurrency() { return null; }
    public static java.util.Locale[] getAvailableLocales() { return null; }
    public static android.icu.util.ULocale[] getAvailableULocales() { return null; }
    public static final java.lang.String[] getKeywordValuesForLocale(java.lang.String p0, android.icu.util.ULocale p1, boolean p2) { return null; }
    public java.lang.String getCurrencyCode() { return null; }
    public int getNumericCode() { return 0; }
    public java.lang.String getSymbol() { return null; }
    public java.lang.String getSymbol(java.util.Locale p0) { return null; }
    public java.lang.String getSymbol(android.icu.util.ULocale p0) { return null; }
    public java.lang.String getName(java.util.Locale p0, int p1, boolean[] p2) { return null; }
    public java.lang.String getName(android.icu.util.ULocale p0, int p1, boolean[] p2) { return null; }
    public java.lang.String getName(java.util.Locale p0, int p1, java.lang.String p2, boolean[] p3) { return null; }
    public java.lang.String getName(android.icu.util.ULocale p0, int p1, java.lang.String p2, boolean[] p3) { return null; }
    public java.lang.String getDisplayName() { return null; }
    public java.lang.String getDisplayName(java.util.Locale p0) { return null; }
    public int getDefaultFractionDigits() { return 0; }
    public int getDefaultFractionDigits(android.icu.util.Currency.CurrencyUsage p0) { return 0; }
    public double getRoundingIncrement() { return 0.0; }
    public double getRoundingIncrement(android.icu.util.Currency.CurrencyUsage p0) { return 0.0; }
    public java.lang.String toString() { return null; }
    public static boolean isAvailable(java.lang.String p0, java.util.Date p1, java.util.Date p2) { return false; }

    public static enum CurrencyUsage {
        STANDARD,
        CASH;
        private CurrencyUsage() {}
    }
}
