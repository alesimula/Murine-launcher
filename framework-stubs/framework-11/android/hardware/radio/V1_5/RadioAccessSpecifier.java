package android.hardware.radio.V1_5;

public final class RadioAccessSpecifier {
    public int radioAccessNetwork;
    public android.hardware.radio.V1_5.RadioAccessSpecifier.Bands bands;
    public java.util.ArrayList<java.lang.Integer> channels;
    public RadioAccessSpecifier() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_5.RadioAccessSpecifier> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.RadioAccessSpecifier> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

    public static final class Bands {
        private byte hidl_d;
        private java.lang.Object hidl_o;
        public Bands() {}
        public void geranBands(java.util.ArrayList<java.lang.Integer> p0) {}
        public java.util.ArrayList<java.lang.Integer> geranBands() { return null; }
        public void utranBands(java.util.ArrayList<java.lang.Integer> p0) {}
        public java.util.ArrayList<java.lang.Integer> utranBands() { return null; }
        public void eutranBands(java.util.ArrayList<java.lang.Integer> p0) {}
        public java.util.ArrayList<java.lang.Integer> eutranBands() { return null; }
        public void ngranBands(java.util.ArrayList<java.lang.Integer> p0) {}
        public java.util.ArrayList<java.lang.Integer> ngranBands() { return null; }
        public byte getDiscriminator() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.radio.V1_5.RadioAccessSpecifier.Bands> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.RadioAccessSpecifier.Bands> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

        public static final class hidl_discriminator {
            public static final byte geranBands = 0;
            public static final byte utranBands = 1;
            public static final byte eutranBands = 2;
            public static final byte ngranBands = 3;
            public static final java.lang.String getName(byte p0) { return null; }
            private hidl_discriminator() {}
        }
    }
}
