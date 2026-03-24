package android.window;

public final class BackNavigationInfo implements android.os.Parcelable {
    public static final int TYPE_UNDEFINED = -1;
    public static final int TYPE_DIALOG_CLOSE = 0;
    public static final int TYPE_RETURN_TO_HOME = 1;
    public static final int TYPE_CROSS_ACTIVITY = 2;
    public static final int TYPE_CROSS_TASK = 3;
    public static final int TYPE_CALLBACK = 4;
    public static final java.lang.String KEY_TRIGGER_BACK = "TriggerBack";
    public static final android.os.Parcelable.Creator<android.window.BackNavigationInfo> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.window.BackNavigationInfo.BackTargetType
    public int getType() { return 0; }
    public android.window.IOnBackInvokedCallback getOnBackInvokedCallback() { return null; }
    public boolean isPrepareRemoteAnimation() { return false; }
    public boolean isAnimationCallback() { return false; }
    public void onBackNavigationFinished(boolean p0) {}
    public android.window.BackNavigationInfo.CustomAnimationInfo getCustomAnimationInfo() { return null; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.lang.String typeToString(int p0) { return null; }

    public static @interface BackTargetType {
    }

    public static class Builder {
        public Builder() {}
        public android.window.BackNavigationInfo.Builder setType(int p0) { return null; }
        public android.window.BackNavigationInfo.Builder setOnBackNavigationDone(android.os.RemoteCallback p0) { return null; }
        public android.window.BackNavigationInfo.Builder setOnBackInvokedCallback(android.window.IOnBackInvokedCallback p0) { return null; }
        public android.window.BackNavigationInfo.Builder setPrepareRemoteAnimation(boolean p0) { return null; }
        public android.window.BackNavigationInfo.Builder setWindowAnimations(java.lang.String p0, int p1) { return null; }
        public android.window.BackNavigationInfo.Builder setCustomAnimation(java.lang.String p0, int p1, int p2, int p3) { return null; }
        public android.window.BackNavigationInfo.Builder setAnimationCallback(boolean p0) { return null; }
        public android.window.BackNavigationInfo build() { return null; }
    }

    public static final class CustomAnimationInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.BackNavigationInfo.CustomAnimationInfo> CREATOR = null;
        public java.lang.String getPackageName() { return null; }
        public int getWindowAnimations() { return 0; }
        public int getCustomExitAnim() { return 0; }
        public int getCustomEnterAnim() { return 0; }
        public int getCustomBackground() { return 0; }
        public CustomAnimationInfo(java.lang.String p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
