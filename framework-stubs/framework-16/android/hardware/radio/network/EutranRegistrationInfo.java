package android.hardware.radio.network;

public class EutranRegistrationInfo implements android.os.Parcelable {
    public android.hardware.radio.network.LteVopsInfo lteVopsInfo;
    public android.hardware.radio.network.NrIndicators nrIndicators;
    public byte lteAttachResultType;
    public int extraInfo;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.EutranRegistrationInfo> CREATOR = null;
    public static final int EXTRA_CSFB_NOT_PREFERRED = 1;
    public static final int EXTRA_SMS_ONLY = 2;
    public EutranRegistrationInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static @interface AttachResultType {
        public static final byte NONE = 0;
        public static final byte EPS_ONLY = 1;
        public static final byte COMBINED = 2;
    }
}
