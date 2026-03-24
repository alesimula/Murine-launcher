package android.text.method;

public class HideReturnsTransformationMethod extends android.text.method.ReplacementTransformationMethod {
    private static char[] ORIGINAL;
    private static char[] REPLACEMENT;
    private static android.text.method.HideReturnsTransformationMethod sInstance;
    public HideReturnsTransformationMethod() { super(); }
    protected char[] getOriginal() { return null; }
    protected char[] getReplacement() { return null; }
    public static android.text.method.HideReturnsTransformationMethod getInstance() { return null; }
}
