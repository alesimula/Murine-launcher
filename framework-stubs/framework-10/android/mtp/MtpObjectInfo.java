package android.mtp;

public final class MtpObjectInfo {
    private int mHandle;
    private int mStorageId;
    private int mFormat;
    private int mProtectionStatus;
    private int mCompressedSize;
    private int mThumbFormat;
    private int mThumbCompressedSize;
    private int mThumbPixWidth;
    private int mThumbPixHeight;
    private int mImagePixWidth;
    private int mImagePixHeight;
    private int mImagePixDepth;
    private int mParent;
    private int mAssociationType;
    private int mAssociationDesc;
    private int mSequenceNumber;
    private java.lang.String mName;
    private long mDateCreated;
    private long mDateModified;
    private java.lang.String mKeywords;
    private MtpObjectInfo() {}
    public final int getObjectHandle() { return 0; }
    public final int getStorageId() { return 0; }
    public final int getFormat() { return 0; }
    public final int getProtectionStatus() { return 0; }
    public final int getCompressedSize() { return 0; }
    public final long getCompressedSizeLong() { return 0L; }
    public final int getThumbFormat() { return 0; }
    public final int getThumbCompressedSize() { return 0; }
    public final long getThumbCompressedSizeLong() { return 0L; }
    public final int getThumbPixWidth() { return 0; }
    public final long getThumbPixWidthLong() { return 0L; }
    public final int getThumbPixHeight() { return 0; }
    public final long getThumbPixHeightLong() { return 0L; }
    public final int getImagePixWidth() { return 0; }
    public final long getImagePixWidthLong() { return 0L; }
    public final int getImagePixHeight() { return 0; }
    public final long getImagePixHeightLong() { return 0L; }
    public final int getImagePixDepth() { return 0; }
    public final long getImagePixDepthLong() { return 0L; }
    public final int getParent() { return 0; }
    public final int getAssociationType() { return 0; }
    public final int getAssociationDesc() { return 0; }
    public final int getSequenceNumber() { return 0; }
    public final long getSequenceNumberLong() { return 0L; }
    public final java.lang.String getName() { return null; }
    public final long getDateCreated() { return 0L; }
    public final long getDateModified() { return 0L; }
    public final java.lang.String getKeywords() { return null; }
    private static long uint32ToLong(int p0) { return 0L; }
    private static int longToUint32(long p0, java.lang.String p1) { return 0; }

    public static class Builder {
        private android.mtp.MtpObjectInfo mObjectInfo;
        public Builder() {}
        public Builder(android.mtp.MtpObjectInfo p0) {}
        public android.mtp.MtpObjectInfo.Builder setObjectHandle(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setAssociationDesc(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setAssociationType(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setCompressedSize(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setDateCreated(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setDateModified(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setFormat(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setImagePixDepth(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setImagePixHeight(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setImagePixWidth(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setKeywords(java.lang.String p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setName(java.lang.String p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setParent(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setProtectionStatus(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setSequenceNumber(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setStorageId(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setThumbCompressedSize(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setThumbFormat(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setThumbPixHeight(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setThumbPixWidth(long p0) { return null; }
        public android.mtp.MtpObjectInfo build() { return null; }
    }
}
