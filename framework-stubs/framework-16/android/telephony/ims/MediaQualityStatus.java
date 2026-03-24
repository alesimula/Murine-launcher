package android.telephony.ims;

@android.annotation.SystemApi
public final class MediaQualityStatus implements android.os.Parcelable {
    public static final int MEDIA_SESSION_TYPE_AUDIO = 1;
    public static final int MEDIA_SESSION_TYPE_VIDEO = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.MediaQualityStatus> CREATOR = null;
    public MediaQualityStatus(java.lang.String p0, int p1, int p2, int p3, int p4, long p5) {}
    @android.annotation.NonNull
    public java.lang.String getCallSessionId() { return null; }
    public int getMediaSessionType() { return 0; }
    public int getTransportType() { return 0; }
    public int getRtpPacketLossRate() { return 0; }
    public int getRtpJitterMillis() { return 0; }
    public long getRtpInactivityMillis() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaSessionType {
    }
}
