package android.util;

public abstract class KeyValueSettingObserver {
    public KeyValueSettingObserver(android.os.Handler p0, android.content.ContentResolver p1, android.net.Uri p2) {}
    public void start() {}
    public void stop() {}
    public abstract java.lang.String getSettingValue(android.content.ContentResolver p0);
    public abstract void update(android.util.KeyValueListParser p0);

    private class SettingObserver extends android.database.ContentObserver {
        SettingObserver() { super(null); }
        public void onChange(boolean p0) {}
    }
}
