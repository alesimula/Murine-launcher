package android.view;

public class ScrollCaptureResponse implements android.os.Parcelable {
    private java.lang.String mDescription;
    private android.view.IScrollCaptureConnection mConnection;
    private android.graphics.Rect mWindowBounds;
    private android.graphics.Rect mBoundsInWindow;
    private java.lang.String mWindowTitle;
    private java.util.ArrayList<java.lang.String> mMessages;
    public static final android.os.Parcelable.Creator<android.view.ScrollCaptureResponse> CREATOR = null;
    public boolean isConnected() { return false; }
    public void close() {}
    ScrollCaptureResponse(java.lang.String p0, android.view.IScrollCaptureConnection p1, android.graphics.Rect p2, android.graphics.Rect p3, java.lang.String p4, java.util.ArrayList<java.lang.String> p5) {}
    public java.lang.String getDescription() { return null; }
    public android.view.IScrollCaptureConnection getConnection() { return null; }
    public android.graphics.Rect getWindowBounds() { return null; }
    public android.graphics.Rect getBoundsInWindow() { return null; }
    public java.lang.String getWindowTitle() { return null; }
    public java.util.ArrayList<java.lang.String> getMessages() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected ScrollCaptureResponse(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    public static class Builder {
        private java.lang.String mDescription;
        private android.view.IScrollCaptureConnection mConnection;
        private android.graphics.Rect mWindowBounds;
        private android.graphics.Rect mBoundsInWindow;
        private java.lang.String mWindowTitle;
        private java.util.ArrayList<java.lang.String> mMessages;
        private long mBuilderFieldsSet;
        public Builder() {}
        public android.view.ScrollCaptureResponse.Builder setDescription(java.lang.String p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setConnection(android.view.IScrollCaptureConnection p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setWindowBounds(android.graphics.Rect p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setBoundsInWindow(android.graphics.Rect p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setWindowTitle(java.lang.String p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder setMessages(java.util.ArrayList<java.lang.String> p0) { return null; }
        public android.view.ScrollCaptureResponse.Builder addMessage(java.lang.String p0) { return null; }
        public android.view.ScrollCaptureResponse build() { return null; }
        private void checkNotUsed() {}
    }
}
