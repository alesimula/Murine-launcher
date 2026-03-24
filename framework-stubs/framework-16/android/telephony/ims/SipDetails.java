package android.telephony.ims;

public final class SipDetails implements android.os.Parcelable {
    public static final int METHOD_UNKNOWN = 0;
    public static final int METHOD_REGISTER = 1;
    public static final int METHOD_PUBLISH = 2;
    public static final int METHOD_SUBSCRIBE = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.SipDetails> CREATOR = null;
    public int getMethod() { return 0; }
    public int getCSeq() { return 0; }
    public int getResponseCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getResponsePhrase() { return null; }
    public int getReasonHeaderCause() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getReasonHeaderText() { return null; }
    @android.annotation.Nullable
    public java.lang.String getCallId() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.telephony.ims.SipDetails.Builder setCSeq(int p0) { return null; }
        public android.telephony.ims.SipDetails.Builder setSipResponseCode(int p0, java.lang.String p1) { return null; }
        public android.telephony.ims.SipDetails.Builder setSipResponseReasonHeader(int p0, java.lang.String p1) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.SipDetails.Builder setCallId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.SipDetails build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Method {
    }
}
