package android.telephony.ims;

public class RcsGroupThread extends android.telephony.ims.RcsThread {
    public RcsGroupThread(android.telephony.ims.RcsControllerCall p0, int p1) { super(null, 0); }
    public boolean isGroup() { return false; }
    public java.lang.String getGroupName() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setGroupName(java.lang.String p0) throws android.telephony.ims.RcsMessageStoreException {}
    public android.net.Uri getGroupIcon() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setGroupIcon(android.net.Uri p0) throws android.telephony.ims.RcsMessageStoreException {}
    public android.telephony.ims.RcsParticipant getOwner() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setOwner(android.telephony.ims.RcsParticipant p0) throws android.telephony.ims.RcsMessageStoreException {}
    public void addParticipant(android.telephony.ims.RcsParticipant p0) throws android.telephony.ims.RcsMessageStoreException {}
    public void removeParticipant(android.telephony.ims.RcsParticipant p0) throws android.telephony.ims.RcsMessageStoreException {}
    public java.util.Set<android.telephony.ims.RcsParticipant> getParticipants() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public android.net.Uri getConferenceUri() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setConferenceUri(android.net.Uri p0) throws android.telephony.ims.RcsMessageStoreException {}
}
