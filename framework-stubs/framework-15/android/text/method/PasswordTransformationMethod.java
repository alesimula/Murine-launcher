package android.text.method;

public class PasswordTransformationMethod implements android.text.method.TransformationMethod, android.text.TextWatcher {
    public PasswordTransformationMethod() {}
    public java.lang.CharSequence getTransformation(java.lang.CharSequence p0, android.view.View p1) { return null; }
    public static android.text.method.PasswordTransformationMethod getInstance() { return null; }
    public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void afterTextChanged(android.text.Editable p0) {}
    public void onFocusChanged(android.view.View p0, java.lang.CharSequence p1, boolean p2, int p3, android.graphics.Rect p4) {}

    private static class PasswordCharSequence implements java.lang.CharSequence, android.text.GetChars {
        public PasswordCharSequence(java.lang.CharSequence p0) {}
        public int length() { return 0; }
        public char charAt(int p0) { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public java.lang.String toString() { return null; }
        public void getChars(int p0, int p1, char[] p2, int p3) {}
    }

    private static class ViewReference extends java.lang.ref.WeakReference<android.view.View> implements android.text.NoCopySpan {
        public ViewReference(android.view.View p0) { super(null); }
    }

    private static class Visible extends android.os.Handler implements android.text.style.UpdateLayout, java.lang.Runnable {
        public Visible(android.text.Spannable p0, android.text.method.PasswordTransformationMethod p1) { super(); }
        public void run() {}
    }
}
