package android.telephony.ims;

@android.annotation.SystemApi
public final class PublishAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.PublishAttributes> CREATOR = null;
    public int getPublishState() { return 0; }
    public java.util.List<android.telephony.ims.RcsContactPresenceTuple> getPresenceTuples() { return null; }
    public android.telephony.ims.SipDetails getSipDetails() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(int p0) {}
        public android.telephony.ims.PublishAttributes.Builder setSipDetails(android.telephony.ims.SipDetails p0) { return null; }
        public android.telephony.ims.PublishAttributes.Builder setPresenceTuples(java.util.List<android.telephony.ims.RcsContactPresenceTuple> p0) { return null; }
        public android.telephony.ims.PublishAttributes build() { return null; }
    }
}
