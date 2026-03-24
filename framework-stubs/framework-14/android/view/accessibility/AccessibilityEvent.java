package android.view.accessibility;

public final class AccessibilityEvent extends android.view.accessibility.AccessibilityRecord implements android.os.Parcelable {
    public static final boolean DEBUG_ORIGIN = false;
    public static final int INVALID_POSITION = -1;
    @java.lang.Deprecated
    public static final int MAX_TEXT_LENGTH = 500;
    public static final int TYPE_VIEW_CLICKED = 1;
    public static final int TYPE_VIEW_LONG_CLICKED = 2;
    public static final int TYPE_VIEW_SELECTED = 4;
    public static final int TYPE_VIEW_FOCUSED = 8;
    public static final int TYPE_VIEW_TEXT_CHANGED = 16;
    public static final int TYPE_WINDOW_STATE_CHANGED = 32;
    public static final int TYPE_NOTIFICATION_STATE_CHANGED = 64;
    public static final int TYPE_VIEW_HOVER_ENTER = 128;
    public static final int TYPE_VIEW_HOVER_EXIT = 256;
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;
    public static final int TYPE_VIEW_SCROLLED = 4096;
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_ANNOUNCEMENT = 16384;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
    public static final int TYPE_GESTURE_DETECTION_START = 262144;
    public static final int TYPE_GESTURE_DETECTION_END = 524288;
    public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
    public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
    public static final int TYPE_WINDOWS_CHANGED = 4194304;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;
    public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
    public static final int TYPE_SPEECH_STATE_CHANGE = 33554432;
    public static final int TYPE_VIEW_TARGETED_BY_SCROLL = 67108864;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
    public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
    public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
    public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
    public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 32;
    public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = 64;
    public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = 128;
    public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = 256;
    public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = 512;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_INVALID = 1024;
    public static final int CONTENT_CHANGE_TYPE_ERROR = 2048;
    public static final int CONTENT_CHANGE_TYPE_ENABLED = 4096;
    public static final int SPEECH_STATE_SPEAKING_START = 1;
    public static final int SPEECH_STATE_SPEAKING_END = 2;
    public static final int SPEECH_STATE_LISTENING_START = 4;
    public static final int SPEECH_STATE_LISTENING_END = 8;
    public static final int WINDOWS_CHANGE_ADDED = 1;
    public static final int WINDOWS_CHANGE_REMOVED = 2;
    public static final int WINDOWS_CHANGE_TITLE = 4;
    public static final int WINDOWS_CHANGE_BOUNDS = 8;
    public static final int WINDOWS_CHANGE_LAYER = 16;
    public static final int WINDOWS_CHANGE_ACTIVE = 32;
    public static final int WINDOWS_CHANGE_FOCUSED = 64;
    public static final int WINDOWS_CHANGE_ACCESSIBILITY_FOCUSED = 128;
    public static final int WINDOWS_CHANGE_PARENT = 256;
    public static final int WINDOWS_CHANGE_CHILDREN = 512;
    public static final int WINDOWS_CHANGE_PIP = 1024;
    public static final int TYPES_ALL_MASK = -1;
    int mMovementGranularity;
    int mAction;
    int mContentChangeTypes;
    int mWindowChangeTypes;
    int mSpeechStateChangeTypes;
    public java.lang.StackTraceElement[] originStackTrace;
    public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityEvent> CREATOR = null;
    public AccessibilityEvent() { super(); }
    public AccessibilityEvent(int p0) { super(); }
    public AccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { super(); }
    void init(android.view.accessibility.AccessibilityEvent p0) {}
    public void setSealed(boolean p0) {}
    public int getRecordCount() { return 0; }
    public void appendRecord(android.view.accessibility.AccessibilityRecord p0) {}
    public android.view.accessibility.AccessibilityRecord getRecord(int p0) { return null; }
    public int getEventType() { return 0; }
    public int getContentChangeTypes() { return 0; }
    public void setContentChangeTypes(int p0) {}
    public boolean isAccessibilityDataSensitive() { return false; }
    public void setAccessibilityDataSensitive(boolean p0) {}
    public int getSpeechStateChangeTypes() { return 0; }
    public void setSpeechStateChangeTypes(int p0) {}
    public int getWindowChanges() { return 0; }
    public void setWindowChanges(int p0) {}
    public void setEventType(int p0) {}
    public long getEventTime() { return 0L; }
    public void setEventTime(long p0) {}
    public java.lang.CharSequence getPackageName() { return null; }
    public void setPackageName(java.lang.CharSequence p0) {}
    public void setMovementGranularity(int p0) {}
    public int getMovementGranularity() { return 0; }
    public void setAction(int p0) {}
    public int getAction() { return 0; }
    public static android.view.accessibility.AccessibilityEvent obtainWindowsChangedEvent(int p0, int p1, int p2) { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityEvent obtain(int p0) { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityEvent obtain(android.view.accessibility.AccessibilityEvent p0) { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityEvent obtain() { return null; }
    @java.lang.Deprecated
    public void recycle() {}
    protected void clear() {}
    public void initFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.lang.String eventTypeToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentChangeTypes {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SpeechStateChangeTypes {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WindowsChangeTypes {
    }
}
