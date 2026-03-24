package com.android.net.module.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface VisibleForTesting {
    java.lang.String visibility() default "";

    public static class Visibility {
        public Visibility() {}
    }
}
