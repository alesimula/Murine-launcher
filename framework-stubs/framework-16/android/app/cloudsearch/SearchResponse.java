package android.app.cloudsearch;

@android.annotation.SystemApi
public final class SearchResponse implements android.os.Parcelable {
    public static final int SEARCH_STATUS_UNKNOWN = -1;
    public static final int SEARCH_STATUS_OK = 0;
    public static final int SEARCH_STATUS_TIME_OUT = 1;
    public static final int SEARCH_STATUS_NO_INTERNET = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.cloudsearch.SearchResponse> CREATOR = null;
    public int getStatusCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getSource() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.cloudsearch.SearchResult> getSearchResults() { return null; }
    public void setSource(java.lang.String p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        @android.annotation.SystemApi
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.app.cloudsearch.SearchResponse.Builder setStatusCode(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.cloudsearch.SearchResponse.Builder setSource(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.cloudsearch.SearchResponse.Builder setSearchResults(java.util.List<android.app.cloudsearch.SearchResult> p0) { return null; }
        @android.annotation.NonNull
        public android.app.cloudsearch.SearchResponse build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SearchStatusCode {
    }
}
