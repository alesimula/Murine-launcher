package android.app;

final class FragmentManagerState implements android.os.Parcelable {
    android.app.FragmentState[] mActive;
    int[] mAdded;
    android.app.BackStackState[] mBackStack;
    int mPrimaryNavActiveIndex;
    int mNextFragmentIndex;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.FragmentManagerState> CREATOR = null;
    public FragmentManagerState() {}
    public FragmentManagerState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
