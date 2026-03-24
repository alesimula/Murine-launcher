package android.content;

final class ContentProviderProxy implements android.content.IContentProvider {
    private android.os.IBinder mRemote;
    public ContentProviderProxy(android.os.IBinder p0) {}
    public android.os.IBinder asBinder() { return null; }
    public android.database.Cursor query(android.content.AttributionSource p0, android.net.Uri p1, java.lang.String[] p2, android.os.Bundle p3, android.os.ICancellationSignal p4) throws android.os.RemoteException { return null; }
    public java.lang.String getType(android.net.Uri p0) throws android.os.RemoteException { return null; }
    public void getTypeAsync(android.net.Uri p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
    public android.net.Uri insert(android.content.AttributionSource p0, android.net.Uri p1, android.content.ContentValues p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
    public int bulkInsert(android.content.AttributionSource p0, android.net.Uri p1, android.content.ContentValues[] p2) throws android.os.RemoteException { return 0; }
    public android.content.ContentProviderResult[] applyBatch(android.content.AttributionSource p0, java.lang.String p1, java.util.ArrayList<android.content.ContentProviderOperation> p2) throws android.os.RemoteException, android.content.OperationApplicationException { return null; }
    public int delete(android.content.AttributionSource p0, android.net.Uri p1, android.os.Bundle p2) throws android.os.RemoteException { return 0; }
    public int update(android.content.AttributionSource p0, android.net.Uri p1, android.content.ContentValues p2, android.os.Bundle p3) throws android.os.RemoteException { return 0; }
    public android.os.ParcelFileDescriptor openFile(android.content.AttributionSource p0, android.net.Uri p1, java.lang.String p2, android.os.ICancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openAssetFile(android.content.AttributionSource p0, android.net.Uri p1, java.lang.String p2, android.os.ICancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.os.Bundle call(android.content.AttributionSource p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    public android.content.res.AssetFileDescriptor openTypedAssetFile(android.content.AttributionSource p0, android.net.Uri p1, java.lang.String p2, android.os.Bundle p3, android.os.ICancellationSignal p4) throws android.os.RemoteException, java.io.FileNotFoundException { return null; }
    public android.os.ICancellationSignal createCancellationSignal() throws android.os.RemoteException { return null; }
    public android.net.Uri canonicalize(android.content.AttributionSource p0, android.net.Uri p1) throws android.os.RemoteException { return null; }
    public void canonicalizeAsync(android.content.AttributionSource p0, android.net.Uri p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
    public android.net.Uri uncanonicalize(android.content.AttributionSource p0, android.net.Uri p1) throws android.os.RemoteException { return null; }
    public void uncanonicalizeAsync(android.content.AttributionSource p0, android.net.Uri p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
    public boolean refresh(android.content.AttributionSource p0, android.net.Uri p1, android.os.Bundle p2, android.os.ICancellationSignal p3) throws android.os.RemoteException { return false; }
    public int checkUriPermission(android.content.AttributionSource p0, android.net.Uri p1, int p2, int p3) throws android.os.RemoteException { return 0; }
}
