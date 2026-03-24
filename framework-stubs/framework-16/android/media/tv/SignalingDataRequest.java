package android.media.tv;

@android.annotation.FlaggedApi("android.media.tv.flags.tiaf_v_apis")
public final class SignalingDataRequest extends android.media.tv.BroadcastInfoRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.SignalingDataRequest> CREATOR = null;
    public static final java.lang.String SIGNALING_METADATA_APD = "APD";
    public static final java.lang.String SIGNALING_METADATA_USBD = "USBD";
    public static final java.lang.String SIGNALING_METADATA_STSID = "STSID";
    public static final java.lang.String SIGNALING_METADATA_MPD = "MPD";
    public static final java.lang.String SIGNALING_METADATA_USD = "USD";
    public static final java.lang.String SIGNALING_METADATA_PAT = "PAT";
    public static final java.lang.String SIGNALING_METADATA_MPT = "MPT";
    public static final java.lang.String SIGNALING_METADATA_MPIT = "MPIT";
    public static final java.lang.String SIGNALING_METADATA_CRIT = "CRIT";
    public static final java.lang.String SIGNALING_METADATA_DCIT = "DCIT";
    public static final java.lang.String SIGNALING_METADATA_HELD = "HELD";
    public static final java.lang.String SIGNALING_METADATA_DWD = "DWD";
    public static final java.lang.String SIGNALING_METADATA_AEI = "AEI";
    public static final java.lang.String SIGNALING_METADATA_VSPD = "VSPD";
    public static final java.lang.String SIGNALING_METADATA_ASD = "ASD";
    public static final java.lang.String SIGNALING_METADATA_IED = "IED";
    public static final java.lang.String SIGNALING_METADATA_CAD = "CAD";
    public static final java.lang.String SIGNALING_METADATA_ASPD = "ASPD";
    public static final java.lang.String SIGNALING_METADATA_SSD = "SSD";
    public static final java.lang.String SIGNALING_METADATA_EMSG = "EMSG";
    public static final java.lang.String SIGNALING_METADATA_EVTI = "EVTI";
    public static final java.lang.String SIGNALING_METADATA_RSAT = "RSAT";
    public static final java.lang.String SIGNALING_METADATA_RDT = "RDT";
    public static final java.lang.String SIGNALING_METADATA_SLT = "SLT";
    public static final java.lang.String SIGNALING_METADATA_RRT = "RRT";
    public static final java.lang.String SIGNALING_METADATA_STT = "STT";
    public static final java.lang.String SIGNALING_METADATA_AEAT = "AEAT";
    public static final java.lang.String SIGNALING_METADATA_OSN = "OSN";
    public static final java.lang.String SIGNALING_METADATA_SMT = "SMT";
    public static final java.lang.String SIGNALING_METADATA_CDT = "CDT";
    public static final int SIGNALING_DATA_NO_GROUP_ID = -1;
    public SignalingDataRequest(int p0, int p1, int p2, java.util.List<java.lang.String> p3) { super(0, (android.os.Parcel)null); }
    static android.media.tv.SignalingDataRequest createFromParcelBody(android.os.Parcel p0) { return null; }
    public int getGroup() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSignalingDataTypes() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    SignalingDataRequest(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignalingMetadata {
    }
}
