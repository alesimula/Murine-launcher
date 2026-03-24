package android.gesture;

public class Gesture implements android.os.Parcelable {
    private static final long GESTURE_ID_BASE = Long.valueOf(0L);
    private static final int BITMAP_RENDERING_WIDTH = 2;
    private static final boolean BITMAP_RENDERING_ANTIALIAS = true;
    private static final boolean BITMAP_RENDERING_DITHER = true;
    private static final java.util.concurrent.atomic.AtomicInteger sGestureCount = null;
    private final android.graphics.RectF mBoundingBox = null;
    private long mGestureID;
    private final java.util.ArrayList<android.gesture.GestureStroke> mStrokes = null;
    public static final android.os.Parcelable.Creator<android.gesture.Gesture> CREATOR = null;
    public Gesture() {}
    public java.lang.Object clone() { return null; }
    public java.util.ArrayList<android.gesture.GestureStroke> getStrokes() { return null; }
    public int getStrokesCount() { return 0; }
    public void addStroke(android.gesture.GestureStroke p0) {}
    public float getLength() { return 0.0f; }
    public android.graphics.RectF getBoundingBox() { return null; }
    public android.graphics.Path toPath() { return null; }
    public android.graphics.Path toPath(android.graphics.Path p0) { return null; }
    public android.graphics.Path toPath(int p0, int p1, int p2, int p3) { return null; }
    public android.graphics.Path toPath(android.graphics.Path p0, int p1, int p2, int p3, int p4) { return null; }
    void setID(long p0) {}
    public long getID() { return 0L; }
    public android.graphics.Bitmap toBitmap(int p0, int p1, int p2, int p3, int p4) { return null; }
    public android.graphics.Bitmap toBitmap(int p0, int p1, int p2, int p3) { return null; }
    void serialize(java.io.DataOutputStream p0) throws java.io.IOException {}
    static android.gesture.Gesture deserialize(java.io.DataInputStream p0) throws java.io.IOException { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
