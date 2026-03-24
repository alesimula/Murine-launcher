package android.appwidget;

@android.annotation.FlaggedApi("android.appwidget.flags.engagement_metrics")
public class AppWidgetEvent implements android.os.Parcelable {
    public static final int MAX_NUM_ITEMS = 10;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.appwidget.AppWidgetEvent> CREATOR = null;
    public int getAppWidgetId() { return 0; }
    public long getDurationMs() { return 0L; }
    @android.annotation.Nullable
    public android.graphics.Rect getPosition() { return null; }
    @android.annotation.Nullable
    public int[] getClickedIds() { return null; }
    @android.annotation.Nullable
    public int[] getScrolledIds() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.os.PersistableBundle toBundle() { return null; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder() {}
        public android.appwidget.AppWidgetEvent.Builder setAppWidgetId(int p0) { return null; }
        public android.appwidget.AppWidgetEvent.Builder addDurationMs(long p0) { return null; }
        public android.appwidget.AppWidgetEvent.Builder setPosition(android.graphics.Rect p0) { return null; }
        public android.appwidget.AppWidgetEvent.Builder addClickedId(int p0) { return null; }
        public android.appwidget.AppWidgetEvent.Builder addScrolledId(int p0) { return null; }
        public void merge(android.appwidget.AppWidgetEvent p0) {}
        public boolean isEmpty() { return false; }
        public void clear() {}
        public android.appwidget.AppWidgetEvent build() { return null; }
    }
}
