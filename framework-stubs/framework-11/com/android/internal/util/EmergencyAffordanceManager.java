package com.android.internal.util;

public class EmergencyAffordanceManager {
    public static final boolean ENABLED = true;
    private static final java.lang.String EMERGENCY_CALL_NUMBER_SETTING = "emergency_affordance_number";
    private static final java.lang.String FORCE_EMERGENCY_AFFORDANCE_SETTING = "force_emergency_affordance";
    private final android.content.Context mContext = null;
    public EmergencyAffordanceManager(android.content.Context p0) {}
    public final void performEmergencyCall() {}
    private static android.net.Uri getPhoneUri(android.content.Context p0) { return null; }
    private static void performEmergencyCall(android.content.Context p0) {}
    public boolean needsEmergencyAffordance() { return false; }
    private boolean isEmergencyAffordanceNeeded() { return false; }
    private boolean forceShowing() { return false; }
}
