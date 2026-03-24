package android.telecom;

public final class PhoneAccountSuggestion implements android.os.Parcelable {
    public static final int REASON_NONE = 0;
    public static final int REASON_INTRA_CARRIER = 1;
    public static final int REASON_FREQUENT = 2;
    public static final int REASON_USER_SET = 3;
    public static final int REASON_OTHER = 4;
    public static final android.os.Parcelable.Creator<android.telecom.PhoneAccountSuggestion> CREATOR = null;
    public PhoneAccountSuggestion(android.telecom.PhoneAccountHandle p0, int p1, boolean p2) {}
    public android.telecom.PhoneAccountHandle getPhoneAccountHandle() { return null; }
    public int getReason() { return 0; }
    public boolean shouldAutoSelect() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SuggestionReason {
    }
}
