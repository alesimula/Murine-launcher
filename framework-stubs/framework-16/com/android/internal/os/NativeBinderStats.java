package com.android.internal.os;

public class NativeBinderStats {
    static final boolean DEFAULT_ENABLED = false;
    static final int DEFAULT_PROCESS_SHARDING = 50;
    static final int DEFAULT_SPAM_SHARDING = 10;
    static final int DEFAULT_CALL_SHARDING = 20;
    static final int DEFAULT_SYSTEM_PROCESS_SHARDING = 10;
    static final int DEFAULT_SYSTEM_SPAM_SHARDING = 50;
    static final int DEFAULT_SYSTEM_CALL_SHARDING = 100;
    public boolean mEnabled;
    public int mProcessSharding;
    public int mSpamSharding;
    public int mCallSharding;
    public int mSystemProcessSharding;
    public int mSystemSpamSharding;
    public int mSystemCallSharding;
    public NativeBinderStats(android.content.Context p0) {}
    public void systemReady() {}
    public com.android.internal.os.NativeBinderStats.SettingsObserver getSettingsObserverForTesting() { return null; }

    public class SettingsObserver extends android.database.ContentObserver {
        SettingsObserver(com.android.internal.os.NativeBinderStats p0, android.content.Context p1) { super((android.os.Handler)null); }
        void register() {}
        public void onChange(boolean p0, android.net.Uri p1, int p2) {}
        void onChange() {}
    }
}
