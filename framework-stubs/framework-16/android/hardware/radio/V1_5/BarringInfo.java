package android.hardware.radio.V1_5;

public final class BarringInfo {
    public int serviceType;
    public int barringType;
    public android.hardware.radio.V1_5.BarringInfo.BarringTypeSpecificInfo barringTypeSpecificInfo;
    public BarringInfo() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_5.BarringInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.BarringInfo> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

    public static final class BarringType {
        public static final int NONE = 0;
        public static final int CONDITIONAL = 1;
        public static final int UNCONDITIONAL = 2;
        public BarringType() {}
        public static final java.lang.String toString(int p0) { return null; }
        public static final java.lang.String dumpBitfield(int p0) { return null; }
    }

    public static final class BarringTypeSpecificInfo {
        public BarringTypeSpecificInfo() {}
        public void noinit(android.internal.hidl.safe_union.V1_0.Monostate p0) {}
        public android.internal.hidl.safe_union.V1_0.Monostate noinit() { return null; }
        public void conditional(android.hardware.radio.V1_5.BarringInfo.BarringTypeSpecificInfo.Conditional p0) {}
        public android.hardware.radio.V1_5.BarringInfo.BarringTypeSpecificInfo.Conditional conditional() { return null; }
        public byte getDiscriminator() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.radio.V1_5.BarringInfo.BarringTypeSpecificInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.BarringInfo.BarringTypeSpecificInfo> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

        public static final class Conditional {
            public int factor;
            public int timeSeconds;
            public boolean isBarred;
            public Conditional() {}
            public final boolean equals(java.lang.Object p0) { return false; }
            public final int hashCode() { return 0; }
            public final java.lang.String toString() { return null; }
            public final void readFromParcel(android.os.HwParcel p0) {}
            public static final java.util.ArrayList<android.hardware.radio.V1_5.BarringInfo.BarringTypeSpecificInfo.Conditional> readVectorFromParcel(android.os.HwParcel p0) { return null; }
            public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
            public final void writeToParcel(android.os.HwParcel p0) {}
            public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.BarringInfo.BarringTypeSpecificInfo.Conditional> p1) {}
            public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
        }

        public static final class hidl_discriminator {
            public static final byte noinit = 0;
            public static final byte conditional = 1;
            public static final java.lang.String getName(byte p0) { return null; }
        }
    }

    public static final class ServiceType {
        public static final int CS_SERVICE = 0;
        public static final int PS_SERVICE = 1;
        public static final int CS_VOICE = 2;
        public static final int MO_SIGNALLING = 3;
        public static final int MO_DATA = 4;
        public static final int CS_FALLBACK = 5;
        public static final int MMTEL_VOICE = 6;
        public static final int MMTEL_VIDEO = 7;
        public static final int EMERGENCY = 8;
        public static final int SMS = 9;
        public static final int OPERATOR_1 = 1001;
        public static final int OPERATOR_2 = 1002;
        public static final int OPERATOR_3 = 1003;
        public static final int OPERATOR_4 = 1004;
        public static final int OPERATOR_5 = 1005;
        public static final int OPERATOR_6 = 1006;
        public static final int OPERATOR_7 = 1007;
        public static final int OPERATOR_8 = 1008;
        public static final int OPERATOR_9 = 1009;
        public static final int OPERATOR_10 = 1010;
        public static final int OPERATOR_11 = 1011;
        public static final int OPERATOR_12 = 1012;
        public static final int OPERATOR_13 = 1013;
        public static final int OPERATOR_14 = 1014;
        public static final int OPERATOR_15 = 1015;
        public static final int OPERATOR_16 = 1016;
        public static final int OPERATOR_17 = 1017;
        public static final int OPERATOR_18 = 1018;
        public static final int OPERATOR_19 = 1019;
        public static final int OPERATOR_20 = 1020;
        public static final int OPERATOR_21 = 1021;
        public static final int OPERATOR_22 = 1022;
        public static final int OPERATOR_23 = 1023;
        public static final int OPERATOR_24 = 1024;
        public static final int OPERATOR_25 = 1025;
        public static final int OPERATOR_26 = 1026;
        public static final int OPERATOR_27 = 1027;
        public static final int OPERATOR_28 = 1028;
        public static final int OPERATOR_29 = 1029;
        public static final int OPERATOR_30 = 1030;
        public static final int OPERATOR_31 = 1031;
        public static final int OPERATOR_32 = 1032;
        public ServiceType() {}
        public static final java.lang.String toString(int p0) { return null; }
        public static final java.lang.String dumpBitfield(int p0) { return null; }
    }
}
