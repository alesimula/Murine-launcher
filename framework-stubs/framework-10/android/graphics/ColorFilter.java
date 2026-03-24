package android.graphics;

public class ColorFilter {
    private long mNativeInstance;
    private java.lang.Runnable mCleaner;
    @java.lang.Deprecated
    public ColorFilter() {}
    long createNativeInstance() { return 0L; }
    void discardNativeInstance() {}
    public long getNativeInstance() { return 0L; }
    private static native long nativeGetFinalizer();

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }
}
