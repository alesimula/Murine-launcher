package android.app;

@java.lang.Deprecated
public class FragmentController {
    @android.annotation.UnsupportedAppUsage
    private final android.app.FragmentHostCallback<?> mHost = null;
    public static final android.app.FragmentController createController(android.app.FragmentHostCallback<?> p0) { return null; }
    private FragmentController(android.app.FragmentHostCallback<?> p0) {}
    public android.app.FragmentManager getFragmentManager() { return null; }
    public android.app.LoaderManager getLoaderManager() { return null; }
    public android.app.Fragment findFragmentByWho(java.lang.String p0) { return null; }
    public void attachHost(android.app.Fragment p0) {}
    public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    public void noteStateNotSaved() {}
    public android.os.Parcelable saveAllState() { return null; }
    @java.lang.Deprecated
    public void restoreAllState(android.os.Parcelable p0, java.util.List<android.app.Fragment> p1) {}
    public void restoreAllState(android.os.Parcelable p0, android.app.FragmentManagerNonConfig p1) {}
    @java.lang.Deprecated
    public java.util.List<android.app.Fragment> retainNonConfig() { return null; }
    public android.app.FragmentManagerNonConfig retainNestedNonConfig() { return null; }
    public void dispatchCreate() {}
    public void dispatchActivityCreated() {}
    public void dispatchStart() {}
    public void dispatchResume() {}
    public void dispatchPause() {}
    public void dispatchStop() {}
    public void dispatchDestroyView() {}
    public void dispatchDestroy() {}
    @java.lang.Deprecated
    public void dispatchMultiWindowModeChanged(boolean p0) {}
    public void dispatchMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    @java.lang.Deprecated
    public void dispatchPictureInPictureModeChanged(boolean p0) {}
    public void dispatchPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public void dispatchLowMemory() {}
    public void dispatchTrimMemory(int p0) {}
    public boolean dispatchCreateOptionsMenu(android.view.Menu p0, android.view.MenuInflater p1) { return false; }
    public boolean dispatchPrepareOptionsMenu(android.view.Menu p0) { return false; }
    public boolean dispatchOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public boolean dispatchContextItemSelected(android.view.MenuItem p0) { return false; }
    public void dispatchOptionsMenuClosed(android.view.Menu p0) {}
    public boolean execPendingActions() { return false; }
    public void doLoaderStart() {}
    public void doLoaderStop(boolean p0) {}
    public void doLoaderDestroy() {}
    public void reportLoaderStart() {}
    public android.util.ArrayMap<java.lang.String, android.app.LoaderManager> retainLoaderNonConfig() { return null; }
    public void restoreLoaderNonConfig(android.util.ArrayMap<java.lang.String, android.app.LoaderManager> p0) {}
    public void dumpLoaders(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
}
