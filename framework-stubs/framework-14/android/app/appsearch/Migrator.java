package android.app.appsearch;

public abstract class Migrator {
    public Migrator() {}
    public abstract boolean shouldMigrate(int p0, int p1);
    @android.annotation.NonNull
    public abstract android.app.appsearch.GenericDocument onUpgrade(int p0, int p1, android.app.appsearch.GenericDocument p2);
    @android.annotation.NonNull
    public abstract android.app.appsearch.GenericDocument onDowngrade(int p0, int p1, android.app.appsearch.GenericDocument p2);
}
