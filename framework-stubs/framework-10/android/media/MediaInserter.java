package android.media;

public class MediaInserter {
    private final java.util.HashMap<android.net.Uri, java.util.List<android.content.ContentValues>> mRowMap = null;
    private final java.util.HashMap<android.net.Uri, java.util.List<android.content.ContentValues>> mPriorityRowMap = null;
    private final android.content.ContentProviderClient mProvider = null;
    private final int mBufferSizePerUri = 0;
    public MediaInserter(android.content.ContentProviderClient p0, int p1) {}
    public void insert(android.net.Uri p0, android.content.ContentValues p1) throws android.os.RemoteException {}
    public void insertwithPriority(android.net.Uri p0, android.content.ContentValues p1) throws android.os.RemoteException {}
    private void insert(android.net.Uri p0, android.content.ContentValues p1, boolean p2) throws android.os.RemoteException {}
    @android.annotation.UnsupportedAppUsage
    public void flushAll() throws android.os.RemoteException {}
    private void flushAllPriority() throws android.os.RemoteException {}
    private void flush(android.net.Uri p0, java.util.List<android.content.ContentValues> p1) throws android.os.RemoteException {}
}
