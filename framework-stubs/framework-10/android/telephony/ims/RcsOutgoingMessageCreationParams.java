package android.telephony.ims;

public final class RcsOutgoingMessageCreationParams extends android.telephony.ims.RcsMessageCreationParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsOutgoingMessageCreationParams> CREATOR = null;
    private RcsOutgoingMessageCreationParams(android.telephony.ims.RcsOutgoingMessageCreationParams.Builder p0) { super((android.telephony.ims.RcsMessageCreationParams.Builder)null); }
    private RcsOutgoingMessageCreationParams(android.os.Parcel p0) { super((android.telephony.ims.RcsMessageCreationParams.Builder)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder extends android.telephony.ims.RcsMessageCreationParams.Builder {
        public Builder(long p0, int p1) { super(0L, 0); }
        public android.telephony.ims.RcsOutgoingMessageCreationParams build() { return null; }
    }
}
