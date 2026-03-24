package android.app;

class DexLoadReporter {
    private static final java.lang.String TAG = "DexLoadReporter";
    private static final android.app.DexLoadReporter INSTANCE = null;
    private static final boolean DEBUG = false;
    private final java.util.Set<java.lang.String> mDataDirs = null;
    private DexLoadReporter() {}
    static android.app.DexLoadReporter getInstance() { return null; }
    void registerAppDataDir(java.lang.String p0, java.lang.String p1) {}
    public void report(java.util.List<java.lang.ClassLoader> p0, java.util.List<java.lang.String> p1) {}
    private void notifyPackageManager(java.util.List<java.lang.ClassLoader> p0, java.util.List<java.lang.String> p1) {}
    private void registerSecondaryDexForProfiling(java.lang.String[] p0) {}
    private void registerSecondaryDexForProfiling(java.lang.String p0, java.lang.String[] p1) {}
    private boolean isSecondaryDexFile(java.lang.String p0, java.lang.String[] p1) { return false; }
}
