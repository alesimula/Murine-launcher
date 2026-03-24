package com.android.internal.statusbar;

public final class RegisterStatusBarResult implements android.os.Parcelable {
    public final android.util.ArrayMap<java.lang.String, com.android.internal.statusbar.StatusBarIcon> mIcons = null;
    public final int mDisabledFlags1 = 0;
    public final int mSystemUiVisibility = 0;
    public final boolean mMenuVisible = false;
    public final int mImeWindowVis = 0;
    public final int mImeBackDisposition = 0;
    public final boolean mShowImeSwitcher = false;
    public final int mDisabledFlags2 = 0;
    public final int mFullscreenStackSysUiVisibility = 0;
    public final int mDockedStackSysUiVisibility = 0;
    public final android.os.IBinder mImeToken = null;
    public final android.graphics.Rect mFullscreenStackBounds = null;
    public final android.graphics.Rect mDockedStackBounds = null;
    public final boolean mNavbarColorManagedByIme = false;
    public static final android.os.Parcelable.Creator<com.android.internal.statusbar.RegisterStatusBarResult> CREATOR = null;
    public RegisterStatusBarResult(android.util.ArrayMap<java.lang.String, com.android.internal.statusbar.StatusBarIcon> p0, int p1, int p2, boolean p3, int p4, int p5, boolean p6, int p7, int p8, int p9, android.os.IBinder p10, android.graphics.Rect p11, android.graphics.Rect p12, boolean p13) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
