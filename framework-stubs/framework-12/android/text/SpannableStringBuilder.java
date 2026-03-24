package android.text;

public class SpannableStringBuilder implements java.lang.CharSequence, android.text.GetChars, android.text.Spannable, android.text.Editable, java.lang.Appendable, android.text.GraphicsOperations {
    private static final java.lang.String TAG = "SpannableStringBuilder";
    private static final android.text.InputFilter[] NO_FILTERS = null;
    private static final int[][] sCachedIntBuffer = null;
    private android.text.InputFilter[] mFilters;
    private char[] mText;
    private int mGapStart;
    private int mGapLength;
    private java.lang.Object[] mSpans;
    private int[] mSpanStarts;
    private int[] mSpanEnds;
    private int[] mSpanMax;
    private int[] mSpanFlags;
    private int[] mSpanOrder;
    private int mSpanInsertCount;
    private int mSpanCount;
    private java.util.IdentityHashMap<java.lang.Object, java.lang.Integer> mIndexOfSpan;
    private int mLowWaterMark;
    private int mTextWatcherDepth;
    private static final int MARK = 1;
    private static final int POINT = 2;
    private static final int PARAGRAPH = 3;
    private static final int START_MASK = 240;
    private static final int END_MASK = 15;
    private static final int START_SHIFT = 4;
    private static final int SPAN_ADDED = 2048;
    private static final int SPAN_START_AT_START = 4096;
    private static final int SPAN_START_AT_END = 8192;
    private static final int SPAN_END_AT_START = 16384;
    private static final int SPAN_END_AT_END = 32768;
    private static final int SPAN_START_END_MASK = 61440;
    public SpannableStringBuilder() {}
    public SpannableStringBuilder(java.lang.CharSequence p0) {}
    public SpannableStringBuilder(java.lang.CharSequence p0, int p1, int p2) {}
    public static android.text.SpannableStringBuilder valueOf(java.lang.CharSequence p0) { return null; }
    public char charAt(int p0) { return 0; }
    public int length() { return 0; }
    private void resizeFor(int p0) {}
    private void moveGapTo(int p0) {}
    public android.text.SpannableStringBuilder insert(int p0, java.lang.CharSequence p1, int p2, int p3) { return null; }
    public android.text.SpannableStringBuilder insert(int p0, java.lang.CharSequence p1) { return null; }
    public android.text.SpannableStringBuilder delete(int p0, int p1) { return null; }
    public void clear() {}
    public void clearSpans() {}
    public android.text.SpannableStringBuilder append(java.lang.CharSequence p0) { return null; }
    public android.text.SpannableStringBuilder append(java.lang.CharSequence p0, java.lang.Object p1, int p2) { return null; }
    public android.text.SpannableStringBuilder append(java.lang.CharSequence p0, int p1, int p2) { return null; }
    public android.text.SpannableStringBuilder append(char p0) { return null; }
    private boolean removeSpansForChange(int p0, int p1, boolean p2, int p3) { return false; }
    private void change(int p0, int p1, java.lang.CharSequence p2, int p3, int p4) {}
    private int updatedIntervalBound(int p0, int p1, int p2, int p3, boolean p4, boolean p5) { return 0; }
    private void removeSpan(int p0, int p1) {}
    public android.text.SpannableStringBuilder replace(int p0, int p1, java.lang.CharSequence p2) { return null; }
    public android.text.SpannableStringBuilder replace(int p0, int p1, java.lang.CharSequence p2, int p3, int p4) { return null; }
    private static boolean hasNonExclusiveExclusiveSpanAt(java.lang.CharSequence p0, int p1) { return false; }
    private void sendToSpanWatchers(int p0, int p1, int p2) {}
    public void setSpan(java.lang.Object p0, int p1, int p2, int p3) {}
    private void setSpan(boolean p0, java.lang.Object p1, int p2, int p3, int p4, boolean p5) {}
    private boolean isInvalidParagraph(int p0, int p1) { return false; }
    public void removeSpan(java.lang.Object p0) {}
    public void removeSpan(java.lang.Object p0, int p1) {}
    private int resolveGap(int p0) { return 0; }
    public int getSpanStart(java.lang.Object p0) { return 0; }
    public int getSpanEnd(java.lang.Object p0) { return 0; }
    public int getSpanFlags(java.lang.Object p0) { return 0; }
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2, boolean p3) { return null; }
    private int countSpans(int p0, int p1, java.lang.Class p2, int p3) { return 0; }
    private <T extends java.lang.Object> int getSpansRec(int p0, int p1, java.lang.Class<T> p2, int p3, T[] p4, int[] p5, int[] p6, int p7, boolean p8) { return 0; }
    private static int[] obtain(int p0) { return null; }
    private static void recycle(int[] p0) {}
    private static int[] checkSortBuffer(int[] p0, int p1) { return null; }
    private final <T extends java.lang.Object> void sort(T[] p0, int[] p1, int[] p2) {}
    private final <T extends java.lang.Object> void siftDown(int p0, T[] p1, int p2, int[] p3, int[] p4) {}
    private final int compareSpans(int p0, int p1, int[] p2, int[] p3) { return 0; }
    public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
    private int nextSpanTransitionRec(int p0, int p1, java.lang.Class p2, int p3) { return 0; }
    public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
    public void getChars(int p0, int p1, char[] p2, int p3) {}
    public java.lang.String toString() { return null; }
    public java.lang.String substring(int p0, int p1) { return null; }
    public int getTextWatcherDepth() { return 0; }
    private void sendBeforeTextChanged(android.text.TextWatcher[] p0, int p1, int p2, int p3) {}
    private void sendTextChanged(android.text.TextWatcher[] p0, int p1, int p2, int p3) {}
    private void sendAfterTextChanged(android.text.TextWatcher[] p0) {}
    private void sendSpanAdded(java.lang.Object p0, int p1, int p2) {}
    private void sendSpanRemoved(java.lang.Object p0, int p1, int p2) {}
    private void sendSpanChanged(java.lang.Object p0, int p1, int p2, int p3, int p4) {}
    private static java.lang.String region(int p0, int p1) { return null; }
    private void checkRange(java.lang.String p0, int p1, int p2) {}
    public void drawText(android.graphics.BaseCanvas p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public void drawTextRun(android.graphics.BaseCanvas p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public float measureText(int p0, int p1, android.graphics.Paint p2) { return 0.0f; }
    public int getTextWidths(int p0, int p1, float[] p2, android.graphics.Paint p3) { return 0; }
    public float getTextRunAdvances(int p0, int p1, int p2, int p3, boolean p4, float[] p5, int p6, android.graphics.Paint p7) { return 0.0f; }
    @java.lang.Deprecated
    public int getTextRunCursor(int p0, int p1, int p2, int p3, int p4, android.graphics.Paint p5) { return 0; }
    public int getTextRunCursor(int p0, int p1, boolean p2, int p3, int p4, android.graphics.Paint p5) { return 0; }
    public void setFilters(android.text.InputFilter[] p0) {}
    public android.text.InputFilter[] getFilters() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private int treeRoot() { return 0; }
    private static int leftChild(int p0) { return 0; }
    private static int rightChild(int p0) { return 0; }
    private int calcMax(int p0) { return 0; }
    private void restoreInvariants() {}
    private void invalidateIndex(int p0) {}
}
