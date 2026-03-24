package android.webkit;

public class WebStorage {
    public void getOrigins(android.webkit.ValueCallback<java.util.Map> p0) {}
    public void getUsageForOrigin(java.lang.String p0, android.webkit.ValueCallback<java.lang.Long> p1) {}
    public void getQuotaForOrigin(java.lang.String p0, android.webkit.ValueCallback<java.lang.Long> p1) {}
    @java.lang.Deprecated
    public void setQuotaForOrigin(java.lang.String p0, long p1) {}
    public void deleteOrigin(java.lang.String p0) {}
    public void deleteAllData() {}
    public static android.webkit.WebStorage getInstance() { return null; }
    @android.annotation.SystemApi
    public WebStorage() {}

    public static class Origin {
        @android.annotation.SystemApi
        protected Origin(java.lang.String p0, long p1, long p2) {}
        public java.lang.String getOrigin() { return null; }
        public long getQuota() { return 0L; }
        public long getUsage() { return 0L; }
    }

    @java.lang.Deprecated
    public static interface QuotaUpdater {
        public void updateQuota(long p0);
    }
}
