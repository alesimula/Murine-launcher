package android.media.audio.common;

public class MicrophoneDynamicInfo implements android.os.Parcelable {
    public java.lang.String id;
    public int[] channelMapping;
    public static final android.os.Parcelable.Creator<android.media.audio.common.MicrophoneDynamicInfo> CREATOR = null;
    public MicrophoneDynamicInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static @interface ChannelMapping {
        public static final int UNUSED = 0;
        public static final int DIRECT = 1;
        public static final int PROCESSED = 2;
    }
}
