package android.telephony.ims;

@android.annotation.SystemApi
public final class SipDialogState implements android.os.Parcelable {
    public static final int STATE_EARLY = 0;
    public static final int STATE_CONFIRMED = 1;
    public static final int STATE_CLOSED = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.SipDialogState> CREATOR = null;
    public int getState() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.telephony.ims.SipDialogState build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SipDialogStateCode {
    }
}
