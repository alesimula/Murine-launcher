package android.app;

public class TaskInfo {
    public static final int PROPERTY_VALUE_UNSET = -1;
    public static final int SELF_MOVABLE_UNSET = -1;
    public static final int SELF_MOVABLE_DEFAULT = 0;
    public static final int SELF_MOVABLE_ALLOWED = 1;
    public static final int SELF_MOVABLE_DENIED = 2;
    public int userId;
    public int taskId;
    public int effectiveUid;
    public boolean isRunning;
    @android.annotation.NonNull
    public android.content.Intent baseIntent;
    @android.annotation.Nullable
    public android.content.ComponentName baseActivity;
    @android.annotation.Nullable
    public android.content.ComponentName topActivity;
    @android.annotation.Nullable
    public android.content.ComponentName origActivity;
    @android.annotation.Nullable
    public android.content.ComponentName realActivity;
    public int numActivities;
    public long lastActiveTime;
    public int displayId;
    public int displayAreaFeatureId;
    @android.annotation.Nullable
    public android.app.ActivityManager.TaskDescription taskDescription;
    @android.annotation.Nullable
    public android.content.LocusId mTopActivityLocusId;
    public boolean supportsMultiWindow;
    public int resizeMode;
    @android.annotation.NonNull
    public final android.content.res.Configuration configuration = null;
    @android.annotation.NonNull
    public android.window.WindowContainerToken token;
    @android.annotation.Nullable
    public android.app.PictureInPictureParams pictureInPictureParams;
    public boolean shouldDockBigOverlays;
    public int launchIntoPipHostTaskId;
    public int lastParentTaskIdBeforePip;
    @android.annotation.Nullable
    public android.graphics.Rect displayCutoutInsets;
    public int topActivityType;
    @android.annotation.Nullable
    public android.content.pm.ActivityInfo topActivityInfo;
    public boolean isResizeable;
    public int minWidth;
    public int minHeight;
    public int defaultMinSize;
    public android.graphics.Point positionInParent;
    public java.util.ArrayList<android.os.IBinder> launchCookies;
    public int parentTaskId;
    public boolean isFocused;
    public boolean isVisible;
    public boolean isVisibleRequested;
    public boolean isTopActivityNoDisplay;
    public boolean isSleeping;
    public boolean isTopActivityTransparent;
    public boolean isActivityStackTransparent;
    @android.annotation.Nullable
    public android.graphics.Rect lastNonFullscreenBounds;
    @android.annotation.Nullable
    public android.net.Uri capturedLink;
    public long capturedLinkTimestamp;
    public int requestedVisibleTypes;
    public long topActivityRequestOpenInBrowserEducationTimestamp;
    public android.app.AppCompatTaskInfo appCompatTaskInfo;
    public boolean isAppBubble;
    @android.annotation.Nullable
    public android.graphics.Rect topActivityMainWindowFrame;
    TaskInfo() {}
    public TaskInfo(android.os.Parcel p0) {}
    public int getTaskId() { return 0; }
    public boolean isVisible() { return false; }
    @android.annotation.NonNull
    public android.window.WindowContainerToken getToken() { return null; }
    @android.annotation.NonNull
    public android.content.res.Configuration getConfiguration() { return null; }
    @android.annotation.Nullable
    public android.app.PictureInPictureParams getPictureInPictureParams() { return null; }
    public boolean shouldDockBigOverlays() { return false; }
    public int getWindowingMode() { return 0; }
    public boolean isFreeform() { return false; }
    public int getActivityType() { return 0; }
    public void addLaunchCookie(android.os.IBinder p0) {}
    public boolean containsLaunchCookie(android.os.IBinder p0) { return false; }
    public int getParentTaskId() { return 0; }
    public boolean hasParentTask() { return false; }
    public int getDisplayId() { return 0; }
    public boolean equalsForTaskOrganizer(android.app.TaskInfo p0) { return false; }
    public boolean equalsForCompatUi(android.app.TaskInfo p0) { return false; }
    void readTaskFromParcel(android.os.Parcel p0) {}
    public void writeTaskToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static @interface SelfMovable {
    }
}
