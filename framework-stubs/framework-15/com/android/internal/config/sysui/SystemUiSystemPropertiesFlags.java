package com.android.internal.config.sysui;

public class SystemUiSystemPropertiesFlags {
    public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag TEAMFOOD = null;
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver TEST_RESOLVER;
    public SystemUiSystemPropertiesFlags() {}
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver getResolver() { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag devFlag(java.lang.String p0) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag devFlag(java.lang.String p0, int p1) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag devFlag(java.lang.String p0, java.lang.String p1) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag teamfoodFlag(java.lang.String p0) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag releasedFlag(java.lang.String p0) { return null; }

    public static class DebugResolver implements com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver {
        public DebugResolver() {}
        public final boolean isEnabled(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return false; }
        public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
        public int getIntValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return 0; }
        public java.lang.String getStringValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return null; }
    }

    public static final class Flag {
        public final java.lang.String mSysPropKey = null;
        public final boolean mDefaultValue = false;
        public final int mDefaultIntValue = 0;
        public final java.lang.String mDefaultStringValue = null;
        @android.annotation.Nullable
        public final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag mDebugDefault = null;
        public Flag(java.lang.String p0, boolean p1, com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p2) {}
        public Flag(java.lang.String p0, int p1, com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p2) {}
        public Flag(java.lang.String p0, java.lang.String p1, com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p2) {}
    }

    public static interface FlagResolver {
        public boolean isEnabled(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0);
        public int getIntValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0);
        public java.lang.String getStringValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0);
    }

    public static final class NotificationFlags {
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag LOG_DND_STATE_EVENTS = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag RANKING_UPDATE_ASHMEM = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag PROPAGATE_CHANNEL_UPDATES_TO_CONVERSATIONS = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag NOTIF_COOLDOWN_T1 = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag NOTIF_COOLDOWN_T2 = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag NOTIF_VOLUME1 = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag NOTIF_VOLUME2 = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag NOTIF_COOLDOWN_COUNTER_RESET = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag NOTIF_AVALANCHE_TIMEOUT = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag DEBUG_SHORT_BITMAP_DURATION = null;
        public NotificationFlags() {}
    }

    public static final class ProdResolver implements com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver {
        public ProdResolver() {}
        public boolean isEnabled(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return false; }
        public int getIntValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return 0; }
        public java.lang.String getStringValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return null; }
    }
}
