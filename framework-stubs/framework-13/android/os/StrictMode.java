package android.os;

public final class StrictMode {
    public static final java.lang.String DISABLE_PROPERTY = "persist.sys.strictmode.disable";
    public static final java.lang.String VISUAL_PROPERTY = "persist.sys.strictmode.visual";
    public static final int PENALTY_GATHER = -2147483648;
    public static final int PENALTY_LOG = 1073741824;
    public static final int PENALTY_DIALOG = 536870912;
    public static final int PENALTY_DEATH = 268435456;
    public static final int PENALTY_FLASH = 134217728;
    public static final int PENALTY_DROPBOX = 67108864;
    public static final int PENALTY_DEATH_ON_NETWORK = 33554432;
    public static final int PENALTY_DEATH_ON_CLEARTEXT_NETWORK = 16777216;
    public static final int PENALTY_DEATH_ON_FILE_URI_EXPOSURE = 8388608;
    public static final int PENALTY_ALL = -65536;
    public static final int NETWORK_POLICY_ACCEPT = 0;
    public static final int NETWORK_POLICY_LOG = 1;
    public static final int NETWORK_POLICY_REJECT = 2;
    public static void setViolationLogger(android.os.StrictMode.ViolationLogger p0) {}
    public static void setThreadPolicy(android.os.StrictMode.ThreadPolicy p0) {}
    public static void setThreadPolicyMask(int p0) {}
    public static int getThreadPolicyMask() { return 0; }
    public static android.os.StrictMode.ThreadPolicy getThreadPolicy() { return null; }
    public static android.os.StrictMode.ThreadPolicy allowThreadDiskWrites() { return null; }
    public static int allowThreadDiskWritesMask() { return 0; }
    public static android.os.StrictMode.ThreadPolicy allowThreadDiskReads() { return null; }
    public static int allowThreadDiskReadsMask() { return 0; }
    public static android.os.StrictMode.ThreadPolicy allowThreadViolations() { return null; }
    public static android.os.StrictMode.VmPolicy allowVmViolations() { return null; }
    public static boolean isBundledSystemApp(android.content.pm.ApplicationInfo p0) { return false; }
    public static void initThreadDefaults(android.content.pm.ApplicationInfo p0) {}
    public static void initVmDefaults(android.content.pm.ApplicationInfo p0) {}
    public static void enableDeathOnFileUriExposure() {}
    public static void disableDeathOnFileUriExposure() {}
    static boolean hasGatheredViolations() { return false; }
    static void clearGatheredViolations() {}
    public static void conditionallyCheckInstanceCounts() {}
    public static void setVmPolicy(android.os.StrictMode.VmPolicy p0) {}
    public static android.os.StrictMode.VmPolicy getVmPolicy() { return null; }
    public static void enableDefaults() {}
    public static boolean vmSqliteObjectLeaksEnabled() { return false; }
    public static boolean vmClosableObjectLeaksEnabled() { return false; }
    public static boolean vmRegistrationLeaksEnabled() { return false; }
    public static boolean vmFileUriExposureEnabled() { return false; }
    public static boolean vmCleartextNetworkEnabled() { return false; }
    public static boolean vmContentUriWithoutPermissionEnabled() { return false; }
    public static boolean vmUntaggedSocketEnabled() { return false; }
    public static boolean vmImplicitDirectBootEnabled() { return false; }
    public static boolean vmCredentialProtectedWhileLockedEnabled() { return false; }
    public static boolean vmIncorrectContextUseEnabled() { return false; }
    public static boolean vmUnsafeIntentLaunchEnabled() { return false; }
    public static void onSqliteObjectLeaked(java.lang.String p0, java.lang.Throwable p1) {}
    public static void onWebViewMethodCalledOnWrongThread(java.lang.Throwable p0) {}
    public static void onIntentReceiverLeaked(java.lang.Throwable p0) {}
    public static void onServiceConnectionLeaked(java.lang.Throwable p0) {}
    public static void onFileUriExposed(android.net.Uri p0, java.lang.String p1) {}
    public static void onContentUriWithoutPermission(android.net.Uri p0, java.lang.String p1) {}
    public static void onCleartextNetworkDetected(byte[] p0) {}
    public static void onUntaggedSocket() {}
    public static void onImplicitDirectBoot() {}
    public static void onIncorrectContextUsed(java.lang.String p0, java.lang.Throwable p1) {}
    public static void assertConfigurationContext(android.content.Context p0, java.lang.String p1) {}
    public static void assertUiContext(android.content.Context p0, java.lang.String p1) {}
    public static void onUnsafeIntentLaunch(android.content.Intent p0) {}
    public static void onVmPolicyViolation(android.os.strictmode.Violation p0) {}
    public static void onVmPolicyViolation(android.os.strictmode.Violation p0, boolean p1) {}
    static void writeGatheredViolationsToParcel(android.os.Parcel p0) {}
    static void readAndHandleBinderCallViolations(android.os.Parcel p0) {}
    public static android.os.StrictMode.Span enterCriticalSpan(java.lang.String p0) { return null; }
    public static void noteSlowCall(java.lang.String p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void noteUntaggedSocket() {}
    public static void noteResourceMismatch(java.lang.Object p0) {}
    public static void noteUnbufferedIO() {}
    public static void noteDiskRead() {}
    public static void noteDiskWrite() {}
    public static java.lang.Object trackActivity(java.lang.Object p0) { return null; }
    public static void incrementExpectedActivityCount(java.lang.Class p0) {}
    public static void decrementExpectedActivityCount(java.lang.Class p0) {}

    private static class AndroidBlockGuardPolicy {
        public AndroidBlockGuardPolicy(int p0) {}
        public java.lang.String toString() { return null; }
        public int getPolicyMask() { return 0; }
        public void onWriteToDisk() {}
        void onCustomSlowCall(java.lang.String p0) {}
        void onResourceMismatch(java.lang.Object p0) {}
        public void onUnbufferedIO() {}
        public void onReadFromDisk() {}
        public void onNetwork() {}
        public void onExplicitGc() {}
        public int getThreadPolicyMask() { return 0; }
        public void setThreadPolicyMask(int p0) {}
        void startHandlingViolationException(android.os.strictmode.Violation p0) {}
        void handleViolationWithTimingAttempt(android.os.StrictMode.ViolationInfo p0) {}
        void onThreadPolicyViolation(android.os.StrictMode.ViolationInfo p0) {}
    }

    private static class AndroidCloseGuardReporter {
        public void report(java.lang.String p0, java.lang.Throwable p1) {}
        public void report(java.lang.String p0) {}
    }

    private static final class InstanceTracker {
        public InstanceTracker(java.lang.Object p0) {}
        protected void finalize() throws java.lang.Throwable {}
        public static int getInstanceCount(java.lang.Class<?> p0) { return 0; }
    }

    public static interface OnThreadViolationListener {
        public void onThreadViolation(android.os.strictmode.Violation p0);
    }

    public static interface OnVmViolationListener {
        public void onVmViolation(android.os.strictmode.Violation p0);
    }

    public static class Span {
        Span(android.os.StrictMode.ThreadSpanState p0) {}
        protected Span() {}
        public void finish() {}
    }

    public static final class ThreadPolicy {
        public static final android.os.StrictMode.ThreadPolicy LAX = null;
        final int mask = 0;
        final android.os.StrictMode.OnThreadViolationListener mListener = null;
        final java.util.concurrent.Executor mCallbackExecutor = null;
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            public Builder(android.os.StrictMode.ThreadPolicy p0) {}
            public android.os.StrictMode.ThreadPolicy.Builder detectAll() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitAll() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectNetwork() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitNetwork() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectDiskReads() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitDiskReads() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectCustomSlowCalls() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitCustomSlowCalls() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitResourceMismatches() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectUnbufferedIo() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitUnbufferedIo() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectResourceMismatches() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectDiskWrites() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitDiskWrites() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder detectExplicitGc() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder permitExplicitGc() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyDialog() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyDeath() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyDeathOnNetwork() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyFlashScreen() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyLog() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyDropBox() { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyListener(java.util.concurrent.Executor p0, android.os.StrictMode.OnThreadViolationListener p1) { return null; }
            public android.os.StrictMode.ThreadPolicy.Builder penaltyListener(android.os.StrictMode.OnThreadViolationListener p0, java.util.concurrent.Executor p1) { return null; }
            public android.os.StrictMode.ThreadPolicy build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ThreadPolicyMask {
    }

    private static class ThreadSpanState {
        public android.os.StrictMode.Span mActiveHead;
        public int mActiveSize;
        public android.os.StrictMode.Span mFreeListHead;
        public int mFreeListSize;
    }

    public static final class ViolationInfo implements android.os.Parcelable {
        public int durationMillis;
        public int numAnimationsRunning;
        public java.lang.String[] tags;
        public int violationNumThisLoop;
        public long violationUptimeMillis;
        public java.lang.String broadcastIntentAction;
        public long numInstances;
        public static final android.os.Parcelable.Creator<android.os.StrictMode.ViolationInfo> CREATOR = null;
        ViolationInfo(android.os.strictmode.Violation p0, int p1) {}
        public java.lang.String getStackTrace() { return null; }
        public java.lang.Class<? extends android.os.strictmode.Violation> getViolationClass() { return null; }
        public java.lang.String getViolationDetails() { return null; }
        boolean penaltyEnabled(int p0) { return false; }
        void addLocalStack(java.lang.Throwable p0) {}
        public int hashCode() { return 0; }
        public ViolationInfo(android.os.Parcel p0) {}
        public ViolationInfo(android.os.Parcel p0, boolean p1) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void dump(android.util.Printer p0, java.lang.String p1) {}
        public int describeContents() { return 0; }
    }

    public static interface ViolationLogger {
        public void log(android.os.StrictMode.ViolationInfo p0);
    }

    public static final class VmPolicy {
        public static final android.os.StrictMode.VmPolicy LAX = null;
        final int mask = 0;
        final android.os.StrictMode.OnVmViolationListener mListener = null;
        final java.util.concurrent.Executor mCallbackExecutor = null;
        final java.util.HashMap<java.lang.Class, java.lang.Integer> classInstanceLimit = null;
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            public Builder(android.os.StrictMode.VmPolicy p0) {}
            public android.os.StrictMode.VmPolicy.Builder setClassInstanceLimit(java.lang.Class p0, int p1) { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectActivityLeaks() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitActivityLeaks() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectNonSdkApiUsage() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitNonSdkApiUsage() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectAll() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectLeakedSqlLiteObjects() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectLeakedClosableObjects() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectLeakedRegistrationObjects() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectFileUriExposure() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectCleartextNetwork() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectContentUriWithoutPermission() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectUntaggedSockets() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitUntaggedSockets() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectImplicitDirectBoot() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitImplicitDirectBoot() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectCredentialProtectedWhileLocked() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitCredentialProtectedWhileLocked() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectIncorrectContextUse() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitIncorrectContextUse() { return null; }
            public android.os.StrictMode.VmPolicy.Builder detectUnsafeIntentLaunch() { return null; }
            public android.os.StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyDeath() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyDeathOnCleartextNetwork() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyDeathOnFileUriExposure() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyLog() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyDropBox() { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyListener(java.util.concurrent.Executor p0, android.os.StrictMode.OnVmViolationListener p1) { return null; }
            public android.os.StrictMode.VmPolicy.Builder penaltyListener(android.os.StrictMode.OnVmViolationListener p0, java.util.concurrent.Executor p1) { return null; }
            android.os.StrictMode.VmPolicy.Builder disable(int p0) { return null; }
            public android.os.StrictMode.VmPolicy build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VmPolicyMask {
    }
}
