package android.media;

public final class MediaRouterClientState implements android.os.Parcelable {
    public final java.util.ArrayList<android.media.MediaRouterClientState.RouteInfo> routes = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.MediaRouterClientState> CREATOR = null;
    public MediaRouterClientState() {}
    MediaRouterClientState(android.os.Parcel p0) {}
    public android.media.MediaRouterClientState.RouteInfo getRoute(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class RouteInfo implements android.os.Parcelable {
        public java.lang.String id;
        public java.lang.String name;
        public java.lang.String description;
        public int supportedTypes;
        public boolean enabled;
        public int statusCode;
        public int playbackType;
        public int playbackStream;
        public int volume;
        public int volumeMax;
        public int volumeHandling;
        public int presentationDisplayId;
        public int deviceType;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.media.MediaRouterClientState.RouteInfo> CREATOR = null;
        public RouteInfo(java.lang.String p0) {}
        public RouteInfo(android.media.MediaRouterClientState.RouteInfo p0) {}
        RouteInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
