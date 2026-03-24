package android.view;

public final class DragAndDropPermissions implements android.os.Parcelable {
    private static final java.lang.String TAG = "DragAndDrop";
    private static final boolean DEBUG = false;
    private final com.android.internal.view.IDragAndDropPermissions mDragAndDropPermissions = null;
    public static final android.os.Parcelable.Creator<android.view.DragAndDropPermissions> CREATOR = null;
    public static android.view.DragAndDropPermissions obtain(android.view.DragEvent p0) { return null; }
    private DragAndDropPermissions(com.android.internal.view.IDragAndDropPermissions p0) {}
    public boolean take(android.os.IBinder p0) { return false; }
    public boolean takeTransient() { return false; }
    public void release() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private DragAndDropPermissions(android.os.Parcel p0) {}
}
