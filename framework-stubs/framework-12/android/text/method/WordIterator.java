package android.text.method;

public class WordIterator implements android.text.Selection.PositionIterator {
    private static final int WINDOW_WIDTH = 50;
    private int mStart;
    private int mEnd;
    private java.lang.CharSequence mCharSeq;
    public WordIterator() {}
    public WordIterator(java.util.Locale p0) {}
    public void setCharSequence(java.lang.CharSequence p0, int p1, int p2) {}
    public int preceding(int p0) { return 0; }
    public int following(int p0) { return 0; }
    public boolean isBoundary(int p0) { return false; }
    public int nextBoundary(int p0) { return 0; }
    public int prevBoundary(int p0) { return 0; }
    public int getBeginning(int p0) { return 0; }
    public int getEnd(int p0) { return 0; }
    public int getPrevWordBeginningOnTwoWordsBoundary(int p0) { return 0; }
    public int getNextWordEndOnTwoWordBoundary(int p0) { return 0; }
    private int getBeginning(int p0, boolean p1) { return 0; }
    private int getEnd(int p0, boolean p1) { return 0; }
    public int getPunctuationBeginning(int p0) { return 0; }
    public int getPunctuationEnd(int p0) { return 0; }
    public boolean isAfterPunctuation(int p0) { return false; }
    public boolean isOnPunctuation(int p0) { return false; }
    public static boolean isMidWordPunctuation(java.util.Locale p0, int p1) { return false; }
    private boolean isPunctuationStartBoundary(int p0) { return false; }
    private boolean isPunctuationEndBoundary(int p0) { return false; }
    private static boolean isPunctuation(int p0) { return false; }
    private boolean isAfterLetterOrDigit(int p0) { return false; }
    private boolean isOnLetterOrDigit(int p0) { return false; }
    private void checkOffsetIsValid(int p0) {}
}
