package com.android.internal.location;

public class GpsNetInitiatedHandler {
    public GpsNetInitiatedHandler(android.content.Context p0, com.android.internal.location.GpsNetInitiatedHandler.EmergencyCallCallback p1, boolean p2) {}
    public boolean getInEmergency() { return false; }
    public boolean getInEmergency(long p0) { return false; }
    public void setEmergencyExtensionSeconds(int p0) {}

    public static interface EmergencyCallCallback {
        public void onEmergencyCallStart(int p0);
        public void onEmergencyCallEnd();
    }

    private class EmergencyCallListener extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.OutgoingEmergencyCallListener, android.telephony.TelephonyCallback.CallStateListener {
        @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
        public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0, int p1) {}
        @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
        public void onCallStateChanged(int p0) {}
    }
}
