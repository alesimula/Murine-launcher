package android.hardware.radio.network;

public final class CellIdentity implements android.os.Parcelable {
    public static final int noinit = 0;
    public static final int gsm = 1;
    public static final int wcdma = 2;
    public static final int tdscdma = 3;
    public static final int cdma = 4;
    public static final int lte = 5;
    public static final int nr = 6;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentity> CREATOR = null;
    public CellIdentity() {}
    public int getTag() { return 0; }
    public static android.hardware.radio.network.CellIdentity noinit(boolean p0) { return null; }
    public boolean getNoinit() { return false; }
    public void setNoinit(boolean p0) {}
    public static android.hardware.radio.network.CellIdentity gsm(android.hardware.radio.network.CellIdentityGsm p0) { return null; }
    public android.hardware.radio.network.CellIdentityGsm getGsm() { return null; }
    public void setGsm(android.hardware.radio.network.CellIdentityGsm p0) {}
    public static android.hardware.radio.network.CellIdentity wcdma(android.hardware.radio.network.CellIdentityWcdma p0) { return null; }
    public android.hardware.radio.network.CellIdentityWcdma getWcdma() { return null; }
    public void setWcdma(android.hardware.radio.network.CellIdentityWcdma p0) {}
    public static android.hardware.radio.network.CellIdentity tdscdma(android.hardware.radio.network.CellIdentityTdscdma p0) { return null; }
    public android.hardware.radio.network.CellIdentityTdscdma getTdscdma() { return null; }
    public void setTdscdma(android.hardware.radio.network.CellIdentityTdscdma p0) {}
    public static android.hardware.radio.network.CellIdentity cdma(android.hardware.radio.network.CellIdentityCdma p0) { return null; }
    public android.hardware.radio.network.CellIdentityCdma getCdma() { return null; }
    public void setCdma(android.hardware.radio.network.CellIdentityCdma p0) {}
    public static android.hardware.radio.network.CellIdentity lte(android.hardware.radio.network.CellIdentityLte p0) { return null; }
    public android.hardware.radio.network.CellIdentityLte getLte() { return null; }
    public void setLte(android.hardware.radio.network.CellIdentityLte p0) {}
    public static android.hardware.radio.network.CellIdentity nr(android.hardware.radio.network.CellIdentityNr p0) { return null; }
    public android.hardware.radio.network.CellIdentityNr getNr() { return null; }
    public void setNr(android.hardware.radio.network.CellIdentityNr p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static @interface Tag {
        public static final int noinit = 0;
        public static final int gsm = 1;
        public static final int wcdma = 2;
        public static final int tdscdma = 3;
        public static final int cdma = 4;
        public static final int lte = 5;
        public static final int nr = 6;
    }
}
