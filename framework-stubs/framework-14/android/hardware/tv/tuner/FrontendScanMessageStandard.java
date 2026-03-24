package android.hardware.tv.tuner;

public final class FrontendScanMessageStandard implements android.os.Parcelable {
    public static final int sStd = 0;
    public static final int tStd = 1;
    public static final int sifStd = 2;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendScanMessageStandard> CREATOR = null;
    public FrontendScanMessageStandard() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.FrontendScanMessageStandard sStd(byte p0) { return null; }
    public byte getSStd() { return 0; }
    public void setSStd(byte p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessageStandard tStd(byte p0) { return null; }
    public byte getTStd() { return 0; }
    public void setTStd(byte p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessageStandard sifStd(int p0) { return null; }
    public int getSifStd() { return 0; }
    public void setSifStd(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int sStd = 0;
        public static final int tStd = 1;
        public static final int sifStd = 2;
    }
}
