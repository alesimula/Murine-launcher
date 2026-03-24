package android.telephony.ims;

public abstract class RcsMessage {
    public static final double LOCATION_NOT_SET = 5e-324;
    public static final int NOT_SET = 0;
    public static final int DRAFT = 1;
    public static final int QUEUED = 2;
    public static final int SENDING = 3;
    public static final int SENT = 4;
    public static final int RETRYING = 5;
    public static final int FAILED = 6;
    public static final int RECEIVED = 7;
    public static final int SEEN = 9;
    protected final android.telephony.ims.RcsControllerCall mRcsControllerCall = null;
    protected final int mId = 0;
    RcsMessage(android.telephony.ims.RcsControllerCall p0, int p1) {}
    public int getId() { return 0; }
    public int getSubscriptionId() throws android.telephony.ims.RcsMessageStoreException { return 0; }
    public void setSubscriptionId(int p0) throws android.telephony.ims.RcsMessageStoreException {}
    public void setStatus(int p0) throws android.telephony.ims.RcsMessageStoreException {}
    public int getStatus() throws android.telephony.ims.RcsMessageStoreException { return 0; }
    public void setOriginationTimestamp(long p0) throws android.telephony.ims.RcsMessageStoreException {}
    public long getOriginationTimestamp() throws android.telephony.ims.RcsMessageStoreException { return 0L; }
    public void setRcsMessageId(java.lang.String p0) throws android.telephony.ims.RcsMessageStoreException {}
    public java.lang.String getRcsMessageId() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public java.lang.String getText() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setText(java.lang.String p0) throws android.telephony.ims.RcsMessageStoreException {}
    public double getLatitude() throws android.telephony.ims.RcsMessageStoreException { return 0.0; }
    public void setLatitude(double p0) throws android.telephony.ims.RcsMessageStoreException {}
    public double getLongitude() throws android.telephony.ims.RcsMessageStoreException { return 0.0; }
    public void setLongitude(double p0) throws android.telephony.ims.RcsMessageStoreException {}
    public android.telephony.ims.RcsFileTransferPart insertFileTransfer(android.telephony.ims.RcsFileTransferCreationParams p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    public java.util.Set<android.telephony.ims.RcsFileTransferPart> getFileTransferParts() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void removeFileTransferPart(android.telephony.ims.RcsFileTransferPart p0) throws android.telephony.ims.RcsMessageStoreException {}
    public abstract boolean isIncoming();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcsMessageStatus {
    }
}
