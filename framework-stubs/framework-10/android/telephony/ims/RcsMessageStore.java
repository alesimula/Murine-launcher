package android.telephony.ims;

public class RcsMessageStore {
    android.telephony.ims.RcsControllerCall mRcsControllerCall;
    RcsMessageStore(android.content.Context p0) {}
    public android.telephony.ims.RcsThreadQueryResult getRcsThreads(android.telephony.ims.RcsThreadQueryParams p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsThreadQueryResult getRcsThreads(android.telephony.ims.RcsQueryContinuationToken p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsParticipantQueryResult getRcsParticipants(android.telephony.ims.RcsParticipantQueryParams p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsParticipantQueryResult getRcsParticipants(android.telephony.ims.RcsQueryContinuationToken p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsMessageQueryResult getRcsMessages(android.telephony.ims.RcsMessageQueryParams p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsMessageQueryResult getRcsMessages(android.telephony.ims.RcsQueryContinuationToken p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsEventQueryResult getRcsEvents(android.telephony.ims.RcsEventQueryParams p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsEventQueryResult getRcsEvents(android.telephony.ims.RcsQueryContinuationToken p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void persistRcsEvent(android.telephony.ims.RcsEvent p0) throws android.telephony.ims.RcsMessageStoreException {}
    public android.telephony.ims.Rcs1To1Thread createRcs1To1Thread(android.telephony.ims.RcsParticipant p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsGroupThread createGroupThread(java.util.List<android.telephony.ims.RcsParticipant> p0, java.lang.String p1, android.net.Uri p2) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void deleteThread(android.telephony.ims.RcsThread p0) throws android.telephony.ims.RcsMessageStoreException {}
    public android.telephony.ims.RcsParticipant createRcsParticipant(java.lang.String p0, java.lang.String p1) throws android.telephony.ims.RcsMessageStoreException { return null; }
}
