package app.murinelauncher.widget.smartspace;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.android.launcher3.R;
import com.android.launcher3.widget.LauncherAppWidgetProviderInfo;
import com.android.systemui.plugins.CustomWidgetPlugin;

/**
 * CustomWidgetPlugin that provides the Murine clock + date widget
 * for the first screen of the home.
 */
public class MurineClockWidgetPlugin implements CustomWidgetPlugin {

    private final Context mContext;

    public MurineClockWidgetPlugin(Context context) {
        mContext = context;
    }

    @Override
    public void onViewCreated(AppWidgetHostView parent) {
        parent.removeAllViews();
        View clockView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.murine_clock_widget, parent, false);
        parent.addView(clockView);
    }

    @Override
    public boolean useLivePreview() {
        return true;
    }

    @Override
    public View createPreviewView(Context context) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.murine_clock_widget, null, false);
        if (view instanceof MurineClockView murineClock) murineClock.refreshClockFormat();
        return view;
    }

    @Override
    public void updateWidgetInfo(AppWidgetProviderInfo info, Context context) {
        info.label = context.getString(R.string.smartspace_mode_clock);
        if (info instanceof LauncherAppWidgetProviderInfo wpi) {
            wpi.forceResizableX = true;
            wpi.forceResizableY = true;
            // 99 is just unrealistically wide enough in order to always pick the workspace width
            wpi.spanX = 99;
            wpi.spanY = 1;
            wpi.minSpanX = 1;
            wpi.minSpanY = 1;
        }
        info.minResizeWidth = 250;
        info.minResizeHeight = 48;
        info.minWidth = 250;
        info.minHeight = 48;
        info.resizeMode = AppWidgetProviderInfo.RESIZE_HORIZONTAL | AppWidgetProviderInfo.RESIZE_VERTICAL;
        info.icon = R.drawable.ic_pref_smartspace_clock;
    }
}
