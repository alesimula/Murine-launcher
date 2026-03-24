package android.telephony.ims;

public final class RcsFileTransferCreationParams implements android.os.Parcelable {
    private java.lang.String mRcsFileTransferSessionId;
    private android.net.Uri mContentUri;
    private java.lang.String mContentMimeType;
    private long mFileSize;
    private long mTransferOffset;
    private int mWidth;
    private int mHeight;
    private long mMediaDuration;
    private android.net.Uri mPreviewUri;
    private java.lang.String mPreviewMimeType;
    private int mFileTransferStatus;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsFileTransferCreationParams> CREATOR = null;
    public java.lang.String getRcsFileTransferSessionId() { return null; }
    public android.net.Uri getContentUri() { return null; }
    public java.lang.String getContentMimeType() { return null; }
    public long getFileSize() { return 0L; }
    public long getTransferOffset() { return 0L; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public long getMediaDuration() { return 0L; }
    public android.net.Uri getPreviewUri() { return null; }
    public java.lang.String getPreviewMimeType() { return null; }
    public int getFileTransferStatus() { return 0; }
    RcsFileTransferCreationParams(android.telephony.ims.RcsFileTransferCreationParams.Builder p0) {}
    private RcsFileTransferCreationParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public class Builder {
        private java.lang.String mRcsFileTransferSessionId;
        private android.net.Uri mContentUri;
        private java.lang.String mContentMimeType;
        private long mFileSize;
        private long mTransferOffset;
        private int mWidth;
        private int mHeight;
        private long mLength;
        private android.net.Uri mPreviewUri;
        private java.lang.String mPreviewMimeType;
        private int mFileTransferStatus;
        public Builder(android.telephony.ims.RcsFileTransferCreationParams p0) {}
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setFileTransferSessionId(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setContentUri(android.net.Uri p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setContentMimeType(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setFileSize(long p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setTransferOffset(long p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setWidth(int p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setHeight(int p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setMediaDuration(long p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setPreviewUri(android.net.Uri p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setPreviewMimeType(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams.Builder setFileTransferStatus(int p0) { return null; }
        public android.telephony.ims.RcsFileTransferCreationParams build() { return null; }
    }
}
