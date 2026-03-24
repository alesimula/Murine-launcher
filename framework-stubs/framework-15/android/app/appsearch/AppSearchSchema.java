package android.app.appsearch;

public final class AppSearchSchema implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.AppSearchSchema> CREATOR = null;
    AppSearchSchema() {}
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDescription() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getParentTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.AppSearchSchema.PropertyConfig> getProperties() { return null; }
    @android.annotation.NonNull
    public java.lang.String getSchemaType() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class BooleanPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        BooleanPropertyConfig() { super(); }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
        }
    }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder addParentType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder addProperty(android.app.appsearch.AppSearchSchema.PropertyConfig p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder setDescription(java.lang.String p0) { return null; }
    }

    public static final class BytesPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        BytesPropertyConfig() { super(); }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
        }
    }

    public static final class DocumentPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        DocumentPropertyConfig() { super(); }
        @android.annotation.NonNull
        public java.util.List<java.lang.String> getIndexableNestedProperties() { return null; }
        @android.annotation.NonNull
        public java.lang.String getSchemaType() { return null; }
        public boolean shouldIndexNestedProperties() { return false; }

        public static final class Builder {
            public Builder(java.lang.String p0, java.lang.String p1) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder addIndexableNestedProperties(java.lang.String... p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder addIndexableNestedProperties(java.util.Collection<java.lang.String> p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder addIndexableNestedPropertyPaths(android.app.appsearch.PropertyPath... p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder addIndexableNestedPropertyPaths(java.util.Collection<android.app.appsearch.PropertyPath> p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setShouldIndexNestedProperties(boolean p0) { return null; }
        }
    }

    public static final class DoublePropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        DoublePropertyConfig() { super(); }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
        }
    }

    public static final class EmbeddingPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        public static final int INDEXING_TYPE_NONE = 0;
        public static final int INDEXING_TYPE_SIMILARITY = 1;
        EmbeddingPropertyConfig() { super(); }
        public int getIndexingType() { return 0; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig.Builder setIndexingType(int p0) { return null; }
        }
    }

    public static final class LongPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        public static final int INDEXING_TYPE_NONE = 0;
        public static final int INDEXING_TYPE_RANGE = 1;
        LongPropertyConfig() { super(); }
        public int getIndexingType() { return 0; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setIndexingType(int p0) { return null; }
        }
    }

    public static abstract class PropertyConfig {
        public static final int CARDINALITY_OPTIONAL = 2;
        public static final int CARDINALITY_REPEATED = 1;
        public static final int CARDINALITY_REQUIRED = 3;
        PropertyConfig() {}
        public int getCardinality() { return 0; }
        @android.annotation.NonNull
        public java.lang.String getDescription() { return null; }
        @android.annotation.NonNull
        public java.lang.String getName() { return null; }
    }

    public static final class StringPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        public static final int INDEXING_TYPE_EXACT_TERMS = 1;
        public static final int INDEXING_TYPE_NONE = 0;
        public static final int INDEXING_TYPE_PREFIXES = 2;
        public static final int JOINABLE_VALUE_TYPE_NONE = 0;
        public static final int JOINABLE_VALUE_TYPE_QUALIFIED_ID = 1;
        public static final int TOKENIZER_TYPE_NONE = 0;
        public static final int TOKENIZER_TYPE_PLAIN = 1;
        public static final int TOKENIZER_TYPE_RFC822 = 3;
        public static final int TOKENIZER_TYPE_VERBATIM = 2;
        StringPropertyConfig() { super(); }
        public int getIndexingType() { return 0; }
        public int getJoinableValueType() { return 0; }
        public int getTokenizerType() { return 0; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setIndexingType(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setJoinableValueType(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setTokenizerType(int p0) { return null; }
        }
    }
}
