package android.hardware.radio.V1_5;

public final class CellIdentity {
    private byte hidl_d;
    private java.lang.Object hidl_o;
    public CellIdentity() {}
    public void noinit(android.internal.hidl.safe_union.V1_0.Monostate p0) {}
    public android.internal.hidl.safe_union.V1_0.Monostate noinit() { return null; }
    public void gsm(android.hardware.radio.V1_5.CellIdentityGsm p0) {}
    public android.hardware.radio.V1_5.CellIdentityGsm gsm() { return null; }
    public void wcdma(android.hardware.radio.V1_5.CellIdentityWcdma p0) {}
    public android.hardware.radio.V1_5.CellIdentityWcdma wcdma() { return null; }
    public void tdscdma(android.hardware.radio.V1_5.CellIdentityTdscdma p0) {}
    public android.hardware.radio.V1_5.CellIdentityTdscdma tdscdma() { return null; }
    public void cdma(android.hardware.radio.V1_2.CellIdentityCdma p0) {}
    public android.hardware.radio.V1_2.CellIdentityCdma cdma() { return null; }
    public void lte(android.hardware.radio.V1_5.CellIdentityLte p0) {}
    public android.hardware.radio.V1_5.CellIdentityLte lte() { return null; }
    public void nr(android.hardware.radio.V1_5.CellIdentityNr p0) {}
    public android.hardware.radio.V1_5.CellIdentityNr nr() { return null; }
    public byte getDiscriminator() { return 0; }
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_5.CellIdentity> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.CellIdentity> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

    public static final class hidl_discriminator {
        public static final byte noinit = 0;
        public static final byte gsm = 1;
        public static final byte wcdma = 2;
        public static final byte tdscdma = 3;
        public static final byte cdma = 4;
        public static final byte lte = 5;
        public static final byte nr = 6;
        public static final java.lang.String getName(byte p0) { return null; }
        private hidl_discriminator() {}
    }
}
