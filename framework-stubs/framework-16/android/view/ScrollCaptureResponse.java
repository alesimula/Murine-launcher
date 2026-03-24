package android.view;

public class ScrollCaptureResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.ScrollCaptureResponse> CREATOR = null;
    public boolean isConnected() { return false; }
    public void close() {}
    ScrollCaptureResponse(java.lang.String p0, android.view.IScrollCaptureConnection p1, android.graphics.Rect p2, android.graphics.Rect p3, java.lang.String p4, java.lang.String p5, java.util.ArrayList<java.lang.String> p6) {}
    @android.annotation.NonNull
    public java.lang.String getDescription() { return null; }
    @android.annotation.Nullable
    public android.view.IScrollCaptureConnection getConnection() { return null; }
    @android.annotation.Nullable
    public android.graphics.Rect getWindowBounds() { return null; }
    @android.annotation.Nullable
    public android.graphics.Rect getBoundsInWindow() { return null; }
    @android.annotation.Nullable
    public java.lang.String getWindowTitle() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.util.ArrayList<java.lang.String> getMessages() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected ScrollCaptureResponse(android.os.Parcel p0) {}

    public static class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.view.ScrollCaptureResponse.Builder setDescription(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.ScrollCaptureResponse.Builder setConnection(android.view.IScrollCaptureConnection p0) { return null; }
        @android.annotation.NonNull
        public android.view.ScrollCaptureResponse.Builder setWindowBounds(android.graphics.Rect p0) { return null; }
        @android.annotation.NonNull
        public android.view.ScrollCaptureResponse.Builder setBoundsInWindow(android.graphics.Rect p0) { return null; }
        @android.annotation.NonNull
        public android.view.ScrollCaptureResponse.Builder setWindowTitle(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.ScrollCaptureResponse.Builder setPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.ScrollCaptureResponse.Builder setMessages(java.util.ArrayList<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.view.ScrollCaptureResponse.Builder addMessage(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.ScrollCaptureResponse build() { return null; }
    }
}
