package android.app.appsearch;

public final class PutDocumentsRequest {
    PutDocumentsRequest() {}
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.GenericDocument> getGenericDocuments() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_put_documents_request_add_taken_actions")
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.GenericDocument> getTakenActionGenericDocuments() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.PutDocumentsRequest.Builder addGenericDocuments(android.app.appsearch.GenericDocument... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.PutDocumentsRequest.Builder addGenericDocuments(java.util.Collection<? extends android.app.appsearch.GenericDocument> p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_put_documents_request_add_taken_actions")
        @android.annotation.NonNull
        public android.app.appsearch.PutDocumentsRequest.Builder addTakenActionGenericDocuments(android.app.appsearch.GenericDocument... p0) throws android.app.appsearch.exceptions.AppSearchException { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_put_documents_request_add_taken_actions")
        @android.annotation.NonNull
        public android.app.appsearch.PutDocumentsRequest.Builder addTakenActionGenericDocuments(java.util.Collection<? extends android.app.appsearch.GenericDocument> p0) throws android.app.appsearch.exceptions.AppSearchException { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.PutDocumentsRequest build() { return null; }
    }
}
