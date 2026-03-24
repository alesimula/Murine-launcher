package android.content;

public class ContentProviderOperation implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_INSERT = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_UPDATE = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_DELETE = 3;
    public static final int TYPE_ASSERT = 4;
    @android.annotation.UnsupportedAppUsage
    private final int mType = 0;
    @android.annotation.UnsupportedAppUsage
    private final android.net.Uri mUri = null;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.String mSelection = null;
    private final java.lang.String[] mSelectionArgs = null;
    private final android.content.ContentValues mValues = null;
    private final java.lang.Integer mExpectedCount = null;
    private final android.content.ContentValues mValuesBackReferences = null;
    private final java.util.Map<java.lang.Integer, java.lang.Integer> mSelectionArgsBackReferences = null;
    private final boolean mYieldAllowed = false;
    private final boolean mFailureAllowed = false;
    private static final java.lang.String TAG = "ContentProviderOperation";
    public static final android.os.Parcelable.Creator<android.content.ContentProviderOperation> CREATOR = null;
    private ContentProviderOperation(android.content.ContentProviderOperation.Builder p0) {}
    private ContentProviderOperation(android.os.Parcel p0) {}
    public ContentProviderOperation(android.content.ContentProviderOperation p0, android.net.Uri p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.content.ContentProviderOperation.Builder newInsert(android.net.Uri p0) { return null; }
    public static android.content.ContentProviderOperation.Builder newUpdate(android.net.Uri p0) { return null; }
    public static android.content.ContentProviderOperation.Builder newDelete(android.net.Uri p0) { return null; }
    public static android.content.ContentProviderOperation.Builder newAssertQuery(android.net.Uri p0) { return null; }
    public android.net.Uri getUri() { return null; }
    public boolean isYieldAllowed() { return false; }
    public boolean isFailureAllowed() { return false; }
    @android.annotation.UnsupportedAppUsage
    public int getType() { return 0; }
    public boolean isInsert() { return false; }
    public boolean isDelete() { return false; }
    public boolean isUpdate() { return false; }
    public boolean isAssertQuery() { return false; }
    public boolean isWriteOperation() { return false; }
    public boolean isReadOperation() { return false; }
    public android.content.ContentProviderResult apply(android.content.ContentProvider p0, android.content.ContentProviderResult[] p1, int p2) throws android.content.OperationApplicationException { return null; }
    private android.content.ContentProviderResult applyInternal(android.content.ContentProvider p0, android.content.ContentProviderResult[] p1, int p2) throws android.content.OperationApplicationException { return null; }
    public android.content.ContentValues resolveValueBackReferences(android.content.ContentProviderResult[] p0, int p1) { return null; }
    public java.lang.String[] resolveSelectionArgsBackReferences(android.content.ContentProviderResult[] p0, int p1) { return null; }
    public java.lang.String toString() { return null; }
    private long backRefToValue(android.content.ContentProviderResult[] p0, int p1, java.lang.Integer p2) { return 0L; }
    public int describeContents() { return 0; }

    public static class Builder {
        private final int mType = 0;
        private final android.net.Uri mUri = null;
        private java.lang.String mSelection;
        private java.lang.String[] mSelectionArgs;
        private android.content.ContentValues mValues;
        private java.lang.Integer mExpectedCount;
        private android.content.ContentValues mValuesBackReferences;
        private java.util.Map<java.lang.Integer, java.lang.Integer> mSelectionArgsBackReferences;
        private boolean mYieldAllowed;
        private boolean mFailureAllowed;
        private Builder(int p0, android.net.Uri p1) {}
        public android.content.ContentProviderOperation build() { return null; }
        public android.content.ContentProviderOperation.Builder withValueBackReferences(android.content.ContentValues p0) { return null; }
        public android.content.ContentProviderOperation.Builder withValueBackReference(java.lang.String p0, int p1) { return null; }
        public android.content.ContentProviderOperation.Builder withSelectionBackReference(int p0, int p1) { return null; }
        public android.content.ContentProviderOperation.Builder withValues(android.content.ContentValues p0) { return null; }
        public android.content.ContentProviderOperation.Builder withValue(java.lang.String p0, java.lang.Object p1) { return null; }
        public android.content.ContentProviderOperation.Builder withSelection(java.lang.String p0, java.lang.String[] p1) { return null; }
        public android.content.ContentProviderOperation.Builder withExpectedCount(int p0) { return null; }
        public android.content.ContentProviderOperation.Builder withYieldAllowed(boolean p0) { return null; }
        public android.content.ContentProviderOperation.Builder withFailureAllowed(boolean p0) { return null; }
    }
}
