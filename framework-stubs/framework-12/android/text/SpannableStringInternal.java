package android.text;

abstract class SpannableStringInternal {
    private java.lang.String mText;
    private java.lang.Object[] mSpans;
    private int[] mSpanData;
    private int mSpanCount;
    static final java.lang.Object[] EMPTY = null;
    private static final int START = 0;
    private static final int END = 1;
    private static final int FLAGS = 2;
    private static final int COLUMNS = 3;
    SpannableStringInternal(java.lang.CharSequence p0, int p1, int p2, boolean p3) {}
    SpannableStringInternal(java.lang.CharSequence p0, int p1, int p2) {}
    private void copySpansFromSpanned(android.text.Spanned p0, int p1, int p2, boolean p3) {}
    private void copySpansFromInternal(android.text.SpannableStringInternal p0, int p1, int p2, boolean p3) {}
    private final boolean isOutOfCopyRange(int p0, int p1, int p2, int p3) { return false; }
    public final int length() { return 0; }
    public final char charAt(int p0) { return 0; }
    public final java.lang.String toString() { return null; }
    public final void getChars(int p0, int p1, char[] p2, int p3) {}
    void setSpan(java.lang.Object p0, int p1, int p2, int p3) {}
    private boolean isIndexFollowsNextLine(int p0) { return false; }
    private void setSpan(java.lang.Object p0, int p1, int p2, int p3, boolean p4) {}
    void removeSpan(java.lang.Object p0) {}
    public void removeSpan(java.lang.Object p0, int p1) {}
    public int getSpanStart(java.lang.Object p0) { return 0; }
    public int getSpanEnd(java.lang.Object p0) { return 0; }
    public int getSpanFlags(java.lang.Object p0) { return 0; }
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
    public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
    private void sendSpanAdded(java.lang.Object p0, int p1, int p2) {}
    private void sendSpanRemoved(java.lang.Object p0, int p1, int p2) {}
    private void sendSpanChanged(java.lang.Object p0, int p1, int p2, int p3, int p4) {}
    private static java.lang.String region(int p0, int p1) { return null; }
    private void checkRange(java.lang.String p0, int p1, int p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private void copySpans(android.text.Spanned p0, int p1, int p2) {}
    private void copySpans(android.text.SpannableStringInternal p0, int p1, int p2) {}
}
