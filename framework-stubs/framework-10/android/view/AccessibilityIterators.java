package android.view;

public final class AccessibilityIterators {
    public AccessibilityIterators() {}

    static class WordTextSegmentIterator extends android.view.AccessibilityIterators.CharacterTextSegmentIterator {
        private static android.view.AccessibilityIterators.WordTextSegmentIterator sInstance;
        public static android.view.AccessibilityIterators.WordTextSegmentIterator getInstance(java.util.Locale p0) { return null; }
        private WordTextSegmentIterator(java.util.Locale p0) { super(null); }
        protected void onLocaleChanged(java.util.Locale p0) {}
        public int[] following(int p0) { return null; }
        public int[] preceding(int p0) { return null; }
        private boolean isStartBoundary(int p0) { return false; }
        private boolean isEndBoundary(int p0) { return false; }
        private boolean isLetterOrDigit(int p0) { return false; }
    }

    public static interface TextSegmentIterator {
        public int[] following(int p0);
        public int[] preceding(int p0);
    }

    static class ParagraphTextSegmentIterator extends android.view.AccessibilityIterators.AbstractTextSegmentIterator {
        private static android.view.AccessibilityIterators.ParagraphTextSegmentIterator sInstance;
        ParagraphTextSegmentIterator() { super(); }
        public static android.view.AccessibilityIterators.ParagraphTextSegmentIterator getInstance() { return null; }
        public int[] following(int p0) { return null; }
        public int[] preceding(int p0) { return null; }
        private boolean isStartBoundary(int p0) { return false; }
        private boolean isEndBoundary(int p0) { return false; }
    }

    static class CharacterTextSegmentIterator extends android.view.AccessibilityIterators.AbstractTextSegmentIterator implements android.view.ViewRootImpl.ConfigChangedCallback {
        private static android.view.AccessibilityIterators.CharacterTextSegmentIterator sInstance;
        private java.util.Locale mLocale;
        protected java.text.BreakIterator mImpl;
        public static android.view.AccessibilityIterators.CharacterTextSegmentIterator getInstance(java.util.Locale p0) { return null; }
        private CharacterTextSegmentIterator(java.util.Locale p0) { super(); }
        public void initialize(java.lang.String p0) {}
        public int[] following(int p0) { return null; }
        public int[] preceding(int p0) { return null; }
        public void onConfigurationChanged(android.content.res.Configuration p0) {}
        protected void onLocaleChanged(java.util.Locale p0) {}
    }

    public static abstract class AbstractTextSegmentIterator implements android.view.AccessibilityIterators.TextSegmentIterator {
        @android.annotation.UnsupportedAppUsage
        protected java.lang.String mText;
        private final int[] mSegment = null;
        public AbstractTextSegmentIterator() {}
        public void initialize(java.lang.String p0) {}
        protected int[] getRange(int p0, int p1) { return null; }
    }
}
