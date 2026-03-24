package android.icu.number;

public abstract class Precision {
    Precision() {}
    public static android.icu.number.Precision unlimited() { return null; }
    public static android.icu.number.FractionPrecision integer() { return null; }
    public static android.icu.number.FractionPrecision fixedFraction(int p0) { return null; }
    public static android.icu.number.FractionPrecision minFraction(int p0) { return null; }
    public static android.icu.number.FractionPrecision maxFraction(int p0) { return null; }
    public static android.icu.number.FractionPrecision minMaxFraction(int p0, int p1) { return null; }
    public static android.icu.number.Precision fixedSignificantDigits(int p0) { return null; }
    public static android.icu.number.Precision minSignificantDigits(int p0) { return null; }
    public static android.icu.number.Precision maxSignificantDigits(int p0) { return null; }
    public static android.icu.number.Precision minMaxSignificantDigits(int p0, int p1) { return null; }
    public static android.icu.number.Precision increment(java.math.BigDecimal p0) { return null; }
    public static android.icu.number.CurrencyPrecision currency(android.icu.util.Currency.CurrencyUsage p0) { return null; }
    public android.icu.number.Precision trailingZeroDisplay(android.icu.number.NumberFormatter.TrailingZeroDisplay p0) { return null; }
}
