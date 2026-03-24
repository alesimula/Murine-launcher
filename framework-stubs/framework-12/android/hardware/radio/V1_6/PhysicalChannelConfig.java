package android.hardware.radio.V1_6;

public final class PhysicalChannelConfig {
    public int status;
    public int rat;
    public int downlinkChannelNumber;
    public int uplinkChannelNumber;
    public int cellBandwidthDownlinkKhz;
    public int cellBandwidthUplinkKhz;
    public java.util.ArrayList<java.lang.Integer> contextIds;
    public int physicalCellId;
    public android.hardware.radio.V1_6.PhysicalChannelConfig.Band band;
    public PhysicalChannelConfig() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_6.PhysicalChannelConfig> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_6.PhysicalChannelConfig> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

    public static final class Band {
        private byte hidl_d;
        private java.lang.Object hidl_o;
        public Band() {}
        public void geranBand(int p0) {}
        public int geranBand() { return 0; }
        public void utranBand(int p0) {}
        public int utranBand() { return 0; }
        public void eutranBand(int p0) {}
        public int eutranBand() { return 0; }
        public void ngranBand(int p0) {}
        public int ngranBand() { return 0; }
        public byte getDiscriminator() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.radio.V1_6.PhysicalChannelConfig.Band> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_6.PhysicalChannelConfig.Band> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

        public static final class hidl_discriminator {
            public static final byte geranBand = 0;
            public static final byte utranBand = 1;
            public static final byte eutranBand = 2;
            public static final byte ngranBand = 3;
            public static final java.lang.String getName(byte p0) { return null; }
            private hidl_discriminator() {}
        }
    }
}
