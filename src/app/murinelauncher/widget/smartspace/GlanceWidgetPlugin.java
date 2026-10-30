package app.murinelauncher.widget.smartspace;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;

import app.murinelauncher.settings.SettingsGlanceFragment;

import com.android.launcher3.R;
import com.android.launcher3.settings.SettingsActivity;
import com.android.launcher3.widget.LauncherAppWidgetProviderInfo;
import com.android.systemui.plugins.CustomWidgetPlugin;

/**
 * CustomWidgetPlugin for the At a Glance widget (date, weather, battery, flashlight),
 * adapted from Lawnchair's own smartspace.
 */
public class GlanceWidgetPlugin implements CustomWidgetPlugin {

    /** Instantiated by reflection from {@code custom_widget_providers}. */
    public GlanceWidgetPlugin(Context context) {}

    @Override
    public void onViewCreated(AppWidgetHostView parent) {
        parent.removeAllViews();
        parent.addView(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.murine_glance_widget, parent, false));
    }

    @Override
    public boolean useLivePreview() {
        return true;
    }

    @Override
    public View createPreviewView(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.murine_glance_widget, null, false);
    }

    @Override
    public Intent getConfigureIntent(Context context) {
        return new Intent(context, SettingsActivity.class)
                .putExtra(SettingsActivity.EXTRA_FRAGMENT, SettingsGlanceFragment.class.getName());
    }

    @Override
    public void updateWidgetInfo(AppWidgetProviderInfo info, Context context) {
        info.label = context.getString(R.string.glance_widget_label);
        if (info instanceof LauncherAppWidgetProviderInfo wpi) {
            wpi.forceResizableX = true;
            wpi.forceResizableY = true;
            // Same sizing as the clock: as wide as the workspace, one row tall
            wpi.spanX = 99;
            wpi.spanY = 1;
            wpi.minSpanX = 3;
            wpi.minSpanY = 1;
        }
        info.minResizeWidth = 250;
        info.minResizeHeight = 48;
        info.minWidth = 250;
        info.minHeight = 48;
        info.resizeMode = AppWidgetProviderInfo.RESIZE_HORIZONTAL | AppWidgetProviderInfo.RESIZE_VERTICAL;
        info.icon = R.drawable.ic_pref_smartspace_google;
    }
}
