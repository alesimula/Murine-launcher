package android.telephony;

public final class SubscriptionPlan implements android.os.Parcelable {
    public static final int LIMIT_BEHAVIOR_UNKNOWN = -1;
    public static final int LIMIT_BEHAVIOR_DISABLED = 0;
    public static final int LIMIT_BEHAVIOR_BILLED = 1;
    public static final int LIMIT_BEHAVIOR_THROTTLED = 2;
    public static final long BYTES_UNKNOWN = -1L;
    public static final long BYTES_UNLIMITED = 9223372036854775807L;
    public static final long TIME_UNKNOWN = -1L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.SubscriptionPlan> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.NonNull
    public android.util.RecurrenceRule getCycleRule() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getTitle() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getSummary() { return null; }
    public long getDataLimitBytes() { return 0L; }
    public int getDataLimitBehavior() { return 0; }
    public long getDataUsageBytes() { return 0L; }
    public long getDataUsageTime() { return 0L; }
    @android.annotation.NonNull
    public int[] getNetworkTypes() { return null; }
    public java.util.Iterator<android.util.Range<java.time.ZonedDateTime>> cycleIterator() { return null; }

    public static class Builder {
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
        @android.annotation.NonNull
        public android.telephony.SubscriptionPlan.Builder setNetworkTypes(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionPlan.Builder resetNetworkTypes() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LimitBehavior {
    }
}
