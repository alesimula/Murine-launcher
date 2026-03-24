package android.app.appsearch;

public class PropertyPath implements java.lang.Iterable<android.app.appsearch.PropertyPath.PathSegment> {
    public PropertyPath(java.lang.String p0) {}
    public PropertyPath(java.util.List<android.app.appsearch.PropertyPath.PathSegment> p0) {}
    @android.annotation.NonNull
    public android.app.appsearch.PropertyPath.PathSegment get(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.Iterator<android.app.appsearch.PropertyPath.PathSegment> iterator() { return null; }
    public int size() { return 0; }

    public static class PathSegment {
        public static final int NON_REPEATED_CARDINALITY = -1;
        PathSegment() {}
        @android.annotation.NonNull
        public static android.app.appsearch.PropertyPath.PathSegment create(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public static android.app.appsearch.PropertyPath.PathSegment create(java.lang.String p0, int p1) { return null; }
        public int getPropertyIndex() { return 0; }
        @android.annotation.NonNull
        public java.lang.String getPropertyName() { return null; }
    }
}
