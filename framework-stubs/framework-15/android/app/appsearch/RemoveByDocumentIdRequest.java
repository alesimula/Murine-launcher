package android.app.appsearch;

public final class RemoveByDocumentIdRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.RemoveByDocumentIdRequest> CREATOR = null;
    RemoveByDocumentIdRequest() {}
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getIds() { return null; }
    @android.annotation.NonNull
    public java.lang.String getNamespace() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.RemoveByDocumentIdRequest.Builder addIds(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.RemoveByDocumentIdRequest.Builder addIds(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.RemoveByDocumentIdRequest build() { return null; }
    }
}
