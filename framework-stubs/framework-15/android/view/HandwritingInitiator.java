package android.view;

public class HandwritingInitiator {
    @android.annotation.Nullable
    public java.lang.ref.WeakReference<android.view.View> mConnectedView;
    @android.annotation.Nullable
    public java.lang.ref.WeakReference<android.view.View> mFocusedView;
    public HandwritingInitiator(android.view.ViewConfiguration p0, android.view.inputmethod.InputMethodManager p1) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void onDelegateViewFocused(android.view.View p0) {}
    public void onInputConnectionCreated(android.view.View p0) {}
    public void onEditorFocused(android.view.View p0) {}
    public void onInputConnectionClosed(android.view.View p0) {}
    public void clearFocusedView(android.view.View p0) {}
    public boolean updateFocusedView(android.view.View p0) { return false; }
    public void startHandwriting(android.view.View p0) {}
    public boolean tryAcceptStylusHandwritingDelegation(android.view.View p0) { return false; }
    public void updateHandwritingAreasForView(android.view.View p0) {}
    public android.view.PointerIcon onResolvePointerIcon(android.content.Context p0, android.view.MotionEvent p1) { return null; }

    private class DelegationCallback implements android.view.inputmethod.ConnectionlessHandwritingCallback {
        public void onResult(java.lang.CharSequence p0) {}
        public void onError(int p0) {}
    }

    public static class HandwritableViewInfo {
        final java.lang.ref.WeakReference<android.view.View> mViewRef = null;
        android.graphics.Rect mHandwritingArea;
        public boolean mIsDirty;
        public HandwritableViewInfo(android.view.View p0) {}
        @android.annotation.Nullable
        public android.view.View getView() { return null; }
        @android.annotation.Nullable
        public android.graphics.Rect getHandwritingArea() { return null; }
        public boolean update() { return false; }
    }

    public static class HandwritingAreaTracker {
        public HandwritingAreaTracker() {}
        public void updateHandwritingAreaForView(android.view.View p0) {}
        @android.annotation.NonNull
        public java.util.List<android.view.HandwritingInitiator.HandwritableViewInfo> computeViewInfos() { return null; }
    }

    private static class State {
    }
}
