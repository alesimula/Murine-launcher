package android.window;

public final class TransitionFilter implements android.os.Parcelable {
    public int[] mTypeSet;
    public android.window.TransitionFilter.Requirement[] mRequirements;
    public static final android.os.Parcelable.Creator<android.window.TransitionFilter> CREATOR = null;
    public TransitionFilter() {}
    private TransitionFilter(android.os.Parcel p0) {}
    public boolean matches(android.window.TransitionInfo p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Requirement implements android.os.Parcelable {
        public int mActivityType;
        public int[] mModes;
        public static final android.os.Parcelable.Creator<android.window.TransitionFilter.Requirement> CREATOR = null;
        public Requirement() {}
        private Requirement(android.os.Parcel p0) {}
        boolean matches(android.window.TransitionInfo p0) { return false; }
        boolean matches(android.window.TransitionRequestInfo p0) { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
