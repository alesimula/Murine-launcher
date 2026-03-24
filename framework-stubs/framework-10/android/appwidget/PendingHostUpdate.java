package android.appwidget;

public class PendingHostUpdate implements android.os.Parcelable {
    static final int TYPE_VIEWS_UPDATE = 0;
    static final int TYPE_PROVIDER_CHANGED = 1;
    static final int TYPE_VIEW_DATA_CHANGED = 2;
    final int appWidgetId = 0;
    final int type = 0;
    android.widget.RemoteViews views;
    android.appwidget.AppWidgetProviderInfo widgetInfo;
    int viewId;
    public static final android.os.Parcelable.Creator<android.appwidget.PendingHostUpdate> CREATOR = null;
    public static android.appwidget.PendingHostUpdate updateAppWidget(int p0, android.widget.RemoteViews p1) { return null; }
    public static android.appwidget.PendingHostUpdate providerChanged(int p0, android.appwidget.AppWidgetProviderInfo p1) { return null; }
    public static android.appwidget.PendingHostUpdate viewDataChanged(int p0, int p1) { return null; }
    private PendingHostUpdate(int p0, int p1) {}
    private PendingHostUpdate(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void writeNullParcelable(android.os.Parcelable p0, android.os.Parcel p1, int p2) {}
}
