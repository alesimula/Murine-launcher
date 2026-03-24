package android.view.selectiontoolbar;

public class WidgetInfo implements android.os.Parcelable {
    public int sequenceNumber;
    public long widgetToken;
    public android.graphics.Rect contentRect;
    public android.view.SurfaceControlViewHost.SurfacePackage surfacePackage;
    public static final android.os.Parcelable.Creator<android.view.selectiontoolbar.WidgetInfo> CREATOR = null;
    public WidgetInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
