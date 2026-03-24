package android.tracing.perfetto;

public interface TraceFunction<DataSourceInstanceType extends android.tracing.perfetto.DataSourceInstance, TlsStateType extends java.lang.Object, IncrementalStateType extends java.lang.Object> {
    public void trace(android.tracing.perfetto.TracingContext<DataSourceInstanceType, TlsStateType, IncrementalStateType> p0);
}
