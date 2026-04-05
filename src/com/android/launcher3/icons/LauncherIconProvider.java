/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.launcher3.icons;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;

import app.murinelauncher.icons.IconPackManager;

import androidx.annotation.Nullable;

import com.android.launcher3.R;
import com.android.launcher3.config.FeatureFlags;
import com.android.launcher3.dagger.ApplicationContext;
import com.android.launcher3.dagger.LauncherAppSingleton;
import com.android.launcher3.graphics.ThemeManager;

import org.xmlpull.v1.XmlPullParser;

import java.util.Collections;
import java.util.Map;

import javax.inject.Inject;

/**
 * Extension of {@link IconProvider} with support for overriding theme icons
 */
@LauncherAppSingleton
public class LauncherIconProvider extends IconProvider {

    public static final String TAG_ICON = "icon";
    public static final String ATTR_PACKAGE = "package";
    public static final String ATTR_DRAWABLE = "drawable";
    public static final String ATTR_COMPONENT = "component";

    protected static final String TAG = "LIconProvider";
    protected static final Map<String, ThemeData> DISABLED_MAP = Collections.emptyMap();

    protected Map<String, ThemeData> mThemedIconMap;

    protected final ThemeManager mThemeManager;

    @Inject
    public LauncherIconProvider(
            @ApplicationContext Context context,
            ThemeManager themeManager) {
        super(context);
        mThemeManager = themeManager;
        mThemedIconMap = FeatureFlags.USE_LOCAL_ICON_OVERRIDES.get() ? null : DISABLED_MAP;
    }

    @Override
    public Drawable getIcon(ComponentInfo info, int iconDpi) {
        ComponentName cn = new ComponentName(info.packageName, info.name);

        // Try pack-specific icon (from appfilter.xml entries)
        Drawable packIcon = IconPackManager.INSTANCE.getIconForComponent(mContext, cn, iconDpi);
        if (packIcon != null) {
            // When "Ignore pack shape" is ON and the pack enforces a shape,
            // let adaptive pack icons go through the normal pipeline (use icon shape chosen by user)
            if (packIcon instanceof AdaptiveIconDrawable && IconPackManager.INSTANCE.isIgnoreShape(mContext)
                    && IconPackManager.INSTANCE.enforcesShape(mContext)) {
                return packIcon;
            }
            return markPackIcon(packIcon);
        }

        // Get default system icon
        Drawable defaultIcon = super.getIcon(info, iconDpi);

        // Apply global pack shape (iconback / iconmask / iconupon / scale) for unthemed icons.
        // "Ignore pack shape" is handled inside applyGlobalTreatment and only takes effect when the pack actually enforces a shape.
        if (!IconPackManager.INSTANCE.isThemedOnly(mContext)) {
            Drawable shaped = IconPackManager.INSTANCE.applyGlobalTreatment(mContext, cn, defaultIcon, iconDpi);
            if (shaped != null) return markPackIcon(shaped);
        }

        return defaultIcon;
    }

    /**
     * Marks a drawable as coming from an icon pack by setting CONFIG_HINT_NO_WRAP;
     * This prevents {@link BaseIconFactory} from wrapping it into an {@link AdaptiveIconDrawable}
     * (which would double-wrap bitmap icons that already have their shape baked in).
     *
     * Adaptive pack icons still go through getShapePath normally and receive the user's chosen shape.
     */
    private static Drawable markPackIcon(Drawable icon) {
        icon.setChangingConfigurations(icon.getChangingConfigurations() | BaseIconFactory.CONFIG_HINT_NO_WRAP);
        return icon;
    }

    @Override
    public String getStateForApp(@Nullable ApplicationInfo appInfo) {
        String base = super.getStateForApp(appInfo);
        String pack = IconPackManager.INSTANCE.getSelectedPack(mContext);
        boolean systemOnly = IconPackManager.INSTANCE.isSystemOnly(mContext);
        boolean ignoreShape = IconPackManager.INSTANCE.isIgnoreShape(mContext);
        boolean readaptToFrame = IconPackManager.INSTANCE.isReadaptFrame(mContext);
        boolean themedOnly = IconPackManager.INSTANCE.isThemedOnly(mContext);
        return base + "," + pack + "," + systemOnly + "," + ignoreShape
                + "," + readaptToFrame + "," + themedOnly;
    }

    @Override
    protected ThemeData getThemeDataForPackage(String packageName) {
        return getThemedIconMap().get(packageName);
    }

    @Override
    public void updateSystemState() {
        super.updateSystemState();
        mSystemState += "," + mThemeManager.getIconState().toUniqueId();
    }

    protected Map<String, ThemeData> getThemedIconMap() {
        if (mThemedIconMap != null) {
            return mThemedIconMap;
        }
        ArrayMap<String, ThemeData> map = new ArrayMap<>();
        Resources res = mContext.getResources();
        try (XmlResourceParser parser = res.getXml(R.xml.grayscale_icon_map)) {
            final int depth = parser.getDepth();
            int type;
            while ((type = parser.next()) != XmlPullParser.START_TAG
                    && type != XmlPullParser.END_DOCUMENT);

            while (((type = parser.next()) != XmlPullParser.END_TAG
                    || parser.getDepth() > depth) && type != XmlPullParser.END_DOCUMENT) {
                if (type != XmlPullParser.START_TAG) {
                    continue;
                }
                if (TAG_ICON.equals(parser.getName())) {
                    String pkg = parser.getAttributeValue(null, ATTR_PACKAGE);
                    int iconId = parser.getAttributeResourceValue(null, ATTR_DRAWABLE, 0);
                    if (iconId != 0 && !TextUtils.isEmpty(pkg)) {
                        map.put(pkg, new ThemeData(res, iconId));
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Unable to parse icon map", e);
        }
        mThemedIconMap = map;
        return mThemedIconMap;
    }
}
