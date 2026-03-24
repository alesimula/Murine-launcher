package android.view;

public abstract class LayoutInflater {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String COMPILED_VIEW_DEX_FILE_NAME = "/compiled_view.dex";
    private static final java.lang.String USE_PRECOMPILED_LAYOUT = "view.precompiled_layout_enabled";
    private static final java.lang.StackTraceElement[] EMPTY_STACK_TRACE = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    protected final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private boolean mFactorySet;
    @android.annotation.UnsupportedAppUsage
    private android.view.LayoutInflater.Factory mFactory;
    @android.annotation.UnsupportedAppUsage
    private android.view.LayoutInflater.Factory2 mFactory2;
    @android.annotation.UnsupportedAppUsage
    private android.view.LayoutInflater.Factory2 mPrivateFactory;
    private android.view.LayoutInflater.Filter mFilter;
    private boolean mUseCompiledView;
    private java.lang.ClassLoader mPrecompiledClassLoader;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    final java.lang.Object[] mConstructorArgs = null;
    @android.annotation.UnsupportedAppUsage
    static final java.lang.Class<?>[] mConstructorSignature = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123769490L)
    private static final java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> sConstructorMap = null;
    private java.util.HashMap<java.lang.String, java.lang.Boolean> mFilterMap;
    private android.util.TypedValue mTempValue;
    private static final java.lang.String TAG_MERGE = "merge";
    private static final java.lang.String TAG_INCLUDE = "include";
    private static final java.lang.String TAG_1995 = "blink";
    private static final java.lang.String TAG_REQUEST_FOCUS = "requestFocus";
    private static final java.lang.String TAG_TAG = "tag";
    private static final java.lang.String ATTR_LAYOUT = "layout";
    @android.annotation.UnsupportedAppUsage
    private static final int[] ATTRS_THEME = null;
    private static final java.lang.ClassLoader BOOT_CLASS_LOADER = null;
    protected LayoutInflater(android.content.Context p0) {}
    protected LayoutInflater(android.view.LayoutInflater p0, android.content.Context p1) {}
    public static android.view.LayoutInflater from(android.content.Context p0) { return null; }
    public abstract android.view.LayoutInflater cloneInContext(android.content.Context p0);
    public android.content.Context getContext() { return null; }
    public final android.view.LayoutInflater.Factory getFactory() { return null; }
    public final android.view.LayoutInflater.Factory2 getFactory2() { return null; }
    public void setFactory(android.view.LayoutInflater.Factory p0) {}
    public void setFactory2(android.view.LayoutInflater.Factory2 p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setPrivateFactory(android.view.LayoutInflater.Factory2 p0) {}
    public android.view.LayoutInflater.Filter getFilter() { return null; }
    public void setFilter(android.view.LayoutInflater.Filter p0) {}
    private void initPrecompiledViews() {}
    private void initPrecompiledViews(boolean p0) {}
    public void setPrecompiledLayoutsEnabledForTesting(boolean p0) {}
    public android.view.View inflate(int p0, android.view.ViewGroup p1) { return null; }
    public android.view.View inflate(org.xmlpull.v1.XmlPullParser p0, android.view.ViewGroup p1) { return null; }
    public android.view.View inflate(int p0, android.view.ViewGroup p1, boolean p2) { return null; }
    private android.view.View tryInflatePrecompiled(int p0, android.content.res.Resources p1, android.view.ViewGroup p2, boolean p3) { return null; }
    private void advanceToRootNode(org.xmlpull.v1.XmlPullParser p0) throws android.view.InflateException, java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public android.view.View inflate(org.xmlpull.v1.XmlPullParser p0, android.view.ViewGroup p1, boolean p2) { return null; }
    private static java.lang.String getParserStateDescription(android.content.Context p0, android.util.AttributeSet p1) { return null; }
    private final boolean verifyClassLoader(java.lang.reflect.Constructor<? extends android.view.View> p0) { return false; }
    public final android.view.View createView(java.lang.String p0, java.lang.String p1, android.util.AttributeSet p2) throws java.lang.ClassNotFoundException, android.view.InflateException { return null; }
    public final android.view.View createView(android.content.Context p0, java.lang.String p1, java.lang.String p2, android.util.AttributeSet p3) throws java.lang.ClassNotFoundException, android.view.InflateException { return null; }
    private void failNotAllowed(java.lang.String p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) {}
    protected android.view.View onCreateView(java.lang.String p0, android.util.AttributeSet p1) throws java.lang.ClassNotFoundException { return null; }
    protected android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.util.AttributeSet p2) throws java.lang.ClassNotFoundException { return null; }
    public android.view.View onCreateView(android.content.Context p0, android.view.View p1, java.lang.String p2, android.util.AttributeSet p3) throws java.lang.ClassNotFoundException { return null; }
    @android.annotation.UnsupportedAppUsage
    private android.view.View createViewFromTag(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    @android.annotation.UnsupportedAppUsage
    android.view.View createViewFromTag(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3, boolean p4) { return null; }
    @android.annotation.UnsupportedAppUsage(trackingBug=122360734L)
    public final android.view.View tryCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    final void rInflateChildren(org.xmlpull.v1.XmlPullParser p0, android.view.View p1, android.util.AttributeSet p2, boolean p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    void rInflate(org.xmlpull.v1.XmlPullParser p0, android.view.View p1, android.content.Context p2, android.util.AttributeSet p3, boolean p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void parseViewTag(org.xmlpull.v1.XmlPullParser p0, android.view.View p1, android.util.AttributeSet p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    @android.annotation.UnsupportedAppUsage
    private void parseInclude(org.xmlpull.v1.XmlPullParser p0, android.content.Context p1, android.view.View p2, android.util.AttributeSet p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    static final void consumeChildElements(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    public static interface Filter {
        public boolean onLoadClass(java.lang.Class p0);
    }

    private static class FactoryMerger implements android.view.LayoutInflater.Factory2 {
        private final android.view.LayoutInflater.Factory mF1 = null;
        private final android.view.LayoutInflater.Factory mF2 = null;
        private final android.view.LayoutInflater.Factory2 mF12 = null;
        private final android.view.LayoutInflater.Factory2 mF22 = null;
        FactoryMerger(android.view.LayoutInflater.Factory p0, android.view.LayoutInflater.Factory2 p1, android.view.LayoutInflater.Factory p2, android.view.LayoutInflater.Factory2 p3) {}
        public android.view.View onCreateView(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2) { return null; }
        public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    }

    public static interface Factory2 extends android.view.LayoutInflater.Factory {
        public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3);
    }

    public static interface Factory {
        public android.view.View onCreateView(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2);
    }

    private static class BlinkLayout extends android.widget.FrameLayout {
        private static final int MESSAGE_BLINK = 66;
        private static final int BLINK_DELAY = 500;
        private boolean mBlink;
        private boolean mBlinkState;
        private final android.os.Handler mHandler = null;
        public BlinkLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        private void makeBlink() {}
        protected void onAttachedToWindow() {}
        protected void onDetachedFromWindow() {}
        protected void dispatchDraw(android.graphics.Canvas p0) {}
    }
}
