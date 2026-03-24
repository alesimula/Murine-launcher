package android.media.audio.common;

public class AudioDeviceDescription implements android.os.Parcelable {
    public int type;
    public java.lang.String connection;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioDeviceDescription> CREATOR = null;
    public static final java.lang.String CONNECTION_ANALOG = "analog";
    public static final java.lang.String CONNECTION_BT_A2DP = "bt-a2dp";
    public static final java.lang.String CONNECTION_BT_LE = "bt-le";
    public static final java.lang.String CONNECTION_BT_SCO = "bt-sco";
    public static final java.lang.String CONNECTION_BUS = "bus";
    public static final java.lang.String CONNECTION_HDMI = "hdmi";
    public static final java.lang.String CONNECTION_HDMI_ARC = "hdmi-arc";
    public static final java.lang.String CONNECTION_HDMI_EARC = "hdmi-earc";
    public static final java.lang.String CONNECTION_IP_V4 = "ip-v4";
    public static final java.lang.String CONNECTION_SPDIF = "spdif";
    public static final java.lang.String CONNECTION_WIRELESS = "wireless";
    public static final java.lang.String CONNECTION_USB = "usb";
    public AudioDeviceDescription() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
