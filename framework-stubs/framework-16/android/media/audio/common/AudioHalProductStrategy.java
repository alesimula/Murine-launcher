package android.media.audio.common;

public class AudioHalProductStrategy implements android.os.Parcelable {
    public int id;
    public android.media.audio.common.AudioHalAttributesGroup[] attributesGroups;
    public java.lang.String name;
    public int zoneId;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalProductStrategy> CREATOR = null;
    public static final int VENDOR_STRATEGY_ID_START = 1000;
    public AudioHalProductStrategy() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static @interface ZoneId {
        public static final int DEFAULT = 0;
    }
}
