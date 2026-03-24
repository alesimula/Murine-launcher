package android.telephony;

@android.annotation.SystemApi
public final class SmsCbEtwsInfo implements android.os.Parcelable {
    public static final int ETWS_WARNING_TYPE_EARTHQUAKE = 0;
    public static final int ETWS_WARNING_TYPE_TSUNAMI = 1;
    public static final int ETWS_WARNING_TYPE_EARTHQUAKE_AND_TSUNAMI = 2;
    public static final int ETWS_WARNING_TYPE_TEST_MESSAGE = 3;
    public static final int ETWS_WARNING_TYPE_OTHER_EMERGENCY = 4;
    public static final int ETWS_WARNING_TYPE_UNKNOWN = -1;
    private final int mWarningType = 0;
    private final boolean mIsEmergencyUserAlert = false;
    private final boolean mIsPopupAlert = false;
    private final boolean mIsPrimary = false;
    private final byte[] mWarningSecurityInformation = null;
    public static final android.os.Parcelable.Creator<android.telephony.SmsCbEtwsInfo> CREATOR = null;
    public SmsCbEtwsInfo(int p0, boolean p1, boolean p2, boolean p3, byte[] p4) {}
    SmsCbEtwsInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getWarningType() { return 0; }
    public boolean isEmergencyUserAlert() { return false; }
    public boolean isPopupAlert() { return false; }
    public boolean isPrimary() { return false; }
    public long getPrimaryNotificationTimestamp() { return 0L; }
    public byte[] getPrimaryNotificationSignature() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WarningType {
    }
}
