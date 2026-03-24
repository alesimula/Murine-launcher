package android.net;

public abstract class NetworkSpecifier {
    public NetworkSpecifier() {}
    @android.annotation.SystemApi
    public boolean canBeSatisfiedBy(android.net.NetworkSpecifier p0) { return false; }
    @android.annotation.SystemApi
    public android.net.NetworkSpecifier redact() { return null; }
}
