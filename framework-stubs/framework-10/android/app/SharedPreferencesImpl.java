package android.app;

final class SharedPreferencesImpl implements android.content.SharedPreferences {
    private static final java.lang.String TAG = "SharedPreferencesImpl";
    private static final boolean DEBUG = false;
    private static final java.lang.Object CONTENT = null;
    private static final long MAX_FSYNC_DURATION_MILLIS = 256L;
    @android.annotation.UnsupportedAppUsage
    private final java.io.File mFile = null;
    private final java.io.File mBackupFile = null;
    private final int mMode = 0;
    private final java.lang.Object mLock = null;
    private final java.lang.Object mWritingToDiskLock = null;
    private java.util.Map<java.lang.String, java.lang.Object> mMap;
    private java.lang.Throwable mThrowable;
    private int mDiskWritesInFlight;
    private boolean mLoaded;
    private long mStatSize;
    private final java.util.WeakHashMap<android.content.SharedPreferences.OnSharedPreferenceChangeListener, java.lang.Object> mListeners = null;
    private long mCurrentMemoryStateGeneration;
    private long mDiskStateGeneration;
    private final com.android.internal.util.ExponentiallyBucketedHistogram mSyncTimes = null;
    private int mNumSync;
    @android.annotation.UnsupportedAppUsage
    SharedPreferencesImpl(java.io.File p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    private void startLoadFromDisk() {}
    private void loadFromDisk() {}
    static java.io.File makeBackupFile(java.io.File p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    void startReloadIfChangedUnexpectedly() {}
    private boolean hasFileChangedUnexpectedly() { return false; }
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener p0) {}
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener p0) {}
    private void awaitLoadedLocked() {}
    public java.util.Map<java.lang.String, ?> getAll() { return null; }
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    public java.util.Set<java.lang.String> getStringSet(java.lang.String p0, java.util.Set<java.lang.String> p1) { return null; }
    public int getInt(java.lang.String p0, int p1) { return 0; }
    public long getLong(java.lang.String p0, long p1) { return 0L; }
    public float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public boolean contains(java.lang.String p0) { return false; }
    public android.content.SharedPreferences.Editor edit() { return null; }
    private void enqueueDiskWrite(android.app.SharedPreferencesImpl.MemoryCommitResult p0, java.lang.Runnable p1) {}
    private static java.io.FileOutputStream createFileOutputStream(java.io.File p0) { return null; }
    private void writeToFile(android.app.SharedPreferencesImpl.MemoryCommitResult p0, boolean p1) {}

    private static class MemoryCommitResult {
        final long memoryStateGeneration = 0L;
        final java.util.List<java.lang.String> keysModified = null;
        final java.util.Set<android.content.SharedPreferences.OnSharedPreferenceChangeListener> listeners = null;
        final java.util.Map<java.lang.String, java.lang.Object> mapToWriteToDisk = null;
        final java.util.concurrent.CountDownLatch writtenToDiskLatch = null;
        volatile boolean writeToDiskResult;
        boolean wasWritten;
        private MemoryCommitResult(long p0, java.util.List<java.lang.String> p1, java.util.Set<android.content.SharedPreferences.OnSharedPreferenceChangeListener> p2, java.util.Map<java.lang.String, java.lang.Object> p3) {}
        void setDiskWriteResult(boolean p0, boolean p1) {}
    }

    public final class EditorImpl implements android.content.SharedPreferences.Editor {
        private final java.lang.Object mEditorLock = null;
        private final java.util.Map<java.lang.String, java.lang.Object> mModified = null;
        private boolean mClear;
        public EditorImpl(android.app.SharedPreferencesImpl p0) {}
        public android.content.SharedPreferences.Editor putString(java.lang.String p0, java.lang.String p1) { return null; }
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String p0, java.util.Set<java.lang.String> p1) { return null; }
        public android.content.SharedPreferences.Editor putInt(java.lang.String p0, int p1) { return null; }
        public android.content.SharedPreferences.Editor putLong(java.lang.String p0, long p1) { return null; }
        public android.content.SharedPreferences.Editor putFloat(java.lang.String p0, float p1) { return null; }
        public android.content.SharedPreferences.Editor putBoolean(java.lang.String p0, boolean p1) { return null; }
        public android.content.SharedPreferences.Editor remove(java.lang.String p0) { return null; }
        public android.content.SharedPreferences.Editor clear() { return null; }
        public void apply() {}
        private android.app.SharedPreferencesImpl.MemoryCommitResult commitToMemory() { return null; }
        public boolean commit() { return false; }
        private void notifyListeners(android.app.SharedPreferencesImpl.MemoryCommitResult p0) {}
    }
}
