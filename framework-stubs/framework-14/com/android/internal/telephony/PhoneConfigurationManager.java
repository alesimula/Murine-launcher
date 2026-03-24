package com.android.internal.telephony;

public class PhoneConfigurationManager {
    public static final java.lang.String DSDA = "dsda";
    public static final java.lang.String DSDS = "dsds";
    public static final java.lang.String TSTS = "tsts";
    public static final java.lang.String SSSS = "";
    public static com.android.internal.telephony.PhoneConfigurationManager init(android.content.Context p0) { return null; }
    public static com.android.internal.telephony.PhoneConfigurationManager getInstance() { return null; }
    public void enablePhone(com.android.internal.telephony.Phone p0, boolean p1, android.os.Message p2) {}
    public boolean getPhoneStatus(com.android.internal.telephony.Phone p0) { return false; }
    public void getPhoneStatusFromModem(com.android.internal.telephony.Phone p0, android.os.Message p1) {}
    public boolean getPhoneStatusFromCache(int p0) throws java.util.NoSuchElementException { return false; }
    public void addToPhoneStatusCache(int p0, boolean p1) {}
    public int getPhoneCount() { return 0; }
    public synchronized android.telephony.PhoneCapability getStaticPhoneCapability() { return null; }
    public android.telephony.PhoneCapability getCurrentPhoneCapability() { return null; }
    public int getNumberOfModemsWithSimultaneousDataConnections() { return 0; }
    public void switchMultiSimConfig(int p0) {}
    public boolean isRebootRequiredForModemConfigChange() { return false; }
    public static void notifyMultiSimConfigChange(int p0) {}
    public static void registerForMultiSimConfigChange(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public static void unregisterForMultiSimConfigChange(android.os.Handler p0) {}
    public static void unregisterAllMultiSimConfigChangeRegistrants() {}
    public boolean setModemService(java.lang.String p0) { return false; }
    public java.lang.String getModemService() { return null; }

    private final class ConfigManagerHandler extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }

    public static class MockableInterface {
        public MockableInterface() {}
        public boolean isRebootRequiredForModemConfigChange() { return false; }
        public void setMultiSimProperties(int p0) {}
        public void notifyPhoneFactoryOnMultiSimConfigChanged(android.content.Context p0, int p1) {}
    }
}
