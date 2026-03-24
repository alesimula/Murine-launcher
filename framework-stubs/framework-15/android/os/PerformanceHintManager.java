package android.os;

public final class PerformanceHintManager {
    public static android.os.PerformanceHintManager create() throws android.os.ServiceManager.ServiceNotFoundException { return null; }
    public long getPreferredUpdateRateNanos() { return 0L; }
    @android.annotation.Nullable
    public android.os.PerformanceHintManager.Session createHintSession(int[] p0, long p1) { return null; }

    public static class Session implements java.io.Closeable {
        public static final int CPU_LOAD_UP = 0;
        public static final int CPU_LOAD_DOWN = 1;
        public static final int CPU_LOAD_RESET = 2;
        public static final int CPU_LOAD_RESUME = 3;
        @android.annotation.FlaggedApi("android.os.adpf_gpu_report_actual_work_duration")
        public static final int GPU_LOAD_UP = 5;
        @android.annotation.FlaggedApi("android.os.adpf_gpu_report_actual_work_duration")
        public static final int GPU_LOAD_DOWN = 6;
        @android.annotation.FlaggedApi("android.os.adpf_gpu_report_actual_work_duration")
        public static final int GPU_LOAD_RESET = 7;
        public Session(long p0) {}
        protected void finalize() throws java.lang.Throwable {}
        public void updateTargetWorkDuration(long p0) {}
        public void reportActualWorkDuration(long p0) {}
        public void close() {}
        public void sendHint(int p0) {}
        @android.annotation.FlaggedApi("android.os.adpf_prefer_power_efficiency")
        public void setPreferPowerEfficiency(boolean p0) {}
        public void setThreads(int[] p0) {}
        @android.annotation.Nullable
        public int[] getThreadIds() { return null; }
        @android.annotation.FlaggedApi("android.os.adpf_gpu_report_actual_work_duration")
        public void reportActualWorkDuration(android.os.WorkDuration p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Hint {
        }
    }
}
