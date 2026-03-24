package android.app.appsearch;

public final class AppSearchSchema {
    AppSearchSchema() {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public java.lang.String getSchemaType() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.AppSearchSchema.PropertyConfig> getProperties() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

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
        public int getTokenizerType() { return 0; }
        public int getJoinableValueType() { return 0; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setIndexingType(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setTokenizerType(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setJoinableValueType(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig build() { return null; }
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
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setIndexingType(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig build() { return null; }
        }
    }

    public static final class DoublePropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        DoublePropertyConfig() { super(); }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig build() { return null; }
        }
    }

    public static final class DocumentPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        DocumentPropertyConfig() { super(); }
        @android.annotation.NonNull
        public java.lang.String getSchemaType() { return null; }
        public boolean shouldIndexNestedProperties() { return false; }

        public static final class Builder {
            public Builder(java.lang.String p0, java.lang.String p1) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setShouldIndexNestedProperties(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig build() { return null; }
        }
    }

    public static abstract class PropertyConfig {
        public static final int CARDINALITY_OPTIONAL = 2;
        public static final int CARDINALITY_REPEATED = 1;
        public static final int CARDINALITY_REQUIRED = 3;
        PropertyConfig() {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        @android.annotation.NonNull
        public java.lang.String getName() { return null; }
        public int getCardinality() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class BytesPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        BytesPropertyConfig() { super(); }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig build() { return null; }
        }
    }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder addProperty(android.app.appsearch.AppSearchSchema.PropertyConfig p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema build() { return null; }
    }

    public static final class BooleanPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        BooleanPropertyConfig() { super(); }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig build() { return null; }
        }
    }
}
