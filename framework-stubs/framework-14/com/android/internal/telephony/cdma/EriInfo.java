package com.android.internal.telephony.cdma;

public final class EriInfo {
    public static final int ROAMING_INDICATOR_ON = 0;
    public static final int ROAMING_INDICATOR_OFF = 1;
    public static final int ROAMING_INDICATOR_FLASH = 2;
    public static final int ROAMING_ICON_MODE_NORMAL = 0;
    public static final int ROAMING_ICON_MODE_FLASH = 1;
    public int roamingIndicator;
    public int iconIndex;
    public int iconMode;
    public java.lang.String eriText;
    public int callPromptId;
    public int alertId;
    public EriInfo(int p0, int p1, int p2, java.lang.String p3, int p4, int p5) {}
}
