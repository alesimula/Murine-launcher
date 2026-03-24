package android.text.method;

public class QwertyKeyListener extends android.text.method.BaseKeyListener {
    private static android.text.method.QwertyKeyListener[] sInstance;
    private static android.text.method.QwertyKeyListener sFullKeyboardInstance;
    private android.text.method.TextKeyListener.Capitalize mAutoCap;
    private boolean mAutoText;
    private boolean mFullKeyboard;
    private static android.util.SparseArray<java.lang.String> PICKER_SETS;
    private QwertyKeyListener(android.text.method.TextKeyListener.Capitalize p0, boolean p1, boolean p2) { super(); }
    public QwertyKeyListener(android.text.method.TextKeyListener.Capitalize p0, boolean p1) { super(); }
    public static android.text.method.QwertyKeyListener getInstance(boolean p0, android.text.method.TextKeyListener.Capitalize p1) { return null; }
    public static android.text.method.QwertyKeyListener getInstanceForFullKeyboard() { return null; }
    public int getInputType() { return 0; }
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    private java.lang.String getReplacement(java.lang.CharSequence p0, int p1, int p2, android.view.View p3) { return null; }
    public static void markAsReplaced(android.text.Spannable p0, int p1, int p2, java.lang.String p3) {}
    private boolean showCharacterPicker(android.view.View p0, android.text.Editable p1, char p2, boolean p3, int p4) { return false; }
    private static java.lang.String toTitleCase(java.lang.String p0) { return null; }

    static class Replaced implements android.text.NoCopySpan {
        private char[] mText;
        public Replaced(char[] p0) {}
    }
}
