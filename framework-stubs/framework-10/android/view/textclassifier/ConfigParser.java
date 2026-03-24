package android.view.textclassifier;

public final class ConfigParser {
    private static final java.lang.String TAG = "ConfigParser";
    static final boolean ENABLE_DEVICE_CONFIG = true;
    private static final java.lang.String STRING_LIST_DELIMITER = ":";
    private final java.util.function.Supplier<java.lang.String> mLegacySettingsSupplier = null;
    private final java.lang.Object mLock = null;
    private final java.util.Map<java.lang.String, java.lang.Object> mCache = null;
    private android.util.KeyValueListParser mSettingsParser;
    public ConfigParser(java.util.function.Supplier<java.lang.String> p0) {}
    private android.util.KeyValueListParser getLegacySettings() { return null; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public int getInt(java.lang.String p0, int p1) { return 0; }
    public float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    public java.util.List<java.lang.String> getStringList(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
    public float[] getFloatArray(java.lang.String p0, float[] p1) { return null; }
    private java.util.List<java.lang.String> getSettingsStringList(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
    private static java.util.List<java.lang.String> getDeviceConfigStringList(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
    private static float[] getDeviceConfigFloatArray(java.lang.String p0, float[] p1) { return null; }
    private float[] getSettingsFloatArray(java.lang.String p0, float[] p1) { return null; }
    private static java.util.List<java.lang.String> parse(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
    private static float[] parse(java.lang.String p0, float[] p1) { return null; }
}
