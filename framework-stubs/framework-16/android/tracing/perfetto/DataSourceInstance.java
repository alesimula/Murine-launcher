package android.tracing.perfetto;

public abstract class DataSourceInstance implements java.lang.AutoCloseable {
    public DataSourceInstance(android.tracing.perfetto.DataSource p0, int p1) {}
    protected void onStart(android.tracing.perfetto.StartCallbackArguments p0) {}
    protected void onFlush(android.tracing.perfetto.FlushCallbackArguments p0) {}
    protected void onStop(android.tracing.perfetto.StopCallbackArguments p0) {}
    public void stopDone() {}
    public final void close() {}
    public void release() {}
    public final int getInstanceIndex() { return 0; }
}
