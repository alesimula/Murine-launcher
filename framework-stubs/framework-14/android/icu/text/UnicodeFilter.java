package android.icu.text;

public abstract class UnicodeFilter implements android.icu.text.UnicodeMatcher {
    UnicodeFilter() {}
    public abstract boolean contains(int p0);
    public int matches(android.icu.text.Replaceable p0, int[] p1, int p2, boolean p3) { return 0; }
}
