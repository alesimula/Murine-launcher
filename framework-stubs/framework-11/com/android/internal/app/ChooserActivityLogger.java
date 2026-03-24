package com.android.internal.app;

public interface ChooserActivityLogger {
    public void logShareStarted(int p0, java.lang.String p1, java.lang.String p2, int p3, int p4, boolean p5, int p6, java.lang.String p7);
    public void logShareTargetSelected(int p0, java.lang.String p1, int p2);
    default public void logSharesheetTriggered() {}
    default public void logSharesheetAppLoadComplete() {}
    default public void logSharesheetDirectLoadComplete() {}
    default public void logSharesheetDirectLoadTimeout() {}
    default public void logShareheetProfileChanged() {}
    default public void logSharesheetExpansionChanged(boolean p0) {}
    public void log(com.android.internal.logging.UiEventLogger.UiEventEnum p0, com.android.internal.logging.InstanceId p1);
    public com.android.internal.logging.InstanceId getInstanceId();
    default public int typeFromPreviewInt(int p0) { return 0; }
    default public int typeFromIntentString(java.lang.String p0) { return 0; }

    public static enum SharesheetStandardEvent implements com.android.internal.logging.UiEventLogger.UiEventEnum {
        INVALID,
        SHARESHEET_TRIGGERED,
        SHARESHEET_PROFILE_CHANGED,
        SHARESHEET_EXPANDED,
        SHARESHEET_COLLAPSED,
        SHARESHEET_APP_LOAD_COMPLETE,
        SHARESHEET_DIRECT_LOAD_COMPLETE,
        SHARESHEET_DIRECT_LOAD_TIMEOUT;
        private final int mId = 0;
        private SharesheetStandardEvent() {}
        public int getId() { return 0; }
    }

    public static enum SharesheetStartedEvent implements com.android.internal.logging.UiEventLogger.UiEventEnum {
        SHARE_STARTED;
        private final int mId = 0;
        private SharesheetStartedEvent() {}
        public int getId() { return 0; }
    }

    public static enum SharesheetTargetSelectedEvent implements com.android.internal.logging.UiEventLogger.UiEventEnum {
        INVALID,
        SHARESHEET_SERVICE_TARGET_SELECTED,
        SHARESHEET_APP_TARGET_SELECTED,
        SHARESHEET_STANDARD_TARGET_SELECTED,
        SHARESHEET_COPY_TARGET_SELECTED;
        private final int mId = 0;
        private SharesheetTargetSelectedEvent() {}
        public int getId() { return 0; }
        public static com.android.internal.app.ChooserActivityLogger.SharesheetTargetSelectedEvent fromTargetType(int p0) { return null; }
    }
}
