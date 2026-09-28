/*
 * Copyright (C) 2015 The Android Open Source Project
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
package com.android.launcher3.allapps.search;

import static com.android.launcher3.allapps.BaseAllAppsAdapter.VIEW_TYPE_EMPTY_SEARCH;
import static com.android.launcher3.util.Executors.MAIN_EXECUTOR;

import android.content.Context;
import android.os.Handler;
import android.os.UserManager;

import androidx.annotation.AnyThread;

import com.android.launcher3.LauncherAppState;
import com.android.launcher3.allapps.BaseAllAppsAdapter.AdapterItem;
import com.android.launcher3.model.data.AppInfo;
import com.android.launcher3.pm.UserCache;
import com.android.launcher3.search.FuzzyAppMatcher;
import com.android.launcher3.search.SearchAlgorithm;
import com.android.launcher3.search.SearchCallback;
import com.android.launcher3.search.StringMatcherUtility;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The default search implementation.
 */
public class DefaultAppSearchAlgorithm implements SearchAlgorithm<AdapterItem> {
    private final LauncherAppState mAppState;
    private final Handler mResultHandler;
    private final boolean mAddNoResultsMessage;

    public DefaultAppSearchAlgorithm(Context context) {
        this(context, false);
    }

    public DefaultAppSearchAlgorithm(Context context, boolean addNoResultsMessage) {
        mAppState = LauncherAppState.getInstance(context);
        mResultHandler = new Handler(MAIN_EXECUTOR.getLooper());
        mAddNoResultsMessage = addNoResultsMessage;
    }

    @Override
    public void cancel(boolean interruptActiveRequests) {
        if (interruptActiveRequests) {
            mResultHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override
    public void doSearch(String query, SearchCallback<AdapterItem> callback) {
        mAppState.getModel().enqueueModelUpdateTask((taskController, dataModel, apps) ->  {
            ArrayList<AdapterItem> result = getTitleMatchResult(mAppState.getContext(), apps.data, query);
            if (mAddNoResultsMessage && result.isEmpty()) {
                result.add(getEmptyMessageAdapterItem(query));
            }
            mResultHandler.post(() -> callback.onSearchResult(query, result));
        });
    }

    private static AdapterItem getEmptyMessageAdapterItem(String query) {
        AdapterItem item = new AdapterItem(VIEW_TYPE_EMPTY_SEARCH);
        // Add a place holder info to propagate the query
        AppInfo placeHolder = new AppInfo();
        placeHolder.title = query;
        item.itemInfo = placeHolder;
        return item;
    }

    /**
     * Filters and ranks {@link AppInfo}s by fuzzy title match quality.
     * @see {@link #getTitleMatchResult} for pre-wrapped {@link AdapterItem} list.
     */
    @AnyThread
    public static Stream<AppInfo> getTitleMatchApps(Context context, List<AppInfo> apps, String query) {
        final String queryTextLower = query.trim().toLowerCase(Locale.ROOT);
        final FuzzyAppMatcher fuzzyMatcher = new FuzzyAppMatcher(query);
        final StringMatcherUtility.StringMatcher matcher = StringMatcherUtility.StringMatcher.getInstance();
        final UserManager userManager = context.getSystemService(UserManager.class);
        final UserCache userCache = UserCache.INSTANCE.get(context);

        return apps.stream()
                .filter(info -> !(userCache.getUserInfo(info.user).isPrivate() && userManager.isQuietModeEnabled(info.user)))
                .map(info -> {
                    String title = info.title.toString();
                    int score = fuzzyMatcher.score(title);
                    // Preserve locale-sensitive matches, including Korean initial consonants.
                    if ((score < 0 || score > 200)
                            && StringMatcherUtility.matches(queryTextLower, title, matcher)) {
                        score = 200;
                    }
                    return new AbstractMap.SimpleImmutableEntry<>(info, score);
                })
                .filter(entry -> entry.getValue() >= 0)
                // Stream sorting is stable: equally good matches retain the app list's order.
                .sorted(Comparator.comparingInt(entry -> entry.getValue()))
                .map(entry -> entry.getKey());
    }

    /**
     * {@link #getTitleMatchApps} wrapped as all-apps {@link AdapterItem}s.
     */
    @AnyThread
    public static ArrayList<AdapterItem> getTitleMatchResult(Context context, List<AppInfo> apps, String query) {
        return getTitleMatchApps(context, apps, query)
                .map(AdapterItem::asApp)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
