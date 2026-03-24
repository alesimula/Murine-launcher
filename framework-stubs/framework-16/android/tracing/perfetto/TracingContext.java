package android.tracing.perfetto;

public class TracingContext<DataSourceInstanceType extends android.tracing.perfetto.DataSourceInstance, TlsStateType extends java.lang.Object, IncrementalStateType extends java.lang.Object> {
    TracingContext(android.tracing.perfetto.DataSource<DataSourceInstanceType, TlsStateType, IncrementalStateType> p0, int p1) {}
    public android.util.proto.ProtoOutputStream newTracePacket() { return null; }
    public android.util.proto.ProtoOutputStream newTracePacket(int p0) { return null; }
    public int getInstanceIndex() { return 0; }
    public TlsStateType getCustomTlsState() { return null; }
    public IncrementalStateType getIncrementalState() { return null; }
    public void stopDone() {}
    public DataSourceInstanceType getDataSourceInstanceLocked() { return null; }
    protected byte[][] getAndClearAllPendingTracePackets() { return null; }
}
