package android.hardware.radio.V1_0;

public final class Call {
    public int state;
    public int index;
    public int toa;
    public boolean isMpty;
    public boolean isMT;
    public byte als;
    public boolean isVoice;
    public boolean isVoicePrivacy;
    public java.lang.String number;
    public int numberPresentation;
    public java.lang.String name;
    public int namePresentation;
    public java.util.ArrayList<android.hardware.radio.V1_0.UusInfo> uusInfo;
    public Call() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_0.Call> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_0.Call> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
