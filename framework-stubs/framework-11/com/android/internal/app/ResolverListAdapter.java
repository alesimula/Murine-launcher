package com.android.internal.app;

public class ResolverListAdapter extends android.widget.BaseAdapter {
    private static final java.lang.String TAG = "ResolverListAdapter";
    private final java.util.List<android.content.Intent> mIntents = null;
    private final android.content.Intent[] mInitialIntents = null;
    private final java.util.List<android.content.pm.ResolveInfo> mBaseResolveList = null;
    private final android.content.pm.PackageManager mPm = null;
    protected final android.content.Context mContext = null;
    private static android.graphics.ColorMatrixColorFilter sSuspendedMatrixColorFilter;
    private final int mIconDpi = 0;
    protected android.content.pm.ResolveInfo mLastChosen;
    private com.android.internal.app.chooser.DisplayResolveInfo mOtherProfile;
    com.android.internal.app.ResolverListController mResolverListController;
    private int mPlaceholderCount;
    protected final android.view.LayoutInflater mInflater = null;
    java.util.List<com.android.internal.app.chooser.DisplayResolveInfo> mDisplayList;
    private java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> mUnfilteredResolveList;
    private int mLastChosenPosition;
    private boolean mFilterLastUsed;
    final com.android.internal.app.ResolverListAdapter.ResolverListCommunicator mResolverListCommunicator = null;
    private java.lang.Runnable mPostListReadyRunnable;
    private final boolean mIsAudioCaptureDevice = false;
    private boolean mIsTabLoaded;
    public ResolverListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, com.android.internal.app.ResolverListController p5, com.android.internal.app.ResolverListAdapter.ResolverListCommunicator p6, boolean p7) { super(); }
    public void handlePackagesChanged() {}
    public void setPlaceholderCount(int p0) {}
    public int getPlaceholderCount() { return 0; }
    public com.android.internal.app.chooser.DisplayResolveInfo getFilteredItem() { return null; }
    public com.android.internal.app.chooser.DisplayResolveInfo getOtherProfile() { return null; }
    public int getFilteredPosition() { return 0; }
    public boolean hasFilteredItem() { return false; }
    public float getScore(com.android.internal.app.chooser.DisplayResolveInfo p0) { return 0.0f; }
    public float getScore(android.content.ComponentName p0) { return 0.0f; }
    public java.util.List<android.content.ComponentName> getTopComponentNames(int p0) { return null; }
    public void updateModel(android.content.ComponentName p0) {}
    public void updateChooserCounts(java.lang.String p0, java.lang.String p1) {}
    java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> getUnfilteredResolveList() { return null; }
    protected boolean rebuildList(boolean p0) { return false; }
    android.os.AsyncTask<java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo>, java.lang.Void, java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo>> createSortingTask(boolean p0) { return null; }
    protected void processSortedList(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0, boolean p1) {}
    void postListReadyRunnable(boolean p0, boolean p1) {}
    private void addResolveInfoWithAlternates(com.android.internal.app.ResolverActivity.ResolvedComponentInfo p0) {}
    private void updateLastChosenPosition(android.content.pm.ResolveInfo p0) {}
    private void addResolveInfo(com.android.internal.app.chooser.DisplayResolveInfo p0) {}
    protected boolean shouldAddResolveInfo(com.android.internal.app.chooser.DisplayResolveInfo p0) { return false; }
    public android.content.pm.ResolveInfo resolveInfoForPosition(int p0, boolean p1) { return null; }
    public com.android.internal.app.chooser.TargetInfo targetInfoForPosition(int p0, boolean p1) { return null; }
    public int getCount() { return 0; }
    public int getUnfilteredCount() { return 0; }
    public com.android.internal.app.chooser.TargetInfo getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public int getDisplayResolveInfoCount() { return 0; }
    public com.android.internal.app.chooser.DisplayResolveInfo getDisplayResolveInfo(int p0) { return null; }
    public final android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public final android.view.View createView(android.view.ViewGroup p0) { return null; }
    android.view.View onCreateView(android.view.ViewGroup p0) { return null; }
    public final void bindView(int p0, android.view.View p1) {}
    protected void onBindView(android.view.View p0, com.android.internal.app.chooser.TargetInfo p1, int p2) {}
    protected com.android.internal.app.ResolverListAdapter.LoadLabelTask getLoadLabelTask(com.android.internal.app.chooser.DisplayResolveInfo p0, com.android.internal.app.ResolverListAdapter.ViewHolder p1) { return null; }
    public void onDestroy() {}
    private static android.graphics.ColorMatrixColorFilter getSuspendedColorMatrix() { return null; }
    com.android.internal.app.ResolverListAdapter.ActivityInfoPresentationGetter makePresentationGetter(android.content.pm.ActivityInfo p0) { return null; }
    com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter makePresentationGetter(android.content.pm.ResolveInfo p0) { return null; }
    android.graphics.drawable.Drawable loadIconForResolveInfo(android.content.pm.ResolveInfo p0) { return null; }
    void loadFilteredItemIconTaskAsync(android.widget.ImageView p0) {}
    public android.os.UserHandle getUserHandle() { return null; }
    protected java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> getResolversForUser(android.os.UserHandle p0) { return null; }
    protected java.util.List<android.content.Intent> getIntents() { return null; }
    protected boolean isTabLoaded() { return false; }
    protected void markTabLoaded() {}
    protected boolean alwaysShowSubLabel() { return false; }

    public static class ActivityInfoPresentationGetter extends com.android.internal.app.ResolverListAdapter.TargetPresentationGetter {
        private final android.content.pm.ActivityInfo mActivityInfo = null;
        public ActivityInfoPresentationGetter(android.content.Context p0, int p1, android.content.pm.ActivityInfo p2) { super(null, 0, null); }
        android.graphics.drawable.Drawable getIconSubstituteInternal() { return null; }
        java.lang.String getAppSubLabelInternal() { return null; }
    }

    class LoadIconTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.graphics.drawable.Drawable> {
        protected final com.android.internal.app.chooser.DisplayResolveInfo mDisplayResolveInfo = null;
        private final android.content.pm.ResolveInfo mResolveInfo = null;
        private com.android.internal.app.ResolverListAdapter.ViewHolder mHolder;
        LoadIconTask(com.android.internal.app.ResolverListAdapter p0, com.android.internal.app.chooser.DisplayResolveInfo p1, com.android.internal.app.ResolverListAdapter.ViewHolder p2) { super(); }
        protected android.graphics.drawable.Drawable doInBackground(java.lang.Void... p0) { return null; }
        protected void onPostExecute(android.graphics.drawable.Drawable p0) {}
        public void setViewHolder(com.android.internal.app.ResolverListAdapter.ViewHolder p0) {}
    }

    protected class LoadLabelTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.CharSequence[]> {
        private final com.android.internal.app.chooser.DisplayResolveInfo mDisplayResolveInfo = null;
        private final com.android.internal.app.ResolverListAdapter.ViewHolder mHolder = null;
        protected LoadLabelTask(com.android.internal.app.ResolverListAdapter p0, com.android.internal.app.chooser.DisplayResolveInfo p1, com.android.internal.app.ResolverListAdapter.ViewHolder p2) { super(); }
        protected java.lang.CharSequence[] doInBackground(java.lang.Void... p0) { return null; }
        protected void onPostExecute(java.lang.CharSequence[] p0) {}
    }

    public static class ResolveInfoPresentationGetter extends com.android.internal.app.ResolverListAdapter.ActivityInfoPresentationGetter {
        private final android.content.pm.ResolveInfo mRi = null;
        public ResolveInfoPresentationGetter(android.content.Context p0, int p1, android.content.pm.ResolveInfo p2) { super(null, 0, null); }
        android.graphics.drawable.Drawable getIconSubstituteInternal() { return null; }
        java.lang.String getAppSubLabelInternal() { return null; }
    }

    static interface ResolverListCommunicator {
        public boolean resolveInfoMatch(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1);
        public android.content.Intent getReplacementIntent(android.content.pm.ActivityInfo p0, android.content.Intent p1);
        public void onPostListReady(com.android.internal.app.ResolverListAdapter p0, boolean p1, boolean p2);
        public void sendVoiceChoicesIfNeeded();
        public void updateProfileViewButton();
        public boolean useLayoutWithDefault();
        public boolean shouldGetActivityMetadata();
        public android.content.Intent getTargetIntent();
        public void onHandlePackagesChanged(com.android.internal.app.ResolverListAdapter p0);
    }

    private static abstract class TargetPresentationGetter {
        private android.content.Context mCtx;
        private final int mIconDpi = 0;
        private final boolean mHasSubstitutePermission = false;
        private final android.content.pm.ApplicationInfo mAi = null;
        protected android.content.pm.PackageManager mPm;
        abstract android.graphics.drawable.Drawable getIconSubstituteInternal();
        abstract java.lang.String getAppSubLabelInternal();
        TargetPresentationGetter(android.content.Context p0, int p1, android.content.pm.ApplicationInfo p2) {}
        public android.graphics.drawable.Drawable getIcon(android.os.UserHandle p0) { return null; }
        public android.graphics.Bitmap getIconBitmap(android.os.UserHandle p0) { return null; }
        public java.lang.String getLabel() { return null; }
        public java.lang.String getSubLabel() { return null; }
        protected java.lang.String loadLabelFromResource(android.content.res.Resources p0, int p1) { return null; }
        protected android.graphics.drawable.Drawable loadIconFromResource(android.content.res.Resources p0, int p1) { return null; }
    }

    static class ViewHolder {
        public android.view.View itemView;
        public android.graphics.drawable.Drawable defaultItemViewBackground;
        public android.widget.TextView text;
        public android.widget.TextView text2;
        public android.widget.ImageView icon;
        ViewHolder(android.view.View p0) {}
        public void bindLabel(java.lang.CharSequence p0, java.lang.CharSequence p1, boolean p2) {}
        public void updateContentDescription(java.lang.String p0) {}
        public void bindIcon(com.android.internal.app.chooser.TargetInfo p0) {}
    }
}
