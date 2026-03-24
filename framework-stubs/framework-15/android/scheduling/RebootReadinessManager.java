package android.scheduling;

public final class RebootReadinessManager {
    public static final java.lang.String ACTION_REBOOT_READY = "android.scheduling.action.REBOOT_READY";
    public static final java.lang.String EXTRA_IS_READY_TO_REBOOT = "android.scheduling.extra.IS_READY_TO_REBOOT";
    RebootReadinessManager() {}
    public void addRequestRebootReadinessStatusListener(java.util.concurrent.Executor p0, android.scheduling.RebootReadinessManager.RequestRebootReadinessStatusListener p1) {}
    public void cancelPendingReboot() {}
    public boolean isReadyToReboot() { return false; }
    public void markRebootPending() {}
    public void removeRequestRebootReadinessStatusListener(android.scheduling.RebootReadinessManager.RequestRebootReadinessStatusListener p0) {}

    public static final class RebootReadinessStatus {
        public RebootReadinessStatus(boolean p0, long p1, java.lang.String p2) {}
        public long getEstimatedFinishTime() { return 0L; }
        @android.annotation.NonNull
        public java.lang.String getLogSubsystemName() { return null; }
        public boolean isReadyToReboot() { return false; }
    }

    public static interface RequestRebootReadinessStatusListener {
        @android.annotation.NonNull
        public android.scheduling.RebootReadinessManager.RebootReadinessStatus onRequestRebootReadinessStatus();
    }
}
