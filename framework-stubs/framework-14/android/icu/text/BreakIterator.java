package android.icu.text;

public abstract class BreakIterator implements java.lang.Cloneable {
    public static final int DONE = -1;
    public static final int KIND_CHARACTER = 0;
    public static final int KIND_LINE = 2;
    public static final int KIND_SENTENCE = 3;
    @java.lang.Deprecated
    public static final int KIND_TITLE = 4;
    public static final int KIND_WORD = 1;
    public static final int WORD_IDEO = 400;
    public static final int WORD_IDEO_LIMIT = 500;
    public static final int WORD_KANA = 300;
    public static final int WORD_KANA_LIMIT = 400;
    public static final int WORD_LETTER = 200;
    public static final int WORD_LETTER_LIMIT = 300;
    public static final int WORD_NONE = 0;
    public static final int WORD_NONE_LIMIT = 100;
    public static final int WORD_NUMBER = 100;
    public static final int WORD_NUMBER_LIMIT = 200;
    protected BreakIterator() {}
    public java.lang.Object clone() { return null; }
    public abstract int first();
    public abstract int last();
    public abstract int next(int p0);
    public abstract int next();
    public abstract int previous();
    public abstract int following(int p0);
    public int preceding(int p0) { return 0; }
    public boolean isBoundary(int p0) { return false; }
    public abstract int current();
    public int getRuleStatus() { return 0; }
    public int getRuleStatusVec(int[] p0) { return 0; }
    public abstract java.text.CharacterIterator getText();
    public void setText(java.lang.String p0) {}
    public void setText(java.lang.CharSequence p0) {}
    public abstract void setText(java.text.CharacterIterator p0);
    public static android.icu.text.BreakIterator getWordInstance() { return null; }
    public static android.icu.text.BreakIterator getWordInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.BreakIterator getWordInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.BreakIterator getLineInstance() { return null; }
    public static android.icu.text.BreakIterator getLineInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.BreakIterator getLineInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.BreakIterator getCharacterInstance() { return null; }
    public static android.icu.text.BreakIterator getCharacterInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.BreakIterator getCharacterInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.BreakIterator getSentenceInstance() { return null; }
    public static android.icu.text.BreakIterator getSentenceInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.BreakIterator getSentenceInstance(android.icu.util.ULocale p0) { return null; }
    @java.lang.Deprecated
    public static android.icu.text.BreakIterator getTitleInstance() { return null; }
    @java.lang.Deprecated
    public static android.icu.text.BreakIterator getTitleInstance(java.util.Locale p0) { return null; }
    @java.lang.Deprecated
    public static android.icu.text.BreakIterator getTitleInstance(android.icu.util.ULocale p0) { return null; }
    public static synchronized java.util.Locale[] getAvailableLocales() { return null; }
}
