package android.hardware.radio.voice;

public class CdmaRedirectingNumberInfoRecord implements android.os.Parcelable {
    @java.lang.Deprecated
    public android.hardware.radio.voice.CdmaNumberInfoRecord redirectingNumber;
    @java.lang.Deprecated
    public int redirectingReason;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CdmaRedirectingNumberInfoRecord> CREATOR = null;
    @java.lang.Deprecated
    public static final int REDIRECTING_REASON_UNKNOWN = 0;
    @java.lang.Deprecated
    public static final int REDIRECTING_REASON_CALL_FORWARDING_BUSY = 1;
    @java.lang.Deprecated
    public static final int REDIRECTING_REASON_CALL_FORWARDING_NO_REPLY = 2;
    @java.lang.Deprecated
    public static final int REDIRECTING_REASON_CALLED_DTE_OUT_OF_ORDER = 9;
    @java.lang.Deprecated
    public static final int REDIRECTING_REASON_CALL_FORWARDING_BY_THE_CALLED_DTE = 10;
    @java.lang.Deprecated
    public static final int REDIRECTING_REASON_CALL_FORWARDING_UNCONDITIONAL = 15;
    @java.lang.Deprecated
    public static final int REDIRECTING_REASON_RESERVED = 16;
    public CdmaRedirectingNumberInfoRecord() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
