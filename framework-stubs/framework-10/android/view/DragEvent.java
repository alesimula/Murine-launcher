package android.view;

public class DragEvent implements android.os.Parcelable {
    private static final boolean TRACK_RECYCLED_LOCATION = false;
    int mAction;
    float mX;
    float mY;
    @android.annotation.UnsupportedAppUsage
    android.content.ClipDescription mClipDescription;
    @android.annotation.UnsupportedAppUsage
    android.content.ClipData mClipData;
    com.android.internal.view.IDragAndDropPermissions mDragAndDropPermissions;
    java.lang.Object mLocalState;
    boolean mDragResult;
    boolean mEventHandlerWasCalled;
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
    private void init(int p0, float p1, float p2, android.content.ClipDescription p3, android.content.ClipData p4, com.android.internal.view.IDragAndDropPermissions p5, java.lang.Object p6, boolean p7) {}
    static android.view.DragEvent obtain() { return null; }
    public static android.view.DragEvent obtain(int p0, float p1, float p2, java.lang.Object p3, android.content.ClipDescription p4, android.content.ClipData p5, com.android.internal.view.IDragAndDropPermissions p6, boolean p7) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.view.DragEvent obtain(android.view.DragEvent p0) { return null; }
    public int getAction() { return 0; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public android.content.ClipData getClipData() { return null; }
    public android.content.ClipDescription getClipDescription() { return null; }
    public com.android.internal.view.IDragAndDropPermissions getDragAndDropPermissions() { return null; }
    public java.lang.Object getLocalState() { return null; }
    public boolean getResult() { return false; }
    public final void recycle() {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
