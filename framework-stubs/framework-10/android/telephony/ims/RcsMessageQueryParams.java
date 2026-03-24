package android.telephony.ims;

public final class RcsMessageQueryParams implements android.os.Parcelable {
    public static final int THREAD_ID_NOT_SET = -1;
    public static final int SORT_BY_CREATION_ORDER = 0;
    public static final int SORT_BY_TIMESTAMP = 1;
    public static final int MESSAGE_TYPE_INCOMING = 1;
    public static final int MESSAGE_TYPE_OUTGOING = 2;
    public static final int MESSAGES_WITH_FILE_TRANSFERS = 4;
    public static final int MESSAGES_WITHOUT_FILE_TRANSFERS = 8;
    public static final java.lang.String MESSAGE_QUERY_PARAMETERS_KEY = "message_query_parameters";
    private int mMessageType;
    private int mFileTransferPresence;
    private java.lang.String mMessageLike;
    private int mSortingProperty;
    private boolean mIsAscending;
    private int mLimit;
    private int mThreadId;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsMessageQueryParams> CREATOR = null;
    RcsMessageQueryParams(int p0, int p1, java.lang.String p2, int p3, int p4, boolean p5, int p6) {}
    public int getMessageType() { return 0; }
    public int getFileTransferPresence() { return 0; }
    public java.lang.String getMessageLike() { return null; }
    public int getLimit() { return 0; }
    public int getSortingProperty() { return 0; }
    public boolean getSortDirection() { return false; }
    public int getThreadId() { return 0; }
    private RcsMessageQueryParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SortingProperty {
    }

    public static class Builder {
        private int mSortingProperty;
        private int mMessageType;
        private int mFileTransferPresence;
        private java.lang.String mMessageLike;
        private boolean mIsAscending;
        private int mLimit;
        private int mThreadId;
        public Builder() {}
        public android.telephony.ims.RcsMessageQueryParams.Builder setResultLimit(int p0) throws java.security.InvalidParameterException { return null; }
        public android.telephony.ims.RcsMessageQueryParams.Builder setMessageType(int p0) { return null; }
        public android.telephony.ims.RcsMessageQueryParams.Builder setFileTransferPresence(int p0) { return null; }
        public android.telephony.ims.RcsMessageQueryParams.Builder setMessageLike(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsMessageQueryParams.Builder setSortProperty(int p0) { return null; }
        public android.telephony.ims.RcsMessageQueryParams.Builder setSortDirection(boolean p0) { return null; }
        public android.telephony.ims.RcsMessageQueryParams.Builder setThread(android.telephony.ims.RcsThread p0) { return null; }
        public android.telephony.ims.RcsMessageQueryParams build() { return null; }
    }
}
