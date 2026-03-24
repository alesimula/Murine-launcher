package android.hardware.tv.tuner;

public final class DemuxFilterSettings implements android.os.Parcelable {
    public static final int ts = 0;
    public static final int mmtp = 1;
    public static final int ip = 2;
    public static final int tlv = 3;
    public static final int alp = 4;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterSettings> CREATOR = null;
    public DemuxFilterSettings() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxFilterSettings ts(android.hardware.tv.tuner.DemuxTsFilterSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxTsFilterSettings getTs() { return null; }
    public void setTs(android.hardware.tv.tuner.DemuxTsFilterSettings p0) {}
    public static android.hardware.tv.tuner.DemuxFilterSettings mmtp(android.hardware.tv.tuner.DemuxMmtpFilterSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxMmtpFilterSettings getMmtp() { return null; }
    public void setMmtp(android.hardware.tv.tuner.DemuxMmtpFilterSettings p0) {}
    public static android.hardware.tv.tuner.DemuxFilterSettings ip(android.hardware.tv.tuner.DemuxIpFilterSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxIpFilterSettings getIp() { return null; }
    public void setIp(android.hardware.tv.tuner.DemuxIpFilterSettings p0) {}
    public static android.hardware.tv.tuner.DemuxFilterSettings tlv(android.hardware.tv.tuner.DemuxTlvFilterSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxTlvFilterSettings getTlv() { return null; }
    public void setTlv(android.hardware.tv.tuner.DemuxTlvFilterSettings p0) {}
    public static android.hardware.tv.tuner.DemuxFilterSettings alp(android.hardware.tv.tuner.DemuxAlpFilterSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxAlpFilterSettings getAlp() { return null; }
    public void setAlp(android.hardware.tv.tuner.DemuxAlpFilterSettings p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int ts = 0;
        public static final int mmtp = 1;
        public static final int ip = 2;
        public static final int tlv = 3;
        public static final int alp = 4;
    }
}
