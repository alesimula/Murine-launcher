package android.hardware.radio.voice;

public class StkCcUnsolSsResult implements android.os.Parcelable {
    public int serviceType;
    public int requestType;
    public int teleserviceType;
    public int serviceClass;
    public int result;
    public android.hardware.radio.voice.SsInfoData[] ssInfo;
    public android.hardware.radio.voice.CfData[] cfData;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.StkCcUnsolSsResult> CREATOR = null;
    public static final int REQUEST_TYPE_ACTIVATION = 0;
    public static final int REQUEST_TYPE_DEACTIVATION = 1;
    public static final int REQUEST_TYPE_INTERROGATION = 2;
    public static final int REQUEST_TYPE_REGISTRATION = 3;
    public static final int REQUEST_TYPE_ERASURE = 4;
    public static final int SERVICE_TYPE_CFU = 0;
    public static final int SERVICE_TYPE_CF_BUSY = 1;
    public static final int SERVICE_TYPE_CF_NO_REPLY = 2;
    public static final int SERVICE_TYPE_CF_NOT_REACHABLE = 3;
    public static final int SERVICE_TYPE_CF_ALL = 4;
    public static final int SERVICE_TYPE_CF_ALL_CONDITIONAL = 5;
    public static final int SERVICE_TYPE_CLIP = 6;
    public static final int SERVICE_TYPE_CLIR = 7;
    public static final int SERVICE_TYPE_COLP = 8;
    public static final int SERVICE_TYPE_COLR = 9;
    public static final int SERVICE_TYPE_WAIT = 10;
    public static final int SERVICE_TYPE_BAOC = 11;
    public static final int SERVICE_TYPE_BAOIC = 12;
    public static final int SERVICE_TYPE_BAOIC_EXC_HOME = 13;
    public static final int SERVICE_TYPE_BAIC = 14;
    public static final int SERVICE_TYPE_BAIC_ROAMING = 15;
    public static final int SERVICE_TYPE_ALL_BARRING = 16;
    public static final int SERVICE_TYPE_OUTGOING_BARRING = 17;
    public static final int SERVICE_TYPE_INCOMING_BARRING = 18;
    public static final int TELESERVICE_TYPE_ALL_TELE_AND_BEARER_SERVICES = 0;
    public static final int TELESERVICE_TYPE_ALL_TELESEVICES = 1;
    public static final int TELESERVICE_TYPE_TELEPHONY = 2;
    public static final int TELESERVICE_TYPE_ALL_DATA_TELESERVICES = 3;
    public static final int TELESERVICE_TYPE_SMS_SERVICES = 4;
    public static final int TELESERVICE_TYPE_ALL_TELESERVICES_EXCEPT_SMS = 5;
    public static final int SUPP_SERVICE_CLASS_NONE = 0;
    public static final int SUPP_SERVICE_CLASS_VOICE = 1;
    public static final int SUPP_SERVICE_CLASS_DATA = 2;
    public static final int SUPP_SERVICE_CLASS_FAX = 4;
    public static final int SUPP_SERVICE_CLASS_SMS = 8;
    public static final int SUPP_SERVICE_CLASS_DATA_SYNC = 16;
    public static final int SUPP_SERVICE_CLASS_DATA_ASYNC = 32;
    public static final int SUPP_SERVICE_CLASS_PACKET = 64;
    public static final int SUPP_SERVICE_CLASS_PAD = 128;
    public static final int SUPP_SERVICE_CLASS_MAX = 128;
    public StkCcUnsolSsResult() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
