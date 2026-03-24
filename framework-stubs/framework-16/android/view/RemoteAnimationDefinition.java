package android.view;

public class RemoteAnimationDefinition implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.RemoteAnimationDefinition> CREATOR = null;
    public RemoteAnimationDefinition() {}
    public void addRemoteAnimation(int p0, int p1, android.view.RemoteAnimationAdapter p2) {}
    public void addRemoteAnimation(int p0, android.view.RemoteAnimationAdapter p1) {}
    public boolean hasTransition(int p0, android.util.ArraySet<java.lang.Integer> p1) { return false; }
    @android.annotation.Nullable
    public android.view.RemoteAnimationAdapter getAdapter(int p0, android.util.ArraySet<java.lang.Integer> p1) { return null; }
    public RemoteAnimationDefinition(android.os.Parcel p0) {}
    public void setCallingPidUid(int p0, int p1) {}
    public void linkToDeath(android.os.IBinder.DeathRecipient p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class RemoteAnimationAdapterEntry implements android.os.Parcelable {
        final android.view.RemoteAnimationAdapter adapter = null;
        final int activityTypeFilter = 0;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.RemoteAnimationDefinition.RemoteAnimationAdapterEntry> CREATOR = null;
        RemoteAnimationAdapterEntry(android.view.RemoteAnimationAdapter p0, int p1) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }
}
