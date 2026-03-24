package android.app.appsearch;

public final class AppSearchSchema {
    private static final java.lang.String SCHEMA_TYPE_FIELD = "schemaType";
    private static final java.lang.String PROPERTIES_FIELD = "properties";
    private final android.os.Bundle mBundle = null;
    public AppSearchSchema(android.os.Bundle p0) {}
    public android.os.Bundle getBundle() { return null; }
    public java.lang.String toString() { return null; }
    private void appendAppSearchSchemaString(android.app.appsearch.util.IndentingStringBuilder p0) {}
    public java.lang.String getSchemaType() { return null; }
    public java.util.List<android.app.appsearch.AppSearchSchema.PropertyConfig> getProperties() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class BooleanPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        BooleanPropertyConfig(android.os.Bundle p0) { super(null); }

        public static final class Builder {
            private final java.lang.String mPropertyName = null;
            private int mCardinality;
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig build() { return null; }
        }
    }

    public static final class Builder {
        private final java.lang.String mSchemaType = null;
        private java.util.ArrayList<android.os.Bundle> mPropertyBundles;
        private final java.util.Set<java.lang.String> mPropertyNames = null;
        private boolean mBuilt;
        public Builder(java.lang.String p0) {}
        public android.app.appsearch.AppSearchSchema.Builder addProperty(android.app.appsearch.AppSearchSchema.PropertyConfig p0) { return null; }
        public android.app.appsearch.AppSearchSchema build() { return null; }
        private void resetIfBuilt() {}
    }

    public static final class BytesPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        BytesPropertyConfig(android.os.Bundle p0) { super(null); }

        public static final class Builder {
            private final java.lang.String mPropertyName = null;
            private int mCardinality;
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig build() { return null; }
        }
    }

    public static final class DocumentPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        private static final java.lang.String SCHEMA_TYPE_FIELD = "schemaType";
        private static final java.lang.String INDEX_NESTED_PROPERTIES_FIELD = "indexNestedProperties";
        DocumentPropertyConfig(android.os.Bundle p0) { super(null); }
        public java.lang.String getSchemaType() { return null; }
        public boolean shouldIndexNestedProperties() { return false; }
        void appendDocumentPropertyConfigFields(android.app.appsearch.util.IndentingStringBuilder p0) {}

        public static final class Builder {
            private final java.lang.String mPropertyName = null;
            private final java.lang.String mSchemaType = null;
            private int mCardinality;
            private boolean mShouldIndexNestedProperties;
            public Builder(java.lang.String p0, java.lang.String p1) {}
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setShouldIndexNestedProperties(boolean p0) { return null; }
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig build() { return null; }
        }
    }

    public static final class DoublePropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        DoublePropertyConfig(android.os.Bundle p0) { super(null); }

        public static final class Builder {
            private final java.lang.String mPropertyName = null;
            private int mCardinality;
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig build() { return null; }
        }
    }

    public static final class LongPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        LongPropertyConfig(android.os.Bundle p0) { super(null); }

        public static final class Builder {
            private final java.lang.String mPropertyName = null;
            private int mCardinality;
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig build() { return null; }
        }
    }

    public static abstract class PropertyConfig {
        static final java.lang.String NAME_FIELD = "name";
        static final java.lang.String DATA_TYPE_FIELD = "dataType";
        static final java.lang.String CARDINALITY_FIELD = "cardinality";
        public static final int DATA_TYPE_STRING = 1;
        public static final int DATA_TYPE_LONG = 2;
        public static final int DATA_TYPE_DOUBLE = 3;
        public static final int DATA_TYPE_BOOLEAN = 4;
        public static final int DATA_TYPE_BYTES = 5;
        public static final int DATA_TYPE_DOCUMENT = 6;
        public static final int CARDINALITY_REPEATED = 1;
        public static final int CARDINALITY_OPTIONAL = 2;
        public static final int CARDINALITY_REQUIRED = 3;
        final android.os.Bundle mBundle = null;
        private java.lang.Integer mHashCode;
        PropertyConfig(android.os.Bundle p0) {}
        public java.lang.String toString() { return null; }
        void appendPropertyConfigString(android.app.appsearch.util.IndentingStringBuilder p0) {}
        public java.lang.String getName() { return null; }
        public int getDataType() { return 0; }
        public int getCardinality() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public static android.app.appsearch.AppSearchSchema.PropertyConfig fromBundle(android.os.Bundle p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Cardinality {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DataType {
        }
    }

    public static final class StringPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        private static final java.lang.String INDEXING_TYPE_FIELD = "indexingType";
        private static final java.lang.String TOKENIZER_TYPE_FIELD = "tokenizerType";
        public static final int INDEXING_TYPE_NONE = 0;
        public static final int INDEXING_TYPE_EXACT_TERMS = 1;
        public static final int INDEXING_TYPE_PREFIXES = 2;
        public static final int TOKENIZER_TYPE_NONE = 0;
        public static final int TOKENIZER_TYPE_PLAIN = 1;
        StringPropertyConfig(android.os.Bundle p0) { super(null); }
        public int getIndexingType() { return 0; }
        public int getTokenizerType() { return 0; }
        void appendStringPropertyConfigFields(android.app.appsearch.util.IndentingStringBuilder p0) {}

        public static final class Builder {
            private final java.lang.String mPropertyName = null;
            private int mCardinality;
            private int mIndexingType;
            private int mTokenizerType;
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setCardinality(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setIndexingType(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setTokenizerType(int p0) { return null; }
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface IndexingType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface TokenizerType {
        }
    }
}
