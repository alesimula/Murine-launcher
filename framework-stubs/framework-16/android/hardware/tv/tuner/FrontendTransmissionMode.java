package android.hardware.tv.tuner;

public final class FrontendTransmissionMode implements android.os.Parcelable {
    public static final int dvbt = 0;
    public static final int isdbt = 1;
    public static final int dtmb = 2;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendTransmissionMode> CREATOR = null;
    public FrontendTransmissionMode() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.FrontendTransmissionMode dvbt(int p0) { return null; }
    public int getDvbt() { return 0; }
    public void setDvbt(int p0) {}
    public static android.hardware.tv.tuner.FrontendTransmissionMode isdbt(int p0) { return null; }
    public int getIsdbt() { return 0; }
    public void setIsdbt(int p0) {}
    public static android.hardware.tv.tuner.FrontendTransmissionMode dtmb(int p0) { return null; }
    public int getDtmb() { return 0; }
    public void setDtmb(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int dvbt = 0;
        public static final int isdbt = 1;
        public static final int dtmb = 2;
    }
}
