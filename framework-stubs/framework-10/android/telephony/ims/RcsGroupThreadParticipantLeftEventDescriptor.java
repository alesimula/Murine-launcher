package android.telephony.ims;

public class RcsGroupThreadParticipantLeftEventDescriptor extends android.telephony.ims.RcsGroupThreadEventDescriptor {
    private int mLeavingParticipantId;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsGroupThreadParticipantLeftEventDescriptor> CREATOR = null;
    public RcsGroupThreadParticipantLeftEventDescriptor(long p0, int p1, int p2, int p3) { super((android.os.Parcel)null); }
    public android.telephony.ims.RcsGroupThreadParticipantLeftEvent createRcsEvent(android.telephony.ims.RcsControllerCall p0) { return null; }
    protected RcsGroupThreadParticipantLeftEventDescriptor(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
