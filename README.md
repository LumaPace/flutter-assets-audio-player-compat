# AssetsAudioPlayer: Flutter compatibility packages

A source-only compatibility distribution of upstream **assets_audio_player 3.1.1** and **assets_audio_player_web 3.1.1**. Package names, versions, public Dart APIs and the established playback behavior are unchanged. No application code or application configuration is included.

Upstream: https://github.com/florent37/Flutter-AssetsAudioPlayer

Original distributions:
- https://pub.dev/packages/assets_audio_player/versions/3.1.1
- https://pub.dev/packages/assets_audio_player_web/versions/3.1.1

## Compatibility patches

1. NotificationService.kt: reference the ExoPlayer UI resource namespace.
2. HeadsetManager.kt: handle a nullable requestedPermissions array.
3. AssetsAudioPlayerWebPlugin.kt: remove the obsolete empty Registrar hook while preserving the current FlutterPlugin embedding.

These patches address compilation with modern Flutter/Android tooling. They do not replace the player, change its public API, alter playback callbacks or add authentication, billing or application behavior. Modified files include explicit notices required by Apache-2.0.

## Git consumption

Use this repository as two Git dependency overrides, each pinned to the **same full commit SHA**. Set package paths to packages/assets_audio_player and packages/assets_audio_player_web. Override both packages so the federated web package does not resolve back to the hosted original. Do not depend on a moving branch or a local path.

## Reproduction and verification

UPSTREAM_MANIFEST.json records the official archive checksums and upstream, previously validated and prepared SHA-256 for all 97 package files. PATCHES.diff contains the complete package diff versus the verified upstream archives. Ninety-four files are byte-identical to the validated preparation; the other three differ only by added change-notice comments. All Dart sources and package versions are unchanged.

The patches were validated using local Flutter audio-contract tests (play/pause/seek, interruption and protected-request handling), static analysis and an Android debug APK build. The consumer tests and logs remain outside this source distribution because they belong to the consuming application. Integration/build tooling was Flutter 3.38.6, Dart 3.10.7, AGP 8.9.1, Kotlin 2.1.0 and Gradle 8.12. This does not claim testing of every device or cloud environment.

## License and attribution

Apache License 2.0. Preserve LICENSE, package LICENSE files, NOTICE and all upstream copyright/attribution notices when redistributing. The license does not grant trademark rights or imply upstream endorsement. Public upstream author/contributor credits remain intact.
