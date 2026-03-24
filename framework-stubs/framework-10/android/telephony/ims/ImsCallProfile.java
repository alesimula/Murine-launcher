package android.telephony.ims;

@android.annotation.SystemApi
public final class ImsCallProfile implements android.os.Parcelable {
    private static final java.lang.String TAG = "ImsCallProfile";
    public static final int SERVICE_TYPE_NONE = 0;
    public static final int SERVICE_TYPE_NORMAL = 1;
    public static final int SERVICE_TYPE_EMERGENCY = 2;
    public static final int CALL_TYPE_VOICE_N_VIDEO = 1;
    public static final int CALL_TYPE_VOICE = 2;
    public static final int CALL_TYPE_VIDEO_N_VOICE = 3;
    public static final int CALL_TYPE_VT = 4;
    public static final int CALL_TYPE_VT_TX = 5;
    public static final int CALL_TYPE_VT_RX = 6;
    public static final int CALL_TYPE_VT_NODIR = 7;
    public static final int CALL_TYPE_VS = 8;
    public static final int CALL_TYPE_VS_TX = 9;
    public static final int CALL_TYPE_VS_RX = 10;
    public static final java.lang.String EXTRA_CONFERENCE = "conference";
    public static final java.lang.String EXTRA_EMERGENCY_CALL = "e_call";
    public static final java.lang.String EXTRA_VMS = "vms";
    public static final java.lang.String EXTRA_CALL_MODE_CHANGEABLE = "call_mode_changeable";
    public static final java.lang.String EXTRA_CONFERENCE_AVAIL = "conference_avail";
    public static final java.lang.String EXTRA_OEM_EXTRAS = "OemCallExtras";
    public static final java.lang.String EXTRA_OIR = "oir";
    public static final java.lang.String EXTRA_CNAP = "cnap";
    public static final java.lang.String EXTRA_DIALSTRING = "dialstring";
    public static final int OIR_DEFAULT = 0;
    public static final int OIR_PRESENTATION_RESTRICTED = 1;
    public static final int OIR_PRESENTATION_NOT_RESTRICTED = 2;
    public static final int OIR_PRESENTATION_UNKNOWN = 3;
    public static final int OIR_PRESENTATION_PAYPHONE = 4;
    public static final int DIALSTRING_NORMAL = 0;
    public static final int DIALSTRING_SS_CONF = 1;
    public static final int DIALSTRING_USSD = 2;
    public static final int CALL_RESTRICT_CAUSE_NONE = 0;
    public static final int CALL_RESTRICT_CAUSE_RAT = 1;
    public static final int CALL_RESTRICT_CAUSE_DISABLED = 2;
    public static final int CALL_RESTRICT_CAUSE_HD = 3;
    public static final java.lang.String EXTRA_OI = "oi";
    public static final java.lang.String EXTRA_CNA = "cna";
    public static final java.lang.String EXTRA_USSD = "ussd";
    public static final java.lang.String EXTRA_REMOTE_URI = "remote_uri";
    public static final java.lang.String EXTRA_CHILD_NUMBER = "ChildNum";
    public static final java.lang.String EXTRA_CODEC = "Codec";
    public static final java.lang.String EXTRA_DISPLAY_TEXT = "DisplayText";
    public static final java.lang.String EXTRA_ADDITIONAL_CALL_INFO = "AdditionalCallInfo";
    public static final java.lang.String EXTRA_IS_CALL_PULL = "CallPull";
    public static final java.lang.String EXTRA_ADDITIONAL_SIP_INVITE_FIELDS = "android.telephony.ims.extra.ADDITIONAL_SIP_INVITE_FIELDS";
    public static final java.lang.String EXTRA_CALL_RAT_TYPE = "CallRadioTech";
    public static final java.lang.String EXTRA_CALL_RAT_TYPE_ALT = "callRadioTech";
    public int mServiceType;
    @android.annotation.UnsupportedAppUsage
    public int mCallType;
    @android.annotation.UnsupportedAppUsage
    public int mRestrictCause;
    private int mEmergencyServiceCategories;
    private java.util.List<java.lang.String> mEmergencyUrns;
    private int mEmergencyCallRouting;
    private boolean mEmergencyCallTesting;
    private boolean mHasKnownUserIntentEmergency;
    @android.annotation.UnsupportedAppUsage
    public android.os.Bundle mCallExtras;
    @android.annotation.UnsupportedAppUsage
    public android.telephony.ims.ImsStreamMediaProfile mMediaProfile;
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsCallProfile> CREATOR = null;
    public ImsCallProfile(android.os.Parcel p0) {}
    public ImsCallProfile() {}
    public ImsCallProfile(int p0, int p1) {}
    public ImsCallProfile(int p0, int p1, android.os.Bundle p2, android.telephony.ims.ImsStreamMediaProfile p3) {}
    public java.lang.String getCallExtra(java.lang.String p0) { return null; }
    public java.lang.String getCallExtra(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean getCallExtraBoolean(java.lang.String p0) { return false; }
    public boolean getCallExtraBoolean(java.lang.String p0, boolean p1) { return false; }
    public int getCallExtraInt(java.lang.String p0) { return 0; }
    public int getCallExtraInt(java.lang.String p0, int p1) { return 0; }
    public void setCallExtra(java.lang.String p0, java.lang.String p1) {}
    public void setCallExtraBoolean(java.lang.String p0, boolean p1) {}
    public void setCallExtraInt(java.lang.String p0, int p1) {}
    public void setCallRestrictCause(int p0) {}
    public void updateCallType(android.telephony.ims.ImsCallProfile p0) {}
    public void updateCallExtras(android.telephony.ims.ImsCallProfile p0) {}
    public void updateMediaProfile(android.telephony.ims.ImsCallProfile p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int getServiceType() { return 0; }
    public int getCallType() { return 0; }
    public int getRestrictCause() { return 0; }
    public android.os.Bundle getCallExtras() { return null; }
    public android.telephony.ims.ImsStreamMediaProfile getMediaProfile() { return null; }
    public static int getVideoStateFromImsCallProfile(android.telephony.ims.ImsCallProfile p0) { return 0; }
    public static int getVideoStateFromCallType(int p0) { return 0; }
    public static int getCallTypeFromVideoState(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int presentationToOIR(int p0) { return 0; }
    public static int presentationToOir(int p0) { return 0; }
    public static int OIRToPresentation(int p0) { return 0; }
    public boolean isVideoPaused() { return false; }
    public boolean isVideoCall() { return false; }
    private android.os.Bundle maybeCleanseExtras(android.os.Bundle p0) { return null; }
    private static boolean isVideoStateSet(int p0, int p1) { return false; }
    public void setEmergencyCallInfo(android.telephony.emergency.EmergencyNumber p0, boolean p1) {}
    public void setEmergencyServiceCategories(int p0) {}
    public void setEmergencyUrns(java.util.List<java.lang.String> p0) {}
    public void setEmergencyCallRouting(int p0) {}
    public void setEmergencyCallTesting(boolean p0) {}
    public void setHasKnownUserIntentEmergency(boolean p0) {}
    public int getEmergencyServiceCategories() { return 0; }
    public java.util.List<java.lang.String> getEmergencyUrns() { return null; }
    public int getEmergencyCallRouting() { return 0; }
    public boolean isEmergencyCallTesting() { return false; }
    public boolean hasKnownUserIntentEmergency() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallRestrictCause {
    }
}
