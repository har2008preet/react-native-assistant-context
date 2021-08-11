
package com.ruykin;

import android.app.Activity;
import android.app.assist.AssistContent;
import android.net.Uri;
import android.telecom.Call;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import org.json.JSONException;
import org.json.JSONObject;

public class RNAssistantContextModule extends ReactContextBaseJavaModule {

  public static String assistantUrl;
  private final ReactApplicationContext reactContext;

  public RNAssistantContextModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAssistantContext";
  }

  @ReactMethod
  public void setWebUri(String url, Callback successCallback, Callback errorCallback) {
    assistantUrl = url;
  }

  public static void setAssistantContext(AssistContent assistContent){
    if(assistantUrl!=null) {
      assistContent.setWebUri(Uri.parse(assistantUrl));
    }
  }
}