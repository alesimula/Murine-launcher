package android.telephony.ims;

public final class RcsGroupThreadParticipantLeftEvent extends android.telephony.ims.RcsGroupThreadEvent {
    private android.telephony.ims.RcsParticipant mLeavingParticipant;
    public RcsGroupThreadParticipantLeftEvent(long p0, android.telephony.ims.RcsGroupThread p1, android.telephony.ims.RcsParticipant p2, android.telephony.ims.RcsParticipant p3) { super(0L, null, null); }
    public android.telephony.ims.RcsParticipant getLeavingParticipant() { return null; }
    void persist(android.telephony.ims.RcsControllerCall p0) throws android.telephony.ims.RcsMessageStoreException {}
}
