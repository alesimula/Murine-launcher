package android.os;

@android.annotation.FlaggedApi("android.os.profiling.telemetry_apis")
public final class ProfilingManager {
    public static final int PROFILING_TYPE_HEAP_PROFILE = 2;
    public static final int PROFILING_TYPE_JAVA_HEAP_DUMP = 1;
    public static final int PROFILING_TYPE_STACK_SAMPLING = 3;
    public static final int PROFILING_TYPE_SYSTEM_TRACE = 4;
    ProfilingManager() {}
    public void requestProfiling(int p0, android.os.Bundle p1, java.lang.String p2, android.os.CancellationSignal p3, java.util.concurrent.Executor p4, java.util.function.Consumer<android.os.ProfilingResult> p5) {}
    public void registerForAllProfilingResults(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.ProfilingResult> p1) {}
    public void unregisterForAllProfilingResults(java.util.function.Consumer<android.os.ProfilingResult> p0) {}
}
