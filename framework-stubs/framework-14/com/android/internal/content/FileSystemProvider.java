package com.android.internal.content;

public abstract class FileSystemProvider extends android.provider.DocumentsProvider {
    protected static final java.lang.String SUPPORTED_QUERY_ARGS = null;
    public FileSystemProvider() { super(); }
    protected abstract java.io.File getFileForDocId(java.lang.String p0, boolean p1) throws java.io.FileNotFoundException;
    protected abstract java.lang.String getDocIdForFile(java.io.File p0) throws java.io.FileNotFoundException;
    protected abstract android.net.Uri buildNotificationUri(java.lang.String p0);
    protected void onDocIdChanged(java.lang.String p0) {}
    protected void onDocIdDeleted(java.lang.String p0) {}
    public boolean onCreate() { return false; }
    protected void onCreate(java.lang.String[] p0) {}
    public boolean isChildDocument(java.lang.String p0, java.lang.String p1) { return false; }
    public android.os.Bundle getDocumentMetadata(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    protected final java.util.List<java.lang.String> findDocumentPath(java.io.File p0, java.io.File p1) throws java.io.FileNotFoundException { return null; }
    public java.lang.String createDocument(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public java.lang.String renameDocument(java.lang.String p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public java.lang.String moveDocument(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public void deleteDocument(java.lang.String p0) throws java.io.FileNotFoundException {}
    public android.database.Cursor queryDocument(java.lang.String p0, java.lang.String[] p1) throws java.io.FileNotFoundException { return null; }
    protected android.database.Cursor queryChildDocumentsShowAll(java.lang.String p0, java.lang.String[] p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public android.database.Cursor queryChildDocuments(java.lang.String p0, java.lang.String[] p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    protected final android.database.Cursor querySearchDocuments(java.io.File p0, java.lang.String[] p1, java.util.Set<java.lang.String> p2, android.os.Bundle p3) throws java.io.FileNotFoundException { return null; }
    public java.lang.String getDocumentType(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    public android.os.ParcelFileDescriptor openDocument(java.lang.String p0, java.lang.String p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openDocumentThumbnail(java.lang.String p0, android.graphics.Point p1, android.os.CancellationSignal p2) throws java.io.FileNotFoundException { return null; }
    protected android.database.MatrixCursor.RowBuilder includeFile(android.database.MatrixCursor p0, java.lang.String p1, java.io.File p2) throws java.io.FileNotFoundException { return null; }
    protected boolean shouldHide(java.io.File p0) { return false; }
    protected boolean shouldBlockFromTree(java.lang.String p0) { return false; }
    protected boolean typeSupportsMetadata(java.lang.String p0) { return false; }
    protected final java.io.File getFileForDocId(java.lang.String p0) throws java.io.FileNotFoundException { return null; }

    private class DirectoryCursor extends android.database.MatrixCursor {
        public DirectoryCursor(com.android.internal.content.FileSystemProvider p0, java.lang.String[] p1, java.lang.String p2, java.io.File p3) { super((java.lang.String[])null); }
        public void notifyChanged() {}
        public void close() {}
    }

    private static class DirectoryObserver extends android.os.FileObserver {
        DirectoryObserver(java.io.File p0, android.content.ContentResolver p1, android.net.Uri p2) { super((java.lang.String)null); }
        public void onEvent(int p0, java.lang.String p1) {}
        public java.lang.String toString() { return null; }
    }
}
