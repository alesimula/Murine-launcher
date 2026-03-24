package android.telephony.ims;

public final class RcsThreadQueryParams implements android.os.Parcelable {
    public static final int THREAD_TYPE_GROUP = 1;
    public static final int THREAD_TYPE_1_TO_1 = 2;
    private final int mThreadType = 0;
    private final java.util.List<java.lang.Integer> mRcsParticipantIds = null;
    private final int mLimit = 0;
    private final int mSortingProperty = 0;
    private final boolean mIsAscending = false;
    public static final int SORT_BY_CREATION_ORDER = 0;
    public static final int SORT_BY_TIMESTAMP = 1;
    public static final java.lang.String THREAD_QUERY_PARAMETERS_KEY = "thread_query_parameters";
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsThreadQueryParams> CREATOR = null;
    RcsThreadQueryParams(int p0, java.util.Set<android.telephony.ims.RcsParticipant> p1, int p2, int p3, boolean p4) {}
    private static java.util.List<java.lang.Integer> convertParticipantSetToIdList(java.util.Set<android.telephony.ims.RcsParticipant> p0) { return null; }
    public java.util.List<java.lang.Integer> getRcsParticipantsIds() { return null; }
    public int getThreadType() { return 0; }
    public int getLimit() { return 0; }
    public int getSortingProperty() { return 0; }
    public boolean getSortDirection() { return false; }
    private RcsThreadQueryParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SortingProperty {
    }

    public static class Builder {
        private int mThreadType;
        private java.util.Set<android.telephony.ims.RcsParticipant> mParticipants;
        private int mLimit;
        private int mSortingProperty;
        private boolean mIsAscending;
        public Builder() {}
        public android.telephony.ims.RcsThreadQueryParams.Builder setThreadType(int p0) { return null; }
        public android.telephony.ims.RcsThreadQueryParams.Builder setParticipant(android.telephony.ims.RcsParticipant p0) { return null; }
        public android.telephony.ims.RcsThreadQueryParams.Builder setParticipants(java.util.List<android.telephony.ims.RcsParticipant> p0) { return null; }
        public android.telephony.ims.RcsThreadQueryParams.Builder setResultLimit(int p0) throws java.security.InvalidParameterException { return null; }
        public android.telephony.ims.RcsThreadQueryParams.Builder setSortProperty(int p0) { return null; }
        public android.telephony.ims.RcsThreadQueryParams.Builder setSortDirection(boolean p0) { return null; }
        public android.telephony.ims.RcsThreadQueryParams build() { return null; }
    }
}
