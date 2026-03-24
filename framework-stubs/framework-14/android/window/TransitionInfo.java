package android.window;

public final class TransitionInfo implements android.os.Parcelable {
    public static final int FLAG_NONE = 0;
    public static final int FLAG_SHOW_WALLPAPER = 1;
    public static final int FLAG_IS_WALLPAPER = 2;
    public static final int FLAG_TRANSLUCENT = 4;
    public static final int FLAG_STARTING_WINDOW_TRANSFER_RECIPIENT = 8;
    public static final int FLAG_IS_VOICE_INTERACTION = 16;
    public static final int FLAG_IS_DISPLAY = 32;
    public static final int FLAG_DISPLAY_HAS_ALERT_WINDOWS = 128;
    public static final int FLAG_IS_INPUT_METHOD = 256;
    public static final int FLAG_IN_TASK_WITH_EMBEDDED_ACTIVITY = 512;
    public static final int FLAG_FILLS_TASK = 1024;
    public static final int FLAG_WILL_IME_SHOWN = 2048;
    public static final int FLAG_CROSS_PROFILE_OWNER_THUMBNAIL = 4096;
    public static final int FLAG_CROSS_PROFILE_WORK_THUMBNAIL = 8192;
    public static final int FLAG_IS_BEHIND_STARTING_WINDOW = 16384;
    public static final int FLAG_IS_OCCLUDED = 32768;
    public static final int FLAG_IS_SYSTEM_WINDOW = 65536;
    public static final int FLAG_BACK_GESTURE_ANIMATED = 131072;
    public static final int FLAG_NO_ANIMATION = 262144;
    public static final int FLAG_TASK_LAUNCHING_BEHIND = 524288;
    public static final int FLAG_MOVED_TO_TOP = 1048576;
    public static final int FLAG_SYNC = 2097152;
    public static final int FLAG_FIRST_CUSTOM = 4194304;
    public static final int FLAGS_IS_NON_APP_WINDOW = 65794;
    public static final android.os.Parcelable.Creator<android.window.TransitionInfo> CREATOR = null;
    public TransitionInfo(int p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void addRootLeash(int p0, android.view.SurfaceControl p1, int p2, int p3) {}
    public void addRoot(android.window.TransitionInfo.Root p0) {}
    public void setAnimationOptions(android.window.TransitionInfo.AnimationOptions p0) {}
    public int getType() { return 0; }
    public void setFlags(int p0) {}
    public int getFlags() { return 0; }
    public int getRootCount() { return 0; }
    public android.window.TransitionInfo.Root getRoot(int p0) { return null; }
    public int findRootIndex(int p0) { return 0; }
    @java.lang.Deprecated
    public android.view.SurfaceControl getRootLeash() { return null; }
    public android.window.TransitionInfo.AnimationOptions getAnimationOptions() { return null; }
    public java.util.List<android.window.TransitionInfo.Change> getChanges() { return null; }
    public android.window.TransitionInfo.Change getChange(android.window.WindowContainerToken p0) { return null; }
    public void addChange(android.window.TransitionInfo.Change p0) {}
    public boolean isKeyguardGoingAway() { return false; }
    public int getTrack() { return 0; }
    public void setTrack(int p0) {}
    public void setDebugId(int p0) {}
    public int getDebugId() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.lang.String modeToString(int p0) { return null; }
    public static java.lang.String flagsToString(int p0) { return null; }
    public static boolean isIndependent(android.window.TransitionInfo.Change p0, android.window.TransitionInfo p1) { return false; }
    public void releaseAnimSurfaces() {}
    public void releaseAllSurfaces() {}
    public void setUnreleasedWarningCallSiteForAllSurfaces(java.lang.String p0) {}
    public android.window.TransitionInfo localRemoteCopy() { return null; }

    public static final class AnimationOptions implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionInfo.AnimationOptions> CREATOR = null;
        public AnimationOptions(android.os.Parcel p0) {}
        public static android.window.TransitionInfo.AnimationOptions makeCommonAnimOptions(java.lang.String p0) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeAnimOptionsFromLayoutParameters(android.view.WindowManager.LayoutParams p0) { return null; }
        public void addOptionsFromLayoutParameters(android.view.WindowManager.LayoutParams p0) {}
        public void addCustomActivityTransition(boolean p0, int p1, int p2, int p3) {}
        public static android.window.TransitionInfo.AnimationOptions makeCustomAnimOptions(java.lang.String p0, int p1, int p2, int p3, boolean p4) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeClipRevealAnimOptions(int p0, int p1, int p2, int p3) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeScaleUpAnimOptions(int p0, int p1, int p2, int p3) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeThumbnailAnimOptions(android.hardware.HardwareBuffer p0, int p1, int p2, boolean p3) { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeCrossProfileAnimOptions() { return null; }
        public static android.window.TransitionInfo.AnimationOptions makeSceneTransitionAnimOptions() { return null; }
        public int getType() { return 0; }
        public int getEnterResId() { return 0; }
        public int getExitResId() { return 0; }
        public int getBackgroundColor() { return 0; }
        public boolean getOverrideTaskTransition() { return false; }
        public java.lang.String getPackageName() { return null; }
        public android.graphics.Rect getTransitionBounds() { return null; }
        public android.hardware.HardwareBuffer getThumbnail() { return null; }
        public int getAnimations() { return 0; }
        public android.window.TransitionInfo.AnimationOptions.CustomActivityTransition getCustomActivityTransition(boolean p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }

        public static class CustomActivityTransition implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<android.window.TransitionInfo.AnimationOptions.CustomActivityTransition> CREATOR = null;
            public int getCustomEnterResId() { return 0; }
            public int getCustomExitResId() { return 0; }
            public int getCustomBackgroundColor() { return 0; }
            CustomActivityTransition() {}
            CustomActivityTransition(android.os.Parcel p0) {}
            public void addCustomActivityTransition(int p0, int p1, int p2) {}
            public int describeContents() { return 0; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    public static final class Change implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionInfo.Change> CREATOR = null;
        public Change(android.window.WindowContainerToken p0, android.view.SurfaceControl p1) {}
        public void setParent(android.window.WindowContainerToken p0) {}
        public void setLastParent(android.window.WindowContainerToken p0) {}
        public void setMode(int p0) {}
        public void setFlags(int p0) {}
        public void setStartAbsBounds(android.graphics.Rect p0) {}
        public void setEndAbsBounds(android.graphics.Rect p0) {}
        public void setEndRelOffset(int p0, int p1) {}
        public void setTaskInfo(android.app.ActivityManager.RunningTaskInfo p0) {}
        public void setAllowEnterPip(boolean p0) {}
        public void setDisplayId(int p0, int p1) {}
        public void setRotation(int p0, int p1) {}
        public void setEndFixedRotation(int p0) {}
        public void setRotationAnimation(int p0) {}
        public void setBackgroundColor(int p0) {}
        public void setSnapshot(android.view.SurfaceControl p0, float p1) {}
        public android.window.WindowContainerToken getContainer() { return null; }
        public android.window.WindowContainerToken getParent() { return null; }
        public android.window.WindowContainerToken getLastParent() { return null; }
        @android.window.TransitionInfo.TransitionMode
        public int getMode() { return 0; }
        @android.window.TransitionInfo.ChangeFlags
        public int getFlags() { return 0; }
        public boolean hasFlags(int p0) { return false; }
        public boolean hasAllFlags(int p0) { return false; }
        public android.graphics.Rect getStartAbsBounds() { return null; }
        public android.graphics.Rect getEndAbsBounds() { return null; }
        public android.graphics.Point getEndRelOffset() { return null; }
        public android.view.SurfaceControl getLeash() { return null; }
        public android.app.ActivityManager.RunningTaskInfo getTaskInfo() { return null; }
        public boolean getAllowEnterPip() { return false; }
        public int getStartDisplayId() { return 0; }
        public int getEndDisplayId() { return 0; }
        public int getStartRotation() { return 0; }
        public int getEndRotation() { return 0; }
        public int getEndFixedRotation() { return 0; }
        public int getRotationAnimation() { return 0; }
        public int getBackgroundColor() { return 0; }
        public android.view.SurfaceControl getSnapshot() { return null; }
        public float getSnapshotLuma() { return 0.0f; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static @interface ChangeFlags {
    }

    public static final class Root implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionInfo.Root> CREATOR = null;
        public Root(int p0, android.view.SurfaceControl p1, int p2, int p3) {}
        public int getDisplayId() { return 0; }
        public android.view.SurfaceControl getLeash() { return null; }
        public android.graphics.Point getOffset() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static @interface TransitionMode {
    }
}
