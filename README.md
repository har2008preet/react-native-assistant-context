
# react-native-assistant-context [![npm version](https://badge.fury.io/js/react-native-assistant-context.svg)](http://badge.fury.io/js/react-native-assistant-context)

## Getting started

`$ npm install react-native-assistant-context --save` <br>
or <br>
`$ yarn add react-native-assistant-context`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.ruykin.RNAssistantContextPackage;` to the imports at the top of the file
  - Add `new RNAssistantContextPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-assistant-context'
  	project(':react-native-assistant-context').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-assistant-context/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-assistant-context')
  	```


## Usage
```javascript
import RNAssistantContext from 'react-native-assistant-context';
```

In MainActivity.java
```
import com.ruykin.RNAssistantContextModule;
```

```
@RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        RNAssistantContextModule.setAssistantContext(assistContent);

    }
```
Tell assistant to share url:
```
RNAssistantContext.setWebUri(url);
```
