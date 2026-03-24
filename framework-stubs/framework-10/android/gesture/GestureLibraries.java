package android.gesture;

public final class GestureLibraries {
    private GestureLibraries() {}
    public static android.gesture.GestureLibrary fromFile(java.lang.String p0) { return null; }
    public static android.gesture.GestureLibrary fromFile(java.io.File p0) { return null; }
    public static android.gesture.GestureLibrary fromPrivateFile(android.content.Context p0, java.lang.String p1) { return null; }
    public static android.gesture.GestureLibrary fromRawResource(android.content.Context p0, int p1) { return null; }

    private static class ResourceGestureLibrary extends android.gesture.GestureLibrary {
        private final java.lang.ref.WeakReference<android.content.Context> mContext = null;
        private final int mResourceId = 0;
        public ResourceGestureLibrary(android.content.Context p0, int p1) { super(); }
        public boolean isReadOnly() { return false; }
        public boolean save() { return false; }
        public boolean load() { return false; }
    }

    private static class FileGestureLibrary extends android.gesture.GestureLibrary {
        private final java.io.File mPath = null;
        public FileGestureLibrary(java.io.File p0) { super(); }
        public boolean isReadOnly() { return false; }
        public boolean save() { return false; }
        public boolean load() { return false; }
    }
}
