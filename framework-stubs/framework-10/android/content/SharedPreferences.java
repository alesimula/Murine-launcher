package android.content;

public interface SharedPreferences {
    public java.util.Map<java.lang.String, ?> getAll();
    public java.lang.String getString(java.lang.String p0, java.lang.String p1);
    public java.util.Set<java.lang.String> getStringSet(java.lang.String p0, java.util.Set<java.lang.String> p1);
    public int getInt(java.lang.String p0, int p1);
    public long getLong(java.lang.String p0, long p1);
    public float getFloat(java.lang.String p0, float p1);
    public boolean getBoolean(java.lang.String p0, boolean p1);
    public boolean contains(java.lang.String p0);
    public android.content.SharedPreferences.Editor edit();
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener p0);
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener p0);

    public static interface OnSharedPreferenceChangeListener {
        public void onSharedPreferenceChanged(android.content.SharedPreferences p0, java.lang.String p1);
    }

    public static interface Editor {
        public android.content.SharedPreferences.Editor putString(java.lang.String p0, java.lang.String p1);
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String p0, java.util.Set<java.lang.String> p1);
        public android.content.SharedPreferences.Editor putInt(java.lang.String p0, int p1);
        public android.content.SharedPreferences.Editor putLong(java.lang.String p0, long p1);
        public android.content.SharedPreferences.Editor putFloat(java.lang.String p0, float p1);
        public android.content.SharedPreferences.Editor putBoolean(java.lang.String p0, boolean p1);
        public android.content.SharedPreferences.Editor remove(java.lang.String p0);
        public android.content.SharedPreferences.Editor clear();
        public boolean commit();
        public void apply();
    }
}
