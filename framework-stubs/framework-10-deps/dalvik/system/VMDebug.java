package dalvik.system;

public class VMDebug {
    public VMDebug() {}
    public long[] countInstancesOfClasses(java.lang.Class[] p0, boolean p1) { return null; }
    public long countInstancesOfClass(java.lang.Class p0, boolean p1) { return 0L; }
    public boolean isDebuggingEnabled() { return false; }
    public long lastDebuggerActivity() { return 0L; }
    public boolean isDebuggerConnected() { return false; }
    public java.lang.String[] getVmFeatureList() { return null; }
    public void startEmulatorTracing() {}
    public void stopEmulatorTracing() {}
    public void startMethodTracing(java.lang.String p0, int p1, int p2, boolean p3, int p4) {}
    public void startMethodTracing(java.lang.String p0, java.io.FileDescriptor p1, int p2, int p3, boolean p4, int p5, boolean p6) {}
    public void startMethodTracingDdms(int p0, int p1, boolean p2, int p3) {}
    public int getMethodTracingMode() { return 0; }
    public void stopMethodTracing() {}
    public long threadCpuTimeNanos() { return 0L; }
    public void startAllocCounting() {}
    public void stopAllocCounting() {}
    public int getAllocCount(int p0) { return 0; }
    public void resetAllocCount(int p0) {}
    public java.lang.String getRuntimeStat(java.lang.String p0) { return null; }
    public java.util.Map getRuntimeStats() { return null; }
    public void printLoadedClasses(int p0) {}
    public int getLoadedClassCount() { return 0; }
    public void dumpHprofData(java.lang.String p0) {}
    public void dumpHprofData(java.lang.String p0, java.io.FileDescriptor p1) {}
    public void dumpHprofDataDdms() {}
    public boolean cacheRegisterMap(java.lang.String p0) { return false; }
    public void dumpReferenceTables() {}
    public void attachAgent(java.lang.String p0, java.lang.ClassLoader p1) {}
    public void setAllocTrackerStackDepth(int p0) {}
}
