package com.android.internal.os;

public abstract class Clock {
    public static final com.android.internal.os.Clock SYSTEM_CLOCK = null;
    public Clock() {}
    public long elapsedRealtime() { return 0L; }
    public long uptimeMillis() { return 0L; }
    public long currentTimeMillis() { return 0L; }
}
