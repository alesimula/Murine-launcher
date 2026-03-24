package android.hardware.radio.voice;

public class CdmaRedirectingNumberInfoRecord implements android.os.Parcelable {
    public android.hardware.radio.voice.CdmaNumberInfoRecord redirectingNumber;
    public int redirectingReason;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CdmaRedirectingNumberInfoRecord> CREATOR = null;
    public static final int REDIRECTING_REASON_UNKNOWN = 0;
    public static final int REDIRECTING_REASON_CALL_FORWARDING_BUSY = 1;
    public static final int REDIRECTING_REASON_CALL_FORWARDING_NO_REPLY = 2;
    public static final int REDIRECTING_REASON_CALLED_DTE_OUT_OF_ORDER = 9;
    public static final int REDIRECTING_REASON_CALL_FORWARDING_BY_THE_CALLED_DTE = 10;
    public static final int REDIRECTING_REASON_CALL_FORWARDING_UNCONDITIONAL = 15;
    public static final int REDIRECTING_REASON_RESERVED = 16;
    public CdmaRedirectingNumberInfoRecord() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
