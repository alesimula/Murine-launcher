package android.hardware.biometrics;

@android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
public final class PromptVerticalListContentView implements android.hardware.biometrics.PromptContentViewParcelable {
    static final int MAX_ITEM_NUMBER = 20;
    static final int MAX_EACH_ITEM_CHARACTER_NUMBER = 640;
    static final int MAX_DESCRIPTION_CHARACTER_NUMBER = 225;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.PromptVerticalListContentView> CREATOR = null;
    public static int getMaxItemCount() { return 0; }
    public static int getMaxEachItemCharacterNumber() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getDescription() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.hardware.biometrics.PromptContentItem> getListItems() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.biometrics.PromptVerticalListContentView.Builder setDescription(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.PromptVerticalListContentView.Builder addListItem(android.hardware.biometrics.PromptContentItem p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.PromptVerticalListContentView.Builder addListItem(android.hardware.biometrics.PromptContentItem p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.PromptVerticalListContentView build() { return null; }
    }
}
