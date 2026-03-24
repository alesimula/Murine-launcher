package android.telephony.ims;

@android.annotation.SystemApi
public final class MediaThreshold implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.MediaThreshold> CREATOR = null;
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public int[] getThresholdsRtpPacketLossRate() { return null; }
    @android.annotation.NonNull
    public int[] getThresholdsRtpJitterMillis() { return null; }
    @android.annotation.NonNull
    public long[] getThresholdsRtpInactivityTimeMillis() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static boolean isValidRtpPacketLossRate(int p0) { return false; }
    public static boolean isValidJitterMillis(int p0) { return false; }
    public static boolean isValidRtpInactivityTimeMillis(long p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.ims.MediaThreshold.Builder setThresholdsRtpPacketLossRate(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.MediaThreshold.Builder setThresholdsRtpJitterMillis(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.MediaThreshold.Builder setThresholdsRtpInactivityTimeMillis(long[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.MediaThreshold build() { return null; }
    }
}
