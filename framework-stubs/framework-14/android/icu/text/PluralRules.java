package android.icu.text;

public class PluralRules implements java.io.Serializable {
    public static final android.icu.text.PluralRules DEFAULT = null;
    public static final java.lang.String KEYWORD_FEW = "few";
    public static final java.lang.String KEYWORD_MANY = "many";
    public static final java.lang.String KEYWORD_ONE = "one";
    public static final java.lang.String KEYWORD_OTHER = "other";
    public static final java.lang.String KEYWORD_TWO = "two";
    public static final java.lang.String KEYWORD_ZERO = "zero";
    public static final double NO_UNIQUE_VALUE = -0.00123456777;
    PluralRules() {}
    public static android.icu.text.PluralRules parseDescription(java.lang.String p0) throws java.text.ParseException { return null; }
    public static android.icu.text.PluralRules createRules(java.lang.String p0) { return null; }
    public static android.icu.text.PluralRules forLocale(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.PluralRules forLocale(java.util.Locale p0) { return null; }
    public static android.icu.text.PluralRules forLocale(android.icu.util.ULocale p0, android.icu.text.PluralRules.PluralType p1) { return null; }
    public static android.icu.text.PluralRules forLocale(java.util.Locale p0, android.icu.text.PluralRules.PluralType p1) { return null; }
    public int hashCode() { return 0; }
    public java.lang.String select(double p0) { return null; }
    public java.lang.String select(android.icu.number.FormattedNumber p0) { return null; }
    public java.lang.String select(android.icu.number.FormattedNumberRange p0) { return null; }
    public java.util.Set<java.lang.String> getKeywords() { return null; }
    public double getUniqueKeywordValue(java.lang.String p0) { return 0.0; }
    public java.util.Collection<java.lang.Double> getAllKeywordValues(java.lang.String p0) { return null; }
    public java.util.Collection<java.lang.Double> getSamples(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(android.icu.text.PluralRules p0) { return false; }

    public static enum PluralType {
        CARDINAL,
        ORDINAL;
        private PluralType() {}
    }
}
