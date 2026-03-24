package android.widget;

public class SpellChecker implements android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener {
    public static final int MAX_NUMBER_OF_WORDS = 50;
    public static final int AVERAGE_WORD_LENGTH = 7;
    public static final int WORD_ITERATOR_INTERVAL = 350;
    android.view.textservice.SpellCheckerSession mSpellCheckerSession;
    final int mCookie = 0;
    public SpellChecker(android.widget.TextView p0) {}
    void resetSession() {}
    public void closeSession() {}
    public void onSpellCheckSpanRemoved(android.text.style.SpellCheckSpan p0) {}
    public void onSelectionChanged() {}
    void onPerformSpellCheck() {}
    public void spellCheck(int p0, int p1) {}
    public void spellCheck(int p0, int p1, boolean p2) {}
    public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0) {}
    public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0) {}
    public static boolean haveWordBoundariesChanged(android.text.Editable p0, int p1, int p2, int p3, int p4) { return false; }

    private static enum RemoveReason {
        REPLACE,
        OBSOLETE;
    }

    private static class SentenceIteratorWrapper {
        SentenceIteratorWrapper(java.text.BreakIterator p0) {}
        public void setCharSequence(java.lang.CharSequence p0, int p1, int p2) {}
        public int preceding(int p0) { return 0; }
        public int following(int p0) { return 0; }
        public boolean isBoundary(int p0) { return false; }
    }

    private class SpellParser {
        public void parse(int p0, int p1, boolean p2) {}
        public boolean isFinished() { return false; }
        public void stop() {}
        public void parse() {}
    }
}
