package android.app;

public class ActivityOptions extends android.app.ComponentOptions {
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";
    public static final int MODE_BACKGROUND_ACTIVITY_START_SYSTEM_DEFINED = 0;
    public static final int MODE_BACKGROUND_ACTIVITY_START_ALLOWED = 1;
    public static final int MODE_BACKGROUND_ACTIVITY_START_DENIED = 2;
    public static final java.lang.String KEY_PACKAGE_NAME = "android:activity.packageName";
    public static final java.lang.String KEY_LAUNCH_BOUNDS = "android:activity.launchBounds";
    public static final java.lang.String KEY_ANIM_TYPE = "android:activity.animType";
    public static final java.lang.String KEY_ANIM_ENTER_RES_ID = "android:activity.animEnterRes";
    public static final java.lang.String KEY_ANIM_EXIT_RES_ID = "android:activity.animExitRes";
    public static final java.lang.String KEY_ANIM_IN_PLACE_RES_ID = "android:activity.animInPlaceRes";
    public static final java.lang.String KEY_ANIM_BACKGROUND_COLOR = "android:activity.backgroundColor";
    public static final java.lang.String KEY_ANIM_THUMBNAIL = "android:activity.animThumbnail";
    public static final java.lang.String KEY_ANIM_START_X = "android:activity.animStartX";
    public static final java.lang.String KEY_ANIM_START_Y = "android:activity.animStartY";
    public static final java.lang.String KEY_ANIM_WIDTH = "android:activity.animWidth";
    public static final java.lang.String KEY_ANIM_HEIGHT = "android:activity.animHeight";
    public static final java.lang.String KEY_ANIM_START_LISTENER = "android:activity.animStartListener";
    public static final java.lang.String KEY_SPLASH_SCREEN_THEME = "android.activity.splashScreenTheme";
    public static final java.lang.String KEY_LEGACY_PERMISSION_PROMPT_ELIGIBLE = "android:activity.legacyPermissionPromptEligible";
    public static final java.lang.String KEY_LAUNCH_ROOT_TASK_TOKEN = "android.activity.launchRootTaskToken";
    public static final java.lang.String KEY_LAUNCH_TASK_FRAGMENT_TOKEN = "android.activity.launchTaskFragmentToken";
    public static final java.lang.String KEY_TRANSIENT_LAUNCH = "android.activity.transientLaunch";
    public static final java.lang.String KEY_LAUNCH_COOKIE = "android.activity.launchCookie";
    public static final int ANIM_UNDEFINED = -1;
    public static final int ANIM_NONE = 0;
    public static final int ANIM_CUSTOM = 1;
    public static final int ANIM_SCALE_UP = 2;
    public static final int ANIM_THUMBNAIL_SCALE_UP = 3;
    public static final int ANIM_THUMBNAIL_SCALE_DOWN = 4;
    public static final int ANIM_SCENE_TRANSITION = 5;
    public static final int ANIM_DEFAULT = 6;
    public static final int ANIM_LAUNCH_TASK_BEHIND = 7;
    public static final int ANIM_THUMBNAIL_ASPECT_SCALE_UP = 8;
    public static final int ANIM_THUMBNAIL_ASPECT_SCALE_DOWN = 9;
    public static final int ANIM_CUSTOM_IN_PLACE = 10;
    public static final int ANIM_CLIP_REVEAL = 11;
    public static final int ANIM_OPEN_CROSS_PROFILE_APPS = 12;
    public static final int ANIM_REMOTE_ANIMATION = 13;
    public static final int ANIM_FROM_STYLE = 14;
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2) { return null; }
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2, int p3) { return null; }
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2, int p3, android.os.Handler p4, android.app.ActivityOptions.OnAnimationStartedListener p5) { return null; }
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2, int p3, android.os.Handler p4, android.app.ActivityOptions.OnAnimationStartedListener p5, android.app.ActivityOptions.OnAnimationFinishedListener p6) { return null; }
    @android.annotation.RequiresPermission("android.permission.START_TASKS_FROM_RECENTS")
    public static android.app.ActivityOptions makeCustomTaskAnimation(android.content.Context p0, int p1, int p2, android.os.Handler p3, android.app.ActivityOptions.OnAnimationStartedListener p4, android.app.ActivityOptions.OnAnimationFinishedListener p5) { return null; }
    public static android.app.ActivityOptions makeCustomInPlaceAnimation(android.content.Context p0, int p1) { return null; }
    public static android.app.ActivityOptions makeScaleUpAnimation(android.view.View p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.app.ActivityOptions makeClipRevealAnimation(android.view.View p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.app.ActivityOptions makeOpenCrossProfileAppsAnimation() { return null; }
    public static android.app.ActivityOptions makeThumbnailScaleUpAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3) { return null; }
    public static android.app.ActivityOptions makeMultiThumbFutureAspectScaleAnimation(android.content.Context p0, android.os.Handler p1, android.view.IAppTransitionAnimationSpecsFuture p2, android.app.ActivityOptions.OnAnimationStartedListener p3, boolean p4) { return null; }
    public static android.app.ActivityOptions makeThumbnailAspectScaleDownAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3, int p4, int p5, android.os.Handler p6, android.app.ActivityOptions.OnAnimationStartedListener p7) { return null; }
    public static android.app.ActivityOptions makeThumbnailAspectScaleDownAnimation(android.view.View p0, android.view.AppTransitionAnimationSpec[] p1, android.os.Handler p2, android.app.ActivityOptions.OnAnimationStartedListener p3, android.app.ActivityOptions.OnAnimationFinishedListener p4) { return null; }
    public static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity p0, android.view.View p1, java.lang.String p2) { return null; }
    @java.lang.SafeVarargs
    public static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity p0, android.util.Pair<android.view.View, java.lang.String>... p1) { return null; }
    @java.lang.SafeVarargs
    public static android.util.Pair<android.app.ActivityOptions, android.app.ExitTransitionCoordinator> startSharedElementAnimation(android.view.Window p0, android.app.ExitTransitionCoordinator.ExitTransitionCallbacks p1, android.app.SharedElementCallback p2, android.util.Pair<android.view.View, java.lang.String>... p3) { return null; }
    public static void stopSharedElementAnimation(android.view.Window p0) {}
    static android.app.ExitTransitionCoordinator makeSceneTransitionAnimation(android.app.ExitTransitionCoordinator.ExitTransitionCallbacks p0, android.app.SharedElementCallback p1, android.view.Window p2, android.app.ActivityOptions p3, android.util.Pair<android.view.View, java.lang.String>[] p4) { return null; }
    public static void setExitTransitionTimeout(long p0) {}
    static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity p0, android.app.ExitTransitionCoordinator p1, java.util.ArrayList<java.lang.String> p2, int p3, android.content.Intent p4) { return null; }
    public static android.app.ActivityOptions makeTaskLaunchBehind() { return null; }
    public static android.app.ActivityOptions makeBasic() { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_REMOTE_APP_TRANSITION_ANIMATIONS")
    public static android.app.ActivityOptions makeRemoteAnimation(android.view.RemoteAnimationAdapter p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_REMOTE_APP_TRANSITION_ANIMATIONS")
    public static android.app.ActivityOptions makeRemoteAnimation(android.view.RemoteAnimationAdapter p0, android.window.RemoteTransition p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_REMOTE_APP_TRANSITION_ANIMATIONS")
    public static android.app.ActivityOptions makeRemoteTransition(android.window.RemoteTransition p0) { return null; }
    public static android.app.ActivityOptions makeLaunchIntoPip(android.app.PictureInPictureParams p0) { return null; }
    public boolean getLaunchTaskBehind() { return false; }
    public ActivityOptions(android.os.Bundle p0) { super(); }
    public android.app.ActivityOptions setLaunchBounds(android.graphics.Rect p0) { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.graphics.Rect getLaunchBounds() { return null; }
    public int getAnimationType() { return 0; }
    public int getCustomEnterResId() { return 0; }
    public int getCustomExitResId() { return 0; }
    public int getCustomInPlaceResId() { return 0; }
    public int getCustomBackgroundColor() { return 0; }
    public android.hardware.HardwareBuffer getThumbnail() { return null; }
    public int getStartX() { return 0; }
    public int getStartY() { return 0; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public android.os.IRemoteCallback getAnimationStartedListener() { return null; }
    public android.os.IRemoteCallback getAnimationFinishedListener() { return null; }
    public int getExitCoordinatorKey() { return 0; }
    public void abort() {}
    public boolean isReturning() { return false; }
    boolean isCrossTask() { return false; }
    public java.util.ArrayList<java.lang.String> getSharedElementNames() { return null; }
    public android.os.ResultReceiver getResultReceiver() { return null; }
    public int getResultCode() { return 0; }
    public android.content.Intent getResultData() { return null; }
    public android.app.PendingIntent getUsageTimeReport() { return null; }
    public android.view.AppTransitionAnimationSpec[] getAnimSpecs() { return null; }
    public android.view.IAppTransitionAnimationSpecsFuture getSpecsFuture() { return null; }
    public android.view.RemoteAnimationAdapter getRemoteAnimationAdapter() { return null; }
    public void setRemoteAnimationAdapter(android.view.RemoteAnimationAdapter p0) {}
    public android.window.RemoteTransition getRemoteTransition() { return null; }
    public void setRemoteTransition(android.window.RemoteTransition p0) {}
    public static android.app.ActivityOptions fromBundle(android.os.Bundle p0) { return null; }
    public static void abort(android.app.ActivityOptions p0) {}
    public boolean getLockTaskMode() { return false; }
    public boolean isShareIdentityEnabled() { return false; }
    public java.lang.String getSplashScreenThemeResName() { return null; }
    @android.window.SplashScreen.SplashScreenStyle
    public int getSplashScreenStyle() { return 0; }
    public android.app.ActivityOptions setSplashScreenStyle(int p0) { return null; }
    public boolean isEligibleForLegacyPermissionPrompt() { return false; }
    public void setEligibleForLegacyPermissionPrompt(boolean p0) {}
    public android.app.ActivityOptions setLockTaskEnabled(boolean p0) { return null; }
    public android.app.ActivityOptions setShareIdentityEnabled(boolean p0) { return null; }
    public int getLaunchDisplayId() { return 0; }
    public android.app.ActivityOptions setLaunchDisplayId(int p0) { return null; }
    public int getCallerDisplayId() { return 0; }
    public android.app.ActivityOptions setCallerDisplayId(int p0) { return null; }
    public android.window.WindowContainerToken getLaunchTaskDisplayArea() { return null; }
    public android.app.ActivityOptions setLaunchTaskDisplayArea(android.window.WindowContainerToken p0) { return null; }
    public int getLaunchTaskDisplayAreaFeatureId() { return 0; }
    public void setLaunchTaskDisplayAreaFeatureId(int p0) {}
    public android.window.WindowContainerToken getLaunchRootTask() { return null; }
    public android.app.ActivityOptions setLaunchRootTask(android.window.WindowContainerToken p0) { return null; }
    public android.os.IBinder getLaunchTaskFragmentToken() { return null; }
    public android.app.ActivityOptions setLaunchTaskFragmentToken(android.os.IBinder p0) { return null; }
    public int getLaunchWindowingMode() { return 0; }
    public void setLaunchWindowingMode(int p0) {}
    public android.app.PictureInPictureParams getLaunchIntoPipParams() { return null; }
    public boolean isLaunchIntoPip() { return false; }
    public int getLaunchActivityType() { return 0; }
    public void setLaunchActivityType(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.START_TASKS_FROM_RECENTS")
    public void setLaunchTaskId(int p0) {}
    @android.annotation.SystemApi
    public int getLaunchTaskId() { return 0; }
    @android.annotation.RequiresPermission("android.permission.START_TASKS_FROM_RECENTS")
    public void setDisableStartingWindow(boolean p0) {}
    public boolean getDisableStartingWindow() { return false; }
    public void setPendingIntentLaunchFlags(int p0) {}
    public int getPendingIntentLaunchFlags() { return 0; }
    public void setTaskAlwaysOnTop(boolean p0) {}
    public boolean getTaskAlwaysOnTop() { return false; }
    public void setTaskOverlay(boolean p0, boolean p1) {}
    public boolean getTaskOverlay() { return false; }
    public boolean canTaskOverlayResume() { return false; }
    public void setAvoidMoveToFront() {}
    public boolean getAvoidMoveToFront() { return false; }
    public void setFreezeRecentTasksReordering() {}
    public boolean freezeRecentTasksReordering() { return false; }
    public void setSplitScreenCreateMode(int p0) {}
    public void setDisallowEnterPictureInPictureWhileLaunching(boolean p0) {}
    public boolean disallowEnterPictureInPictureWhileLaunching() { return false; }
    public void setApplyActivityFlagsForBubbles(boolean p0) {}
    public boolean isApplyActivityFlagsForBubbles() { return false; }
    public void setApplyMultipleTaskFlagForShortcut(boolean p0) {}
    public boolean isApplyMultipleTaskFlagForShortcut() { return false; }
    public void setApplyNoUserActionFlagForShortcut(boolean p0) {}
    public boolean isApplyNoUserActionFlagForShortcut() { return false; }
    public void setLaunchCookie(android.os.IBinder p0) {}
    public android.os.IBinder getLaunchCookie() { return null; }
    public boolean getOverrideTaskTransition() { return false; }
    public void setRemoveWithTaskOrganizer(boolean p0) {}
    public boolean getRemoveWithTaskOranizer() { return false; }
    public void setLaunchedFromBubble(boolean p0) {}
    public boolean getLaunchedFromBubble() { return false; }
    public android.app.ActivityOptions setTransientLaunch() { return null; }
    public boolean getTransientLaunch() { return false; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_KEYGUARD")
    public void setDismissKeyguard() {}
    public boolean getDismissKeyguard() { return false; }
    @java.lang.Deprecated
    public android.app.ActivityOptions setIgnorePendingIntentCreatorForegroundState(boolean p0) { return null; }
    public android.app.ActivityOptions setPendingIntentCreatorBackgroundActivityStartMode(int p0) { return null; }
    public int getPendingIntentCreatorBackgroundActivityStartMode() { return 0; }
    public void update(android.app.ActivityOptions p0) {}
    public android.os.Bundle toBundle() { return null; }
    public void requestUsageTimeReport(android.app.PendingIntent p0) {}
    public android.app.ActivityOptions.SourceInfo getSourceInfo() { return null; }
    public void setSourceInfo(int p0, long p1) {}
    public android.app.ActivityOptions forTargetActivity() { return null; }
    public int getRotationAnimationHint() { return 0; }
    public void setRotationAnimationHint(int p0) {}
    public android.os.Bundle popAppVerificationBundle() { return null; }
    public android.app.ActivityOptions setAppVerificationBundle(android.os.Bundle p0) { return null; }
    public android.app.ActivityOptions setPendingIntentBackgroundActivityStartMode(int p0) { return null; }
    public int getPendingIntentBackgroundActivityStartMode() { return 0; }
    @java.lang.Deprecated
    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean p0) {}
    @java.lang.Deprecated
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() { return false; }
    public java.lang.String toString() { return null; }

    public static interface OnAnimationFinishedListener {
        public void onAnimationFinished(long p0);
    }

    public static interface OnAnimationStartedListener {
        public void onAnimationStarted(long p0);
    }

    public static class SourceInfo implements android.os.Parcelable {
        public static final int TYPE_LAUNCHER = 1;
        public static final int TYPE_NOTIFICATION = 2;
        public static final int TYPE_LOCKSCREEN = 3;
        public static final int TYPE_RECENTS_ANIMATION = 4;
        public final int type = 0;
        public final long eventTimeMs = 0L;
        public static final android.os.Parcelable.Creator<android.app.ActivityOptions.SourceInfo> CREATOR = null;
        SourceInfo(int p0, long p1) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SourceType {
        }
    }
}
