package android.view.selectiontoolbar;

public class ToolbarMenuItem implements android.os.Parcelable {
    public int itemId;
    public int itemIndex;
    public java.lang.CharSequence title;
    public java.lang.CharSequence contentDescription;
    public int groupId;
    public android.graphics.drawable.Icon icon;
    public java.lang.CharSequence tooltipText;
    public int priority;
    public static final android.os.Parcelable.Creator<android.view.selectiontoolbar.ToolbarMenuItem> CREATOR = null;
    public static final int PRIORITY_UNKNOWN = 0;
    public static final int PRIORITY_PRIMARY = 1;
    public static final int PRIORITY_OVERFLOW = 2;
    public ToolbarMenuItem() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
