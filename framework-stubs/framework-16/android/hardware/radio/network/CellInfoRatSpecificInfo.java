package android.hardware.radio.network;

public final class CellInfoRatSpecificInfo implements android.os.Parcelable {
    public static final int gsm = 0;
    public static final int wcdma = 1;
    public static final int tdscdma = 2;
    public static final int lte = 3;
    public static final int nr = 4;
    public static final int cdma = 5;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellInfoRatSpecificInfo> CREATOR = null;
    public CellInfoRatSpecificInfo() {}
    public int getTag() { return 0; }
    public static android.hardware.radio.network.CellInfoRatSpecificInfo gsm(android.hardware.radio.network.CellInfoGsm p0) { return null; }
    public android.hardware.radio.network.CellInfoGsm getGsm() { return null; }
    public void setGsm(android.hardware.radio.network.CellInfoGsm p0) {}
    public static android.hardware.radio.network.CellInfoRatSpecificInfo wcdma(android.hardware.radio.network.CellInfoWcdma p0) { return null; }
    public android.hardware.radio.network.CellInfoWcdma getWcdma() { return null; }
    public void setWcdma(android.hardware.radio.network.CellInfoWcdma p0) {}
    public static android.hardware.radio.network.CellInfoRatSpecificInfo tdscdma(android.hardware.radio.network.CellInfoTdscdma p0) { return null; }
    public android.hardware.radio.network.CellInfoTdscdma getTdscdma() { return null; }
    public void setTdscdma(android.hardware.radio.network.CellInfoTdscdma p0) {}
    public static android.hardware.radio.network.CellInfoRatSpecificInfo lte(android.hardware.radio.network.CellInfoLte p0) { return null; }
    public android.hardware.radio.network.CellInfoLte getLte() { return null; }
    public void setLte(android.hardware.radio.network.CellInfoLte p0) {}
    public static android.hardware.radio.network.CellInfoRatSpecificInfo nr(android.hardware.radio.network.CellInfoNr p0) { return null; }
    public android.hardware.radio.network.CellInfoNr getNr() { return null; }
    public void setNr(android.hardware.radio.network.CellInfoNr p0) {}
    @java.lang.Deprecated
    public static android.hardware.radio.network.CellInfoRatSpecificInfo cdma(android.hardware.radio.network.CellInfoCdma p0) { return null; }
    public android.hardware.radio.network.CellInfoCdma getCdma() { return null; }
    public void setCdma(android.hardware.radio.network.CellInfoCdma p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static @interface Tag {
        public static final int gsm = 0;
        public static final int wcdma = 1;
        public static final int tdscdma = 2;
        public static final int lte = 3;
        public static final int nr = 4;
        @java.lang.Deprecated
        public static final int cdma = 5;
    }
}
