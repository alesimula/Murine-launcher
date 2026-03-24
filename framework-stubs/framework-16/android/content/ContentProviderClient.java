package android.content;

public class ContentProviderClient implements android.content.ContentInterface, java.lang.AutoCloseable {
    public ContentProviderClient(android.content.ContentResolver p0, android.content.IContentProvider p1, boolean p2) {}
    public ContentProviderClient(android.content.ContentResolver p0, android.content.IContentProvider p1, java.lang.String p2, boolean p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.REMOVE_TASKS")
    public void setDetectNotResponding(long p0) {}
    @android.annotation.Nullable
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws android.os.RemoteException { return null; }
    @android.annotation.Nullable
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5) throws android.os.RemoteException { return null; }
    @android.annotation.Nullable
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException { return null; }
    @android.annotation.Nullable
    public java.lang.String getType(android.net.Uri p0) throws android.os.RemoteException { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    @android.annotation.Nullable
    public final android.net.Uri canonicalize(android.net.Uri p0) throws android.os.RemoteException { return null; }
    @android.annotation.Nullable
    public final android.net.Uri uncanonicalize(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public boolean refresh(android.net.Uri p0, android.os.Bundle p1, android.os.CancellationSignal p2) throws android.os.RemoteException { return false; }
    public int checkUriPermission(android.net.Uri p0, int p1, int p2) throws android.os.RemoteException { return 0; }
    @android.annotation.Nullable
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) throws android.os.RemoteException { return null; }
    @android.annotation.Nullable
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) throws android.os.RemoteException { return null; }
    public int bulkInsert(android.net.Uri p0, android.content.ContentValues[] p1) throws android.os.RemoteException { return 0; }
    public int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException { return 0; }
    public int delete(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
    public int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
    public int update(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) throws android.os.RemoteException { return 0; }
    @android.annotation.Nullable
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    @android.annotation.Nullable
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    @android.annotation.Nullable
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    @android.annotation.Nullable
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    @android.annotation.Nullable
    public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    @android.annotation.Nullable
    public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    @android.annotation.Nullable
    public final android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    @android.annotation.NonNull
    public android.content.ContentProviderResult[] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> p0) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    @android.annotation.NonNull
    public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.util.ArrayList<android.content.ContentProviderOperation> p1) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    @android.annotation.Nullable
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return null; }
    @android.annotation.Nullable
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
    public void close() {}
    @java.lang.Deprecated
    public boolean release() { return false; }
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.Nullable
    public android.content.ContentProvider getLocalContentProvider() { return null; }
    @java.lang.Deprecated
    public static void closeQuietly(android.content.ContentProviderClient p0) {}
    @java.lang.Deprecated
    public static void releaseQuietly(android.content.ContentProviderClient p0) {}

    private final class CursorWrapperInner extends android.database.CrossProcessCursorWrapper {
        CursorWrapperInner(android.content.ContentProviderClient p0, android.database.Cursor p1) { super(null); }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    private class NotRespondingRunnable implements java.lang.Runnable {
        public void run() {}
    }
}
