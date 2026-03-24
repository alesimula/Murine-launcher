package android.telephony.ims;

public final class RcsParticipantQueryParams implements android.os.Parcelable {
    public static final int SORT_BY_CREATION_ORDER = 0;
    public static final int SORT_BY_ALIAS = 1;
    public static final int SORT_BY_CANONICAL_ADDRESS = 2;
    private java.lang.String mAliasLike;
    private java.lang.String mCanonicalAddressLike;
    private int mSortingProperty;
    private boolean mIsAscending;
    private int mLimit;
    private int mThreadId;
    public static final java.lang.String PARTICIPANT_QUERY_PARAMETERS_KEY = "participant_query_parameters";
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsParticipantQueryParams> CREATOR = null;
    RcsParticipantQueryParams(int p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, int p5) {}
    public int getThreadId() { return 0; }
    public java.lang.String getAliasLike() { return null; }
    public java.lang.String getCanonicalAddressLike() { return null; }
    public int getLimit() { return 0; }
    public int getSortingProperty() { return 0; }
    public boolean getSortDirection() { return false; }
    private RcsParticipantQueryParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SortingProperty {
    }

    public static class Builder {
        private java.lang.String mAliasLike;
        private java.lang.String mCanonicalAddressLike;
        private int mSortingProperty;
        private boolean mIsAscending;
        private int mLimit;
        private int mThreadId;
        public Builder() {}
        public android.telephony.ims.RcsParticipantQueryParams.Builder setThread(android.telephony.ims.RcsThread p0) { return null; }
        public android.telephony.ims.RcsParticipantQueryParams.Builder setAliasLike(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsParticipantQueryParams.Builder setCanonicalAddressLike(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsParticipantQueryParams.Builder setResultLimit(int p0) throws java.security.InvalidParameterException { return null; }
        public android.telephony.ims.RcsParticipantQueryParams.Builder setSortProperty(int p0) { return null; }
        public android.telephony.ims.RcsParticipantQueryParams.Builder setSortDirection(boolean p0) { return null; }
        public android.telephony.ims.RcsParticipantQueryParams build() { return null; }
    }
}
