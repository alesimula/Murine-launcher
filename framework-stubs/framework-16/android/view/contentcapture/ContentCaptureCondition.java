package android.view.contentcapture;

public final class ContentCaptureCondition implements android.os.Parcelable {
    public static final int FLAG_IS_REGEX = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.contentcapture.ContentCaptureCondition> CREATOR = null;
    public ContentCaptureCondition(android.content.LocusId p0, int p1) {}
    @android.annotation.NonNull
    public android.content.LocusId getLocusId() { return null; }
    public int getFlags() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Flags {
    }
}
