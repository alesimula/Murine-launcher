package android.util;

public class PathParser {
    static final java.lang.String LOGTAG = null;
    public PathParser() {}
    public static android.graphics.Path createPathFromPathData(java.lang.String p0) { return null; }
    public static void createPathFromPathData(android.graphics.Path p0, android.util.PathParser.PathData p1) {}
    public static boolean canMorph(android.util.PathParser.PathData p0, android.util.PathParser.PathData p1) { return false; }
    public static boolean interpolatePathData(android.util.PathParser.PathData p0, android.util.PathParser.PathData p1, android.util.PathParser.PathData p2, float p3) { return false; }

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
