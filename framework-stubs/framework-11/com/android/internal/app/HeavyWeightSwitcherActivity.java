package com.android.internal.app;

public class HeavyWeightSwitcherActivity extends android.app.Activity {
    public static final java.lang.String KEY_INTENT = "intent";
    public static final java.lang.String KEY_HAS_RESULT = "has_result";
    public static final java.lang.String KEY_CUR_APP = "cur_app";
    public static final java.lang.String KEY_CUR_TASK = "cur_task";
    public static final java.lang.String KEY_NEW_APP = "new_app";
    android.content.IntentSender mStartIntent;
    boolean mHasResult;
    java.lang.String mCurApp;
    int mCurTask;
    java.lang.String mNewApp;
    private android.view.View.OnClickListener mSwitchOldListener;
    private android.view.View.OnClickListener mSwitchNewListener;
    public HeavyWeightSwitcherActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    void setText(int p0, java.lang.CharSequence p1) {}
    void setDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    void setIconAndText(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5, int p6) {}
}
