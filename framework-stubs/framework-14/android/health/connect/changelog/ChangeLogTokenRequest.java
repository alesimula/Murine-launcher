package android.health.connect.changelog;

public final class ChangeLogTokenRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.changelog.ChangeLogTokenRequest> CREATOR = null;
    ChangeLogTokenRequest() {}
    @android.annotation.NonNull
    public java.util.Set<android.health.connect.datatypes.DataOrigin> getDataOriginFilters() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Class<? extends android.health.connect.datatypes.Record>> getRecordTypes() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.health.connect.changelog.ChangeLogTokenRequest.Builder addRecordType(java.lang.Class<? extends android.health.connect.datatypes.Record> p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.changelog.ChangeLogTokenRequest.Builder addDataOriginFilter(android.health.connect.datatypes.DataOrigin p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.changelog.ChangeLogTokenRequest build() { return null; }
    }
}
