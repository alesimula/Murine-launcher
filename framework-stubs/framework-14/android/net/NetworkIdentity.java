package android.net;

public class NetworkIdentity {
    NetworkIdentity() {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int getType() { return 0; }
    public int getRatType() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getSubscriberId() { return null; }
    @android.annotation.Nullable
    public java.lang.String getWifiNetworkKey() { return null; }
    public boolean isRoaming() { return false; }
    public boolean isMetered() { return false; }
    public boolean isDefaultNetwork() { return false; }
    public int getOemManaged() { return 0; }
    public int getSubId() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setNetworkStateSnapshot(android.net.NetworkStateSnapshot p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setRatType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder clearRatType() { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setSubscriberId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setWifiNetworkKey(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setRoaming(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setMetered(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setDefaultNetwork(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setOemManaged(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity.Builder setSubId(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkIdentity build() { return null; }
    }
}
