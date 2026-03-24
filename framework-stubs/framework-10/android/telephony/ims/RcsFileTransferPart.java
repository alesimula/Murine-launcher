package android.telephony.ims;

public class RcsFileTransferPart {
    public static final int NOT_SET = 0;
    public static final int DRAFT = 1;
    public static final int SENDING = 2;
    public static final int SENDING_PAUSED = 3;
    public static final int SENDING_FAILED = 4;
    public static final int SENDING_CANCELLED = 5;
    public static final int DOWNLOADING = 6;
    public static final int DOWNLOADING_PAUSED = 7;
    public static final int DOWNLOADING_FAILED = 8;
    public static final int DOWNLOADING_CANCELLED = 9;
    public static final int SUCCEEDED = 10;
    private final android.telephony.ims.RcsControllerCall mRcsControllerCall = null;
    private int mId;
    RcsFileTransferPart(android.telephony.ims.RcsControllerCall p0, int p1) {}
    public void setId(int p0) {}
    public int getId() { return 0; }
    public void setFileTransferSessionId(java.lang.String p0) throws android.telephony.ims.RcsMessageStoreException {}
    public java.lang.String getFileTransferSessionId() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setContentUri(android.net.Uri p0) throws android.telephony.ims.RcsMessageStoreException {}
    public android.net.Uri getContentUri() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setContentMimeType(java.lang.String p0) throws android.telephony.ims.RcsMessageStoreException {}
    public java.lang.String getContentMimeType() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setFileSize(long p0) throws android.telephony.ims.RcsMessageStoreException {}
    public long getFileSize() throws android.telephony.ims.RcsMessageStoreException { return 0L; }
    public void setTransferOffset(long p0) throws android.telephony.ims.RcsMessageStoreException {}
    public long getTransferOffset() throws android.telephony.ims.RcsMessageStoreException { return 0L; }
    public void setFileTransferStatus(int p0) throws android.telephony.ims.RcsMessageStoreException {}
    public int getFileTransferStatus() throws android.telephony.ims.RcsMessageStoreException { return 0; }
    public int getWidth() throws android.telephony.ims.RcsMessageStoreException { return 0; }
    public void setWidth(int p0) throws android.telephony.ims.RcsMessageStoreException {}
    public int getHeight() throws android.telephony.ims.RcsMessageStoreException { return 0; }
    public void setHeight(int p0) throws android.telephony.ims.RcsMessageStoreException {}
    public long getLength() throws android.telephony.ims.RcsMessageStoreException { return 0L; }
    public void setLength(long p0) throws android.telephony.ims.RcsMessageStoreException {}
    public android.net.Uri getPreviewUri() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setPreviewUri(android.net.Uri p0) throws android.telephony.ims.RcsMessageStoreException {}
    public java.lang.String getPreviewMimeType() throws android.telephony.ims.RcsMessageStoreException { return null; }
    public void setPreviewMimeType(java.lang.String p0) throws android.telephony.ims.RcsMessageStoreException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcsFileTransferStatus {
    }
}
