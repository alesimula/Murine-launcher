package com.android.internal.os;

public final class RpmStats {
    public java.util.Map<java.lang.String, com.android.internal.os.RpmStats.PowerStatePlatformSleepState> mPlatformLowPowerStats;
    public java.util.Map<java.lang.String, com.android.internal.os.RpmStats.PowerStateSubsystem> mSubsystemLowPowerStats;
    public RpmStats() {}
    public com.android.internal.os.RpmStats.PowerStatePlatformSleepState getAndUpdatePlatformState(java.lang.String p0, long p1, int p2) { return null; }
    public com.android.internal.os.RpmStats.PowerStateSubsystem getSubsystem(java.lang.String p0) { return null; }

    public static class PowerStateElement {
        public long mTimeMs;
        public int mCount;
    }

    public static class PowerStatePlatformSleepState {
        public long mTimeMs;
        public int mCount;
        public java.util.Map<java.lang.String, com.android.internal.os.RpmStats.PowerStateElement> mVoters;
        public PowerStatePlatformSleepState() {}
        public void putVoter(java.lang.String p0, long p1, int p2) {}
    }

    public static class PowerStateSubsystem {
        public java.util.Map<java.lang.String, com.android.internal.os.RpmStats.PowerStateElement> mStates;
        public PowerStateSubsystem() {}
        public void putState(java.lang.String p0, long p1, int p2) {}
    }
}
