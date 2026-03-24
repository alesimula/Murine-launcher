package android.filterfw.core;

public class FilterFactory {
    private static android.filterfw.core.FilterFactory mSharedFactory;
    private java.util.HashSet<java.lang.String> mPackages;
    private static java.lang.ClassLoader mCurrentClassLoader;
    private static java.util.HashSet<java.lang.String> mLibraries;
    private static java.lang.Object mClassLoaderGuard;
    private static final java.lang.String TAG = "FilterFactory";
    private static boolean mLogVerbose;
    public FilterFactory() {}
    public static android.filterfw.core.FilterFactory sharedFactory() { return null; }
    public static void addFilterLibrary(java.lang.String p0) {}
    public void addPackage(java.lang.String p0) {}
    public android.filterfw.core.Filter createFilterByClassName(java.lang.String p0, java.lang.String p1) { return null; }
    public android.filterfw.core.Filter createFilterByClass(java.lang.Class p0, java.lang.String p1) { return null; }
}
