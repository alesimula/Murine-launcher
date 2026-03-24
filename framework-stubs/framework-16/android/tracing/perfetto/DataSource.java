package android.tracing.perfetto;

public abstract class DataSource<DataSourceInstanceType extends android.tracing.perfetto.DataSourceInstance, TlsStateType extends java.lang.Object, IncrementalStateType extends java.lang.Object> {
    protected final long mNativeObj = 0L;
    public final java.lang.String name = null;
    @android.annotation.NonNull
    public abstract DataSourceInstanceType createInstance(android.util.proto.ProtoInputStream p0, int p1);
    public DataSource(java.lang.String p0) {}
    public final void trace(android.tracing.perfetto.TraceFunction<DataSourceInstanceType, TlsStateType, IncrementalStateType> p0) {}
    public final void flush() {}
    @android.annotation.Nullable
    public TlsStateType createTlsState(android.tracing.perfetto.CreateTlsStateArgs<DataSourceInstanceType> p0) { return null; }
    @android.annotation.Nullable
    public IncrementalStateType createIncrementalState(android.tracing.perfetto.CreateIncrementalStateArgs<DataSourceInstanceType> p0) { return null; }
    public void register(android.tracing.perfetto.DataSourceParams p0) {}
    @android.annotation.Nullable
    public DataSourceInstanceType getDataSourceInstanceLocked(int p0) { return null; }
    protected void releaseDataSourceInstance(int p0) {}
    protected void stopDoneDataSourceInstance(int p0) {}
}
