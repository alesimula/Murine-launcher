package android.icu.text;

public interface UnicodeMatcher {
    public static final char ETHER = (char)0xffff;
    public static final int U_MATCH = 2;
    public static final int U_MISMATCH = 0;
    public static final int U_PARTIAL_MATCH = 1;
    public int matches(android.icu.text.Replaceable p0, int[] p1, int p2, boolean p3);
    public java.lang.String toPattern(boolean p0);
    public boolean matchesIndexValue(int p0);
    public void addMatchSetTo(android.icu.text.UnicodeSet p0);
}
