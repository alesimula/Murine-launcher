package android.preference;

@java.lang.Deprecated
abstract class GenericInflater<T extends java.lang.Object, P extends android.preference.GenericInflater.Parent> {
    private final boolean DEBUG = false;
    protected final android.content.Context mContext = null;
    private boolean mFactorySet;
    private android.preference.GenericInflater.Factory<T> mFactory;
    private final java.lang.Object[] mConstructorArgs = null;
    private static final java.lang.Class[] mConstructorSignature = null;
    private static final java.util.HashMap sConstructorMap = null;
    private java.lang.String mDefaultPackage;
    protected GenericInflater(android.content.Context p0) {}
    protected GenericInflater(android.preference.GenericInflater<T, P> p0, android.content.Context p1) {}
    public abstract android.preference.GenericInflater cloneInContext(android.content.Context p0);
    public void setDefaultPackage(java.lang.String p0) {}
    public java.lang.String getDefaultPackage() { return null; }
    public android.content.Context getContext() { return null; }
    public final android.preference.GenericInflater.Factory<T> getFactory() { return null; }
    public void setFactory(android.preference.GenericInflater.Factory<T> p0) {}
    public T inflate(int p0, P p1) { return null; }
    public T inflate(org.xmlpull.v1.XmlPullParser p0, P p1) { return null; }
    public T inflate(int p0, P p1, boolean p2) { return null; }
    public T inflate(org.xmlpull.v1.XmlPullParser p0, P p1, boolean p2) { return null; }
    public final T createItem(java.lang.String p0, java.lang.String p1, android.util.AttributeSet p2) throws java.lang.ClassNotFoundException, android.view.InflateException { return null; }
    protected T onCreateItem(java.lang.String p0, android.util.AttributeSet p1) throws java.lang.ClassNotFoundException { return null; }
    private final T createItemFromTag(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, android.util.AttributeSet p2) { return null; }
    private void rInflate(org.xmlpull.v1.XmlPullParser p0, T p1, android.util.AttributeSet p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    protected boolean onCreateCustomFromTag(org.xmlpull.v1.XmlPullParser p0, T p1, android.util.AttributeSet p2) throws org.xmlpull.v1.XmlPullParserException { return false; }
    protected P onMergeRoots(P p0, boolean p1, P p2) { return null; }

    public static interface Factory<T extends java.lang.Object> {
        public T onCreateItem(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2);
    }

    private static class FactoryMerger<T extends java.lang.Object> implements android.preference.GenericInflater.Factory<T> {
        private final android.preference.GenericInflater.Factory<T> mF1 = null;
        private final android.preference.GenericInflater.Factory<T> mF2 = null;
        FactoryMerger(android.preference.GenericInflater.Factory<T> p0, android.preference.GenericInflater.Factory<T> p1) {}
        public T onCreateItem(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2) { return null; }
    }

    public static interface Parent<T extends java.lang.Object> {
        public void addItemFromInflater(T p0);
    }
}
