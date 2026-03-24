package android.net.http;

public class QuicOptions {
    QuicOptions() {}
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getAllowedQuicHosts() { return null; }
    public boolean hasInMemoryServerConfigsCacheSize() { return false; }
    public int getInMemoryServerConfigsCacheSize() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getHandshakeUserAgent() { return null; }
    @android.annotation.Nullable
    public java.time.Duration getIdleConnectionTimeout() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.http.QuicOptions.Builder addAllowedQuicHost(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.QuicOptions.Builder setInMemoryServerConfigsCacheSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.QuicOptions.Builder setHandshakeUserAgent(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.QuicOptions.Builder setIdleConnectionTimeout(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.QuicOptions build() { return null; }
    }
}
