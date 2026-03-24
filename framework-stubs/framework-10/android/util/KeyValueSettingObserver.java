package android.util;

public abstract class KeyValueSettingObserver {
    private static final java.lang.String TAG = "KeyValueSettingObserver";
    private final android.util.KeyValueListParser mParser = null;
    private final android.database.ContentObserver mObserver = null;
    private final android.content.ContentResolver mResolver = null;
    private final android.net.Uri mSettingUri = null;
    public KeyValueSettingObserver(android.os.Handler p0, android.content.ContentResolver p1, android.net.Uri p2) {}
    public void start() {}
    public void stop() {}
    public abstract java.lang.String getSettingValue(android.content.ContentResolver p0);
    private void setParserValue() {}
    public abstract void update(android.util.KeyValueListParser p0);

    private class SettingObserver extends android.database.ContentObserver {
        private SettingObserver(android.util.KeyValueSettingObserver p0, android.os.Handler p1) { super(null); }
        public void onChange(boolean p0) {}
    }
}
