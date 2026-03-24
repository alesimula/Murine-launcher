package android.hardware.power;

public class ChannelConfig implements android.os.Parcelable {
    public android.hardware.common.fmq.MQDescriptor<android.hardware.power.ChannelMessage, java.lang.Byte> channelDescriptor;
    public android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> eventFlagDescriptor;
    public int readFlagBitmask;
    public int writeFlagBitmask;
    public static final android.os.Parcelable.Creator<android.hardware.power.ChannelConfig> CREATOR = null;
    public ChannelConfig() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
