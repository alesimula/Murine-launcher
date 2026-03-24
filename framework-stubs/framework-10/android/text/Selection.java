package android.text;

public class Selection {
    private static final java.lang.Object SELECTION_MEMORY = null;
    public static final java.lang.Object SELECTION_START = null;
    public static final java.lang.Object SELECTION_END = null;
    private Selection() {}
    public static final int getSelectionStart(java.lang.CharSequence p0) { return 0; }
    public static final int getSelectionEnd(java.lang.CharSequence p0) { return 0; }
    private static int getSelectionMemory(java.lang.CharSequence p0) { return 0; }
    public static void setSelection(android.text.Spannable p0, int p1, int p2) {}
    private static void setSelection(android.text.Spannable p0, int p1, int p2, int p3) {}
    private static void updateMemory(android.text.Spannable p0, int p1) {}
    private static void removeMemory(android.text.Spannable p0) {}
    public static final void setSelection(android.text.Spannable p0, int p1) {}
    public static final void selectAll(android.text.Spannable p0) {}
    public static final void extendSelection(android.text.Spannable p0, int p1) {}
    private static void extendSelection(android.text.Spannable p0, int p1, int p2) {}
    public static final void removeSelection(android.text.Spannable p0) {}
    public static boolean moveUp(android.text.Spannable p0, android.text.Layout p1) { return false; }
    private static void setSelectionAndMemory(android.text.Spannable p0, android.text.Layout p1, int p2, int p3, int p4, boolean p5) {}
    public static boolean moveDown(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveLeft(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveRight(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendUp(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendDown(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendLeft(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendRight(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendToLeftEdge(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean extendToRightEdge(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveToLeftEdge(android.text.Spannable p0, android.text.Layout p1) { return false; }
    public static boolean moveToRightEdge(android.text.Spannable p0, android.text.Layout p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean moveToPreceding(android.text.Spannable p0, android.text.Selection.PositionIterator p1, boolean p2) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean moveToFollowing(android.text.Spannable p0, android.text.Selection.PositionIterator p1, boolean p2) { return false; }
    private static int findEdge(android.text.Spannable p0, android.text.Layout p1, int p2) { return 0; }
    private static int chooseHorizontal(android.text.Layout p0, int p1, int p2, int p3) { return 0; }

    private static final class START implements android.text.NoCopySpan {
        private START() {}
    }

    public static interface PositionIterator {
        public static final int DONE = -1;
        public int preceding(int p0);
        public int following(int p0);
    }

    public static final class MemoryTextWatcher implements android.text.TextWatcher {
        public MemoryTextWatcher() {}
        public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void afterTextChanged(android.text.Editable p0) {}
    }

    private static final class MEMORY implements android.text.NoCopySpan {
        private MEMORY() {}
    }

    private static final class END implements android.text.NoCopySpan {
        private END() {}
    }
}
