package android.widget;

public class RemoteViews implements android.os.Parcelable, android.view.LayoutInflater.Filter {
    private static final java.lang.String LOG_TAG = "RemoteViews";
    static final java.lang.String EXTRA_REMOTEADAPTER_APPWIDGET_ID = "remoteAdapterAppWidgetId";
    static final java.lang.String EXTRA_REMOTEADAPTER_ON_LIGHT_BACKGROUND = "remoteAdapterOnLightBackground";
    public static final java.lang.String EXTRA_SHARED_ELEMENT_BOUNDS = "android.widget.extra.SHARED_ELEMENT_BOUNDS";
    private static final int MAX_NESTED_VIEWS = 10;
    private static final int SET_ON_CLICK_RESPONSE_TAG = 1;
    private static final int REFLECTION_ACTION_TAG = 2;
    private static final int SET_DRAWABLE_TINT_TAG = 3;
    private static final int VIEW_GROUP_ACTION_ADD_TAG = 4;
    private static final int VIEW_CONTENT_NAVIGATION_TAG = 5;
    private static final int SET_EMPTY_VIEW_ACTION_TAG = 6;
    private static final int VIEW_GROUP_ACTION_REMOVE_TAG = 7;
    private static final int SET_PENDING_INTENT_TEMPLATE_TAG = 8;
    private static final int SET_REMOTE_VIEW_ADAPTER_INTENT_TAG = 10;
    private static final int TEXT_VIEW_DRAWABLE_ACTION_TAG = 11;
    private static final int BITMAP_REFLECTION_ACTION_TAG = 12;
    private static final int TEXT_VIEW_SIZE_ACTION_TAG = 13;
    private static final int VIEW_PADDING_ACTION_TAG = 14;
    private static final int SET_REMOTE_VIEW_ADAPTER_LIST_TAG = 15;
    private static final int SET_REMOTE_INPUTS_ACTION_TAG = 18;
    private static final int LAYOUT_PARAM_ACTION_TAG = 19;
    private static final int OVERRIDE_TEXT_COLORS_TAG = 20;
    private static final int SET_RIPPLE_DRAWABLE_COLOR_TAG = 21;
    private static final int SET_INT_TAG_TAG = 22;
    public static final int FLAG_REAPPLY_DISALLOWED = 1;
    public static final int FLAG_WIDGET_IS_COLLECTION_CHILD = 2;
    public static final int FLAG_USE_LIGHT_BACKGROUND_LAYOUT = 4;
    private static final android.view.LayoutInflater.Filter INFLATER_FILTER = null;
    public android.content.pm.ApplicationInfo mApplication;
    private final int mLayoutId = 0;
    private int mLightBackgroundLayoutId;
    private java.util.ArrayList<android.widget.RemoteViews.Action> mActions;
    private android.widget.RemoteViews.BitmapCache mBitmapCache;
    private boolean mIsRoot;
    private static final int MODE_NORMAL = 0;
    private static final int MODE_HAS_LANDSCAPE_AND_PORTRAIT = 1;
    private android.widget.RemoteViews mLandscape;
    private android.widget.RemoteViews mPortrait;
    private int mApplyFlags;
    private final java.util.Map<java.lang.Class, java.lang.Object> mClassCookies = null;
    private static final android.widget.RemoteViews.OnClickHandler DEFAULT_ON_CLICK_HANDLER = null;
    private static final android.util.ArrayMap<android.widget.RemoteViews.MethodKey, android.widget.RemoteViews.MethodArgs> sMethods = null;
    private static final android.widget.RemoteViews.MethodKey sLookupKey = null;
    private static final android.widget.RemoteViews.Action ACTION_NOOP = null;
    public static final android.os.Parcelable.Creator<android.widget.RemoteViews> CREATOR = null;
    public void setRemoteInputs(int p0, android.app.RemoteInput[] p1) {}
    public void reduceImageSizes(int p0, int p1) {}
    public void overrideTextColors(int p0) {}
    public void setIntTag(int p0, int p1, int p2) {}
    public void addFlags(int p0) {}
    public boolean hasFlags(int p0) { return false; }
    public void mergeRemoteViews(android.widget.RemoteViews p0) {}
    public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    private static void visitIconUri(android.graphics.drawable.Icon p0, java.util.function.Consumer<android.net.Uri> p1) {}
    public static android.graphics.Rect getSourceBounds(android.view.View p0) { return null; }
    private java.lang.invoke.MethodHandle getMethod(android.view.View p0, java.lang.String p1, java.lang.Class<?> p2, boolean p3) { return null; }
    private static java.lang.String getParameters(java.lang.Class<?> p0) { return null; }
    private void configureRemoteViewsAsChild(android.widget.RemoteViews p0) {}
    void setNotRoot() {}
    public RemoteViews(java.lang.String p0, int p1) {}
    public RemoteViews(java.lang.String p0, int p1, int p2) {}
    protected RemoteViews(android.content.pm.ApplicationInfo p0, int p1) {}
    private boolean hasLandscapeAndPortraitLayouts() { return false; }
    public RemoteViews(android.widget.RemoteViews p0, android.widget.RemoteViews p1) {}
    public RemoteViews(android.widget.RemoteViews p0) {}
    public RemoteViews(android.os.Parcel p0) {}
    private RemoteViews(android.os.Parcel p0, android.widget.RemoteViews.BitmapCache p1, android.content.pm.ApplicationInfo p2, int p3, java.util.Map<java.lang.Class, java.lang.Object> p4) {}
    private void readActionsFromParcel(android.os.Parcel p0, int p1) {}
    private android.widget.RemoteViews.Action getActionFromParcel(android.os.Parcel p0, int p1) { return null; }
    @java.lang.Deprecated
    public android.widget.RemoteViews clone() { return null; }
    public java.lang.String getPackage() { return null; }
    public int getLayoutId() { return 0; }
    private void setBitmapCache(android.widget.RemoteViews.BitmapCache p0) {}
    public int estimateMemoryUsage() { return 0; }
    private void addAction(android.widget.RemoteViews.Action p0) {}
    public void addView(int p0, android.widget.RemoteViews p1) {}
    public void addView(int p0, android.widget.RemoteViews p1, int p2) {}
    public void removeAllViews(int p0) {}
    public void removeAllViewsExceptId(int p0, int p1) {}
    public void showNext(int p0) {}
    public void showPrevious(int p0) {}
    public void setDisplayedChild(int p0, int p1) {}
    public void setViewVisibility(int p0, int p1) {}
    public void setTextViewText(int p0, java.lang.CharSequence p1) {}
    public void setTextViewTextSize(int p0, int p1, float p2) {}
    public void setTextViewCompoundDrawables(int p0, int p1, int p2, int p3, int p4) {}
    public void setTextViewCompoundDrawablesRelative(int p0, int p1, int p2, int p3, int p4) {}
    public void setTextViewCompoundDrawables(int p0, android.graphics.drawable.Icon p1, android.graphics.drawable.Icon p2, android.graphics.drawable.Icon p3, android.graphics.drawable.Icon p4) {}
    public void setTextViewCompoundDrawablesRelative(int p0, android.graphics.drawable.Icon p1, android.graphics.drawable.Icon p2, android.graphics.drawable.Icon p3, android.graphics.drawable.Icon p4) {}
    public void setImageViewResource(int p0, int p1) {}
    public void setImageViewUri(int p0, android.net.Uri p1) {}
    public void setImageViewBitmap(int p0, android.graphics.Bitmap p1) {}
    public void setImageViewIcon(int p0, android.graphics.drawable.Icon p1) {}
    public void setEmptyView(int p0, int p1) {}
    public void setChronometer(int p0, long p1, java.lang.String p2, boolean p3) {}
    public void setChronometerCountDown(int p0, boolean p1) {}
    public void setProgressBar(int p0, int p1, int p2, boolean p3) {}
    public void setOnClickPendingIntent(int p0, android.app.PendingIntent p1) {}
    public void setOnClickResponse(int p0, android.widget.RemoteViews.RemoteResponse p1) {}
    public void setPendingIntentTemplate(int p0, android.app.PendingIntent p1) {}
    public void setOnClickFillInIntent(int p0, android.content.Intent p1) {}
    public void setDrawableTint(int p0, boolean p1, int p2, android.graphics.PorterDuff.Mode p3) {}
    public void setRippleDrawableColor(int p0, android.content.res.ColorStateList p1) {}
    public void setProgressTintList(int p0, android.content.res.ColorStateList p1) {}
    public void setProgressBackgroundTintList(int p0, android.content.res.ColorStateList p1) {}
    public void setProgressIndeterminateTintList(int p0, android.content.res.ColorStateList p1) {}
    public void setTextColor(int p0, int p1) {}
    public void setTextColor(int p0, android.content.res.ColorStateList p1) {}
    @java.lang.Deprecated
    public void setRemoteAdapter(int p0, int p1, android.content.Intent p2) {}
    public void setRemoteAdapter(int p0, android.content.Intent p1) {}
    @java.lang.Deprecated
    public void setRemoteAdapter(int p0, java.util.ArrayList<android.widget.RemoteViews> p1, int p2) {}
    public void setScrollPosition(int p0, int p1) {}
    public void setRelativeScrollPosition(int p0, int p1) {}
    public void setViewPadding(int p0, int p1, int p2, int p3, int p4) {}
    public void setViewLayoutMarginEndDimen(int p0, int p1) {}
    public void setViewLayoutMarginEnd(int p0, int p1) {}
    public void setViewLayoutMarginBottomDimen(int p0, int p1) {}
    public void setViewLayoutWidth(int p0, int p1) {}
    public void setBoolean(int p0, java.lang.String p1, boolean p2) {}
    public void setByte(int p0, java.lang.String p1, byte p2) {}
    public void setShort(int p0, java.lang.String p1, short p2) {}
    public void setInt(int p0, java.lang.String p1, int p2) {}
    public void setColorStateList(int p0, java.lang.String p1, android.content.res.ColorStateList p2) {}
    public void setLong(int p0, java.lang.String p1, long p2) {}
    public void setFloat(int p0, java.lang.String p1, float p2) {}
    public void setDouble(int p0, java.lang.String p1, double p2) {}
    public void setChar(int p0, java.lang.String p1, char p2) {}
    public void setString(int p0, java.lang.String p1, java.lang.String p2) {}
    public void setCharSequence(int p0, java.lang.String p1, java.lang.CharSequence p2) {}
    public void setUri(int p0, java.lang.String p1, android.net.Uri p2) {}
    public void setBitmap(int p0, java.lang.String p1, android.graphics.Bitmap p2) {}
    public void setBundle(int p0, java.lang.String p1, android.os.Bundle p2) {}
    public void setIntent(int p0, java.lang.String p1, android.content.Intent p2) {}
    public void setIcon(int p0, java.lang.String p1, android.graphics.drawable.Icon p2) {}
    public void setContentDescription(int p0, java.lang.CharSequence p1) {}
    public void setAccessibilityTraversalBefore(int p0, int p1) {}
    public void setAccessibilityTraversalAfter(int p0, int p1) {}
    public void setLabelFor(int p0, int p1) {}
    public void setLightBackgroundLayoutId(int p0) {}
    public android.widget.RemoteViews getDarkTextViews() { return null; }
    private android.widget.RemoteViews getRemoteViewsToApply(android.content.Context p0) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) { return null; }
    public android.view.View applyWithTheme(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2, int p3) { return null; }
    private android.view.View inflateView(android.content.Context p0, android.widget.RemoteViews p1, android.view.ViewGroup p2) { return null; }
    private android.view.View inflateView(android.content.Context p0, android.widget.RemoteViews p1, android.view.ViewGroup p2, int p3) { return null; }
    protected boolean shouldUseStaticFilter() { return false; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3) { return null; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.OnClickHandler p4) { return null; }
    private android.widget.RemoteViews.AsyncApplyTask getAsyncApplyTask(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnViewAppliedListener p2, android.widget.RemoteViews.OnClickHandler p3) { return null; }
    public void reapply(android.content.Context p0, android.view.View p1) {}
    public void reapply(android.content.Context p0, android.view.View p1, android.widget.RemoteViews.OnClickHandler p2) {}
    public android.os.CancellationSignal reapplyAsync(android.content.Context p0, android.view.View p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3) { return null; }
    public android.os.CancellationSignal reapplyAsync(android.content.Context p0, android.view.View p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.OnClickHandler p4) { return null; }
    private void performApply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
    public boolean prefersAsyncApply() { return false; }
    private android.content.Context getContextForResources(android.content.Context p0) { return null; }
    public int getSequenceNumber() { return 0; }
    @java.lang.Deprecated
    public boolean onLoadClass(java.lang.Class p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void writeActionsToParcel(android.os.Parcel p0) {}
    private static android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1) { return null; }
    public boolean hasSameAppInfo(android.content.pm.ApplicationInfo p0) { return false; }
    public static boolean startPendingIntent(android.view.View p0, android.app.PendingIntent p1, android.util.Pair<android.content.Intent, android.app.ActivityOptions> p2) { return false; }

    private static abstract class Action implements android.os.Parcelable {
        public static final int MERGE_REPLACE = 0;
        public static final int MERGE_APPEND = 1;
        public static final int MERGE_IGNORE = 2;
        int viewId;
        private Action() {}
        public abstract void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) throws android.widget.RemoteViews.ActionException;
        public int describeContents() { return 0; }
        public void setBitmapCache(android.widget.RemoteViews.BitmapCache p0) {}
        public int mergeBehavior() { return 0; }
        public abstract int getActionTag();
        public java.lang.String getUniqueKey() { return null; }
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) { return null; }
        public boolean prefersAsyncApply() { return false; }
        public boolean hasSameAppInfo(android.content.pm.ApplicationInfo p0) { return false; }
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    }

    public static class ActionException extends java.lang.RuntimeException {
        public ActionException(java.lang.Exception p0) { super(); }
        public ActionException(java.lang.String p0) { super(); }
        public ActionException(java.lang.Throwable p0) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ApplyFlags {
    }

    private class AsyncApplyTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.widget.RemoteViews.ViewTree> implements android.os.CancellationSignal.OnCancelListener {
        final android.os.CancellationSignal mCancelSignal = null;
        final android.widget.RemoteViews mRV = null;
        final android.view.ViewGroup mParent = null;
        final android.content.Context mContext = null;
        final android.widget.RemoteViews.OnViewAppliedListener mListener = null;
        final android.widget.RemoteViews.OnClickHandler mHandler = null;
        private android.view.View mResult;
        private android.widget.RemoteViews.ViewTree mTree;
        private android.widget.RemoteViews.Action[] mActions;
        private java.lang.Exception mError;
        private AsyncApplyTask(android.widget.RemoteViews p0, android.widget.RemoteViews p1, android.view.ViewGroup p2, android.content.Context p3, android.widget.RemoteViews.OnViewAppliedListener p4, android.widget.RemoteViews.OnClickHandler p5, android.view.View p6) { super(); }
        protected android.widget.RemoteViews.ViewTree doInBackground(java.lang.Void... p0) { return null; }
        protected void onPostExecute(android.widget.RemoteViews.ViewTree p0) {}
        public void onCancel() {}
        private android.os.CancellationSignal startTaskOnExecutor(java.util.concurrent.Executor p0) { return null; }
    }

    private static class BitmapCache {
        java.util.ArrayList<android.graphics.Bitmap> mBitmaps;
        int mBitmapMemory;
        public BitmapCache() {}
        public BitmapCache(android.os.Parcel p0) {}
        public int getBitmapId(android.graphics.Bitmap p0) { return 0; }
        public android.graphics.Bitmap getBitmapForId(int p0) { return null; }
        public void writeBitmapsToParcel(android.os.Parcel p0, int p1) {}
        public int getBitmapMemory() { return 0; }
    }

    private class BitmapReflectionAction extends android.widget.RemoteViews.Action {
        int bitmapId;
        android.graphics.Bitmap bitmap;
        java.lang.String methodName;
        BitmapReflectionAction(android.widget.RemoteViews p0, int p1, java.lang.String p2, android.graphics.Bitmap p3) { super(); }
        BitmapReflectionAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) throws android.widget.RemoteViews.ActionException {}
        public void setBitmapCache(android.widget.RemoteViews.BitmapCache p0) {}
        public int getActionTag() { return 0; }
    }

    private static class LayoutParamAction extends android.widget.RemoteViews.Action {
        public static final int LAYOUT_MARGIN_END_DIMEN = 1;
        public static final int LAYOUT_WIDTH = 2;
        public static final int LAYOUT_MARGIN_BOTTOM_DIMEN = 3;
        public static final int LAYOUT_MARGIN_END = 4;
        final int mProperty = 0;
        final int mValue = 0;
        public LayoutParamAction(int p0, int p1, int p2) { super(); }
        public LayoutParamAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        private static int resolveDimenPixelOffset(android.view.View p0, int p1) { return 0; }
        public int getActionTag() { return 0; }
        public java.lang.String getUniqueKey() { return null; }
    }

    static class MethodArgs {
        public java.lang.invoke.MethodHandle syncMethod;
        public java.lang.invoke.MethodHandle asyncMethod;
        public java.lang.String asyncMethodName;
        MethodArgs() {}
    }

    static class MethodKey {
        public java.lang.Class targetClass;
        public java.lang.Class paramClass;
        public java.lang.String methodName;
        MethodKey() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void set(java.lang.Class p0, java.lang.Class p1, java.lang.String p2) {}
    }

    public static interface OnClickHandler {
        public boolean onClickHandler(android.view.View p0, android.app.PendingIntent p1, android.widget.RemoteViews.RemoteResponse p2);
    }

    public static interface OnViewAppliedListener {
        default public void onViewInflated(android.view.View p0) {}
        public void onViewApplied(android.view.View p0);
        public void onError(java.lang.Exception p0);
    }

    private class OverrideTextColorsAction extends android.widget.RemoteViews.Action {
        private final int textColor = 0;
        public OverrideTextColorsAction(android.widget.RemoteViews p0, int p1) { super(); }
        public OverrideTextColorsAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private final class ReflectionAction extends android.widget.RemoteViews.Action {
        static final int BOOLEAN = 1;
        static final int BYTE = 2;
        static final int SHORT = 3;
        static final int INT = 4;
        static final int LONG = 5;
        static final int FLOAT = 6;
        static final int DOUBLE = 7;
        static final int CHAR = 8;
        static final int STRING = 9;
        static final int CHAR_SEQUENCE = 10;
        static final int URI = 11;
        static final int BITMAP = 12;
        static final int BUNDLE = 13;
        static final int INTENT = 14;
        static final int COLOR_STATE_LIST = 15;
        static final int ICON = 16;
        java.lang.String methodName;
        int type;
        java.lang.Object value;
        ReflectionAction(android.widget.RemoteViews p0, int p1, java.lang.String p2, int p3, java.lang.Object p4) { super(); }
        ReflectionAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private java.lang.Class<?> getParameterType() { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) { return null; }
        public int mergeBehavior() { return 0; }
        public int getActionTag() { return 0; }
        public java.lang.String getUniqueKey() { return null; }
        public boolean prefersAsyncApply() { return false; }
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    }

    public static class RemoteResponse {
        private android.app.PendingIntent mPendingIntent;
        private android.content.Intent mFillIntent;
        private android.util.IntArray mViewIds;
        private java.util.ArrayList<java.lang.String> mElementNames;
        public RemoteResponse() {}
        public static android.widget.RemoteViews.RemoteResponse fromPendingIntent(android.app.PendingIntent p0) { return null; }
        public static android.widget.RemoteViews.RemoteResponse fromFillInIntent(android.content.Intent p0) { return null; }
        public android.widget.RemoteViews.RemoteResponse addSharedElement(int p0, java.lang.String p1) { return null; }
        private void writeToParcel(android.os.Parcel p0, int p1) {}
        private void readFromParcel(android.os.Parcel p0) {}
        private void handleViewClick(android.view.View p0, android.widget.RemoteViews.OnClickHandler p1) {}
        public android.util.Pair<android.content.Intent, android.app.ActivityOptions> getLaunchOptions(android.view.View p0) { return null; }
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface RemoteView {
    }

    private static class RemoteViewsContextWrapper extends android.content.ContextWrapper {
        private final android.content.Context mContextForResources = null;
        RemoteViewsContextWrapper(android.content.Context p0, android.content.Context p1) { super(null); }
        public android.content.res.Resources getResources() { return null; }
        public android.content.res.Resources.Theme getTheme() { return null; }
        public java.lang.String getPackageName() { return null; }
    }

    private static final class RunnableAction extends android.widget.RemoteViews.RuntimeAction {
        private final java.lang.Runnable mRunnable = null;
        RunnableAction(java.lang.Runnable p0) { super(); }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
    }

    private static abstract class RuntimeAction extends android.widget.RemoteViews.Action {
        private RuntimeAction() { super(); }
        public final int getActionTag() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private class SetDrawableTint extends android.widget.RemoteViews.Action {
        boolean targetBackground;
        int colorFilter;
        android.graphics.PorterDuff.Mode filterMode;
        SetDrawableTint(android.widget.RemoteViews p0, int p1, boolean p2, int p3, android.graphics.PorterDuff.Mode p4) { super(); }
        SetDrawableTint(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetEmptyView extends android.widget.RemoteViews.Action {
        int emptyViewId;
        SetEmptyView(android.widget.RemoteViews p0, int p1, int p2) { super(); }
        SetEmptyView(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetIntTagAction extends android.widget.RemoteViews.Action {
        private final int mViewId = 0;
        private final int mKey = 0;
        private final int mTag = 0;
        SetIntTagAction(android.widget.RemoteViews p0, int p1, int p2, int p3) { super(); }
        SetIntTagAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetOnClickResponse extends android.widget.RemoteViews.Action {
        final android.widget.RemoteViews.RemoteResponse mResponse = null;
        SetOnClickResponse(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews.RemoteResponse p2) { super(); }
        SetOnClickResponse(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetPendingIntentTemplate extends android.widget.RemoteViews.Action {
        android.app.PendingIntent pendingIntentTemplate;
        public SetPendingIntentTemplate(android.widget.RemoteViews p0, int p1, android.app.PendingIntent p2) { super(); }
        public SetPendingIntentTemplate(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetRemoteInputsAction extends android.widget.RemoteViews.Action {
        final android.os.Parcelable[] remoteInputs = null;
        public SetRemoteInputsAction(android.widget.RemoteViews p0, int p1, android.app.RemoteInput[] p2) { super(); }
        public SetRemoteInputsAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetRemoteViewsAdapterIntent extends android.widget.RemoteViews.Action {
        android.content.Intent intent;
        boolean isAsync;
        public SetRemoteViewsAdapterIntent(android.widget.RemoteViews p0, int p1, android.content.Intent p2) { super(); }
        public SetRemoteViewsAdapterIntent(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) { return null; }
        public int getActionTag() { return 0; }
    }

    private class SetRemoteViewsAdapterList extends android.widget.RemoteViews.Action {
        int viewTypeCount;
        java.util.ArrayList<android.widget.RemoteViews> list;
        public SetRemoteViewsAdapterList(int p0, java.util.ArrayList<android.widget.RemoteViews> p1, int p2) { super(); }
        public SetRemoteViewsAdapterList(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetRippleDrawableColor extends android.widget.RemoteViews.Action {
        android.content.res.ColorStateList mColorStateList;
        SetRippleDrawableColor(android.widget.RemoteViews p0, int p1, android.content.res.ColorStateList p2) { super(); }
        SetRippleDrawableColor(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private class TextViewDrawableAction extends android.widget.RemoteViews.Action {
        boolean isRelative;
        boolean useIcons;
        int d1;
        int d2;
        int d3;
        int d4;
        android.graphics.drawable.Icon i1;
        android.graphics.drawable.Icon i2;
        android.graphics.drawable.Icon i3;
        android.graphics.drawable.Icon i4;
        boolean drawablesLoaded;
        android.graphics.drawable.Drawable id1;
        android.graphics.drawable.Drawable id2;
        android.graphics.drawable.Drawable id3;
        android.graphics.drawable.Drawable id4;
        public TextViewDrawableAction(android.widget.RemoteViews p0, int p1, boolean p2, int p3, int p4, int p5, int p6) { super(); }
        public TextViewDrawableAction(android.widget.RemoteViews p0, int p1, boolean p2, android.graphics.drawable.Icon p3, android.graphics.drawable.Icon p4, android.graphics.drawable.Icon p5, android.graphics.drawable.Icon p6) { super(); }
        public TextViewDrawableAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) { return null; }
        public boolean prefersAsyncApply() { return false; }
        public int getActionTag() { return 0; }
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    }

    private class TextViewSizeAction extends android.widget.RemoteViews.Action {
        int units;
        float size;
        public TextViewSizeAction(android.widget.RemoteViews p0, int p1, int p2, float p3) { super(); }
        public TextViewSizeAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private final class ViewContentNavigation extends android.widget.RemoteViews.Action {
        final boolean mNext = false;
        ViewContentNavigation(android.widget.RemoteViews p0, int p1, boolean p2) { super(); }
        ViewContentNavigation(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int mergeBehavior() { return 0; }
        public int getActionTag() { return 0; }
    }

    private class ViewGroupActionAdd extends android.widget.RemoteViews.Action {
        private android.widget.RemoteViews mNestedViews;
        private int mIndex;
        ViewGroupActionAdd(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews p2) { super(); }
        ViewGroupActionAdd(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews p2, int p3) { super(); }
        ViewGroupActionAdd(android.os.Parcel p0, android.widget.RemoteViews.BitmapCache p1, android.content.pm.ApplicationInfo p2, int p3, java.util.Map<java.lang.Class, java.lang.Object> p4) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean hasSameAppInfo(android.content.pm.ApplicationInfo p0) { return false; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) { return null; }
        public void setBitmapCache(android.widget.RemoteViews.BitmapCache p0) {}
        public int mergeBehavior() { return 0; }
        public boolean prefersAsyncApply() { return false; }
        public int getActionTag() { return 0; }
    }

    private class ViewGroupActionRemove extends android.widget.RemoteViews.Action {
        private static final int REMOVE_ALL_VIEWS_ID = -2;
        private int mViewIdToKeep;
        ViewGroupActionRemove(android.widget.RemoteViews p0, int p1) { super(); }
        ViewGroupActionRemove(android.widget.RemoteViews p0, int p1, int p2) { super(); }
        ViewGroupActionRemove(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) { return null; }
        private void removeAllViewsExceptIdToKeep(android.view.ViewGroup p0) {}
        public int getActionTag() { return 0; }
        public int mergeBehavior() { return 0; }
    }

    private class ViewPaddingAction extends android.widget.RemoteViews.Action {
        int left;
        int top;
        int right;
        int bottom;
        public ViewPaddingAction(android.widget.RemoteViews p0, int p1, int p2, int p3, int p4, int p5) { super(); }
        public ViewPaddingAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnClickHandler p2) {}
        public int getActionTag() { return 0; }
    }

    private static class ViewTree {
        private static final int INSERT_AT_END_INDEX = -1;
        private android.view.View mRoot;
        private java.util.ArrayList<android.widget.RemoteViews.ViewTree> mChildren;
        private ViewTree(android.view.View p0) {}
        public void createTree() {}
        public android.widget.RemoteViews.ViewTree findViewTreeById(int p0) { return null; }
        public void replaceView(android.view.View p0) {}
        public <T extends android.view.View> T findViewById(int p0) { return null; }
        public void addChild(android.widget.RemoteViews.ViewTree p0) {}
        public void addChild(android.widget.RemoteViews.ViewTree p0, int p1) {}
        private void addViewChild(android.view.View p0) {}
    }
}
