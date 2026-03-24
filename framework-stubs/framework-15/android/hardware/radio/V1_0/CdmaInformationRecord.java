package android.hardware.radio.V1_0;

public final class CdmaInformationRecord {
    public int name;
    public java.util.ArrayList<android.hardware.radio.V1_0.CdmaDisplayInfoRecord> display;
    public java.util.ArrayList<android.hardware.radio.V1_0.CdmaNumberInfoRecord> number;
    public java.util.ArrayList<android.hardware.radio.V1_0.CdmaSignalInfoRecord> signal;
    public java.util.ArrayList<android.hardware.radio.V1_0.CdmaRedirectingNumberInfoRecord> redir;
    public java.util.ArrayList<android.hardware.radio.V1_0.CdmaLineControlInfoRecord> lineCtrl;
    public java.util.ArrayList<android.hardware.radio.V1_0.CdmaT53ClirInfoRecord> clir;
    public java.util.ArrayList<android.hardware.radio.V1_0.CdmaT53AudioControlInfoRecord> audioCtrl;
    public CdmaInformationRecord() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_0.CdmaInformationRecord> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_0.CdmaInformationRecord> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
