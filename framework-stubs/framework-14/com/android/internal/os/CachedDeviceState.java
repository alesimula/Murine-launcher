package com.android.internal.os;

public class CachedDeviceState {
    public CachedDeviceState() {}
    public CachedDeviceState(boolean p0, boolean p1) {}
    public void setScreenInteractive(boolean p0) {}
    public void setCharging(boolean p0) {}
    public com.android.internal.os.CachedDeviceState.Readonly getReadonlyClient() { return null; }

    public class Readonly {
        public Readonly(com.android.internal.os.CachedDeviceState p0) {}
        public boolean isCharging() { return false; }
        public boolean isScreenInteractive() { return false; }
        public com.android.internal.os.CachedDeviceState.TimeInStateStopwatch createTimeOnBatteryStopwatch() { return null; }
    }

    public class TimeInStateStopwatch implements java.lang.AutoCloseable {
        public TimeInStateStopwatch(com.android.internal.os.CachedDeviceState p0) {}
        public long getMillis() { return 0L; }
        public void reset() {}
        public boolean isRunning() { return false; }
        public void close() {}
    }
}
