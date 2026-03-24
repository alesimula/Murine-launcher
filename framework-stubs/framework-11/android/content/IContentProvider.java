package android.content;

public interface IContentProvider extends android.os.IInterface {
    public static final java.lang.String descriptor = "android.content.IContentProvider";
    public static final int QUERY_TRANSACTION = 1;
    public static final int GET_TYPE_TRANSACTION = 2;
    public static final int INSERT_TRANSACTION = 3;
    public static final int DELETE_TRANSACTION = 4;
    public static final int UPDATE_TRANSACTION = 10;
    public static final int BULK_INSERT_TRANSACTION = 13;
    public static final int OPEN_FILE_TRANSACTION = 14;
    public static final int OPEN_ASSET_FILE_TRANSACTION = 15;
    public static final int APPLY_BATCH_TRANSACTION = 20;
    public static final int CALL_TRANSACTION = 21;
    public static final int GET_STREAM_TYPES_TRANSACTION = 22;
    public static final int OPEN_TYPED_ASSET_FILE_TRANSACTION = 23;
    public static final int CREATE_CANCELATION_SIGNAL_TRANSACTION = 24;
    public static final int CANONICALIZE_TRANSACTION = 25;
    public static final int UNCANONICALIZE_TRANSACTION = 26;
    public static final int REFRESH_TRANSACTION = 27;
    public static final int CHECK_URI_PERMISSION_TRANSACTION = 28;
    public static final int GET_TYPE_ASYNC_TRANSACTION = 29;
    public static final int CANONICALIZE_ASYNC_TRANSACTION = 30;
    public android.database.Cursor query(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String[] p3, android.os.Bundle p4, android.os.ICancellationSignal p5) throws android.os.RemoteException;
    public java.lang.String getType(android.net.Uri p0) throws android.os.RemoteException;
    public void getTypeAsync(android.net.Uri p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    default public android.net.Uri insert(java.lang.String p0, android.net.Uri p1, android.content.ContentValues p2) throws android.os.RemoteException { return null; }
    public android.net.Uri insert(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.content.ContentValues p3, android.os.Bundle p4) throws android.os.RemoteException;
    @java.lang.Deprecated
    default public int bulkInsert(java.lang.String p0, android.net.Uri p1, android.content.ContentValues[] p2) throws android.os.RemoteException { return 0; }
    public int bulkInsert(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.content.ContentValues[] p3) throws android.os.RemoteException;
    @java.lang.Deprecated
    default public int delete(java.lang.String p0, android.net.Uri p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException { return 0; }
    public int delete(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3) throws android.os.RemoteException;
    @java.lang.Deprecated
    default public int update(java.lang.String p0, android.net.Uri p1, android.content.ContentValues p2, java.lang.String p3, java.lang.String[] p4) throws android.os.RemoteException { return 0; }
    public int update(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.content.ContentValues p3, android.os.Bundle p4) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openFile(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.ICancellationSignal p4, android.os.IBinder p5) throws android.os.RemoteException, java.io.FileNotFoundException;
    public android.content.res.AssetFileDescriptor openAssetFile(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.ICancellationSignal p4) throws android.os.RemoteException, java.io.FileNotFoundException;
    public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.ArrayList<android.content.ContentProviderOperation> p3) throws android.os.RemoteException, android.content.OperationApplicationException;
    @java.lang.Deprecated
    default public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.os.Bundle p5) throws android.os.RemoteException;
    public int checkUriPermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException;
    public android.os.ICancellationSignal createCancellationSignal() throws android.os.RemoteException;
    public android.net.Uri canonicalize(java.lang.String p0, java.lang.String p1, android.net.Uri p2) throws android.os.RemoteException;
    public void canonicalizeAsync(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public android.net.Uri uncanonicalize(java.lang.String p0, java.lang.String p1, android.net.Uri p2) throws android.os.RemoteException;
    public boolean refresh(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3, android.os.ICancellationSignal p4) throws android.os.RemoteException;
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.res.AssetFileDescriptor openTypedAssetFile(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.Bundle p4, android.os.ICancellationSignal p5) throws android.os.RemoteException, java.io.FileNotFoundException;
}
