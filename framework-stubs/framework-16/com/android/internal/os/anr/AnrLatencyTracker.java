package com.android.internal.os.anr;

public class AnrLatencyTracker implements java.lang.AutoCloseable {
    public AnrLatencyTracker(int p0, long p1) {}
    public void appNotRespondingStarted() {}
    public void appNotRespondingEnded() {}
    public void earlyDumpRequestSubmittedWithSize(int p0) {}
    public void anrRecordPlacingOnQueueWithSize(int p0) {}
    public void anrProcessingStarted() {}
    public void anrProcessingEnded() {}
    public void dumpStackTracesStarted() {}
    public void dumpStackTracesEnded() {}
    public void updateCpuStatsNowCalled() {}
    public void updateCpuStatsNowReturned() {}
    public void currentPsiStateCalled() {}
    public void currentPsiStateReturned() {}
    public void processCpuTrackerMethodsCalled() {}
    public void processCpuTrackerMethodsReturned() {}
    public void criticalEventLogStarted() {}
    public void criticalEventLogEnded() {}
    public void nativePidCollectionStarted() {}
    public void nativePidCollectionEnded() {}
    public void dumpingPidStarted(int p0) {}
    public void dumpingPidEnded() {}
    public void dumpingFirstPidsStarted() {}
    public void dumpingFirstPidsEnded() {}
    public void copyingFirstPidStarted() {}
    public void copyingFirstPidEnded(boolean p0) {}
    public void dumpStackTracesTempFileStarted() {}
    public void dumpStackTracesTempFileEnded() {}
    public void dumpStackTracesTempFileCreationFailed() {}
    public void dumpStackTracesTempFileTimedOut() {}
    public void dumpingNativePidsStarted() {}
    public void dumpingNativePidsEnded() {}
    public void dumpingExtraPidsStarted() {}
    public void dumpingExtraPidsEnded() {}
    public void waitingOnGlobalLockStarted() {}
    public void waitingOnGlobalLockEnded() {}
    public void waitingOnPidLockStarted() {}
    public void waitingOnPidLockEnded() {}
    public void waitingOnAMSLockStarted() {}
    public void waitingOnAMSLockEnded() {}
    public void waitingOnProcLockStarted() {}
    public void waitingOnProcLockEnded() {}
    public void waitingOnAnrRecordLockStarted() {}
    public void waitingOnAnrRecordLockEnded() {}
    public void anrRecordsQueueSizeWhenPopped(int p0) {}
    public void preDumpIfLockTooSlowStarted() {}
    public void preDumpIfLockTooSlowEnded() {}
    public void anrSkippedProcessErrorStateRecordAppNotResponding() {}
    public void anrSkippedDumpStackTraces() {}
    public void notifyAppUnresponsiveStarted() {}
    public void notifyAppUnresponsiveEnded() {}
    public void notifyWindowUnresponsiveStarted() {}
    public void notifyWindowUnresponsiveEnded() {}
    public java.lang.String dumpAsCommaSeparatedArrayWithHeader() { return null; }
    public void close() {}
    public long getUptimeMillis() { return 0L; }
    public void pushAtom() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface EarlyDumpStatus {
        public static final int UNKNOWN = 1;
        public static final int SUCCEEDED = 2;
        public static final int FAILED_TO_CREATE_FILE = 3;
        public static final int TIMED_OUT = 4;
    }
}
