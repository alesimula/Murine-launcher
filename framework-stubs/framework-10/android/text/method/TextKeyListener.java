package android.text.method;

public class TextKeyListener extends android.text.method.BaseKeyListener implements android.text.SpanWatcher {
    private static android.text.method.TextKeyListener[] sInstance;
    static final java.lang.Object ACTIVE = null;
    static final java.lang.Object CAPPED = null;
    static final java.lang.Object INHIBIT_REPLACEMENT = null;
    static final java.lang.Object LAST_TYPED = null;
    private android.text.method.TextKeyListener.Capitalize mAutoCap;
    private boolean mAutoText;
    private int mPrefs;
    private boolean mPrefsInited;
    static final int AUTO_CAP = 1;
    static final int AUTO_TEXT = 2;
    static final int AUTO_PERIOD = 4;
    static final int SHOW_PASSWORD = 8;
    private java.lang.ref.WeakReference<android.content.ContentResolver> mResolver;
    private android.text.method.TextKeyListener.SettingsObserver mObserver;
    public TextKeyListener(android.text.method.TextKeyListener.Capitalize p0, boolean p1) { super(); }
    public static android.text.method.TextKeyListener getInstance(boolean p0, android.text.method.TextKeyListener.Capitalize p1) { return null; }
    public static android.text.method.TextKeyListener getInstance() { return null; }
    public static boolean shouldCap(android.text.method.TextKeyListener.Capitalize p0, java.lang.CharSequence p1, int p2) { return false; }
    public int getInputType() { return 0; }
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public boolean onKeyUp(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public boolean onKeyOther(android.view.View p0, android.text.Editable p1, android.view.KeyEvent p2) { return false; }
    public static void clear(android.text.Editable p0) {}
    public void onSpanAdded(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
    public void onSpanRemoved(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
    public void onSpanChanged(android.text.Spannable p0, java.lang.Object p1, int p2, int p3, int p4, int p5) {}
    private android.text.method.KeyListener getKeyListener(android.view.KeyEvent p0) { return null; }
    public void release() {}
    private void initPrefs(android.content.Context p0) {}
    private void updatePrefs(android.content.ContentResolver p0) {}
    int getPrefs(android.content.Context p0) { return 0; }

    private class SettingsObserver extends android.database.ContentObserver {
        public SettingsObserver(android.text.method.TextKeyListener p0) { super(null); }
        public void onChange(boolean p0) {}
    }

    private static class NullKeyListener implements android.text.method.KeyListener {
        private static android.text.method.TextKeyListener.NullKeyListener sInstance;
        private NullKeyListener() {}
        public int getInputType() { return 0; }
        public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
        public boolean onKeyUp(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
        public boolean onKeyOther(android.view.View p0, android.text.Editable p1, android.view.KeyEvent p2) { return false; }
        public void clearMetaKeyState(android.view.View p0, android.text.Editable p1, int p2) {}
        public static android.text.method.TextKeyListener.NullKeyListener getInstance() { return null; }
    }

    public static enum Capitalize {
        NONE,
        SENTENCES,
        WORDS,
        CHARACTERS;
        private Capitalize() {}
    }
}
