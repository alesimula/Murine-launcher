package android.app.usage;

@android.annotation.FlaggedApi("android.app.usage.filter_based_event_query_api")
public final class UsageEventsQuery implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.usage.UsageEventsQuery> CREATOR = null;
    public long getBeginTimeMillis() { return 0L; }
    public long getEndTimeMillis() { return 0L; }
    @android.annotation.NonNull
    public int[] getEventTypes() { return null; }
    public int getUserId() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getPackageNames() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(long p0, long p1) {}
        @android.annotation.NonNull
        public android.app.usage.UsageEventsQuery build() { return null; }
        @android.annotation.NonNull
        public android.app.usage.UsageEventsQuery.Builder setEventTypes(int... p0) { return null; }
        @android.annotation.NonNull
        public android.app.usage.UsageEventsQuery.Builder setUserId(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.usage.UsageEventsQuery.Builder setPackageNames(java.lang.String... p0) { return null; }
    }
}
