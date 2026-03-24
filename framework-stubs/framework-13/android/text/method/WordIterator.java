package android.text.method;

public class WordIterator implements android.text.Selection.PositionIterator {
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
    public int getPunctuationBeginning(int p0) { return 0; }
    public int getPunctuationEnd(int p0) { return 0; }
    public boolean isAfterPunctuation(int p0) { return false; }
    public boolean isOnPunctuation(int p0) { return false; }
    public static boolean isMidWordPunctuation(java.util.Locale p0, int p1) { return false; }
}
