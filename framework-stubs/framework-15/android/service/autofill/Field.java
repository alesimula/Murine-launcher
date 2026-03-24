package android.service.autofill;

public final class Field {
    Field(android.view.autofill.AutofillValue p0, android.service.autofill.Dataset.DatasetFieldFilter p1, android.service.autofill.Presentations p2) {}
    @android.annotation.Nullable
    public android.view.autofill.AutofillValue getValue() { return null; }
    @android.annotation.Nullable
    public android.service.autofill.Dataset.DatasetFieldFilter getDatasetFieldFilter() { return null; }
    @android.annotation.Nullable
    public java.util.regex.Pattern getFilter() { return null; }
    @android.annotation.Nullable
    public android.service.autofill.Presentations getPresentations() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.service.autofill.Field.Builder setValue(android.view.autofill.AutofillValue p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.Field.Builder setFilter(java.util.regex.Pattern p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.Field.Builder setPresentations(android.service.autofill.Presentations p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.Field build() { return null; }
    }
}
