package android.telephony.ims;

public abstract class RcsEvent {
    private final long mTimestamp = 0L;
    protected RcsEvent(long p0) {}
    public long getTimestamp() { return 0L; }
    abstract void persist(android.telephony.ims.RcsControllerCall p0) throws android.telephony.ims.RcsMessageStoreException;
}
