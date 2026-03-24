package android.util;

public class PathParser {
    static final java.lang.String LOGTAG = null;
    public PathParser() {}
    @android.annotation.UnsupportedAppUsage
    public static android.graphics.Path createPathFromPathData(java.lang.String p0) { return null; }
    public static void createPathFromPathData(android.graphics.Path p0, android.util.PathParser.PathData p1) {}
    public static boolean canMorph(android.util.PathParser.PathData p0, android.util.PathParser.PathData p1) { return false; }
    public static boolean interpolatePathData(android.util.PathParser.PathData p0, android.util.PathParser.PathData p1, android.util.PathParser.PathData p2, float p3) { return false; }
    private static native void nParseStringForPath(long p0, java.lang.String p1, int p2);
    private static native long nCreatePathDataFromString(java.lang.String p0, int p1);
    private static native void nCreatePathFromPathData(long p0, long p1);
    private static native long nCreateEmptyPathData();
    private static native long nCreatePathData(long p0);
    private static native boolean nInterpolatePathData(long p0, long p1, long p2, float p3);
    private static native void nFinalize(long p0);
    private static native boolean nCanMorph(long p0, long p1);
    private static native void nSetPathData(long p0, long p1);

    public static class PathData {
        long mNativePathData;
        public PathData() {}
        public PathData(android.util.PathParser.PathData p0) {}
        public PathData(java.lang.String p0) {}
        public long getNativePtr() { return 0L; }
        public void setPathData(android.util.PathParser.PathData p0) {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
