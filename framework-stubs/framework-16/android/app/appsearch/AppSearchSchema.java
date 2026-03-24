package android.app.appsearch;

public final class AppSearchSchema implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.AppSearchSchema> CREATOR = null;
    AppSearchSchema() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
    @android.annotation.NonNull
    public java.lang.String getDescription() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_get_parent_types_and_indexable_nested_properties")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getParentTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.AppSearchSchema.PropertyConfig> getProperties() { return null; }
    @android.annotation.NonNull
    public java.lang.String getSchemaType() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
    public static final class BlobHandlePropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        BlobHandlePropertyConfig() { super(); }

        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BlobHandlePropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BlobHandlePropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BlobHandlePropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
        }
    }

    public static final class BooleanPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        BooleanPropertyConfig() { super(); }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_scorable_property")
        public boolean isScoringEnabled() { return false; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_scorable_property")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BooleanPropertyConfig.Builder setScoringEnabled(boolean p0) { return null; }
        }
    }

    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        public Builder(android.app.appsearch.AppSearchSchema p0) {}
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder addParentType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder addProperty(android.app.appsearch.AppSearchSchema.PropertyConfig p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema build() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder clearParentTypes() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder clearProperties() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder setDescription(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchSchema.Builder setSchemaType(java.lang.String p0) { return null; }
    }

    public static final class BytesPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        BytesPropertyConfig() { super(); }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.BytesPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
        }
    }

    public static final class DocumentPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        DocumentPropertyConfig() { super(); }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_get_parent_types_and_indexable_nested_properties")
        @android.annotation.NonNull
        public java.util.List<java.lang.String> getIndexableNestedProperties() { return null; }
        @android.annotation.NonNull
        public java.lang.String getSchemaType() { return null; }
        public boolean shouldIndexNestedProperties() { return false; }

        public static final class Builder {
            public Builder(java.lang.String p0, java.lang.String p1) {}
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_get_parent_types_and_indexable_nested_properties")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder addIndexableNestedProperties(java.lang.String... p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder addIndexableNestedProperties(java.util.Collection<java.lang.String> p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_get_parent_types_and_indexable_nested_properties")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder addIndexableNestedPropertyPaths(android.app.appsearch.PropertyPath... p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_get_parent_types_and_indexable_nested_properties")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder addIndexableNestedPropertyPaths(java.util.Collection<android.app.appsearch.PropertyPath> p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder setShouldIndexNestedProperties(boolean p0) { return null; }
        }
    }

    public static final class DoublePropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        DoublePropertyConfig() { super(); }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_scorable_property")
        public boolean isScoringEnabled() { return false; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_scorable_property")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.DoublePropertyConfig.Builder setScoringEnabled(boolean p0) { return null; }
        }
    }

    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_embedding_property_config")
    public static final class EmbeddingPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        public static final int INDEXING_TYPE_NONE = 0;
        public static final int INDEXING_TYPE_SIMILARITY = 1;
        public static final int QUANTIZATION_TYPE_8_BIT = 1;
        public static final int QUANTIZATION_TYPE_NONE = 0;
        EmbeddingPropertyConfig() { super(); }
        public int getIndexingType() { return 0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_embedding_quantization")
        public int getQuantizationType() { return 0; }

        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_embedding_property_config")
        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig.Builder setIndexingType(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_embedding_quantization")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig.Builder setQuantizationType(int p0) { return null; }
        }
    }

    public static final class LongPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        public static final int INDEXING_TYPE_NONE = 0;
        public static final int INDEXING_TYPE_RANGE = 1;
        LongPropertyConfig() { super(); }
        public int getIndexingType() { return 0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_scorable_property")
        public boolean isScoringEnabled() { return false; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setDescription(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setIndexingType(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_scorable_property")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder setScoringEnabled(boolean p0) { return null; }
        }
    }

    public static abstract class PropertyConfig {
        public static final int CARDINALITY_OPTIONAL = 2;
        public static final int CARDINALITY_REPEATED = 1;
        public static final int CARDINALITY_REQUIRED = 3;
        PropertyConfig() {}
        public int getCardinality() { return 0; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
        @android.annotation.NonNull
        public java.lang.String getDescription() { return null; }
        @android.annotation.NonNull
        public java.lang.String getName() { return null; }
    }

    public static final class StringPropertyConfig extends android.app.appsearch.AppSearchSchema.PropertyConfig {
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_delete_propagation_type")
        public static final int DELETE_PROPAGATION_TYPE_NONE = 0;
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_delete_propagation_type")
        public static final int DELETE_PROPAGATION_TYPE_PROPAGATE_FROM = 1;
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
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_delete_propagation_type")
        public int getDeletePropagationType() { return 0; }
        public int getIndexingType() { return 0; }
        public int getJoinableValueType() { return 0; }
        public int getTokenizerType() { return 0; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig build() { return null; }
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setCardinality(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_delete_propagation_type")
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder setDeletePropagationType(int p0) { return null; }
            @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_description")
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
