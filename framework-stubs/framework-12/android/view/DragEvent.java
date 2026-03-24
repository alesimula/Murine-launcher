package android.view;

public class DragEvent implements android.os.Parcelable {
    private static final boolean TRACK_RECYCLED_LOCATION = false;
    int mAction;
    float mX;
    float mY;
    android.content.ClipDescription mClipDescription;
    android.content.ClipData mClipData;
    com.android.internal.view.IDragAndDropPermissions mDragAndDropPermissions;
    java.lang.Object mLocalState;
    boolean mDragResult;
    boolean mEventHandlerWasCalled;
    private android.view.SurfaceControl mDragSurface;
    private float mOffsetX;
    private float mOffsetY;
    private android.view.DragEvent mNext;
    private java.lang.RuntimeException mRecycledLocation;
    private boolean mRecycled;
    private static final int MAX_RECYCLED = 10;
    private static final java.lang.Object gRecyclerLock = null;
    private static int gRecyclerUsed;
    private static android.view.DragEvent gRecyclerTop;
    public static final int ACTION_DRAG_STARTED = 1;
    public static final int ACTION_DRAG_LOCATION = 2;
    public static final int ACTION_DROP = 3;
    public static final int ACTION_DRAG_ENDED = 4;
    public static final int ACTION_DRAG_ENTERED = 5;
    public static final int ACTION_DRAG_EXITED = 6;
    public static final android.os.Parcelable.Creator<android.view.DragEvent> CREATOR = null;
    private DragEvent() {}
    private void init(int p0, float p1, float p2, float p3, float p4, android.content.ClipDescription p5, android.content.ClipData p6, android.view.SurfaceControl p7, com.android.internal.view.IDragAndDropPermissions p8, java.lang.Object p9, boolean p10) {}
    static android.view.DragEvent obtain() { return null; }
    public static android.view.DragEvent obtain(int p0, float p1, float p2, float p3, float p4, java.lang.Object p5, android.content.ClipDescription p6, android.content.ClipData p7, android.view.SurfaceControl p8, com.android.internal.view.IDragAndDropPermissions p9, boolean p10) { return null; }
    public static android.view.DragEvent obtain(android.view.DragEvent p0) { return null; }
    public int getAction() { return 0; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public float getOffsetX() { return 0.0f; }
    public float getOffsetY() { return 0.0f; }
    public android.content.ClipData getClipData() { return null; }
    public android.content.ClipDescription getClipDescription() { return null; }
    public android.view.SurfaceControl getDragSurface() { return null; }
    public com.android.internal.view.IDragAndDropPermissions getDragAndDropPermissions() { return null; }
    public java.lang.Object getLocalState() { return null; }
    public boolean getResult() { return false; }
    public final void recycle() {}
    public static java.lang.String actionToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
