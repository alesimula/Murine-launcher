package android.window;

public final class OnBackInvokedCallbackInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.OnBackInvokedCallbackInfo> CREATOR = null;
    public OnBackInvokedCallbackInfo(android.window.IOnBackInvokedCallback p0, int p1, boolean p2, int p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isSystemCallback() { return false; }
    @android.annotation.NonNull
    public android.window.IOnBackInvokedCallback getCallback() { return null; }
    public int getPriority() { return 0; }
    public boolean isAnimationCallback() { return false; }
    public int getOverrideBehavior() { return 0; }
    public java.lang.String toString() { return null; }
}
