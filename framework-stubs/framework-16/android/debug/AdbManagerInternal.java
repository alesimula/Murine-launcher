package android.debug;

public abstract class AdbManagerInternal {
    public AdbManagerInternal() {}
    public abstract void registerTransport(android.debug.IAdbTransport p0);
    public abstract void unregisterTransport(android.debug.IAdbTransport p0);
    public abstract boolean isAdbEnabled(byte p0);
    public abstract java.io.File getAdbKeysFile();
    public abstract java.io.File getAdbTempKeysFile();
    public abstract void notifyKeyFilesUpdated();
}
