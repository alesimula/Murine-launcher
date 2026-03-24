package android.widget;

public class SpellChecker implements android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    public static final int MAX_NUMBER_OF_WORDS = 50;
    public static final int AVERAGE_WORD_LENGTH = 7;
    public static final int WORD_ITERATOR_INTERVAL = 350;
    private static final int SPELL_PAUSE_DURATION = 400;
    private static final int MIN_SENTENCE_LENGTH = 50;
    private static final int USE_SPAN_RANGE = -1;
    private final android.widget.TextView mTextView = null;
    android.view.textservice.SpellCheckerSession mSpellCheckerSession;
    private boolean mIsSentenceSpellCheckSupported;
    final int mCookie = 0;
    private int[] mIds;
    private android.text.style.SpellCheckSpan[] mSpellCheckSpans;
    private int mLength;
    private android.widget.SpellChecker.SpellParser[] mSpellParsers;
    private int mSpanSequenceCounter;
    private java.util.Locale mCurrentLocale;
    private android.text.method.WordIterator mWordIterator;
    private android.view.textservice.TextServicesManager mTextServicesManager;
    private java.lang.Runnable mSpellRunnable;
    private static final int SUGGESTION_SPAN_CACHE_SIZE = 10;
    private final android.util.LruCache<java.lang.Long, android.text.style.SuggestionSpan> mSuggestionSpanCache = null;
    public SpellChecker(android.widget.TextView p0) {}
    void resetSession() {}
    private void setLocale(java.util.Locale p0) {}
    private boolean isSessionActive() { return false; }
    public void closeSession() {}
    private int nextSpellCheckSpanIndex() { return 0; }
    private void addSpellCheckSpan(android.text.Editable p0, int p1, int p2) {}
    public void onSpellCheckSpanRemoved(android.text.style.SpellCheckSpan p0) {}
    public void onSelectionChanged() {}
    public void spellCheck(int p0, int p1) {}
    private void spellCheck() {}
    private android.text.style.SpellCheckSpan onGetSuggestionsInternal(android.view.textservice.SuggestionsInfo p0, int p1, int p2) { return null; }
    public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0) {}
    public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0) {}
    private void scheduleNewSpellCheck() {}
    private void createMisspelledSuggestionSpan(android.text.Editable p0, android.view.textservice.SuggestionsInfo p1, android.text.style.SpellCheckSpan p2, int p3, int p4) {}
    public static boolean haveWordBoundariesChanged(android.text.Editable p0, int p1, int p2, int p3, int p4) { return false; }

    private class SpellParser {
        private java.lang.Object mRange;
        private SpellParser(android.widget.SpellChecker p0) {}
        public void parse(int p0, int p1) {}
        public boolean isFinished() { return false; }
        public void stop() {}
        private void setRangeSpan(android.text.Editable p0, int p1, int p2) {}
        private void removeRangeSpan(android.text.Editable p0) {}
        public void parse() {}
        private <T extends java.lang.Object> void removeSpansAt(android.text.Editable p0, int p1, T[] p2) {}
    }
}
