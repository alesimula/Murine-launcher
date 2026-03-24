package android.icu.text;

public class UnicodeSetSpanner {
    public UnicodeSetSpanner(android.icu.text.UnicodeSet p0) {}
    public android.icu.text.UnicodeSet getUnicodeSet() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int countIn(java.lang.CharSequence p0) { return 0; }
    public int countIn(java.lang.CharSequence p0, android.icu.text.UnicodeSetSpanner.CountMethod p1) { return 0; }
    public int countIn(java.lang.CharSequence p0, android.icu.text.UnicodeSetSpanner.CountMethod p1, android.icu.text.UnicodeSet.SpanCondition p2) { return 0; }
    public java.lang.String deleteFrom(java.lang.CharSequence p0) { return null; }
    public java.lang.String deleteFrom(java.lang.CharSequence p0, android.icu.text.UnicodeSet.SpanCondition p1) { return null; }
    public java.lang.String replaceFrom(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    public java.lang.String replaceFrom(java.lang.CharSequence p0, java.lang.CharSequence p1, android.icu.text.UnicodeSetSpanner.CountMethod p2) { return null; }
    public java.lang.String replaceFrom(java.lang.CharSequence p0, java.lang.CharSequence p1, android.icu.text.UnicodeSetSpanner.CountMethod p2, android.icu.text.UnicodeSet.SpanCondition p3) { return null; }
    public java.lang.CharSequence trim(java.lang.CharSequence p0) { return null; }
    public java.lang.CharSequence trim(java.lang.CharSequence p0, android.icu.text.UnicodeSetSpanner.TrimOption p1) { return null; }
    public java.lang.CharSequence trim(java.lang.CharSequence p0, android.icu.text.UnicodeSetSpanner.TrimOption p1, android.icu.text.UnicodeSet.SpanCondition p2) { return null; }

    public static enum CountMethod {
        WHOLE_SPAN,
        MIN_ELEMENTS;
        private CountMethod() {}
    }

    public static enum TrimOption {
        LEADING,
        BOTH,
        TRAILING;
        private TrimOption() {}
    }
}
