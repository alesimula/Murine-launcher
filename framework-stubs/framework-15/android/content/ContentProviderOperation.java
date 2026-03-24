package android.content;

public class ContentProviderOperation implements android.os.Parcelable {
    public static final int TYPE_INSERT = 1;
    public static final int TYPE_UPDATE = 2;
    public static final int TYPE_DELETE = 3;
    public static final int TYPE_ASSERT = 4;
    public static final int TYPE_CALL = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.ContentProviderOperation> CREATOR = null;
    public ContentProviderOperation(android.content.ContentProviderOperation p0, android.net.Uri p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public static android.content.ContentProviderOperation.Builder newInsert(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public static android.content.ContentProviderOperation.Builder newUpdate(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public static android.content.ContentProviderOperation.Builder newDelete(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public static android.content.ContentProviderOperation.Builder newAssertQuery(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public static android.content.ContentProviderOperation.Builder newCall(android.net.Uri p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.NonNull
    public android.net.Uri getUri() { return null; }
    public boolean isYieldAllowed() { return false; }
    public boolean isExceptionAllowed() { return false; }
    public int getType() { return 0; }
    public boolean isInsert() { return false; }
    public boolean isDelete() { return false; }
    public boolean isUpdate() { return false; }
    public boolean isAssertQuery() { return false; }
    public boolean isCall() { return false; }
    public boolean isWriteOperation() { return false; }
    public boolean isReadOperation() { return false; }
    @android.annotation.NonNull
    public android.content.ContentProviderResult apply(android.content.ContentProvider p0, android.content.ContentProviderResult[] p1, int p2) throws android.content.OperationApplicationException { return null; }
    @android.annotation.Nullable
    public android.content.ContentValues resolveValueBackReferences(android.content.ContentProviderResult[] p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.os.Bundle resolveExtrasBackReferences(android.content.ContentProviderResult[] p0, int p1) { return null; }
    @android.annotation.Nullable
    public java.lang.String[] resolveSelectionArgsBackReferences(android.content.ContentProviderResult[] p0, int p1) { return null; }
    public static java.lang.String typeToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static class BackReference implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.content.ContentProviderOperation.BackReference> CREATOR = null;
        public BackReference(android.os.Parcel p0) {}
        public java.lang.Object resolve(android.content.ContentProviderResult[] p0, int p1) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    public static class Builder {
        @android.annotation.NonNull
        public android.content.ContentProviderOperation build() { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withValues(android.content.ContentValues p0) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withValue(java.lang.String p0, java.lang.Object p1) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withValueBackReferences(android.content.ContentValues p0) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withValueBackReference(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withValueBackReference(java.lang.String p0, int p1, java.lang.String p2) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withExtra(java.lang.String p0, java.lang.Object p1) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withExtraBackReference(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withExtraBackReference(java.lang.String p0, int p1, java.lang.String p2) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withSelection(java.lang.String p0, java.lang.String[] p1) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withSelectionBackReference(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withSelectionBackReference(int p0, int p1, java.lang.String p2) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withExpectedCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withYieldAllowed(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withExceptionAllowed(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.content.ContentProviderOperation.Builder withFailureAllowed(boolean p0) { return null; }
    }
}
