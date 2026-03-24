package android.telephony.ims;

public final class RcsEventQueryParams implements android.os.Parcelable {
    public static final int ALL_EVENTS = -1;
    public static final int ALL_GROUP_THREAD_EVENTS = 0;
    public static final int PARTICIPANT_ALIAS_CHANGED_EVENT = 1;
    public static final int GROUP_THREAD_PARTICIPANT_JOINED_EVENT = 2;
    public static final int GROUP_THREAD_PARTICIPANT_LEFT_EVENT = 4;
    public static final int GROUP_THREAD_NAME_CHANGED_EVENT = 16;
    public static final int GROUP_THREAD_ICON_CHANGED_EVENT = 8;
    public static final int SORT_BY_CREATION_ORDER = 0;
    public static final int SORT_BY_TIMESTAMP = 1;
    public static final java.lang.String EVENT_QUERY_PARAMETERS_KEY = "event_query_parameters";
    private int mEventType;
    private int mSortingProperty;
    private boolean mIsAscending;
    private int mLimit;
    private int mThreadId;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsEventQueryParams> CREATOR = null;
    RcsEventQueryParams(int p0, int p1, int p2, boolean p3, int p4) {}
    public int getEventType() { return 0; }
    public int getLimit() { return 0; }
    public int getSortingProperty() { return 0; }
    public boolean getSortDirection() { return false; }
    public int getThreadId() { return 0; }
    private RcsEventQueryParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SortingProperty {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }

    public static class Builder {
        private int mEventType;
        private int mSortingProperty;
        private boolean mIsAscending;
        private int mLimit;
        private int mThreadId;
        public Builder() {}
        public android.telephony.ims.RcsEventQueryParams.Builder setResultLimit(int p0) throws java.security.InvalidParameterException { return null; }
        public android.telephony.ims.RcsEventQueryParams.Builder setEventType(int p0) { return null; }
        public android.telephony.ims.RcsEventQueryParams.Builder setSortProperty(int p0) { return null; }
        public android.telephony.ims.RcsEventQueryParams.Builder setSortDirection(boolean p0) { return null; }
        public android.telephony.ims.RcsEventQueryParams.Builder setGroupThread(android.telephony.ims.RcsGroupThread p0) { return null; }
        public android.telephony.ims.RcsEventQueryParams build() { return null; }
    }
}
