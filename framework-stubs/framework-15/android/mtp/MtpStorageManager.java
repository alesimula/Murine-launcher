package android.mtp;

public class MtpStorageManager {
    public static boolean sDebug;
    public MtpStorageManager(android.mtp.MtpStorageManager.MtpNotifier p0, java.util.Set<java.lang.String> p1) {}
    public synchronized void close() {}
    public synchronized void setSubdirectories(java.util.Set<java.lang.String> p0) {}
    public synchronized android.mtp.MtpStorage addMtpStorage(android.os.storage.StorageVolume p0, java.util.function.Supplier<java.lang.Boolean> p1) { return null; }
    public synchronized void removeMtpStorage(android.mtp.MtpStorage p0) {}
    public synchronized android.mtp.MtpStorageManager.MtpObject getByPath(java.lang.String p0) { return null; }
    public synchronized android.mtp.MtpStorageManager.MtpObject getObject(int p0) { return null; }
    public android.mtp.MtpStorageManager.MtpObject getStorageRoot(int p0) { return null; }
    public synchronized java.util.List<android.mtp.MtpStorageManager.MtpObject> getObjects(int p0, int p1, int p2) { return null; }
    public void flushEvents() {}
    public synchronized void dump() {}
    public synchronized boolean checkConsistency() { return false; }
    public synchronized int beginSendObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1, int p2) { return 0; }
    public synchronized boolean endSendObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1) { return false; }
    public synchronized boolean beginRenameObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1) { return false; }
    public synchronized boolean endRenameObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1, boolean p2) { return false; }
    public synchronized boolean beginRemoveObject(android.mtp.MtpStorageManager.MtpObject p0) { return false; }
    public synchronized boolean endRemoveObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1) { return false; }
    public synchronized boolean beginMoveObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1) { return false; }
    public synchronized boolean endMoveObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1, java.lang.String p2, boolean p3) { return false; }
    public synchronized int beginCopyObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1) { return 0; }
    public synchronized boolean endCopyObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1) { return false; }

    public static abstract class MtpNotifier {
        public MtpNotifier() {}
        public abstract void sendObjectAdded(int p0);
        public abstract void sendObjectRemoved(int p0);
        public abstract void sendObjectInfoChanged(int p0);
    }

    public static class MtpObject {
        MtpObject(java.lang.String p0, int p1, android.mtp.MtpStorage p2, android.mtp.MtpStorageManager.MtpObject p3, boolean p4) {}
        public java.lang.String getName() { return null; }
        public int getId() { return 0; }
        public boolean isDir() { return false; }
        public int getFormat() { return 0; }
        public int getStorageId() { return 0; }
        public long getModifiedTime() { return 0L; }
        public android.mtp.MtpStorageManager.MtpObject getParent() { return null; }
        public android.mtp.MtpStorageManager.MtpObject getRoot() { return null; }
        public long getSize() { return 0L; }
        public java.nio.file.Path getPath() { return null; }
        public boolean isRoot() { return false; }
        public java.lang.String getVolumeName() { return null; }
    }

    private class MtpObjectObserver extends android.os.FileObserver {
        android.mtp.MtpStorageManager.MtpObject mObject;
        MtpObjectObserver(android.mtp.MtpStorageManager p0, android.mtp.MtpStorageManager.MtpObject p1) { super((java.lang.String)null); }
        public void onEvent(int p0, java.lang.String p1) {}
        public void finalize() {}
    }

    private static enum MtpObjectState {
        NORMAL,
        FROZEN,
        FROZEN_ADDED,
        FROZEN_REMOVED,
        FROZEN_ONESHOT_ADD,
        FROZEN_ONESHOT_DEL;
    }

    private static enum MtpOperation {
        NONE,
        ADD,
        RENAME,
        COPY,
        DELETE;
    }
}
