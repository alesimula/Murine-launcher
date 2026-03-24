package android.hardware.tv.tuner;

public final class DemuxFilterSubType implements android.os.Parcelable {
    public static final int tsFilterType = 0;
    public static final int mmtpFilterType = 1;
    public static final int ipFilterType = 2;
    public static final int tlvFilterType = 3;
    public static final int alpFilterType = 4;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterSubType> CREATOR = null;
    public DemuxFilterSubType() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxFilterSubType tsFilterType(int p0) { return null; }
    public int getTsFilterType() { return 0; }
    public void setTsFilterType(int p0) {}
    public static android.hardware.tv.tuner.DemuxFilterSubType mmtpFilterType(int p0) { return null; }
    public int getMmtpFilterType() { return 0; }
    public void setMmtpFilterType(int p0) {}
    public static android.hardware.tv.tuner.DemuxFilterSubType ipFilterType(int p0) { return null; }
    public int getIpFilterType() { return 0; }
    public void setIpFilterType(int p0) {}
    public static android.hardware.tv.tuner.DemuxFilterSubType tlvFilterType(int p0) { return null; }
    public int getTlvFilterType() { return 0; }
    public void setTlvFilterType(int p0) {}
    public static android.hardware.tv.tuner.DemuxFilterSubType alpFilterType(int p0) { return null; }
    public int getAlpFilterType() { return 0; }
    public void setAlpFilterType(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int tsFilterType = 0;
        public static final int mmtpFilterType = 1;
        public static final int ipFilterType = 2;
        public static final int tlvFilterType = 3;
        public static final int alpFilterType = 4;
    }
}
