package android.media;

@java.lang.Deprecated
public class MediaScanner implements java.lang.AutoCloseable {
    @java.lang.Deprecated
    public MediaScanner(android.content.Context p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public android.net.Uri scanSingleFile(java.lang.String p0, java.lang.String p1) { return null; }
    @java.lang.Deprecated
    public static boolean isNoMediaPath(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    android.media.MediaScanner.FileEntry makeEntryFor(java.lang.String p0) { return null; }
    public void close() {}

    private static class FileEntry {
        @java.lang.Deprecated
        long mRowId;
        @java.lang.Deprecated
        boolean mLastModifiedChanged;
        @java.lang.Deprecated
        FileEntry(long p0, java.lang.String p1, long p2, int p3) {}
    }

    private class MyMediaScannerClient implements android.media.MediaScannerClient {
        public MyMediaScannerClient(android.media.MediaScanner p0) {}
        @java.lang.Deprecated
        public android.media.MediaScanner.FileEntry beginFile(java.lang.String p0, java.lang.String p1, long p2, long p3, boolean p4, boolean p5) { return null; }
        @java.lang.Deprecated
        public void scanFile(java.lang.String p0, long p1, long p2, boolean p3, boolean p4) {}
        @java.lang.Deprecated
        public android.net.Uri doScanFile(java.lang.String p0, java.lang.String p1, long p2, long p3, boolean p4, boolean p5, boolean p6) { return null; }
        @java.lang.Deprecated
        public void handleStringTag(java.lang.String p0, java.lang.String p1) {}
        @java.lang.Deprecated
        public void setMimeType(java.lang.String p0) {}
    }
}
