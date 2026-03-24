package android.media.audio.common;

public final class AudioDeviceAddress implements android.os.Parcelable {
    public static final int id = 0;
    public static final int mac = 1;
    public static final int ipv4 = 2;
    public static final int ipv6 = 3;
    public static final int alsa = 4;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioDeviceAddress> CREATOR = null;
    public AudioDeviceAddress() {}
    public int getTag() { return 0; }
    public static android.media.audio.common.AudioDeviceAddress id(java.lang.String p0) { return null; }
    public java.lang.String getId() { return null; }
    public void setId(java.lang.String p0) {}
    public static android.media.audio.common.AudioDeviceAddress mac(byte[] p0) { return null; }
    public byte[] getMac() { return null; }
    public void setMac(byte[] p0) {}
    public static android.media.audio.common.AudioDeviceAddress ipv4(byte[] p0) { return null; }
    public byte[] getIpv4() { return null; }
    public void setIpv4(byte[] p0) {}
    public static android.media.audio.common.AudioDeviceAddress ipv6(int[] p0) { return null; }
    public int[] getIpv6() { return null; }
    public void setIpv6(int[] p0) {}
    public static android.media.audio.common.AudioDeviceAddress alsa(int[] p0) { return null; }
    public int[] getAlsa() { return null; }
    public void setAlsa(int[] p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static @interface Tag {
        public static final int id = 0;
        public static final int mac = 1;
        public static final int ipv4 = 2;
        public static final int ipv6 = 3;
        public static final int alsa = 4;
    }
}
