package com.android.internal.policy;

public class GestureNavigationSettingsObserver extends android.database.ContentObserver {
    private android.content.Context mContext;
    private java.lang.Runnable mOnChangeRunnable;
    private android.os.Handler mMainHandler;
    private final android.provider.DeviceConfig.OnPropertiesChangedListener mOnPropertiesChangedListener = null;
    public GestureNavigationSettingsObserver(android.os.Handler p0, android.content.Context p1, java.lang.Runnable p2) { super(null); }
    public void register() {}
    public void unregister() {}
    public void onChange(boolean p0) {}
    public int getLeftSensitivity(android.content.res.Resources p0) { return 0; }
    public int getRightSensitivity(android.content.res.Resources p0) { return 0; }
    public boolean areNavigationButtonForcedVisible() { return false; }
    private int getSensitivity(android.content.res.Resources p0, java.lang.String p1) { return 0; }
}
