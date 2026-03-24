package android.text;

abstract class SpannableStringInternal {
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mText;
    @android.annotation.UnsupportedAppUsage
    private java.lang.Object[] mSpans;
    @android.annotation.UnsupportedAppUsage
    private int[] mSpanData;
    @android.annotation.UnsupportedAppUsage
    private int mSpanCount;
    @android.annotation.UnsupportedAppUsage
    static final java.lang.Object[] EMPTY = null;
    @android.annotation.UnsupportedAppUsage
    private static final int START = 0;
    @android.annotation.UnsupportedAppUsage
    private static final int END = 1;
    @android.annotation.UnsupportedAppUsage
    private static final int FLAGS = 2;
    @android.annotation.UnsupportedAppUsage
    private static final int COLUMNS = 3;
    SpannableStringInternal(java.lang.CharSequence p0, int p1, int p2, boolean p3) {}
    @android.annotation.UnsupportedAppUsage
    SpannableStringInternal(java.lang.CharSequence p0, int p1, int p2) {}
    private void copySpans(android.text.Spanned p0, int p1, int p2, boolean p3) {}
    private void copySpans(android.text.SpannableStringInternal p0, int p1, int p2, boolean p3) {}
    @android.annotation.UnsupportedAppUsage
    private final boolean isOutOfCopyRange(int p0, int p1, int p2, int p3) { return false; }
    public final int length() { return 0; }
    public final char charAt(int p0) { return 0; }
    public final java.lang.String toString() { return null; }
    public final void getChars(int p0, int p1, char[] p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    void setSpan(java.lang.Object p0, int p1, int p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    private boolean isIndexFollowsNextLine(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    private void setSpan(java.lang.Object p0, int p1, int p2, int p3, boolean p4) {}
    @android.annotation.UnsupportedAppUsage
    void removeSpan(java.lang.Object p0) {}
    public void removeSpan(java.lang.Object p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public int getSpanStart(java.lang.Object p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getSpanEnd(java.lang.Object p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getSpanFlags(java.lang.Object p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    private void sendSpanAdded(java.lang.Object p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    private void sendSpanRemoved(java.lang.Object p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    private void sendSpanChanged(java.lang.Object p0, int p1, int p2, int p3, int p4) {}
    @android.annotation.UnsupportedAppUsage
    private static java.lang.String region(int p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    private void checkRange(java.lang.String p0, int p1, int p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.UnsupportedAppUsage
    private void copySpans(android.text.Spanned p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    private void copySpans(android.text.SpannableStringInternal p0, int p1, int p2) {}
}
