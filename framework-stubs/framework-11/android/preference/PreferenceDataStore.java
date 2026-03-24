package android.preference;

@java.lang.Deprecated
public interface PreferenceDataStore {
    default public void putString(java.lang.String p0, java.lang.String p1) {}
    default public void putStringSet(java.lang.String p0, java.util.Set<java.lang.String> p1) {}
    default public void putInt(java.lang.String p0, int p1) {}
    default public void putLong(java.lang.String p0, long p1) {}
    default public void putFloat(java.lang.String p0, float p1) {}
    default public void putBoolean(java.lang.String p0, boolean p1) {}
    default public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    default public java.util.Set<java.lang.String> getStringSet(java.lang.String p0, java.util.Set<java.lang.String> p1) { return null; }
    default public int getInt(java.lang.String p0, int p1) { return 0; }
    default public long getLong(java.lang.String p0, long p1) { return 0L; }
    default public float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    default public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
}
