package android.text.method;

public abstract class NumberKeyListener extends android.text.method.BaseKeyListener implements android.text.InputFilter {
    public NumberKeyListener() { super(); }
    @android.annotation.NonNull
    protected abstract char[] getAcceptedChars();
    protected int lookup(android.view.KeyEvent p0, android.text.Spannable p1) { return 0; }
    public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
    protected static boolean ok(char[] p0, char p1) { return false; }
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    @android.annotation.Nullable
    static boolean addDigits(java.util.Collection<java.lang.Character> p0, java.util.Locale p1) { return false; }
    static boolean addFormatCharsFromSkeleton(java.util.Collection<java.lang.Character> p0, java.util.Locale p1, java.lang.String p2, java.lang.String p3) { return false; }
    static boolean addFormatCharsFromSkeletons(java.util.Collection<java.lang.Character> p0, java.util.Locale p1, java.lang.String[] p2, java.lang.String p3) { return false; }
    static boolean addAmPmChars(java.util.Collection<java.lang.Character> p0, java.util.Locale p1) { return false; }
    @android.annotation.NonNull
    static char[] collectionToArray(java.util.Collection<java.lang.Character> p0) { return null; }
}
