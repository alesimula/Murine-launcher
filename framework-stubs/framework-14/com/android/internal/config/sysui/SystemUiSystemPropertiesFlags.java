package com.android.internal.config.sysui;

public class SystemUiSystemPropertiesFlags {
    public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag TEAMFOOD = null;
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver TEST_RESOLVER;
    public SystemUiSystemPropertiesFlags() {}
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver getResolver() { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag devFlag(java.lang.String p0) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag teamfoodFlag(java.lang.String p0) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag releasedFlag(java.lang.String p0) { return null; }

    public static class DebugResolver implements com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver {
        public DebugResolver() {}
        public final boolean isEnabled(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return false; }
        public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    }

    public static final class Flag {
        public final java.lang.String mSysPropKey = null;
        public final boolean mDefaultValue = false;
        public final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag mDebugDefault = null;
        public Flag(java.lang.String p0, boolean p1, com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p2) {}
    }

    public static interface FlagResolver {
        public boolean isEnabled(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0);
    }

    public static final class NotificationFlags {
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag FSI_FORCE_DEMOTE = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag SHOW_STICKY_HUN_FOR_DENIED_FSI = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag ALLOW_DISMISS_ONGOING = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag OTP_REDACTION = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag NO_SORT_BY_INTERRUPTIVENESS = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag LOG_DND_STATE_EVENTS = null;
        public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag WAKE_LOCK_FOR_POSTING_NOTIFICATION = null;
        public NotificationFlags() {}
    }

    public static final class ProdResolver implements com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver {
        public ProdResolver() {}
        public boolean isEnabled(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return false; }
    }
}
