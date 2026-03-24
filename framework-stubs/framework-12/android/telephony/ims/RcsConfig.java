package android.telephony.ims;

public final class RcsConfig {
    private static final java.lang.String LOG_TAG = "RcsConfig";
    private static final boolean DBG = Boolean.valueOf(false);
    private static final java.lang.String TAG_CHARACTERISTIC = "characteristic";
    private static final java.lang.String TAG_PARM = "parm";
    private static final java.lang.String ATTRIBUTE_TYPE = "type";
    private static final java.lang.String ATTRIBUTE_NAME = "name";
    private static final java.lang.String ATTRIBUTE_VALUE = "value";
    private static final java.lang.String PARM_SINGLE_REGISTRATION = "rcsVolteSingleRegistration";
    private final android.telephony.ims.RcsConfig.Characteristic mRoot = null;
    private android.telephony.ims.RcsConfig.Characteristic mCurrent;
    private final byte[] mData = null;
    public RcsConfig(byte[] p0) throws java.lang.IllegalArgumentException {}
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    public int getInteger(java.lang.String p0, int p1) { return 0; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public boolean hasConfig(java.lang.String p0) { return false; }
    public android.telephony.ims.RcsConfig.Characteristic getCharacteristic(java.lang.String p0) { return null; }
    public boolean hasCharacteristic(java.lang.String p0) { return false; }
    public void setCurrentCharacteristic(android.telephony.ims.RcsConfig.Characteristic p0) {}
    public boolean moveToParent() { return false; }
    public void moveToRoot() {}
    public android.telephony.ims.RcsConfig.Characteristic getRoot() { return null; }
    public android.telephony.ims.RcsConfig.Characteristic getCurrentCharacteristic() { return null; }
    public boolean isRcsVolteSingleRegistrationSupported(boolean p0) { return false; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static byte[] compressGzip(byte[] p0) { return null; }
    public static byte[] decompressGzip(byte[] p0) { return null; }
    public static void updateConfigForSub(android.content.Context p0, int p1, byte[] p2, boolean p3) {}
    public static byte[] loadRcsConfigForSub(android.content.Context p0, int p1, boolean p2) { return null; }
    private static void logd(java.lang.String p0) {}
    private static void loge(java.lang.String p0) {}

    public static class Characteristic {
        private java.lang.String mType;
        private final java.util.Map<java.lang.String, java.lang.String> mParms = null;
        private final java.util.Set<android.telephony.ims.RcsConfig.Characteristic> mSubs = null;
        private final android.telephony.ims.RcsConfig.Characteristic mParent = null;
        private Characteristic(java.lang.String p0, android.telephony.ims.RcsConfig.Characteristic p1) {}
        private java.lang.String getType() { return null; }
        private java.util.Map<java.lang.String, java.lang.String> getParms() { return null; }
        private java.util.Set<android.telephony.ims.RcsConfig.Characteristic> getSubs() { return null; }
        private android.telephony.ims.RcsConfig.Characteristic getParent() { return null; }
        private android.telephony.ims.RcsConfig.Characteristic getSubByType(java.lang.String p0) { return null; }
        private boolean hasSubByType(java.lang.String p0) { return false; }
        private java.lang.String getParmValue(java.lang.String p0) { return null; }
        boolean hasParm(java.lang.String p0) { return false; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
