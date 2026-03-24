package android.hardware.tv.tuner;

public final class FrontendStandardExt implements android.os.Parcelable {
    public static final int dvbsStandardExt = 0;
    public static final int dvbtStandardExt = 1;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendStandardExt> CREATOR = null;
    public FrontendStandardExt() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.FrontendStandardExt dvbsStandardExt(byte p0) { return null; }
    public byte getDvbsStandardExt() { return 0; }
    public void setDvbsStandardExt(byte p0) {}
    public static android.hardware.tv.tuner.FrontendStandardExt dvbtStandardExt(byte p0) { return null; }
    public byte getDvbtStandardExt() { return 0; }
    public void setDvbtStandardExt(byte p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int dvbsStandardExt = 0;
        public static final int dvbtStandardExt = 1;
    }
}
