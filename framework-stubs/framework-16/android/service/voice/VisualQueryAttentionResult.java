package android.service.voice;

@android.annotation.SystemApi
@android.annotation.SuppressLint("UnflaggedApi")
public final class VisualQueryAttentionResult implements android.os.Parcelable {
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final int INTERACTION_INTENTION_AUDIO_VISUAL = 0;
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final int INTERACTION_INTENTION_VISUAL_ACCESSIBILITY = 1;
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.voice.VisualQueryAttentionResult> CREATOR = null;
    public android.service.voice.VisualQueryAttentionResult.Builder buildUpon() { return null; }
    public static java.lang.String interactionIntentionToString(int p0) { return null; }
    VisualQueryAttentionResult(int p0, int p1) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public int getInteractionIntention() { return 0; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public int getEngagementLevel() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public int describeContents() { return 0; }
    VisualQueryAttentionResult(android.os.Parcel p0) {}

    @android.annotation.SuppressLint("UnflaggedApi")
    public static final class Builder {
        @android.annotation.SuppressLint("UnflaggedApi")
        public Builder() {}
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.NonNull
        public android.service.voice.VisualQueryAttentionResult.Builder setInteractionIntention(int p0) { return null; }
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.NonNull
        public android.service.voice.VisualQueryAttentionResult.Builder setEngagementLevel(int p0) { return null; }
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.NonNull
        public android.service.voice.VisualQueryAttentionResult build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractionIntention {
    }
}
