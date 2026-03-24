package android.hardware.tv.tuner;

public final class FrontendModulationStatus implements android.os.Parcelable {
    public static final int dvbc = 0;
    public static final int dvbs = 1;
    public static final int isdbs = 2;
    public static final int isdbs3 = 3;
    public static final int isdbt = 4;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendModulationStatus> CREATOR = null;
    public FrontendModulationStatus() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.FrontendModulationStatus dvbc(int p0) { return null; }
    public int getDvbc() { return 0; }
    public void setDvbc(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulationStatus dvbs(int p0) { return null; }
    public int getDvbs() { return 0; }
    public void setDvbs(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulationStatus isdbs(int p0) { return null; }
    public int getIsdbs() { return 0; }
    public void setIsdbs(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulationStatus isdbs3(int p0) { return null; }
    public int getIsdbs3() { return 0; }
    public void setIsdbs3(int p0) {}
    public static android.hardware.tv.tuner.FrontendModulationStatus isdbt(int p0) { return null; }
    public int getIsdbt() { return 0; }
    public void setIsdbt(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int dvbc = 0;
        public static final int dvbs = 1;
        public static final int isdbs = 2;
        public static final int isdbs3 = 3;
        public static final int isdbt = 4;
    }
}
