package android.media;

@android.annotation.SystemApi
public final class AudioDeviceAttributes implements android.os.Parcelable {
    public static final int ROLE_INPUT = 1;
    public static final int ROLE_OUTPUT = 2;
    private final int mType = 0;
    private final java.lang.String mAddress = null;
    private final int mRole = 0;
    public static final android.os.Parcelable.Creator<android.media.AudioDeviceAttributes> CREATOR = null;
    @android.annotation.SystemApi
    public AudioDeviceAttributes(android.media.AudioDeviceInfo p0) {}
    @android.annotation.SystemApi
    public AudioDeviceAttributes(int p0, int p1, java.lang.String p2) {}
    AudioDeviceAttributes(int p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    public int getRole() { return 0; }
    @android.annotation.SystemApi
    public int getType() { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getAddress() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public static java.lang.String roleToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private AudioDeviceAttributes(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Role {
    }
}
