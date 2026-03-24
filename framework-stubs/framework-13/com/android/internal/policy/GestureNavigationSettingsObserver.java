package com.android.internal.policy;

public class GestureNavigationSettingsObserver extends android.database.ContentObserver {
    public GestureNavigationSettingsObserver(android.os.Handler p0, android.content.Context p1, java.lang.Runnable p2) { super(null); }
    public void register() {}
    public void registerForCallingUser() {}
    public void unregister() {}
    public void onChange(boolean p0) {}
    public int getLeftSensitivity(android.content.res.Resources p0) { return 0; }
    public int getLeftSensitivityForCallingUser(android.content.res.Resources p0) { return 0; }
    public int getRightSensitivity(android.content.res.Resources p0) { return 0; }
    public int getRightSensitivityForCallingUser(android.content.res.Resources p0) { return 0; }
    public boolean areNavigationButtonForcedVisible() { return false; }
}
