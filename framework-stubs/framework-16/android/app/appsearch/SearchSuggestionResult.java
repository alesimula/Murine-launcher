package android.app.appsearch;

public final class SearchSuggestionResult implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.SearchSuggestionResult> CREATOR = null;
    SearchSuggestionResult() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getSuggestedResult() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionResult build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SearchSuggestionResult.Builder setSuggestedResult(java.lang.String p0) { return null; }
    }
}
