package android.hardware.tv.tuner;

public class FrontendIptvSettings implements android.os.Parcelable {
    public int protocol;
    public android.hardware.tv.tuner.FrontendIptvSettingsFec fec;
    public int igmp;
    public long bitrate;
    public android.hardware.tv.tuner.DemuxIpAddress ipAddr;
    public java.lang.String contentUrl;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIptvSettings> CREATOR = null;
    public FrontendIptvSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
