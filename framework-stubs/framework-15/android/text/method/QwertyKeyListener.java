package android.text.method;

public class QwertyKeyListener extends android.text.method.BaseKeyListener {
    public QwertyKeyListener(android.text.method.TextKeyListener.Capitalize p0, boolean p1) { super(); }
    public static android.text.method.QwertyKeyListener getInstance(boolean p0, android.text.method.TextKeyListener.Capitalize p1) { return null; }
    public static android.text.method.QwertyKeyListener getInstanceForFullKeyboard() { return null; }
    public int getInputType() { return 0; }
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public static void markAsReplaced(android.text.Spannable p0, int p1, int p2, java.lang.String p3) {}

    static class Replaced implements android.text.NoCopySpan {
        public Replaced(char[] p0) {}
    }
}
