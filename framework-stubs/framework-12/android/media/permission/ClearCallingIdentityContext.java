package android.media.permission;

public class ClearCallingIdentityContext implements android.media.permission.SafeCloseable {
    private final long mRestoreKey = 0L;
    public static android.media.permission.SafeCloseable create() { return null; }
    private ClearCallingIdentityContext() {}
    public void close() {}
}
