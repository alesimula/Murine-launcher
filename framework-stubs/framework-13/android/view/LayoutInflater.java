package android.view;

public abstract class LayoutInflater {
    protected final android.content.Context mContext = null;
    final java.lang.Object[] mConstructorArgs = null;
    static final java.lang.Class<?>[] mConstructorSignature = null;
    protected LayoutInflater(android.content.Context p0) {}
    protected LayoutInflater(android.view.LayoutInflater p0, android.content.Context p1) {}
    public static android.view.LayoutInflater from(android.content.Context p0) { return null; }
    public abstract android.view.LayoutInflater cloneInContext(android.content.Context p0);
    public android.content.Context getContext() { return null; }
    public final android.view.LayoutInflater.Factory getFactory() { return null; }
    public final android.view.LayoutInflater.Factory2 getFactory2() { return null; }
    public void setFactory(android.view.LayoutInflater.Factory p0) {}
    public void setFactory2(android.view.LayoutInflater.Factory2 p0) {}
    public void setPrivateFactory(android.view.LayoutInflater.Factory2 p0) {}
    public android.view.LayoutInflater.Filter getFilter() { return null; }
    public void setFilter(android.view.LayoutInflater.Filter p0) {}
    public void setPrecompiledLayoutsEnabledForTesting(boolean p0) {}
    public android.view.View inflate(int p0, android.view.ViewGroup p1) { return null; }
    public android.view.View inflate(org.xmlpull.v1.XmlPullParser p0, android.view.ViewGroup p1) { return null; }
    public android.view.View inflate(int p0, android.view.ViewGroup p1, boolean p2) { return null; }
    public android.view.View inflate(org.xmlpull.v1.XmlPullParser p0, android.view.ViewGroup p1, boolean p2) { return null; }
    public final android.view.View createView(java.lang.String p0, java.lang.String p1, android.util.AttributeSet p2) throws java.lang.ClassNotFoundException, android.view.InflateException { return null; }
    public final android.view.View createView(android.content.Context p0, java.lang.String p1, java.lang.String p2, android.util.AttributeSet p3) throws java.lang.ClassNotFoundException, android.view.InflateException { return null; }
    protected android.view.View onCreateView(java.lang.String p0, android.util.AttributeSet p1) throws java.lang.ClassNotFoundException { return null; }
    protected android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.util.AttributeSet p2) throws java.lang.ClassNotFoundException { return null; }
    public android.view.View onCreateView(android.content.Context p0, android.view.View p1, java.lang.String p2, android.util.AttributeSet p3) throws java.lang.ClassNotFoundException { return null; }
    android.view.View createViewFromTag(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3, boolean p4) { return null; }
    public final android.view.View tryCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    final void rInflateChildren(org.xmlpull.v1.XmlPullParser p0, android.view.View p1, android.util.AttributeSet p2, boolean p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    void rInflate(org.xmlpull.v1.XmlPullParser p0, android.view.View p1, android.content.Context p2, android.util.AttributeSet p3, boolean p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    static final void consumeChildElements(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}

    private static class BlinkLayout extends android.widget.FrameLayout {
        public BlinkLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        protected void onAttachedToWindow() {}
        protected void onDetachedFromWindow() {}
        protected void dispatchDraw(android.graphics.Canvas p0) {}
    }

    public static interface Factory {
        public android.view.View onCreateView(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2);
    }

    public static interface Factory2 extends android.view.LayoutInflater.Factory {
        public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3);
    }

    private static class FactoryMerger implements android.view.LayoutInflater.Factory2 {
        FactoryMerger(android.view.LayoutInflater.Factory p0, android.view.LayoutInflater.Factory2 p1, android.view.LayoutInflater.Factory p2, android.view.LayoutInflater.Factory2 p3) {}
        public android.view.View onCreateView(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2) { return null; }
        public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    }

    public static interface Filter {
        public boolean onLoadClass(java.lang.Class p0);
    }
}
