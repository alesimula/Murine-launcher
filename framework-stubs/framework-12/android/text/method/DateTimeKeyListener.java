package android.text.method;

public class DateTimeKeyListener extends android.text.method.NumberKeyListener {
    private static final java.lang.String SYMBOLS_TO_IGNORE = "yMLdahHKkms";
    private static final java.lang.String SKELETON_12HOUR = "yMdhms";
    private static final java.lang.String SKELETON_24HOUR = "yMdHms";
    public static final char[] CHARACTERS = null;
    private final char[] mCharacters = null;
    private final boolean mNeedsAdvancedInput = false;
    private static final java.lang.Object sLock = null;
    private static final java.util.HashMap<java.util.Locale, android.text.method.DateTimeKeyListener> sInstanceCache = null;
    public int getInputType() { return 0; }
    protected char[] getAcceptedChars() { return null; }
    @java.lang.Deprecated
    public DateTimeKeyListener() { super(); }
    public DateTimeKeyListener(java.util.Locale p0) { super(); }
    @java.lang.Deprecated
    public static android.text.method.DateTimeKeyListener getInstance() { return null; }
    public static android.text.method.DateTimeKeyListener getInstance(java.util.Locale p0) { return null; }
}
