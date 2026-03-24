package android.telephony.ims;

public class RcsIncomingMessage extends android.telephony.ims.RcsMessage {
    RcsIncomingMessage(android.telephony.ims.RcsControllerCall p0, int p1) { super(null, 0); }
    public void setArrivalTimestamp(long p0) throws android.telephony.ims.RcsMessageStoreException {}
    public long getArrivalTimestamp() throws android.telephony.ims.RcsMessageStoreException { return 0L; }
    public void setSeenTimestamp(long p0) throws android.telephony.ims.RcsMessageStoreException {}
    public long getSeenTimestamp() throws android.telephony.ims.RcsMessageStoreException { return 0L; }
    public android.telephony.ims.RcsParticipant getSenderParticipant() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public boolean isIncoming() { return false; }
}
