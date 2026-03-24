package android.provider;

public interface DeviceConfigInterface {
    @android.annotation.NonNull
    public static final android.provider.DeviceConfigInterface REAL = null;
    @android.annotation.Nullable
    public java.lang.String getProperty(java.lang.String p0, java.lang.String p1);
    @android.annotation.NonNull
    public android.provider.DeviceConfig.Properties getProperties(java.lang.String p0, java.lang.String... p1);
    public boolean setProperty(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3);
    public boolean setProperties(android.provider.DeviceConfig.Properties p0) throws android.provider.DeviceConfig.BadConfigException;
    public boolean deleteProperty(java.lang.String p0, java.lang.String p1);
    public void resetToDefaults(int p0, java.lang.String p1);
    @android.annotation.NonNull
    public java.lang.String getString(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    public int getInt(java.lang.String p0, java.lang.String p1, int p2);
    public long getLong(java.lang.String p0, java.lang.String p1, long p2);
    public boolean getBoolean(java.lang.String p0, java.lang.String p1, boolean p2);
    public float getFloat(java.lang.String p0, java.lang.String p1, float p2);
    public void addOnPropertiesChangedListener(java.lang.String p0, java.util.concurrent.Executor p1, android.provider.DeviceConfig.OnPropertiesChangedListener p2);
    public void removeOnPropertiesChangedListener(android.provider.DeviceConfig.OnPropertiesChangedListener p0);
}
