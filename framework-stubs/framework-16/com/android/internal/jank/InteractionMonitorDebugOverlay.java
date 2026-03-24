package com.android.internal.jank;

class InteractionMonitorDebugOverlay {
    InteractionMonitorDebugOverlay(android.app.Application p0, android.os.Handler p1, int p2, double p3) {}
    void onTrackerAdded(int p0, int p1) {}
    void onTrackerRemoved(int p0, int p1, int p2) {}
    void dispose() {}

    private class DebugOverlayView extends android.view.View {
        final int mPadding = 0;
        final int mPackageNameFontSize = 0;
        final int mCujFontSize = 0;
        final float mCujNameTextHeight = 0.0f;
        final float mCujStatusWidth = 0.0f;
        final float mPackageNameTextHeight = 0.0f;
        final float mPackageNameWidth = 0.0f;
        DebugOverlayView() { super((android.content.Context)null); }
        protected void onDraw(android.graphics.Canvas p0) {}
    }

    private static class TrackerState {
        final int mCookie = 0;
        final int mCuj = 0;
        int mState;
    }
}
