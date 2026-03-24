package com.android.internal.ravenwood;

public final class RavenwoodEnvironment {
    public static final java.lang.String TAG = "RavenwoodEnvironment";
    public RavenwoodEnvironment() {}
    public static com.android.internal.ravenwood.RavenwoodEnvironment getInstance() { return null; }
    public boolean isRunningOnRavenwood() { return false; }
    public <T extends java.lang.Object> T fromAddress(long p0) { return null; }
    public java.lang.String getRavenwoodRuntimePath() { return null; }

    public static class CompatIdsForTest {
        public static final long TEST_COMPAT_ID_1 = 368131859L;
        public static final long TEST_COMPAT_ID_2 = 368131701L;
        public static final long TEST_COMPAT_ID_3 = 368131659L;
        public static final long TEST_COMPAT_ID_4 = 368132057L;
        public static final long TEST_COMPAT_ID_5 = 387558811L;
        public CompatIdsForTest() {}
    }
}
