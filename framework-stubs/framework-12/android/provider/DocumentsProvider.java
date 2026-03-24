package android.provider;

public abstract class DocumentsProvider extends android.content.ContentProvider {
    private static final java.lang.String TAG = "DocumentsProvider";
    private static final int MATCH_ROOTS = 1;
    private static final int MATCH_ROOT = 2;
    private static final int MATCH_RECENT = 3;
    private static final int MATCH_SEARCH = 4;
    private static final int MATCH_DOCUMENT = 5;
    private static final int MATCH_CHILDREN = 6;
    private static final int MATCH_DOCUMENT_TREE = 7;
    private static final int MATCH_CHILDREN_TREE = 8;
    private java.lang.String mAuthority;
    private android.content.UriMatcher mMatcher;
    public DocumentsProvider() { super(); }
    public void attachInfo(android.content.Context p0, android.content.pm.ProviderInfo p1) {}
    public void attachInfoForTesting(android.content.Context p0, android.content.pm.ProviderInfo p1) {}
    private void registerAuthority(java.lang.String p0) {}
    public boolean isChildDocument(java.lang.String p0, java.lang.String p1) { return false; }
    private void enforceTreeForExtraUris(android.os.Bundle p0) {}
    private void enforceTree(android.net.Uri p0) {}
    private android.net.Uri validateIncomingNullableUri(android.net.Uri p0) { return null; }
    public java.lang.String createDocument(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public java.lang.String renameDocument(java.lang.String p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public void deleteDocument(java.lang.String p0) throws java.io.FileNotFoundException {}
    public java.lang.String copyDocument(java.lang.String p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public java.lang.String moveDocument(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public void removeDocument(java.lang.String p0, java.lang.String p1) throws java.io.FileNotFoundException {}
    public android.provider.DocumentsContract.Path findDocumentPath(java.lang.String p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public android.content.IntentSender createWebLinkIntent(java.lang.String p0, android.os.Bundle p1) throws java.io.FileNotFoundException { return null; }
    public abstract android.database.Cursor queryRoots(java.lang.String[] p0) throws java.io.FileNotFoundException;
    public android.database.Cursor queryRecentDocuments(java.lang.String p0, java.lang.String[] p1) throws java.io.FileNotFoundException { return null; }
    public android.database.Cursor queryRecentDocuments(java.lang.String p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException { return null; }
    public abstract android.database.Cursor queryDocument(java.lang.String p0, java.lang.String[] p1) throws java.io.FileNotFoundException;
    public abstract android.database.Cursor queryChildDocuments(java.lang.String p0, java.lang.String[] p1, java.lang.String p2) throws java.io.FileNotFoundException;
    public android.database.Cursor queryChildDocuments(java.lang.String p0, java.lang.String[] p1, android.os.Bundle p2) throws java.io.FileNotFoundException { return null; }
    public android.database.Cursor queryChildDocumentsForManage(java.lang.String p0, java.lang.String[] p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public android.database.Cursor querySearchDocuments(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) throws java.io.FileNotFoundException { return null; }
    public android.database.Cursor querySearchDocuments(java.lang.String p0, java.lang.String[] p1, android.os.Bundle p2) throws java.io.FileNotFoundException { return null; }
    public void ejectRoot(java.lang.String p0) {}
    public android.os.Bundle getDocumentMetadata(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public java.lang.String getDocumentType(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public abstract android.os.ParcelFileDescriptor openDocument(java.lang.String p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException;
    public android.content.res.AssetFileDescriptor openDocumentThumbnail(java.lang.String p0, android.graphics.Point p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openTypedDocument(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException { return null; }
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5) { return null; }
    public final android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3) { return null; }
    private static java.lang.String getSortClause(android.os.Bundle p0) { return null; }
    public final java.lang.String getType(android.net.Uri p0) { return null; }
    public android.net.Uri canonicalize(android.net.Uri p0) { return null; }
    private static int getCallingOrSelfUriPermissionModeFlags(android.content.Context p0, android.net.Uri p1) { return 0; }
    public final android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    public final int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public final int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }
    public android.os.Bundle call(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    private android.os.Bundle callUnchecked(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws java.io.FileNotFoundException { return null; }
    public final void revokeDocumentPermission(java.lang.String p0) {}
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2) throws java.io.FileNotFoundException { return null; }
    public final android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException { return null; }
    public java.lang.String[] getDocumentStreamTypes(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String[] getStreamTypes(android.net.Uri p0, java.lang.String p1) { return null; }
    private final android.content.res.AssetFileDescriptor openTypedAssetFileImpl(android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException { return null; }
}
