package android.provider;

public final class DocumentsContract {
    public static final java.lang.String PROVIDER_INTERFACE = "android.content.action.DOCUMENTS_PROVIDER";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.intent.extra.PACKAGE_NAME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SHOW_ADVANCED = "android.provider.extra.SHOW_ADVANCED";
    public static final java.lang.String EXTRA_TARGET_URI = "android.content.extra.TARGET_URI";
    public static final java.lang.String QUERY_ARG_DISPLAY_NAME = "android:query-arg-display-name";
    public static final java.lang.String QUERY_ARG_MIME_TYPES = "android:query-arg-mime-types";
    public static final java.lang.String QUERY_ARG_FILE_SIZE_OVER = "android:query-arg-file-size-over";
    public static final java.lang.String QUERY_ARG_LAST_MODIFIED_AFTER = "android:query-arg-last-modified-after";
    public static final java.lang.String QUERY_ARG_EXCLUDE_MEDIA = "android:query-arg-exclude-media";
    public static final java.lang.String EXTRA_INITIAL_URI = "android.provider.extra.INITIAL_URI";
    public static final java.lang.String EXTRA_EXCLUDE_SELF = "android.provider.extra.EXCLUDE_SELF";
    public static final java.lang.String EXTRA_ORIENTATION = "android.provider.extra.ORIENTATION";
    public static final java.lang.String EXTRA_PROMPT = "android.provider.extra.PROMPT";
    public static final java.lang.String ACTION_DOCUMENT_SETTINGS = "android.provider.action.DOCUMENT_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_MANAGE_DOCUMENT = "android.provider.action.MANAGE_DOCUMENT";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_DOCUMENT_ROOT_SETTINGS = "android.provider.action.DOCUMENT_ROOT_SETTINGS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTERNAL_STORAGE_PROVIDER_AUTHORITY = "com.android.externalstorage.documents";
    @android.annotation.SystemApi
    public static final java.lang.String DOWNLOADS_PROVIDER_AUTHORITY = "downloads";
    public static final java.lang.String EXTERNAL_STORAGE_PRIMARY_EMULATED_ROOT_ID = "primary";
    public static final java.lang.String PACKAGE_DOCUMENTS_UI = "com.android.documentsui";
    public static final java.lang.String METADATA_TYPES = "android:documentMetadataTypes";
    public static final java.lang.String METADATA_EXIF = "android:documentExif";
    public static final java.lang.String METADATA_TREE_COUNT = "android:metadataTreeCount";
    public static final java.lang.String METADATA_TREE_SIZE = "android:metadataTreeSize";
    public static final java.lang.String EXTRA_LOADING = "loading";
    public static final java.lang.String EXTRA_INFO = "info";
    public static final java.lang.String EXTRA_ERROR = "error";
    public static final java.lang.String EXTRA_RESULT = "result";
    public static final java.lang.String METHOD_CREATE_DOCUMENT = "android:createDocument";
    public static final java.lang.String METHOD_RENAME_DOCUMENT = "android:renameDocument";
    public static final java.lang.String METHOD_DELETE_DOCUMENT = "android:deleteDocument";
    public static final java.lang.String METHOD_COPY_DOCUMENT = "android:copyDocument";
    public static final java.lang.String METHOD_MOVE_DOCUMENT = "android:moveDocument";
    public static final java.lang.String METHOD_IS_CHILD_DOCUMENT = "android:isChildDocument";
    public static final java.lang.String METHOD_REMOVE_DOCUMENT = "android:removeDocument";
    public static final java.lang.String METHOD_EJECT_ROOT = "android:ejectRoot";
    public static final java.lang.String METHOD_FIND_DOCUMENT_PATH = "android:findDocumentPath";
    public static final java.lang.String METHOD_CREATE_WEB_LINK_INTENT = "android:createWebLinkIntent";
    public static final java.lang.String METHOD_GET_DOCUMENT_METADATA = "android:getDocumentMetadata";
    public static final java.lang.String EXTRA_PARENT_URI = "parentUri";
    public static final java.lang.String EXTRA_URI = "uri";
    public static final java.lang.String EXTRA_URI_PERMISSIONS = "uriPermissions";
    public static final java.lang.String EXTRA_OPTIONS = "options";
    public static android.net.Uri buildRootsUri(java.lang.String p0) { return null; }
    public static android.net.Uri buildRootUri(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.net.Uri buildRecentDocumentsUri(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.net.Uri buildTreeDocumentUri(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.net.Uri buildDocumentUri(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    public static android.net.Uri buildDocumentUriAsUser(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return null; }
    public static android.net.Uri buildBaseDocumentUri(java.lang.String p0) { return null; }
    public static android.net.Uri buildDocumentUriUsingTree(android.net.Uri p0, java.lang.String p1) { return null; }
    public static android.net.Uri buildDocumentUriMaybeUsingTree(android.net.Uri p0, java.lang.String p1) { return null; }
    public static android.net.Uri buildChildDocumentsUri(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.net.Uri buildChildDocumentsUriUsingTree(android.net.Uri p0, java.lang.String p1) { return null; }
    public static android.net.Uri buildSearchDocumentsUri(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static boolean matchSearchQueryArguments(android.os.Bundle p0, java.lang.String p1, java.lang.String p2, long p3, long p4) { return false; }
    public static java.lang.String[] getHandledQueryArguments(android.os.Bundle p0) { return null; }
    public static boolean isDocumentUri(android.content.Context p0, android.net.Uri p1) { return false; }
    public static boolean isRootsUri(android.content.Context p0, android.net.Uri p1) { return false; }
    public static boolean isRootUri(android.content.Context p0, android.net.Uri p1) { return false; }
    public static boolean isContentUri(android.net.Uri p0) { return false; }
    public static boolean isTreeUri(android.net.Uri p0) { return false; }
    public static java.lang.String getRootId(android.net.Uri p0) { return null; }
    public static java.lang.String getDocumentId(android.net.Uri p0) { return null; }
    public static java.lang.String getTreeDocumentId(android.net.Uri p0) { return null; }
    public static java.lang.String getSearchDocumentsQuery(android.net.Uri p0) { return null; }
    public static java.lang.String getSearchDocumentsQuery(android.os.Bundle p0) { return null; }
    @android.annotation.SystemApi
    public static android.net.Uri setManageMode(android.net.Uri p0) { return null; }
    @android.annotation.SystemApi
    public static boolean isManageMode(android.net.Uri p0) { return false; }
    public static android.graphics.Bitmap getDocumentThumbnail(android.content.ContentResolver p0, android.net.Uri p1, android.graphics.Point p2, android.os.CancellationSignal p3) throws java.io.FileNotFoundException { return null; }
    public static android.net.Uri createDocument(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String p2, java.lang.String p3) throws java.io.FileNotFoundException { return null; }
    public static boolean isChildDocument(android.content.ContentResolver p0, android.net.Uri p1, android.net.Uri p2) throws java.io.FileNotFoundException { return false; }
    public static android.net.Uri renameDocument(android.content.ContentResolver p0, android.net.Uri p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public static boolean deleteDocument(android.content.ContentResolver p0, android.net.Uri p1) throws java.io.FileNotFoundException { return false; }
    public static android.net.Uri copyDocument(android.content.ContentResolver p0, android.net.Uri p1, android.net.Uri p2) throws java.io.FileNotFoundException { return null; }
    public static android.net.Uri moveDocument(android.content.ContentResolver p0, android.net.Uri p1, android.net.Uri p2, android.net.Uri p3) throws java.io.FileNotFoundException { return null; }
    public static boolean removeDocument(android.content.ContentResolver p0, android.net.Uri p1, android.net.Uri p2) throws java.io.FileNotFoundException { return false; }
    public static void ejectRoot(android.content.ContentResolver p0, android.net.Uri p1) {}
    public static android.os.Bundle getDocumentMetadata(android.content.ContentResolver p0, android.net.Uri p1) throws java.io.FileNotFoundException { return null; }
    public static android.provider.DocumentsContract.Path findDocumentPath(android.content.ContentResolver p0, android.net.Uri p1) throws java.io.FileNotFoundException { return null; }
    public static android.content.IntentSender createWebLinkIntent(android.content.ContentResolver p0, android.net.Uri p1, android.os.Bundle p2) throws java.io.FileNotFoundException { return null; }
    public static android.content.res.AssetFileDescriptor openImageThumbnail(java.io.File p0) throws java.io.FileNotFoundException { return null; }

    public static final class Document {
        public static final java.lang.String COLUMN_DOCUMENT_ID = "document_id";
        public static final java.lang.String COLUMN_MIME_TYPE = "mime_type";
        public static final java.lang.String COLUMN_DISPLAY_NAME = "_display_name";
        public static final java.lang.String COLUMN_SUMMARY = "summary";
        public static final java.lang.String COLUMN_LAST_MODIFIED = "last_modified";
        public static final java.lang.String COLUMN_ICON = "icon";
        public static final java.lang.String COLUMN_FLAGS = "flags";
        public static final java.lang.String COLUMN_SIZE = "_size";
        public static final java.lang.String MIME_TYPE_DIR = "vnd.android.document/directory";
        public static final int FLAG_SUPPORTS_THUMBNAIL = 1;
        public static final int FLAG_SUPPORTS_WRITE = 2;
        public static final int FLAG_SUPPORTS_DELETE = 4;
        public static final int FLAG_DIR_SUPPORTS_CREATE = 8;
        public static final int FLAG_DIR_PREFERS_GRID = 16;
        public static final int FLAG_DIR_PREFERS_LAST_MODIFIED = 32;
        public static final int FLAG_SUPPORTS_RENAME = 64;
        public static final int FLAG_SUPPORTS_COPY = 128;
        public static final int FLAG_SUPPORTS_MOVE = 256;
        public static final int FLAG_VIRTUAL_DOCUMENT = 512;
        public static final int FLAG_SUPPORTS_REMOVE = 1024;
        public static final int FLAG_SUPPORTS_SETTINGS = 2048;
        public static final int FLAG_WEB_LINKABLE = 4096;
        public static final int FLAG_PARTIAL = 8192;
        public static final int FLAG_SUPPORTS_METADATA = 16384;
        public static final int FLAG_DIR_BLOCKS_OPEN_DOCUMENT_TREE = 32768;
    }

    public static final class Path implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.provider.DocumentsContract.Path> CREATOR = null;
        public Path(java.lang.String p0, java.util.List<java.lang.String> p1) {}
        public java.lang.String getRootId() { return null; }
        public java.util.List<java.lang.String> getPath() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    public static final class Root {
        public static final java.lang.String COLUMN_ROOT_ID = "root_id";
        public static final java.lang.String COLUMN_FLAGS = "flags";
        public static final java.lang.String COLUMN_ICON = "icon";
        public static final java.lang.String COLUMN_TITLE = "title";
        public static final java.lang.String COLUMN_SUMMARY = "summary";
        public static final java.lang.String COLUMN_DOCUMENT_ID = "document_id";
        public static final java.lang.String COLUMN_AVAILABLE_BYTES = "available_bytes";
        public static final java.lang.String COLUMN_CAPACITY_BYTES = "capacity_bytes";
        public static final java.lang.String COLUMN_MIME_TYPES = "mime_types";
        public static final java.lang.String COLUMN_QUERY_ARGS = "query_args";
        public static final java.lang.String MIME_TYPE_ITEM = "vnd.android.document/root";
        public static final int FLAG_SUPPORTS_CREATE = 1;
        public static final int FLAG_LOCAL_ONLY = 2;
        public static final int FLAG_SUPPORTS_RECENTS = 4;
        public static final int FLAG_SUPPORTS_SEARCH = 8;
        public static final int FLAG_SUPPORTS_IS_CHILD = 16;
        public static final int FLAG_SUPPORTS_EJECT = 32;
        public static final int FLAG_EMPTY = 64;
        @android.annotation.SystemApi
        public static final int FLAG_ADVANCED = 65536;
        @android.annotation.SystemApi
        public static final int FLAG_HAS_SETTINGS = 131072;
        @android.annotation.SystemApi
        public static final int FLAG_REMOVABLE_SD = 262144;
        @android.annotation.SystemApi
        public static final int FLAG_REMOVABLE_USB = 524288;
    }
}
