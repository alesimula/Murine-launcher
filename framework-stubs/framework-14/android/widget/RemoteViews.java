package android.widget;

public class RemoteViews implements android.os.Parcelable, android.view.LayoutInflater.Filter {
    public static final java.lang.String EXTRA_CHECKED = "android.widget.extra.CHECKED";
    static final java.lang.String EXTRA_REMOTEADAPTER_APPWIDGET_ID = "remoteAdapterAppWidgetId";
    static final java.lang.String EXTRA_REMOTEADAPTER_ON_LIGHT_BACKGROUND = "remoteAdapterOnLightBackground";
    public static final java.lang.String EXTRA_SHARED_ELEMENT_BOUNDS = "android.widget.extra.SHARED_ELEMENT_BOUNDS";
    public static final int MARGIN_LEFT = 0;
    public static final int MARGIN_TOP = 1;
    public static final int MARGIN_RIGHT = 2;
    public static final int MARGIN_BOTTOM = 3;
    public static final int MARGIN_START = 4;
    public static final int MARGIN_END = 5;
    static final int VALUE_TYPE_RAW = 1;
    static final int VALUE_TYPE_COMPLEX_UNIT = 2;
    static final int VALUE_TYPE_RESOURCE = 3;
    static final int VALUE_TYPE_ATTRIBUTE = 4;
    public static final int FLAG_REAPPLY_DISALLOWED = 1;
    public static final int FLAG_WIDGET_IS_COLLECTION_CHILD = 2;
    public static final int FLAG_USE_LIGHT_BACKGROUND_LAYOUT = 4;
    static final int FLAG_MASK_TO_PROPAGATE = 6;
    public android.content.pm.ApplicationInfo mApplication;
    public static final android.os.Parcelable.Creator<android.widget.RemoteViews> CREATOR = null;
    public void setRemoteInputs(int p0, android.app.RemoteInput[] p1) {}
    public void reduceImageSizes(int p0, int p1) {}
    public void overrideTextColors(int p0) {}
    public void setIntTag(int p0, int p1, int p2) {}
    public void addFlags(int p0) {}
    public boolean hasFlags(int p0) { return false; }
    public void mergeRemoteViews(android.widget.RemoteViews p0) {}
    public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    public static android.graphics.Rect getSourceBounds(android.view.View p0) { return null; }
    public RemoteViews(java.lang.String p0, int p1) {}
    public RemoteViews(java.lang.String p0, int p1, int p2) {}
    protected RemoteViews(android.content.pm.ApplicationInfo p0, int p1) {}
    public RemoteViews(android.widget.RemoteViews p0, android.widget.RemoteViews p1) {}
    public RemoteViews(java.util.Map<android.util.SizeF, android.widget.RemoteViews> p0) {}
    public RemoteViews(android.widget.RemoteViews p0) {}
    public RemoteViews(android.os.Parcel p0) {}
    @java.lang.Deprecated
    public android.widget.RemoteViews clone() { return null; }
    public java.lang.String getPackage() { return null; }
    public int getLayoutId() { return 0; }
    public int estimateMemoryUsage() { return 0; }
    public void addView(int p0, android.widget.RemoteViews p1) {}
    public void addStableView(int p0, android.widget.RemoteViews p1, int p2) {}
    public void addView(int p0, android.widget.RemoteViews p1, int p2) {}
    public void removeAllViews(int p0) {}
    public void removeAllViewsExceptId(int p0, int p1) {}
    public void removeFromParent(int p0) {}
    @java.lang.Deprecated
    public void showNext(int p0) {}
    @java.lang.Deprecated
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
    public void setOnCheckedChangeResponse(int p0, android.widget.RemoteViews.RemoteResponse p1) {}
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
    public void setRemoteAdapter(int p0, android.widget.RemoteViews.RemoteCollectionItems p1) {}
    public void setScrollPosition(int p0, int p1) {}
    public void setRelativeScrollPosition(int p0, int p1) {}
    public void setViewPadding(int p0, int p1, int p2, int p3, int p4) {}
    public void setViewLayoutMarginDimen(int p0, int p1, int p2) {}
    public void setViewLayoutMarginAttr(int p0, int p1, int p2) {}
    public void setViewLayoutMargin(int p0, int p1, float p2, int p3) {}
    public void setViewLayoutWidth(int p0, float p1, int p2) {}
    public void setViewLayoutWidthDimen(int p0, int p1) {}
    public void setViewLayoutWidthAttr(int p0, int p1) {}
    public void setViewLayoutHeight(int p0, float p1, int p2) {}
    public void setViewLayoutHeightDimen(int p0, int p1) {}
    public void setViewLayoutHeightAttr(int p0, int p1) {}
    public void setViewOutlinePreferredRadius(int p0, float p1, int p2) {}
    public void setViewOutlinePreferredRadiusDimen(int p0, int p1) {}
    public void setViewOutlinePreferredRadiusAttr(int p0, int p1) {}
    public void setBoolean(int p0, java.lang.String p1, boolean p2) {}
    public void setByte(int p0, java.lang.String p1, byte p2) {}
    public void setShort(int p0, java.lang.String p1, short p2) {}
    public void setInt(int p0, java.lang.String p1, int p2) {}
    public void setIntDimen(int p0, java.lang.String p1, int p2) {}
    public void setIntDimen(int p0, java.lang.String p1, float p2, int p3) {}
    public void setIntDimenAttr(int p0, java.lang.String p1, int p2) {}
    public void setColor(int p0, java.lang.String p1, int p2) {}
    public void setColorAttr(int p0, java.lang.String p1, int p2) {}
    public void setColorInt(int p0, java.lang.String p1, int p2, int p3) {}
    public void setColorStateList(int p0, java.lang.String p1, android.content.res.ColorStateList p2) {}
    public void setColorStateList(int p0, java.lang.String p1, android.content.res.ColorStateList p2, android.content.res.ColorStateList p3) {}
    public void setColorStateList(int p0, java.lang.String p1, int p2) {}
    public void setColorStateListAttr(int p0, java.lang.String p1, int p2) {}
    public void setLong(int p0, java.lang.String p1, long p2) {}
    public void setFloat(int p0, java.lang.String p1, float p2) {}
    public void setFloatDimen(int p0, java.lang.String p1, int p2) {}
    public void setFloatDimen(int p0, java.lang.String p1, float p2, int p3) {}
    public void setFloatDimenAttr(int p0, java.lang.String p1, int p2) {}
    public void setDouble(int p0, java.lang.String p1, double p2) {}
    public void setChar(int p0, java.lang.String p1, char p2) {}
    public void setString(int p0, java.lang.String p1, java.lang.String p2) {}
    public void setCharSequence(int p0, java.lang.String p1, java.lang.CharSequence p2) {}
    public void setCharSequence(int p0, java.lang.String p1, int p2) {}
    public void setCharSequenceAttr(int p0, java.lang.String p1, int p2) {}
    public void setUri(int p0, java.lang.String p1, android.net.Uri p2) {}
    public void setBitmap(int p0, java.lang.String p1, android.graphics.Bitmap p2) {}
    public void setBlendMode(int p0, java.lang.String p1, android.graphics.BlendMode p2) {}
    public void setBundle(int p0, java.lang.String p1, android.os.Bundle p2) {}
    public void setIntent(int p0, java.lang.String p1, android.content.Intent p2) {}
    public void setIcon(int p0, java.lang.String p1, android.graphics.drawable.Icon p2) {}
    public void setIcon(int p0, java.lang.String p1, android.graphics.drawable.Icon p2, android.graphics.drawable.Icon p3) {}
    public void setContentDescription(int p0, java.lang.CharSequence p1) {}
    public void setAccessibilityTraversalBefore(int p0, int p1) {}
    public void setAccessibilityTraversalAfter(int p0, int p1) {}
    public void setLabelFor(int p0, int p1) {}
    public void setCompoundButtonChecked(int p0, boolean p1) {}
    public void setRadioGroupChecked(int p0, int p1) {}
    public void setLightBackgroundLayoutId(int p0) {}
    public android.widget.RemoteViews getDarkTextViews() { return null; }
    public android.widget.RemoteViews getRemoteViewsToApply(android.content.Context p0, android.util.SizeF p1) { return null; }
    public android.widget.RemoteViews getRemoteViewsToApplyIfDifferent(android.util.SizeF p0, android.util.SizeF p1) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.InteractionHandler p2) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.InteractionHandler p2, android.util.SizeF p3) { return null; }
    public android.view.View applyWithTheme(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.InteractionHandler p2, int p3) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.InteractionHandler p2, android.util.SizeF p3, android.widget.RemoteViews.ColorResources p4) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.util.SizeF p2, android.widget.RemoteViews.ActionApplyParams p3) { return null; }
    protected boolean shouldUseStaticFilter() { return false; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3) { return null; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4) { return null; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4, android.util.SizeF p5) { return null; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4, android.util.SizeF p5, android.widget.RemoteViews.ColorResources p6) { return null; }
    public void reapply(android.content.Context p0, android.view.View p1) {}
    public void reapply(android.content.Context p0, android.view.View p1, android.widget.RemoteViews.InteractionHandler p2) {}
    public void reapply(android.content.Context p0, android.view.View p1, android.widget.RemoteViews.InteractionHandler p2, android.util.SizeF p3, android.widget.RemoteViews.ColorResources p4) {}
    public void reapply(android.content.Context p0, android.view.View p1, android.util.SizeF p2, android.widget.RemoteViews.ActionApplyParams p3) {}
    public boolean canRecycleView(android.view.View p0) { return false; }
    public android.os.CancellationSignal reapplyAsync(android.content.Context p0, android.view.View p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3) { return null; }
    public android.os.CancellationSignal reapplyAsync(android.content.Context p0, android.view.View p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4) { return null; }
    public android.os.CancellationSignal reapplyAsync(android.content.Context p0, android.view.View p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4, android.util.SizeF p5, android.widget.RemoteViews.ColorResources p6) { return null; }
    public boolean prefersAsyncApply() { return false; }
    public void updateAppInfo(android.content.pm.ApplicationInfo p0) {}
    public int getSequenceNumber() { return 0; }
    @java.lang.Deprecated
    public boolean onLoadClass(java.lang.Class p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean hasSameAppInfo(android.content.pm.ApplicationInfo p0) { return false; }
    public static boolean startPendingIntent(android.view.View p0, android.app.PendingIntent p1, android.util.Pair<android.content.Intent, android.app.ActivityOptions> p2) { return false; }
    public int getViewId() { return 0; }
    public void setProviderInstanceId(long p0) {}
    public long getProviderInstanceId() { return 0L; }
    public long computeUniqueId(android.widget.RemoteViews p0) { return 0L; }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface RemoteView {
    }

    public static final class RemoteCollectionItems implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.widget.RemoteViews.RemoteCollectionItems> CREATOR = null;
        RemoteCollectionItems(long[] p0, android.widget.RemoteViews[] p1, boolean p2, int p3) {}
        RemoteCollectionItems(android.os.Parcel p0, android.widget.RemoteViews.HierarchyRootData p1) {}
        void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public long getItemId(int p0) { return 0L; }
        public android.widget.RemoteViews getItemView(int p0) { return null; }
        public int getItemCount() { return 0; }
        public int getViewTypeCount() { return 0; }
        public boolean hasStableIds() { return false; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            public android.widget.RemoteViews.RemoteCollectionItems.Builder addItem(long p0, android.widget.RemoteViews p1) { return null; }
            public android.widget.RemoteViews.RemoteCollectionItems.Builder setHasStableIds(boolean p0) { return null; }
            public android.widget.RemoteViews.RemoteCollectionItems.Builder setViewTypeCount(int p0) { return null; }
            public android.widget.RemoteViews.RemoteCollectionItems build() { return null; }
        }
    }

    public static final class RemoteViewOutlineProvider extends android.view.ViewOutlineProvider {
        public RemoteViewOutlineProvider(float p0) { super(); }
        public float getRadius() { return 0.0f; }
        public void getOutline(android.view.View p0, android.graphics.Outline p1) {}
    }

    public static class ActionException extends java.lang.RuntimeException {
        public ActionException(java.lang.Exception p0) { super(); }
        public ActionException(java.lang.String p0) { super(); }
        public ActionException(java.lang.Throwable p0) { super(); }
    }

    public static class RemoteResponse {
        public static final int INTERACTION_TYPE_CLICK = 0;
        public static final int INTERACTION_TYPE_CHECKED_CHANGE = 1;
        public RemoteResponse() {}
        public static android.widget.RemoteViews.RemoteResponse fromPendingIntent(android.app.PendingIntent p0) { return null; }
        public static android.widget.RemoteViews.RemoteResponse fromFillInIntent(android.content.Intent p0) { return null; }
        public android.widget.RemoteViews.RemoteResponse addSharedElement(int p0, java.lang.String p1) { return null; }
        public android.widget.RemoteViews.RemoteResponse setInteractionType(int p0) { return null; }
        public android.util.Pair<android.content.Intent, android.app.ActivityOptions> getLaunchOptions(android.view.View p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface InteractionType {
        }
    }

    private static abstract class Action implements android.os.Parcelable {
        public static final int MERGE_REPLACE = 0;
        public static final int MERGE_APPEND = 1;
        public static final int MERGE_IGNORE = 2;
        int viewId;
        public abstract void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException;
        public int describeContents() { return 0; }
        public void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public int mergeBehavior() { return 0; }
        public abstract int getActionTag();
        public java.lang.String getUniqueKey() { return null; }
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public boolean prefersAsyncApply() { return false; }
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    }

    public class ActionApplyParams {
        public android.widget.RemoteViews.InteractionHandler handler;
        public android.widget.RemoteViews.ColorResources colorResources;
        public java.util.concurrent.Executor executor;
        public int applyThemeResId;
        public ActionApplyParams(android.widget.RemoteViews p0) {}
        public android.widget.RemoteViews.ActionApplyParams clone() { return null; }
        public android.widget.RemoteViews.ActionApplyParams withInteractionHandler(android.widget.RemoteViews.InteractionHandler p0) { return null; }
        public android.widget.RemoteViews.ActionApplyParams withColorResources(android.widget.RemoteViews.ColorResources p0) { return null; }
        public android.widget.RemoteViews.ActionApplyParams withThemeResId(int p0) { return null; }
        public android.widget.RemoteViews.ActionApplyParams withExecutor(java.util.concurrent.Executor p0) { return null; }
    }

    private static class ApplicationInfoCache {
        ApplicationInfoCache() {}
        android.content.pm.ApplicationInfo getOrPut(android.content.pm.ApplicationInfo p0) { return null; }
        void put(android.content.pm.ApplicationInfo p0) {}
        android.content.pm.ApplicationInfo get(android.content.pm.ApplicationInfo p0) { return null; }
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
        final android.widget.RemoteViews.ActionApplyParams mApplyParams = null;
        final boolean mTopLevel = false;
        protected android.widget.RemoteViews.ViewTree doInBackground(java.lang.Void... p0) { return null; }
        protected void onPostExecute(android.widget.RemoteViews.ViewTree p0) {}
        public void onCancel() {}
    }

    private static final class AttributeReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        static final int DIMEN_RESOURCE = 1;
        static final int COLOR_RESOURCE = 2;
        static final int STRING_RESOURCE = 3;
        AttributeReflectionAction(int p0, java.lang.String p1, int p2, int p3, int p4) { super((android.os.Parcel)null); }
        AttributeReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public int getActionTag() { return 0; }
    }

    private static abstract class BaseReflectionAction extends android.widget.RemoteViews.Action {
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
        static final int BLEND_MODE = 17;
        java.lang.String methodName;
        int type;
        BaseReflectionAction(int p0, java.lang.String p1, int p2) { super(); }
        BaseReflectionAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        protected abstract java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException;
        public final void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public final android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public final int mergeBehavior() { return 0; }
        public final java.lang.String getUniqueKey() { return null; }
        public final boolean prefersAsyncApply() { return false; }
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    }

    private static class BitmapCache {
        java.util.ArrayList<android.graphics.Bitmap> mBitmaps;
        android.util.SparseIntArray mBitmapHashes;
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
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public int getActionTag() { return 0; }
    }

    public static final class ColorResources {
        public void apply(android.content.Context p0) {}
        public android.util.SparseIntArray getColorMapping() { return null; }
        public static android.widget.RemoteViews.ColorResources create(android.content.Context p0, android.util.SparseIntArray p1) { return null; }
    }

    private static final class ComplexUnitDimensionReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        ComplexUnitDimensionReflectionAction(int p0, java.lang.String p1, int p2, float p3, int p4) { super((android.os.Parcel)null); }
        ComplexUnitDimensionReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public int getActionTag() { return 0; }
    }

    private static final class HierarchyRootData {
        final android.widget.RemoteViews.BitmapCache mBitmapCache = null;
        final android.widget.RemoteViews.ApplicationInfoCache mApplicationInfoCache = null;
        final java.util.Map<java.lang.Class, java.lang.Object> mClassCookies = null;
        HierarchyRootData(android.widget.RemoteViews.BitmapCache p0, android.widget.RemoteViews.ApplicationInfoCache p1, java.util.Map<java.lang.Class, java.lang.Object> p2) {}
    }

    public static interface InteractionHandler {
        public boolean onInteraction(android.view.View p0, android.app.PendingIntent p1, android.widget.RemoteViews.RemoteResponse p2);
    }

    private static class LayoutParamAction extends android.widget.RemoteViews.Action {
        static final int LAYOUT_MARGIN_LEFT = 0;
        static final int LAYOUT_MARGIN_TOP = 1;
        static final int LAYOUT_MARGIN_RIGHT = 2;
        static final int LAYOUT_MARGIN_BOTTOM = 3;
        static final int LAYOUT_MARGIN_START = 4;
        static final int LAYOUT_MARGIN_END = 5;
        static final int LAYOUT_WIDTH = 8;
        static final int LAYOUT_HEIGHT = 9;
        final int mProperty = 0;
        final int mValueType = 0;
        final int mValue = 0;
        LayoutParamAction(int p0, int p1, float p2, int p3) { super(); }
        LayoutParamAction(int p0, int p1, int p2, int p3) { super(); }
        public LayoutParamAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
        public java.lang.String getUniqueKey() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MarginType {
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

    private static final class NightModeReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        NightModeReflectionAction(int p0, java.lang.String p1, int p2, java.lang.Object p3, java.lang.Object p4) { super((android.os.Parcel)null); }
        NightModeReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public int getActionTag() { return 0; }
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    }

    public static interface OnViewAppliedListener {
        default public void onViewInflated(android.view.View p0) {}
        public void onViewApplied(android.view.View p0);
        public void onError(java.lang.Exception p0);
    }

    private static class OverrideTextColorsAction extends android.widget.RemoteViews.Action {
        public OverrideTextColorsAction(int p0) { super(); }
        public OverrideTextColorsAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private static final class ReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        java.lang.Object value;
        ReflectionAction(int p0, java.lang.String p1, int p2, java.lang.Object p3) { super((android.os.Parcel)null); }
        ReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public int getActionTag() { return 0; }
    }

    private static class RemoteViewsContextWrapper extends android.content.ContextWrapper {
        RemoteViewsContextWrapper(android.content.Context p0, android.content.Context p1) { super(null); }
        public android.content.res.Resources getResources() { return null; }
        public android.content.res.Resources.Theme getTheme() { return null; }
        public java.lang.String getPackageName() { return null; }
        public android.os.UserHandle getUser() { return null; }
        public int getUserId() { return 0; }
        public boolean isRestricted() { return false; }
    }

    private static class RemoveFromParentAction extends android.widget.RemoteViews.Action {
        RemoveFromParentAction(int p0) { super(); }
        RemoveFromParentAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public int getActionTag() { return 0; }
        public int mergeBehavior() { return 0; }
    }

    private static final class ResourceReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        static final int DIMEN_RESOURCE = 1;
        static final int COLOR_RESOURCE = 2;
        static final int STRING_RESOURCE = 3;
        ResourceReflectionAction(int p0, java.lang.String p1, int p2, int p3, int p4) { super((android.os.Parcel)null); }
        ResourceReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public int getActionTag() { return 0; }
    }

    private static final class RunnableAction extends android.widget.RemoteViews.RuntimeAction {
        RunnableAction(java.lang.Runnable p0) { super(); }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
    }

    private static abstract class RuntimeAction extends android.widget.RemoteViews.Action {
        public final int getActionTag() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class SetCompoundButtonCheckedAction extends android.widget.RemoteViews.Action {
        SetCompoundButtonCheckedAction(int p0, boolean p1) { super(); }
        SetCompoundButtonCheckedAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public int getActionTag() { return 0; }
    }

    private static class SetDrawableTint extends android.widget.RemoteViews.Action {
        boolean targetBackground;
        int colorFilter;
        android.graphics.PorterDuff.Mode filterMode;
        SetDrawableTint(int p0, boolean p1, int p2, android.graphics.PorterDuff.Mode p3) { super(); }
        SetDrawableTint(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private static class SetEmptyView extends android.widget.RemoteViews.Action {
        int emptyViewId;
        SetEmptyView(int p0, int p1) { super(); }
        SetEmptyView(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private static class SetIntTagAction extends android.widget.RemoteViews.Action {
        SetIntTagAction(int p0, int p1, int p2) { super(); }
        SetIntTagAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetOnCheckedChangeResponse extends android.widget.RemoteViews.Action {
        SetOnCheckedChangeResponse(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews.RemoteResponse p2) { super(); }
        SetOnCheckedChangeResponse(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetOnClickResponse extends android.widget.RemoteViews.Action {
        final android.widget.RemoteViews.RemoteResponse mResponse = null;
        SetOnClickResponse(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews.RemoteResponse p2) { super(); }
        SetOnClickResponse(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private static class SetPendingIntentTemplate extends android.widget.RemoteViews.Action {
        android.app.PendingIntent pendingIntentTemplate;
        public SetPendingIntentTemplate(int p0, android.app.PendingIntent p1) { super(); }
        public SetPendingIntentTemplate(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private static class SetRadioGroupCheckedAction extends android.widget.RemoteViews.Action {
        SetRadioGroupCheckedAction(int p0, int p1) { super(); }
        SetRadioGroupCheckedAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public int getActionTag() { return 0; }
    }

    private class SetRemoteCollectionItemListAdapterAction extends android.widget.RemoteViews.Action {
        SetRemoteCollectionItemListAdapterAction(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews.RemoteCollectionItems p2) { super(); }
        SetRemoteCollectionItemListAdapterAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public int getActionTag() { return 0; }
    }

    private static class SetRemoteInputsAction extends android.widget.RemoteViews.Action {
        final android.os.Parcelable[] remoteInputs = null;
        public SetRemoteInputsAction(int p0, android.app.RemoteInput[] p1) { super(); }
        public SetRemoteInputsAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetRemoteViewsAdapterIntent extends android.widget.RemoteViews.Action {
        android.content.Intent intent;
        boolean isAsync;
        public SetRemoteViewsAdapterIntent(android.widget.RemoteViews p0, int p1, android.content.Intent p2) { super(); }
        public SetRemoteViewsAdapterIntent(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public int getActionTag() { return 0; }
    }

    private static class SetRemoteViewsAdapterList extends android.widget.RemoteViews.Action {
        int viewTypeCount;
        java.util.ArrayList<android.widget.RemoteViews> list;
        public SetRemoteViewsAdapterList(int p0, java.util.ArrayList<android.widget.RemoteViews> p1, int p2) { super(); }
        public SetRemoteViewsAdapterList(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private class SetRippleDrawableColor extends android.widget.RemoteViews.Action {
        android.content.res.ColorStateList mColorStateList;
        SetRippleDrawableColor(android.widget.RemoteViews p0, int p1, android.content.res.ColorStateList p2) { super(); }
        SetRippleDrawableColor(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private static class SetViewOutlinePreferredRadiusAction extends android.widget.RemoteViews.Action {
        SetViewOutlinePreferredRadiusAction(int p0, int p1, int p2) { super(); }
        SetViewOutlinePreferredRadiusAction(int p0, float p1, int p2) { super(); }
        SetViewOutlinePreferredRadiusAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public int getActionTag() { return 0; }
    }

    private static class TextViewDrawableAction extends android.widget.RemoteViews.Action {
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
        public TextViewDrawableAction(int p0, boolean p1, int p2, int p3, int p4, int p5) { super(); }
        public TextViewDrawableAction(int p0, boolean p1, android.graphics.drawable.Icon p2, android.graphics.drawable.Icon p3, android.graphics.drawable.Icon p4, android.graphics.drawable.Icon p5) { super(); }
        public TextViewDrawableAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public boolean prefersAsyncApply() { return false; }
        public int getActionTag() { return 0; }
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    }

    private static class TextViewSizeAction extends android.widget.RemoteViews.Action {
        int units;
        float size;
        TextViewSizeAction(int p0, int p1, float p2) { super(); }
        TextViewSizeAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ValueType {
    }

    @java.lang.Deprecated
    private final class ViewContentNavigation extends android.widget.RemoteViews.Action {
        final boolean mNext = false;
        ViewContentNavigation(android.widget.RemoteViews p0, int p1, boolean p2) { super(); }
        ViewContentNavigation(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int mergeBehavior() { return 0; }
        public int getActionTag() { return 0; }
    }

    private class ViewGroupActionAdd extends android.widget.RemoteViews.Action {
        static final int NO_ID = -1;
        ViewGroupActionAdd(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews p2) { super(); }
        ViewGroupActionAdd(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews p2, int p3) { super(); }
        ViewGroupActionAdd(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews p2, int p3, int p4) { super(); }
        ViewGroupActionAdd(android.widget.RemoteViews p0, android.os.Parcel p1, android.content.pm.ApplicationInfo p2, int p3) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public int mergeBehavior() { return 0; }
        public boolean prefersAsyncApply() { return false; }
        public int getActionTag() { return 0; }
        public final void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    }

    private static class ViewGroupActionRemove extends android.widget.RemoteViews.Action {
        ViewGroupActionRemove(int p0) { super(); }
        ViewGroupActionRemove(int p0, int p1) { super(); }
        ViewGroupActionRemove(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public int getActionTag() { return 0; }
        public int mergeBehavior() { return 0; }
    }

    private static class ViewPaddingAction extends android.widget.RemoteViews.Action {
        int left;
        int top;
        int right;
        int bottom;
        public ViewPaddingAction(int p0, int p1, int p2, int p3, int p4) { super(); }
        public ViewPaddingAction(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
    }

    private static class ViewTree {
        public void createTree() {}
        public android.widget.RemoteViews.ViewTree findViewTreeById(int p0) { return null; }
        public android.widget.RemoteViews.ViewTree findViewTreeParentOf(android.widget.RemoteViews.ViewTree p0) { return null; }
        public void replaceView(android.view.View p0) {}
        public <T extends android.view.View> T findViewById(int p0) { return null; }
        public void addChild(android.widget.RemoteViews.ViewTree p0) {}
        public void addChild(android.widget.RemoteViews.ViewTree p0, int p1) {}
        public void removeChildren(int p0, int p1) {}
        public int findChildIndex(java.util.function.Predicate<android.view.View> p0) { return 0; }
        public int findChildIndex(int p0, java.util.function.Predicate<android.view.View> p1) { return 0; }
    }
}
