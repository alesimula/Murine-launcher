package android.content;

public abstract class ContentProvider implements android.content.ContentInterface, android.content.ComponentCallbacks2 {
    private static final java.lang.String TAG = "ContentProvider";
    private android.content.Context mContext;
    private int mMyUid;
    private java.lang.String mAuthority;
    private java.lang.String[] mAuthorities;
    private java.lang.String mReadPermission;
    private java.lang.String mWritePermission;
    private android.content.pm.PathPermission[] mPathPermissions;
    private boolean mExported;
    private boolean mNoPerms;
    private boolean mSingleUser;
    private java.lang.ThreadLocal<android.util.Pair<java.lang.String, java.lang.String>> mCallingPackage;
    private android.content.ContentProvider.Transport mTransport;
    public ContentProvider() {}
    public ContentProvider(android.content.Context p0, java.lang.String p1, java.lang.String p2, android.content.pm.PathPermission[] p3) {}
    public static android.content.ContentProvider coerceToLocalContentProvider(android.content.IContentProvider p0) { return null; }
    boolean checkUser(int p0, int p1, android.content.Context p2) { return false; }
    private int checkPermissionAndAppOp(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.IBinder p3) { return 0; }
    protected int enforceReadPermissionInner(android.net.Uri p0, java.lang.String p1, java.lang.String p2, android.os.IBinder p3) throws java.lang.SecurityException { return 0; }
    protected int enforceWritePermissionInner(android.net.Uri p0, java.lang.String p1, java.lang.String p2, android.os.IBinder p3) throws java.lang.SecurityException { return 0; }
    public final android.content.Context getContext() { return null; }
    public final android.content.Context requireContext() { return null; }
    private android.util.Pair<java.lang.String, java.lang.String> setCallingPackage(android.util.Pair<java.lang.String, java.lang.String> p0) { return null; }
    public final java.lang.String getCallingPackage() { return null; }
    public final java.lang.String getCallingAttributionTag() { return null; }
    @java.lang.Deprecated
    public final java.lang.String getCallingFeatureId() { return null; }
    public final java.lang.String getCallingPackageUnchecked() { return null; }
    public void onCallingPackageChanged() {}
    public final android.content.ContentProvider.CallingIdentity clearCallingIdentity() { return null; }
    public final void restoreCallingIdentity(android.content.ContentProvider.CallingIdentity p0) {}
    protected final void setAuthorities(java.lang.String p0) {}
    protected final boolean matchesOurAuthorities(java.lang.String p0) { return false; }
    protected final void setReadPermission(java.lang.String p0) {}
    public final java.lang.String getReadPermission() { return null; }
    protected final void setWritePermission(java.lang.String p0) {}
    public final java.lang.String getWritePermission() { return null; }
    protected final void setPathPermissions(android.content.pm.PathPermission[] p0) {}
    public final android.content.pm.PathPermission[] getPathPermissions() { return null; }
    public final void setAppOps(int p0, int p1) {}
    public android.app.AppOpsManager getAppOpsManager() { return null; }
    public final void setTransportLoggingEnabled(boolean p0) {}
    public abstract boolean onCreate();
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onLowMemory() {}
    public void onTrimMemory(int p0) {}
    public abstract android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4);
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5) { return null; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) { return null; }
    public abstract java.lang.String getType(android.net.Uri p0);
    public android.net.Uri canonicalize(android.net.Uri p0) { return null; }
    public android.net.Uri uncanonicalize(android.net.Uri p0) { return null; }
    public boolean refresh(android.net.Uri p0, android.os.Bundle p1, android.os.CancellationSignal p2) { return false; }
    @android.annotation.SystemApi
    public int checkUriPermission(android.net.Uri p0, int p1, int p2) { return 0; }
    public android.net.Uri rejectInsert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    public abstract android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1);
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) { return null; }
    public int bulkInsert(android.net.Uri p0, android.content.ContentValues[] p1) { return 0; }
    public abstract int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2);
    public int delete(android.net.Uri p0, android.os.Bundle p1) { return 0; }
    public abstract int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3);
    public int update(android.net.Uri p0, android.content.ContentValues p1, android.os.Bundle p2) { return 0; }
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    protected final android.os.ParcelFileDescriptor openFileHelper(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) { return null; }
    public android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2) throws java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException { return null; }
    public <T extends java.lang.Object> android.os.ParcelFileDescriptor openPipeHelper(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, T p3, android.content.ContentProvider.PipeDataWriter<T> p4) throws java.io.FileNotFoundException { return null; }
    protected boolean isTemporary() { return false; }
    public android.content.IContentProvider getIContentProvider() { return null; }
    public void attachInfoForTesting(android.content.Context p0, android.content.pm.ProviderInfo p1) {}
    public void attachInfo(android.content.Context p0, android.content.pm.ProviderInfo p1) {}
    private void attachInfo(android.content.Context p0, android.content.pm.ProviderInfo p1, boolean p2) {}
    public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.util.ArrayList<android.content.ContentProviderOperation> p1) throws android.content.OperationApplicationException { return null; }
    public android.content.ContentProviderResult[] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> p0) throws android.content.OperationApplicationException { return null; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) { return null; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    public void shutdown() {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    private void validateIncomingAuthority(java.lang.String p0) throws java.lang.SecurityException {}
    public android.net.Uri validateIncomingUri(android.net.Uri p0) throws java.lang.SecurityException { return null; }
    private android.net.Uri maybeGetUriWithoutUserId(android.net.Uri p0) { return null; }
    public static int getUserIdFromAuthority(java.lang.String p0, int p1) { return 0; }
    public static int getUserIdFromAuthority(java.lang.String p0) { return 0; }
    public static int getUserIdFromUri(android.net.Uri p0, int p1) { return 0; }
    public static int getUserIdFromUri(android.net.Uri p0) { return 0; }
    public static android.os.UserHandle getUserHandleFromUri(android.net.Uri p0) { return null; }
    public static java.lang.String getAuthorityWithoutUserId(java.lang.String p0) { return null; }
    public static android.net.Uri getUriWithoutUserId(android.net.Uri p0) { return null; }
    public static boolean uriHasUserId(android.net.Uri p0) { return false; }
    public static android.net.Uri maybeAddUserId(android.net.Uri p0, int p1) { return null; }

    public final class CallingIdentity {
        public final long binderToken = 0L;
        public final android.util.Pair<java.lang.String, java.lang.String> callingPackage = null;
        public CallingIdentity(long p0, android.util.Pair<java.lang.String, java.lang.String> p1) {}
    }

    public static interface PipeDataWriter<T extends java.lang.Object> {
        public void writeDataToPipe(android.os.ParcelFileDescriptor p0, android.net.Uri p1, java.lang.String p2, android.os.Bundle p3, T p4);
    }

    class Transport extends android.content.ContentProviderNative {
        volatile android.app.AppOpsManager mAppOpsManager;
        volatile int mReadOp;
        volatile int mWriteOp;
        volatile android.content.ContentInterface mInterface;
        Transport(android.content.ContentProvider p0) { super(); }
        android.content.ContentProvider getContentProvider() { return null; }
        public java.lang.String getProviderName() { return null; }
        public android.database.Cursor query(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String[] p3, android.os.Bundle p4, android.os.ICancellationSignal p5) { return null; }
        public java.lang.String getType(android.net.Uri p0) { return null; }
        public void getTypeAsync(android.net.Uri p0, android.os.RemoteCallback p1) {}
        public android.net.Uri insert(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.content.ContentValues p3, android.os.Bundle p4) { return null; }
        public int bulkInsert(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.content.ContentValues[] p3) { return 0; }
        public android.content.ContentProviderResult[] applyBatch(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.ArrayList<android.content.ContentProviderOperation> p3) throws android.content.OperationApplicationException { return null; }
        public int delete(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3) { return 0; }
        public int update(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.content.ContentValues p3, android.os.Bundle p4) { return 0; }
        public android.os.ParcelFileDescriptor openFile(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.ICancellationSignal p4, android.os.IBinder p5) throws java.io.FileNotFoundException { return null; }
        public android.content.res.AssetFileDescriptor openAssetFile(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.ICancellationSignal p4) throws java.io.FileNotFoundException { return null; }
        public android.os.Bundle call(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.os.Bundle p5) { return null; }
        public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) { return null; }
        public android.content.res.AssetFileDescriptor openTypedAssetFile(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.Bundle p4, android.os.ICancellationSignal p5) throws java.io.FileNotFoundException { return null; }
        public android.os.ICancellationSignal createCancellationSignal() { return null; }
        public android.net.Uri canonicalize(java.lang.String p0, java.lang.String p1, android.net.Uri p2) { return null; }
        public void canonicalizeAsync(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.os.RemoteCallback p3) {}
        public android.net.Uri uncanonicalize(java.lang.String p0, java.lang.String p1, android.net.Uri p2) { return null; }
        public boolean refresh(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3, android.os.ICancellationSignal p4) throws android.os.RemoteException { return false; }
        public int checkUriPermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) { return 0; }
        private void enforceFilePermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.IBinder p4) throws java.io.FileNotFoundException, java.lang.SecurityException {}
        private int enforceReadPermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.os.IBinder p3) throws java.lang.SecurityException { return 0; }
        private int enforceWritePermission(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.os.IBinder p3) throws java.lang.SecurityException { return 0; }
        private int noteProxyOp(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    }
}
