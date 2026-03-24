package android.hardware.radio.V1_5;

public final class RegStateResult {
    public int regState;
    public int rat;
    public int reasonForDenial;
    public android.hardware.radio.V1_5.CellIdentity cellIdentity;
    public java.lang.String registeredPlmn;
    public android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo accessTechnologySpecificInfo;
    public RegStateResult() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_5.RegStateResult> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.RegStateResult> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

    public static final class AccessTechnologySpecificInfo {
        public AccessTechnologySpecificInfo() {}
        public void noinit(android.internal.hidl.safe_union.V1_0.Monostate p0) {}
        public android.internal.hidl.safe_union.V1_0.Monostate noinit() { return null; }
        public void cdmaInfo(android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo.Cdma2000RegistrationInfo p0) {}
        public android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo.Cdma2000RegistrationInfo cdmaInfo() { return null; }
        public void eutranInfo(android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo.EutranRegistrationInfo p0) {}
        public android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo.EutranRegistrationInfo eutranInfo() { return null; }
        public byte getDiscriminator() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
        public final void readFromParcel(android.os.HwParcel p0) {}
        public static final java.util.ArrayList<android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
        public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
        public final void writeToParcel(android.os.HwParcel p0) {}
        public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo> p1) {}
        public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

        public static final class Cdma2000RegistrationInfo {
            public boolean cssSupported;
            public int roamingIndicator;
            public int systemIsInPrl;
            public int defaultRoamingIndicator;
            public Cdma2000RegistrationInfo() {}
            public final boolean equals(java.lang.Object p0) { return false; }
            public final int hashCode() { return 0; }
            public final java.lang.String toString() { return null; }
            public final void readFromParcel(android.os.HwParcel p0) {}
            public static final java.util.ArrayList<android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo.Cdma2000RegistrationInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
            public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
            public final void writeToParcel(android.os.HwParcel p0) {}
            public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo.Cdma2000RegistrationInfo> p1) {}
            public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
        }

        public static final class EutranRegistrationInfo {
            public android.hardware.radio.V1_4.LteVopsInfo lteVopsInfo;
            public android.hardware.radio.V1_4.NrIndicators nrIndicators;
            public EutranRegistrationInfo() {}
            public final boolean equals(java.lang.Object p0) { return false; }
            public final int hashCode() { return 0; }
            public final java.lang.String toString() { return null; }
            public final void readFromParcel(android.os.HwParcel p0) {}
            public static final java.util.ArrayList<android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo.EutranRegistrationInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
            public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
            public final void writeToParcel(android.os.HwParcel p0) {}
            public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.RegStateResult.AccessTechnologySpecificInfo.EutranRegistrationInfo> p1) {}
            public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
        }

        public static final class hidl_discriminator {
            public static final byte noinit = 0;
            public static final byte cdmaInfo = 1;
            public static final byte eutranInfo = 2;
            public static final java.lang.String getName(byte p0) { return null; }
        }
    }
}
