package android.telephony.ims;

public final class RcsIncomingMessageCreationParams extends android.telephony.ims.RcsMessageCreationParams implements android.os.Parcelable {
    private final long mArrivalTimestamp = 0L;
    private final long mSeenTimestamp = 0L;
    private final int mSenderParticipantId = 0;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsIncomingMessageCreationParams> CREATOR = null;
    private RcsIncomingMessageCreationParams(android.telephony.ims.RcsIncomingMessageCreationParams.Builder p0) { super((android.telephony.ims.RcsMessageCreationParams.Builder)null); }
    private RcsIncomingMessageCreationParams(android.os.Parcel p0) { super((android.telephony.ims.RcsMessageCreationParams.Builder)null); }
    public long getArrivalTimestamp() { return 0L; }
    public long getSeenTimestamp() { return 0L; }
    public int getSenderParticipantId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder extends android.telephony.ims.RcsMessageCreationParams.Builder {
        private android.telephony.ims.RcsParticipant mSenderParticipant;
        private long mArrivalTimestamp;
        private long mSeenTimestamp;
        public Builder(long p0, long p1, int p2) { super(0L, 0); }
        public android.telephony.ims.RcsIncomingMessageCreationParams.Builder setSenderParticipant(android.telephony.ims.RcsParticipant p0) { return null; }
        public android.telephony.ims.RcsIncomingMessageCreationParams.Builder setArrivalTimestamp(long p0) { return null; }
        public android.telephony.ims.RcsIncomingMessageCreationParams.Builder setSeenTimestamp(long p0) { return null; }
        public android.telephony.ims.RcsIncomingMessageCreationParams build() { return null; }
    }
}
