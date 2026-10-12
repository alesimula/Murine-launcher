// SPDX-License-Identifier: Apache-2.0

#include <jni.h>

#include <atomic>
#include <cstdio>
#include <new>
#include <string>
#include <vector>

#include "whisper.h"

#ifdef __ANDROID__
#include <android/log.h>
#endif

namespace {

constexpr const char *kTag = "MurineWhisper";

struct Session {
    whisper_context *ctx = nullptr;
    std::atomic<bool> abortRequested{false};
};

void logWarningsAndErrors(ggml_log_level level, const char *text, void *) {
    if (level != GGML_LOG_LEVEL_WARN && level != GGML_LOG_LEVEL_ERROR) return;
#ifdef __ANDROID__
    __android_log_write(level == GGML_LOG_LEVEL_ERROR ? ANDROID_LOG_ERROR : ANDROID_LOG_WARN, kTag, text);
#else
    fprintf(stderr, "%s: %s", kTag, text);
#endif
}

bool abortCallback(void *data) {
    return static_cast<Session *>(data)->abortRequested.load(std::memory_order_relaxed);
}

Session *toSession(jlong handle) {
    return reinterpret_cast<Session *>(static_cast<intptr_t>(handle));
}

}

extern "C" JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *, void *) {
    whisper_log_set(logWarningsAndErrors, nullptr);
    return JNI_VERSION_1_6;
}

extern "C" JNIEXPORT jlong JNICALL
Java_app_murinelauncher_voice_WhisperNative_nativeOpen(JNIEnv *env, jclass, jstring jpath) {
    const char *path = env->GetStringUTFChars(jpath, nullptr);
    if (path == nullptr) return 0;

    whisper_context *ctx = nullptr;
    try {
        whisper_context_params params = whisper_context_default_params();
        params.use_gpu = false;
        params.flash_attn = true;
        ctx = whisper_init_from_file_with_params(path, params);
    } catch (...) {
        ctx = nullptr;
    }
    env->ReleaseStringUTFChars(jpath, path);
    if (ctx == nullptr) return 0;

    auto *session = new (std::nothrow) Session();
    if (session == nullptr) {
        whisper_free(ctx);
        return 0;
    }
    session->ctx = ctx;
    return static_cast<jlong>(reinterpret_cast<intptr_t>(session));
}

// Raw UTF-8 bytes: token pieces are not always valid modified UTF-8 for NewStringUTF
extern "C" JNIEXPORT jbyteArray JNICALL
Java_app_murinelauncher_voice_WhisperNative_nativeTranscribe(
        JNIEnv *env, jclass, jlong handle, jfloatArray samples, jint count, jstring jlanguage,
        jint audioCtx, jint threads, jint maxTokens) {
    Session *session = toSession(handle);
    if (session == nullptr || session->ctx == nullptr || samples == nullptr) return nullptr;
    if (count <= 0 || count > env->GetArrayLength(samples)) return nullptr;
    if (session->abortRequested.load()) return nullptr;

    std::string language = "auto";
    if (jlanguage != nullptr) {
        const char *lang = env->GetStringUTFChars(jlanguage, nullptr);
        if (lang == nullptr) return nullptr;
        language = lang;
        env->ReleaseStringUTFChars(jlanguage, lang);
    }

    std::string text;
    bool ok = false;
    try {
        std::vector<float> pcm(static_cast<size_t>(count));
        env->GetFloatArrayRegion(samples, 0, count, pcm.data());

        whisper_full_params params = whisper_full_default_params(WHISPER_SAMPLING_GREEDY);
        params.n_threads = threads > 0 ? threads : 1;
        params.translate = false;
        params.language = language.c_str();
        params.detect_language = false;
        params.no_context = true;
        params.no_timestamps = true;
        params.single_segment = true;
        params.print_special = false;
        params.print_progress = false;
        params.print_realtime = false;
        params.print_timestamps = false;
        params.suppress_blank = true;
        params.suppress_nst = true;
        params.temperature = 0.0f;
        params.temperature_inc = 0.0f;
        params.greedy.best_of = 1;
        params.max_tokens = maxTokens > 0 ? maxTokens : 0;
        params.audio_ctx = audioCtx > 0 ? audioCtx : 0;
        params.abort_callback = abortCallback;
        params.abort_callback_user_data = session;

        if (whisper_full(session->ctx, params, pcm.data(), count) == 0 && !session->abortRequested.load()) {
            const int segments = whisper_full_n_segments(session->ctx);
            for (int i = 0; i < segments; ++i) {
                const char *segment = whisper_full_get_segment_text(session->ctx, i);
                if (segment != nullptr) text += segment;
            }
            ok = true;
        }
    } catch (...) {
        ok = false;
    }
    if (!ok) return nullptr;

    jbyteArray out = env->NewByteArray(static_cast<jsize>(text.size()));
    if (out == nullptr) return nullptr;
    env->SetByteArrayRegion(out, 0, static_cast<jsize>(text.size()),
            reinterpret_cast<const jbyte *>(text.data()));
    return out;
}

extern "C" JNIEXPORT void JNICALL
Java_app_murinelauncher_voice_WhisperNative_nativeAbort(JNIEnv *, jclass, jlong handle) {
    Session *session = toSession(handle);
    if (session != nullptr) session->abortRequested.store(true);
}

extern "C" JNIEXPORT void JNICALL
Java_app_murinelauncher_voice_WhisperNative_nativeClose(JNIEnv *, jclass, jlong handle) {
    Session *session = toSession(handle);
    if (session == nullptr) return;
    if (session->ctx != nullptr) whisper_free(session->ctx);
    session->ctx = nullptr;
    delete session;
}
