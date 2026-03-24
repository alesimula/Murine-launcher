package android.icu.text;

public abstract class Normalizer2 {
    Normalizer2() {}
    public static android.icu.text.Normalizer2 getNFCInstance() { return null; }
    public static android.icu.text.Normalizer2 getNFDInstance() { return null; }
    public static android.icu.text.Normalizer2 getNFKCInstance() { return null; }
    public static android.icu.text.Normalizer2 getNFKDInstance() { return null; }
    public static android.icu.text.Normalizer2 getNFKCCasefoldInstance() { return null; }
    @java.lang.Deprecated
    public static android.icu.text.Normalizer2 getInstance(java.io.InputStream p0, java.lang.String p1, android.icu.text.Normalizer2.Mode p2) { return null; }
    public java.lang.String normalize(java.lang.CharSequence p0) { return null; }
    public abstract java.lang.StringBuilder normalize(java.lang.CharSequence p0, java.lang.StringBuilder p1);
    public abstract java.lang.Appendable normalize(java.lang.CharSequence p0, java.lang.Appendable p1);
    public abstract java.lang.StringBuilder normalizeSecondAndAppend(java.lang.StringBuilder p0, java.lang.CharSequence p1);
    public abstract java.lang.StringBuilder append(java.lang.StringBuilder p0, java.lang.CharSequence p1);
    public abstract java.lang.String getDecomposition(int p0);
    public java.lang.String getRawDecomposition(int p0) { return null; }
    public int composePair(int p0, int p1) { return 0; }
    public int getCombiningClass(int p0) { return 0; }
    public abstract boolean isNormalized(java.lang.CharSequence p0);
    public abstract android.icu.text.Normalizer.QuickCheckResult quickCheck(java.lang.CharSequence p0);
    public abstract int spanQuickCheckYes(java.lang.CharSequence p0);
    public abstract boolean hasBoundaryBefore(int p0);
    public abstract boolean hasBoundaryAfter(int p0);
    public abstract boolean isInert(int p0);

    public static enum Mode {
        COMPOSE,
        DECOMPOSE,
        FCD,
        COMPOSE_CONTIGUOUS;
        private Mode() {}
    }
}
