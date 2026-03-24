package android.text.method;

public abstract class MetaKeyKeyListener {
    public static final int META_SHIFT_ON = 1;
    public static final int META_ALT_ON = 2;
    public static final int META_SYM_ON = 4;
    public static final int META_CAP_LOCKED = 256;
    public static final int META_ALT_LOCKED = 512;
    public static final int META_SYM_LOCKED = 1024;
    public static final int META_SELECTING = 2048;
    public MetaKeyKeyListener() {}
    public static void resetMetaState(android.text.Spannable p0) {}
    public static final int getMetaState(java.lang.CharSequence p0) { return 0; }
    public static final int getMetaState(java.lang.CharSequence p0, android.view.KeyEvent p1) { return 0; }
    public static final int getMetaState(java.lang.CharSequence p0, int p1) { return 0; }
    public static final int getMetaState(java.lang.CharSequence p0, int p1, android.view.KeyEvent p2) { return 0; }
    public static void adjustMetaAfterKeypress(android.text.Spannable p0) {}
    public static boolean isMetaTracker(java.lang.CharSequence p0, java.lang.Object p1) { return false; }
    public static boolean isSelectingMetaTracker(java.lang.CharSequence p0, java.lang.Object p1) { return false; }
    protected static void resetLockedMeta(android.text.Spannable p0) {}
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public static void startSelecting(android.view.View p0, android.text.Spannable p1) {}
    public static void stopSelecting(android.view.View p0, android.text.Spannable p1) {}
    public boolean onKeyUp(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public void clearMetaKeyState(android.view.View p0, android.text.Editable p1, int p2) {}
    public static void clearMetaKeyState(android.text.Editable p0, int p1) {}
    public static long resetLockedMeta(long p0) { return 0L; }
    public static final int getMetaState(long p0) { return 0; }
    public static final int getMetaState(long p0, int p1) { return 0; }
    public static long adjustMetaAfterKeypress(long p0) { return 0L; }
    public static long handleKeyDown(long p0, int p1, android.view.KeyEvent p2) { return 0L; }
    public static long handleKeyUp(long p0, int p1, android.view.KeyEvent p2) { return 0L; }
    public long clearMetaKeyState(long p0, int p1) { return 0L; }
}
