package com.android.internal.ravenwood;

public final class RavenwoodEnvironment {
    public static final java.lang.String TAG = "RavenwoodEnvironment";
    public static com.android.internal.ravenwood.RavenwoodEnvironment getInstance() { return null; }
    public static void ensureRavenwoodInitialized() {}
    public boolean isRunningOnRavenwood() { return false; }
    public static com.android.internal.ravenwood.RavenwoodEnvironment.Workaround workaround() { return null; }

    public static class Workaround {
        Workaround() {}
        public boolean isTargetSdkAtLeastQ() { return false; }
    }
}
