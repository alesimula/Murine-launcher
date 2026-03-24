package android.net.http;

public final class DnsOptions {
    public static final int DNS_OPTION_DISABLED = 2;
    public static final int DNS_OPTION_ENABLED = 1;
    public static final int DNS_OPTION_UNSPECIFIED = 0;
    DnsOptions() {}
    public int getPersistHostCache() { return 0; }
    @android.annotation.Nullable
    public java.time.Duration getPersistHostCachePeriod() { return null; }
    public int getPreestablishConnectionsToStaleDnsResults() { return 0; }
    public int getStaleDns() { return 0; }
    @android.annotation.Nullable
    public android.net.http.DnsOptions.StaleDnsOptions getStaleDnsOptions() { return null; }
    public int getUseHttpStackDnsResolver() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.http.DnsOptions build() { return null; }
        @android.annotation.NonNull
        public android.net.http.DnsOptions.Builder setPersistHostCache(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.DnsOptions.Builder setPersistHostCachePeriod(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.DnsOptions.Builder setPreestablishConnectionsToStaleDnsResults(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.DnsOptions.Builder setStaleDns(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.DnsOptions.Builder setStaleDnsOptions(android.net.http.DnsOptions.StaleDnsOptions p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.DnsOptions.Builder setUseHttpStackDnsResolver(int p0) { return null; }
    }

    public static class StaleDnsOptions {
        StaleDnsOptions() {}
        public int getAllowCrossNetworkUsage() { return 0; }
        @android.annotation.Nullable
        public java.time.Duration getFreshLookupTimeout() { return null; }
        @android.annotation.Nullable
        public java.time.Duration getMaxExpiredDelay() { return null; }
        public int getUseStaleOnNameNotResolved() { return 0; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.net.http.DnsOptions.StaleDnsOptions build() { return null; }
            @android.annotation.NonNull
            public android.net.http.DnsOptions.StaleDnsOptions.Builder setAllowCrossNetworkUsage(int p0) { return null; }
            @android.annotation.NonNull
            public android.net.http.DnsOptions.StaleDnsOptions.Builder setFreshLookupTimeout(java.time.Duration p0) { return null; }
            @android.annotation.NonNull
            public android.net.http.DnsOptions.StaleDnsOptions.Builder setMaxExpiredDelay(java.time.Duration p0) { return null; }
            @android.annotation.NonNull
            public android.net.http.DnsOptions.StaleDnsOptions.Builder setUseStaleOnNameNotResolved(int p0) { return null; }
        }
    }
}
