package android.view.textclassifier;

public final class SelectionEvent implements android.os.Parcelable {
    public static final int ACTION_OVERTYPE = 100;
    public static final int ACTION_COPY = 101;
    public static final int ACTION_PASTE = 102;
    public static final int ACTION_CUT = 103;
    public static final int ACTION_SHARE = 104;
    public static final int ACTION_SMART_SHARE = 105;
    public static final int ACTION_DRAG = 106;
    public static final int ACTION_ABANDON = 107;
    public static final int ACTION_OTHER = 108;
    public static final int ACTION_SELECT_ALL = 200;
    public static final int ACTION_RESET = 201;
    public static final int EVENT_SELECTION_STARTED = 1;
    public static final int EVENT_SELECTION_MODIFIED = 2;
    public static final int EVENT_SMART_SELECTION_SINGLE = 3;
    public static final int EVENT_SMART_SELECTION_MULTI = 4;
    public static final int EVENT_AUTO_SELECTION = 5;
    public static final int INVOCATION_MANUAL = 1;
    public static final int INVOCATION_LINK = 2;
    public static final int INVOCATION_UNKNOWN = 0;
    static final java.lang.String NO_SIGNATURE = "";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.textclassifier.SelectionEvent> CREATOR = null;
    SelectionEvent(int p0, int p1, int p2, java.lang.String p3, int p4, java.lang.String p5) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.view.textclassifier.SelectionEvent createSelectionStartedEvent(int p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int p0, int p1, android.view.textclassifier.TextClassification p2) { return null; }
    @android.annotation.NonNull
    public static android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int p0, int p1, android.view.textclassifier.TextSelection p2) { return null; }
    @android.annotation.NonNull
    public static android.view.textclassifier.SelectionEvent createSelectionActionEvent(int p0, int p1, int p2) { return null; }
    @android.annotation.NonNull
    public static android.view.textclassifier.SelectionEvent createSelectionActionEvent(int p0, int p1, int p2, android.view.textclassifier.TextClassification p3) { return null; }
    int getAbsoluteStart() { return 0; }
    int getAbsoluteEnd() { return 0; }
    public int getEventType() { return 0; }
    public void setEventType(int p0) {}
    @android.annotation.NonNull
    public java.lang.String getEntityType() { return null; }
    void setEntityType(java.lang.String p0) {}
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
    @android.annotation.Nullable
    public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
    @android.annotation.NonNull
    public java.lang.String getWidgetType() { return null; }
    @android.annotation.Nullable
    public java.lang.String getWidgetVersion() { return null; }
    public void setTextClassificationSessionContext(android.view.textclassifier.TextClassificationContext p0) {}
    public int getInvocationMethod() { return 0; }
    public void setInvocationMethod(int p0) {}
    @android.annotation.Nullable
    public java.lang.String getResultId() { return null; }
    android.view.textclassifier.SelectionEvent setResultId(java.lang.String p0) { return null; }
    public long getEventTime() { return 0L; }
    android.view.textclassifier.SelectionEvent setEventTime(long p0) { return null; }
    public long getDurationSinceSessionStart() { return 0L; }
    android.view.textclassifier.SelectionEvent setDurationSinceSessionStart(long p0) { return null; }
    public long getDurationSincePreviousEvent() { return 0L; }
    android.view.textclassifier.SelectionEvent setDurationSincePreviousEvent(long p0) { return null; }
    public int getEventIndex() { return 0; }
    public android.view.textclassifier.SelectionEvent setEventIndex(int p0) { return null; }
    @android.annotation.Nullable
    public android.view.textclassifier.TextClassificationSessionId getSessionId() { return null; }
    public android.view.textclassifier.SelectionEvent setSessionId(android.view.textclassifier.TextClassificationSessionId p0) { return null; }
    public int getStart() { return 0; }
    public android.view.textclassifier.SelectionEvent setStart(int p0) { return null; }
    public int getEnd() { return 0; }
    public android.view.textclassifier.SelectionEvent setEnd(int p0) { return null; }
    public int getSmartStart() { return 0; }
    public android.view.textclassifier.SelectionEvent setSmartStart(int p0) { return null; }
    public int getSmartEnd() { return 0; }
    public android.view.textclassifier.SelectionEvent setSmartEnd(int p0) { return null; }
    boolean isTerminal() { return false; }
    public static boolean isTerminal(int p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InvocationMethod {
    }
}
