package android.renderscript;

public class FileA3D extends android.renderscript.BaseObj {
    android.renderscript.FileA3D.IndexEntry[] mFileEntries;
    java.io.InputStream mInputStream;
    FileA3D(long p0, android.renderscript.RenderScript p1, java.io.InputStream p2) { super(0L, null); }
    private void initEntries() {}
    public int getIndexEntryCount() { return 0; }
    public android.renderscript.FileA3D.IndexEntry getIndexEntry(int p0) { return null; }
    public static android.renderscript.FileA3D createFromAsset(android.renderscript.RenderScript p0, android.content.res.AssetManager p1, java.lang.String p2) { return null; }
    public static android.renderscript.FileA3D createFromFile(android.renderscript.RenderScript p0, java.lang.String p1) { return null; }
    public static android.renderscript.FileA3D createFromFile(android.renderscript.RenderScript p0, java.io.File p1) { return null; }
    public static android.renderscript.FileA3D createFromResource(android.renderscript.RenderScript p0, android.content.res.Resources p1, int p2) { return null; }

    public static enum EntryType {
        UNKNOWN,
        MESH;
        int mID;
        private EntryType() {}
        static android.renderscript.FileA3D.EntryType toEntryType(int p0) { return null; }
    }

    public static class IndexEntry {
        android.renderscript.RenderScript mRS;
        int mIndex;
        long mID;
        java.lang.String mName;
        android.renderscript.FileA3D.EntryType mEntryType;
        android.renderscript.BaseObj mLoadedObj;
        public java.lang.String getName() { return null; }
        public android.renderscript.FileA3D.EntryType getEntryType() { return null; }
        public android.renderscript.BaseObj getObject() { return null; }
        public android.renderscript.Mesh getMesh() { return null; }
        static synchronized android.renderscript.BaseObj internalCreate(android.renderscript.RenderScript p0, android.renderscript.FileA3D.IndexEntry p1) { return null; }
        IndexEntry(android.renderscript.RenderScript p0, int p1, long p2, java.lang.String p3, android.renderscript.FileA3D.EntryType p4) {}
    }
}
