package android.media;

public final class Session2CommandGroup implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.Session2CommandGroup> CREATOR = null;
    Session2CommandGroup() {}
    public boolean hasCommand(android.media.Session2Command p0) { return false; }
    public boolean hasCommand(int p0) { return false; }
    @android.annotation.NonNull
    public java.util.Set<android.media.Session2Command> getCommands() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.media.Session2CommandGroup p0) {}
        @android.annotation.NonNull
        public android.media.Session2CommandGroup.Builder addCommand(android.media.Session2Command p0) { return null; }
        @android.annotation.NonNull
        public android.media.Session2CommandGroup.Builder removeCommand(android.media.Session2Command p0) { return null; }
        @android.annotation.NonNull
        public android.media.Session2CommandGroup build() { return null; }
    }
}
