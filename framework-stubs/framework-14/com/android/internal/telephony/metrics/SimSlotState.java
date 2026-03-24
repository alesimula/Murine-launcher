package com.android.internal.telephony.metrics;

public class SimSlotState {
    public final int numActiveSlots = 0;
    public final int numActiveSims = 0;
    public final int numActiveEsims = 0;
    public static com.android.internal.telephony.metrics.SimSlotState getCurrentState() { return null; }
    public static boolean isEsim(int p0) { return false; }
    public static boolean isMultiSim() { return false; }
}
