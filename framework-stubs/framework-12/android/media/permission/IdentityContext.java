package android.media.permission;

public class IdentityContext implements android.media.permission.SafeCloseable {
    private static java.lang.ThreadLocal<android.media.permission.Identity> sThreadLocalIdentity;
    private android.media.permission.Identity mPrior;
    public static android.media.permission.SafeCloseable create(android.media.permission.Identity p0) { return null; }
    public static android.media.permission.Identity get() { return null; }
    public static android.media.permission.Identity getNonNull() { return null; }
    private IdentityContext(android.media.permission.Identity p0) {}
    public void close() {}
    private static void set(android.media.permission.Identity p0) {}
}
