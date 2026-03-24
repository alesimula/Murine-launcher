package com.android.internal.statusbar;

public final class RegisterStatusBarResult implements android.os.Parcelable {
    public final android.util.ArrayMap<java.lang.String, com.android.internal.statusbar.StatusBarIcon> mIcons = null;
    public final int mDisabledFlags1 = 0;
    public final int mAppearance = 0;
    public final com.android.internal.view.AppearanceRegion[] mAppearanceRegions = null;
    public final int mImeWindowVis = 0;
    public final int mImeBackDisposition = 0;
    public final boolean mShowImeSwitcher = false;
    public final int mDisabledFlags2 = 0;
    public final android.os.IBinder mImeToken = null;
    public final boolean mNavbarColorManagedByIme = false;
    public final int mBehavior = 0;
    public final int mRequestedVisibleTypes = 0;
    public final java.lang.String mPackageName = null;
    public final int mTransientBarTypes = 0;
    public final com.android.internal.statusbar.LetterboxDetails[] mLetterboxDetails = null;
    public static final android.os.Parcelable.Creator<com.android.internal.statusbar.RegisterStatusBarResult> CREATOR = null;
    public RegisterStatusBarResult(android.util.ArrayMap<java.lang.String, com.android.internal.statusbar.StatusBarIcon> p0, int p1, int p2, com.android.internal.view.AppearanceRegion[] p3, int p4, int p5, boolean p6, int p7, android.os.IBinder p8, boolean p9, int p10, int p11, java.lang.String p12, int p13, com.android.internal.statusbar.LetterboxDetails[] p14) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
