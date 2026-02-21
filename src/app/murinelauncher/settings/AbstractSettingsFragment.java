package app.murinelauncher.settings;

import static android.provider.Settings.Global.DEVELOPMENT_SETTINGS_ENABLED;
import static com.android.launcher3.BuildConfig.IS_DEBUG_DEVICE;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;

import com.android.launcher3.BuildConfig;
import com.android.launcher3.Flags;
import com.android.launcher3.LauncherFiles;
import com.android.launcher3.settings.PreferenceHighlighter;
import com.android.launcher3.settings.SettingsActivity;
import com.android.launcher3.util.DisplayController;
import com.android.launcher3.util.SettingsCache;
import com.android.settingslib.widget.SettingsBasePreferenceFragment;

/**
 * This fragment shows the launcher preferences.
 */
public abstract class AbstractSettingsFragment extends SettingsBasePreferenceFragment implements
        SettingsCache.OnChangeListener {
    private static final int DELAY_HIGHLIGHT_DURATION_MILLIS = 600;
    public static final String SAVE_HIGHLIGHTED_KEY = "android:preference_highlighted";

    protected boolean mDeveloperOptionsEnabled = false;

    private boolean mRestartOnResume = false;

    private String mHighLightKey;

    private boolean mPreferenceHighlighted = false;

    /**
     * @return the resource id of the preference screen.
     */
    protected abstract int getPreferenceScreenResId();

    protected @Nullable Integer getPreferenceTitle() {return null;}

    /**
     * Initializes a preference. This is called for every preference. Returning false here
     * will remove that preference; always default to return true unless you want to hide something.
     */
    protected abstract boolean initPreference(@NonNull Preference preference, @NonNull DisplayController.Info info);

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (BuildConfig.IS_DEBUG_DEVICE) {
            Uri devUri = Settings.Global.getUriFor(DEVELOPMENT_SETTINGS_ENABLED);
            SettingsCache settingsCache = SettingsCache.INSTANCE.get(getContext());
            mDeveloperOptionsEnabled = settingsCache.getValue(devUri);
            settingsCache.register(devUri, this);
        }
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        final Bundle args = getArguments();
        mHighLightKey = args == null ? null : args.getString(SettingsActivity.EXTRA_FRAGMENT_HIGHLIGHT_KEY);

        if (savedInstanceState != null) {
            mPreferenceHighlighted = savedInstanceState.getBoolean(SAVE_HIGHLIGHTED_KEY);
        }

        getPreferenceManager().setSharedPreferencesName(LauncherFiles.SHARED_PREFERENCES_KEY);
        setPreferencesFromResource(getPreferenceScreenResId(), rootKey);

        PreferenceScreen screen = getPreferenceScreen();
        DisplayController.Info info = DisplayController.INSTANCE.get(getContext()).getInfo();
        for (int i = screen.getPreferenceCount() - 1; i >= 0; i--) {
            Preference preference = screen.getPreference(i);
            if (!onInitPreference(preference, info)) screen.removePreference(preference);
        }

        // If the target preference is not in the current preference screen, find the parent
        // preference screen that contains the target preference and set it as the preference
        // screen.
        if (Flags.navigateToChildPreference()
                && mHighLightKey != null
                && !isKeyInPreferenceGroup(mHighLightKey, screen)) {
            final PreferenceScreen parentPreferenceScreen =
                    findParentPreference(screen, mHighLightKey);
            if (parentPreferenceScreen != null && getActivity() != null) {
                if (!TextUtils.isEmpty(parentPreferenceScreen.getTitle())) {
                    getActivity().setTitle(parentPreferenceScreen.getTitle());
                }
                setPreferenceScreen(parentPreferenceScreen);
                return;
            }
        }

        if (getActivity() != null && !TextUtils.isEmpty(getPreferenceScreen().getTitle())) {
            getActivity().setTitle(getPreferenceScreen().getTitle());
        }
    }

    private boolean isKeyInPreferenceGroup(String targetKey, PreferenceGroup parent) {
        for (int i = 0; i < parent.getPreferenceCount(); i++) {
            Preference pref = parent.getPreference(i);
            if (pref.getKey() != null && pref.getKey().equals(targetKey)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds the parent preference screen for the given target key.
     *
     * @param parent    the parent preference screen
     * @param targetKey the key of the preference to find
     * @return the parent preference screen that contains the target preference
     */
    @Nullable
    private PreferenceScreen findParentPreference(PreferenceScreen parent, String targetKey) {
        for (int i = 0; i < parent.getPreferenceCount(); i++) {
            Preference pref = parent.getPreference(i);
            if (pref instanceof PreferenceScreen) {
                PreferenceScreen foundKey = findParentPreference((PreferenceScreen) pref,
                        targetKey);
                if (foundKey != null) {
                    return foundKey;
                }
            } else if (pref.getKey() != null && pref.getKey().equals(targetKey)) {
                return parent;
            }
        }
        return null;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        var res = getContext().getResources();
        int bottomPadding = res.getDimensionPixelSize(com.android.settingslib.widget.theme.R.dimen.settingslib_expressive_space_small1);
        super.onViewCreated(view, savedInstanceState);
        Integer prefTitle = getPreferenceTitle();
        if (prefTitle != null) getActivity().getActionBar().setTitle(res.getString(prefTitle));
        RecyclerView listView = getListView();
        listView.setPadding(0, 0, 0, bottomPadding);
        listView.setClipToPadding(false);
        listView.setOnApplyWindowInsetsListener((v, insets) -> {
            v.setPadding(
                    v.getPaddingLeft(),
                    v.getPaddingTop(),
                    v.getPaddingRight(),
                    bottomPadding + insets.getSystemWindowInsetBottom());
            return insets.consumeSystemWindowInsets();
        });

        // Overriding Text Direction in the Androidx preference library to support RTL
        view.setTextDirection(View.TEXT_DIRECTION_LOCALE);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(SAVE_HIGHLIGHTED_KEY, mPreferenceHighlighted);
    }

    /**
     * Initializes a preference. This is called for every preference. Returning false here
     * will remove that preference from the list.
     */
    private final boolean onInitPreference(@NonNull Preference preference, @NonNull DisplayController.Info info) {
        String key = preference.getKey();
        if (key == null) return true;
        return initPreference(preference, info);
    }

    @Override
    public void onResume() {
        super.onResume();

        if (isAdded() && !mPreferenceHighlighted) {
            PreferenceHighlighter highlighter = createHighlighter();
            if (highlighter != null) {
                getView().postDelayed(highlighter, DELAY_HIGHLIGHT_DURATION_MILLIS);
                mPreferenceHighlighted = true;
            }
        }

        if (mRestartOnResume) {
            recreateActivityNow();
        }
    }

    @Override
    public void onSettingsChanged(boolean isEnabled) {
        // Developer options changed, try recreate
        tryRecreateActivity();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (IS_DEBUG_DEVICE) {
            SettingsCache.INSTANCE.get(getContext())
                    .unregister(Settings.Global.getUriFor(DEVELOPMENT_SETTINGS_ENABLED), this);
        }
    }

    /**
     * Tries to recreate the preference
     */
    protected void tryRecreateActivity() {
        if (isResumed()) {
            recreateActivityNow();
        } else {
            mRestartOnResume = true;
        }
    }

    private void recreateActivityNow() {
        Activity activity = getActivity();
        if (activity != null) {
            activity.recreate();
        }
    }

    private PreferenceHighlighter createHighlighter() {
        if (TextUtils.isEmpty(mHighLightKey)) {
            return null;
        }

        PreferenceScreen screen = getPreferenceScreen();
        if (screen == null) {
            return null;
        }

        RecyclerView list = getListView();
        PreferenceGroup.PreferencePositionCallback callback = (PreferenceGroup.PreferencePositionCallback) list.getAdapter();
        int position = callback.getPreferenceAdapterPosition(mHighLightKey);
        return position >= 0 ? new PreferenceHighlighter(
                list, position, screen.findPreference(mHighLightKey))
                : null;
    }
}
