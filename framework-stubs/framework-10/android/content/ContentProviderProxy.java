package android.content;

final class ContentProviderProxy implements android.content.IContentProvider {
    @android.annotation.UnsupportedAppUsage
    private android.os.IBinder mRemote;
    public ContentProviderProxy(android.os.IBinder p0) {}
    public android.os.IBinder asBinder() { return null; }
    public android.database.Cursor query(java.lang.String p0, android.net.Uri p1, java.lang.String[] p2, android.os.Bundle p3, android.os.ICancellationSignal p4) throws android.os.RemoteException { return null; }
    public java.lang.String getType(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public android.net.Uri insert(java.lang.String p0, android.net.Uri p1, android.content.ContentValues p2) throws android.os.RemoteException { return null; }
    public int bulkInsert(java.lang.String p0, android.net.Uri p1, android.content.ContentValues[] p2) throws android.os.RemoteException { return 0; }
    public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.lang.String p1, java.util.ArrayList<android.content.ContentProviderOperation> p2) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    public int delete(java.lang.String p0, android.net.Uri p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
    public int update(java.lang.String p0, android.net.Uri p1, android.content.ContentValues p2, java.lang.String p3, java.lang.String[] p4) throws android.os.RemoteException { return 0; }
    public android.os.ParcelFileDescriptor openFile(java.lang.String p0, android.net.Uri p1, java.lang.String p2, android.os.ICancellationSignal p3, android.os.IBinder p4) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openAssetFile(java.lang.String p0, android.net.Uri p1, java.lang.String p2, android.os.ICancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    public android.content.res.AssetFileDescriptor openTypedAssetFile(java.lang.String p0, android.net.Uri p1, java.lang.String p2, android.os.Bundle p3, android.os.ICancellationSignal p4) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.os.ICancellationSignal createCancellationSignal() throws android.os.RemoteException { return null; }
    public android.net.Uri canonicalize(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException { return null; }
    public android.net.Uri uncanonicalize(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException { return null; }
    public boolean refresh(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2, android.os.ICancellationSignal p3) throws android.os.RemoteException { return false; }
}
