package android.telephony.ims;

public abstract class RcsEventDescriptor implements android.os.Parcelable {
    protected final long mTimestamp = 0L;
    RcsEventDescriptor(long p0) {}
    public abstract android.telephony.ims.RcsEvent createRcsEvent(android.telephony.ims.RcsControllerCall p0);
    RcsEventDescriptor(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
