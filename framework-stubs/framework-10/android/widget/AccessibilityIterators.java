package android.widget;

final class AccessibilityIterators {
    AccessibilityIterators() {}

    static class PageTextSegmentIterator extends android.widget.AccessibilityIterators.LineTextSegmentIterator {
        private static android.widget.AccessibilityIterators.PageTextSegmentIterator sPageInstance;
        private android.widget.TextView mView;
        private final android.graphics.Rect mTempRect = null;
        PageTextSegmentIterator() { super(); }
        public static android.widget.AccessibilityIterators.PageTextSegmentIterator getInstance() { return null; }
        public void initialize(android.widget.TextView p0) {}
        public int[] following(int p0) { return null; }
        public int[] preceding(int p0) { return null; }
    }

    static class LineTextSegmentIterator extends android.view.AccessibilityIterators.AbstractTextSegmentIterator {
        private static android.widget.AccessibilityIterators.LineTextSegmentIterator sLineInstance;
        protected static final int DIRECTION_START = -1;
        protected static final int DIRECTION_END = 1;
        protected android.text.Layout mLayout;
        LineTextSegmentIterator() { super(); }
        public static android.widget.AccessibilityIterators.LineTextSegmentIterator getInstance() { return null; }
        public void initialize(android.text.Spannable p0, android.text.Layout p1) {}
        public int[] following(int p0) { return null; }
        public int[] preceding(int p0) { return null; }
        protected int getLineEdgeIndex(int p0, int p1) { return 0; }
    }
}
