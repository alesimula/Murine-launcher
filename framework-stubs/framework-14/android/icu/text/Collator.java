package android.icu.text;

public abstract class Collator implements java.util.Comparator<java.lang.Object>, android.icu.util.Freezable<android.icu.text.Collator>, java.lang.Cloneable {
    public static final int CANONICAL_DECOMPOSITION = 17;
    public static final int FULL_DECOMPOSITION = 15;
    public static final int IDENTICAL = 15;
    public static final int NO_DECOMPOSITION = 16;
    public static final int PRIMARY = 0;
    public static final int QUATERNARY = 3;
    public static final int SECONDARY = 1;
    public static final int TERTIARY = 2;
    protected Collator() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void setStrength(int p0) {}
    public void setDecomposition(int p0) {}
    public void setReorderCodes(int... p0) {}
    public static final android.icu.text.Collator getInstance() { return null; }
    public java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
    public static final android.icu.text.Collator getInstance(android.icu.util.ULocale p0) { return null; }
    public static final android.icu.text.Collator getInstance(java.util.Locale p0) { return null; }
    public static java.util.Locale[] getAvailableLocales() { return null; }
    public static final android.icu.util.ULocale[] getAvailableULocales() { return null; }
    public static final java.lang.String[] getKeywords() { return null; }
    public static final java.lang.String[] getKeywordValues(java.lang.String p0) { return null; }
    public static final java.lang.String[] getKeywordValuesForLocale(java.lang.String p0, android.icu.util.ULocale p1, boolean p2) { return null; }
    public static final android.icu.util.ULocale getFunctionalEquivalent(java.lang.String p0, android.icu.util.ULocale p1, boolean[] p2) { return null; }
    public static final android.icu.util.ULocale getFunctionalEquivalent(java.lang.String p0, android.icu.util.ULocale p1) { return null; }
    public static java.lang.String getDisplayName(java.util.Locale p0, java.util.Locale p1) { return null; }
    public static java.lang.String getDisplayName(android.icu.util.ULocale p0, android.icu.util.ULocale p1) { return null; }
    public static java.lang.String getDisplayName(java.util.Locale p0) { return null; }
    public static java.lang.String getDisplayName(android.icu.util.ULocale p0) { return null; }
    public int getStrength() { return 0; }
    public int getDecomposition() { return 0; }
    public boolean equals(java.lang.String p0, java.lang.String p1) { return false; }
    public android.icu.text.UnicodeSet getTailoredSet() { return null; }
    public abstract int compare(java.lang.String p0, java.lang.String p1);
    public int compare(java.lang.Object p0, java.lang.Object p1) { return 0; }
    public abstract android.icu.text.CollationKey getCollationKey(java.lang.String p0);
    public android.icu.text.Collator setMaxVariable(int p0) { return null; }
    public int getMaxVariable() { return 0; }
    public abstract int getVariableTop();
    public abstract android.icu.util.VersionInfo getVersion();
    public abstract android.icu.util.VersionInfo getUCAVersion();
    public int[] getReorderCodes() { return null; }
    public static int[] getEquivalentReorderCodes(int p0) { return null; }
    public boolean isFrozen() { return false; }
    public android.icu.text.Collator freeze() { return null; }
    public android.icu.text.Collator cloneAsThawed() { return null; }

    public static interface ReorderCodes {
        public static final int CURRENCY = 4099;
        public static final int DEFAULT = -1;
        public static final int DIGIT = 4100;
        public static final int FIRST = 4096;
        public static final int NONE = 103;
        public static final int OTHERS = 103;
        public static final int PUNCTUATION = 4097;
        public static final int SPACE = 4096;
        public static final int SYMBOL = 4098;
    }
}
