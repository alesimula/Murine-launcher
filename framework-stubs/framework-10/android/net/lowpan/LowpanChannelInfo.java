package android.net.lowpan;

public class LowpanChannelInfo implements android.os.Parcelable {
    public static final int UNKNOWN_POWER = 2147483647;
    public static final float UNKNOWN_FREQUENCY = 0.0f;
    public static final float UNKNOWN_BANDWIDTH = 0.0f;
    private int mIndex;
    private java.lang.String mName;
    private float mSpectrumCenterFrequency;
    private float mSpectrumBandwidth;
    private int mMaxTransmitPower;
    private boolean mIsMaskedByRegulatoryDomain;
    public static final android.os.Parcelable.Creator<android.net.lowpan.LowpanChannelInfo> CREATOR = null;
    public static android.net.lowpan.LowpanChannelInfo getChannelInfoForIeee802154Page0(int p0) { return null; }
    private LowpanChannelInfo() {}
    private LowpanChannelInfo(int p0, java.lang.String p1, float p2, float p3) {}
    public java.lang.String getName() { return null; }
    public int getIndex() { return 0; }
    public int getMaxTransmitPower() { return 0; }
    public boolean isMaskedByRegulatoryDomain() { return false; }
    public float getSpectrumCenterFrequency() { return 0.0f; }
    public float getSpectrumBandwidth() { return 0.0f; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
