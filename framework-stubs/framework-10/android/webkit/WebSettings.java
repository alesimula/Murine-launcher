package android.webkit;

public abstract class WebSettings {
    public static final int LOAD_DEFAULT = -1;
    @java.lang.Deprecated
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_NO_CACHE = 2;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int MIXED_CONTENT_ALWAYS_ALLOW = 0;
    public static final int MIXED_CONTENT_NEVER_ALLOW = 1;
    public static final int MIXED_CONTENT_COMPATIBILITY_MODE = 2;
    public static final int FORCE_DARK_OFF = 0;
    public static final int FORCE_DARK_AUTO = 1;
    public static final int FORCE_DARK_ON = 2;
    public static final int MENU_ITEM_NONE = 0;
    public static final int MENU_ITEM_SHARE = 1;
    public static final int MENU_ITEM_WEB_SEARCH = 2;
    public static final int MENU_ITEM_PROCESS_TEXT = 4;
    public WebSettings() {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract void setNavDump(boolean p0);
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract boolean getNavDump();
    public abstract void setSupportZoom(boolean p0);
    public abstract boolean supportZoom();
    public abstract void setMediaPlaybackRequiresUserGesture(boolean p0);
    public abstract boolean getMediaPlaybackRequiresUserGesture();
    public abstract void setBuiltInZoomControls(boolean p0);
    public abstract boolean getBuiltInZoomControls();
    public abstract void setDisplayZoomControls(boolean p0);
    public abstract boolean getDisplayZoomControls();
    public abstract void setAllowFileAccess(boolean p0);
    public abstract boolean getAllowFileAccess();
    public abstract void setAllowContentAccess(boolean p0);
    public abstract boolean getAllowContentAccess();
    public abstract void setLoadWithOverviewMode(boolean p0);
    public abstract boolean getLoadWithOverviewMode();
    @java.lang.Deprecated
    public abstract void setEnableSmoothTransition(boolean p0);
    @java.lang.Deprecated
    public abstract boolean enableSmoothTransition();
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract void setUseWebViewBackgroundForOverscrollBackground(boolean p0);
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract boolean getUseWebViewBackgroundForOverscrollBackground();
    @java.lang.Deprecated
    public abstract void setSaveFormData(boolean p0);
    @java.lang.Deprecated
    public abstract boolean getSaveFormData();
    @java.lang.Deprecated
    public abstract void setSavePassword(boolean p0);
    @java.lang.Deprecated
    public abstract boolean getSavePassword();
    public abstract void setTextZoom(int p0);
    public abstract int getTextZoom();
    @android.annotation.SystemApi
    public abstract void setAcceptThirdPartyCookies(boolean p0);
    @android.annotation.SystemApi
    public abstract boolean getAcceptThirdPartyCookies();
    @java.lang.Deprecated
    public synchronized void setTextSize(android.webkit.WebSettings.TextSize p0) {}
    @java.lang.Deprecated
    public synchronized android.webkit.WebSettings.TextSize getTextSize() { return null; }
    @java.lang.Deprecated
    public abstract void setDefaultZoom(android.webkit.WebSettings.ZoomDensity p0);
    @java.lang.Deprecated
    public abstract android.webkit.WebSettings.ZoomDensity getDefaultZoom();
    @java.lang.Deprecated
    public abstract void setLightTouchEnabled(boolean p0);
    @java.lang.Deprecated
    public abstract boolean getLightTouchEnabled();
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void setUseDoubleTree(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public boolean getUseDoubleTree() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract void setUserAgent(int p0);
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract int getUserAgent();
    public abstract void setUseWideViewPort(boolean p0);
    public abstract boolean getUseWideViewPort();
    public abstract void setSupportMultipleWindows(boolean p0);
    public abstract boolean supportMultipleWindows();
    public abstract void setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm p0);
    public abstract android.webkit.WebSettings.LayoutAlgorithm getLayoutAlgorithm();
    public abstract void setStandardFontFamily(java.lang.String p0);
    public abstract java.lang.String getStandardFontFamily();
    public abstract void setFixedFontFamily(java.lang.String p0);
    public abstract java.lang.String getFixedFontFamily();
    public abstract void setSansSerifFontFamily(java.lang.String p0);
    public abstract java.lang.String getSansSerifFontFamily();
    public abstract void setSerifFontFamily(java.lang.String p0);
    public abstract java.lang.String getSerifFontFamily();
    public abstract void setCursiveFontFamily(java.lang.String p0);
    public abstract java.lang.String getCursiveFontFamily();
    public abstract void setFantasyFontFamily(java.lang.String p0);
    public abstract java.lang.String getFantasyFontFamily();
    public abstract void setMinimumFontSize(int p0);
    public abstract int getMinimumFontSize();
    public abstract void setMinimumLogicalFontSize(int p0);
    public abstract int getMinimumLogicalFontSize();
    public abstract void setDefaultFontSize(int p0);
    public abstract int getDefaultFontSize();
    public abstract void setDefaultFixedFontSize(int p0);
    public abstract int getDefaultFixedFontSize();
    public abstract void setLoadsImagesAutomatically(boolean p0);
    public abstract boolean getLoadsImagesAutomatically();
    public abstract void setBlockNetworkImage(boolean p0);
    public abstract boolean getBlockNetworkImage();
    public abstract void setBlockNetworkLoads(boolean p0);
    public abstract boolean getBlockNetworkLoads();
    public abstract void setJavaScriptEnabled(boolean p0);
    public abstract void setAllowUniversalAccessFromFileURLs(boolean p0);
    public abstract void setAllowFileAccessFromFileURLs(boolean p0);
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract void setPluginsEnabled(boolean p0);
    @java.lang.Deprecated
    public abstract void setPluginState(android.webkit.WebSettings.PluginState p0);
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void setPluginsPath(java.lang.String p0) {}
    @java.lang.Deprecated
    public abstract void setDatabasePath(java.lang.String p0);
    @java.lang.Deprecated
    public abstract void setGeolocationDatabasePath(java.lang.String p0);
    public abstract void setAppCacheEnabled(boolean p0);
    public abstract void setAppCachePath(java.lang.String p0);
    @java.lang.Deprecated
    public abstract void setAppCacheMaxSize(long p0);
    public abstract void setDatabaseEnabled(boolean p0);
    public abstract void setDomStorageEnabled(boolean p0);
    public abstract boolean getDomStorageEnabled();
    @java.lang.Deprecated
    public abstract java.lang.String getDatabasePath();
    public abstract boolean getDatabaseEnabled();
    public abstract void setGeolocationEnabled(boolean p0);
    public abstract boolean getJavaScriptEnabled();
    public abstract boolean getAllowUniversalAccessFromFileURLs();
    public abstract boolean getAllowFileAccessFromFileURLs();
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract boolean getPluginsEnabled();
    @java.lang.Deprecated
    public abstract android.webkit.WebSettings.PluginState getPluginState();
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getPluginsPath() { return null; }
    public abstract void setJavaScriptCanOpenWindowsAutomatically(boolean p0);
    public abstract boolean getJavaScriptCanOpenWindowsAutomatically();
    public abstract void setDefaultTextEncodingName(java.lang.String p0);
    public abstract java.lang.String getDefaultTextEncodingName();
    public abstract void setUserAgentString(java.lang.String p0);
    public abstract java.lang.String getUserAgentString();
    public static java.lang.String getDefaultUserAgent(android.content.Context p0) { return null; }
    public abstract void setNeedInitialFocus(boolean p0);
    @java.lang.Deprecated
    public abstract void setRenderPriority(android.webkit.WebSettings.RenderPriority p0);
    public abstract void setCacheMode(int p0);
    public abstract int getCacheMode();
    public abstract void setMixedContentMode(int p0);
    public abstract int getMixedContentMode();
    @android.annotation.SystemApi
    public abstract void setVideoOverlayForEmbeddedEncryptedVideoEnabled(boolean p0);
    @android.annotation.SystemApi
    public abstract boolean getVideoOverlayForEmbeddedEncryptedVideoEnabled();
    public abstract void setOffscreenPreRaster(boolean p0);
    public abstract boolean getOffscreenPreRaster();
    public abstract void setSafeBrowsingEnabled(boolean p0);
    public abstract boolean getSafeBrowsingEnabled();
    public void setForceDark(int p0) {}
    public int getForceDark() { return 0; }
    public abstract void setDisabledActionModeMenuItems(int p0);
    public abstract int getDisabledActionModeMenuItems();

    public static enum ZoomDensity {
        FAR,
        MEDIUM,
        CLOSE;
        int value;
        private ZoomDensity() {}
        public int getValue() { return 0; }
    }

    @java.lang.Deprecated
    public static enum TextSize {
        SMALLEST,
        SMALLER,
        NORMAL,
        LARGER,
        LARGEST;
        @android.annotation.UnsupportedAppUsage
        int value;
        private TextSize() {}
    }

    public static enum RenderPriority {
        NORMAL,
        HIGH,
        LOW;
        private RenderPriority() {}
    }

    public static enum PluginState {
        ON,
        ON_DEMAND,
        OFF;
        private PluginState() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    private static @interface MenuItemFlags {
    }

    public static enum LayoutAlgorithm {
        NORMAL,
        SINGLE_COLUMN,
        NARROW_COLUMNS,
        TEXT_AUTOSIZING;
        private LayoutAlgorithm() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForceDark {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CacheMode {
    }
}
