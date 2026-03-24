package android.debug;

public abstract class AdbManagerInternal {
    public AdbManagerInternal() {}
    public abstract void registerTransport(android.debug.IAdbTransport p0);
    public abstract void unregisterTransport(android.debug.IAdbTransport p0);
    public abstract boolean isAdbEnabled();
    public abstract java.io.File getAdbKeysFile();
    public abstract java.io.File getAdbTempKeysFile();
}
