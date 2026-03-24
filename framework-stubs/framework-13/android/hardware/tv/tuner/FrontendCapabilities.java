package android.hardware.tv.tuner;

public final class FrontendCapabilities implements android.os.Parcelable {
    public static final int analogCaps = 0;
    public static final int atscCaps = 1;
    public static final int atsc3Caps = 2;
    public static final int dtmbCaps = 3;
    public static final int dvbsCaps = 4;
    public static final int dvbcCaps = 5;
    public static final int dvbtCaps = 6;
    public static final int isdbsCaps = 7;
    public static final int isdbs3Caps = 8;
    public static final int isdbtCaps = 9;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendCapabilities> CREATOR = null;
    public FrontendCapabilities() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.FrontendCapabilities analogCaps(android.hardware.tv.tuner.FrontendAnalogCapabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendAnalogCapabilities getAnalogCaps() { return null; }
    public void setAnalogCaps(android.hardware.tv.tuner.FrontendAnalogCapabilities p0) {}
    public static android.hardware.tv.tuner.FrontendCapabilities atscCaps(android.hardware.tv.tuner.FrontendAtscCapabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendAtscCapabilities getAtscCaps() { return null; }
    public void setAtscCaps(android.hardware.tv.tuner.FrontendAtscCapabilities p0) {}
    public static android.hardware.tv.tuner.FrontendCapabilities atsc3Caps(android.hardware.tv.tuner.FrontendAtsc3Capabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendAtsc3Capabilities getAtsc3Caps() { return null; }
    public void setAtsc3Caps(android.hardware.tv.tuner.FrontendAtsc3Capabilities p0) {}
    public static android.hardware.tv.tuner.FrontendCapabilities dtmbCaps(android.hardware.tv.tuner.FrontendDtmbCapabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendDtmbCapabilities getDtmbCaps() { return null; }
    public void setDtmbCaps(android.hardware.tv.tuner.FrontendDtmbCapabilities p0) {}
    public static android.hardware.tv.tuner.FrontendCapabilities dvbsCaps(android.hardware.tv.tuner.FrontendDvbsCapabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendDvbsCapabilities getDvbsCaps() { return null; }
    public void setDvbsCaps(android.hardware.tv.tuner.FrontendDvbsCapabilities p0) {}
    public static android.hardware.tv.tuner.FrontendCapabilities dvbcCaps(android.hardware.tv.tuner.FrontendDvbcCapabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendDvbcCapabilities getDvbcCaps() { return null; }
    public void setDvbcCaps(android.hardware.tv.tuner.FrontendDvbcCapabilities p0) {}
    public static android.hardware.tv.tuner.FrontendCapabilities dvbtCaps(android.hardware.tv.tuner.FrontendDvbtCapabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendDvbtCapabilities getDvbtCaps() { return null; }
    public void setDvbtCaps(android.hardware.tv.tuner.FrontendDvbtCapabilities p0) {}
    public static android.hardware.tv.tuner.FrontendCapabilities isdbsCaps(android.hardware.tv.tuner.FrontendIsdbsCapabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendIsdbsCapabilities getIsdbsCaps() { return null; }
    public void setIsdbsCaps(android.hardware.tv.tuner.FrontendIsdbsCapabilities p0) {}
    public static android.hardware.tv.tuner.FrontendCapabilities isdbs3Caps(android.hardware.tv.tuner.FrontendIsdbs3Capabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendIsdbs3Capabilities getIsdbs3Caps() { return null; }
    public void setIsdbs3Caps(android.hardware.tv.tuner.FrontendIsdbs3Capabilities p0) {}
    public static android.hardware.tv.tuner.FrontendCapabilities isdbtCaps(android.hardware.tv.tuner.FrontendIsdbtCapabilities p0) { return null; }
    public android.hardware.tv.tuner.FrontendIsdbtCapabilities getIsdbtCaps() { return null; }
    public void setIsdbtCaps(android.hardware.tv.tuner.FrontendIsdbtCapabilities p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int analogCaps = 0;
        public static final int atscCaps = 1;
        public static final int atsc3Caps = 2;
        public static final int dtmbCaps = 3;
        public static final int dvbsCaps = 4;
        public static final int dvbcCaps = 5;
        public static final int dvbtCaps = 6;
        public static final int isdbsCaps = 7;
        public static final int isdbs3Caps = 8;
        public static final int isdbtCaps = 9;
    }
}
