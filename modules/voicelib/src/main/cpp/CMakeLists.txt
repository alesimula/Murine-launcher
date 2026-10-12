cmake_minimum_required(VERSION 3.22.1)
project(murine_voice C CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_POSITION_INDEPENDENT_CODE ON)

if (NOT CMAKE_BUILD_TYPE)
    set(CMAKE_BUILD_TYPE Release)
endif ()

set(WHISPER_DIR ${CMAKE_CURRENT_SOURCE_DIR}/../../../whisper.cpp)
if (NOT EXISTS ${WHISPER_DIR}/CMakeLists.txt)
    message(FATAL_ERROR "whisper.cpp sources missing at ${WHISPER_DIR}: run 'git submodule update --init'")
endif ()

set(WHISPER_OPTIONS
        -DBUILD_SHARED_LIBS=OFF
        -DCMAKE_POSITION_INDEPENDENT_CODE=ON
        -DWHISPER_BUILD_TESTS=OFF
        -DWHISPER_BUILD_EXAMPLES=OFF
        -DWHISPER_BUILD_SERVER=OFF
        -DWHISPER_CURL=OFF
        -DWHISPER_SDL2=OFF
        -DWHISPER_ALL_WARNINGS=OFF
        -DGGML_NATIVE=OFF
        -DGGML_OPENMP=OFF
        -DGGML_BACKEND_DL=OFF
        -DGGML_CPU=ON
        -DGGML_BLAS=OFF
        -DGGML_METAL=OFF
        -DGGML_VULKAN=OFF
        -DGGML_OPENCL=OFF
        -DGGML_LLAMAFILE=ON
)

if (ANDROID AND ANDROID_ABI STREQUAL "x86_64")
    list(APPEND WHISPER_OPTIONS
            -DGGML_SSE42=ON -DGGML_AVX=OFF -DGGML_AVX2=OFF -DGGML_FMA=OFF -DGGML_F16C=OFF
            -DGGML_BMI2=OFF -DGGML_AVX512=OFF -DGGML_AVX_VNNI=OFF)
elseif (ANDROID AND ANDROID_ABI STREQUAL "armeabi-v7a")
    # llamafile needs FP16 NEON loads, which armeabi-v7a does not guarantee
    list(APPEND WHISPER_OPTIONS -DGGML_LLAMAFILE=OFF)
endif ()

foreach (opt ${WHISPER_OPTIONS})
    string(REGEX MATCH "^-D([^=]+)=(.*)$" _ ${opt})
    set(${CMAKE_MATCH_1} ${CMAKE_MATCH_2} CACHE BOOL "" FORCE)
endforeach ()

if (CMAKE_CXX_COMPILER_ID MATCHES "Clang")
    set(LTO_FLAG -flto=thin)
endif ()
set(OPT_FLAGS -O3 ${LTO_FLAG} -fvisibility=hidden -fvisibility-inlines-hidden -ffunction-sections -fdata-sections)
add_compile_options("$<$<NOT:$<CONFIG:Debug>>:${OPT_FLAGS}>")

add_subdirectory(${WHISPER_DIR} whisper EXCLUDE_FROM_ALL)

function(murine_voice_library target)
    add_library(${target} SHARED ${CMAKE_CURRENT_SOURCE_DIR}/murine_whisper_jni.cpp)
    target_compile_options(${target} PRIVATE -Wall -Wextra)
    target_link_options(${target} PRIVATE
            -Wl,--gc-sections
            -Wl,--exclude-libs,ALL
            -Wl,--as-needed
            "$<$<NOT:$<CONFIG:Debug>>:${LTO_FLAG};-O3>"
            # 16 KB page alignment, required on 16 KB page size devices
            -Wl,-z,max-page-size=16384
            -Wl,-z,common-page-size=16384)
    if (ANDROID)
        target_link_libraries(${target} PRIVATE log)
    else ()
        find_package(JNI REQUIRED)
        target_include_directories(${target} PRIVATE ${JNI_INCLUDE_DIRS})
    endif ()
endfunction()

murine_voice_library(murine_whisper)
target_link_libraries(murine_whisper PRIVATE whisper)

if (ANDROID AND ANDROID_ABI STREQUAL "arm64-v8a")
    # ggml picks its CPU kernels at compile time, so the dotprod copy needs its own build tree
    include(ExternalProject)
    set(DOTPROD_DIR ${CMAKE_CURRENT_BINARY_DIR}/whisper-dotprod)
    set(DOTPROD_LIBS
            ${DOTPROD_DIR}/src/libwhisper.a
            ${DOTPROD_DIR}/ggml/src/libggml.a
            ${DOTPROD_DIR}/ggml/src/libggml-cpu.a
            ${DOTPROD_DIR}/ggml/src/libggml-base.a)
    string(REPLACE ";" " " OPT_FLAGS_STR "${OPT_FLAGS}")
    ExternalProject_Add(whisper_dotprod
            SOURCE_DIR ${WHISPER_DIR}
            BINARY_DIR ${DOTPROD_DIR}
            CMAKE_ARGS
                ${WHISPER_OPTIONS}
                -DGGML_CPU_ARM_ARCH=armv8.2-a+dotprod+fp16
                -DCMAKE_TOOLCHAIN_FILE=${CMAKE_TOOLCHAIN_FILE}
                -DANDROID_ABI=${ANDROID_ABI}
                -DANDROID_PLATFORM=${ANDROID_PLATFORM}
                -DANDROID_NDK=${ANDROID_NDK}
                -DANDROID_STL=${ANDROID_STL}
                -DCMAKE_BUILD_TYPE=${CMAKE_BUILD_TYPE}
                -DCMAKE_MAKE_PROGRAM=${CMAKE_MAKE_PROGRAM}
                "-DCMAKE_C_FLAGS=${CMAKE_C_FLAGS} ${OPT_FLAGS_STR}"
                "-DCMAKE_CXX_FLAGS=${CMAKE_CXX_FLAGS} ${OPT_FLAGS_STR}"
            CMAKE_GENERATOR ${CMAKE_GENERATOR}
            BUILD_COMMAND ${CMAKE_COMMAND} --build <BINARY_DIR> --target whisper
            INSTALL_COMMAND ""
            BUILD_BYPRODUCTS ${DOTPROD_LIBS})

    murine_voice_library(murine_whisper_dotprod)
    add_dependencies(murine_whisper_dotprod whisper_dotprod)
    target_include_directories(murine_whisper_dotprod PRIVATE
            ${WHISPER_DIR}/include ${WHISPER_DIR}/ggml/include)
    find_package(Threads REQUIRED)
    target_link_libraries(murine_whisper_dotprod PRIVATE ${DOTPROD_LIBS} Threads::Threads m dl)
endif ()
