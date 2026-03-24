package android.webkit;

public class TracingConfig {
    private int mPredefinedCategories;
    private final java.util.List<java.lang.String> mCustomIncludedCategories = null;
    private int mTracingMode;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
    public static final int CATEGORIES_FRAME_VIEWER = 64;
    public static final int RECORD_UNTIL_FULL = 0;
    public static final int RECORD_CONTINUOUSLY = 1;
    public TracingConfig(int p0, java.util.List<java.lang.String> p1, int p2) {}
    public int getPredefinedCategories() { return 0; }
    public java.util.List<java.lang.String> getCustomIncludedCategories() { return null; }
    public int getTracingMode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TracingMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PredefinedCategories {
    }

    public static class Builder {
        private int mPredefinedCategories;
        private final java.util.List<java.lang.String> mCustomIncludedCategories = null;
        private int mTracingMode;
        public Builder() {}
        public android.webkit.TracingConfig build() { return null; }
        public android.webkit.TracingConfig.Builder addCategories(int... p0) { return null; }
        public android.webkit.TracingConfig.Builder addCategories(java.lang.String... p0) { return null; }
        public android.webkit.TracingConfig.Builder addCategories(java.util.Collection<java.lang.String> p0) { return null; }
        public android.webkit.TracingConfig.Builder setTracingMode(int p0) { return null; }
    }
}
