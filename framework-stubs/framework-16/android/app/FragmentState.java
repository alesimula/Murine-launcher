package android.app;

final class FragmentState implements android.os.Parcelable {
    final java.lang.String mClassName = null;
    final int mIndex = 0;
    final boolean mFromLayout = false;
    final int mFragmentId = 0;
    final int mContainerId = 0;
    final java.lang.String mTag = null;
    final boolean mRetainInstance = false;
    final boolean mDetached = false;
    final android.os.Bundle mArguments = null;
    final boolean mHidden = false;
    android.os.Bundle mSavedFragmentState;
    android.app.Fragment mInstance;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.FragmentState> CREATOR = null;
    FragmentState(android.app.Fragment p0) {}
    FragmentState(android.os.Parcel p0) {}
    public android.app.Fragment instantiate(android.app.FragmentHostCallback p0, android.app.FragmentContainer p1, android.app.Fragment p2, android.app.FragmentManagerNonConfig p3) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
