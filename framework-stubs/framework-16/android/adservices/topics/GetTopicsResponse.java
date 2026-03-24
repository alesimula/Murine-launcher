package android.adservices.topics;

public final class GetTopicsResponse {
    GetTopicsResponse() {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.topics_encryption_enabled")
    @android.annotation.NonNull
    public java.util.List<android.adservices.topics.EncryptedTopic> getEncryptedTopics() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.topics.Topic> getTopics() { return null; }

    public static final class Builder {
        @java.lang.Deprecated
        public Builder(java.util.List<android.adservices.topics.Topic> p0) {}
        @android.annotation.FlaggedApi("com.android.adservices.flags.topics_encryption_enabled")
        public Builder(java.util.List<android.adservices.topics.Topic> p0, java.util.List<android.adservices.topics.EncryptedTopic> p1) {}
        @android.annotation.NonNull
        public android.adservices.topics.GetTopicsResponse build() { return null; }
    }
}
