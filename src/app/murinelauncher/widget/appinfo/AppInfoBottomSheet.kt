package app.murinelauncher.widget.appinfo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Process;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.pm.PackageInfoCompat;

import com.android.launcher3.BaseActivity;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.R;
import com.android.launcher3.Utilities;
import com.android.launcher3.anim.PendingAnimation;
import com.android.launcher3.model.data.ItemInfo;
import com.android.launcher3.util.PackageManagerHelper;
import com.android.launcher3.views.AbstractSlideInView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import app.murinelauncher.icons.IconPackManager;
import app.murinelauncher.widget.radio.RadioGroupPreference;

/**
 * Bottom sheet showing app information: package, version, last update, source, and icon pack
 */
public class AppInfoBottomSheet extends AbstractSlideInView<BaseActivity> {

    private static final int DEFAULT_CLOSE_DURATION = 200;
    private ItemInfo mItemInfo;
    private View mIconPackEntryView;

    public AppInfoBottomSheet(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AppInfoBottomSheet(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setWillNotDraw(false);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mContent = findViewById(R.id.app_info_bottom_sheet);
        setContentBackgroundWithParent(getContext().getDrawable(R.drawable.bg_rounded_corner_bottom_sheet), mContent);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int width = r - l;
        int height = b - t;
        int contentWidth = mContent.getMeasuredWidth();
        int contentLeft = (width - contentWidth) / 2;
        mContent.layout(contentLeft, height - mContent.getMeasuredHeight(),
                contentLeft + contentWidth, height);
        setTranslationShift(mTranslationShift);
    }

    @Override
    protected int getScrimColor(Context context) {
        return context.getResources().getColor(R.color.widgets_picker_scrim);
    }

    public void populateAndShow(ItemInfo itemInfo) {
        mItemInfo = itemInfo;
        Context context = getContext();
        // Ensure SettingsLib text appearances, paddings and colors
        Context themed = new android.view.ContextThemeWrapper(context, R.style.HomeSettings_Theme);
        ComponentName componentName = itemInfo.getTargetComponent();
        ((TextView) findViewById(R.id.title)).setText(itemInfo.title != null ? itemInfo.title : "");

        ImageButton settingsBtn = findViewById(R.id.settings_button);
        settingsBtn.setOnClickListener(v -> {
            Rect sourceBounds = Utilities.getViewBounds(v);
            PackageManagerHelper.startDetailsActivityForInfo(
                    context, mItemInfo, sourceBounds, null);
        });

        LinearLayout entries = findViewById(R.id.app_info_entries);
        entries.removeAllViews();

        if (componentName == null) {
            attachToContainer();
            mIsOpen = false;
            animateOpen();
            return;
        }

        String packageName = componentName.getPackageName();
        PackageManager pm = context.getPackageManager();
        PackageInfo packageInfo = null;
        try {
            packageInfo = pm.getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException ignored) {
        }

        // Collect entries: [key, title, summary, iconResId]
        List<Object[]> entryList = new ArrayList<>();

        entryList.add(new Object[]{"package",
                context.getString(R.string.app_info_package), packageName,
                R.drawable.ic_app_info_package});

        if (packageInfo != null && packageInfo.versionName != null) {
            entryList.add(new Object[]{"version",
                    context.getString(R.string.app_info_version),
                    context.getString(R.string.app_info_version_value, packageInfo.versionName, PackageInfoCompat.getLongVersionCode(packageInfo)),
                    R.drawable.ic_app_info_version});
        }

        if (packageInfo != null && packageInfo.lastUpdateTime > 0) {
            String dateStr = DateFormat.getDateTimeInstance(
                    DateFormat.MEDIUM, DateFormat.SHORT).format(
                    new Date(packageInfo.lastUpdateTime));
            entryList.add(new Object[]{"last_update",
                    context.getString(R.string.app_info_last_update), dateStr,
                    R.drawable.ic_app_info_update});
        }

        if (packageInfo != null) {
            String sourceLabel = resolveSourceLabel(context, pm, packageInfo, packageName);
            if (sourceLabel != null) {
                entryList.add(new Object[]{"source",
                        context.getString(R.string.app_info_source), sourceLabel,
                        R.drawable.ic_app_info_source});
            }
        }

        // Icon pack entry
        String componentKey = componentName.flattenToString();
        entryList.add(new Object[]{"icon_pack",
                context.getString(R.string.pref_category_icon_pack_title),
                getIconPackSummary(context, componentKey),
                R.drawable.ic_app_info_icon_pack});

        // Build entry views
        int total = entryList.size();
        int themeR_spacing = com.android.settingslib.widget.theme.R.dimen
                .settingslib_expressive_space_extrasmall1;
        int spacingPx = themed.getResources().getDimensionPixelSize(themeR_spacing);

        for (int i = 0; i < total; i++) {
            Object[] data = entryList.get(i);
            String key = (String) data[0];
            String title = (String) data[1];
            String summary = (String) data[2];
            int iconRes = (int) data[3];

            View entryView = createEntryView(themed, entries, title, summary, iconRes,
                    i, total);

            // 2dp spacing between card items (like SettingsLib MarginItemDecoration)
            if (i > 0) {
                LinearLayout.LayoutParams lp =
                        (LinearLayout.LayoutParams) entryView.getLayoutParams();
                if (lp == null) {
                    lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);
                }
                lp.topMargin = spacingPx;
                entryView.setLayoutParams(lp);
            }

            if (key.equals("icon_pack")) {
                mIconPackEntryView = entryView;
                entryView.setOnClickListener(v ->
                        showIconPackPicker(componentKey, packageName));
            } else {
                final String value = summary;
                final String label = title;
                entryView.setOnLongClickListener(v -> {
                    copyToClipboard(context, label, value);
                    return true;
                });
            }

            entries.addView(entryView);
        }

        attachToContainer();
        mIsOpen = false;
        animateOpen();
    }

    private View createEntryView(Context themed, ViewGroup parent,
                                 String title, String summary, int iconRes,
                                 int position, int total) {
        int themeR = com.android.settingslib.widget.theme.R.layout
                .settingslib_expressive_preference;
        View view = LayoutInflater.from(themed).inflate(themeR, parent, false);

        // Title
        TextView titleView = view.findViewById(android.R.id.title);
        if (titleView != null) titleView.setText(title);

        // Summary
        TextView summaryView = view.findViewById(android.R.id.summary);
        if (summaryView != null) {
            if (summary != null && !summary.isEmpty()) {
                summaryView.setText(summary);
                summaryView.setVisibility(View.VISIBLE);
            } else {
                summaryView.setVisibility(View.GONE);
            }
        }

        // Icon
        View iconFrame = view.findViewById(
                com.android.settingslib.widget.theme.R.id.icon_frame);
        if (iconFrame == null) iconFrame = view.findViewById(android.R.id.icon_frame);
        android.widget.ImageView iconView = view.findViewById(android.R.id.icon);
        if (iconView != null && iconRes != 0) {
            iconView.setImageResource(iconRes);
            if (iconFrame != null) iconFrame.setVisibility(View.VISIBLE);
        } else if (iconFrame != null) {
            iconFrame.setVisibility(View.GONE);
        }

        // Hide widget frame (no switch/radio needed)
        View widgetFrame = view.findViewById(android.R.id.widget_frame);
        if (widgetFrame != null) widgetFrame.setVisibility(View.GONE);

        // Card background: apply padding from the drawable (same as SettingsPreferenceGroupAdapter)
        view.setBackgroundResource(getCardBackground(position, total));
        Rect bgPadding = new Rect();
        if (view.getBackground() != null && view.getBackground().getPadding(bgPadding)) {
            view.setPadding(bgPadding.left, bgPadding.top, bgPadding.right, bgPadding.bottom);
        }

        return view;
    }

    private static int getCardBackground(int position, int total) {
        int themeR_drawable;
        if (total == 1) {
            themeR_drawable = com.android.settingslib.widget.theme.R.drawable.settingslib_round_background;
        } else if (position == 0) {
            themeR_drawable = com.android.settingslib.widget.theme.R.drawable.settingslib_round_background_top;
        } else if (position == total - 1) {
            themeR_drawable = com.android.settingslib.widget.theme.R.drawable.settingslib_round_background_bottom;
        } else {
            themeR_drawable = com.android.settingslib.widget.theme.R.drawable.settingslib_round_background_center;
        }
        return themeR_drawable;
    }

    private void showIconPackPicker(String componentKey, String packageName) {
        Context context = getContext();
        List<IconPackManager.IconPackInfo> packs =
                IconPackManager.INSTANCE.getInstalledPacks(context);

        RadioGroupPreference pref = new RadioGroupPreference(context);
        pref.setPersistent(false);
        pref.setSheetTitle(context.getString(R.string.pref_category_icon_pack_title));

        // Shared builder + flag to show "Default (global)" at index 0
        IconPackManager.INSTANCE.configureIconPackPreference(pref, true);

        // Determine current selection
        String currentOverride = IconPackManager.INSTANCE.getComponentOverride(context, componentKey);
        int currentIdx = 0; // "Default (global)" at index 0
        if (currentOverride != null) {
            for (int i = 0; i < packs.size(); i++) {
                if (packs.get(i).getPackageName().equals(currentOverride)) {
                    currentIdx = i + 1; // +1 for the prepended "Default" entry
                    break;
                }
            }
        }
        final int selIdx = currentIdx;
        pref.setCurrentValue(() -> selIdx);

        pref.setOnItemSelectedListener(index -> {
            if (index == 0) {
                IconPackManager.INSTANCE.resetComponentOverride(context, componentKey);
            } else {
                String packKey = packs.get(index - 1).getPackageName();
                IconPackManager.INSTANCE.setComponentOverride(
                        context, componentKey, packKey);
            }
            updateIconPackSummary(context, componentKey);
            refreshIconForPackage(context, packageName);
        });

        pref.showSheet();
    }

    private String getIconPackSummary(Context context, String componentKey) {
        String override = IconPackManager.INSTANCE.getComponentOverride(context, componentKey);
        if (override == null) {
            return context.getString(R.string.app_info_icon_pack_default);
        } else if (override.equals(IconPackManager.SYSTEM_ICON_PACK)) {
            return IconPackManager.SYSTEM_ICON_PACK_INFO.getLabel().toString();
        } else {
            return getPackLabel(context, override);
        }
    }

    private void updateIconPackSummary(Context context, String componentKey) {
        if (mIconPackEntryView == null) return;
        TextView summaryView = mIconPackEntryView.findViewById(android.R.id.summary);
        if (summaryView != null) {
            summaryView.setText(getIconPackSummary(context, componentKey));
            summaryView.setVisibility(View.VISIBLE);
        }
    }

    private void refreshIconForPackage(Context context, String packageName) {
        IconPackManager.INSTANCE.clearMainCache();
        LauncherAppState appState = LauncherAppState.getInstance(context);
        appState.getModel().onAppIconChanged(packageName, Process.myUserHandle());
    }

    private String resolveSourceLabel(Context context, PackageManager pm, PackageInfo packageInfo, String packageName) {
        try {
            String installer = pm.getInstallerPackageName(packageName);
            if (installer != null) {
                try {
                    ApplicationInfo installerInfo = pm.getApplicationInfo(installer, 0);
                    return pm.getApplicationLabel(installerInfo).toString();
                } catch (PackageManager.NameNotFoundException e) {
                    return installer;
                }
            } else {
                boolean isSystem = (packageInfo.applicationInfo.flags
                        & ApplicationInfo.FLAG_SYSTEM) != 0;
                return isSystem ? context.getString(R.string.app_info_source_system) : null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    private String getPackLabel(Context context, String packPackage) {
        try {
            PackageManager pm = context.getPackageManager();
            ApplicationInfo ai = pm.getApplicationInfo(packPackage, 0);
            return pm.getApplicationLabel(ai).toString();
        } catch (PackageManager.NameNotFoundException e) {
            return packPackage;
        }
    }

    private void copyToClipboard(Context context, String label, String text) {
        ClipboardManager clipboard = (ClipboardManager)
                context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(label, text);
        clipboard.setPrimaryClip(clip);
        Toast.makeText(context, R.string.app_info_copied_toast, Toast.LENGTH_SHORT).show();
    }

    private void animateOpen() {
        if (mIsOpen || mOpenCloseAnimation.getAnimationPlayer().isRunning()) return;
        mIsOpen = true;
        setUpDefaultOpenAnimation().start();
    }

    @Override
    protected void handleClose(boolean animate) {
        handleClose(animate, DEFAULT_CLOSE_DURATION);
    }

    @Override
    protected boolean isOfType(@FloatingViewType int type) {
        return (type & TYPE_WIDGETS_BOTTOM_SHEET) != 0;
    }

    @Override
    public boolean onControllerInterceptTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            mNoIntercept = false;
            ScrollView scrollView = findViewById(R.id.app_info_scroll_view);
            if (getPopupContainer().isEventOverView(scrollView, ev)
                    && scrollView.getScrollY() > 0) {
                mNoIntercept = true;
            }
        }
        return super.onControllerInterceptTouchEvent(ev);
    }

    @Override
    protected Pair<View, String> getAccessibilityTarget() {
        return Pair.create(findViewById(R.id.title),
                getContext().getString(R.string.app_info_drop_target_label));
    }

    @Override
    public void addHintCloseAnim(
            float distanceToMove, Interpolator interpolator, PendingAnimation target) {
        target.addAnimatedFloat(mSwipeToDismissProgress, 0f, 1f, interpolator);
    }

    public static AppInfoBottomSheet show(BaseActivity activity, ItemInfo itemInfo) {
        AppInfoBottomSheet sheet = (AppInfoBottomSheet)
                activity.getLayoutInflater().inflate(
                        R.layout.app_info_bottom_sheet,
                        activity.getDragLayer(), false);
        sheet.populateAndShow(itemInfo);
        return sheet;
    }
}
