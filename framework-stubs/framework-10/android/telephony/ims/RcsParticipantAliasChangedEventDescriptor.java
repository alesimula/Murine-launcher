package android.telephony.ims;

public class RcsParticipantAliasChangedEventDescriptor extends android.telephony.ims.RcsEventDescriptor {
    protected int mParticipantId;
    protected java.lang.String mNewAlias;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsParticipantAliasChangedEventDescriptor> CREATOR = null;
    public RcsParticipantAliasChangedEventDescriptor(long p0, int p1, java.lang.String p2) { super(0L); }
    public android.telephony.ims.RcsParticipantAliasChangedEvent createRcsEvent(android.telephony.ims.RcsControllerCall p0) { return null; }
    protected RcsParticipantAliasChangedEventDescriptor(android.os.Parcel p0) { super(0L); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
