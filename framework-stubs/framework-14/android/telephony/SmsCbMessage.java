package android.telephony;

@android.annotation.SystemApi
public final class SmsCbMessage implements android.os.Parcelable {
    public static final java.lang.String LOG_TAG = "SMSCB";
    public static final int GEOGRAPHICAL_SCOPE_CELL_WIDE_IMMEDIATE = 0;
    public static final int GEOGRAPHICAL_SCOPE_PLMN_WIDE = 1;
    public static final int GEOGRAPHICAL_SCOPE_LOCATION_AREA_WIDE = 2;
    public static final int GEOGRAPHICAL_SCOPE_CELL_WIDE = 3;
    public static final int MESSAGE_FORMAT_3GPP = 1;
    public static final int MESSAGE_FORMAT_3GPP2 = 2;
    public static final int MESSAGE_PRIORITY_NORMAL = 0;
    public static final int MESSAGE_PRIORITY_INTERACTIVE = 1;
    public static final int MESSAGE_PRIORITY_URGENT = 2;
    public static final int MESSAGE_PRIORITY_EMERGENCY = 3;
    public static final int MAXIMUM_WAIT_TIME_NOT_SET = 255;
    public static final android.os.Parcelable.Creator<android.telephony.SmsCbMessage> CREATOR = null;
    public SmsCbMessage(int p0, int p1, int p2, android.telephony.SmsCbLocation p3, int p4, java.lang.String p5, java.lang.String p6, int p7, android.telephony.SmsCbEtwsInfo p8, android.telephony.SmsCbCmasInfo p9, int p10, int p11) {}
    public SmsCbMessage(int p0, int p1, int p2, android.telephony.SmsCbLocation p3, int p4, java.lang.String p5, int p6, java.lang.String p7, int p8, android.telephony.SmsCbEtwsInfo p9, android.telephony.SmsCbCmasInfo p10, int p11, java.util.List<android.telephony.CbGeoUtils.Geometry> p12, long p13, int p14, int p15) {}
    public SmsCbMessage(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getGeographicalScope() { return 0; }
    public int getSerialNumber() { return 0; }
    public android.telephony.SmsCbLocation getLocation() { return null; }
    public int getServiceCategory() { return 0; }
    public java.lang.String getLanguageCode() { return null; }
    public int getDataCodingScheme() { return 0; }
    public java.lang.String getMessageBody() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.CbGeoUtils.Geometry> getGeometries() { return null; }
    public int getMaximumWaitingDuration() { return 0; }
    public long getReceivedTime() { return 0L; }
    public int getSlotIndex() { return 0; }
    public int getSubscriptionId() { return 0; }
    public int getMessageFormat() { return 0; }
    public int getMessagePriority() { return 0; }
    public android.telephony.SmsCbEtwsInfo getEtwsWarningInfo() { return null; }
    public android.telephony.SmsCbCmasInfo getCmasWarningInfo() { return null; }
    public boolean isEmergencyMessage() { return false; }
    public boolean isEtwsMessage() { return false; }
    public boolean isCmasMessage() { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public android.content.ContentValues getContentValues() { return null; }
    public static android.telephony.SmsCbMessage createFromCursor(android.database.Cursor p0) { return null; }
    public boolean needGeoFencingCheck() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GeographicalScope {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MessageFormat {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MessagePriority {
    }
}
