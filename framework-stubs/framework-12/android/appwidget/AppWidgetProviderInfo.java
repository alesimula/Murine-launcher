package android.appwidget;

public class AppWidgetProviderInfo implements android.os.Parcelable {
    public static final int RESIZE_NONE = 0;
    public static final int RESIZE_HORIZONTAL = 1;
    public static final int RESIZE_VERTICAL = 2;
    public static final int RESIZE_BOTH = 3;
    public static final int WIDGET_CATEGORY_UNKNOWN = -1;
    public static final int WIDGET_CATEGORY_HOME_SCREEN = 1;
    public static final int WIDGET_CATEGORY_KEYGUARD = 2;
    public static final int WIDGET_CATEGORY_SEARCHBOX = 4;
    public static final int WIDGET_FEATURE_RECONFIGURABLE = 1;
    public static final int WIDGET_FEATURE_HIDE_FROM_PICKER = 2;
    public static final int WIDGET_FEATURE_CONFIGURATION_OPTIONAL = 4;
    public android.content.ComponentName provider;
    public int minWidth;
    public int minHeight;
    public int minResizeWidth;
    public int minResizeHeight;
    @android.annotation.SuppressLint("MutableBareField")
    public int maxResizeWidth;
    @android.annotation.SuppressLint("MutableBareField")
    public int maxResizeHeight;
    @android.annotation.SuppressLint("MutableBareField")
    public int targetCellWidth;
    @android.annotation.SuppressLint("MutableBareField")
    public int targetCellHeight;
    public int updatePeriodMillis;
    public int initialLayout;
    public int initialKeyguardLayout;
    public android.content.ComponentName configure;
    @java.lang.Deprecated
    public java.lang.String label;
    public int icon;
    public int autoAdvanceViewId;
    public int previewImage;
    @android.annotation.SuppressLint("MutableBareField")
    public int previewLayout;
    public int resizeMode;
    public int widgetCategory;
    @android.annotation.SuppressLint("MutableBareField")
    public int descriptionRes;
    public int widgetFeatures;
    public android.content.pm.ActivityInfo providerInfo;
    public static final android.os.Parcelable.Creator<android.appwidget.AppWidgetProviderInfo> CREATOR = null;
    public AppWidgetProviderInfo() {}
    public AppWidgetProviderInfo(android.os.Parcel p0) {}
    public final java.lang.String loadLabel(android.content.pm.PackageManager p0) { return null; }
    public final android.graphics.drawable.Drawable loadIcon(android.content.Context p0, int p1) { return null; }
    public final android.graphics.drawable.Drawable loadPreviewImage(android.content.Context p0, int p1) { return null; }
    public final java.lang.CharSequence loadDescription(android.content.Context p0) { return null; }
    public final android.os.UserHandle getProfile() { return null; }
    public android.content.pm.ActivityInfo getActivityInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.appwidget.AppWidgetProviderInfo clone() { return null; }
    public int describeContents() { return 0; }
    private android.graphics.drawable.Drawable loadDrawable(android.content.Context p0, int p1, int p2, boolean p3) { return null; }
    public void updateDimensions(android.util.DisplayMetrics p0) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CategoryFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeatureFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResizeModeFlags {
    }
}
