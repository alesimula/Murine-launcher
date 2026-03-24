package android.appwidget;

public class AppWidgetProvider extends android.content.BroadcastReceiver {
    public AppWidgetProvider() { super(); }
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    public void onUpdate(android.content.Context p0, android.appwidget.AppWidgetManager p1, int[] p2) {}
    public void onAppWidgetOptionsChanged(android.content.Context p0, android.appwidget.AppWidgetManager p1, int p2, android.os.Bundle p3) {}
    public void onDeleted(android.content.Context p0, int[] p1) {}
    public void onEnabled(android.content.Context p0) {}
    public void onDisabled(android.content.Context p0) {}
    public void onRestored(android.content.Context p0, int[] p1, int[] p2) {}
}
