package android.app.contentsuggestions;

@android.annotation.SystemApi
public final class SelectionsRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.contentsuggestions.SelectionsRequest> CREATOR = null;
    public int getTaskId() { return 0; }
    @android.annotation.Nullable
    public android.graphics.Point getInterestPoint() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.app.contentsuggestions.SelectionsRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.contentsuggestions.SelectionsRequest.Builder setInterestPoint(android.graphics.Point p0) { return null; }
        @android.annotation.NonNull
        public android.app.contentsuggestions.SelectionsRequest build() { return null; }
    }
}
