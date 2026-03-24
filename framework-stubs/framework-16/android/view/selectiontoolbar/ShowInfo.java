package android.view.selectiontoolbar;

public class ShowInfo implements android.os.Parcelable {
    public int sequenceNumber;
    public long widgetToken;
    public boolean layoutRequired;
    public java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> menuItems;
    public android.graphics.Rect contentRect;
    public int suggestedWidth;
    public android.graphics.Rect viewPortOnScreen;
    public android.os.IBinder hostInputToken;
    public boolean isLightTheme;
    public android.content.res.Configuration configuration;
    public static final android.os.Parcelable.Creator<android.view.selectiontoolbar.ShowInfo> CREATOR = null;
    public ShowInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
