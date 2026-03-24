package android.view;

public abstract class AbsSavedState implements android.os.Parcelable {
    public static final android.view.AbsSavedState EMPTY_STATE = null;
    private final android.os.Parcelable mSuperState = null;
    public static final android.os.Parcelable.Creator<android.view.AbsSavedState> CREATOR = null;
    private AbsSavedState() {}
    protected AbsSavedState(android.os.Parcelable p0) {}
    protected AbsSavedState(android.os.Parcel p0) {}
    protected AbsSavedState(android.os.Parcel p0, java.lang.ClassLoader p1) {}
    public final android.os.Parcelable getSuperState() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
