package com.android.internal.os;

public class ClassLoaderFactory {
    private static final java.lang.String PATH_CLASS_LOADER_NAME = null;
    private static final java.lang.String DEX_CLASS_LOADER_NAME = null;
    private static final java.lang.String DELEGATE_LAST_CLASS_LOADER_NAME = null;
    private ClassLoaderFactory() {}
    public static java.lang.String getPathClassLoaderName() { return null; }
    public static boolean isValidClassLoaderName(java.lang.String p0) { return false; }
    public static boolean isPathClassLoaderName(java.lang.String p0) { return false; }
    public static boolean isDelegateLastClassLoaderName(java.lang.String p0) { return false; }
    public static java.lang.ClassLoader createClassLoader(java.lang.String p0, java.lang.String p1, java.lang.ClassLoader p2, java.lang.String p3, java.util.List<java.lang.ClassLoader> p4) { return null; }
    public static java.lang.ClassLoader createClassLoader(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.ClassLoader p3, int p4, boolean p5, java.lang.String p6) { return null; }
    public static java.lang.ClassLoader createClassLoader(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.ClassLoader p3, int p4, boolean p5, java.lang.String p6, java.util.List<java.lang.ClassLoader> p7) { return null; }
    private static native java.lang.String createClassloaderNamespace(java.lang.ClassLoader p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5);
}
