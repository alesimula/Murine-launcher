package android.icu.text;

public class DecimalFormat extends android.icu.text.NumberFormat {
    public static final int MINIMUM_GROUPING_DIGITS_AUTO = -2;
    public static final int MINIMUM_GROUPING_DIGITS_MIN2 = -3;
    public static final int PAD_AFTER_PREFIX = 1;
    public static final int PAD_AFTER_SUFFIX = 3;
    public static final int PAD_BEFORE_PREFIX = 0;
    public static final int PAD_BEFORE_SUFFIX = 2;
    public DecimalFormat() { super(); }
    public DecimalFormat(java.lang.String p0) { super(); }
    public DecimalFormat(java.lang.String p0, android.icu.text.DecimalFormatSymbols p1) { super(); }
    public DecimalFormat(java.lang.String p0, android.icu.text.DecimalFormatSymbols p1, android.icu.text.CurrencyPluralInfo p2, int p3) { super(); }
    public synchronized void applyPattern(java.lang.String p0) {}
    public synchronized void applyLocalizedPattern(java.lang.String p0) {}
    public java.lang.Object clone() { return null; }
    public java.lang.StringBuffer format(double p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public java.lang.StringBuffer format(long p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public java.lang.StringBuffer format(java.math.BigInteger p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public java.lang.StringBuffer format(java.math.BigDecimal p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public java.lang.StringBuffer format(android.icu.math.BigDecimal p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object p0) { return null; }
    public java.lang.StringBuffer format(android.icu.util.CurrencyAmount p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public java.lang.Number parse(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence p0, java.text.ParsePosition p1) { return null; }
    public synchronized android.icu.text.DecimalFormatSymbols getDecimalFormatSymbols() { return null; }
    public synchronized void setDecimalFormatSymbols(android.icu.text.DecimalFormatSymbols p0) {}
    public synchronized java.lang.String getPositivePrefix() { return null; }
    public synchronized void setPositivePrefix(java.lang.String p0) {}
    public synchronized java.lang.String getNegativePrefix() { return null; }
    public synchronized void setNegativePrefix(java.lang.String p0) {}
    public synchronized java.lang.String getPositiveSuffix() { return null; }
    public synchronized void setPositiveSuffix(java.lang.String p0) {}
    public synchronized java.lang.String getNegativeSuffix() { return null; }
    public synchronized void setNegativeSuffix(java.lang.String p0) {}
    public synchronized boolean isSignAlwaysShown() { return false; }
    public synchronized void setSignAlwaysShown(boolean p0) {}
    public synchronized int getMultiplier() { return 0; }
    public synchronized void setMultiplier(int p0) {}
    public synchronized java.math.BigDecimal getRoundingIncrement() { return null; }
    public synchronized void setRoundingIncrement(java.math.BigDecimal p0) {}
    public synchronized void setRoundingIncrement(android.icu.math.BigDecimal p0) {}
    public synchronized void setRoundingIncrement(double p0) {}
    public synchronized int getRoundingMode() { return 0; }
    public synchronized void setRoundingMode(int p0) {}
    public synchronized java.math.MathContext getMathContext() { return null; }
    public synchronized void setMathContext(java.math.MathContext p0) {}
    public synchronized android.icu.math.MathContext getMathContextICU() { return null; }
    public synchronized void setMathContextICU(android.icu.math.MathContext p0) {}
    public synchronized int getMinimumIntegerDigits() { return 0; }
    public synchronized void setMinimumIntegerDigits(int p0) {}
    public synchronized int getMaximumIntegerDigits() { return 0; }
    public synchronized void setMaximumIntegerDigits(int p0) {}
    public synchronized int getMinimumFractionDigits() { return 0; }
    public synchronized void setMinimumFractionDigits(int p0) {}
    public synchronized int getMaximumFractionDigits() { return 0; }
    public synchronized void setMaximumFractionDigits(int p0) {}
    public synchronized boolean areSignificantDigitsUsed() { return false; }
    public synchronized void setSignificantDigitsUsed(boolean p0) {}
    public synchronized int getMinimumSignificantDigits() { return 0; }
    public synchronized void setMinimumSignificantDigits(int p0) {}
    public synchronized int getMaximumSignificantDigits() { return 0; }
    public synchronized void setMaximumSignificantDigits(int p0) {}
    public synchronized int getFormatWidth() { return 0; }
    public synchronized void setFormatWidth(int p0) {}
    public synchronized char getPadCharacter() { return 0; }
    public synchronized void setPadCharacter(char p0) {}
    public synchronized int getPadPosition() { return 0; }
    public synchronized void setPadPosition(int p0) {}
    public synchronized boolean isScientificNotation() { return false; }
    public synchronized void setScientificNotation(boolean p0) {}
    public synchronized byte getMinimumExponentDigits() { return 0; }
    public synchronized void setMinimumExponentDigits(byte p0) {}
    public synchronized boolean isExponentSignAlwaysShown() { return false; }
    public synchronized void setExponentSignAlwaysShown(boolean p0) {}
    public synchronized boolean isGroupingUsed() { return false; }
    public synchronized void setGroupingUsed(boolean p0) {}
    public synchronized int getGroupingSize() { return 0; }
    public synchronized void setGroupingSize(int p0) {}
    public synchronized int getSecondaryGroupingSize() { return 0; }
    public synchronized void setSecondaryGroupingSize(int p0) {}
    public synchronized int getMinimumGroupingDigits() { return 0; }
    public synchronized void setMinimumGroupingDigits(int p0) {}
    public synchronized boolean isDecimalSeparatorAlwaysShown() { return false; }
    public synchronized void setDecimalSeparatorAlwaysShown(boolean p0) {}
    public synchronized android.icu.util.Currency getCurrency() { return null; }
    public synchronized void setCurrency(android.icu.util.Currency p0) {}
    public synchronized android.icu.util.Currency.CurrencyUsage getCurrencyUsage() { return null; }
    public synchronized void setCurrencyUsage(android.icu.util.Currency.CurrencyUsage p0) {}
    public synchronized android.icu.text.CurrencyPluralInfo getCurrencyPluralInfo() { return null; }
    public synchronized void setCurrencyPluralInfo(android.icu.text.CurrencyPluralInfo p0) {}
    public synchronized boolean isParseBigDecimal() { return false; }
    public synchronized void setParseBigDecimal(boolean p0) {}
    @java.lang.Deprecated
    public int getParseMaxDigits() { return 0; }
    @java.lang.Deprecated
    public void setParseMaxDigits(int p0) {}
    public synchronized boolean isParseStrict() { return false; }
    public synchronized void setParseStrict(boolean p0) {}
    public synchronized boolean isParseIntegerOnly() { return false; }
    public synchronized void setParseIntegerOnly(boolean p0) {}
    public synchronized boolean isDecimalPatternMatchRequired() { return false; }
    public synchronized void setDecimalPatternMatchRequired(boolean p0) {}
    public synchronized boolean isParseNoExponent() { return false; }
    public synchronized void setParseNoExponent(boolean p0) {}
    public synchronized boolean isParseCaseSensitive() { return false; }
    public synchronized void setParseCaseSensitive(boolean p0) {}
    public synchronized boolean equals(java.lang.Object p0) { return false; }
    public synchronized int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public synchronized java.lang.String toPattern() { return null; }
    public synchronized java.lang.String toLocalizedPattern() { return null; }
}
