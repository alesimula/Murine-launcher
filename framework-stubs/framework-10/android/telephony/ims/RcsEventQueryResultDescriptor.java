package android.telephony.ims;

public class RcsEventQueryResultDescriptor implements android.os.Parcelable {
    private final android.telephony.ims.RcsQueryContinuationToken mContinuationToken = null;
    private final java.util.List<android.telephony.ims.RcsEventDescriptor> mEvents = null;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsEventQueryResultDescriptor> CREATOR = null;
    public RcsEventQueryResultDescriptor(android.telephony.ims.RcsQueryContinuationToken p0, java.util.List<android.telephony.ims.RcsEventDescriptor> p1) {}
    protected android.telephony.ims.RcsEventQueryResult getRcsEventQueryResult(android.telephony.ims.RcsControllerCall p0) { return null; }
    protected RcsEventQueryResultDescriptor(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
