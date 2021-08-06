
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
  public void setWebUri(Callback successCallback, Callback errorCallback) {

    final Activity activity = getCurrentActivity();

    if (activity == null) {
      String structuredJson = null;
      AssistContent assistContent = null;

      assistContent.setWebUri(Uri.parse("https://example.com/myCurrentPage"));
      activity.onProvideAssistContent(assistContent);

//      successCallback(12,"Sefse");
//      activity.onProvideAssistContent();
//      errorCallback(ERROR_NO_ACTIVITY, ERROR_NO_ACTIVITY_MESSAGE);
    }

  }
}