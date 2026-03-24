package android.app.smartspace;

@android.annotation.SystemApi
public final class SmartspaceTargetEvent implements android.os.Parcelable {
    public static final int EVENT_TARGET_INTERACTION = 1;
    public static final int EVENT_TARGET_SHOWN = 2;
    public static final int EVENT_TARGET_HIDDEN = 3;
    public static final int EVENT_TARGET_DISMISS = 4;
    public static final int EVENT_TARGET_BLOCK = 5;
    public static final int EVENT_UI_SURFACE_SHOWN = 6;
    public static final int EVENT_UI_SURFACE_HIDDEN = 7;
    public static final android.os.Parcelable.Creator<android.app.smartspace.SmartspaceTargetEvent> CREATOR = null;
    private final android.app.smartspace.SmartspaceTarget mSmartspaceTarget = null;
    private final java.lang.String mSmartspaceActionId = null;
    private final int mEventType = 0;
    private SmartspaceTargetEvent(android.app.smartspace.SmartspaceTarget p0, java.lang.String p1, int p2) {}
    private SmartspaceTargetEvent(android.os.Parcel p0) {}
    public android.app.smartspace.SmartspaceTarget getSmartspaceTarget() { return null; }
    public java.lang.String getSmartspaceActionId() { return null; }
    public int getEventType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        private final int mEventType = 0;
        private android.app.smartspace.SmartspaceTarget mSmartspaceTarget;
        private java.lang.String mSmartspaceActionId;
        public Builder(int p0) {}
        public android.app.smartspace.SmartspaceTargetEvent.Builder setSmartspaceTarget(android.app.smartspace.SmartspaceTarget p0) { return null; }
        public android.app.smartspace.SmartspaceTargetEvent.Builder setSmartspaceActionId(java.lang.String p0) { return null; }
        public android.app.smartspace.SmartspaceTargetEvent build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}
