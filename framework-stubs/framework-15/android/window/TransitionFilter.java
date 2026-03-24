package android.window;

public final class TransitionFilter implements android.os.Parcelable {
    public static final int CONTAINER_ORDER_ANY = 0;
    public static final int CONTAINER_ORDER_TOP = 1;
    @android.annotation.Nullable
    public int[] mTypeSet;
    public int mFlags;
    public int mNotFlags;
    @android.annotation.Nullable
    public android.window.TransitionFilter.Requirement[] mRequirements;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.TransitionFilter> CREATOR = null;
    public TransitionFilter() {}
    public boolean matches(android.window.TransitionInfo p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static @interface ContainerOrder {
    }

    public static final class Requirement implements android.os.Parcelable {
        public int mActivityType;
        public boolean mMustBeIndependent;
        public boolean mNot;
        public int[] mModes;
        public int mFlags;
        public boolean mMustBeTask;
        @android.window.TransitionFilter.ContainerOrder
        public int mOrder;
        public android.content.ComponentName mTopActivity;
        public android.os.IBinder mLaunchCookie;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.window.TransitionFilter.Requirement> CREATOR = null;
        public Requirement() {}
        boolean matches(android.window.TransitionInfo p0) { return false; }
        boolean matches(android.window.TransitionRequestInfo p0) { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
