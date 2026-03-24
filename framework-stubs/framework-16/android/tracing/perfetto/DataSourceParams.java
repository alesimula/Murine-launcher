package android.tracing.perfetto;

public class DataSourceParams {
    public static final int PERFETTO_DS_BUFFER_EXHAUSTED_POLICY_DROP = 0;
    public static final int PERFETTO_DS_BUFFER_EXHAUSTED_POLICY_STALL_AND_ABORT = 1;
    public static final int PERFETTO_DS_BUFFER_EXHAUSTED_POLICY_STALL_AND_DROP = 2;
    public static android.tracing.perfetto.DataSourceParams DEFAULTS;
    public final int bufferExhaustedPolicy = 0;
    public final boolean willNotifyOnStop = false;
    public final boolean noFlush = false;
    public final boolean postponeStop = false;

    public static final class Builder {
        public Builder() {}
        public android.tracing.perfetto.DataSourceParams.Builder setBufferExhaustedPolicy(int p0) { return null; }
        public android.tracing.perfetto.DataSourceParams.Builder setWillNotifyOnStop(boolean p0) { return null; }
        public android.tracing.perfetto.DataSourceParams.Builder setNoFlush(boolean p0) { return null; }
        public android.tracing.perfetto.DataSourceParams.Builder setPostponeStop(boolean p0) { return null; }
        public android.tracing.perfetto.DataSourceParams build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PerfettoDsBufferExhausted {
    }
}
