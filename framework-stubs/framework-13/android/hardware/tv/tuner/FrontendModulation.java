package android.hardware.tv.tuner;

public final class FrontendModulation implements android.os.Parcelable {
    public static final int dvbc = 0;
    public static final int dvbs = 1;
    public static final int dvbt = 2;
    public static final int isdbs = 3;
    public static final int isdbs3 = 4;
    public static final int isdbt = 5;
    public static final int atsc = 6;
    public static final int atsc3 = 7;
    public static final int dtmb = 8;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendModulation> CREATOR = null;
    public FrontendModulation() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.FrontendModulation dvbc(int p0) { return null; }
    public int getDvbc() { return 0; }
    public void setDvbc(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulation dvbs(int p0) { return null; }
    public int getDvbs() { return 0; }
    public void setDvbs(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulation dvbt(int p0) { return null; }
    public int getDvbt() { return 0; }
    public void setDvbt(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulation isdbs(int p0) { return null; }
    public int getIsdbs() { return 0; }
    public void setIsdbs(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulation isdbs3(int p0) { return null; }
    public int getIsdbs3() { return 0; }
    public void setIsdbs3(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulation isdbt(int p0) { return null; }
    public int getIsdbt() { return 0; }
    public void setIsdbt(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulation atsc(int p0) { return null; }
    public int getAtsc() { return 0; }
    public void setAtsc(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulation atsc3(int p0) { return null; }
    public int getAtsc3() { return 0; }
    public void setAtsc3(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulation dtmb(int p0) { return null; }
    public int getDtmb() { return 0; }
    public void setDtmb(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int dvbc = 0;
        public static final int dvbs = 1;
        public static final int dvbt = 2;
        public static final int isdbs = 3;
        public static final int isdbs3 = 4;
        public static final int isdbt = 5;
        public static final int atsc = 6;
        public static final int atsc3 = 7;
        public static final int dtmb = 8;
    }
}
