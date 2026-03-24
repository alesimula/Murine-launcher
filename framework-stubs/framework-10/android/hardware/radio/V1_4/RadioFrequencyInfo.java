package android.hardware.radio.V1_4;

public final class RadioFrequencyInfo {
    private byte hidl_d;
    private java.lang.Object hidl_o;
    public RadioFrequencyInfo() {}
    public void range(int p0) {}
    public int range() { return 0; }
    public void channelNumber(int p0) {}
    public int channelNumber() { return 0; }
    public byte getDiscriminator() { return 0; }
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_4.RadioFrequencyInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_4.RadioFrequencyInfo> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

    public static final class hidl_discriminator {
        public static final byte range = 0;
        public static final byte channelNumber = 1;
        public static final java.lang.String getName(byte p0) { return null; }
        private hidl_discriminator() {}
    }
}
