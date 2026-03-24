package android.telephony.ims;

public class Rcs1To1Thread extends android.telephony.ims.RcsThread {
    private int mThreadId;
    public Rcs1To1Thread(android.telephony.ims.RcsControllerCall p0, int p1) { super(null, 0); }
    public boolean isGroup() { return false; }
    public long getFallbackThreadId() throws android.telephony.ims.RcsMessageStoreException { return 0L; }
    public void setFallbackThreadId(long p0) throws android.telephony.ims.RcsMessageStoreException {}
    public android.telephony.ims.RcsParticipant getRecipient() throws android.telephony.ims.RcsMessageStoreException { return null; }
}
