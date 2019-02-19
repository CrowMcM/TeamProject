The Android simpleperf binaries should be placed in this directory under a specific subfolder according to their architecture:
* **ARM**: armeabi-v7a/simpleperf (SHA1 _fd05ec087ddc132a5cc33b5723e5355a8db8dd90_)
* **ARM64**: arm64-v8a/simpleperf (SHA1 _2a25465f17137059dc5edcde77d7be16d40b3ddf_)
* **x86**: x86/simpleperf (SHA1 _44df43a0defc386778acfcac0171499fa2281a84_)
* **x86\_64**: x86\_64/simpleperf (SHA1 _8c76b27136452a75fd917d552851c5105130285e_)

There are two ways of obtaining the binaries:

1) Download the binaries directly from [simpleperf prebuilts source](https://android.googlesource.com/platform/prebuilts/simpleperf/+/master/bin/android/). In this case, please edit the paragraph on the bottom of this file mentioning the source tree where the files were obtained from and the AOSP commit that added them.

2) [Download and build](https://source.android.com/source/initializing) the latest (or a specific) version of AOSP, then copy the simpleperf binaries generated as artifacts to this directory. Also, update the text on the bottom of this file mentioning the AOSP source tree built.

Current binaries were downloaded from AOSP simpleperf prebuilts (tree @ [0c664143e148c2cc11b6a27b75ab9096eb93f870](https://android.googlesource.com/platform/prebuilts/simpleperf/+/bef973e4045b6c3043183c27e934820c536385e8/bin/android/)).

