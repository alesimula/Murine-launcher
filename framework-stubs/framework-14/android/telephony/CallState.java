package android.telephony;

@android.annotation.SystemApi
public final class CallState implements android.os.Parcelable {
    public static final int CALL_CLASSIFICATION_UNKNOWN = -1;
    public static final int CALL_CLASSIFICATION_RINGING = 0;
    public static final int CALL_CLASSIFICATION_FOREGROUND = 1;
    public static final int CALL_CLASSIFICATION_BACKGROUND = 2;
    public static final int CALL_CLASSIFICATION_MAX = 3;
    public static final android.os.Parcelable.Creator<android.telephony.CallState> CREATOR = null;
    public java.lang.String toString() { return null; }
    public int getCallState() { return 0; }
    public int getNetworkType() { return 0; }
    public android.telephony.CallQuality getCallQuality() { return null; }
    public int getCallClassification() { return 0; }
    public java.lang.String getImsCallSessionId() { return null; }
    public int getImsCallServiceType() { return 0; }
    public int getImsCallType() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0) {}
        public android.telephony.CallState.Builder setNetworkType(int p0) { return null; }
        public android.telephony.CallState.Builder setCallQuality(android.telephony.CallQuality p0) { return null; }
        public android.telephony.CallState.Builder setCallClassification(int p0) { return null; }
        public android.telephony.CallState.Builder setImsCallSessionId(java.lang.String p0) { return null; }
        public android.telephony.CallState.Builder setImsCallServiceType(int p0) { return null; }
        public android.telephony.CallState.Builder setImsCallType(int p0) { return null; }
        public android.telephony.CallState build() { return null; }
    }
}
