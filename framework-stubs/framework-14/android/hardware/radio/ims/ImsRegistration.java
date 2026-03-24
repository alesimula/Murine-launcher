package android.hardware.radio.ims;

public class ImsRegistration implements android.os.Parcelable {
    public int regState;
    public int accessNetworkType;
    public int suggestedAction;
    public int capabilities;
    public static final android.os.Parcelable.Creator<android.hardware.radio.ims.ImsRegistration> CREATOR = null;
    public static final int IMS_MMTEL_CAPABILITY_NONE = 0;
    public static final int IMS_MMTEL_CAPABILITY_VOICE = 1;
    public static final int IMS_MMTEL_CAPABILITY_VIDEO = 2;
    public static final int IMS_MMTEL_CAPABILITY_SMS = 4;
    public static final int IMS_RCS_CAPABILITIES = 8;
    public ImsRegistration() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
