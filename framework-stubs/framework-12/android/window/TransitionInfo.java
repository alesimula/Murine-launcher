package android.window;

public final class TransitionInfo implements android.os.Parcelable {
    public static final int FLAG_NONE = 0;
    public static final int FLAG_SHOW_WALLPAPER = 1;
    public static final int FLAG_IS_WALLPAPER = 2;
    public static final int FLAG_TRANSLUCENT = 4;
    public static final int FLAG_STARTING_WINDOW_TRANSFER_RECIPIENT = 8;
    public static final int FLAG_IS_VOICE_INTERACTION = 16;
    public static final int FLAG_FIRST_CUSTOM = 32;
    private final int mType = 0;
    private final int mFlags = 0;
    private final java.util.ArrayList<android.window.TransitionInfo.Change> mChanges = null;
    private android.view.SurfaceControl mRootLeash;
    private final android.graphics.Point mRootOffset = null;
    public static final android.os.Parcelable.Creator<android.window.TransitionInfo> CREATOR = null;
    public TransitionInfo(int p0, int p1) {}
    private TransitionInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void setRootLeash(android.view.SurfaceControl p0, int p1, int p2) {}
    public int getType() { return 0; }
    public int getFlags() { return 0; }
    public android.view.SurfaceControl getRootLeash() { return null; }
    public android.graphics.Point getRootOffset() { return null; }
    public java.util.List<android.window.TransitionInfo.Change> getChanges() { return null; }
    public android.window.TransitionInfo.Change getChange(android.window.WindowContainerToken p0) { return null; }
    public void addChange(android.window.TransitionInfo.Change p0) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String modeToString(int p0) { return null; }
    public static java.lang.String flagsToString(int p0) { return null; }
    public static boolean isIndependent(android.window.TransitionInfo.Change p0, android.window.TransitionInfo p1) { return false; }

    public static final class Change implements android.os.Parcelable {
        private final android.window.WindowContainerToken mContainer = null;
        private android.window.WindowContainerToken mParent;
        private final android.view.SurfaceControl mLeash = null;
        @android.window.TransitionInfo.TransitionMode
        private int mMode;
        @android.window.TransitionInfo.ChangeFlags
        private int mFlags;
        private final android.graphics.Rect mStartAbsBounds = null;
        private final android.graphics.Rect mEndAbsBounds = null;
        private final android.graphics.Point mEndRelOffset = null;
        private android.app.ActivityManager.RunningTaskInfo mTaskInfo;
        private int mStartRotation;
        private int mEndRotation;
        public static final android.os.Parcelable.Creator<android.window.TransitionInfo.Change> CREATOR = null;
        public Change(android.window.WindowContainerToken p0, android.view.SurfaceControl p1) {}
        private Change(android.os.Parcel p0) {}
        public void setParent(android.window.WindowContainerToken p0) {}
        public void setMode(int p0) {}
        public void setFlags(int p0) {}
        public void setStartAbsBounds(android.graphics.Rect p0) {}
        public void setEndAbsBounds(android.graphics.Rect p0) {}
        public void setEndRelOffset(int p0, int p1) {}
        public void setTaskInfo(android.app.ActivityManager.RunningTaskInfo p0) {}
        public void setRotation(int p0, int p1) {}
        public android.window.WindowContainerToken getContainer() { return null; }
        public android.window.WindowContainerToken getParent() { return null; }
        @android.window.TransitionInfo.TransitionMode
        public int getMode() { return 0; }
        @android.window.TransitionInfo.ChangeFlags
        public int getFlags() { return 0; }
        public android.graphics.Rect getStartAbsBounds() { return null; }
        public android.graphics.Rect getEndAbsBounds() { return null; }
        public android.graphics.Point getEndRelOffset() { return null; }
        public android.view.SurfaceControl getLeash() { return null; }
        public android.app.ActivityManager.RunningTaskInfo getTaskInfo() { return null; }
        public int getStartRotation() { return 0; }
        public int getEndRotation() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static @interface ChangeFlags {
    }

    public static @interface TransitionMode {
    }
}
