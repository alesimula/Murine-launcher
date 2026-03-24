package android.telephony;

@android.annotation.SystemApi
public final class PinResult implements android.os.Parcelable {
    public static final int PIN_RESULT_TYPE_SUCCESS = 0;
    public static final int PIN_RESULT_TYPE_INCORRECT = 1;
    public static final int PIN_RESULT_TYPE_FAILURE = 2;
    public static final int PIN_RESULT_TYPE_ABORTED = 3;
    private static final android.telephony.PinResult sFailedResult = null;
    @android.telephony.PinResult.PinResultType
    private final int mResult = 0;
    private final int mAttemptsRemaining = 0;
    public static final android.os.Parcelable.Creator<android.telephony.PinResult> CREATOR = null;
    @android.telephony.PinResult.PinResultType
    public int getResult() { return 0; }
    public int getAttemptsRemaining() { return 0; }
    public static android.telephony.PinResult getDefaultFailedResult() { return null; }
    public PinResult(int p0, int p1) {}
    private PinResult(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static @interface PinResultType {
    }
}
