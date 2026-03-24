package android.net;

public abstract class NetworkSpecifier {
    public NetworkSpecifier() {}
    public abstract boolean satisfiedBy(android.net.NetworkSpecifier p0);
    public void assertValidFromUid(int p0) {}
    public android.net.NetworkSpecifier redact() { return null; }
}
