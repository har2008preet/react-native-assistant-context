
# react-native-assistant-context

## Getting started

`$ npm install react-native-assistant-context --save`

### Mostly automatic installation

`$ react-native link react-native-assistant-context`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-assistant-context` and add `RNAssistantContext.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNAssistantContext.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNAssistantContext.sln` in `node_modules/react-native-assistant-context/windows/RNAssistantContext.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Assistant.Context.RNAssistantContext;` to the usings at the top of the file
  - Add `new RNAssistantContextPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNAssistantContext from 'react-native-assistant-context';

// TODO: What to do with the module?
RNAssistantContext;
```
  