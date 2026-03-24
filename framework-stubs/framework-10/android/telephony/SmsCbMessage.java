package android.telephony;

public class SmsCbMessage implements android.os.Parcelable {
    protected static final java.lang.String LOG_TAG = "SMSCB";
    public static final int GEOGRAPHICAL_SCOPE_CELL_WIDE_IMMEDIATE = 0;
    public static final int GEOGRAPHICAL_SCOPE_PLMN_WIDE = 1;
    public static final int GEOGRAPHICAL_SCOPE_LA_WIDE = 2;
    public static final int GEOGRAPHICAL_SCOPE_CELL_WIDE = 3;
    public static final int MESSAGE_FORMAT_3GPP = 1;
    public static final int MESSAGE_FORMAT_3GPP2 = 2;
    public static final int MESSAGE_PRIORITY_NORMAL = 0;
    public static final int MESSAGE_PRIORITY_INTERACTIVE = 1;
    public static final int MESSAGE_PRIORITY_URGENT = 2;
    public static final int MESSAGE_PRIORITY_EMERGENCY = 3;
    private final int mMessageFormat = 0;
    private final int mGeographicalScope = 0;
    private final int mSerialNumber = 0;
    private final android.telephony.SmsCbLocation mLocation = null;
    private final int mServiceCategory = 0;
    private final java.lang.String mLanguage = null;
    private final java.lang.String mBody = null;
    private final int mPriority = 0;
    private final android.telephony.SmsCbEtwsInfo mEtwsWarningInfo = null;
    private final android.telephony.SmsCbCmasInfo mCmasWarningInfo = null;
    public static final android.os.Parcelable.Creator<android.telephony.SmsCbMessage> CREATOR = null;
    public SmsCbMessage(int p0, int p1, int p2, android.telephony.SmsCbLocation p3, int p4, java.lang.String p5, java.lang.String p6, int p7, android.telephony.SmsCbEtwsInfo p8, android.telephony.SmsCbCmasInfo p9) {}
    public SmsCbMessage(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getGeographicalScope() { return 0; }
    public int getSerialNumber() { return 0; }
    public android.telephony.SmsCbLocation getLocation() { return null; }
    public int getServiceCategory() { return 0; }
    public java.lang.String getLanguageCode() { return null; }
    public java.lang.String getMessageBody() { return null; }
    public int getMessageFormat() { return 0; }
    public int getMessagePriority() { return 0; }
    public android.telephony.SmsCbEtwsInfo getEtwsWarningInfo() { return null; }
    public android.telephony.SmsCbCmasInfo getCmasWarningInfo() { return null; }
    public boolean isEmergencyMessage() { return false; }
    public boolean isEtwsMessage() { return false; }
    public boolean isCmasMessage() { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
