package android.content;

public interface ContentInterface {
    @android.annotation.Nullable
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException;
    @android.annotation.Nullable
    public java.lang.String getType(android.net.Uri p0) throws android.os.RemoteException;
    @android.annotation.Nullable
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.Nullable
    public android.net.Uri canonicalize(android.net.Uri p0) throws android.os.RemoteException;
    @android.annotation.Nullable
    public android.net.Uri uncanonicalize(android.net.Uri p0) throws android.os.RemoteException;
    public boolean refresh(android.net.Uri p0, android.os.Bundle p1, android.os.CancellationSignal p2) throws android.os.RemoteException;
    public int checkUriPermission(android.net.Uri p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.Nullable
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) throws android.os.RemoteException;
    public int bulkInsert(android.net.Uri p0, android.content.ContentValues[] p1) throws android.os.RemoteException;
    public int delete(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException;
    public int update(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) throws android.os.RemoteException;
    @android.annotation.Nullable
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException;
    @android.annotation.Nullable
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws android.os.RemoteException, java.io.FileNotFoundException;
    @android.annotation.Nullable
    public android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws android.os.RemoteException, java.io.FileNotFoundException;
    @android.annotation.NonNull
    public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.util.ArrayList<android.content.ContentProviderOperation> p1) throws android.os.RemoteException, android.content.OperationApplicationException;
    @android.annotation.Nullable
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
}
