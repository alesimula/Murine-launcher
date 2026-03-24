package android.telephony.ims;

public final class RcsConfig {
    public RcsConfig(byte[] p0) throws java.lang.IllegalArgumentException {}
    @android.annotation.Nullable
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    public int getInteger(java.lang.String p0, int p1) { return 0; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public boolean hasConfig(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public android.telephony.ims.RcsConfig.Characteristic getCharacteristic(java.lang.String p0) { return null; }
    public boolean hasCharacteristic(java.lang.String p0) { return false; }
    public void setCurrentCharacteristic(android.telephony.ims.RcsConfig.Characteristic p0) {}
    public boolean moveToParent() { return false; }
    public void moveToRoot() {}
    @android.annotation.NonNull
    public android.telephony.ims.RcsConfig.Characteristic getRoot() { return null; }
    @android.annotation.NonNull
    public android.telephony.ims.RcsConfig.Characteristic getCurrentCharacteristic() { return null; }
    public boolean isRcsVolteSingleRegistrationSupported(boolean p0) { return false; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.Nullable
    public static byte[] compressGzip(byte[] p0) { return null; }
    @android.annotation.Nullable
    public static byte[] decompressGzip(byte[] p0) { return null; }
    public static void updateConfigForSub(android.content.Context p0, int p1, byte[] p2, boolean p3) {}
    @android.annotation.Nullable
    public static byte[] loadRcsConfigForSub(android.content.Context p0, int p1, boolean p2) { return null; }

    public static class Characteristic {
        boolean hasParm(java.lang.String p0) { return false; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
