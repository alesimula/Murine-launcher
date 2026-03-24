package android.telephony;

public final class SubscriptionPlan implements android.os.Parcelable {
    public static final int LIMIT_BEHAVIOR_UNKNOWN = -1;
    public static final int LIMIT_BEHAVIOR_DISABLED = 0;
    public static final int LIMIT_BEHAVIOR_BILLED = 1;
    public static final int LIMIT_BEHAVIOR_THROTTLED = 2;
    public static final long BYTES_UNKNOWN = -1L;
    public static final long BYTES_UNLIMITED = 9223372036854775807L;
    public static final long TIME_UNKNOWN = -1L;
    private final android.util.RecurrenceRule cycleRule = null;
    private java.lang.CharSequence title;
    private java.lang.CharSequence summary;
    private long dataLimitBytes;
    private int dataLimitBehavior;
    private long dataUsageBytes;
    private long dataUsageTime;
    public static final android.os.Parcelable.Creator<android.telephony.SubscriptionPlan> CREATOR = null;
    private SubscriptionPlan(android.util.RecurrenceRule p0) {}
    private SubscriptionPlan(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.util.RecurrenceRule getCycleRule() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSummary() { return null; }
    public long getDataLimitBytes() { return 0L; }
    public int getDataLimitBehavior() { return 0; }
    public long getDataUsageBytes() { return 0L; }
    public long getDataUsageTime() { return 0L; }
    public java.util.Iterator<android.util.Range<java.time.ZonedDateTime>> cycleIterator() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LimitBehavior {
    }

    public static class Builder {
        private final android.telephony.SubscriptionPlan plan = null;
        public Builder(java.time.ZonedDateTime p0, java.time.ZonedDateTime p1, java.time.Period p2) {}
        public static android.telephony.SubscriptionPlan.Builder createNonrecurring(java.time.ZonedDateTime p0, java.time.ZonedDateTime p1) { return null; }
        public static android.telephony.SubscriptionPlan.Builder createRecurring(java.time.ZonedDateTime p0, java.time.Period p1) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public static android.telephony.SubscriptionPlan.Builder createRecurringMonthly(java.time.ZonedDateTime p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public static android.telephony.SubscriptionPlan.Builder createRecurringWeekly(java.time.ZonedDateTime p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public static android.telephony.SubscriptionPlan.Builder createRecurringDaily(java.time.ZonedDateTime p0) { return null; }
        public android.telephony.SubscriptionPlan build() { return null; }
        public android.telephony.SubscriptionPlan.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setSummary(java.lang.CharSequence p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setDataLimit(long p0, int p1) { return null; }
        public android.telephony.SubscriptionPlan.Builder setDataUsage(long p0, long p1) { return null; }
    }
}
