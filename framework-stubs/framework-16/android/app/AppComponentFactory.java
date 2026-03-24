package android.app;

public class AppComponentFactory {
    public static final android.app.AppComponentFactory DEFAULT = null;
    public AppComponentFactory() {}
    @android.annotation.NonNull
    public java.lang.ClassLoader instantiateClassLoader(java.lang.ClassLoader p0, android.content.pm.ApplicationInfo p1) { return null; }
    @android.annotation.NonNull
    public android.app.Application instantiateApplication(java.lang.ClassLoader p0, java.lang.String p1) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { return null; }
    @android.annotation.NonNull
    public android.app.Activity instantiateActivity(java.lang.ClassLoader p0, java.lang.String p1, android.content.Intent p2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { return null; }
    @android.annotation.NonNull
    public android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader p0, java.lang.String p1, android.content.Intent p2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { return null; }
    @android.annotation.NonNull
    public android.app.Service instantiateService(java.lang.ClassLoader p0, java.lang.String p1, android.content.Intent p2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { return null; }
    @android.annotation.NonNull
    public android.content.ContentProvider instantiateProvider(java.lang.ClassLoader p0, java.lang.String p1) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException { return null; }
}
