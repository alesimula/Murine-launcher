package android.app;

@java.lang.Deprecated
public abstract class FragmentHostCallback<E extends java.lang.Object> extends android.app.FragmentContainer {
    private final android.app.Activity mActivity = null;
    final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    final int mWindowAnimations = 0;
    final android.app.FragmentManagerImpl mFragmentManager = null;
    private android.util.ArrayMap<java.lang.String, android.app.LoaderManager> mAllLoaderManagers;
    private boolean mRetainLoaders;
    private android.app.LoaderManagerImpl mLoaderManager;
    private boolean mCheckedForLoaderManager;
    @android.annotation.UnsupportedAppUsage
    private boolean mLoadersStarted;
    public FragmentHostCallback(android.content.Context p0, android.os.Handler p1, int p2) { super(); }
    FragmentHostCallback(android.app.Activity p0) { super(); }
    FragmentHostCallback(android.app.Activity p0, android.content.Context p1, android.os.Handler p2, int p3) { super(); }
    private static android.os.Handler chooseHandler(android.content.Context p0, android.os.Handler p1) { return null; }
    public void onDump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public boolean onShouldSaveFragmentState(android.app.Fragment p0) { return false; }
    public android.view.LayoutInflater onGetLayoutInflater() { return null; }
    public boolean onUseFragmentManagerInflaterFactory() { return false; }
    public abstract E onGetHost();
    public void onInvalidateOptionsMenu() {}
    public void onStartActivityFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
    public void onStartActivityAsUserFromFragment(android.app.Fragment p0, android.content.Intent p1, int p2, android.os.Bundle p3, android.os.UserHandle p4) {}
    public void onStartIntentSenderFromFragment(android.app.Fragment p0, android.content.IntentSender p1, int p2, android.content.Intent p3, int p4, int p5, int p6, android.os.Bundle p7) throws android.content.IntentSender.SendIntentException {}
    public void onRequestPermissionsFromFragment(android.app.Fragment p0, java.lang.String[] p1, int p2) {}
    public boolean onHasWindowAnimations() { return false; }
    public int onGetWindowAnimations() { return 0; }
    public void onAttachFragment(android.app.Fragment p0) {}
    public <T extends android.view.View> T onFindViewById(int p0) { return null; }
    public boolean onHasView() { return false; }
    boolean getRetainLoaders() { return false; }
    android.app.Activity getActivity() { return null; }
    android.content.Context getContext() { return null; }
    android.os.Handler getHandler() { return null; }
    android.app.FragmentManagerImpl getFragmentManagerImpl() { return null; }
    android.app.LoaderManagerImpl getLoaderManagerImpl() { return null; }
    void inactivateFragment(java.lang.String p0) {}
    void doLoaderStart() {}
    void doLoaderStop(boolean p0) {}
    void doLoaderRetain() {}
    void doLoaderDestroy() {}
    void reportLoaderStart() {}
    android.app.LoaderManagerImpl getLoaderManager(java.lang.String p0, boolean p1, boolean p2) { return null; }
    android.util.ArrayMap<java.lang.String, android.app.LoaderManager> retainLoaderNonConfig() { return null; }
    void restoreLoaderNonConfig(android.util.ArrayMap<java.lang.String, android.app.LoaderManager> p0) {}
    void dumpLoaders(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
}
