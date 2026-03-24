package android.app.usage;

@android.annotation.SystemApi
public final class CacheQuotaHint implements android.os.Parcelable {
    public static final long QUOTA_NOT_SET = -1L;
    public static final android.os.Parcelable.Creator<android.app.usage.CacheQuotaHint> CREATOR = null;
    public CacheQuotaHint(android.app.usage.CacheQuotaHint.Builder p0) {}
    public java.lang.String getVolumeUuid() { return null; }
    public int getUid() { return 0; }
    public long getQuota() { return 0L; }
    public android.app.usage.UsageStats getUsageStats() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.app.usage.CacheQuotaHint p0) {}
        public android.app.usage.CacheQuotaHint.Builder setVolumeUuid(java.lang.String p0) { return null; }
        public android.app.usage.CacheQuotaHint.Builder setUid(int p0) { return null; }
        public android.app.usage.CacheQuotaHint.Builder setUsageStats(android.app.usage.UsageStats p0) { return null; }
        public android.app.usage.CacheQuotaHint.Builder setQuota(long p0) { return null; }
        public android.app.usage.CacheQuotaHint build() { return null; }
    }
}
