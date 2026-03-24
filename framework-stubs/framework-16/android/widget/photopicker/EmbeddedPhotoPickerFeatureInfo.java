package android.widget.photopicker;

@android.annotation.FlaggedApi("com.android.providers.media.flags.enable_embedded_photopicker")
public final class EmbeddedPhotoPickerFeatureInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo> CREATOR = null;
    EmbeddedPhotoPickerFeatureInfo() {}
    public int describeContents() { return 0; }
    public long getAccentColor() { return 0L; }
    @android.annotation.FlaggedApi("com.android.providers.media.flags.enable_picker_highlight_search_results_apis")
    @android.annotation.NonNull
    public java.lang.String getHighlightAlbumId() { return null; }
    @android.annotation.FlaggedApi("com.android.providers.media.flags.enable_picker_highlight_search_results_apis")
    @android.annotation.NonNull
    public java.lang.String getHighlightSearchMediaTextQuery() { return null; }
    public int getMaxSelectionLimit() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getMimeTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.Uri> getPreSelectedUris() { return null; }
    public int getThemeNightMode() { return 0; }
    public boolean isOrderedSelection() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo build() { return null; }
        @android.annotation.NonNull
        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setAccentColor(long p0) { return null; }
        @android.annotation.FlaggedApi("com.android.providers.media.flags.enable_picker_highlight_search_results_apis")
        @android.annotation.NonNull
        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setHighlightAlbumId(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.providers.media.flags.enable_picker_highlight_search_results_apis")
        @android.annotation.NonNull
        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setHighlightSearchMediaTextQuery(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setMaxSelectionLimit(int p0) { return null; }
        @android.annotation.NonNull
        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setMimeTypes(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setOrderedSelection(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setPreSelectedUris(java.util.List<android.net.Uri> p0) { return null; }
        @android.annotation.NonNull
        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setThemeNightMode(int p0) { return null; }
    }
}
