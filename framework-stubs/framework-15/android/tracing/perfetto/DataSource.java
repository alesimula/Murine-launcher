package android.tracing.perfetto;

public abstract class DataSource<DataSourceInstanceType extends android.tracing.perfetto.DataSourceInstance, TlsStateType extends java.lang.Object, IncrementalStateType extends java.lang.Object> {
    protected final long mNativeObj = 0L;
    public final java.lang.String name = null;
    public abstract DataSourceInstanceType createInstance(android.util.proto.ProtoInputStream p0, int p1);
    public DataSource(java.lang.String p0) {}
    public final void trace(android.tracing.perfetto.TraceFunction<DataSourceInstanceType, TlsStateType, IncrementalStateType> p0) {}
    public final void flush() {}
    public TlsStateType createTlsState(android.tracing.perfetto.CreateTlsStateArgs<DataSourceInstanceType> p0) { return null; }
    public IncrementalStateType createIncrementalState(android.tracing.perfetto.CreateIncrementalStateArgs<DataSourceInstanceType> p0) { return null; }
    public void register(android.tracing.perfetto.DataSourceParams p0) {}
    public DataSourceInstanceType getDataSourceInstanceLocked(int p0) { return null; }
    protected void releaseDataSourceInstance(int p0) {}
}
