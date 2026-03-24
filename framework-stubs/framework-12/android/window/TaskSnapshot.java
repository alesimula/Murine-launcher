package android.window;

public class TaskSnapshot implements android.os.Parcelable {
    private final long mId = 0L;
    private final android.content.ComponentName mTopActivityComponent = null;
    private final android.hardware.HardwareBuffer mSnapshot = null;
    @android.content.res.Configuration.Orientation
    private final int mOrientation = 0;
    private final int mRotation = 0;
    private final android.graphics.Point mTaskSize = null;
    private final android.graphics.Rect mContentInsets = null;
    private final boolean mIsLowResolution = false;
    private final boolean mIsRealSnapshot = false;
    private final int mWindowingMode = 0;
    private final int mAppearance = 0;
    private final boolean mIsTranslucent = false;
    private final boolean mHasImeSurface = false;
    private final android.graphics.ColorSpace mColorSpace = null;
    public static final android.os.Parcelable.Creator<android.window.TaskSnapshot> CREATOR = null;
    public TaskSnapshot(long p0, android.content.ComponentName p1, android.hardware.HardwareBuffer p2, android.graphics.ColorSpace p3, int p4, int p5, android.graphics.Point p6, android.graphics.Rect p7, boolean p8, boolean p9, int p10, int p11, boolean p12, boolean p13) {}
    private TaskSnapshot(android.os.Parcel p0) {}
    public long getId() { return 0L; }
    public android.content.ComponentName getTopActivityComponent() { return null; }
    public android.graphics.GraphicBuffer getSnapshot() { return null; }
    public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public int getOrientation() { return 0; }
    public int getRotation() { return 0; }
    public android.graphics.Point getTaskSize() { return null; }
    public android.graphics.Rect getContentInsets() { return null; }
    public boolean isLowResolution() { return false; }
    public boolean isRealSnapshot() { return false; }
    public boolean isTranslucent() { return false; }
    public boolean hasImeSurface() { return false; }
    public int getWindowingMode() { return 0; }
    public int getAppearance() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private long mId;
        private android.content.ComponentName mTopActivity;
        private android.hardware.HardwareBuffer mSnapshot;
        private android.graphics.ColorSpace mColorSpace;
        private int mOrientation;
        private int mRotation;
        private android.graphics.Point mTaskSize;
        private android.graphics.Rect mContentInsets;
        private boolean mIsRealSnapshot;
        private int mWindowingMode;
        private int mAppearance;
        private boolean mIsTranslucent;
        private boolean mHasImeSurface;
        private int mPixelFormat;
        public Builder() {}
        public android.window.TaskSnapshot.Builder setId(long p0) { return null; }
        public android.window.TaskSnapshot.Builder setTopActivityComponent(android.content.ComponentName p0) { return null; }
        public android.window.TaskSnapshot.Builder setSnapshot(android.hardware.HardwareBuffer p0) { return null; }
        public android.window.TaskSnapshot.Builder setColorSpace(android.graphics.ColorSpace p0) { return null; }
        public android.window.TaskSnapshot.Builder setOrientation(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setRotation(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setTaskSize(android.graphics.Point p0) { return null; }
        public android.window.TaskSnapshot.Builder setContentInsets(android.graphics.Rect p0) { return null; }
        public android.window.TaskSnapshot.Builder setIsRealSnapshot(boolean p0) { return null; }
        public android.window.TaskSnapshot.Builder setWindowingMode(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setAppearance(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setIsTranslucent(boolean p0) { return null; }
        public android.window.TaskSnapshot.Builder setHasImeSurface(boolean p0) { return null; }
        public int getPixelFormat() { return 0; }
        public android.window.TaskSnapshot.Builder setPixelFormat(int p0) { return null; }
        public android.window.TaskSnapshot build() { return null; }
    }
}
