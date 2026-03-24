package android.provider;

@android.annotation.SystemApi
public abstract class SearchIndexableData {
    public android.content.Context context;
    public java.util.Locale locale;
    public boolean enabled;
    public int rank;
    public java.lang.String key;
    public int userId;
    public java.lang.String className;
    public java.lang.String packageName;
    public int iconResId;
    public java.lang.String intentAction;
    public java.lang.String intentTargetPackage;
    public java.lang.String intentTargetClass;
    public SearchIndexableData() {}
    public SearchIndexableData(android.content.Context p0) {}
    public java.lang.String toString() { return null; }
}
