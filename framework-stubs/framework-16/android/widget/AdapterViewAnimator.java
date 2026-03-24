package android.widget;

public abstract class AdapterViewAnimator extends android.widget.AdapterView<android.widget.Adapter> implements android.widget.RemoteViewsAdapter.RemoteAdapterConnectionCallback, android.widget.Advanceable {
    int mWhichChild;
    boolean mAnimateFirstTime;
    int mActiveOffset;
    int mMaxNumActiveViews;
    java.util.HashMap<java.lang.Integer, android.widget.AdapterViewAnimator.ViewAndMetaData> mViewsMap;
    java.util.ArrayList<java.lang.Integer> mPreviousViews;
    int mCurrentWindowStart;
    int mCurrentWindowEnd;
    int mCurrentWindowStartUnbounded;
    android.widget.AdapterView<android.widget.Adapter>.AdapterDataSetObserver mDataSetObserver;
    android.widget.Adapter mAdapter;
    android.widget.RemoteViewsAdapter mRemoteViewsAdapter;
    boolean mDeferNotifyDataSetChanged;
    boolean mFirstTime;
    boolean mLoopViews;
    int mReferenceChildWidth;
    int mReferenceChildHeight;
    android.animation.ObjectAnimator mInAnimation;
    android.animation.ObjectAnimator mOutAnimation;
    static final int TOUCH_MODE_NONE = 0;
    static final int TOUCH_MODE_DOWN_IN_CURRENT_VIEW = 1;
    static final int TOUCH_MODE_HANDLED = 2;
    public AdapterViewAnimator(android.content.Context p0) { super((android.content.Context)null); }
    public AdapterViewAnimator(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AdapterViewAnimator(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AdapterViewAnimator(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    void configureViewAnimator(int p0, int p1) {}
    void transformViewForTransition(int p0, int p1, android.view.View p2, boolean p3) {}
    android.animation.ObjectAnimator getDefaultInAnimation() { return null; }
    android.animation.ObjectAnimator getDefaultOutAnimation() { return null; }
    @android.view.RemotableViewMethod
    public void setDisplayedChild(int p0) {}
    void applyTransformForChildAtIndex(android.view.View p0, int p1) {}
    public int getDisplayedChild() { return 0; }
    public void showNext() {}
    public void showPrevious() {}
    int modulo(int p0, int p1) { return 0; }
    android.view.View getViewAtRelativeIndex(int p0) { return null; }
    int getNumActiveViews() { return 0; }
    int getWindowSize() { return 0; }
    android.view.ViewGroup.LayoutParams createOrReuseLayoutParams(android.view.View p0) { return null; }
    void refreshChildren() {}
    android.widget.FrameLayout getFrameForChild() { return null; }
    void showOnly(int p0, boolean p1) {}
    void showTapFeedback(android.view.View p0) {}
    void hideTapFeedback(android.view.View p0) {}
    void cancelHandleClick() {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onMeasure(int p0, int p1) {}
    void checkForAndHandleDataChanged() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.view.View getCurrentView() { return null; }
    public android.animation.ObjectAnimator getInAnimation() { return null; }
    public void setInAnimation(android.animation.ObjectAnimator p0) {}
    public android.animation.ObjectAnimator getOutAnimation() { return null; }
    public void setOutAnimation(android.animation.ObjectAnimator p0) {}
    public void setInAnimation(android.content.Context p0, int p1) {}
    public void setOutAnimation(android.content.Context p0, int p1) {}
    public void setAnimateFirstView(boolean p0) {}
    public int getBaseline() { return 0; }
    public android.widget.Adapter getAdapter() { return null; }
    public void setAdapter(android.widget.Adapter p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setRemoteViewsAdapterAsync")
    public void setRemoteViewsAdapter(android.content.Intent p0) {}
    public java.lang.Runnable setRemoteViewsAdapterAsync(android.content.Intent p0) { return null; }
    public void setRemoteViewsAdapter(android.content.Intent p0, boolean p1) {}
    public void setRemoteViewsOnClickHandler(android.widget.RemoteViews.InteractionHandler p0) {}
    public void setSelection(int p0) {}
    public android.view.View getSelectedView() { return null; }
    public void deferNotifyDataSetChanged() {}
    public boolean onRemoteAdapterConnected() { return false; }
    public void onRemoteAdapterDisconnected() {}
    public void advance() {}
    public void fyiWillBeAdvancedByHostKThx() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    final class CheckForTap implements java.lang.Runnable {
        CheckForTap(android.widget.AdapterViewAnimator p0) {}
        public void run() {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        int whichChild;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.widget.AdapterViewAnimator.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0, int p1) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    class ViewAndMetaData {
        android.view.View view;
        int relativeIndex;
        int adapterPosition;
        long itemId;
        ViewAndMetaData(android.widget.AdapterViewAnimator p0, android.view.View p1, int p2, int p3, long p4) {}
    }
}
