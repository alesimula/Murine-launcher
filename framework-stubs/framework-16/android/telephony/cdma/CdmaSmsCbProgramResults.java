package android.telephony.cdma;

public class CdmaSmsCbProgramResults implements android.os.Parcelable {
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_MEMORY_LIMIT_EXCEEDED = 1;
    public static final int RESULT_CATEGORY_LIMIT_EXCEEDED = 2;
    public static final int RESULT_CATEGORY_ALREADY_ADDED = 3;
    public static final int RESULT_CATEGORY_ALREADY_DELETED = 4;
    public static final int RESULT_INVALID_MAX_MESSAGES = 5;
    public static final int RESULT_INVALID_ALERT_OPTION = 6;
    public static final int RESULT_INVALID_CATEGORY_NAME = 7;
    public static final int RESULT_UNSPECIFIED_FAILURE = 8;
    public static final android.os.Parcelable.Creator<android.telephony.cdma.CdmaSmsCbProgramResults> CREATOR = null;
    public CdmaSmsCbProgramResults(int p0, int p1, int p2) {}
    CdmaSmsCbProgramResults(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getCategory() { return 0; }
    public int getLanguage() { return 0; }
    public int getCategoryResult() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
