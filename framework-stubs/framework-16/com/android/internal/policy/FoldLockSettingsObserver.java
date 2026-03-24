package com.android.internal.policy;

public class FoldLockSettingsObserver extends android.database.ContentObserver {
    public static final java.lang.String SETTING_VALUE_STAY_AWAKE_ON_FOLD = "stay_awake_on_fold_key";
    public static final java.lang.String SETTING_VALUE_SELECTIVE_STAY_AWAKE = "selective_stay_awake_key";
    public static final java.lang.String SETTING_VALUE_SLEEP_ON_FOLD = "sleep_on_fold_key";
    public static final java.lang.String SETTING_VALUE_DEFAULT = "selective_stay_awake_key";
    java.lang.String mFoldLockSetting;
    public FoldLockSettingsObserver(android.os.Handler p0, android.content.Context p1) { super((android.os.Handler)null); }
    public void register() {}
    public void unregister() {}
    public void onChange(boolean p0) {}
    void requestAndCacheFoldLockSetting() {}
    java.lang.String request() { return null; }
    void setCurrentFoldSetting(java.lang.String p0) {}
    public boolean isStayAwakeOnFold() { return false; }
    public boolean isSelectiveStayAwake() { return false; }
    public boolean isSleepOnFold() { return false; }
}
