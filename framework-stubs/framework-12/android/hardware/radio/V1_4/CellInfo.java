package android.hardware.radio.V1_4;

public final class CellInfo {
    public boolean isRegistered;
    public int connectionStatus;
    public android.hardware.radio.V1_4.CellInfo.Info info;
    public CellInfo() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_4.CellInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_4.CellInfo> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

    public static final class Info {
        private byte hidl_d;
        private java.lang.Object hidl_o;
        public Info() {}
        public void gsm(android.hardware.radio.V1_2.CellInfoGsm p0) {}
        public android.hardware.radio.V1_2.CellInfoGsm gsm() { return null; }
        public void cdma(android.hardware.radio.V1_2.CellInfoCdma p0) {}
        public android.hardware.radio.V1_2.CellInfoCdma cdma() { return null; }
        public void wcdma(android.hardware.radio.V1_2.CellInfoWcdma p0) {}
        public android.hardware.radio.V1_2.CellInfoWcdma wcdma() { return null; }
        public void tdscdma(android.hardware.radio.V1_2.CellInfoTdscdma p0) {}
        public android.hardware.radio.V1_2.CellInfoTdscdma tdscdma() { return null; }
        public void lte(android.hardware.radio.V1_4.CellInfoLte p0) {}
        public android.hardware.radio.V1_4.CellInfoLte lte() { return null; }
        public void nr(android.hardware.radio.V1_4.CellInfoNr p0) {}
        public android.hardware.radio.V1_4.CellInfoNr nr() { return null; }
        public byte getDiscriminator() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.radio.V1_4.CellInfo.Info> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_4.CellInfo.Info> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

        public static final class hidl_discriminator {
            public static final byte gsm = 0;
            public static final byte cdma = 1;
            public static final byte wcdma = 2;
            public static final byte tdscdma = 3;
            public static final byte lte = 4;
            public static final byte nr = 5;
            public static final java.lang.String getName(byte p0) { return null; }
            private hidl_discriminator() {}
        }
    }
}
