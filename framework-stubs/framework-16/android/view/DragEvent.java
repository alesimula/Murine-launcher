package android.view;

public class DragEvent implements android.os.Parcelable {
    int mAction;
    float mX;
    float mY;
    android.content.ClipDescription mClipDescription;
    android.content.ClipData mClipData;
    com.android.internal.view.IDragAndDropPermissions mDragAndDropPermissions;
    java.lang.Object mLocalState;
    boolean mDragResult;
    boolean mEventHandlerWasCalled;
    public static final int ACTION_DRAG_STARTED = 1;
    public static final int ACTION_DRAG_LOCATION = 2;
    public static final int ACTION_DROP = 3;
    public static final int ACTION_DRAG_ENDED = 4;
    public static final int ACTION_DRAG_ENTERED = 5;
    public static final int ACTION_DRAG_EXITED = 6;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.DragEvent> CREATOR = null;
    static android.view.DragEvent obtain() { return null; }
    public static android.view.DragEvent obtain(int p0, float p1, float p2, float p3, float p4, int p5, int p6, java.lang.Object p7, android.content.ClipDescription p8, android.content.ClipData p9, android.view.SurfaceControl p10, com.android.internal.view.IDragAndDropPermissions p11, boolean p12) { return null; }
    public static android.view.DragEvent obtain(android.view.DragEvent p0) { return null; }
    public int getAction() { return 0; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public float getOffsetX() { return 0.0f; }
    public float getOffsetY() { return 0.0f; }
    public int getDisplayId() { return 0; }
    public android.content.ClipData getClipData() { return null; }
    public android.content.ClipDescription getClipDescription() { return null; }
    public android.view.SurfaceControl getDragSurface() { return null; }
    public int getDragFlags() { return 0; }
    public com.android.internal.view.IDragAndDropPermissions getDragAndDropPermissions() { return null; }
    public java.lang.Object getLocalState() { return null; }
    public boolean getResult() { return false; }
    public final void recycle() {}
    public static java.lang.String actionToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
