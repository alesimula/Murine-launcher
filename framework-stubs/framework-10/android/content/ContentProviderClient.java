package android.content;

public class ContentProviderClient implements android.content.ContentInterface, java.lang.AutoCloseable {
    private static final java.lang.String TAG = "ContentProviderClient";
    private static android.os.Handler sAnrHandler;
    private final android.content.ContentResolver mContentResolver = null;
    @android.annotation.UnsupportedAppUsage
    private final android.content.IContentProvider mContentProvider = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private final java.lang.String mPackageName = null;
    private final java.lang.String mAuthority = null;
    private final boolean mStable = false;
    private final java.util.concurrent.atomic.AtomicBoolean mClosed = null;
    private long mAnrTimeout;
    private android.content.ContentProviderClient.NotRespondingRunnable mAnrRunnable;
    public ContentProviderClient(android.content.ContentResolver p0, android.content.IContentProvider p1, boolean p2) {}
    public ContentProviderClient(android.content.ContentResolver p0, android.content.IContentProvider p1, java.lang.String p2, boolean p3) {}
    @android.annotation.SystemApi
    public void setDetectNotResponding(long p0) {}
    private void beforeRemote() {}
    private void afterRemote() {}
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws android.os.RemoteException { return null; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5) throws android.os.RemoteException { return null; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException { return null; }
    public java.lang.String getType(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    public final android.net.Uri canonicalize(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public final android.net.Uri uncanonicalize(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public boolean refresh(android.net.Uri p0, android.os.Bundle p1, android.os.CancellationSignal p2) throws android.os.RemoteException { return false; }
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) throws android.os.RemoteException { return null; }
    public int bulkInsert(android.net.Uri p0, android.content.ContentValues[] p1) throws android.os.RemoteException { return 0; }
    public int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException { return 0; }
    public int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.content.ContentProviderResult[] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> p0) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.util.ArrayList<android.content.ContentProviderOperation> p1) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return null; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
    public void close() {}
    @java.lang.Deprecated
    public boolean release() { return false; }
    private boolean closeInternal() { return false; }
    protected void finalize() throws java.lang.Throwable {}
    public android.content.ContentProvider getLocalContentProvider() { return null; }
    @java.lang.Deprecated
    public static void closeQuietly(android.content.ContentProviderClient p0) {}
    @java.lang.Deprecated
    public static void releaseQuietly(android.content.ContentProviderClient p0) {}

    private class NotRespondingRunnable implements java.lang.Runnable {
        private NotRespondingRunnable(android.content.ContentProviderClient p0) {}
        public void run() {}
    }

    private final class CursorWrapperInner extends android.database.CrossProcessCursorWrapper {
        CursorWrapperInner(android.content.ContentProviderClient p0, android.database.Cursor p1) { super(null); }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
