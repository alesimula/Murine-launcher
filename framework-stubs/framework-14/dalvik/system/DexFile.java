package dalvik.system;

public final class DexFile {
    @java.lang.Deprecated
    public DexFile(java.io.File p0) throws java.io.IOException {}
    @java.lang.Deprecated
    public DexFile(java.lang.String p0) throws java.io.IOException {}
    @java.lang.Deprecated
    public static dalvik.system.DexFile loadDex(java.lang.String p0, java.lang.String p1, int p2) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public java.lang.String getName() { return null; }
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    public void close() throws java.io.IOException {}
    @java.lang.Deprecated
    public java.lang.Class loadClass(java.lang.String p0, java.lang.ClassLoader p1) { return null; }
    @java.lang.Deprecated
    public java.util.Enumeration<java.lang.String> entries() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    @java.lang.Deprecated
    public static native boolean isDexOptNeeded(java.lang.String p0) throws java.io.FileNotFoundException, java.io.IOException;

    public static final class OptimizationInfo {
        OptimizationInfo() {}
        public boolean isVerified() { return false; }
        public boolean isOptimized() { return false; }
        public boolean isFullyCompiled() { return false; }
    }
}
