package android.content;

public class LoggingContentInterface implements android.content.ContentInterface {
    private final java.lang.String tag = null;
    private final android.content.ContentInterface delegate = null;
    public LoggingContentInterface(java.lang.String p0, android.content.ContentInterface p1) {}
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException { return null; }
    public java.lang.String getType(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    public android.net.Uri canonicalize(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public android.net.Uri uncanonicalize(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public boolean refresh(android.net.Uri p0, android.os.Bundle p1, android.os.CancellationSignal p2) throws android.os.RemoteException { return false; }
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) throws android.os.RemoteException { return null; }
    public int bulkInsert(android.net.Uri p0, android.content.ContentValues[] p1) throws android.os.RemoteException { return 0; }
    public int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException { return 0; }
    public int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.util.ArrayList<android.content.ContentProviderOperation> p1) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }

    private class Logger implements java.lang.AutoCloseable {
        private final java.lang.StringBuilder sb = null;
        public Logger(android.content.LoggingContentInterface p0, java.lang.String p1, java.lang.Object... p2) {}
        private java.lang.String deepToString(java.lang.Object p0) { return null; }
        public <T extends java.lang.Object> T setResult(T p0) { return null; }
        public void close() {}
    }
}
