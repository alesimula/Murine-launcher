package android.os;

@android.annotation.FlaggedApi("android.os.profiling.system_triggered_profiling_new")
public final class ProfilingTrigger {
    public static final int TRIGGER_TYPE_ANR = 2;
    public static final int TRIGGER_TYPE_APP_FULLY_DRAWN = 1;
    @android.annotation.FlaggedApi("android.os.profiling.profiling_25q4")
    public static final int TRIGGER_TYPE_APP_REQUEST_RUNNING_TRACE = 3;
    @android.annotation.FlaggedApi("android.os.profiling.profiling_25q4")
    public static final int TRIGGER_TYPE_KILL_FORCE_STOP = 4;
    @android.annotation.FlaggedApi("android.os.profiling.profiling_trigger_kill_recents")
    public static final int TRIGGER_TYPE_KILL_RECENTS = 5;
    @android.annotation.FlaggedApi("android.os.profiling.profiling_25q4")
    public static final int TRIGGER_TYPE_KILL_TASK_MANAGER = 6;
    public static final int TRIGGER_TYPE_NONE = 0;
    ProfilingTrigger() {}
    public int getRateLimitingPeriodHours() { return 0; }
    public int getTriggerType() { return 0; }

    @android.annotation.FlaggedApi("android.os.profiling.system_triggered_profiling_new")
    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.os.ProfilingTrigger build() { return null; }
        @android.annotation.NonNull
        public android.os.ProfilingTrigger.Builder setRateLimitingPeriodHours(int p0) { return null; }
    }
}
