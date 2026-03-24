package android.hardware.tv.tuner;

public final class FrontendSettings implements android.os.Parcelable {
    public static final int analog = 0;
    public static final int atsc = 1;
    public static final int atsc3 = 2;
    public static final int dvbs = 3;
    public static final int dvbc = 4;
    public static final int dvbt = 5;
    public static final int isdbs = 6;
    public static final int isdbs3 = 7;
    public static final int isdbt = 8;
    public static final int dtmb = 9;
    public static final int iptv = 10;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendSettings> CREATOR = null;
    public FrontendSettings() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.FrontendSettings analog(android.hardware.tv.tuner.FrontendAnalogSettings p0) { return null; }
    public android.hardware.tv.tuner.FrontendAnalogSettings getAnalog() { return null; }
    public void setAnalog(android.hardware.tv.tuner.FrontendAnalogSettings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings atsc(android.hardware.tv.tuner.FrontendAtscSettings p0) { return null; }
    public android.hardware.tv.tuner.FrontendAtscSettings getAtsc() { return null; }
    public void setAtsc(android.hardware.tv.tuner.FrontendAtscSettings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings atsc3(android.hardware.tv.tuner.FrontendAtsc3Settings p0) { return null; }
    public android.hardware.tv.tuner.FrontendAtsc3Settings getAtsc3() { return null; }
    public void setAtsc3(android.hardware.tv.tuner.FrontendAtsc3Settings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings dvbs(android.hardware.tv.tuner.FrontendDvbsSettings p0) { return null; }
    public android.hardware.tv.tuner.FrontendDvbsSettings getDvbs() { return null; }
    public void setDvbs(android.hardware.tv.tuner.FrontendDvbsSettings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings dvbc(android.hardware.tv.tuner.FrontendDvbcSettings p0) { return null; }
    public android.hardware.tv.tuner.FrontendDvbcSettings getDvbc() { return null; }
    public void setDvbc(android.hardware.tv.tuner.FrontendDvbcSettings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings dvbt(android.hardware.tv.tuner.FrontendDvbtSettings p0) { return null; }
    public android.hardware.tv.tuner.FrontendDvbtSettings getDvbt() { return null; }
    public void setDvbt(android.hardware.tv.tuner.FrontendDvbtSettings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings isdbs(android.hardware.tv.tuner.FrontendIsdbsSettings p0) { return null; }
    public android.hardware.tv.tuner.FrontendIsdbsSettings getIsdbs() { return null; }
    public void setIsdbs(android.hardware.tv.tuner.FrontendIsdbsSettings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings isdbs3(android.hardware.tv.tuner.FrontendIsdbs3Settings p0) { return null; }
    public android.hardware.tv.tuner.FrontendIsdbs3Settings getIsdbs3() { return null; }
    public void setIsdbs3(android.hardware.tv.tuner.FrontendIsdbs3Settings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings isdbt(android.hardware.tv.tuner.FrontendIsdbtSettings p0) { return null; }
    public android.hardware.tv.tuner.FrontendIsdbtSettings getIsdbt() { return null; }
    public void setIsdbt(android.hardware.tv.tuner.FrontendIsdbtSettings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings dtmb(android.hardware.tv.tuner.FrontendDtmbSettings p0) { return null; }
    public android.hardware.tv.tuner.FrontendDtmbSettings getDtmb() { return null; }
    public void setDtmb(android.hardware.tv.tuner.FrontendDtmbSettings p0) {}
    public static android.hardware.tv.tuner.FrontendSettings iptv(android.hardware.tv.tuner.FrontendIptvSettings p0) { return null; }
    public android.hardware.tv.tuner.FrontendIptvSettings getIptv() { return null; }
    public void setIptv(android.hardware.tv.tuner.FrontendIptvSettings p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int analog = 0;
        public static final int atsc = 1;
        public static final int atsc3 = 2;
        public static final int dvbs = 3;
        public static final int dvbc = 4;
        public static final int dvbt = 5;
        public static final int isdbs = 6;
        public static final int isdbs3 = 7;
        public static final int isdbt = 8;
        public static final int dtmb = 9;
        public static final int iptv = 10;
    }
}
