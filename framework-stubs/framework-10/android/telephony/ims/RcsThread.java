package android.telephony.ims;

public abstract class RcsThread {
    protected int mThreadId;
    protected final android.telephony.ims.RcsControllerCall mRcsControllerCall = null;
    protected RcsThread(android.telephony.ims.RcsControllerCall p0, int p1) {}
    public android.telephony.ims.RcsMessageSnippet getSnippet() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsIncomingMessage addIncomingMessage(android.telephony.ims.RcsIncomingMessageCreationParams p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.telephony.ims.RcsOutgoingMessage addOutgoingMessage(android.telephony.ims.RcsOutgoingMessageCreationParams p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void deleteMessage(android.telephony.ims.RcsMessage p0) throws android.telephony.ims.RcsMessageStoreException {}
    public android.telephony.ims.RcsMessageQueryResult getMessages() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public abstract boolean isGroup();
    public int getThreadId() { return 0; }
    public int getThreadType() { return 0; }
}
