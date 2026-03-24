package android.telephony.ims;

public class RcsGroupThreadParticipantJoinedEventDescriptor extends android.telephony.ims.RcsGroupThreadEventDescriptor {
    private final int mJoinedParticipantId = 0;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsGroupThreadParticipantJoinedEventDescriptor> CREATOR = null;
    public RcsGroupThreadParticipantJoinedEventDescriptor(long p0, int p1, int p2, int p3) { super((android.os.Parcel)null); }
    public android.telephony.ims.RcsGroupThreadParticipantJoinedEvent createRcsEvent(android.telephony.ims.RcsControllerCall p0) { return null; }
    protected RcsGroupThreadParticipantJoinedEventDescriptor(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
