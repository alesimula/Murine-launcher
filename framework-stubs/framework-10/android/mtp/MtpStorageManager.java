package android.mtp;

public class MtpStorageManager {
    private static final java.lang.String TAG = null;
    public static boolean sDebug;
    private static final int IN_ONLYDIR = 16777216;
    private static final int IN_Q_OVERFLOW = 16384;
    private static final int IN_IGNORED = 32768;
    private static final int IN_ISDIR = 1073741824;
    private android.mtp.MtpStorageManager.MtpNotifier mMtpNotifier;
    private java.util.HashMap<java.lang.Integer, android.mtp.MtpStorageManager.MtpObject> mObjects;
    private java.util.HashMap<java.lang.Integer, android.mtp.MtpStorageManager.MtpObject> mRoots;
    private int mNextObjectId;
    private int mNextStorageId;
    private java.util.Set<java.lang.String> mSubdirectories;
    private volatile boolean mCheckConsistency;
    private java.lang.Thread mConsistencyThread;
    public MtpStorageManager(android.mtp.MtpStorageManager.MtpNotifier p0, java.util.Set<java.lang.String> p1) {}
    public synchronized void close() {}
    public synchronized void setSubdirectories(java.util.Set<java.lang.String> p0) {}
    public synchronized android.mtp.MtpStorage addMtpStorage(android.os.storage.StorageVolume p0) { return null; }
    public synchronized void removeMtpStorage(android.mtp.MtpStorage p0) {}
    private synchronized boolean isSpecialSubDir(android.mtp.MtpStorageManager.MtpObject p0) { return false; }
    public synchronized android.mtp.MtpStorageManager.MtpObject getByPath(java.lang.String p0) { return null; }
    public synchronized android.mtp.MtpStorageManager.MtpObject getObject(int p0) { return null; }
    public android.mtp.MtpStorageManager.MtpObject getStorageRoot(int p0) { return null; }
    private int getNextObjectId() { return 0; }
    private int getNextStorageId() { return 0; }
    public synchronized java.util.List<android.mtp.MtpStorageManager.MtpObject> getObjects(int p0, int p1, int p2) { return null; }
    private synchronized boolean getObjects(java.util.List<android.mtp.MtpStorageManager.MtpObject> p0, android.mtp.MtpStorageManager.MtpObject p1, int p2, boolean p3) { return false; }
    private synchronized java.util.Collection<android.mtp.MtpStorageManager.MtpObject> getChildren(android.mtp.MtpStorageManager.MtpObject p0) { return null; }
    private synchronized android.mtp.MtpStorageManager.MtpObject addObjectToCache(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1, boolean p2) { return null; }
    private synchronized boolean removeObjectFromCache(android.mtp.MtpStorageManager.MtpObject p0, boolean p1, boolean p2) { return false; }
    private synchronized void handleAddedObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1, boolean p2) {}
    private synchronized void handleRemovedObject(android.mtp.MtpStorageManager.MtpObject p0) {}
    private synchronized void handleChangedObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1) {}
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
    private synchronized boolean generalEndAddObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1, boolean p2) { return false; }
    private synchronized boolean generalEndRemoveObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1, boolean p2) { return false; }
    private synchronized boolean generalBeginRenameObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1) { return false; }
    private synchronized boolean generalEndRenameObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1, boolean p2) { return false; }
    private synchronized boolean generalBeginRemoveObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpOperation p1) { return false; }
    private synchronized boolean generalBeginCopyObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1) { return false; }
    private synchronized boolean generalEndCopyObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1, boolean p2) { return false; }

    private static enum MtpOperation {
        NONE,
        ADD,
        RENAME,
        COPY,
        DELETE;
        private MtpOperation() {}
    }

    private static enum MtpObjectState {
        NORMAL,
        FROZEN,
        FROZEN_ADDED,
        FROZEN_REMOVED,
        FROZEN_ONESHOT_ADD,
        FROZEN_ONESHOT_DEL;
        private MtpObjectState() {}
    }

    private class MtpObjectObserver extends android.os.FileObserver {
        android.mtp.MtpStorageManager.MtpObject mObject;
        MtpObjectObserver(android.mtp.MtpStorageManager p0, android.mtp.MtpStorageManager.MtpObject p1) { super((java.lang.String)null); }
        public void onEvent(int p0, java.lang.String p1) {}
        public void finalize() {}
    }

    public static class MtpObject {
        private android.mtp.MtpStorage mStorage;
        private android.mtp.MtpStorageManager.MtpObject mParent;
        private java.lang.String mName;
        private int mId;
        private android.mtp.MtpStorageManager.MtpObjectState mState;
        private android.mtp.MtpStorageManager.MtpOperation mOp;
        private boolean mVisited;
        private boolean mIsDir;
        private java.util.HashMap<java.lang.String, android.mtp.MtpStorageManager.MtpObject> mChildren;
        private android.os.FileObserver mObserver;
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
        private void setName(java.lang.String p0) {}
        private void setId(int p0) {}
        private boolean isVisited() { return false; }
        private void setParent(android.mtp.MtpStorageManager.MtpObject p0) {}
        private void setDir(boolean p0) {}
        private void setVisited(boolean p0) {}
        private android.mtp.MtpStorageManager.MtpObjectState getState() { return null; }
        private void setState(android.mtp.MtpStorageManager.MtpObjectState p0) {}
        private android.mtp.MtpStorageManager.MtpOperation getOperation() { return null; }
        private void setOperation(android.mtp.MtpStorageManager.MtpOperation p0) {}
        private android.os.FileObserver getObserver() { return null; }
        private void setObserver(android.os.FileObserver p0) {}
        private void addChild(android.mtp.MtpStorageManager.MtpObject p0) {}
        private android.mtp.MtpStorageManager.MtpObject getChild(java.lang.String p0) { return null; }
        private java.util.Collection<android.mtp.MtpStorageManager.MtpObject> getChildren() { return null; }
        private boolean exists() { return false; }
        private android.mtp.MtpStorageManager.MtpObject copy(boolean p0) { return null; }
    }

    public static abstract class MtpNotifier {
        public MtpNotifier() {}
        public abstract void sendObjectAdded(int p0);
        public abstract void sendObjectRemoved(int p0);
        public abstract void sendObjectInfoChanged(int p0);
    }
}
