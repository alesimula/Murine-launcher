package android.text;

abstract class SpannableStringInternal {
    static final java.lang.Object[] EMPTY = null;
    SpannableStringInternal(java.lang.CharSequence p0, int p1, int p2, boolean p3) {}
    SpannableStringInternal(java.lang.CharSequence p0, int p1, int p2) {}
    public final int length() { return 0; }
    public final char charAt(int p0) { return 0; }
    public final java.lang.String toString() { return null; }
    public final void getChars(int p0, int p1, char[] p2, int p3) {}
    void setSpan(java.lang.Object p0, int p1, int p2, int p3) {}
    void removeSpan(java.lang.Object p0) {}
    public void removeSpan(java.lang.Object p0, int p1) {}
    public int getSpanStart(java.lang.Object p0) { return 0; }
    public int getSpanEnd(java.lang.Object p0) { return 0; }
    public int getSpanFlags(java.lang.Object p0) { return 0; }
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
    public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
