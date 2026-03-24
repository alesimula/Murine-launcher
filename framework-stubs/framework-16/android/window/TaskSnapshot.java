package android.window;

public class TaskSnapshot implements android.os.Parcelable {
    public static final int REFERENCE_NONE = 0;
    public static final int REFERENCE_BROADCAST = 1;
    public static final int REFERENCE_CACHE = 2;
    public static final int REFERENCE_PERSIST = 4;
    public static final int REFERENCE_CONTENT_SUGGESTION = 8;
    public static final int REFERENCE_WRITE_TO_PARCEL = 16;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.TaskSnapshot> CREATOR = null;
    public TaskSnapshot(long p0, long p1, android.content.ComponentName p2, android.hardware.HardwareBuffer p3, android.graphics.ColorSpace p4, int p5, int p6, android.graphics.Point p7, android.graphics.Rect p8, android.graphics.Rect p9, boolean p10, boolean p11, int p12, int p13, boolean p14, boolean p15, int p16) {}
    public long getId() { return 0L; }
    public long getCaptureTime() { return 0L; }
    public android.content.ComponentName getTopActivityComponent() { return null; }
    public android.graphics.GraphicBuffer getSnapshot() { return null; }
    public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public int getOrientation() { return 0; }
    public int getRotation() { return 0; }
    public android.graphics.Point getTaskSize() { return null; }
    public android.graphics.Rect getContentInsets() { return null; }
    public android.graphics.Rect getLetterboxInsets() { return null; }
    public boolean isLowResolution() { return false; }
    public boolean isRealSnapshot() { return false; }
    public boolean isTranslucent() { return false; }
    public boolean hasImeSurface() { return false; }
    public int getWindowingMode() { return 0; }
    public int getAppearance() { return 0; }
    public int getUiMode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public synchronized void addReference(int p0) {}
    public synchronized void removeReference(int p0) {}
    public synchronized void setSafeRelease(java.util.function.Consumer<android.hardware.HardwareBuffer> p0) {}

    public static final class Builder {
        public Builder() {}
        public android.window.TaskSnapshot.Builder setId(long p0) { return null; }
        public android.window.TaskSnapshot.Builder setCaptureTime(long p0) { return null; }
        public android.window.TaskSnapshot.Builder setTopActivityComponent(android.content.ComponentName p0) { return null; }
        public android.window.TaskSnapshot.Builder setSnapshot(android.hardware.HardwareBuffer p0) { return null; }
        public android.window.TaskSnapshot.Builder setColorSpace(android.graphics.ColorSpace p0) { return null; }
        public android.window.TaskSnapshot.Builder setOrientation(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setRotation(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setTaskSize(android.graphics.Point p0) { return null; }
        public android.window.TaskSnapshot.Builder setContentInsets(android.graphics.Rect p0) { return null; }
        public android.window.TaskSnapshot.Builder setLetterboxInsets(android.graphics.Rect p0) { return null; }
        public android.window.TaskSnapshot.Builder setIsRealSnapshot(boolean p0) { return null; }
        public android.window.TaskSnapshot.Builder setWindowingMode(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setAppearance(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setIsTranslucent(boolean p0) { return null; }
        public android.window.TaskSnapshot.Builder setHasImeSurface(boolean p0) { return null; }
        public android.window.TaskSnapshot.Builder setUiMode(int p0) { return null; }
        public int getPixelFormat() { return 0; }
        public android.window.TaskSnapshot.Builder setPixelFormat(int p0) { return null; }
        public android.window.TaskSnapshot build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReferenceFlags {
    }
}
