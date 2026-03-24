package android.hardware.face;

public class FaceEnrollOptions implements android.os.Parcelable {
    public static final int ENROLL_REASON_UNKNOWN = 0;
    public static final int ENROLL_REASON_RE_ENROLL_NOTIFICATION = 1;
    public static final int ENROLL_REASON_SETTINGS = 2;
    public static final int ENROLL_REASON_SUW = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.face.FaceEnrollOptions> CREATOR = null;
    public static java.lang.String enrollReasonToString(int p0) { return null; }
    FaceEnrollOptions(int p0) {}
    public int getEnrollReason() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected FaceEnrollOptions(android.os.Parcel p0) {}

    public static class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.face.FaceEnrollOptions.Builder setEnrollReason(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.face.FaceEnrollOptions build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnrollReason {
    }
}
