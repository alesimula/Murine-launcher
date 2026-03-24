package android.hardware.radio.network;

public final class AccessTechnologySpecificInfo implements android.os.Parcelable {
    public static final int noinit = 0;
    public static final int cdmaInfo = 1;
    public static final int eutranInfo = 2;
    public static final int ngranNrVopsInfo = 3;
    public static final int geranDtmSupported = 4;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.AccessTechnologySpecificInfo> CREATOR = null;
    public AccessTechnologySpecificInfo() {}
    public int getTag() { return 0; }
    public static android.hardware.radio.network.AccessTechnologySpecificInfo noinit(boolean p0) { return null; }
    public boolean getNoinit() { return false; }
    public void setNoinit(boolean p0) {}
    public static android.hardware.radio.network.AccessTechnologySpecificInfo cdmaInfo(android.hardware.radio.network.Cdma2000RegistrationInfo p0) { return null; }
    public android.hardware.radio.network.Cdma2000RegistrationInfo getCdmaInfo() { return null; }
    public void setCdmaInfo(android.hardware.radio.network.Cdma2000RegistrationInfo p0) {}
    public static android.hardware.radio.network.AccessTechnologySpecificInfo eutranInfo(android.hardware.radio.network.EutranRegistrationInfo p0) { return null; }
    public android.hardware.radio.network.EutranRegistrationInfo getEutranInfo() { return null; }
    public void setEutranInfo(android.hardware.radio.network.EutranRegistrationInfo p0) {}
    public static android.hardware.radio.network.AccessTechnologySpecificInfo ngranNrVopsInfo(android.hardware.radio.network.NrVopsInfo p0) { return null; }
    public android.hardware.radio.network.NrVopsInfo getNgranNrVopsInfo() { return null; }
    public void setNgranNrVopsInfo(android.hardware.radio.network.NrVopsInfo p0) {}
    public static android.hardware.radio.network.AccessTechnologySpecificInfo geranDtmSupported(boolean p0) { return null; }
    public boolean getGeranDtmSupported() { return false; }
    public void setGeranDtmSupported(boolean p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static @interface Tag {
        public static final int noinit = 0;
        public static final int cdmaInfo = 1;
        public static final int eutranInfo = 2;
        public static final int ngranNrVopsInfo = 3;
        public static final int geranDtmSupported = 4;
    }
}
