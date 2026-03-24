package android.text.method;

public class MultiTapKeyListener extends android.text.method.BaseKeyListener implements android.text.SpanWatcher {
    private static android.text.method.MultiTapKeyListener[] sInstance;
    private static final android.util.SparseArray<java.lang.String> sRecs = null;
    private android.text.method.TextKeyListener.Capitalize mCapitalize;
    private boolean mAutoText;
    public MultiTapKeyListener(android.text.method.TextKeyListener.Capitalize p0, boolean p1) { super(); }
    public static android.text.method.MultiTapKeyListener getInstance(boolean p0, android.text.method.TextKeyListener.Capitalize p1) { return null; }
    public int getInputType() { return 0; }
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public void onSpanChanged(android.text.Spannable p0, java.lang.Object p1, int p2, int p3, int p4, int p5) {}
    private static void removeTimeouts(android.text.Spannable p0) {}
    public void onSpanAdded(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
    public void onSpanRemoved(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}

    private class Timeout extends android.os.Handler implements java.lang.Runnable {
        private android.text.Editable mBuffer;
        public Timeout(android.text.method.MultiTapKeyListener p0, android.text.Editable p1) { super(); }
        public void run() {}
    }
}
