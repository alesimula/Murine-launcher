package android.telephony.ims;

public abstract class RcsGroupThreadEventDescriptor extends android.telephony.ims.RcsEventDescriptor {
    protected final int mRcsGroupThreadId = 0;
    protected final int mOriginatingParticipantId = 0;
    RcsGroupThreadEventDescriptor(long p0, int p1, int p2) { super(0L); }
    RcsGroupThreadEventDescriptor(android.os.Parcel p0) { super(0L); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
