package android.hardware.tv.tuner;

public final class DemuxPid implements android.os.Parcelable {
    public static final int tPid = 0;
    public static final int mmtpPid = 1;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxPid> CREATOR = null;
    public DemuxPid() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxPid tPid(int p0) { return null; }
    public int getTPid() { return 0; }
    public void setTPid(int p0) {}
    public static android.hardware.tv.tuner.DemuxPid mmtpPid(int p0) { return null; }
    public int getMmtpPid() { return 0; }
    public void setMmtpPid(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int tPid = 0;
        public static final int mmtpPid = 1;
    }
}
