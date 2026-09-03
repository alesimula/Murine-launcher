/*
 * Copyright (C) 2023 The Android Open Source Project
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
package com.android.launcher3;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import org.lsposed.hiddenapibypass.HiddenApiBypass;

import app.murinelauncher.icons.IconPackManager;
import app.murinelauncher.theme.ThemeOverride;

import com.android.launcher3.dagger.DaggerLauncherAppComponent;
import com.android.launcher3.dagger.LauncherAppComponent;
import com.android.launcher3.dagger.LauncherBaseAppComponent;
import com.android.launcher3.util.TraceHelper;

/**
 * Main application class for Launcher
 */
public class LauncherApplication extends Application {

    private volatile LauncherBaseAppComponent mAppComponent;
    private int mNightMode = Configuration.UI_MODE_NIGHT_UNDEFINED;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // Exempts every non-SDK interface, so hidden APIs stay reachable on Android 9+
        if (Utilities.ATLEAST_P) HiddenApiBypass.setHiddenApiExemptions("");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Only checks if a backup is staged, does nothing otherwise
        app.murinelauncher.backup.BackupHelper.INSTANCE.applyStagedRestoreIfNeeded(this);
        mNightMode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;

        com.zxy.recovery.core.Recovery.getInstance()
                .debug(true)
                .showDevEmail("alesimula@murinelauncher.app", true)
                .recoverInBackground(false)
                .recoverStack(true)
                .mainPage(Launcher.class)
                .recoverEnabled(true)
                //.callback(new MyCrashCallbacy())
                .silent(false, com.zxy.recovery.core.Recovery.SilentMode.RECOVER_ACTIVITY_STACK)
                //.skip(TestActivity.class)
                .init(this);

        app.murinelauncher.theme.ThemeOverride.syncNightMode(this);
        MainProcessInitializer.initialize(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        int nightMode = newConfig.uiMode & Configuration.UI_MODE_NIGHT_MASK;
        if (nightMode != mNightMode) {
            mNightMode = nightMode;
            // System theme flip: reload if an icon pack is selected to allow icons to refresh
            if (ThemeOverride.getThemePref(this) == ThemeOverride.THEME_SYSTEM
                    && IconPackManager.INSTANCE.isAnyPackActive(this))
                LauncherAppState.getInstance(this).getModel().forceReload();
        };
    }

    public LauncherAppComponent getAppComponent() {
        if (mAppComponent == null) {
            synchronized (this) {
                // Check for null again, as it may have been assigned on a different thread. This
                // avoids holding synchronization locks everytime.
                if (mAppComponent == null) {
                    // Initialize the dagger component on demand as content providers can get
                    // accessed before the Launcher application (b/36917845#comment4)
                    initDaggerComponent(DaggerLauncherAppComponent.builder()
                            .iconsDbName(LauncherFiles.APP_ICONS_DB));
                }
            }
        }
        // Since supertype setters will return a supertype.builder and @Component.Builder types
        // must not have any generic types.
        // We need to cast mAppComponent to {@link LauncherAppComponent} since appContext()
        // method is defined in the super class LauncherBaseComponent#Builder.
        return (LauncherAppComponent) mAppComponent;
    }

    /**
     * Init with the desired dagger component.
     */
    public void initDaggerComponent(LauncherBaseAppComponent.Builder componentBuilder) {
        mAppComponent = componentBuilder
                .appContext(this)
                .setSafeModeEnabled(TraceHelper.allowIpcs(
                        "isSafeMode", () -> getPackageManager().isSafeMode()))
                .build();
    }
}
