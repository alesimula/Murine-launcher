package android.icu.text;

public abstract class SearchIterator {
    public static final int DONE = -1;
    protected android.icu.text.BreakIterator breakIterator;
    protected int matchLength;
    protected java.text.CharacterIterator targetText;
    protected SearchIterator(java.text.CharacterIterator p0, android.icu.text.BreakIterator p1) {}
    public void setIndex(int p0) {}
    public void setOverlapping(boolean p0) {}
    public void setBreakIterator(android.icu.text.BreakIterator p0) {}
    public void setTarget(java.text.CharacterIterator p0) {}
    public int getMatchStart() { return 0; }
    public abstract int getIndex();
    public int getMatchLength() { return 0; }
    public android.icu.text.BreakIterator getBreakIterator() { return null; }
    public java.text.CharacterIterator getTarget() { return null; }
    public java.lang.String getMatchedText() { return null; }
    public int next() { return 0; }
    public int previous() { return 0; }
    public boolean isOverlapping() { return false; }
    public void reset() {}
    public final int first() { return 0; }
    public final int following(int p0) { return 0; }
    public final int last() { return 0; }
    public final int preceding(int p0) { return 0; }
    protected void setMatchLength(int p0) {}
    protected abstract int handleNext(int p0);
    protected abstract int handlePrevious(int p0);
    public void setElementComparisonType(android.icu.text.SearchIterator.ElementComparisonType p0) {}
    public android.icu.text.SearchIterator.ElementComparisonType getElementComparisonType() { return null; }

    public static enum ElementComparisonType {
        STANDARD_ELEMENT_COMPARISON,
        PATTERN_BASE_WEIGHT_IS_WILDCARD,
        ANY_BASE_WEIGHT_IS_WILDCARD;
        private ElementComparisonType() {}
    }
}
