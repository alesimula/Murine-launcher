package com.android.server.deviceidle;

public interface IDeviceIdleConstraint {
    public static final int ACTIVE = 0;
    public static final int SENSING_OR_ABOVE = 1;
    public void startMonitoring();
    public void stopMonitoring();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MinimumState {
    }
}
