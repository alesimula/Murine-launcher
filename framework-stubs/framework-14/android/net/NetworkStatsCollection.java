package android.net;

public class NetworkStatsCollection {
    NetworkStatsCollection() {}
    @android.annotation.NonNull
    public java.util.Map<android.net.NetworkStatsCollection.Key, android.net.NetworkStatsHistory> getEntries() { return null; }

    public static final class Builder {
        public Builder(long p0) {}
        @android.annotation.NonNull
        public android.net.NetworkStatsCollection.Builder addEntry(android.net.NetworkStatsCollection.Key p0, android.net.NetworkStatsHistory p1) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkStatsCollection build() { return null; }
    }

    public static final class Key {
        public Key(java.util.Set<android.net.NetworkIdentity> p0, int p1, int p2, int p3) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
