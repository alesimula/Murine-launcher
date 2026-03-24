package com.android.internal.telephony;

public class TelephonyDevController extends android.os.Handler {
    public static com.android.internal.telephony.TelephonyDevController create() { return null; }
    public static com.android.internal.telephony.TelephonyDevController getInstance() { return null; }
    public static void registerRIL(com.android.internal.telephony.CommandsInterface p0) {}
    public static void unregisterRIL(com.android.internal.telephony.CommandsInterface p0) {}
    public void handleMessage(android.os.Message p0) {}
    public static int getModemCount() { return 0; }
    public com.android.internal.telephony.HardwareConfig getModem(int p0) { return null; }
    public int getSimCount() { return 0; }
    public com.android.internal.telephony.HardwareConfig getSim(int p0) { return null; }
    public com.android.internal.telephony.HardwareConfig getModemForSim(int p0) { return null; }
    public java.util.ArrayList<com.android.internal.telephony.HardwareConfig> getAllSimsForModem(int p0) { return null; }
    public java.util.ArrayList<com.android.internal.telephony.HardwareConfig> getAllModems() { return null; }
    public java.util.ArrayList<com.android.internal.telephony.HardwareConfig> getAllSims() { return null; }
}
