package android.text;

public class Selection {
    public static final java.lang.Object SELECTION_START = null;
    public static final java.lang.Object SELECTION_END = null;
    public static final int getSelectionStart(java.lang.CharSequence p0) { return 0; }
    public static final int getSelectionEnd(java.lang.CharSequence p0) { return 0; }
    public static void setSelection(android.text.Spannable p0, int p1, int p2) {}
    public static final void setSelection(android.text.Spannable p0, int p1) {}
    public static final void selectAll(android.text.Spannable p0) {}
    public static final void extendSelection(android.text.Spannable p0, int p1) {}
    public static final void removeSelection(android.text.Spannable p0) {}
    public static boolean moveUp(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveDown(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveLeft(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveRight(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveToParagraphStart(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveToParagraphEnd(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendToParagraphStart(android.text.Spannable p0) { return false; }
    public static boolean extendToParagraphEnd(android.text.Spannable p0) { return false; }
    public static boolean extendUp(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendDown(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendLeft(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendRight(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendToLeftEdge(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendToRightEdge(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveToLeftEdge(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveToRightEdge(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveToPreceding(android.text.Spannable p0, android.text.Selection.PositionIterator p1, boolean p2) { return false; }
    public static boolean moveToFollowing(android.text.Spannable p0, android.text.Selection.PositionIterator p1, boolean p2) { return false; }

    private static final class END implements android.text.NoCopySpan {
    }

    private static final class MEMORY implements android.text.NoCopySpan {
    }

    public static final class MemoryTextWatcher implements android.text.TextWatcher {
        public MemoryTextWatcher() {}
        public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void afterTextChanged(android.text.Editable p0) {}
    }

    public static interface PositionIterator {
        public static final int DONE = -1;
        public int preceding(int p0);
        public int following(int p0);
    }

    private static final class START implements android.text.NoCopySpan {
    }
}
