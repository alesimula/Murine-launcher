package android.app;

final class BackStackState implements android.os.Parcelable {
    final int[] mOps = null;
    final int mTransition = 0;
    final int mTransitionStyle = 0;
    final java.lang.String mName = null;
    final int mIndex = 0;
    final int mBreadCrumbTitleRes = 0;
    final java.lang.CharSequence mBreadCrumbTitleText = null;
    final int mBreadCrumbShortTitleRes = 0;
    final java.lang.CharSequence mBreadCrumbShortTitleText = null;
    final java.util.ArrayList<java.lang.String> mSharedElementSourceNames = null;
    final java.util.ArrayList<java.lang.String> mSharedElementTargetNames = null;
    final boolean mReorderingAllowed = false;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.BackStackState> CREATOR = null;
    public BackStackState(android.app.FragmentManagerImpl p0, android.app.BackStackRecord p1) {}
    public BackStackState(android.os.Parcel p0) {}
    public android.app.BackStackRecord instantiate(android.app.FragmentManagerImpl p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
