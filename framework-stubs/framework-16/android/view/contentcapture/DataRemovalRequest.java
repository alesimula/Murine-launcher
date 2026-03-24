package android.view.contentcapture;

public final class DataRemovalRequest implements android.os.Parcelable {
    public static final int FLAG_IS_PREFIX = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.contentcapture.DataRemovalRequest> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public boolean isForEverything() { return false; }
    @android.annotation.NonNull
    public java.util.List<android.view.contentcapture.DataRemovalRequest.LocusIdRequest> getLocusIdRequests() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.view.contentcapture.DataRemovalRequest.Builder forEverything() { return null; }
        @android.annotation.NonNull
        public android.view.contentcapture.DataRemovalRequest.Builder addLocusId(android.content.LocusId p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.view.contentcapture.DataRemovalRequest build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Flags {
    }

    public final class LocusIdRequest {
        @android.annotation.NonNull
        public android.content.LocusId getLocusId() { return null; }
        @android.annotation.NonNull
        public int getFlags() { return 0; }
    }
}
