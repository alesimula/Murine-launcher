package android.app;

final class SharedPreferencesImpl implements android.content.SharedPreferences {
    SharedPreferencesImpl(java.io.File p0, int p1) {}
    static java.io.File makeBackupFile(java.io.File p0) { return null; }
    void startReloadIfChangedUnexpectedly() {}
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener p0) {}
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener p0) {}
    public java.util.Map<java.lang.String, ?> getAll() { return null; }
    @android.annotation.Nullable
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.Nullable
    public java.util.Set<java.lang.String> getStringSet(java.lang.String p0, java.util.Set<java.lang.String> p1) { return null; }
    public int getInt(java.lang.String p0, int p1) { return 0; }
    public long getLong(java.lang.String p0, long p1) { return 0L; }
    public float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public boolean contains(java.lang.String p0) { return false; }
    public android.content.SharedPreferences.Editor edit() { return null; }

    public final class EditorImpl implements android.content.SharedPreferences.Editor {
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
        public boolean commit() { return false; }
    }

    private static class MemoryCommitResult {
        final long memoryStateGeneration = 0L;
        final boolean keysCleared = false;
        @android.annotation.Nullable
        final java.util.List<java.lang.String> keysModified = null;
        @android.annotation.Nullable
        final java.util.Set<android.content.SharedPreferences.OnSharedPreferenceChangeListener> listeners = null;
        final java.util.Map<java.lang.String, java.lang.Object> mapToWriteToDisk = null;
        final java.util.concurrent.CountDownLatch writtenToDiskLatch = null;
        volatile boolean writeToDiskResult;
        boolean wasWritten;
        void setDiskWriteResult(boolean p0, boolean p1) {}
    }

    private static final class SharedPreferencesThreadFactory implements java.util.concurrent.ThreadFactory {
        public java.lang.Thread newThread(java.lang.Runnable p0) { return null; }
    }
}
