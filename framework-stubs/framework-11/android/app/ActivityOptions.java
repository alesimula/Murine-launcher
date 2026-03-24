package android.app;

public class ActivityOptions {
    private static final java.lang.String TAG = "ActivityOptions";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";
    public static final java.lang.String KEY_PACKAGE_NAME = "android:activity.packageName";
    public static final java.lang.String KEY_LAUNCH_BOUNDS = "android:activity.launchBounds";
    public static final java.lang.String KEY_ANIM_TYPE = "android:activity.animType";
    public static final java.lang.String KEY_ANIM_ENTER_RES_ID = "android:activity.animEnterRes";
    public static final java.lang.String KEY_ANIM_EXIT_RES_ID = "android:activity.animExitRes";
    public static final java.lang.String KEY_ANIM_IN_PLACE_RES_ID = "android:activity.animInPlaceRes";
    public static final java.lang.String KEY_ANIM_THUMBNAIL = "android:activity.animThumbnail";
    public static final java.lang.String KEY_ANIM_START_X = "android:activity.animStartX";
    public static final java.lang.String KEY_ANIM_START_Y = "android:activity.animStartY";
    public static final java.lang.String KEY_ANIM_WIDTH = "android:activity.animWidth";
    public static final java.lang.String KEY_ANIM_HEIGHT = "android:activity.animHeight";
    public static final java.lang.String KEY_ANIM_START_LISTENER = "android:activity.animStartListener";
    private static final java.lang.String KEY_ANIMATION_FINISHED_LISTENER = "android:activity.animationFinishedListener";
    private static final java.lang.String KEY_ANIM_SPECS = "android:activity.animSpecs";
    private static final java.lang.String KEY_LOCK_TASK_MODE = "android:activity.lockTaskMode";
    private static final java.lang.String KEY_LAUNCH_DISPLAY_ID = "android.activity.launchDisplayId";
    private static final java.lang.String KEY_CALLER_DISPLAY_ID = "android.activity.callerDisplayId";
    private static final java.lang.String KEY_LAUNCH_TASK_DISPLAY_AREA_TOKEN = "android.activity.launchTaskDisplayAreaToken";
    private static final java.lang.String KEY_LAUNCH_WINDOWING_MODE = "android.activity.windowingMode";
    private static final java.lang.String KEY_LAUNCH_ACTIVITY_TYPE = "android.activity.activityType";
    private static final java.lang.String KEY_LAUNCH_TASK_ID = "android.activity.launchTaskId";
    private static final java.lang.String KEY_PENDING_INTENT_LAUNCH_FLAGS = "android.activity.pendingIntentLaunchFlags";
    private static final java.lang.String KEY_TASK_ALWAYS_ON_TOP = "android.activity.alwaysOnTop";
    private static final java.lang.String KEY_TASK_OVERLAY = "android.activity.taskOverlay";
    private static final java.lang.String KEY_TASK_OVERLAY_CAN_RESUME = "android.activity.taskOverlayCanResume";
    private static final java.lang.String KEY_AVOID_MOVE_TO_FRONT = "android.activity.avoidMoveToFront";
    private static final java.lang.String KEY_FREEZE_RECENT_TASKS_REORDERING = "android.activity.freezeRecentTasksReordering";
    private static final java.lang.String KEY_SPLIT_SCREEN_CREATE_MODE = "android:activity.splitScreenCreateMode";
    private static final java.lang.String KEY_DISALLOW_ENTER_PICTURE_IN_PICTURE_WHILE_LAUNCHING = "android:activity.disallowEnterPictureInPictureWhileLaunching";
    private static final java.lang.String KEY_APPLY_ACTIVITY_FLAGS_FOR_BUBBLES = "android:activity.applyActivityFlagsForBubbles";
    private static final java.lang.String KEY_TRANSITION_COMPLETE_LISTENER = "android:activity.transitionCompleteListener";
    private static final java.lang.String KEY_TRANSITION_IS_RETURNING = "android:activity.transitionIsReturning";
    private static final java.lang.String KEY_TRANSITION_SHARED_ELEMENTS = "android:activity.sharedElementNames";
    private static final java.lang.String KEY_RESULT_DATA = "android:activity.resultData";
    private static final java.lang.String KEY_RESULT_CODE = "android:activity.resultCode";
    private static final java.lang.String KEY_EXIT_COORDINATOR_INDEX = "android:activity.exitCoordinatorIndex";
    private static final java.lang.String KEY_USAGE_TIME_REPORT = "android:activity.usageTimeReport";
    private static final java.lang.String KEY_ROTATION_ANIMATION_HINT = "android:activity.rotationAnimationHint";
    private static final java.lang.String KEY_INSTANT_APP_VERIFICATION_BUNDLE = "android:instantapps.installerbundle";
    private static final java.lang.String KEY_SPECS_FUTURE = "android:activity.specsFuture";
    private static final java.lang.String KEY_REMOTE_ANIMATION_ADAPTER = "android:activity.remoteAnimationAdapter";
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
    private java.lang.String mPackageName;
    private android.graphics.Rect mLaunchBounds;
    private int mAnimationType;
    private int mCustomEnterResId;
    private int mCustomExitResId;
    private int mCustomInPlaceResId;
    private android.graphics.Bitmap mThumbnail;
    private int mStartX;
    private int mStartY;
    private int mWidth;
    private int mHeight;
    private android.os.IRemoteCallback mAnimationStartedListener;
    private android.os.IRemoteCallback mAnimationFinishedListener;
    private android.os.ResultReceiver mTransitionReceiver;
    private boolean mIsReturning;
    private java.util.ArrayList<java.lang.String> mSharedElementNames;
    private android.content.Intent mResultData;
    private int mResultCode;
    private int mExitCoordinatorIndex;
    private android.app.PendingIntent mUsageTimeReport;
    private int mLaunchDisplayId;
    private int mCallerDisplayId;
    private android.window.WindowContainerToken mLaunchTaskDisplayArea;
    @android.app.WindowConfiguration.WindowingMode
    private int mLaunchWindowingMode;
    @android.app.WindowConfiguration.ActivityType
    private int mLaunchActivityType;
    private int mLaunchTaskId;
    private int mPendingIntentLaunchFlags;
    private int mSplitScreenCreateMode;
    private boolean mLockTaskMode;
    private boolean mDisallowEnterPictureInPictureWhileLaunching;
    private boolean mApplyActivityFlagsForBubbles;
    private boolean mTaskAlwaysOnTop;
    private boolean mTaskOverlay;
    private boolean mTaskOverlayCanResume;
    private boolean mAvoidMoveToFront;
    private boolean mFreezeRecentTasksReordering;
    private android.view.AppTransitionAnimationSpec[] mAnimSpecs;
    private int mRotationAnimationHint;
    private android.os.Bundle mAppVerificationBundle;
    private android.view.IAppTransitionAnimationSpecsFuture mSpecsFuture;
    private android.view.RemoteAnimationAdapter mRemoteAnimationAdapter;
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2) { return null; }
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2, android.os.Handler p3, android.app.ActivityOptions.OnAnimationStartedListener p4) { return null; }
    public static android.app.ActivityOptions makeCustomAnimation(android.content.Context p0, int p1, int p2, android.os.Handler p3, android.app.ActivityOptions.OnAnimationStartedListener p4, android.app.ActivityOptions.OnAnimationFinishedListener p5) { return null; }
    public static android.app.ActivityOptions makeCustomInPlaceAnimation(android.content.Context p0, int p1) { return null; }
    private void setOnAnimationStartedListener(android.os.Handler p0, android.app.ActivityOptions.OnAnimationStartedListener p1) {}
    private void setOnAnimationFinishedListener(android.os.Handler p0, android.app.ActivityOptions.OnAnimationFinishedListener p1) {}
    public static android.app.ActivityOptions makeScaleUpAnimation(android.view.View p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.app.ActivityOptions makeClipRevealAnimation(android.view.View p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.app.ActivityOptions makeOpenCrossProfileAppsAnimation() { return null; }
    public static android.app.ActivityOptions makeThumbnailScaleUpAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3) { return null; }
    private static android.app.ActivityOptions makeThumbnailScaleUpAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3, android.app.ActivityOptions.OnAnimationStartedListener p4) { return null; }
    private static android.app.ActivityOptions makeThumbnailAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3, android.app.ActivityOptions.OnAnimationStartedListener p4, boolean p5) { return null; }
    public static android.app.ActivityOptions makeMultiThumbFutureAspectScaleAnimation(android.content.Context p0, android.os.Handler p1, android.view.IAppTransitionAnimationSpecsFuture p2, android.app.ActivityOptions.OnAnimationStartedListener p3, boolean p4) { return null; }
    public static android.app.ActivityOptions makeThumbnailAspectScaleDownAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3, int p4, int p5, android.os.Handler p6, android.app.ActivityOptions.OnAnimationStartedListener p7) { return null; }
    private static android.app.ActivityOptions makeAspectScaledThumbnailAnimation(android.view.View p0, android.graphics.Bitmap p1, int p2, int p3, int p4, int p5, android.os.Handler p6, android.app.ActivityOptions.OnAnimationStartedListener p7, boolean p8) { return null; }
    public static android.app.ActivityOptions makeThumbnailAspectScaleDownAnimation(android.view.View p0, android.view.AppTransitionAnimationSpec[] p1, android.os.Handler p2, android.app.ActivityOptions.OnAnimationStartedListener p3, android.app.ActivityOptions.OnAnimationFinishedListener p4) { return null; }
    public static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity p0, android.view.View p1, java.lang.String p2) { return null; }
    @java.lang.SafeVarargs
    public static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity p0, android.util.Pair<android.view.View, java.lang.String>... p1) { return null; }
    @java.lang.SafeVarargs
    public static android.app.ActivityOptions startSharedElementAnimation(android.view.Window p0, android.util.Pair<android.view.View, java.lang.String>... p1) { return null; }
    public static void stopSharedElementAnimation(android.view.Window p0) {}
    static android.app.ExitTransitionCoordinator makeSceneTransitionAnimation(android.app.Activity p0, android.view.Window p1, android.app.ActivityOptions p2, android.app.SharedElementCallback p3, android.util.Pair<android.view.View, java.lang.String>[] p4) { return null; }
    public static void setExitTransitionTimeout(long p0) {}
    static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity p0, android.app.ExitTransitionCoordinator p1, java.util.ArrayList<java.lang.String> p2, int p3, android.content.Intent p4) { return null; }
    public static android.app.ActivityOptions makeTaskLaunchBehind() { return null; }
    public static android.app.ActivityOptions makeBasic() { return null; }
    public static android.app.ActivityOptions makeRemoteAnimation(android.view.RemoteAnimationAdapter p0) { return null; }
    public boolean getLaunchTaskBehind() { return false; }
    private ActivityOptions() {}
    public ActivityOptions(android.os.Bundle p0) {}
    public android.app.ActivityOptions setLaunchBounds(android.graphics.Rect p0) { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.graphics.Rect getLaunchBounds() { return null; }
    public int getAnimationType() { return 0; }
    public int getCustomEnterResId() { return 0; }
    public int getCustomExitResId() { return 0; }
    public int getCustomInPlaceResId() { return 0; }
    public android.graphics.GraphicBuffer getThumbnail() { return null; }
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
    public static android.app.ActivityOptions fromBundle(android.os.Bundle p0) { return null; }
    public static void abort(android.app.ActivityOptions p0) {}
    public boolean getLockTaskMode() { return false; }
    public android.app.ActivityOptions setLockTaskEnabled(boolean p0) { return null; }
    public int getLaunchDisplayId() { return 0; }
    public android.app.ActivityOptions setLaunchDisplayId(int p0) { return null; }
    public int getCallerDisplayId() { return 0; }
    public android.app.ActivityOptions setCallerDisplayId(int p0) { return null; }
    public android.window.WindowContainerToken getLaunchTaskDisplayArea() { return null; }
    public android.app.ActivityOptions setLaunchTaskDisplayArea(android.window.WindowContainerToken p0) { return null; }
    public int getLaunchWindowingMode() { return 0; }
    public void setLaunchWindowingMode(int p0) {}
    public int getLaunchActivityType() { return 0; }
    public void setLaunchActivityType(int p0) {}
    public void setLaunchTaskId(int p0) {}
    public int getLaunchTaskId() { return 0; }
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
    public int getSplitScreenCreateMode() { return 0; }
    public void setSplitScreenCreateMode(int p0) {}
    public void setDisallowEnterPictureInPictureWhileLaunching(boolean p0) {}
    public boolean disallowEnterPictureInPictureWhileLaunching() { return false; }
    public void setApplyActivityFlagsForBubbles(boolean p0) {}
    public boolean isApplyActivityFlagsForBubbles() { return false; }
    public void update(android.app.ActivityOptions p0) {}
    public android.os.Bundle toBundle() { return null; }
    public void requestUsageTimeReport(android.app.PendingIntent p0) {}
    public android.app.ActivityOptions forTargetActivity() { return null; }
    public int getRotationAnimationHint() { return 0; }
    public void setRotationAnimationHint(int p0) {}
    public android.os.Bundle popAppVerificationBundle() { return null; }
    public android.app.ActivityOptions setAppVerificationBundle(android.os.Bundle p0) { return null; }
    public java.lang.String toString() { return null; }

    private static class HideWindowListener extends android.transition.TransitionListenerAdapter implements android.app.ExitTransitionCoordinator.HideSharedElementsCallback {
        private final android.view.Window mWindow = null;
        private final android.app.ExitTransitionCoordinator mExit = null;
        private final boolean mWaitingForTransition = false;
        private boolean mTransitionEnded;
        private boolean mSharedElementHidden;
        private java.util.ArrayList<android.view.View> mSharedElements;
        public HideWindowListener(android.view.Window p0, android.app.ExitTransitionCoordinator p1) { super(); }
        public void onTransitionEnd(android.transition.Transition p0) {}
        public void hideSharedElements() {}
        private void hideWhenDone() {}
    }

    public static interface OnAnimationFinishedListener {
        public void onAnimationFinished();
    }

    public static interface OnAnimationStartedListener {
        public void onAnimationStarted();
    }
}
