package android.hardware.radio.V1_6;

public final class MaybePort {
    private byte hidl_d;
    private java.lang.Object hidl_o;
    public MaybePort() {}
    public void noinit(android.internal.hidl.safe_union.V1_0.Monostate p0) {}
    public android.internal.hidl.safe_union.V1_0.Monostate noinit() { return null; }
    public void range(android.hardware.radio.V1_6.PortRange p0) {}
    public android.hardware.radio.V1_6.PortRange range() { return null; }
    public byte getDiscriminator() { return 0; }
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_6.MaybePort> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_6.MaybePort> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

    public static final class hidl_discriminator {
        public static final byte noinit = 0;
        public static final byte range = 1;
        public static final java.lang.String getName(byte p0) { return null; }
        private hidl_discriminator() {}
    }
}
