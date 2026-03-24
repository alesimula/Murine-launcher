package android.telephony.cdma;

@android.annotation.SystemApi
public final class CdmaSmsCbProgramData implements android.os.Parcelable {
    public static final int OPERATION_DELETE_CATEGORY = 0;
    public static final int OPERATION_ADD_CATEGORY = 1;
    public static final int OPERATION_CLEAR_CATEGORIES = 2;
    public static final int CATEGORY_CMAS_PRESIDENTIAL_LEVEL_ALERT = 4096;
    public static final int CATEGORY_CMAS_EXTREME_THREAT = 4097;
    public static final int CATEGORY_CMAS_SEVERE_THREAT = 4098;
    public static final int CATEGORY_CMAS_CHILD_ABDUCTION_EMERGENCY = 4099;
    public static final int CATEGORY_CMAS_TEST_MESSAGE = 4100;
    public static final int CATEGORY_CMAS_LAST_RESERVED_VALUE = 4351;
    public static final int ALERT_OPTION_NO_ALERT = 0;
    public static final int ALERT_OPTION_DEFAULT_ALERT = 1;
    public static final int ALERT_OPTION_VIBRATE_ONCE = 2;
    public static final int ALERT_OPTION_VIBRATE_REPEAT = 3;
    public static final int ALERT_OPTION_VISUAL_ONCE = 4;
    public static final int ALERT_OPTION_VISUAL_REPEAT = 5;
    public static final int ALERT_OPTION_LOW_PRIORITY_ONCE = 6;
    public static final int ALERT_OPTION_LOW_PRIORITY_REPEAT = 7;
    public static final int ALERT_OPTION_MED_PRIORITY_ONCE = 8;
    public static final int ALERT_OPTION_MED_PRIORITY_REPEAT = 9;
    public static final int ALERT_OPTION_HIGH_PRIORITY_ONCE = 10;
    public static final int ALERT_OPTION_HIGH_PRIORITY_REPEAT = 11;
    public static final android.os.Parcelable.Creator<android.telephony.cdma.CdmaSmsCbProgramData> CREATOR = null;
    public CdmaSmsCbProgramData(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) {}
    CdmaSmsCbProgramData(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getOperation() { return 0; }
    public int getCategory() { return 0; }
    public int getLanguage() { return 0; }
    public int getMaxMessages() { return 0; }
    public int getAlertOption() { return 0; }
    public java.lang.String getCategoryName() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Category {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Operation {
    }
}
