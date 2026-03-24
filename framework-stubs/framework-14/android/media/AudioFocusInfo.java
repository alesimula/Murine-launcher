package android.media;

@android.annotation.SystemApi
public final class AudioFocusInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioFocusInfo> CREATOR = null;
    public AudioFocusInfo(android.media.AudioAttributes p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, int p7) {}
    public void setGen(long p0) {}
    public long getGen() { return 0L; }
    public android.media.AudioAttributes getAttributes() { return null; }
    public int getClientUid() { return 0; }
    public java.lang.String getClientId() { return null; }
    public java.lang.String getPackageName() { return null; }
    public int getGainRequest() { return 0; }
    public int getLossReceived() { return 0; }
    public int getSdkTarget() { return 0; }
    public void clearLossReceived() {}
    public int getFlags() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
}
