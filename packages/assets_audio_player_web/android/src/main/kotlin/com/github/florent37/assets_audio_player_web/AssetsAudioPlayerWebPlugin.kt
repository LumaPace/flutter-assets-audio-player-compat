// Modified from upstream 3.1.1 for modern Flutter/Android compatibility.
// Change: Remove the obsolete empty Registrar registration hook; retain FlutterPlugin embedding.
// Public Dart API and playback contract are preserved. See repository NOTICE.
@file:Suppress("EmptyMethod", "EmptyMethod", "EmptyMethod", "EmptyMethod")

package com.github.florent37.assets_audio_player_web

import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result

/** AssetsAudioPlayerWebPlugin */
public class AssetsAudioPlayerWebPlugin: FlutterPlugin, MethodCallHandler {

  private lateinit var channel : MethodChannel

  override fun onAttachedToEngine(flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
    //no-op for compatibility
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    //no-op for compatibility
  }

  override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    //no-op for compatibility
  }
}
