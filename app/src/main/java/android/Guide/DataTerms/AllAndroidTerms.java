package android.Guide.DataTerms;
import java.util.ArrayList;
public class AllAndroidTerms {
    private ArrayList<AndroidTerm> list0 = new ArrayList<>();
    private ArrayList<AndroidTerm> list1 = new ArrayList<>();
    private ArrayList<AndroidTerm> list2 = new ArrayList<>();
    private ArrayList<AndroidTerm> list3 = new ArrayList<>();
    private ArrayList<AndroidTerm> list4 = new ArrayList<>();
    private ArrayList<AndroidTerm> list5 = new ArrayList<>();
    private ArrayList<AndroidTerm> list6 = new ArrayList<>();
    private ArrayList<AndroidTerm> list7 = new ArrayList<>();
    private ArrayList<AndroidTerm> list8 = new ArrayList<>();
    private ArrayList<AndroidTerm> list9 = new ArrayList<>();
    private ArrayList<AndroidTerm> list10 = new ArrayList<>();
    private ArrayList<AndroidTerm> list11 = new ArrayList<>();
    private ArrayList<AndroidTerm> list12 = new ArrayList<>();
    private ArrayList<AndroidTerm> list13 = new ArrayList<>();
    private ArrayList<AndroidTerm> list14 = new ArrayList<>();

    private void setTerms0() {
        list0.add(new AndroidTerm("Android", "Android is an operating " +
                "system and programming platform developed by Google for smartphones " +
                "and other mobile devices\n\n" +
                "It provide best experience for app users, internal hardware such as accelerometers, " +
                "gyroscopes and proximity " +
                "sensors, are used by many apps to respond to additional user actions.\n\n" +
                "These sensors can detect rotation of the screen " +
                "from portrait to landscape for a wider view or it can allow the user to " +
                "steer a virtual vehicle in a racing game by rotating the " +
                "device as if it were a steering wheel.\n\n" +
                "The Android platform, based on the Linux kernel, is designed primarily for " +
                "touchscreen mobile devices such as " +
                "smartphones and tablets.\n\n"));
        list0.add(new AndroidTerm("Android Stack",
                "1. Apps: Your apps live at " +
                        "this level, along with core system apps for email, SMS messaging, calendars, " +
                        "Internet " +
                        "browsing, or contacts.\n\n" +
                        "2. Java API Framework: All features of Android are available to developers " +
                        "through application programming interfaces " +
                        "(APIs) written in the Java language. You don't need to know the details of " +
                        "all of the APIs to learn how to develop " +
                        "Android apps, but you can learn more about the following APIs, which are " +
                        "useful for creating apps:\n\n" +
                        "View System- Used to build an app's UI, including lists, buttons, and menus.\n\n" +
                        "Resource Manager- Used to access to non-code resources such as localized strings, " +
                        "graphics, and layout files.\n\n" +
                        "Notification Manager- Used to display custom alerts in the status bar.\n\n" +
                        "Activity Manager- Manages the lifecycle of apps.\n\n" +
                        "Content Providers- Enable apps to access data from other apps.\n\n"+
                        "3. Libraries and Android Runtime: Each app runs in its own process and " +
                        "with its own instance of the Android Runtime, " +
                        "which enables multiple virtual machines on low-memory devices. \n\nAndroid also " +
                        "includes a set of core runtime libraries " +
                        "that provide most of the functionality of the Java programming language, including " +
                        "some Java 8 language features that " +
                        "the Java API framework uses. \n\nMany core Android system components and services " +
                        "are built from native code that " +
                        "require native libraries written in C and C++. These native libraries are available " +
                        "to apps through the Java API " +
                        "framework.\n\n" +
                        "4.Hardware Abstraction Layer (HAL): This layer provides standard interfaces that " +
                        "expose device hardware capabilities " +
                        "to the higher-level Java API framework. The HAL consists of multiple library modules, " +
                        "each of which implements an " +
                        "interface for a specific type of hardware component, such as the camera or bluetooth " +
                        "module.\n\n" +
                        "5. Linux Kernel: The foundation of the Android platform is the Linux kernel.\n\n" +
                        "The above layers rely on the Linux kernel for " +
                        "underlying functionality such as threading and low-level memory management.\n\n" +
                        "Using a Linux kernel enables Android " +
                        "to take advantage of key security features and allows device manufacturers " +
                        "to develop hardware drivers for a well-" +
                        "known kernel.\n\n"));
        list0.add(new AndroidTerm("Challenges in Android app development",
                "While the Android platform provide rich functionality for app " +
                        "development, there are still a number of challenges you need " +
                        "to address, such as:\n\n" +
                        "1. Building for a multi-screen world.\n\n" +
                        "2. Getting performance right.\n\n" +
                        "3. Keeping your code and your users secure.\n\n" +
                        "4. Remaining compatible with older platform versions.\n\n" +
                        "5. Understanding the market and the user.\n\n"));
        list0.add(new AndroidTerm("Using Android Studio",
                "An app consists of one or more activities.\n\n" +
                        "For each activity you can use Android " +
                        "Studio to do the following, in no particular order:\n\n" +
                        "Create the layout: Place UI elements on the screen in a layout, and assign " +
                        "string resources and menu items, using " +
                        "the Extensible Markup Language (XML).\n\n" +
                        "Write the Java code: Create source code for components and tests, and use " +
                        "testing and debugging tools.\n\n" +
                        "Register the activity: Declare the activity in the manifest file.\n\n" +
                        "Define the build: Use the default build configuration or create custom " +
                        "builds for different versions of your app.\n\n" +
                        "When choosing a unique Company Domain, keep in mind that apps " +
                        "published to the Google " +
                        "Play must have a unique package name. Since domains are unique, " +
                        "prepending the app's name " +
                        "with your name, or your company's domain name, should provide an " +
                        "adequately unique " +
                        "package name.\n\n" +
                        "Different devices run different versions of the Android system, such " +
                        "as Android 4.0.3 or Android 4.4. Each successive " +
                        "version often adds new APIs not available in the previous version. To " +
                        "indicate which set of APIs are available, each version " +
                        "specifies an API level. For instance, Android 1.0 is API level 1 and " +
                        "Android 4.0.3 is API level 15.\n\n" +
                        "Backwards Compatibility (AppCompat): It include the " +
                        "AppCompat library so that the app is " +
                        "compatible with previous versions of Android even if it uses features found " +
                        "only in newer versions."));
        list0.add(new AndroidTerm("Explore Android Project",
                "The AndroidManifest.xml file:- \n\nUsed for specifying information about " +
                        "the app for the Android runtime environment. " +
                        "The template you choose creates this file.\n\n" +
                        "The java folder:- This folder includes activities, tests, and other components in Java " +
                        "source code. Every activity, " +
                        "service, and other component is defined as a Java class, usually in its own file.\n\n" +
                        "The name of the first activity (screen) " +
                        "the user sees, which also initializes app-wide resources, is customarily MainActivity.\n\n" +
                        "The res folder:- This folder holds resources, such as XML layouts, UI strings, and images.\n\n" +
                        "An activity usually is " +
                        "associated with an XML resource file that specifies the layout of its views.\n\n" +
                        "This file is usually named after its activity or " +
                        "function.\n\n" +
                        "The build.gradle (Module: App) file:- This file specifies the module's build configuration.\n\n" +
                        "The template you choose " +
                        "creates this file, which defines the build configuration, including the " +
                        "version for the app, and the " +
                        "targetSdkVersion " +
                        "minSdkVersion " +
                        "attribute that declares the minimum " +
                        "attribute that declares the highest (newest) version for which the app " +
                        "has been optimized. \n\nThis file also includes a list of dependencies, which are libraries " +
                        "required by the code — such as " +
                        "the AppCompat library for supporting a wide range of Android versions.\n\n"
        ));
        list0.add(new AndroidTerm("Android Manifest",
                "Before the Android system can start an app component, " +
                        "the system must know that the " +
                        "component exists by reading the " +
                        "app's AndroidManifest.xml file. \n\nThe app must declare all its components in this file, " +
                        "which must be at the root of the app " +
                        "project directory.\n\n" +
                        "1.The package " +
                        "expression shows the unique package " +
                        "name of the new app. Do not change this once the app is published.\n\n" +
                        "2.The " +
                        "android:allowBackup " +
                        "attribute enables automatic app data backup.\n\n"+
                        "Setting the " +
                        "android:allowBackup " +
                        "attribute to " +
                        "true " +
                        "enables the app to be backed up automatically and restored as needed.\n\n" +
                        "The system performs this automatic backup for nearly all app data by default, " +
                        "and does so without the developer having to write any additional app code.\n\n" +
                        "For apps whose target SDK version is Android 6.0 (API level 23) and " +
                        "higher, devices running Android 6.0 and higher " +
                        "automatically create backups of app data to the cloud.\n\n" +
                        "For apps < API level 22 you have to explicitly add the " +
                        "android:allowBackup " +
                        "attribute and set it to true\n\n" +
                        "3.The " +
                        "android:icon " +
                        "attribute assigns an icon in the mipmap folder " +
                        "(inside the res folder in Project: Android view) to the app.\n\n" +
                        "The icon appears in the Launcher for launching the app. The icon " +
                        "is also used as the default icon for app components.\n\n" +
                        "4.The " +
                        "android:theme " +
                        "attribute sets the app's theme, which " +
                        "defines the appearance of user interface elements such as text"));
        list0.add(new AndroidTerm("Declare Android Version",
                "Different devices may run different versions of the " +
                        "Android system, such as Android 4.0 or Android 4.4. \n\nEach successive " +
                        "version can add new APIs not available in the previous version.\n\n" +
                        "To indicate which set of APIs are available, each version " +
                        "specifies an API level.\n\nFor instance, Android 1.0 is API level 1 and " +
                        "Android 4.4 is API level 19.\n\n" +
                        "The API level allows a developer to declare the minimum version with " +
                        "which the app is compatible, using the " +
                        "manifest tag and its " +
                        "minSdkVersion " +
                        "<uses-sdk> " +
                        "attribute.\n\nFor example, the Calendar Provider APIs were " +
                        "added in Android 4.0 (API " +
                        "level 14). If your app can't function without these APIs, " +
                        "declare API level 14 as the app's minimum supported version like " +
                        "this:\n\n" +
                        "<manifest ... >\n\n" +
                        "<uses-sdk android:minSdkVersion=\"14\" android:targetSdkVersion=\"19\" />\n\n" +
                        "...\n\n" +
                        "</manifest>\n\n" +
                        "The " +
                        "minSdkVersion " +
                        "attribute declares the minimum version for the app, and the " +
                        "targetSdkVersion " +
                        "attribute declares the " +
                        "highest (newest) version which has been optimized within the app.\n\n" +
                        "Each successive version of Android provides " +
                        "compatibility for apps that were built using the APIs " +
                        "from previous versions, so the app should always be compatible with " +
                        "future versions of Android while using the documented Android APIs.\n\n" +
                        "The " +
                        "targetSdkVersion " +
                        "attribute does not prevent an app from being installed on Android versions " +
                        "that are higher (newer) " +
                        "than the specified value, but it is important because it indicates to the " +
                        "system whether the app should inherit behavior " +
                        "changes in newer versions. \n\nIf you don't update the " +
                        "targetSdkVersion " +
                        "to the latest version, the system assumes that your " +
                        "app requires some backward-compatibility behaviors when " +
                        "running on the latest version."));
        list0.add(new AndroidTerm("Understanding Build Process",
                "As you learned earlier, before the " +
                        "Android system can start an app component such as an activity, " +
                        "the system must know " +
                        "that the activity exists by reading the app's " +
                        "AndroidManifest.xml file. Therefore, each activity " +
                        "must be listed in the " +
                        "AndroidManifest.xml file.\n\n" +
                        "The Android application package (APK) is the package file format " +
                        "for distributing and installing Android mobile apps. The " +
                        "build process involves tools and processes that automatically convert " +
                        "each project into an APK.\n\n" +
                        "Android Studio uses Gradle as the foundation of the build system, " +
                        "with more Android-specific capabilities provided by the " +
                        "Android Plugin for Gradle. This build system runs as an integrated " +
                        "tool from the Android Studio menu\n\n" +
                        "build.gradle (Project: apptitle)\n\n" +
                        "This is the top-level build file for the entire project, located " +
                        "in the root project directory,which defines build configurations " +
                        "that apply to all modules in your project. This file, generated by " +
                        "Android Studio, should not be edited to include app " +
                        "dependencies.\n\n" +
                        "build.gradle (Module: app)\n\n" +
                        "Android Studio creates separate " +
                        "build.gradle (Module: app) " +
                        "files for each module. \n\nYou can edit the build settings to " +
                        "provide custom packaging options for each module, such as " +
                        "additional build types and product flavors, and to override " +
                        "settings in the manifest or top-level build.gradle file.\n\nThis file " +
                        "is most often the file to edit when changing app-level " +
                        "configurations, such as declaring dependencies in the " +
                        "project's " +
                        "build.gradle (Module: app) " +
                        "dependencies " +
                        "section.\n\n" +
                        "The build.gradle files use Gradle syntax. " +
                        "Gradle is a Domain Specific Language (DSL) for describing and manipulating the " +
                        "build logic using Groovy, which is a dynamic language for the " +
                        "Java Virtual Machine (JVM). You don't need to learn Groovy " +
                        "to make changes, because the Android Plugin for Gradle introduces " +
                        "most of the DSL elements you need.\n\n" +
                        "Core settings and entries for the app are specified in a " +
                        "defaultConfig { } " +
                        "block within the " +
                        "android { } block\n\n" +
                        "Build types for the app are specified in a " +
                        "buildTypes { } " +
                        "block, which controls how the app is built and packaged.\n\n" +
                        "The build type specified is " +
                        "release " +
                        "for the app's release. Another common build type is " +
                        "debug\n\n" +
                        "Dependencies for the app are defined in the " +
                        "dependencies { } " +
                        "block, which is the part of the build.gradle file that is most " +
                        "likely to change as you start developing code that depends" +
                        "on other libraries. The block is part of the standard Gradle API " +
                        "and belongs outside the " +
                        "android { } " +
                        "block.\n\n"));
        list0.add(new AndroidTerm("Adding Log Statements",
                "Logging statements add whatever messages you specify to the log. " +
                        "Adding logging statements at certain points in the code " +
                        "allows the developer to look at values, execution paths, and exceptions.\n\n" +
                        "For example, the following logging statement adds " +
                        "\"MainActivity\" " +
                        "and " +
                        "\"Hello World\" " +
                        "to the log: \n\n" +
                        "Log.d(\"MainActivity\", \"Hello World\");\n\n" +
                        "The following are the elements of this statement:\n\n" +
                        "Log " +
                        ": The Log class is the API for sending log messages.\n\n" +
                        "d " +
                        ": You assign a log level so that you can filter the log " +
                        "messages using the drop-down menu in the center of the " +
                        "logcat tab pane. The following are log levels you can assign:\n\n" +
                        "d : Choose Debug or Verbose to see these messages.\n\n" +
                        "e : Choose Error or Verbose to see these messages.\n\n" +
                        "w : Choose Warning or Verbose to see these messages.\n\n" +
                        "i : Choose Info or Verbose to see these messages.\n\n"
        ));
        list0.add(new AndroidTerm("Model-view-presenter pattern",
                "Linking an activity to a layout resource is an example of " +
                        "part of the model-view-presenter (MVP) architecture pattern.\n\nThe " +
                        "MVP pattern is a well-established way to group app functions:\n\n" +
                        "Views- Views are user interface elements that display data and respond " +
                        "to user actions. Every element of the screen is " +
                        "a view. The Android system provides many different kinds of views.\n\n" +
                        "Presenters- Presenters connect the application's views to the model.\n\n" +
                        "They supply the views with data as specified by " +
                        "the model, and also provide the model with user input from the view.\n\n" +
                        "Model-The model specifies the structure of the app's data and the code " +
                        "to access and manipulate the data. Some of " +
                        "the apps you create in the lessons work with models for accessing data.\n\n" +
                        "Views- " +
                        "The UI consists of a hierarchy of objects called views — every element of " +
                        "the screen is a view. \n\nThe View class represents " +
                        "the basic building block for all UI components, and the base class for " +
                        "classes that provide interactive UI components such " +
                        "as buttons, checkboxes, and text entry fields.\n\n" +
                        "A view has a location, expressed as a pair of left and top coordinates, " +
                        "and two dimensions, expressed as a width and a " +
                        "height. The unit for location and dimensions is the device-independent " +
                        "pixel (dp).\n\n" +
                        "View groups- " +
                        "Views can be grouped together inside a view group (ViewGroup),which " +
                        "acts as a container of views. The relationship is " +
                        "parent-child, in which the parent is a view group, and the child is a " +
                        "view or view group within the group. The following are " +
                        "common view groups:\n\n" +
                        "ScrollView: A group that contains one other child view and enables " +
                        "scrolling the child view.\n\n" +
                        "RecyclerView: A group that contains a list of other views or view groups " +
                        "and enables scrolling them by adding and " +
                        "removing views dynamically from the screen.\n\n" +
                        "Some view groups are designated as layouts because they organize " +
                        "child views in a specific way and are typically used as " +
                        "the root view group. Some examples of layouts are:\n\n" +
                        "LinearLayout: A group of child views positioned and aligned horizontally " +
                        "or vertically.\n\n" +
                        "RelativeLayout: A group of child views in which each view is positioned " +
                        "and aligned relative to other views within the " +
                        "view group. In other words, the positions of the child views can be " +
                        "described in relation to each other or to the parent " +
                        "view group.\n\n" +
                        "ConstraintLayout: A group of child views using anchor points, edges, and " +
                        "guidelines to control how views are " +
                        "positioned relative to other elements in the layout.\n\n" +
                        "ConstraintLayout was designed to make it easy to drag and drop " +
                        "views in the layout editor.\n\n" +
                        "TableLayout: A group of child views arranged into rows and columns.\n\n" +
                        "AbsoluteLayout: A group that lets you specify exact locations " +
                        "(x/y coordinates) of its child views. Absolute layouts are " +
                        "less flexible and harder to maintain than other types of layouts without " +
                        "absolute positioning.\n\n" +
                        "FrameLayout: A group of child views in a stack. FrameLayout is designed to " +
                        "block out an area on the screen to display one view. Child views are drawn in a stack, with the most recently added " +
                        "child on top. The size of the FrameLayout is " +
                        "the size of its largest child view.\n\n" +
                        "GridLayout: A group that places its child screens in a rectangular grid " +
                        "that can be scrolled.\n\n" +
                        "1.2: Layouts, Views and Resources\n\n" +
                        "TableLayout: A group of child views arranged into rows and columns.\n\n" +
                        "AbsoluteLayout: A group that lets you specify exact locations (x/y coordinates) of its child views. Absolute layouts are " +
                        "less flexible and harder to maintain than other types of layouts without absolute positioning.\n\n" +
                        "FrameLayout: A group of child views in a stack. FrameLayout is designed to block out an " +
                        "area on the screen to display one view\n\n" +
                        "Child views are drawn in a stack, with the most recently added child on top. The size of the FrameLayout is " +
                        "the size of its largest child view.\n\n" +
                        "GridLayout: A group that places its child screens in a rectangular " +
                        "grid that can be scrolled.\n\n" +
                        "A constraint is a connection or alignment to another view, " +
                        "to the parent layout, or to an invisible guideline. Each " +
                        "constraint appears as a line extending from a circular handle.\n\n "
        ));
        list0.add(new AndroidTerm("XML attributes",
                "Views have properties that define where a view appears on " +
                        "the screen, its size, how the view relates to other views,and " +
                        "how it responds to user input. When defining views in XML, " +
                        "the properties are referred to as attributes.\n\n" +
                        "To uniquely identify a view and reference it from your code, " +
                        "you must give it an id.The android:id attribute lets you " +
                        "specify a unique " +
                        "id " +
                        "android:id " +
                        "attribute lets you specify a unique id" +
                        "— a resource identifier for a view.\n\n" +
                        "Android:layout_gravity " +
                        ": This attribute is used with a view to control where the " +
                        "view is arranged within its parent view " +
                        "group. For example, the following attribute centers the view " +
                        "horizontally on the screen:\n\n" +
                        "android:layout_gravity=\"center_horizontal\"\n\n" +
                        "Padding is the space, measured in device-independent pixels, " +
                        "between the edges of the view and the view's content,\n\n" +
                        "A very useful view group for layout is RelativeLayout, " +
                        "which you can use to position child views relative to each other or to " +
                        "the parent.\n\n" +
                        "You specify style attributes to customize the view's appearance.\n\n" +
                        "Views that don't have style attributes, such as " +
                        "android:textColor " +
                        ", " +
                        "android:textSize " +
                        ", and " +
                        "android:background " +
                        ", take on the styles defined in the app's theme.\n\n"
        ));
        list0.add(new AndroidTerm("Resource files",
                "Resource files are a way of separating static values from code " +
                        "so that you don't have to change the code itself to change " +
                        "the values. You can store all the strings, layouts, dimensions, colors, " +
                        "styles, and menu text separately in resource files.\n\n" +
                        "Resource files are stored in folders located in the res folder, including:\n\n" +
                        "drawable: For images and icons\n\n" +
                        "layout: For layout resource files\n\n" +
                        "menu: For menu items\n\n" +
                        "mipmap: For pre-calculated, optimized collections of app icons used by the " +
                        "Launcher\n\n" +
                        "values: For colors, dimensions, strings, and styles (theme attributes)\n\n" +
                        "The syntax to reference a resource in an XML layout is as follows:\n\n" +
                        "@package_name:resource_type/resource_name\n\n" +
                        "The package_name is the name of the package in which the resource is located.\n\n " +
                        "This is not required when referencing " +
                        "resources from the same package — that is, stored in the res folder of " +
                        "your project.\n\n" +
                        "resource_type is the " +
                        "R " +
                        "subclass for the resource type. " +
                        "resource_name is either the resource filename without " +
                        "the extension, or the " +
                        "android:name " +
                        "attribute value in the XML " +
                        "element.\n\n" +
                        "Device-independent pixels ( " +
                        "dp " +
                        ") are independent of screen resolution. For example, 10px (10 fixed pixels) " +
                        "will look a lot " +
                        "smaller on a higher resolution screen, but Android will " +
                        "scale 10dp (10 device-independent pixels) to look right on different " +
                        "resolution screens. Text sizes can also be set to look right " +
                        "on different resolution screens using scaled-pixel (sp) sizes\n\n " +
                        "A style is a resource that specifies common attributes such as " +
                        "height, padding, font color, font size, background color.\n\n" +
                        "Styles are meant for attributes that modify the look of the view.\n\n" +
                        "Images and icons. The drawable folder provides icon and image resources.\n\n" +
                        "If your app does not have a drawable " +
                        "folder, you can manually create it inside the res folder.\n\n"+
                        "Optimized icons. The mipmap folder typically contains pre-calculated, optimized " +
                        "collections of app icons used by the " +
                        "Launcher. Expand the folder to see that versions of " +
                        "icons are stored as resources " +
                        "for different screen densities.\n\n" +
                        "Menus. You can use an XML resource file to define menu items and store " +
                        "them in your project in the menu folder.\n\n"
        ));
        list0.add(new AndroidTerm("Responding to view clicks ",
                "A click event occurs when the user taps or clicks a clickable " +
                        "view, such as a Button, ImageButton, ImageView (tapping or " +
                        "clicking the image), or FloatingActionButton.\n\n" +
                        "The model-view-presenter pattern is useful for understanding how to " +
                        "respond to view clicks. When an event occurs with a " +
                        "view, the presenter code performs an action that affects the model code. In " +
                        "order to make this pattern work, you have to:\n\n" +
                        "Write a Java method that performs the specific action, which is determined by " +
                        "the logic of the model code — that is, " +
                        "the action depends on what you want the app to do when this event occurs. " +
                        "This is typically referred to as an event handler.\n\n" +
                        "Associate this event handler method to the view, so that " +
                        "the method executes when the event occurs.\n\n" +
                        "Android Studio provides a shortcut for setting up a clickable view, " +
                        "and for associating an event handler with the view:\n" +
                        "use the android:onClick attribute with the clickable view's element in the XML layout.\n\n" +
                        "Android Studio provides a shortcut for setting up a clickable view, " +
                        "and for associating an event handler with the view: \n\nuse " +
                        "the " +
                        "android:onClick " +
                        "attribute with the clickable view's element in the XML layout.\n\n" +
                        "In order to work with the " +
                        "android:onClick " +
                        "attribute, the " +
                        "showToast() " +
                        "method must be " +
                        "public " +
                        ", return " +
                        "void " +
                        ", and require a view " +
                        "parameter in order to know which view called the method."
        ));
        list0.add(new AndroidTerm("Text View",
                "The TextView, which shows textual content on the screen.\n\n" +
                        "A TextView can be used to show a message, a response from a database, " +
                        "or even entire magazine-style articles that users " +
                        "can scroll. This chapter also shows how you can create a scrolling view " +
                        "of text and other elements.\n\n" +
                        "One view you may use often is the TextView class, which is a subclass of the " +
                        "View class that displays text on the screen.\n\n" +
                        "You can use TextView for a view of any size, from a single character or word " +
                        "to a full screen of text. You can add a resource id " +
                        "to the TextView, and control how the text appears using attributes in the XML " +
                        "layout file.\n\n" +
                        "To properly display in a text view, " +
                        "text must be formatted following these rules:\n\n" +
                        "If you have an apostrophe (') in your text, you must escape it by " +
                        "preceding it with a backslash (\\'). If you have a double-" +
                        "quote in your text, you must also escape it (\\\"). You must also " +
                        "escape any other non-ASCII characters.\n\n" +
                        "The TextView ignores all HTML tags except the following:\n\n" +
                        "Use the HTML and </b> tags around words that should be in bold.\n\n" +
                        "Use the HTML and </i> tags around words that should be in italics. Note, " +
                        "however, that if you use curled " +
                        "apostrophes within an italic phrase, you should replace them with straight apostrophes.\n\n" +
                        "You can combine bold and italics by combining the tags, as in ... words...</i></b>.\n\n" +
                        "Text lines in the strings.xml file don't wrap around to the next line — they extend beyond " +
                        "the right margin. This is the correct " +
                        "behavior. Each new line of text starting at the left margin represents an entire paragraph.\n\n" +
                        "Enter \\n to represent the end of a line, and another \\n to represent a blank line.\n\n" +
                        "If you don't add end-of-line characters, the " +
                        "paragraphs will run into each other when displayed on the screen.\n\n" +
                        "Tip: If you want to see the text wrapped in strings.xml, you can press Return to " +
                        "enter hard line endings, or format the text " +
                        "first in a text editor with hard line endings. The endings will not " +
                        "be displayed on the screen\n\n"
        ));
        list0.add(new AndroidTerm("Scrolling views", "If the information you " +
                "want to show in your app is larger than the device's display, you can create a " +
                "scrolling view that the " +
                "user can scroll vertically by swiping up or down, or horizontally by swiping " +
                "right or left.\n\n" +
                "You would typically use a scrolling view for news stories, articles, " +
                "or any lengthy text that doesn't completely fit on the " +
                "display.\n\n" +
                "The ScrollView class provides the layout for a vertical scrolling view. " +
                "(For horizontal scrolling, you would use " +
                "HorizontalScrollView.) ScrollView is a subclass of FrameLayout, which means that " +
                "you can place only one view as a child within it; that child " +
                "contains the entire contents to scroll.\n\n" +
                "Even though you can place only one child view inside a ScrollView, " +
                "the child view could be a view group with a hierarchy of " +
                "child views, such as a LinearLayout.\n\nA good choice for a view within a " +
                "ScrollView is a LinearLayout that is arranged in a vertical orientation."
        ));
        list0.add(new AndroidTerm("Performance of Scroll View",
                "With a ScrollView, all of your " +
                        "views are in memory and in the view hierarchy even if they aren't displayed on " +
                        "screen. \n\nThis " +
                        "makes ScrollView useful for smoothly scrolling pages of free-form text, " +
                        "because the " +
                        "text is already in memory. \n\nHowever, " +
                        "ScrollView can use up a lot of memory, which can " +
                        "affect the performance of the rest of your app.\n\n" +
                        "Using nested instances of LinearLayout can also lead to an excessively deep " +
                        "view hierarchy, which can slow down " +
                        "performance.\n\nNesting several instances of LinearLayout that use the " +
                        "android:layout_weight " +
                        "attribute can be especially " +
                        "expensive as each child view needs to be measured twice.\n\n" +
                        "Consider using flatter layouts such as RelativeLayout or " +
                        "GridLayout to improve performance.\n\n" +
                        "Complex layouts with ScrollView may suffer performance issues, " +
                        "especially with child views such as images. We " +
                        "recommend that you not use images with a ScrollView. To display long lists of " +
                        "items, or images, consider using a " +
                        "RecyclerView.\n\n" +
                        "Also, using AsyncTask provides a simple way to perform work outside " +
                        "the main thread, such as loading " +
                        "images in a background thread, then applying them to the UI once finished.\n\n" +
                        "The ScrollView view group can contain only one view; however, that view can be a " +
                        "view group that contains views, such as " +
                        "LinearLayout. You can nest a view group such as LinearLayout within the ScrollView " +
                        "view group, thereby scrolling " +
                        "everything that is inside the LinearLayout."
        ));
    }

    private void setTerms1() {
        list1.add(new AndroidTerm("About activities",
                "An activity represents a single screen in your app " +
                        "with an interface the user can interact with.\n\n" +
                        "Your app is a collection of activities that you either " +
                        "create yourself, or that you reuse from " +
                        "other apps.\n\n" +
                        "For example, an email app might have one activity that shows a list of new emails, another " +
                        "activity to compose an email, and another activity for " +
                        "reading individual messages.\n\n" +
                        "Although the activities in your app work together to form a cohesive user experience in your app, each one is independent " +
                        "of the others. This enables your app to start activities in other apps, and other apps can start your activities (if your app " +
                        "allows it). For example, a messaging app you write could start an activity in a camera app to take a picture, and then start " +
                        "the activity in an email app to let the user share that picture in email.\n\n" +
                        "Typically, one activity in an app is specified as the \"main\" activity, which is presented to the user when launching the " +
                        "application for the first time. Each activity can then start other activities in order to perform different actions.\n\n" +
                        "Each time a new activity starts, the previous activity is stopped, but the system preserves the activity in a stack (the \"back " +
                        "stack\"). When the user is done with the current activity and presses the Back button, it is popped from the stack (and " +
                        "destroyed) and the previous activity resumes.\n\n" +
                        "When an activity is stopped because a new activity starts, the first activity is notified of that change with the activity's " +
                        "lifecycle callback methods. The Activity lifecycle is the set of states an activity can be in, from when it is first created, to " +
                        "each time it is stopped or resumed, to when the system destroys it.\n\n" +
                        "The AppCompatActivity class is a subclass of " +
                        "Activity that lets you to use up-to-date Android app features such as the action bar and material design, while still enabling your app to be compatible with devices running older versions of Android.\n\n" +
                        "The first task for you in your activity subclass is to implement the standard activity lifecycle callback methods (such as " +
                        "OnCreate()) to handle the state changes for your activity.\n\n" +
                        "The one required callback your app must implement is the onCreate() method.The system " +
                        "calls this method when it " +
                        "creates your activity, and all the essential components of your activity should be initialized " +
                        "here. Most importantly, the " +
                        "OnCreate() method calls setContentView() to create the primary layout for the activity.\n\n" +
                        "You may often also want to implement the onPause() method in your activity class. The system calls this method as the first " +
                        "indication that the user is leaving your activity (though it does not always mean the activity is being destroyed).\n\nThis is " +
                        "usually where you should commit any changes that should be persisted beyond the current user session (because the user " +
                        "might not come back).\n\n" +
                        "The most common way to define a user interface using views is with an XML layout file stored as part of your app's " +
                        "resources. Defining your layout in XML enables you to maintain the design of your user interface separately from the " +
                        "source code that defines the activity's behavior.\n\n" +
                        "You can also create new views directly in your activity code by inserting new view objects into a ViewGroup, and then " +
                        "passing the root ViewGroup to setContentView(). After your layout has been inflated -- regardless of its source -- you can " +
                        "add more views in Java anywhere in the view hierarchy.\n\n" +
                        "Declare the activity in the manifest\n\n" +
                        "Each activity in your app must be declared in the Android app manifest with the " +
                        "<activity> element inside " +
                        "<application> " +
                        ". When you create a new project or add a new activity to your project in Android Studio, your manifest is " +
                        "created or updated to include skeleton activity declarations for each activity.\n\n" +
                        "The " +
                        "<activity> " +
                        "element can also include declarations for intent filters. The intent filters specify the kind of intents your " +
                        "activity will accept.\n\n" +
                        "Intent filters must include at least one " +
                        "<action> " +
                        "element, and can also include a " +
                        "<category> " +
                        "and optional " +
                        "<data>.\n\n " +
                        "The " +
                        "main activity for your app needs an intent filter that defines the \"main\" action and the \"launcher\" category so that the system " +
                        "can launch your app.\n\n" +
                        "The " +
                        "<action> " +
                        "element specifies that this is the \"main\" entry point to the application.The " +
                        "<category> " +
                        "element specifies " +
                        "that this activity should be listed in the system's application launcher (to allow users to launch this activity).\n\n" +
                        "Other activities in your app can also declare intent filters, but only your main activity should include the \"main\" action.\n\n"));
        list1.add(new AndroidTerm("About Intents",
                "All Android activities are started or activated with an intent.Intents " +
                        "are message objects that make a request to the Android " +
                        "runtime to start an activity or other app component in your app or in some " +
                        "other app. You don't start those activities " +
                        "yourself.\n\n" +
                        "When your app is first started from the device home screen, the Android runtime sends an " +
                        "intent to your app to start your " +
                        "app's main activity (the one defined with the MAIN action and the LAUNCHER category in the " +
                        "Android Manifest). \n\nTo start " +
                        "other activities in your app, or request that actions be performed by some other activity " +
                        "available on the device, you build " +
                        "your own intents with the Intent class and call the startActivity() method to send that " +
                        "intent.\n\n" +
                        "In addition to starting activities, intents are also used to pass data " +
                        "between activities.\n\n" +
                        "When you create an intent to start a " +
                        "new activity, you can include information about the data you want that new activity to " +
                        "operate on.\n\n" +
                        "Intents are also used to start services and broadcast " +
                        "receivers.\n\n" +
                        "Intent types\n\n" +
                        "There are two types of intents in Android:\n\n" +
                        "Explicit intents specify the receiving activity (or other component) by that activity's fully-qualified class name. Use an " +
                        "explicit intent to start a component in your own app (for example, to move between screens in the user interface), " +
                        "because you already know the package and class name of that component.\n\n" +
                        "Implicit intents do not specify a specific activity or other component to receive the intent. Instead you declare a general " +
                        "action to perform in the intent. The Android system matches your request to an activity or other component that can " +
                        "handle your requested action.\n\n" +
                        "Intent objects and fields \n\n" +
                        "An Intent object is an instance of the Intent class.For explicit intents, " +
                        "the key fields of an intent include the following:\n\n" +
                        "The activity class (for explicit intents). This is the class name of the " +
                        "activity or other component that should receive the " +
                        "intent, for example, com.example.SampleActivity.class. Use the intent " +
                        "constructor or the intent's setComponent(), " +
                        "setComponentName() or setClassName() methods to specify the class.\n\n" +
                        "The Intent data- The intent data field contains a reference to the data " +
                        "you want the receiving activity to operate on, as a " +
                        "Uri object.\n\n" +
                        "Intent extras. These are key-value pairs that carry information the " +
                        "receiving activity requires to accomplish the " +
                        "requested action.\n\n" +
                        "Intent flags. These are additional bits of metadata, defined by the Intent " +
                        "class. The flags may instruct the Android " +
                        "system how to launch an activity or how to treat it after it's launched.\n\n" +
                        "Starting an activity with an explicit intent\n\n" +
                        "To start a specific activity from another activity, use an explicit intent and the startActivity() method. Explicit intents include " +
                        "the fully-qualified class name for the activity or other component in the Intent object. All the other intent fields are optional, " +
                        "and null by default.Example-\n\n" +
                        "Intent messageIntent = new Intent(this, ShowMessageActivity.class);\n\n" +
                        "startActivity(messageIntent);\n\n" +
                        "The Intent constructor takes two arguments for an explicit intent.\n\n" +
                        "An application context. In this example, the activity class provides the content (here,this) \n\n" +
                        "The specific component to start(ShowMessageActivity.class)\n\n" +
                        "Use the startActivity() method with the new intent object as the only " +
                        "argument.The startActivity() method sends the intent " +
                        "to the Android system, which launches the ShowMessageActivity class on " +
                        "behalf of your app. The new activity appears on " +
                        "the screen, and the originating activity is paused.\n\n" +
                        "You can also manually close the started " +
                        "activity in response to a user action (such as a button click) with the " +
                        "finish() method.\n\n" +
                        "Passing data between Activities\n\n " +
                        "In the first (sending) activity, you:\n\n" +
                        "1. Create the Intent object.\n\n" +
                        "2. Put data or extras into that intent.\n\n" +
                        "3. Start the new activity with startActivity().\n\n" +
                        "In the second (receiving) activity, you:\n\n" +
                        "1. Get the intent object the activity was started with.\n\n" +
                        "2. Retrieve the data or extras from the Intent object.\n\n" +
                        "Difference between intent data and intent extras\n\n" +
                        "Intent Data\n\n" +
                        "The intent data can hold only one piece of information. A URI representing " +
                        "the location of the data you want to operate on. " +
                        "That URI could be a web page URL (http://), a telephone number (tel://), " +
                        "a goegraphic location (geo://) or any other custom " +
                        "URI you define.\n\n" +
                        "Use the intent data field:\n\n" +
                        "When you only have one piece of information you need to send to the started activity.\n\n" +
                        "When that information is a data location that can be represented by a URI.\n\n" +
                        "Intent Extras\n\n" +
                        "Intent extras are for any other arbitrary data you want to pass to the " +
                        "started activity. Intent extras are stored in a Bundle " +
                        "object as key and value pairs. Bundles are a map, optimized for Android, where the keys are strings, and the values can be " +
                        "any primitive or object type\n\n" +
                        "Use the intent extras:\n\n" +
                        "If you want to pass more than one piece of information to the started activity.\n\n" +
                        "If any of the information you want to pass is not expressible by a URI.\n\n" +
                        "Intent data and extras are not exclusive; you can use data for a URI and extras " +
                        "for any additional information the started " +
                        "activity needs to process the data in that URI.\n\n" +
                        "Add data to the intent\n\n" +
                        "To add data to an explicit intent from the originating activity, create the intent object as you did before:\n\n" +
                        "Intent messageIntent = new Intent(this, ShowMessageActivity.class);\n\n" +
                        "Use the setData() method with a Uri object to add that URI to the intent. Some examples of using setData() with URIs:\n\n" +
                        "// A web page URL\n\n" +
                        "messageIntent.setData(Uri.parse(\"http://www.google.com\"));\n\n" +
                        "Keep in mind that the data field can only contain a single URI; if you call setData() multiple times only the last value is used.\n\n" +
                        "Use intent extras to include additional information (including URIs.)\n\n" +
                        "Add extras to the intent\n\n" +
                        "To add intent extras to an explicit intent from the originating activity:\n\n" +
                        "1. Determine the keys to use for the information you want to put into the extras, or define your own. Each piece of " +
                        "information needs its own unique key.\n\n " +
                        "2. Use the putExtra() methods to add your key/value pairs to the intent extras. Optionally you can create a Bundle object, " +
                        "add your data to the bundle, and then add the bundle to the intent.\n\n" +
                        "The Intent class includes several intent extra keys you can use, defined as constants that begin with the word EXTRA_. \n\nFor " +
                        "example, you could use Intent.EXTRA_EMAIL to indicate an array of email addresses (as strings), or " +
                        "Intent.EXTRA_REFERRER to specify information about the originating activity that sent the intent."
        ));
        list1.add(new AndroidTerm("Get data back",
                "To retrieve the intent the activity (or other component) was started with, use the getIntent() method:\n\n" +
                        "Intent intent = getIntent();\n\n" +
                        "Use getData() to get the URI from that intent:\n\n" +
                        "Uri locationUri = getData();\n\n" +
                        "To get the extras out of the intent, you'll need to know the keys for the key/value pairs.\n\n" +
                        "You can use the standard Intent " +
                        "extras if you used those, or you can use the keys you defined in the originating activity\n\n" +
                        "When you start an activity with an intent, the originating activity is paused, and the new activity remains on the screen until " +
                        "the user clicks the back button, or you call the finish() method in a click handler or other function that ends the user's " +
                        "involvement with this activity.\n\n" +
                        "To launch a new activity and get a result back, do the following steps in your originating activity:\n\n" +
                        "1. Instead of launching the activity with startActivity(), call startActivityForResult() with the intent and a request code.\n\n" +
                        "2. Create a new intent in the launched activity and add the return data to that intent.\n\n" +
                        "3. Implement onActivityResult() in the originating activity to process the returned data.\n\n" +
                        "Use startActivityForResult() to launch the activity\n\n" +
                        "To get data back from a launched activity, start that activity with the startActivityForResult() method instead of startActivity().\n\n" +
                        "The startActivityForResult() method, needs a request code.\n\n" +
                        "The request code is an integer that identifies the request and can be used to differentiate between results when you " +
                        "process the return data. For example, if you launch one activity to take a photo and another to pick a photo from a gallery, " +
                        "you'll need different request codes to identify which request the returned data belongs to.\n\n" +
                        "Conventionally you define request codes as static integer variables with names that include REQUEST. Use a different " +
                        "integer for each code. For example:\n\n" +
                        "public static final int PHOTO_REQUEST = 1;\n\n" +
                        "public static final int PHOTO_PICK_REQUEST = 2;\n\n" +
                        "public static final int TEXT_REQUEST = 3;\n\n" +
                        "Return a response from the launched activity\n\n" +
                        "The response data from the launched activity back to the originating activity is sent in an intent, either in the data or the " +
                        "extras. You construct this return intent and put the data into it in much the same way you do for the sending intent. Typically " +
                        "your launched activity will have an onClick or other user input callback method in which you process the user's action and " +
                        "close the activity. This is also where you construct the response.\n\n" +
                        "To return data from the launched activity, create a new empty intent object\n\n " +
                        "Intent returnIntent = new Intent();\n\n" +
                        "Add data or extras to the intent the same way you did with the original intent. You may need to define keys for the return " +
                        "intent extras at the start of your class.\n\n" +
                        "Then put your return data into the intent as usual. Here the return message is an intent extra with the key " +
                        "EXTRA_RETURN_MESSAGE.\n\n" +
                        "Use the setResult() method with a response code and the intent with the response data.\n\n" +
                        "The response codes are defined by the Activity class, and can be\n\n" +
                        "RESULT_OK. the request was successful.\n\n" +
                        "RESULT_CANCELED: the user cancelled the operation.\n\n" +
                        "RESULT_FIRST_USER. for defining your own result codes.\n\n" +
                        "You'll use the result code in the originating activity.\n\n" +
                        "Finally, call finish() to close the activity and resume the originating activity.\n\n" +
                        "Read response data in onActivityResult()\n\n" +
                        "Now that the launched activity has sent data back to the originating activity with an intent, that first activity must handle that " +
                        "data. To handle returned data in the originating activity, implement the onActivityResult() callback method.\n\n" +
                        "The three arguments to the onActivityResult() contain all the information you need to handle the return data.\n\n" +
                        "Request code. The request code you set when you launched the activity with startActivityForResult().\n\nIf you launch " +
                        "different activities to accomplish different operations, use this code to identify the specific data you're getting back.\n\n" +
                        "Result code: the result code set in the launched activity, usually one of RESULT_OK or RESULT_CANCELED.\n\n" +
                        "Intent data. the intent that contains the data returned from the launch activity.\n\n"
        ));
        list1.add(new AndroidTerm("Activity navigation",
                "Android system supports two different forms of navigation strategies for your app.\n\n" +
                "Temporal or Back navigation, provided by the device back button, and the back stack.\n\n" +
                "Ancestral, or Up navigation, provided by you as an option in the app's action bar.\n\n" +
                "Back navigation, tasks, and the back stack\n\n" +
                "Back navigation allows your users to return to the previous activity by tapping the device back button\n\n" +
                "The back stack is the set of activities that the user has visited. Each time a new activity starts, it is pushed onto the back stack and takes user focus. The previous activity is stopped but " +
                "is still available in the back stack. The back stack operates on a \"last in, first out\" mechanism, so when the user is done with " +
                "the current activity and presses the Back button, that activity is popped from the stack (and destroyed) and the previous " +
                "activity resumes.\n\n" +
                "Up navigation\n\n" +
                "Up navigation, sometimes referred to as ancestral or logical navigation, is used to navigate within an app based on the " +
                "explicit hierarchical relationships between screens.\n\n" +
                "With Up navigation, your activities are arranged in a hierarchy, and " +
                "\"child\" activities show a left-facing arrow in the action bar " +
                "that returns the user to the \"parent\" activity.\n\n" +
                "For instance, if the main activity in an email app is a list of all messages, selecting a message launches a second activity to " +
                "display that single email. In this case the message activity would provide an Up button that returns to the list of messages.\n\n" +
                "The behavior of the Up button is defined by you in each activity based on how you design your app's navigation. In many " +
                "cases, Up and Back navigation may provide the same behavior: to just return to the previous activity.\n\n" +
                "Providing Up behavior for your app is optional, but a good design practice, to provide consistent navigation for the activities " +
                "in your app."
        ));
        list1.add(new AndroidTerm("The Activity Lifecycle and Managing State",
                "You'll learn about the activity lifecycle, the callback events you can implement to perform tasks in each stage " +
                        "of the lifecycle, and how to handle activity instance states throughout the activity lifecycle.\n\n" +
                        "About the activity lifecycle\n\n" +
                        "The activity lifecycle is the set of states an activity can be in during its entire lifetime, from the time it is initially created to " +
                        "when it is destroyed and the system reclaims that activity's resources. As the user interacts with your app and other apps " +
                        "on the device, the different activities move into different states.\n\n" +
                        "For example, when you start an app, the app's main activity (Activity 1) is started, comes to the foreground, and receives " +
                        "the user focus. When you start a second activity (Activity 2), that new activity is also created and started, and the main " +
                        "activity is stopped. When you're done with the second activity and navigate back, the first activity resumes. The second " +
                        "activity stops and is no longer needed; if the user does not resume the second activity, it is eventually destroyed by the " +
                        "system.\n\n"
        ));
        list1.add(new AndroidTerm("Activity states and lifecycle callback methods",
                "All of the callback methods are hooks that you can override in each of your Activity " +
                        "classes to define how that activity behaves when the user leaves and re-enters the activity.\n\n" +
                        "Activity created (onCreate() method)\n\n" +
                        "Your activity enters into the created state when it is started for the first time. When an activity is first created the system " +
                        "calls the onCreate() method to initialize that activity.\n\n" +
                        "For example, when the user taps your app icon from the Home screen " +
                        "to start that app, the system calls the onCreate() method for the activity in your app that you've declared to be the " +
                        "\"launcher\" or \"main\" activity\n\n" +
                        "Similarly, if your app starts another activity with an intent (either explicit or implicit), the system matches your intent request " +
                        "with an activity and calls onCreate() for that new activity.\n\n" +
                        "The onCreate() method is the only required callback you must implement in your activity class. In your onCreate() method " +
                        "you perform basic application startup logic that should happen only once, such as setting up the user interface, assigning " +
                        "class-scope variables, or setting up background tasks.\n\n" +
                        "Activity started (onStart() method)\n\n" +
                        "After your activity is initialized with onCreate(), the system calls the onStart() method, and the activity is in the started state.\n\n" +
                        "The onStart() method is also called if a stopped activity returns to the foreground, such as when the user clicks the back or " +
                        "up buttons to navigate to the previous screen.\n\n" +
                        "While onCreate() is called only once when the activity is created, the " +
                        "onStart() method may be called many times during the lifecycle of the activity as the user navigates around your app.\n\n" +
                        "Typically you implement onStart() in your activity as a counterpart to the onStop() method. For example, if you release " +
                        "hardware resources (such as GPS or sensors) when the activity is stopped, you can re-register those resources in the " +
                        "onStart() method.\n\n" +
                        "Activity resumed/running (onResume() method)\n\n" +
                        "Your activity is in the resumed state when it is initialized, visible on screen, and ready to use. The resumed state is often " +
                        "called the running state, because it is in this state that the user is actually interacting with your app.\n\n" +
                        "The onResume() method " +
                        "may also be called multiple times, each time the app comes back from the paused state.\n\n" +
                        "As with the onStart() and onStop() methods, which are implemented in pairs, you typically only implement onResume() as a " +
                        "counterpart to onPause(). From " +
                        "the resumed state the activity can move into the paused state.\n\n" +
                        "Activity paused (onPause() method)\n\n" +
                        "The paused state can occur in several situations:\n\n" +
                        "The activity is going into the background, but has not yet been fully stopped. This is the first indication that the user is " +
                        "leaving your activity.\n\n" +
                        "The activity is only partially visible on the screen, because a dialog or other transparent activity is overlaid on top of it.\n\n" +
                        "In multi-window or split screen mode (API 24), the activity is displayed on the screen, but some other activity has the " +
                        "user focus.\n\n" +
                        "Because the onPause() method is " +
                        "the first indication you get that the user may be leaving the activity, you can use onPause() to stop animation or video " +
                        "playback, release any hardware-intensive resources, or commit unsaved activity changes (such as a draft email).\n\n" +
                        "Your activity can move from the paused state into the resumed state (if the user returns to the activity) or to the stopped " +
                        "state (if the user leaves the activity altogether).\n\n" +
                        "Activity stopped (onStop() method)\n\n" +
                        "An activity is in the stopped state when it is no longer visible on the screen at all. This is usually because the user has " +
                        "started another activity, or returned to the home screen. The system retains the activity instance in the back stack, and if " +
                        "the user returns to that activity it is restarted again. Stopped activities may be killed altogether by the Android system if " +
                        "resources are low.\n\n" +
                        "The system calls the onStop() method when the activity stops. Implement the onStop() method to save any persistent data " +
                        "and release any remaining resources you did not already release in onPause(), including those operations that may have " +
                        "been too heavyweight for onPause().\n\n" +
                        "Activity destroyed (onDestroy() method)\n\n" +
                        "When your activity is destroyed it is shut down completely, and the Activity instance is reclaimed by the system. This can " +
                        "happen in several cases:\n\n" +
                        "You call finish() in your activity to manually shut it down.\n\n" +
                        "The user navigates back to the previous activity.\n\n" +
                        "The device is in a low memory situation where the system reclaims stopped activities to free more resources.\n\n" +
                        "A device configuration change occurs.\n\n" +
                        "Use onDestroy() to fully clean up after your activity so that no component (such as a thread) is running after the activity is " +
                        "destroyed.\n\n" +
                        "Note that there are situations where the system will simply kill the activity's hosting process without calling this method (or " +
                        "any others), so you should not rely on onDestroy() to save any required data or activity state. Use onPause() or onStop() " +
                        "instead.\n\n" +
                        "Activity restarted (onRestart() method)\n\n" +
                        "The restarted state is a transient state that only occurs if a stopped activity is started again. In this case the onRestart() " +
                        "method is called in between onStop() and onStart(). If you have resources that need to be stopped or started you typically " +
                        "implement that behavior in onStop() or onStart() rather than onRestart().\n\n"
        ));
        list1.add(new AndroidTerm("Configuration changes and activity state",
                "Your activities may be destroyed when the user navigates back, by you " +
                        "with the finish() method, or by the system when it needs to free resources. The fourth time your activities are destroyed is " +
                        "when the device undergoes a configuration change.\n\n" +
                        "The most common form of a configuration change is when the device is rotated.\n\n" +
                        "The system recreates the activity to help that " +
                        "activity adapt to the new configuration by loading alternative resources (such as a landscape-specific layout).\n\n" +
                        "Other configuration changes can include a change in locale (the user chooses a different system language), or the user " +
                        "enters multi-window mode (Android 7). In multi-window mode, if you have configured your app to be resizeable, Android " +
                        "recreates your activities to use a layout definition for the new, smaller activity size.\n\n" +
                        "When a configuration change occurs Android system shuts down your activity (calling onPause(), onStop(), and " +
                        "onDestroy()), and then starts it over again from the start (calling onCreate(), onStart(), and onResume()).\n\n" +
                        "Activity Instance State" +
                        "When an activity is " +
                        "paused or stopped, the state of the activity is retained because that activity is still held in memory. When an activity is " +
                        "recreated, the state of the activity and any user progress in that activity is lost, with these exceptions:\n\n" +
                        "Some activity state information is automatically saved by default. The state of views in your layout with a unique ID (as " +
                        "defined by the android:id attribute in the layout) are saved and restored when an activity is recreated. In this case, the " +
                        "user-entered values in EditText views are usually retained when the activity is recreated.\n\n" +
                        "The intent that was used to start the activity, and the information stored in that intent's data or extras, remains available " +
                        "to that activity when it is recreated.\n\n" +
                        "The activity state is stored as a set of key/value pairs in a Bundle object called the activity instance state.\n\n" +
                        "The system saves " +
                        "default state information to instance state bundle just before the activity is stopped, and passes that bundle to the new " +
                        "activity instance to restore.\n\n" +
                        "You can add your own instance data to the instance state bundle by overriding the onSaveInstanceState() callback. The " +
                        "state bundle is passed to the onCreate() method, so you can restore that instance state data when your activity is created.\n\n" +
                        "There is also a corresponding onRestoreInstanceState() callback you can use to restore the state data.\n\n" +
                        "Because device rotation is a common use case for you app, make sure you test that your activity behaves correctly in " +
                        "response to this configuration change, and implement instance state if you need to.\n\n" +
                        "*Note: The activity instance state is particular to a specific instance of an activity, running in a single task. If the user force- " +
                        "quits the app, reboots the device, or if the Android system shuts down the entire app process to preserve memory, the " +
                        "activity instance state is lost. To keep state changes across app instances and device reboots, you need to write that data " +
                        "to shared preferences.\n\n" +
                        "Saving activity instance state\n\n" +
                        "To save information to the instance state bundle, use the onSaveInstanceState() callback. This is not a lifecycle callback " +
                        "method, but it is called when the user is leaving your activity (sometime before the onStop() method).\n\n" +
                        "The onSaveInstanceState() method is passed a Bundle object (a collection of key/value pairs) when it is called. This is the " +
                        "instance state bundle to which you will add your own activity state information.\n\n" +
                        "Restoring activity instance state\n\n" +
                        "Once you've saved the activity instance state, you also need to restore it when the activity is recreated. You can do this one " +
                        "of two places:\n\n" +
                        "The onCreate() callback method, which is called with the instance state bundle when the activity is created.\n\n" +
                        "The onRestoreInstanceState() callback, which is called after onStart() after the activity is created.\n\n" +
                        "Most of the time the better place to restore the activity state is in onCreate(), to ensure that your user interface including the " +
                        "state is available as soon as possible.\n\n"
        ));
        list1.add(new AndroidTerm("About implicit intents",
                "With implicit intents you do not specify the exact activity (or other " +
                        "component) to run—instead, you include just enough information in the intent about the task you want to perform.\n\n The " +
                        "Android system matches the information in your request intent with activities available on the device that can perform that " +
                        "task. If there's only one activity that matches, that activity is launched. If there are multiple matching activities, the user is " +
                        "presented with an app chooser that enables them to pick which app they would like to perform the task.\n\n" +
                        "Activities register themselves with the system as being able to handle implicit intents with intent filters, declared in the " +
                        "Android manifest.\n\n" +
                        "For example, the main activity (and only the main activity) for your app has an intent filter that declares it " +
                        "the main activity for the launcher category. This intent filter is how the Android system knows to start that specific activity in " +
                        "your app when the user taps the icon for your app on the device home screen.\n\n" +
                        "Intent actions, categories, and data\n\n" +
                        "The intent action, which is the generic action the receiving activity should perform. The available intent actions are " +
                        "defined as constants in the Intent class and begin with the word ACTION_. A common intent action is ACTION_VIEW, " +
                        "which you use when you have some information that an activity can show to the user, such as a photo to view in a " +
                        "gallery app, or an address to view in a map app. You can specify the action for an intent in the intent constructor, or " +
                        "with the setAction() method.\n\n" +
                        "An intent category, which provides additional information about the category of component that should handle the " +
                        "intent. Intent categories are optional, and you can add more than one category to an intent. Intent categories are also " +
                        "defined as constants in the Intent class and begin with the word CATEGORY_. You can add categories to the intent " +
                        "with the addCategory() method.\n\n" +
                        "The data type, which indicates the MIME type of data the activity should operate on. Usually, this is inferred from the " +
                        "URI in the intent data field, but you can also explicitly define the data type with the setType() method.\n\n" +
                        "The Android system uses this information to " +
                        "match an implicit intent request with an activity or other component that can handle that intent.\n\n"
        ));
        list1.add(new AndroidTerm("Sending implicit intents",
                "Starting activities with implicit intents, and passing data between those activities, works much the same way as it does for " +
                        "explicit intents:\n\n" +
                        "1. In the sending activity, create a new Intent object.\n\n" +
                        "2. Add information about the request to the Intent object, such as data or extras.\n\n" +
                        "3. Send the intent with startActivity() (to just start the activity) or startActivityforResult() (to start the activity and expect a " +
                        "result back).\n\n" +
                        "When you create an implicit Intent object, you:\n\n" +
                        "Do not specify the specific activity or other component to launch.\n\n" +
                        "Add an intent action or intent categories (or both).\n\n" +
                        "Resolve the intent with the system before calling startActivity() or startActivityforResult().\n\n" +
                        "Show an app chooser for the request (optional).\n\n"
        ));
        list1.add(new AndroidTerm("Receiving implicit intents",
                "If you want an activity in your app to respond to implicit intents (from your own app or other apps), declare one or more " +
                        "intent filters in the Android manifest. Each intent filter specifies the type of intents it accepts based on the intent's action, " +
                        "data, and category. The system will deliver an implicit intent to your app component only if that intent can pass through one " +
                        "of your intent filters.\n\n" +
                        "Intent filters\n\n" +
                        "Define intent filters with one or more <intent-filter> " +
                        "elements in the app's manifest file, nested in the corresponding <activity> element. Inside <intent-filter> " +
                        ", specify the type of intents your activity can handle. The Android system " +
                        "matches an implicit intent with an activity or other app component only if the fields in the Intent object match the intent filters " +
                        "for that component.\n\n" +
                        "An intent filter may contain these elements, which correspond to the fields in the Intent object described above:\n\n" +
                        "<action> " +
                        ": The intent action.\n\n" +
                        "<data> " +
                        ": The type of data accepted, including the MIME type or other attributes of the data URI (such as scheme, host, " +
                        "port, path, and so no).\n\n" +
                        "<category> " +
                        ": The intent category.\n\n" +
                        "You can specify more than one action, data, or category for the same intent filter, or have multiple intent filters per activity to " +
                        "handle different kinds of intents.\n\n" +
                        "Sharing data with ShareCompat.IntentBuilder\n\n" +
                        "Share actions are an easy way for users to share items in your app with social networks and other apps. Although you can " +
                        "build a share action in your own app using implicit intents with the ACTION_SEND action, Android provides the " +
                        "ShareCompat.IntentBuilder helper class to easily implement sharing in your app.\n\n" +
                        "With the ShareCompat.IntentBuilder class you do not need to create or send an implicit intent for the share action. Use the " +
                        "methods in ShareCompat.IntentBuilder to indicate the data you want to share as well as any additional information. Start " +
                        "with the from() method to create a new intent builder, add other methods to add more data, and end with the startChooser() " +
                        "method to create and send the intent.\n\n"
        ));
        list1.add(new AndroidTerm("Managing tasks and activities",
                "Say you have an app with three activities: A, B, and C. A launches B with an intent, and B launches C. C, in " +
                        "turn sends an intent to launch A. In this case the system creates a second instance of A on the top of the stack, rather than " +
                        "bringing the already-running instance to the foreground. Depending on how you implement your activities, the two " +
                        "instances of A can get out of sync and provide a confusing experience for the user as they navigate back through the stack.\n\n" +
                        "Much of the time the Android's default behavior for tasks and activities works fine and you don't have to worry about how " +
                        "your activities are associated with tasks, or how they exist in the back stack. If you want to change the normal behavior, " +
                        "Android provides a number of ways to manage tasks and the activities within those tasks, including:\n\n" +
                        "Activity launch modes, to determine how an activity should be launched.\n\n" +
                        "Task affinities, which indicate which task a launched activity belongs to.\n\n"
        ));
    }

    private void setTerms2() {
        list2.add(new AndroidTerm("The Android Studio Debugger",
                "About debugging\n\n" +
                        "Debugging is the process of finding and fixing errors (bugs) or unexpected behavior in your code. All code has bugs, from " +
                        "incorrect behavior in your app, to behavior that excessively consumes memory or network resources, to actual app freezing " +
                        "or crashing.\n\n" +
                        "Run your app in debug mode\n\n" +
                        "To start debugging, click Debug " +
                        "in the toolbar. Android Studio builds an APK, signs it with a debug key, installs it on " +
                        "your selected device, then runs it and opens the Debug window.\n\n" +
                        "Debug a running app\n\n" +
                        "If your app is already running on a device or emulator, start debugging that app with these steps:\n\n" +
                        "1. Select Run > Attach debugger to Android process or click the Attach " +
                        "icon in the toolbar.\n\n" +
                        "2. In the Choose Process dialog, select the process to which you want to attach the debugger.\n\n" +
                        "By default, the debugger shows the device and app process for the current project, as well as any connected hardware " +
                        "devices or virtual devices on your computer. Select Show all processes to show all processes on all devices.\n\n" +
                        "3. Click OK. The Debug window appears as before.\n\n" +
                        "Resume or Stop Debugging\n\n" +
                        "To resume executing an app after debugging it, select Run > Resume Program or click the Resume\n\n" +
                        "To stop debugging your app, select Run > Stop or click the Stop icon " +
                        "in the toolbar.\n\n" +
                        "Using Breakpoints\n\n" +
                        "A breakpoint is a place in your code where you want to pause the normal execution of your app to perform other actions " +
                        "such as examining variables or evaluating expressions, or executing your code line by line to determine the causes of " +
                        "runtime errors.\n\n" +
                        "Add breakpoints\n\n" +
                        "To add a breakpoint to a line in your code, use these steps:\n\n" +
                        "1. Locate the line of code where you want to pause execution.\n\n" +
                        "2. Click in the left gutter of the editor window at that line, next to the line numbers. A red dot appears at that line, " +
                        "indicating a breakpoint.\n\n" +
                        "You can also use Run > Toggle Line Breakpoint or Control-F8 (Command-F8 on OS X) to set a breakpoint at a line.\n\n" +
                        "If your app is already running, you don't need to update it to add the breakpoint.\n\n" +
                        "When your code execution reaches the breakpoint, Android Studio pauses execution of your app. You can then use the " +
                        "tools in the Android debugger to view the state of the app and debug that app as it runs.\n\n" +
                        "View and configure breakpoints\n\n"
        ));
        list2.add(new AndroidTerm("The Android Studio Debugger",
                "Viewing execution stack frames\n\n" +
                        "The Frames view of the debugger window allows you to inspect the execution stack and the specific frame that caused the " +
                        "current breakpoint to be reached.\n\n" +
                        "The execution stack shows all the classes and methods (frames) that are being executed up to this point in the app, in " +
                        "reverse order (most recent frame first).\n\n" +
                        "Inspecting and modifying variables\n\n" +
                        "The Variables view of the debugger window allows you to inspect the variables available at the current stack frame when " +
                        "the system stops your app on a breakpoint. Variables that hold objects or collections such as arrays can be expanded to " +
                        "view their components.\n\n" +
                        "The Variables pane also allows you to evaluate expressions on the fly using static methods and/or variables available " +
                        "within the selected frame.\n\n" +
                        "Setting watches\n\n" +
                        "The Watches view provides similar functionality to the Variables view except that expressions added to the Watches pane " +
                        "persist between debugging sessions. Add watches for variables and fields that you access frequently or that provide state " +
                        "that is helpful for the current debugging session.\n\n" +
                        "To use watches:\n\n" +
                        "1. Begin debugging your app.\n\n" +
                        "2. In the Watches pane, click the plus (+) button.\n\n" +
                        "In the text box that appears, type the name of the variable or expression you want to watch and then press Enter.\n\n" +
                        "Remove an item from the Watches list by selecting the item and then clicking the minus (-) button.\n\n" +
                        "Change the order of the elements in the Watches list by selecting an item and then clicking the up or down icons.\n\n" +
                        "Evaluating expressions\n\n" +
                        "Use Evaluate Expression to explore the state of variables and objects in your app, including calling methods on those " +
                        "objects. To evaluate an expression:\n\n" +
                        "1. Click the Evaluate Expression\n\n" +
                        "icon, or select Run > Evaluate Expression. You can also right-click on any " +
                        "variable and choose Evaluate Expression.\n\n" +
                        "The Evaluate Expression window appears.\n\n" +
                        "2. Enter any expression into the Expression window and click Evaluate.\n\n" +
                        "The Evaluate Expression window updates with the result of the execution. Note that the result you get from evaluating " +
                        "an expression is based on the app's current state. Depending on the values of the variables in your app at the time you " +
                        "evaluate expressions, you may get different results. Changing the values of variables in your expressions also " +
                        "changes the current running state of the app.\n\n"
        ));
        list2.add(new AndroidTerm("More tools for debugging",
                "Android Studio and the Android SDK include a number of other tools to help you find and correct issues in your code.\n\n" +
                        "These tools include:\n\n" +
                        "System log (logcat)- you can use the Log class to send messages to the " +
                        "Android system log, and view those messages in Android Studio.\n\n" +
                        "Tracing and Logging- Analyzing traces allows you to see how much time is spent in certain methods, and which ones " +
                        "are taking the longest times.\n\n" +
                        "The Android Debug Bridge (ADB). ADB is a command-line tool that lets you communicate with an emulator instance or " +
                        "connected Android-powered device.\n\n" +
                        "Dalvik Debug Monitor Server (DDMS). The DDSM tool provides port-forwarding services, screen capture, thread and " +
                        "heap information, logcat, process, and radio state information, incoming call and SMS spoofing, location data spoofing, " +
                        "and more.\n\n" +
                        "CPU and memory monitors. Android Studio includes a number of monitors to help you visualize the behavior and " +
                        "performance of your app.\n\n" +
                        "Screenshot and video capture.\n\n" +
                        "*In addition to prepping the code itself, there are a few other tasks you need to complete in order to get your app ready to " +
                        "publish. These include:\n\n" +
                        "Removing logging statements\n\n" +
                        "Remove any calls to show Toasts\n\n" +
                        "Disable debugging in the Android manifest by either:\n\n" +
                        "Removing android:debuggable attribute from " +
                        "<application> " +
                        "tag " +
                        "Or setting android:debuggable attribute to false.\n\n " +
                        "Remove all debug tracing calls from your source code files such as startMethodTracing() and stopMethodTracing().\n\n"
        ));
        list2.add(new AndroidTerm("Testing your App ",
                "About testing\n\n" +
                        "Writing and running tests is a critical part of the software development process.\"Test-Driven Development\" (TDD) is a " +
                        "popular software development philosophy that places tests at the core of all software development for an application or " +
                        "service.This does not negate the need for further testing, it merely gives you a solid baseline to work with.\n\n" +
                        "Types of tests\n\n" +
                        "Android supports several different kinds of tests and testing frameworks. Two basic forms of testing Android Studio " +
                        "supports are local unit tests and instrumented tests.\n\n" +
                        "Local unit tests are tests that are compiled and run entirely on your local machine with the Java Virtual Machine (JVM). Use " +
                        "local unit tests to test the parts of your app (such as the internal logic) that do not need access to the Android framework or " +
                        "an Android device or emulator, or those for which you can create fake (\"mock\" or stub) objects that pretend to behave like " +
                        "the framework equivalents.\n\n" +
                        "Instrumented tests are tests that run on an Android device or emulator. These tests have access to the Android framework " +
                        "and to Instrumentation information such as the app's Context. You can use instrumented tests for unit testing, user interface " +
                        "(UI) testing, or integration testing, making sure the components of your app interact correctly with other apps. Most " +
                        "commonly, you use instrumented tests for UI testing, which allows you to test that your app behaves correctly when a user " +
                        "interacts with your app's activities or enters a specific input.\n\n" +
                        "For most forms of user interface testing, you use the Espresso framework, which allows you to write automated UI tests.\n\n"
        ));
        list2.add(new AndroidTerm("More about Unit test",
                "By creating and running unit tests against your " +
                        "code, you can verify that the logic of individual functional code areas or units is correct.\n\n" +
                        "Create unit tests when you need to verify the logic of specific code in your app.\n\n" +
                        "It exercises the functionality of the smallest possible unit of code (which could be a method, class, or " +
                        "component) in a repeatable way.\n\n" +
                        "Typically, the unit of code is tested in isolation; your " +
                        "test monitors changes to that unit only. A mocking framework such as Mockito can be used to isolate your unit from its " +
                        "dependencies.You can also write your unit tests for Android in JUnit 4, a common unit testing framework for Java code.\n\n" +
                        "The Android Testing Support Library provides the infrastructure and APIs for testing Android apps, including support for " +
                        "JUnit 4. With the testing support library you can build and run test code for your apps.\n\n" +
                        "Source sets are a collection of related code in your project that are for different build targets or other \"flavors\" of your app.\n\n" +
                        "When Android Studio creates your project, it creates three source sets for you:\n\n" +
                        "The main source set, for your app's code and resources.\n\n" +
                        "The test source set, for your app's local unit tests.\n\n" +
                        "The androidTest source set, for Android instrumented tests.\n\n" +
                        "A test runner is a library or set of tools that enables testing to occur and the results to be printed to a log. Your Android " +
                        "project has access to a basic JUnit test runner as part of the JUnit4 APIs.\n\n" +
                        "The Android test support library includes a test " +
                        "runner for instrumented and Espresso tests, " +
                        "AndroidJUnitRunner " +
                        ", which also supports Junit 3 and 4.\n\n"));
        list2.add(new AndroidTerm("The Android Support Library",
                "About the Android Support Library\n\n" +
                        "The Android SDK tools include a number libraries collectively called the Android Support Library. This package of libraries " +
                        "provides several features that are not built into the standard Android framework, and provides backward compatibility for " +
                        "older devices. Include any of these libraries in your app to incorporate that library's functionality.\n\n" +
                        "Features\n\n" +
                        "Backward-compatible versions of framework components. These compatibility libraries allow you to use features and " +
                        "components available on newer versions of the Android platform even when your app is running on an older platform " +
                        "version. For example, older devices may not have access to newer features such as fragments, action bars, or " +
                        "Material Design elements. The support library provides access to those features on older devices.\n\n" +
                        "Additional layout and user interface elements. The support library includes views and layouts that can be useful for " +
                        "your app, but are not included in the standard Android framework. For example, the RecyclerView view that you will " +
                        "use in a later chapter is part of the support library.\n\n" +
                        "Support for different device form factors, such as TV or wearables: For example, the Leanback library includes " +
                        "components specific to app development on TV devices.\n\n" +
                        "Design support: The design support library includes components to support Material Design elements in your app, " +
                        "including floating action buttons (FAB)\n\n" +
                        "Various other features such as palette support, annotations, percentage-based layout dimensions, and preferences.\n\n" +
                        "Backward Compatibility\n\n" +
                        "The support library APIs also provide a compatibility layer between different versions of the framework APIs. This " +
                        "compatibility layer transparently intercepts API calls and changes either the arguments passed, handles the operation itself, " +
                        "or redirects the operation.\n\n" +
                        "Versions\n\n" +
                        "Each package in the support library has a version number in three parts (X.Y.Z) that corresponds to an Android API level, " +
                        "and to a particular revision of that library. For example, a support library version number of 22.3.4 is version 3.4 of the " +
                        "support library for API 22.\n\n" +
                        "API Levels\n\n" +
                        "In addition to the actual version number, the name of the support library itself indicates the API level that the library is " +
                        "backward-compatible with. You cannot use a support library in your app for an API higher than the minimum API your app " +
                        "supports.\n\n" +
                        "For example, if the minimum API your app supports is 10, you cannot use the v13 support library or v14 " +
                        "preferences support library in your app."
        ));
        list2.add(new AndroidTerm("Support libraries and features",
                "This section describes the important features provided by the libraries in the Android Support Library.\n\n" +
                        "v4 support library\n\n" +
                        "The v4 support libraries include the largest set of APIs compared to the other libraries, including support for application " +
                        "components, user interface features, accessibility, data handling, network connectivity, and programming utilities.\n\n" +
                        "The v4 support libraries include these specific components:\n\n" +
                        "v4 compat library: Compatibility wrappers (classes that include the word \"Compat\") for a number of core framework " +
                        "APIs.\n\n" +
                        "v4 core-utils library: Provides a number of utility classes\n\n" +
                        "v4 core-ui library: Implements a variety of UI-related components.\n\n" +
                        "v4 media-compat library: Backports portions of the media framework from API 21.\n\n" +
                        "v4 fragment library: Adds support for Android fragments.\n\n" +
                        "v7 support library\n\n" +
                        "v7 appcompat library: Adds support for the Action Bar user interface design pattern and support for material design " +
                        "user interface implementations.\n\n" +
                        "v7 cardview library: Provides the CardView class, a view that lets you show information inside cards.\n\n" +
                        "v7 gridlayout library: Includes the GridLayout class, which allows you to arrange user interface elements using a grid of " +
                        "rectangular cells\n\n" +
                        "v7 mediarouter library: Provides MediaRouter and related media classes that support Google Cast.\n\n" +
                        "v7 palette library: Implements the Palette class, which lets you extract prominent colors from an image.\n\n" +
                        "v7 recyclerview library: Provides the RecyclerView class, a view for efficiently displaying large data sets by providing a " +
                        "limited window of data items.\n\n" +
                        "v7 preference library: Provides APIs to support preference objects in app settings.\n\n" +
                        "Other libraries\n\n" +
                        "v8 renderscript library: Adds support for the RenderScript, a framework for running computationally intensive tasks at " +
                        "high performance.\n\n" +
                        "v13 support library: Provides support for fragments with the FragmentCompat class and additional fragment support " +
                        "classes.\n\n" +
                        "v14 preference support library, and v17 preference support library for TV: provides APIs to add support for preference " +
                        "interfaces on mobile devices and TV.\n\n" +
                        "v17 leanback library: Provides APIs to support building user interfaces on TV devices.\n\n" +
                        "Annotations support library: Contains APIs to support adding annotation metadata to your apps.\n\n" +
                        "Design support library: Adds support for various Material Design components and patterns such as navigation drawers, " +
                        "floating action buttons (FAB), snackbars, and tabs.\n\n" +
                        "Custom Tabs support library: Adds support for adding and managing custom tabs in your apps.\n\n" +
                        "Percent support library: Enables you to add and manage percentage based dimensions in your app.\n\n" +
                        "App recommendation support library for TV: Provides APIs to support adding content recommendations in your app\n\n" +
                        "running on TV devices.\n\n"
        ));
    }

    private void setTerms3() {
        list3.add(new AndroidTerm("User Input Controls",
                "Input controls and view focus\n\n" +
                        "For an Android app, interaction typically includes tapping, pressing, typing, or talking and listening. And " +
                        "the framework provides corresponding user interface (UI) elements such as buttons, menus, keyboards, text entry fields, " +
                        "and a microphone.\n\n" +
                        "The View class represents the basic " +
                        "building block for UI components, including input controls.\n\n" +
                        "View is the base class for classes that provide support for interactive UI components, such as buttons, text fields, and layout managers.\n\n" +
                        "Focus indicates which view is currently selected to receive input. Focus can be initiated by the user by touching a View, " +
                        "such as a TextView or an EditText object. You can define a focus order in which the user is guided from UI control to UI " +
                        "control using the Return key, Tab key, or arrow keys.\n\n" +
                        "Another attribute of an input control is clickable. If this attribute is (boolean) true , then the View can react to click events.\n\n" +
                        "The difference between clickable and focusable is that clickable means the view can be clicked or tapped, while focusable " +
                        "means that the view is allowed to gain focus from an input device such as a keyboard. Input devices like keyboards can't " +
                        "determine which view to send their input events to, so they send them to the view that has focus.\n\n"
        ));
        list3.add(new AndroidTerm("Buttons",
                "A button is a rectangle or rounded rectangle, wider than it is tall, with a descriptive caption in its center.\n\n" +
                        "Android offers several types of buttons, including raised buttons and flat buttons. These " +
                        "buttons have three states: normal, disabled, and pressed.\n\n" +
                        "A raised button is a rectangle or rounded rectangle that appears lifted from the screen—the shading around it indicates that " +
                        "it is possible to touch or click it. The raised button can show text or an icon, or show both text and an icon.\n\n" +
                        "1. Normal state: In its normal state, the button looks like a raised button.\n\n" +
                        "2. Disabled state: When the button is disabled, it is grayed out and it's not active in the app's context. In most cases you " +
                        "would hide an inactive button, but there may be times when you would want to show it as disabled.\n\n" +
                        "3. Pressed state: The pressed state, with a larger background shadow, indicates that the button is being touched or " +
                        "clicked. When you attach a callback to the button (such as the OnClick attribute), the callback is called when the button " +
                        "is in this state.\n\n" +
                        "A flat button, also known as a borderless button, is a text-only button that appears flat on the screen without a shadow. The " +
                        "major benefit of flat buttons is simplicity — they minimize distraction from content. Flat buttons are useful when you have a " +
                        "dialog.\n\n" +
                        "Flat buttons, shown below, resemble basic buttons except that they have no borders or background, but still change " +
                        "appearance during different states. A flat button shows an ink shade around it when pressed (touched or clicked).\n\n" +
                        "You can turn any View, such as an ImageView, into a button by adding the android:onClick attribute in the XML layout.\n\n" +
                        "The image for the ImageView must already be stored in the drawables folder of your project.\n\n" +
                        "A floating action button is a circular button that appears to float above the layout.\n\n" +
                        "You should use a floating action button only to represent the primary action for a screen. For example, the primary action " +
                        "for the Contacts app's main screen is adding a contact, as shown in the figure above. A floating action button is the right " +
                        "choice if your app requires an action to be persistent and readily available on a screen. Only one floating action button is " +
                        "recommended per screen.\n\n"
        ));
        list3.add(new AndroidTerm("Using input controls for making choices",
                "Android offers ready-made input controls for the user to select one or more choices:\n\n" +
                        "Checkboxes: Select one or more values from a set of values by clicking each value's checkbox.\n\n" +
                        "Radio buttons: Select only one value from a set of values by clicking the value's circular \"radio\" button. If you are " +
                        "providing only two or three choices, you might want to use radio buttons for the choices if you have room in your layout for them.\n\n" +
                        "Toggle button: Select one state out of two or more states. Toggle buttons usually offer two visible states, such as \"on\" " +
                        "and \"off\".\n\n" +
                        "Spinner: Select one value from a set of values in a drop-down menu. Only one value can be selected. Spinners are " +
                        "useful for three or more choices, and takes up little room in your layout.\n\n" +
                        "Checkboxes\n\n" +
                        "Use checkboxes when you have a list of options and the user may select any number of choices, including no choices.\n\n" +
                        "Each checkbox is independent of the other checkboxes in the list, so checking one box doesn't uncheck the others. (If you " +
                        "want to limit the user's selection to only one item of a set, use radio buttons.) A user can also uncheck an already checked " +
                        "checkbox.\n\n" +
                        "You can determine if a checkbox is selected by using the isChecked() method (inherited from CompoundButton). The " +
                        "isChecked() method will return a (boolean)true if there is a checkmark in the box.\n\n" +
                        "Radio buttons\n\n" +
                        "Use radio buttons when you have two or more options that are mutually exclusive—the user must select only one of them.\n\n" +
                        "Each radio button is an instance of the RadioButton class. Radio buttons are normally used together in a RadioGroup.\n\n" +
                        "When several radio buttons live inside a radio group, checking one radio button unchecks all the others.\n\n"
        ));
        list3.add(new AndroidTerm("Using input controls for making choices",
                "Toggle buttons and switches\n\n" +
                        "A toggle input control lets the user change a setting between two states. Android provides the ToggleButton class, which " +
                        "shows a raised button with \"OFF\" and \"ON\".\n\n" +
                        "Android also provides the Switch class, which is a short slider that looks like a rocker switch offering two states (on and off).\n\n" +
                        "Both are extensions of the CompoundButton class.\n\n" +
                        "Spinners\n\n" +
                        "A spinner provides a quick way to select one value from a set. Touching the spinner displays a drop-down list with all " +
                        "available values, from which the user can select one.\n\n" +
                        "If you have a long list of choices, a spinner may extend beyond your layout, forcing the user to scroll it. A spinner scrolls " +
                        "automatically, with no extra code needed. However, scrolling a long list (such as a list of countries) is not recommended as " +
                        "it can be hard to select an item.\n\n" +
                        "You can specify the values for the spinner by add an adapter that fills the spinner list with values.\n\n" +
                        "An adapter is like a bridge, or intermediary, between two incompatible interfaces. For example, a memory card reader acts as an adapter between the memory card and a laptop.\n\n" +
                        "You plug the memory card into the card reader, and plug the card reader into the laptop, so that the laptop can read the " +
                        "memory card.\n\n" +
                        "The spinner-adapter pattern takes the data set you've specified and makes a view for each item in the data set.\n\n" +
                        "The SpinnerAdapter class, which implements the Adapter class, allows you to define two different views: \n\n" +
                        "One that shows the data values in the spinner itself, and one that shows the data in the drop-down list when the spinner is touched or clicked.\n\n" +
                        "The values you provide for the spinner can come from any source, but must be provided through a SpinnerAdapter, such " +
                        "as an ArrayAdapter if the values are available in an array.\n\n"
        ));
        list3.add(new AndroidTerm("Using input controls for making choices",
                "Text input\n\n" +
                        "Use the EditText class to get user input that consists of textual characters, including numbers and symbols. EditText " +
                        "extends the TextView class, to make the TextView editable.\n\n" +
                        "If you add the android:inputType attribute to the EditText view with a value such as  \"textCapCharacters(to change the input to all capital letters)\" or \"textAutoComplete\"(to enable spelling suggestions as the user types), tapping the Return key " +
                        "closes the on-screen keyboard and advances the focus to the next view.\n\n" +
                        "This behavior is useful if you want the user to fill " +
                        "out a form consisting of EditText fields, so that the user can advance quickly to the next EditText view.\n\n" +
                        "Changing keyboards and input behaviors\n\n" +
                        "The Android system shows an on-screen keyboard—known as a soft input method—when a text field in the UI receives " +
                        "focus.\n\n" +
                        "To provide the best user experience, you can specify characteristics about the type of input the app expects, such as " +
                        "whether it's a phone number or email address. You can also specify how the input method should behave, such as whether " +
                        "or not it shows spelling suggestions or provides capital letters for the beginning of a sentence. You can change the soft " +
                        "input method to a numeric keypad for entering only numbers, or even a phone keypad for phone numbers.\n\n" +
                        "Android also provides an extensible framework for advanced programmers to develop and install their own Input Method" +
                        "Editors (IME) for speech input, specific types of keyboard entry, and other applications.\n\n" +
                        "Declare the input method by adding the android:inputType attribute to the EditText view.\n\n" +
                        "You can use the pipe (|) character (Java bitwise OR) to combine attribute values for the android:inputType attribute \n\n" +
                        "*On Android devices, the \"action\" key is the Return key. This key is normally used to enter another line of text for an " +
                        "EditText element that allows multiple lines.\n\n" +
                        "If you want the user to enter something other than text, such as a phone number, you may want to change the \"action\" key " +
                        "to an icon for a Send key, and change the action to be dialing a phone number.\n\n"
        ));
        list3.add(new AndroidTerm("Using input controls for making choices",
                "Using dialogs and pickers\n\n" +
                        "A dialog is a window that appears on top of the display or fills the display, interrupting the flow of activity. Dialogs inform " +
                        "users about a specific task and may contain critical information, require decisions, or involve multiple tasks.\n\n" +
                        "The base class for all dialog components is a Dialog.\n\n" +
                        "There are several useful Dialog subclasses for alerting the user on a " +
                        "condition, showing status or progress, displaying information on a secondary device, or selecting or confirming a choice.\n\n" +
                        "The Android SDK also provides ready-to-use dialog subclasses such as pickers for picking a time or a date.\n\n" +
                        "Pickers allow users to enter information in a " +
                        "predetermined, consistent format that reduces the chance for input error.\n\n" +
                        "The Dialog class is the base class for dialogs, but you should avoid instantiating Dialog directly unless you are creating a " +
                        "custom dialog.\n\nFor standard Android dialogs, use one of the following subclasses:\n\n" +
                        "AlertDialog: A dialog that can show a title, up to three buttons, a list of selectable items, or a custom layout.\n\n" +
                        "DatePickerDialog or TimePickerDialog: A dialog with a pre-defined UI that lets the user select a date or time.\n\n" +
                        "The Dialog class is the base class for dialogs, but you should avoid instantiating Dialog directly unless you are creating a " +
                        "custom dialog. For standard Android dialogs, use one of the following subclasses:\n\n" +
                        "AlertDialog: A dialog that can show a title, up to three buttons, a list of selectable items, or a custom layout.\n\n" +
                        "DatePickerDialog or TimePickerDialog: A dialog with a pre-defined UI that lets the user select a date or time.\n\n" +
                        "Showing an alert dialog\n\n" +
                        "*When showing a picker, you should use an instance of DialogFragment, a subclass of Fragment, which displays a dialog " +
                        "window floating on top of its activity's window. A fragment is a behavior or a portion of user interface within an activity. It's " +
                        "like a mini-activity within the main activity, with its own individual lifecycle. A fragment receives its own input events, and you " +
                        "can add or remove it while the main activity is running. You might combine multiple fragments in a single activity to build a " +
                        "multiple-pane user interface, or reuse a fragment in multiple activities.\n\n" +
                        "One benefit of using fragments for the pickers is that you can isolate the code sections for managing the date and the time " +
                        "after the user selects them from the pickers. You can also use DialogFragment to manage the dialog lifecycle.\n\n" +
                        "Tip: Another benefit of using fragments for the pickers is that you can implement different layout configurations, such as a " +
                        "basic dialog on handset-sized displays or an embedded part of a layout on large displays.\n\n"
        ));
        list3.add(new AndroidTerm("Recognizing gestures",
                "A touch gesture occurs when a user places one or more fingers on the touch screen, and your app interprets that pattern of " +
                        "touches as a particular gesture, such as a long touch, double-tap, fling, or scroll.\n\n" +
                        "Although your app should not depend on touch gestures for basic behaviors (since the gestures may not be available to all users in all contexts), adding " +
                        "touch-based interaction to your app can greatly increase its usefulness and appeal.\n\n" +
                        "Detecting common gestures\n\n" +
                        "If your app uses common gestures such as double tap, long press, fling, and so on, you can take advantage of the " +
                        "GestureDetector class for detecting common gestures. Use GestureDetectorCompat, which is provided as a compatibility " +
                        "implementation of the framework's GestureDetector class which guarantees the newer focal point scrolling behavior from " +
                        "Jellybean MR1 on all platform versions. This class should be used only with motion events reported for touch devices— " +
                        "don't use it for trackball or other hardware events.\n\n" +
                        "GestureDetectorCompat lets you detect common gestures without processing the individual touch events yourself. It " +
                        "detects various gestures and events using MotionEvent objects, which report movements by a finger (or mouse, pen, or " +
                        "trackball).\n\n" +
                        "Detecting all gestures\n\n" +
                        "To detect all types of gestures, you need to perform two essential steps:\n\n" +
                        "1. Gather data about touch events.\n\n" +
                        "2. Interpret the data to see if it meets the criteria for any of the gestures your app supports.\n\n" +
                        "The gesture starts when the user first touches the screen, continues as the system tracks the position of the user's " +
                        "finger(s), and ends by capturing the final event of the user's fingers leaving the screen. Throughout this interaction, an " +
                        "object of the MotionEvent class is delivered to onTouchEvent(), providing the details of every interaction. Your app can use " +
                        "the data provided by the MotionEvent to determine if a gesture it cares about happened.\n\n"
        ));
        list3.add(new AndroidTerm("Menus",
                "A menu is a set of options the user can select from to perform a function, such as searching for information, saving " +
                        "information, editing information, or navigating to a screen.\n\n" +
                        "Android offers the following types of menus, which are useful for different situations: \n\n" +
                        "1. Options menu: Appears in the app bar and provides the primary options that affect using the app itself. Examples of " +
                        "menu options: Search to perform a search, Bookmark to save a link to a screen, and Settings to navigate to the " +
                        "Settings screen.\n\n" +
                        "2. Context menu: Appears as a floating list of choices when the user performs a long tap on an element on the screen.\n\n" +
                        "Examples of menu options: Edit to edit the element, Delete to delete it, and Share to share it over social media.\n\n" +
                        "3. Contextual action bar: Appears at the top of the screen overlaying the app bar, with action items that affect the selected " +
                        "element(s). Examples of menu options: Edit, Share, and Delete for one or more selected elements.\n\n" +
                        "4. Popup menu: Appears anchored to a view such as an ImageButton, and provides an overflow of actions or the second " +
                        "part of a two-part command. Example of a popup menu: the Gmail app anchors a popup menu to the app bar for the " +
                        "message view with Reply, Reply All, and Forward.\n\n" +
                        "The app bar and options menu\n\n" +
                        "The app bar (also called the action bar) is a dedicated space at the top of each activity screen. When you create an activity " +
                        "from a template (such as Empty Template), an app bar is automatically included for the activity in a CoordinatorLayout root " +
                        "view group at the top of the view hierarchy.\n\n" +
                        "The options menu in the app bar provides navigation to other activities in the app, or the primary options that affect using " +
                        "the app itself — but not ones that perform an action on an element on the screen.\n\n" +
                        "The options menu appears in the right corner of the app bar. The app bar is split into four different functional areas that apply to most apps:\n\n" +
                        "1. Navigation button or Up button: Use a navigation button in this space to open a navigation drawer, or use an Up button " +
                        "for navigating up through your app's screen hierarchy to the parent activity. Both are described in the next chapter.\n\n" +
                        "2. Title: The title in the app bar is the app title, or the name defined in AndroidManifest.xml by the android:label attribute " +
                        "for the activity.\n\n" +
                        "3. Action icons for the options menu: Each action icon appears in the app bar and represents one of the options menu's " +
                        "most frequently used items. Less frequently used options menu items appear in the overflow options menu.\n\n" +
                        "4. Overflow options menu: The overflow icon opens a popup with option menu items that are not shown as icons in the " +
                        "app bar.\n\n"
        ));
        list3.add(new AndroidTerm("Toolbar",
                "Each activity that uses the default theme also has an ActionBar as its app bar.\n\n" +
                        "However, as features were added to the native ActionBar over various Android releases, the native ActionBar behaves " +
                        "differently depending on the version of Android running on the device.\n\n" +
                        "For this reason, if you are adding an options menu, " +
                        "you should use the v7 appcompat support library's Toolbar as an app bar. Using the Toolbar makes it easy to set up an app " +
                        "bar that works on the widest range of devices, and also gives you room to customize your app bar later on as your app " +
                        "develops. Toolbar includes the most recent features, and works for any device that can use the support library.\n\n" +
                        "If you are not using the Basic Activity template, you can include the Toolbar in an activity's layout by adding an " +
                        "AppBarLayout and a Toolbar element. AppBarLayout is a vertical LinearLayout which implements many of the features of " +
                        "the material designs app bar concept, such as scrolling gestures.\n\n" +
                        "Contextual menu\n\n" +
                        "Use a contextual menu to allow users to take an action on a selected view. You can provide a context menu for any View, " +
                        "but they are most often used for items in a RecyclerView, GridView, or other view collections in which the user can perform " +
                        "direct actions on each item.\n\n" +
                        "Android provides two kinds of contextual menus:\n\n" +
                        "A context menu, shown on the left side in the figure below, appears as a floating list of menu items when the user " +
                        "performs a long tap on a view element on the screen. It is typically used to modify the view element or use it in some " +
                        "fashion. For example, a context menu might include Edit to edit a view element, Delete to delete it, and Share to " +
                        "share it over social media. Users can perform a contextual action on one view element at a time.\n\n" +
                        "A Contextual action bar, shown on the right side of the figure below, appears at the top of the screen in place of the " +
                        "app bar or underneath the app bar, with action items that affect the selected view element(s). Users can perform an " +
                        "action on multiple view elements at once (if your app allows it).\n\n" +
                        "Contextual action bar\n\n" +
                        "A contextual action bar appears at the top of the screen to present actions the user can perform on a view after long-clicking the view.\n\n" +
                        "The contextual action bar appears only when contextual action mode, a system implementation of ActionMode, occurs as a " +
                        "result of the user performing a long-click on the View.\n\n" +

                        "ActionMode represents a user interface (UI) mode for providing alternative interaction, replacing parts of the normal UI until " +
                        "finished. For example, text selection is implemented as an ActionMode, as are contextual actions that work on a selected " +
                        "item on the screen. Selecting a section of text or long-clicking a view triggers ActionMode.\n\n" +

                        "While this mode is enabled, the user can select multiple items (if your app allows it), deselect items, and continue to " +
                        "navigate within the activity. The action mode is disabled and the contextual action bar disappears when the user deselects " +
                        "all items, presses the Back button, or taps Done (left-arrow icon) on the left side of the bar.\n\n"
        ));
        list3.add(new AndroidTerm("Popup menu",
                "A PopupMenu is a vertical list of items anchored to a View. It appears below the anchor view if there is room, or above the " +
                        "view otherwise.\n\n" +
                        "A popup menu is typically used to provide an overflow of actions (similar to the overflow action icon for the options menu) or " +
                        "the second part of a two-part command. Use a popup menu for extended actions that relate to regions of content in your " +
                        "activity. Unlike a context menu, a popup menu is anchored to a Button (View), is always available, and it's actions generally " +
                        "do not affect the content of the View.\n\n" +
                        "For example, the Gmail app uses a popup menu anchored to the overflow icon in the app bar when showing an email " +
                        "message. The popup menu items Reply, Reply All, and Forward are related to the email message, but don't affect or act " +
                        "on the message. Actions in a popup menu should not directly affect the corresponding content (use a contextual menu to " +
                        "directly affect selected content).\n\n"
        ));
        list3.add(new AndroidTerm("Screen Navigation",
                "Different paths through your app that offer the following types of navigation:\n\n" +
                        "Back navigation: Users can navigate back to the previous screen using the Back button.\n\n" +
                        "Hierarchical navigation: Users can navigate through a hierarchy of screens organized with a parent screen for every " +
                        "set of child screens.\n\n" +
                        "Back-button navigation\n\n" +
                        "You don't have to manage the Back button in your app. The system handles tasks and the back stack—the list of previous " +
                        "screens—automatically. The Back button by default simply traverses this list of screens, removing the current screen from " +
                        "the list as the user presses it.\n\n" +
                        "The onBackPressed() method of the Activity class is called whenever the activity detects the user's press of the Back key.\n\n" +
                        "Hierarchical navigation patterns\n\n" +
                        "To give the user a path through the full range of an app's screens, the best practice is to use some form of hierarchical " +
                        "navigation.\n\n" +
                        "You can enable the user to navigate up to and down from a parent, and sideways among siblings:\n\n" +
                        "Descendant navigation: Navigating down from a parent screen to a child screen.\n\n" +
                        "Ancestral navigation: Navigating up from a child screen to a parent screen.\n\n" +
                        "Lateral navigation: Navigating from one sibling to another sibling (at the same level).\n\n" +
                        "You can use a main activity (as a parent screen) and then other activities or fragments to implement a hierarchy of screens " +
                        "within an app.\n\n" +
                        "If the child screen siblings do not have another level of child screens under them, you can implement them as fragments. A " +
                        "Fragment represents a behavior or portion of a user interface within in an activity. Think of a fragment as a modular section " +
                        "of an activity which has its own lifecycle, receives its own input events, and which you can add or remove while the activity " +
                        "is running.\n\n" +
                        "You can combine multiple fragments in a single activity.\n\n"
        ));
        list3.add(new AndroidTerm("Ancestral navigation (the Up button)",
                "With ancestral navigation in a multitier hierarchy, you enable the user to go up from a section sibling to the collection " +
                        "sibling, and then up to the parent screen.\n\n" +
                        "The Up button is used to navigate within an app based on the hierarchical relationships between screens.\n\n" +
                        "*Tip: The Back button below the screen differs from the Up button. The Back button provides navigation to whatever screen " +
                        "you viewed previously. If you have several children screens that the user can navigate through using a lateral navigation " +
                        "pattern, the Back button would send the user back to the previous child screen, not to " +
                        "the parent screen. Use an Up button if you want to provide ancestral navigation from a child screen back to the parent " +
                        "screen.\n\n" +
                        "With descendant navigation, you enable the user to go from the parent screen to a first-level child screen, and from a first-" +
                        "level child screen down to a second-level child screen.\n\n" +
                        "Buttons or targets\n\n" +
                        "The best practice for descendant navigation from the parent screen to collection siblings is to use buttons or simple targets " +
                        "such as an arrangement of images or iconic buttons (also known as a dashboard). When the user touches a button, the " +
                        "collection sibling screen opens, replacing the current context (screen) entirely.\n\n" +
                        "A dashboard usually has either two or three rows and columns, with large touch targets to make it easy to use. Dashboards " +
                        "are best when each collection sibling is equally important. You can use a LinearLayout, RelativeLayout, or GridLayout.\n\n" +
                        "Navigation drawer\n\n" +
                        "A navigation drawer is a panel that usually displays navigation options on the left edge of the screen, as shown on the right " +
                        "side of the figure below. It is hidden most of the time, but is revealed when the user swipes a finger from the left edge of the " +
                        "screen or touches the navigation icon in the app bar.\n\n" +
                        "A good example of a navigation drawer is in the Gmail app, which provides access to the Inbox, labelled email folders, and " +
                        "settings. The best practice for employing a navigation drawer is to provide descendant navigation from the parent activity to " +
                        "all of the other activities or fragments in an app. It can display many navigation targets at once—for example, it could " +
                        "contain buttons (like a dashboard), tabs, or a list of items (like the Gmail drawer).\n\n" +
                        "Lists and carousels\n\n" +
                        "Use a scrolling list, such as a RecyclerView, to provide navigation targets for descendant navigation. Vertically scrolling lists " +
                        "are often used for a screen that lists stories, with each list item acting as a button to each story. For more visual or media-" +
                        "rich content items such as photos or videos, you may want to use a horizontally-scrolling list (also known as a carousel).\n\n" +
                        "These UI elements are good for presenting items in a collection (for example, a list of news stories).\n\n" +
                        "Master/detail navigation flow\n\n" +
                        "In a master/detail navigation flow, a master screen contains a list of items, and a detail screen shows detailed information " +
                        "about a specific item. Descendant navigation is usually implemented by one of the following:\n\n" +
                        "Using an Intent that starts an activity representing the detail screen.\n\n" +
                        "When adding a Settings Activity, you can extend PreferenceActivity to create a two-pane master/detail layout to " +
                        "support large screens, and include fragments within the activity to replace the activity's content with a settings " +
                        "fragment. This is a useful pattern if you have multiple groups of settings and need to support tablet-sized screens as " +
                        "well as smartphones.\n\n" +
                        "Options menu in the app bar\n\n" +
                        "The app bar typically contains the options menu, which is most often used for navigation patterns for descendant " +
                        "navigation. It may also contain an Up icon for ancestral navigation, a nav icon for opening a navigation drawer, and a filter " +
                        "icon to filter page views.\n\n"
        ));
        list3.add(new AndroidTerm("Lateral navigation with tabs and swipes",
                "With lateral navigation, you enable the user to go from one sibling to another (at the same level in a multitier hierarchy). For " +
                        "example, if your app provides several categories of stories (such as Top Stories, Tech News, and Cooking " +
                        ",you would want to provide your users the ability to navigate from one category to the next, or from one top " +
                        "story to the next, without having to navigate back up to the parent screen.\n\n" +
                        "You can implement lateral navigation with tabs that represent each screen. Tabs appear across the top of a screen, as " +
                        "shown on the left side of the above figure, providing navigation to other screens. Tab navigation is a common solution for " +
                        "lateral navigation from one child screen to another child screen that is a sibling—in the same position in the hierarchy and " +
                        "sharing the same parent screen.\n\n" +
                        "Tabs are most appropriate for small sets (four or fewer) of sibling screens. You can combine tabs with swipe views, so that " +
                        "the user can swipe across from one screen to another as well as tap a tab.\n\n" +
                        "Tabs offer two benefits:\n\n" +
                        "Since there is a single, initially-selected tab, users already have access to that tab's content from the parent screen " +
                        "without any further navigation.\n\n" +
                        "Users can navigate quickly between related screens, without needing to first revisit the parent.\n\n" +
                        "Keep in mind the following best practices when using tabs:\n\n" +
                        "Tabs are usually laid out horizontally.\n\n" +
                        "Tabs should always run along the top of the screen, and should not be aligned to the bottom of the screen.\n\n" +
                        "Tabs should be persistent across related screens. Only the designated content region should change when tapping a " +
                        "tab, and tab indicators should remain available at all times.\n\n" +
                        "Switching to another tab should not be treated as history. For example, if a user switches from tab A to tab B, pressing " +
                        "the Up button in the app bar should not reselect tab A but should instead return the user to the parent screen.\n\n"
        ));
        list3.add(new AndroidTerm("RecyclerView",
                "When you display a large number of items in a scrollable list, most items are not visible. For example, in a long list of words " +
                        "or many news headlines, the user only sees a small number of list items at a time.\n\n" +
                        "Or you may have a dataset that changes as the user interacts with it. If you create a new view every time the data changes, " +
                        "that's also a lot of views, even for a small dataset.\n\n" +
                        "From a performance perspective, you want to minimize the number of views kept around at any given point (Memory), and " +
                        "the number of views you have to create (Time). Both of these goals can be accomplished by creating somewhat more " +
                        "views than the user can see on the screen, and cache and reuse previously created views with different data as they scroll " +
                        "in and out of view.\n\n" +
                        "The RecyclerView class is a more advanced and flexible version of ListView. It is a container for displaying large data sets " +
                        "that can be scrolled very efficiently by maintaining a limited number of views.\n\n" +
                        "Use the RecyclerView widget when you need to display a large amount of scrollable data, or data collections whose " +
                        "elements change at runtime based on user action or network events.\n\n"

        ));
    }

    private void setTerms4() {
        list4.add(new AndroidTerm("Drawables",
                "A drawable is a graphic that can be drawn to the screen.\n\n" +
                        "To display a drawable, use the ImageView class to create a View. In the <ImageView> element in your XML file, define how " +
                        "the drawable is displayed and where the drawable file is located.\n\n" +
                        "Image files\n\n" +
                        "An image file is a generic bitmap file. Android supports image files in several formats: WebP (preferred), PNG (preferred), " +
                        "and JPG (acceptable). GIF and BMP formats are supported, but discouraged.\n\n" +
                        "The WebP format is fully supported from Android 4.2. WebP compresses better than other formats for lossless and lossy " +
                        "compression, potentially resulting in images more than 25% smaller than JPEG formats. You can convert existing PNG and " +
                        "JPEG images into WebP format before upload.\n\n" +
                        "Be aware that images look different on screens with different pixel densities and aspect ratios.\n\n" +
                        "Note: Always use appropriately sized images, because images can use up a lot of disk space and affect your app's " +
                        "performance.\n\n" +
                        "Nine-patch files\n\n" +
                        "A 9-patch is a PNG image in which you define stretchable regions. Use a 9-patch as the background image for a View to " +
                        "make sure the View looks correct for different screen sizes and orientations.\n\n" +
                        "For example, in a View that has layout_width set to \"wrap_content\" " +
                        ", the View stays big enough to enclose its content " +
                        "(plus padding). If you use a normal PNG image as the background image for the View, the image might be too small for the " +
                        "for the View on some devices, because the View stretches to accommodate the content inside it. If you use a 9-patch " +
                        "image instead, the 9-patch stretches as the View stretches.\n\n" +
                        "Android's standard Button widget is an example of a View that uses a 9-patch as its background image. The 9-patch " +
                        "stretches to accommodate the text or image inside the button.\n\n" +
                        "Save 9-patch files with a .9.png extension and store them in the res/drawable folder.\n\n" +
                        "To create a 9-patch, use the Draw 9-Patch tool in Android Studio.\n\n" +
                        "Layer list drawables\n\n" +
                        "In Android you can build up an image by layering other images together, just as you can in Gimp and other image- " +
                        "manipulation programs. Each layer is represented by an individual drawable. The drawables that make up a single image " +
                        "are organized and managed in a <layer-list> element in XML.\n\n" +
                        "Within the <layer-list>, each drawable is represented by an <item> element.\n\n"
        ));
        list4.add(new AndroidTerm("Drawables",
                "Shape drawables\n\n" +
                        "A shape drawable is a rectangle, oval, line, or ring that you define in XML. You specify the size and style of the shape using XML attributes.\n\n" +
                        "State list drawables\n\n" +
                        "A StateListDrawable is a drawable object that uses a different image to represent the same object, depending on what state the object is in.\n\n" +
                        "For example, a Button widget can exist in one of several states (pressed, focused on, hovered over, or " +
                        "none of these). Using a state list drawable, you can provide a different background image for each state.\n\n" +
                        "During each state change, Android traverses the state list from top to bottom. The first item that matches the current state " +
                        "is used, which means that the selection is not based on the \"best match,\" but is simply the first item that meets the " +
                        "minimum criteria of the state.\n\n" +
                        "Level list drawables\n\n" +
                        "A level list drawable defines alternate drawables, each assigned a maximum numerical value. To select which drawable to use, call the setLevel() " +
                        "method, passing in an integer that is matched against the maximum level integer defined in XML.\n\n" +
                        "The resource with the lowest maximum level greater than or equal to the integer passed into setLevel() is selected.\n\n" +
                        "An example use of a LevelListDrawable is a battery level indicator icon that uses different images to indicate different current battery levels.\n\n" +
                        "Transition drawables\n\n" +
                        "A TransitionDrawables is a drawable that cross-fades between two other drawables.To define a transition drawable in XML,use the <transition> element.\n\n" +
                        "Each drawable is represented by an <item> element inside the <transition> element.\n\n" +
                        "No more than two <item> elements are supported.\n\n" +
                        "Vector drawables\n\n" +
                        "In Android 5.0 (API Level 21) and above, you can define vector drawables, which are images that are defined by a path.\n\n" +
                        "Vector drawables scale without losing definition. Most vector drawables use SVG files, which are plain text files or " +
                        "compressed binary files that include two-dimensional coordinates for how the image is drawn on the screen.\n\n" +
                        "Because SVG files are text, they are more space efficient than most other image files. Also, you only need one file for a vector image instead of a file for each screen density, as is the case for bitmap images."
        ));
        list4.add(new AndroidTerm("Images",
                "Images, from launcher icons to banner images, are used in many ways in Android. Each use case has different " +
                        "requirements for image resolution, scalability and simplicity.\n\n" +
                        "Creating icons\n\n" +
                        "Every app requires at least a launcher icon, and apps often include icons for action bar actions, notifications, and other use cases.\n\n" +
                        "There are two approaches to creating icons:\n\n" +
                        "Create a set of image files of the same icon in different resolutions and sizes so that the icon looks the same across " +
                        "devices with different screen densities. You can use Image Asset Studio to do this.\n\n" +
                        "Use vector drawables, which scale automatically without the image becoming pixelated or blurry. You can use Vector " +
                        "Asset Studio to do this.\n\n" +
                        "Image Asset Studio\n\n" +
                        "Helps you generate your own app icons from Material Design icons, custom images, and text strings.It generates a set of icons at the appropriate resolution for each generalized screen " +
                        "density that your app supports. Image Asset Studio places the newly generated icons in density-specific folders under the " +
                        "res/ folder in your project. At runtime, Android uses the appropriate resource based on the screen density of the device your app is running on.\n\n" +
                        "Image Asset Studio helps you generate the following icon types:\n\n" +
                        "Launcher icons\n\n" +
                        "Action bar and tab icons\n\n" +
                        "Notification icons\n\n" +
                        "Vector Asset Studio\n\n" +
                        "Starting with API 21, you can use vector drawables instead of image files for your icons.\n\n" +
                        "Advantages of using vector drawables as icons:\n\n" +
                        "Vector drawables can reduce your APK file size dramatically, because you don't have to include multiple versions of " +
                        "each icon image. You can use one vector image to scale seamlessly to any resolution.\n\n" +
                        "Users might be more likely to download an app that has smaller files and a smaller package size.\n\n" +
                        "Disadvantages of using vector drawables as icons:\n\n" +
                        "A vector drawable can include only a limited amount of detail. Vector drawables are mostly used for less detailed icons " +
                        "such as the Material Design icons. Icons with more detail usually need image files.\n\n" +
                        "Vector drawables are not supported on devices running API level 20 or below.\n\n" +
                        "Vector Asset Studio is a tool that helps you add Material Design icons and vector drawables to your Android project.\n\n"
        ));
        list4.add(new AndroidTerm("Images",
                "Creating other images\n\n" +
                        "Banner images, user profile pictures, and other images come in all shapes and sizes. In many cases they are larger than " +
                        "they need to be for a typical application user interface (UI). For example, the system Gallery app displays photos taken " +
                        "using an Android device's camera, and these photos are typically much higher resolution than the screen density of the " +
                        "device. Android devices have finite memory, so ideally, you want to load only a lower resolution version of a photo in " +
                        "memory. The lower resolution version should match the size of the UI component that displays it. An image with a higher " +
                        "resolution doesn't provide any visible benefit, but still takes up precious memory and adds additional performance overhead " +
                        "due to additional on-the-fly scaling.\n\n" +
                        "Use image-loading libraries\n\n" +
                        "Image-loading libraries like Glide and Picasso can handle image sizing, caching, and display. These third-party libraries are " +
                        "optimized for mobile, and they are well-documented.\n\n" +
                        "Glide supports fetching, decoding, and displaying video stills, images, and animated GIFs. You can use Glide to load " +
                        "images from Web APIs, as well as ones located in your resource files. Glide includes features such as loading placeholder " +
                        "images (for loading more detailed images), cross-fade animations, and automatic caching.\n\n" +
                        "Speeding up your app\n\n" +
                        "Fetching and caching images\n\n" +
                        "When your app is fetching images over a network, a slow connection might leave your user waiting. Here are ways to keep " +
                        "your app feeling fast, even if images load slowly:\n\n" +
                        "Prioritize more important images so that they load first. Libraries like Glide and Picasso let you order requests by " +
                        "image priority.\n\n" +
                        "Prioritize requests for text before requests for images. If your app is usable without images, for example if it's a news " +
                        "feed app, letting a user scroll past your image can make the app functional and might even render the image request obsolete.\n\n" +
                        "Display placeholder colors while fetching images.\n\n" +
                        "If you display placeholder colors, you want the look of your app to stay consistent while the app loads images. Use the " +
                        "Palette library to select a placeholder color based on the requested image's color balance.\n\n" +
                        "Serving images over a network\n\n" +
                        "To save bandwidth and keep your app moving fast, use WebP formats to serve and send images.\n\n" +
                        "Another way to save bandwidth is to serve and cache custom-sized images. To do this, allow clients to specify the " +
                        "resolution and size required for their device and View, then generate and cache the needed image on the server side " +
                        "before you send it.\n\n" +
                        "*Tip: Use the Activity.isLowRamDevice() method to find out whether a device defines itself as \"low RAM.\". If the method returns true " +
                        ", send low-resolution images so that your app uses less on-device memory.\n\n"
        ));
        list4.add(new AndroidTerm("Styles And Theme",
                "In Android, a style is a collection of attributes that define the look and format of a View. You can apply the same style to any " +
                        "number of Views in your app; for example, several TextViews might have the same text size and layout. Using styles allows " +
                        "you to keep these common attributes in one location and apply them to each TextView using a single line of code in XML.\n\n" +
                        "A new style can inherit the properties of an existing style. When you create a style that inherits properties, you define only " +
                        "the properties that you want to change or add. You can inherit properties from platform styles and from styles that you " +
                        "create yourself. To inherit a platform style, use the parent attribute to specify the resource ID of the style you want to inherit.\n\n" +
                        "Themes\n\n" +
                        "You create a theme the same way you create a style, which is by adding a <style> element inside a <resources> element in any XML file located in the res/values/ folder.\n\n" +
                        "What's the difference between a style and a theme?\n\n" +
                        "A style applies to a View. In XML, you apply a style using the style attribute.\n\n" +
                        "A theme applies to an entire Activity or application, rather than to an individual View. In XML, you apply a theme using the android:theme attribute.\n\n" +
                        "Any style can be used as a theme\n\n" +
                        "Platform styles and themes\n\n" +
                        "The Android platform provides a collection of styles and themes that you can use in your app. To find a list of all of them, " +
                        "you need to look in two places:\n\n" +
                        "The R.style class lists most of the available platform styles and themes.\n\n" +
                        "The support.v7.appcompat.R.style class lists more of them. These styles and themes have \"AppCompat\" in their " +
                        "names, and they are supported by the v7 appcompat library.\n\n"
        ));
        list4.add(new AndroidTerm("Material Design",
                "Material Design is a visual design philosophy that Google created in 2014. The aim of Material Design is a unified user " +
                        "experience across platforms and device sizes. Material Design includes a set of guidelines for style, layout, motion, and " +
                        "other aspects of app design.\n\n" +
                        "Principles of Material Design\n\n" +
                        "The \"material\" metaphor\n\n" +
                        "In Material Design, elements in your Android app behave like real world materials: they cast shadows, occupy space, and " +
                        "interact with each other.\n\n" +
                        "Bold, graphic, intentional\n\n" +
                        "Material Design involves deliberate color choices, edge-to-edge imagery, large-scale typography, and intentional white " +
                        "space that create a bold and graphic interface.\n\n" +
                        "Meaningful motion\n\n" +
                        "Make animations and other motions in your app meaningful, so they don't happen at random. Use motions to reinforce the " +
                        "idea that the user is the app's primary mover.\n\n" +
                        "Colors\n\n" +
                        "Material Design color palette\n\n" +
                        "Material Design principles include the use of bold color. The Material Design color palette contains colors to choose from, " +
                        "each with a primary color and shades labeled from 50 to 900:\n\n" +
                        "Choose a color labeled \"500\" as the primary color for your brand. Use that color and shades of that color in your app.\n\n" +
                        "Choose a contrasting color as your accent color and use it to create highlights in your app. Select any color that starts " +
                        "with \"A.\"\n\n" +
                        "Contrast\n\n" +
                        "Make sure all the text in your app's UI contrasts with its background. Where you have a dark background, make the text on " +
                        "top of it a light color, and vice versa. This kind of contrast is important for readability and accessibility, because not all " +
                        "people see colors the same way.\n\n" +
                        "If you use a platform theme such as Theme.AppCompat,contrast between text and its background is handled for you.\n\n" +
                        "Opacity\n\n" +
                        "Your app can display text with different degrees of opacity to convey the relative importance of information. For example, " +
                        "text that's less important might be nearly transparent (low opacity).\n\n" +
                        "Typography\n\n" +
                        "Typeface\n\n" +
                        "Roboto is the standard Material Design typeface on Android. Roboto has six weights: Thin, Light, Regular, Medium, Bold, and Black.\n\n" +
                        "Font styles\n\n" +
                        "The Android platform provides predefined font styles and sizes that you can use in your app. These styles and sizes were " +
                        "developed to balance content density and reading comfort under typical conditions. Type sizes are specified with sp " +
                        "(scaleable pixels) to enable large type modes for accessibility.\n\n"
        ));
        list4.add(new AndroidTerm("Layout",
                "Metrics and keylines\n\n" +
                        "Components in the Material Design templates that are meant for mobile, tablet, and desktop devices align to an 8dp square " +
                        "grid. A dp is a density-independent pixel, an abstract unit based on screen density. A dp is similar to an sp, but sp is also " +
                        "scaled by the user's font size preference. That's why sp is preferred for accessibility.\n\n" +
                        "The 8dp square grid guides the placement of elements in your layout. Every square in the grid is 8dp x 8dp, so the height " +
                        "and width of every element in the layout is a multiple of 8dp.\n\n" +
                        "Keylines are outlines in a layout grid that determine the placement of text and icons.For example, keylines mark the edges of the margins in a layout.\n\n" +
                        "Components and patterns\n\n" +
                        "Buttons and many other Views used in Android conform by default to Material Design principles. The Material Design guide " +
                        "includes components and patterns that you can build on to help your users intuit how the elements in your UI work, even if " +
                        "users are new to your app.\n\n" +
                        "Use Material Design components to guide the specs and behavior of buttons, chips, cards, and many other UI elements.\n\n" +
                        "Use Material Design patterns to guide how you format dates and times, gestures, the navigation drawer, and many other " +
                        "aspects of your UI.\n\n" +
                        "Design Support Library\n\n" +
                        "The Design package provides APIs to support adding Material Design components and patterns to your apps. The Design " +
                        "Support Library adds support for various Material Design components and patterns for you to build on.\n\n"
        ));
        list4.add(new AndroidTerm("Material Design components",
                "Floating action buttons (FABs)\n\n" +
                        "Use a floating action button (FAB) for actions you want to encourage users to take. A FAB is a circled icon that floats " +
                        "\"above\" the UI. On focus it changes color slightly, and it appears to lift up when selected. When tapped, it can contain related actions.\n\n" +
                        "Navigation drawers\n\n" +
                        "A navigation drawer is a panel that slides in from the left and contains navigation destinations for your app. A navigation " +
                        "drawer spans the height of the screen, and everything behind it is visible, but darkened.\n\n" +
                        "Snackbars\n\n" +
                        "A snackbar provides brief feedback about an operation through a message in a horizontal bar on the screen. It contains a " +
                        "single line of text directly related to the operation performed. A snackbar can contain a text action, but no icons.\n\n" +
                        "Snackbars automatically disappear after a timeout or after a user interaction elsewhere on the screen.\n\n" +
                        "Tabs\n\n" +
                        "Use tabs to organize content at a high level. For example, the user might use tabs to switch between Views, data sets, or " +
                        "functional aspects of an app. Present tabs as a single row above their associated content. Make tab labels short and " +
                        "informative.\n\n" +
                        "You can you use tabs with swipe views in which users navigate between tabs with a horizontal finger gesture (horizontal " +
                        "paging). If your tabs use swipe views, don't pair the tabs with content that also supports swiping.\n\n" +
                        "Cards\n\n" +
                        "A card is a sheet of material that serves as an entry point to more detailed information. Each card covers only one subject.\n\n" +
                        "A card may contain a photo, text, and a link. It can display content containing elements of varying size, such as photos with " +
                        "captions of variable length.\n\n" +
                        "A card collection is a layout of cards on the same plane.\n\n" +
                        "Lists\n\n" +
                        "A list is a single continuous column of rows of equal width. Each row functions as a container for a tile. Tiles hold content, " +
                        "and can vary in height within a list.\n\n"
        ));
        list4.add(new AndroidTerm("Material Design components",
                "Motion\n\n" +
                        "Motion in the world of Material Design is used to describe spatial relationships, functionality, and intention with beauty and " +
                        "fluidity. Motion shows how an app is organized and what it can do.\n\n" +
                        "Motion in Material Design must be:\n\n" +
                        "1. Responsive. It quickly responds to user input precisely where the user triggers it.\n\n" +
                        "2. Natural. Movement is inspired by forces in the natural world. For example, real-world forces like gravity inspire an " +
                        "element's movement along an arc rather than in a straight line.\n\n" +
                        "3. Aware. Material is aware of its surroundings, including the user and other material around it. Objects can be attracted " +
                        "to other objects in the UI, and they respond appropriately to user intent. As elements transition into view, their " +
                        "movement is choreographed in a way that defines their relationships.\n\n" +
                        "4. Intentional. Movement guides the user's focus to the right place at the right time. Movement can communicate " +
                        "different signals, such as whether an action is unavailable.\n\n" +
                        "To put these principles into practice in Android, use animations and transitions.\n\n" +
                        "Animations\n\n" +
                        "There are three ways you can create animation in your app:\n\n" +
                        "Property animation changes an object's properties over a specified period of time.The property animation system was " +
                        "introduced in Android 3.0 (API level 11). Property animation is more flexible than view animation, and it offers more " +
                        "features.\n\n" +
                        "View animation calculates animation using start points, end points, rotation, and other aspects of animation. The " +
                        "Android view animation system is older than the property animation system and can only be used for Views. It's " +
                        "relatively easy to set up and offers enough capabilities for many use cases.\n\n" +
                        "Drawable animation lets you load a series of drawable resources one after another to create an animation. Drawable " +
                        "animation is useful if you want to animate things that are easier to represent with drawable resources, such as a " +
                        "progression of bitmap images.\n\n" +
                        "The Material Design theme provides some default animations for touch feedback and activity transitions. The animation " +
                        "APIs let you create custom animations for touch feedback in UI controls, changes in view state, and activity transitions.\n\n" +
                        "Touch feedback\n\n" +
                        "Touch feedback provides instant visual confirmation at the point of contact when a user interacts with a UI element. The " +
                        "default touch feedback animations for buttons use the RippleDrawable class, which transitions between different states with " +
                        "a ripple effect.\n\n" +
                        "Circular reveal\n\n" +
                        "A reveal animation shows or hides a group of UI elements by animating a view's clipping boundaries. In circular reveal, you " +
                        "reveal or hide a view by animating a clipping circle. (A clipping circle is a circle that crops or hides the part of an image " +
                        "that's outside the circle.).\n\n" +
                        "Activity transitions\n\n" +
                        "Activity transitions are animations that provide visual connections between different states in your UI. You can specify " +
                        "custom animations for enter and exit transitions, and for transitions of shared elements between activities.\n\n" +
                        "An enter transition determines how views in an activity enter the scene. For example in an explode enter transition, " +
                        "views enter the scene from the outside and fly towards the center of the screen.\n\n" +
                        "An exit transition determines how views in an activity exit the scene. For example in an explode exit transition, views " +
                        "exit the scene by moving away from the center.\n\n" +
                        "A shared elements transition determines how views that are shared between two activities transition between these " +
                        "activities. For example, if two activities have the same image in different positions and sizes, the changeImageTransform " +
                        "shared element transition translates and scales the image smoothly between these activities.\n\n" +
                        "Curved motion\n\n" +
                        "In Android 5.0 (API level 21) and above, you can define custom timing curves and curved motion patterns for animations.\n\n" +
                        "To do this, use the PathInterpolator class, which interpolates an object's path based on a Bézier curve or a Path object.\n\n" +
                        "The interpolator specifies a motion curve in a 1x1 square, with anchor points at (0,0) and (1,1) and control points that you " +
                        "specify using the constructor arguments.\n\n"
        ));
        list4.add(new AndroidTerm("Providing Resources for Adaptive Layouts",
                "An adaptive layout is a layout that works well for different screen sizes and orientations, different devices, different locales " +
                        "and languages, and different versions of Android.\n\n" +
                        "Externalizing resources\n\n" +
                        "When you externalize resources, you keep them separate from your application code. For example, instead of hard-coding " +
                        "a string into your code, you name the string and add it to the res/values/strings.xml file.\n\n" +
                        "Always externalize resources such as drawables, icons, layouts, and strings. Here's why it's important:\n\n" +
                        "You can maintain externalized resources separately from your other code. If a resource is used in several places in " +
                        "your code and you need to change the resource, you only need to change it in one place.\n\n" +
                        "You can provide alternative resources that support specific device configurations, for example devices with different " +
                        "languages or screen sizes. This becomes increasingly important as more Android-powered devices become available.\n\n" +
                        "Grouping resources\n\n" +
                        "Store all your resources in the res/ folder. Organize resources by type into folders under /res. You must use standardized " +
                        "names for these folders.\n\n" +
                        "Alternative resources\n\n" +
                        "Most apps provide alternative resources to support specific device configurations. For example, your app should include " +
                        "alternative drawable resources for different screen densities, and alternative string resources for different languages. At " +
                        "runtime, Android detects the current device configuration and loads the appropriate resources.\n\n" +
                        "If no resources are available for the device's specific configuration, Android uses the default resources that you include in " +
                        "your app—the default drawables, which are in the res/drawable/ folder, the default text strings, which are in the " +
                        "res/values/strings.xml file, and so on.\n\n" +
                        "Common alternative-resource qualifiers\n\n" +
                        "Screen orientation\n\n" +
                        "The screen-orientation qualifier has two possible values:\n\n" +
                        "port : The device is in portrait mode (vertical).\n\n" +
                        "land : The device is in landscape mode (horizontal).\n\n" +
                        "If the user rotates the screen while your app is running, and if alternative resources are available, Android automatically " +
                        "reloads your app with alternative resources that match the new device configuration.\n\n" +
                        "Smallest width\n\n" +
                        "The smallest-width qualifier specifies the minimum width of the device. It is the shortest of the screen's available height and " +
                        "width, the \"smallest possible width\" for the screen. The smallest width is a fixed screen-size characteristic of the device, " +
                        "and it does not change when the screen's orientation changes.\n\n" +
                        "Platform version\n\n" +
                        "The platform-version qualifier specifies the minimum API level supported by the device. For example, use v11 for API\n\n" +
                        "level 11 (devices with Android 3.0 or higher). See the Android API levels document for more information about these values.\n\n" +
                        "Use the platform-version qualifier when you use resources for functionality that's unavailable in prior versions of Android.\n\n" +
                        "Localization\n\n" +
                        "The localization qualifier specifies a language and, optionally, a region. This qualifier is a two-letter ISO 639-1 language " +
                        "code, optionally followed by a two letter ISO 3166-1-alpha-2 region code (preceded by lowercase r).\n\n" +
                        "Providing default resources\n\n" +
                        "Default resources specify the default design and content for your application. For example, when the app runs in a locale " +
                        "for which you have not provided locale-specific text, Android loads the default strings from res/values/strings.xml. If this " +
                        "default file is absent, or if it is missing even one string that your application needs, then your app doesn't run and shows an " +
                        "error.\n\n" +
                        "Default resources have standard resource folder names (values,for example) without any qualifiers in the folder name or in parentheses after the file names.\n\n"
        ));
    }

    private void setTerms5() {
        list5.add(new AndroidTerm("Testing the User Interface",
                "Properly testing a user interface\n\n" +
                        "User interface (UI) testing focuses on testing aspects of the user interface and interactions with users.\n\n" +
                        "As a developer, you should get into the habit of testing user " +
                        "interactions to ensure that users don't encounter unexpected results or have a poor experience when interacting with your app.\n\n" +
                        "The UI contains views with graphical elements such as buttons, menus, and text fields, each with a set of properties. To properly test the UI, you need to:\n\n" +
                        "Exercise all UI events with views:\n\n" +
                        "Tap a UI view, and enter data or make a choice.\n\n" +
                        "Examine the values of the properties of each view—referred to as the state of the UI—at different times during " +
                        "execution.\n\n" +
                        "Provide inputs to all UI views. Use this opportunity to test improper inputs, such as text when numbers are expected.\n\n" +
                        "Check the outputs and UI representations of data—such as strings and integers—to see if they are consistent with " +
                        "what you are expecting.\n\n"
        ));
        list5.add(new AndroidTerm("Testing",
                "Manual Testing\n\n" +
                        "As development continues, one approach to UI testing is to simply have a human tester perform a set of user operations on " +
                        "the target app and verify that it is behaving correctly.\n\n" +
                        "This manual approach can be time-consuming, tedious, and error-prone.By manually testing a UI for a complex " +
                        "app, you can't possibly cover all permutations of user interactions.\n\n" +
                        "You would also have to manually perform these repetitive tests on many different device configurations in an emulator, and on many different devices.\n\n" +
                        "The problems inherent with manual testing fall into two categories:\n\n" +
                        "Domain size: A UI has a great deal of operations that need testing. Even a relatively small app can have hundreds of " +
                        "possible UI operations. Over a development cycle a UI may change significantly, even though the underlying app " +
                        "doesn't change. Manual tests with instructions to follow a certain path through the UI may fail over time, because a " +
                        "button, menu item, or dialog may have changed location or appearance.\n\n" +
                        "Sequences: Some functionality of the app may only be accomplished with a sequence of UI events. For example, to " +
                        "add an image to a message about to be sent, a user may have to tap a camera button and use the camera to take a " +
                        "picture, or a photo button to select an existing picture, and then associate that picture with the message—usually by " +
                        "tapping a share or send button. Increasing the number of possible operations also increases the sequencing problem.\n\n" +
                        "Automated testing\n\n"+
                        "Performing all of the UI interactions automatically makes it easier to run tests for different device states (such as orientations) and different " +
                        "configurations.\n\n"+
                        "For testing Android apps, you typically create these types of automated UI tests:\n\n" +
                        "UI tests that work within a single app: Verifies that the app behaves as expected when a user performs a specific " +
                        "action or enters a specific input. It allows you to check that the app returns the correct UI output in response to user " +
                        "interactions in the app's activities. UI testing frameworks like Espresso allow you to programmatically simulate user " +
                        "actions and test complex intra-app user interactions.\n\n" +
                        "UI tests that span multiple apps: Verifies the correct behavior of interactions between different user apps or between " +
                        "user apps and system apps. For example, you can test an app that launches the Maps app to show directions, or that " +
                        "launches the Android contact picker to select recipients for a message. UI testing frameworks that support cross-app " +
                        "interactions, such as UI Automator, allow you to create tests for such user-driven scenarios.\n\n"
        ));
        list5.add(new AndroidTerm("Testing Apps"
                ,"Using Espresso for tests that span a single app\n\n"+
                "The Espresso testing framework in the Android Testing Support Library provides APIs for writing UI tests to simulate user " +
                "interactions within a single app. Espresso tests run on actual device or emulator and behave as if an actual user is using " +
                "the app.\n\n"+

                "You can use Espresso to create UI tests to automatically verify the following:\n\n" +
                "The app returns the correct UI output in response to a sequence of user actions on a device.\n\n" +
                "The app's navigation and input controls bring up the correct activities, views, and fields.\n\n" +
                "The app responds correctly with mocked-up dependencies, such as data from an outside server, or can work with " +
                "stubbed out backend methods to simulate real interactions with backend components which can be programmed to " +
                "reply with a set of defined responses.\n\n"+
                "A key benefit of using Espresso is that it has access to instrumentation information, such as the context for the app, so that " +
                "you can monitor all of the interaction the Android system has with the app. Another key benefit is that it automatically " +
                "synchronizes test actions with the app's UI. Espresso detects when the main thread is idle, so it is able to run your test at " +
                "the appropriate time, improving the reliability of your tests. This capability also relieves you from having to add any timing " +
                "workarounds, such as a sleep period, in your test code.\n\n"+
                "The Espresso testing framework works with the AndroidJUnitRunner test runner and requires instrumentation.\n\n"+

                "Using UI Automator for tests that span multiple apps\n\n"+
                "The UI Automator testing framework in the Android Testing Support Library can help you verify the correct behavior of " +
                "interactions between different user apps or between user apps and system apps. It can also show you what is happening " +
                "on the device before and after an app is launched.\n\n"+
                "The UI Automator APIs let you interact with visible elements on a device. Your test can look up a UI component by using " +
                "descriptors such as the text displayed in that component or its content description. A viewer tool provides a visual interface " +
                "to inspect the layout hierarchy and view the properties of UI components that are visible on the foreground of the device.\n\n"+

                "The following are important functions of UI Automator:\n\n" +
                "Like Espresso, UI Automator has access to system interaction information so that you can monitor all of the interaction " +
                "the Android system has with the app.\n\n"+
                "Your test can send an Intent or launch an Activity (without using shell commands) by getting a Context object through getContext().\n\n" +
                "You can simulate user interactions on a collection of items, such as songs in a music album or a list of emails in an inbox.\n\n" +
                "You can simulate vertical or horizontal scrolling across a display.\n\n" +
                "You can use standard JUnit Assert methods to test that UI components in the app return the expected results.\n\n" +
                "The UI Automator testing framework works with the AndroidJUnitRunner test runner and requires instrumentation.\n\n"
        ));
        list5.add(new AndroidTerm("instrumentation",
                "Android instrumentation is a set of control methods, or hooks, in the Android system, which control Android components " +
                        "and how the Android system loads apps.\n\n"+
                        "Normally the system runs all the components of an app in the same process. You can allow some components, such as " +
                        "content providers, to run in a separate process, but you typically can't force an app onto the same process as another " +
                        "running app.\n\n"+
                        "Instrumentation tests, however, can load both a test package and the app into the same process. Since the app " +
                        "components and their tests are in the same process, your tests can invoke methods in the components, and modify and " +
                        "examine fields in the components.\n\n"+
                        "Instrumentation allows you to monitor all of the interaction the Android system has with the application, and makes it " +
                        "possible for tests to invoke methods in the app, and modify and examine fields in the app, independently of the app's " +
                        "normal lifecycle.\n\n"+
                        "The Android framework API does not provide a way for your app's code to invoke these callback methods directly, but you " +
                        "can do so using an Espresso or UI Automator test with instrumentation.\n\n"
        ));
    }

    private void setTerms6() {
        list6.add(new AndroidTerm("AsyncTask and AsyncTaskLoader",
                "There are two ways to do background processing in Android: \n\n"+
                        "Using the AsyncTask class or using the Loader framework,which include an AsyncTaskLoader class that use AsyncTask.\n\n"+
                        "In most situations you'll choose the Loader framework, but it's important to know how AsyncTask works so you can make a good choice.\n\n"+
                        "The UI thread\n\n"+
                        "When an Android app starts, it creates the main thread, which is often called the UI thread. The UI thread dispatches " +
                        "events to the appropriate user interface (UI) widgets, and it's where your app interacts with components from the Android " +
                        "UI toolkit.\n\n"+
                        "Android's thread model has two rules:\n\n"+
                        "1. Do not block the UI thread.\n\n"+
                        "If everything happened on the UI thread, long operations such as network access or database queries could block the whole UI.\n\n"+
                        "From the user's perspective, the application would appear to hang.\n\n"+
                        "To make sure your app doesn't block the UI thread:\n\n" +
                        "Complete all work in less than 16 ms for each UI screen.\n\n"+
                        "Don't run asynchronous tasks and other long-running tasks on the UI thread. Instead, implement tasks on a background thread using AsyncTask " +
                        "(for short or interruptible tasks) or  AsyncTaskLoader(for tasks that are high-priority, or tasks that need to report back to the user or UI).\n\n"+
                        "2. Do UI work only on the UI thread.\n\n" +
                        "Don't use a background thread to manipulate your UI, because the Android UI toolkit is not thread-safe.\n\n"
        ));
        list6.add(new AndroidTerm("AsyncTask",
                "Use the AsyncTask class to implement an asynchronous,long-running task on a worker thread.(A worker thread is any thread which is not the main or UI thread.)\n\n" +
                        "AsyncTask allows you to perform background operations and publish results on the UI thread without manipulating threads or handlers.\n\n"+
                        "When AsyncTask is executed, it goes through four steps:\n\n" +
                        "1. onPreExecute() is invoked on the UI thread before the task is executed. This step is normally used to set up the task," +
                        "for instance by showing a progress bar in the UI.\n\n" +
                        "2.doInBackground(Params...) is invoked on the background thread immediately after onPreExecute() finishes.This step performs a " +
                        "background computation, returns a result, and passes the result to onPostExecute().The doInBackground() method can also call publishProgress(Progress...) to " +
                        "publish one or more units of progress.\n\n" +
                        "3.onProgressUpdate(Progress...) runs on the UI thread after publishProgress(Progress...) is invoked.\n\n" +
                        "Use onProgressUpdate() to report any form of progress to the UI thread while the background computation is executing.\n\n" +
                        "For instance, you can use it to pass the data to animate a progress bar or show logs in a text field.\n\n"+
                        "4.onPostExecute(Result) runs on the UI thread after the background computation has finished.\n\n"+
                        "Limitations of AsyncTask\n\n"+
                        "Changes to device configuration cause problems.\n\n"+
                        "When device configuration changes while an AsyncTask is running, for example if the user changes the screen "+
                        "orientation, the activity that created the AsyncTask is destroyed and re-created. The AsyncTask is unable to access the newly created activity, and the results of the "+
                        "AsyncTask aren't published.\n\n"+
                        "Old AsyncTask objects stay around, and your app may run out of memory or crash.\n\n"+
                        "If the activity that created the AsyncTask is destroyed, the AsyncTask is not destroyed along with it. For example, if "+
                        "your user exits the application after the AsyncTask has started, the AsyncTask keeps using resources unless you call cancel().\n\n"+
                        "When to use AsyncTask:\n\n"+
                        "Short or interruptible tasks.\n\n" +
                        "Tasks that don't need to report back to UI or user.\n\n" +
                        "Low-priority tasks that can be left unfinished.\n\n"
        ));
        list6.add(new AndroidTerm("Loaders",
                "Background tasks are commonly used to load data such as forecast reports or movie reviews. Loading data can be " +
                        "memory intensive, and you want the data to be available even if the device configuration changes. For these situations, use " +
                        "loaders, which are a set of classes that facilitate loading data into an activity.\n\n"+
                        "Loaders use the LoaderManager class to manage one or more loaders.\n\n"+
                        "LoaderManager includes a set of callbacks for when the loader is created, when it's done loading data, and when it's reset.\n\n"+
                        "AsyncTaskLoader\n\n"+
                        "AsyncTaskLoader is the loader equivalent of AsyncTask. AsyncTaskLoader provides a method,loadInBackground(),that runs on a separate thread.\n\n"+
                        "The results of loadInBackground() are automatically delivered to the UI thread, by way of the onLoadFinished() LoaderManager callback."
        ));
        list6.add(new AndroidTerm("Connect to the Internet",
                "Most Android applications have some data that the user interacts with; it might be news articles, weather information," +
                        "contacts, game data, user information, and more. Often, this data is provided over the network by a web API.\n\n"+
                        "Network security and  network calls:\n\n" +
                        "1. Include permissions in your AndroidManifest.xml file.\n\n" +
                        "2. On a worker thread, make an HTTP client connection that connects to the network and downloads (or uploads) data.\n\n" +
                        "3. Parse the results, which are usually in JSON format.\n\n" +
                        "4. Check the state of the network and respond accordingly.\n\n"+
                        "Network security\n\n"+
                        "Network transactions are inherently risky, because they involve transmitting data that could be private to the user. People " +
                        "are increasingly aware of these risks, especially when their devices perform network transactions, so it's very important that " +
                        "your app implement best practices for keeping user data secure at all times.\n\n" +
                        "Security best practices for network operations:\n\n"+
                        "Use appropriate protocols for sensitive data. For example for secure web traffic, use the HttpsURLConnection subclass of HttpURLConnection\n\n"+
                        "Use HTTPS instead of HTTP anywhere that HTTPS is supported on the server, because mobile devices frequently " +
                        "connect on insecure networks such as public Wi-Fi hotspots. Consider using SSLSocketClass to implement authenticated, encrypted socket-level communication.\n\n" +
                        "Don't use localhost network ports to handle sensitive interprocess communication (IPC), because other applications on " +
                        "the device can access these local ports. Instead, use a mechanism that lets you use authentication, for example a Service\n\n"+
                        "Don't trust data downloaded from HTTP or other insecure protocols. Validate input that's entered into a WebView and " +
                        "responses to intents that you issue against HTTP.\n\n"
        ));
        list6.add(new AndroidTerm("Broadcast Receivers",
                "Explicit intents are used to start specific, fully qualified activities, as well as to pass information between activities in your " +
                        "app. Implicit intents are used to start activities based on registered components that the system is aware of, for example " +
                        "general functionality.\n\n"+
                        "Broadcast intents\n\n"+
                        "The intents you've seen up to now always resulted in an activity being launched, either a specific activity from your " +
                        "application or an activity from a different application that could fulfill the requested action. But sometimes an intent doesn't " +
                        "have a specific recipient, and sometimes you don't want an activity to be launched in response to an intent. For example, " +
                        "when your app receives a system intent indicating that the network state of a device has changed, you probably don't want " +
                        "to launch an activity, but you may want to disable some functionality of your app.\n\n"+
                        "For this reason there's a third type of intent that can be delivered to any interested application: the broadcast intent.\n\n" +
                        "Although broadcast intents are defined the same way as implicit intents, each type of intent has important distinguishing " +
                        "characteristics:\n\n" +
                        "Broadcast intents are delivered using sendBroadcast() or a related method, while other types of intents use "+
                        "startActivity() to start activities. When you broadcast an intent, you never find or start an activity. Likewise, there's " +
                        "no way for a broadcast receiver to see or capture intents used with startActivity().\n\n"+
                        "A broadcast intent is a background operation that the user is not normally aware of. Starting an activity with an intent," +
                        "on the other hand, is a foreground operation that modifies what the user is currently interacting with.\n\n"+
                        "There are two types of broadcast intents, those delivered by the system (system broadcast intents), and those that your " +
                        "app delivers (custom broadcast intents).\n\n"+
                        "System broadcast intents\n\n"+
                        "The system delivers a system broadcast intent when a system event occurs that might interest your app.For example:\n\n"+
                        "When the device boots, the system sends an ACTION_BOOT_COMPLETED system broadcast intent. This intent contains the "+
                        "constant value \"android.intent.action.BOOT_COMPLETED\".\n\n"+
                        "Custom broadcast intents\n\n"+
                        "Custom broadcast intents are broadcast intents that your application sends out. Use a custom broadcast intent when you " +
                        "want your app to take an action without launching an activity, for example when you want to let other apps know that data " +
                        "has been downloaded to the device and is available for them to use.\n\n"+
                        "To create a custom broadcast intent, create a custom intent action. To deliver a custom broadcast to other apps, pass the " +
                        "intent to sendBroadcast(), sendOrderedBroadcast(), or sendStickyBroadcast().\n\n" +
                        "Broadcast receivers\n\n"+
                        "Broadcast intents aren't targeted at specific recipients. Instead, interested apps register a component to \"listen\" for these " +
                        "kind of intents. This listening component is called a broadcast receiver.\n\n" +
                        "Use broadcast receivers to respond to messages that are broadcast from other apps or from the system. To create a " +
                        "broadcast receiver:\n\n" +
                        "1. Define a subclass of the BroadcastReceiver class and implement the onReceive() method.\n\n"+
                        "2. Register the broadcast receiver either dynamically in Java, or statically in your app's manifest file.\n\n"+
                        "As part of this step, use an intent filter to specify which kinds of broadcast intents you're interested in receiving.\n\n"+
                        "Security guidelines\n\n"+
                        "When you use broadcast intents and broadcast receivers, information is sent between applications, which creates security " +
                        "risks. To avoid these risks, you can use LocalBroadcastManager. \n\n"+
                        "Either the sender or receiver of a broadcast can enforce access permissions:\n\n" +
                        "To enforce a permission when sending a broadcast, supply a non-null permission argument to sendBroadcast() "+
                        "Only receivers who have been granted this permission (by requesting it with the <user-permission> tag in their "+
                        "AndroidManifest.xml) can receive the broadcast.\n\n"+
                        "To enforce a permission when receiving a broadcast, supply a non-null permission when registering your receiver " +
                        "either when calling registerReceiver() or in the static <receiver> tag in your AndroidManifest.xml.\n\n"+
                        "Only broadcasters who have been granted this permission (by requesting it with the <uses-permission> tag in their " +
                        "AndroidManifest.xml) will be able to send an intent to the receiver. The receiver has to request permission in the " +
                        "manifest, regardless of whether the sender is registered statically or dynamically.\n\n"+
                        "LocalBroadcastManager\n\n"+
                        "To avoid having to manage the security aspects described in the Security guidelines, use the LocalBroadcastManager class.\n\n"+
                        "LocalBroadcastManager lets you send and receive broadcasts within a single process and a single application, which means " +
                        "you don't have to worry about cross-application security."
        ));
        list6.add(new AndroidTerm("Services",
                "A service is an application component that performs long-running operations, usually in the background. A service doesn't " +
                        "provide a user interface (UI). (An activity, on the other hand, provides a UI.)\n\n"+
                        "A service can be started, bound, or both:\n\n" +
                        "A started service is a service that an application component starts by calling startService().\n\n"+
                        "Use started services for tasks that run in the background to perform long-running operations. Also use started services " +
                        "for tasks that perform work for remote processes.\n\n"+
                        "A bound service is a service that an application component binds to itself by calling bindService().\n\n"+
                        "Use bound services for tasks that another app component interacts with to perform interprocess communication (IPC).\n\n" +
                        "For example, a bound service might handle network transactions, perform file I/O, play music, or interact with a content " +
                        "provider.\n\n"+
                        "Note: A service runs in the main thread of its hosting process—the service doesn't create its own thread and doesn't run in " +
                        "a separate process unless you specify that it should.\n\n"+
                        "If your service is going to do any CPU-intensive work or blocking operations (such as MP3 playback or networking), create " +
                        "a new thread within the service to do that work. By using a separate thread, you reduce the risk of Application Not " +
                        "Responding (ANR) errors, and the application's main thread can remain dedicated to user interaction with your activities.\n\n" +
                        "To implement any kind of service in your app.\n\n"+
                        "1. Declare the service in the manifest.\n\n" +
                        "2. Create implementation code, as described in Started services and Bound services, below.\n\n" +
                        "3. Manage the service lifecycle.\n\n"+
                        "IntentService\n\n"+
                        "Most started services don't need to handle multiple requests simultaneously, and if they did it could be a dangerous multi-" +
                        "threading scenario.\n\n"+
                        "For this reason, it's probably best if you implement your service using the IntentService class.\n\n"+
                        "IntentService is a useful subclass of Service: \n\n"+
                        "It automatically provides a worker thread to handle your intent\n\n"+
                        "It handles some of the boilerplate code that regular services need (such as starting and stopping the service).\n\n"+
                        "It can create a work queue that passes one intent at a time to your onHandleIntent() implementation, so "+
                        "you don't have to worry about multi-threading.\n\n"+
                        "Bound services\n\n"+
                        "A service is \"bound\" when an application component binds to it by calling bindService().\n\n"+
                        "A bound service offers a client-" +
                        "server interface that allows components to interact with the service, send requests, and get results, sometimes using " +
                        "interprocess communication (IPC) to send and receive information across processes. A bound service runs only as long as " +
                        "another application component is bound to it. Multiple components can bind to the service at once, but when all of them " +
                        "unbind, the service is destroyed.\n\n" +
                        "A bound service generally does not allow components to start it by calling startService().\n\n"
        ));
        list6.add(new AndroidTerm("Service lifecycle",
                "The lifecycle of a service is simpler than that of an activity. However, it's even more important that you pay close attention to " +
                        "how your service is created and destroyed. Because a service has no UI, services can continue to run in the background " +
                        "with no way for the user to know, even if the user switches to another application. This consumes resources and drains " +
                        "battery.\n\n"+
                        "Like an activity, a service has lifecycle callback methods that you can implement to monitor changes in the service's state " +
                        "and perform work at the appropriate times.\n\n"+
                        "A bound service exists only to serve the application component that's bound to it, so when no more components are bound " +
                        "to the service, the system destroys it. Bound services don't need to be explicitly stopped the way started services do (using "+
                        "stopService() or stopSelf() ).\n\n"+
                        "Foreground services\n\n"+
                        "While most services run in the background, some run in the foreground. A foreground service is a service that the user is " +
                        "aware of, so it's not a candidate for the system to kill when low on memory.\n\n" +
                        "For example, a music player that plays music from a service should be set to run in the foreground, because the user is " +
                        "aware of its operation. The notification in the status bar might indicate the current song and allow the user to launch an " +
                        "activity to interact with the music player.\n\n"
        ));
    }

    private void setTerms7() {
        list7.add(new AndroidTerm("Notifications",
                "A notification is a message your app displays to the user outside your application's normal UI. When you tell the system to " +
                        "issue a notification, the notification first appears to the user as an icon in the notification area, on the left side of the status "+
                        "bar.\n\n"+
                        "You create a notification using the NotificationCompat.Builder class.\n\n"+
                        "You also need to set an Intent that determines what happens when the user clicks the notification. Usually this Intent " +
                        "results in your app launching an Activity.\n\n"+
                        "To make sure the system delivers the Intent even when your app isn't running when the user clicks the notification, wrap  "+
                        "the Intent in a PendingIntent object, which allows the system to deliver the Intent regardless of the app state.\n\n"
        ));
        list7.add(new AndroidTerm("Options with notifications",
                "You can use various options with notifications, including:\n\n" +
                        "Notification actions\n\n" +
                        "Priorities\n\n" +
                        "Expanded layouts\n\n" +
                        "Ongoing notifications\n\n" +
                        "Notification actions\n\n"+
                        "A notification action is an action that the user can take on the notification. The action is made available via an action button " +
                        "on the notification. Like the Intent that determines what happens when the user clicks the notification, a notification action uses a "+
                        "PendingIntent to complete the action. The Android system usually displays a notification action as a button adjacent to the notification content.\n\n"+
                        "Notification priority\n\n"+
                        "Android allows you to assign a priority level to each notification to influence how the Android system will deliver it.\n\n" +
                        "Notifications have a priority between MIN(-2) and MAX(2) that corresponds to their importance.\n\n"+
                        "Peeking\n\n"+
                        "Notifications with a priority of MAX and MIN can peek, which means they slide briefly into view on the user's current "+
                        "screen, no matter what apps the user is using.Note that on devices running Android 6.0 and higher, users can block " +
                        "peeking by changing the device's \"App notification\" settings. This means you can't rely on notifications peeking, even if you " +
                        "set them up that way.\n\n"+
                        "Expanded view layouts\n\n"+
                        "Notifications in the notification drawer appear in two main layouts, normal view (which is the default) and expanded view.\n\n" +
                        "Expanded view notifications were introduced in Android 4.1. Use them sparingly, because they take up more space and " +
                        "attention than normal view layouts.\n\n"+
                        "Ongoing notifications\n\n"+
                        "Ongoing notifications are notifications that can't be dismissed by the user. Your app must explicitly cancel them by calling "+
                        "cancel() or cancelAll().\n\n"+
                        "Creating multiple ongoing notifications is a nuisance to your users since they are unable to " +
                        "cancel the notification. Use ongoing notifications sparingly.\n\n"+
                        "To make a notification ongoing, set setOngoing() to true.\n\n"+
                        "Use ongoing notifications to indicate background tasks that the " +
                        "user actively engages with (such as playing music) or tasks that occupy the device (such as file downloads, sync " +
                        "operations, and active network connections).\n\n"+
                        "Delivering notifications\n\n"+
                        "Use the NotificationManager class to deliver notifications:\n\n"+
                        "1. Call getSystemService(), passing in the NOTIFICATION_MANAGER constant, to create an instance of NotificationManager.\n\n"+
                        "2. Call notify() to deliver the notification. In the notify() method,, pass in these two values:\n\n"+
                        "A notification ID, which is used to update or cancel the notification.\n\n"+
                        "The NotificationCompat object that you created using the NotificationCompat.Builder object.\n\n"+
                        "Reusing notifications\n\n"+
                        "When you need to issue a notification multiple times for the same type of event, you can update a previous notification by " +
                        "changing some of its values, adding to it, or both.\n\n" +
                        "To reuse an existing notification:\n\n"+
                        "1. Update a NotificationCompat.Builder object and build a Notification object from it, as when you first created and "+
                        "built the notification.\n\n"+
                        "2. Deliver the notification with the same ID you used previously.\n\n" +
                        "Important: If the previous notification is still visible, the system updates it from the contents of the Notification " +
                        "object. If the previous notification has been dismissed, a new notification is created.\n\n"
        ));
        list7.add(new AndroidTerm("Notification",
                "Clearing notifications \n\n"+
                        "Notifications remain visible until one of the following happens:\n\n" +
                        "If the notification can be cleared, it disappears when the user dismisses it individually or by using \"Clear All.\"\n\n"+
                        "If you called setAutoCancel() when you created the notification, the notification disappears when the user clicks it.\n\n"+
                        "If you called cancel() for a specific notification ID, the notification disappears.\n\n"+
                        "If you call cancelAll() ,all the notifications you've issued disappear.\n\n"+
                        "Because ongoing notifications can't be dismissed by the user, your app must cancel them by calling cancelAll() or cancel()\n\n"+
                        "Notification compatibility\n\n"+
                        "To ensure the best compatibility, create notifications with NotificationCompat and its subclasses, particularly NotificationCompat.Builder.\n\n"+
                        "Keep in mind that not all notification features are available for every Android version, even though the methods to set them " +
                        "are in the support library class NotificationCompat.Builder.\n\n"+
                        "Notification design guidelines\n\n"+
                        "Notifications always interrupt the user. As such they must be short, timely, and most of all, relevant.\n\n" +
                        "Relevant: Ask yourself whether this information is essential for the user. What happens if they don't get the " +
                        "notification? For example, scheduled calendar events are likely relevant.\n\n" +
                        "Timely: Notifications need to appear when they are useful. For example, notifying the user when it's time to leave for " +
                        "an appointment is useful.\n\n" +
                        "Short: Use as few words as possible. Now, challenge yourself to say it with fewer.\n\n" +
                        "Give users the power to choose:\n\n" +
                        "Provide settings in your app that allow users to choose the kinds of notifications they want to receive, and how they " +
                        "want to receive them.\n\n"
        ));
        list7.add(new AndroidTerm("Scheduling Alarms",
                "Alarms can either be single use or repeating.\n\n"+
                        "To create alarms, you use the AlarmManager class. Alarms in Android have the following characteristics:\n\n" +
                        "Alarms let you send intents at set times or intervals. You can use alarms with broadcast receivers to start services and " +
                        "perform other operations.\n\n" +
                        "Alarms operate outside your app, so you can use them to trigger events or actions even when your app isn't running, " +
                        "and even if the device is asleep.\n\n" +
                        "When used correctly, alarms can help you minimize your app's resource requirements. For example, you can schedule " +
                        "operations without relying on timers or continuously running background services.\n\n"+
                        "When not to use an alarm:\n\n" +
                        "For timing events such as ticks and timeouts, and for timed operations that are guaranteed to happen during the lifetime of your app, use the " +
                        "Handler class with Timer and Thread.This approach gives Android better control over system resources than if you used alarms.\n\n" +
                        "For server sync operations, use SyncAdapter with the Google Cloud Messaging Service.\n\n" +
                        "For tasks that can wait until conditions are favorable, such as when the device is connected to WiFi and is charging " +
                        "(for example, updating weather information or news stories), you might not want to use alarms. For these tasks on API " +
                        "21+ devices, consider using JobScheduler, which you will learn about in an upcoming lesson.\n\n"
        ));
        list7.add(new AndroidTerm("Alarm types",
                "There are two general types of alarms in Android: elapsed real-time alarms and real-time clock (RTC) alarms, and both use "+
                        "PendingIntent objects.\n\n"+
                        "Elapsed real-time alarms\n\n"+
                        "Elapsed real-time alarms use the time, in milliseconds, since the device was booted. Elapsed real-time alarms aren't " +
                        "affected by time zones, so they work well for alarms based on the passage of time. For example, use an elapsed real-time " +
                        "alarm for an alarm that fires every half hour.\n\n"+
                        "The AlarmManager class provides two types of elapsed real-time alarm:\n\n"+
                        "ELAPSED_REALTIME\n\n"+
                        "ELAPSED_REALTIME_WAKEUP\n\n"+
                        "Real-time clock (RTC) alarms\n\n"+
                        "Real-time clock (RTC) alarms are clock-based alarms that use Coordinated Universal Time (UTC). Only choose an RTC " +
                        "alarm in these types of situations:\n\n" +
                        "You need your alarm to fire at a particular time of day.\n\n" +
                        "The alarm time is dependent on current locale.\n\n"+
                        "Apps with clock-based alarms might not work well across locales, because they might fire at the wrong times. And if the " +
                        "user changes the device's time setting, it could cause unexpected behavior in your app.\n\n"+
                        "The AlarmManager class provides two types of RTC alarm: \n\n"+
                        "RTC\n\n"+
                        "RTC_WAKEUP\n\n"+
                        "Alarm best practices\n\n"+
                        "Alarms affect how your app uses (or abuses) system resources.\n\n"+
                        "To avoid this problem and others, follow these best practices:\n\n"+
                        "Add randomness (jitter) to network requests that trigger as a result of a repeating alarm.\n\n"+
                        "Keep your alarm frequency to a minimum.\n\n" +
                        "Don't wake up the device unnecessarily.\n\n"+
                        "Use the least precise timing possible to allow the AlarmManager to be the most efficient it can be.\n\n"+
                        "Avoid basing your alarm on clock time and use ELAPSED_REALTIME for repeating alarms whenever possible.\n\n"+
                        "Doze and App Standby\n\n"+
                        "API 23+ devices sometimes enter Doze or App Standby mode to save power:\n\n" +
                        "Doze mode is triggered when a user leaves a device unplugged and stationary for a period of time, with the screen off.\n\n" +
                        "During short \"maintenance windows,\" the system exits Doze to let apps complete deferred activities, including firing " +
                        "standard alarms, then returns to Doze. Doze mode ends when the user returns to their device.\n\n" +
                        "App Standby mode is triggered on idle apps that haven't been used recently. App Standby mode ends when the user " +
                        "returns to your app or plugs in the device.\n\n"
        ));
        list7.add(new AndroidTerm("Transferring Data Efficiently",
                "Transferring data is an essential part of most Android applications, but it can negatively affect battery life and increase data " +
                        "usage costs. Using the wireless radio to transfer data is potentially one of your app's most significant sources of battery " +
                        "drain.\n\n"+
                        "Wireless radio state\n\n"+
                        "A fully active wireless radio consumes significant power. To conserve power when not in use, the radio transitions between " +
                        "different energy states. However, there is a trade-off between conserving power and the time it takes to power up when " +
                        "needed.\n\n"+
                        "For a typical 3G network the radio has these three energy states:\n\n" +
                        "1. Full power: Used when a connection is active. Allows the device to transfer data at its highest possible rate.\n\n" +
                        "2. Low power: An intermediate state that uses about 50% less battery.\n\n" +
                        "3. Standby: The minimal energy state, during which no network connection is active or required.\n\n"+
                        "Android uses a state machine to determine how to transition between states.\n\n"+
                        "The radio state machine on each device, particularly the associated transition delay (\"tail time\") and startup latency, vary " +
                        "based on the wireless radio technology employed (2G, 3G, LTE, etc.) and is defined and configured by the carrier network " +
                        "over which the device is operating.\n\n"
        ));
        list7.add(new AndroidTerm("Bundling network transfers",
                "Every time you create a new network connection, the radio transitions to the full power state.\n\n"+
                        "For a typical 3G device, every data transfer session causes the radio to draw power for almost 20 seconds.\n\n"+
                        "It's important to bundle and queue up your data transfers. You can bundle transfers that are due to occur within a time " +
                        "window and make them all happen simultaneously, ensuring that the radio draws power for as little time as possible.\n\n"+
                        "Prefetching\n\n"+
                        "To prefetch data means that your app takes a guess at what content or data the user will want next, and fetches it ahead of " +
                        "time. For example, when the user looks at the first part of an article, a good guess is to prefetch the next part. Or, if a user " +
                        "is watching a video, fetching the next minutes of the video is also a good guess.\n\n"+
                        "Prefetching data is an effective way to reduce the number of independent data transfer sessions. Prefetching allows you to " +
                        "download all the data you are likely to need for a given time period in a single burst, over a single connection, at full " +
                        "capacity. This reduces the number of radio activations required to download the data. As a result, you not only conserve " +
                        "battery life, but also improve latency for the user, lower the required bandwidth, and reduce download times.\n\n"+
                        "It's good practice to prefetch data such that you only need to initiate another download every 2 to 5 minutes, and on the order of 1 to 5 megabytes.\n\n"+
                        "Following this principle, large downloads—such as video files—should be downloaded in chunks at regular intervals (every " +
                        "2 to 5 minutes), effectively prefetching only the video data likely to be viewed in the next few minutes.\n\n"+
                        "Monitor connectivity state\n\n" +
                        "Devices can network using different types of hardware:\n\n" +
                        "Wireless radios use varying amounts of battery depending on technology, and higher bandwidth consumes more " +
                        "energy. Higher bandwidth means you can prefetch more aggressively, downloading more data during the same amount " +
                        "of time. However, perhaps less intuitively, because the tail-time battery cost is relatively higher, it is also more efficient " +
                        "to keep the radio active for longer periods during each transfer session to reduce the frequency of updates.\n\n" +
                        "WiFi radio uses significantly less battery than wireless and offers greater bandwidth.\n\n"+
                        "Perform data transfers when connected over Wi-Fi whenever possible.\n\n"+
                        "You can use the ConnectivityManager to determine the active wireless radio and modify your prefetching routines " +
                        "depending on network type.\n\n"+
                        "Monitor battery state\n\n"+
                        "To minimize battery drain, monitor the state of your battery and wait for specific conditions before initiating a battery-" +
                        "intensive operation.\n\n"+
                        "The BatteryManager broadcasts all battery and charging details in a broadcast Intent that includes the charging status.\n\n"
        ));
        list7.add(new AndroidTerm("JobScheduler",
                "Constantly monitoring the connectivity and battery status of the device can be a challenge, and it requires using " +
                        "components such as broadcast receivers, which can consume system resources even when your app isn't running.\n\n" +
                        "Because transferring data efficiently is such a common task, the Android SDK provides a class that makes this much " +
                        "easier: JobScheduler.\n\n"+
                        "Introduced in API level 21,JobScheduler allows you to schedule a task around specific conditions (rather than a specific "+
                        "time as with AlarmManager.)\n\n"+
                        "JobScheduler has three components:\n\n"+
                        "1. JobInfo uses the builder pattern to set the conditions for the task.\n\n"+
                        "2. JobService is a wrapper around the Service class where the task is actually completed.\n\n"+
                        "3. JobScheduler schedules and cancels tasks.\n\n"
        ));
    }

    private void setTerms8() {
        list8.add(new AndroidTerm("Storing Data",
                "Android provides several options for you to save persistent application data. The solution you choose depends on your " +
                        "specific needs, such as whether the data should be private to your application or accessible to other applications (and the " +
                        "user) and how much space your data requires.\n\n"+
                        "Your data storage options are the following:\n\n" +
                        "Shared preferences— Store private primitive data in key-value pairs.\n\n" +
                        "Internal storage— Store private data on the device memory.\n\n" +
                        "External storage— Store public data on the shared external storage.\n\n" +
                        "SQLite databases— Store structured data in a private database.\n\n" +
                        "Network connection—Store data on the web with your own network server.\n\n" +
                        "Cloud Backup— Backing up app and user data in the cloud.\n\n" +
                        "Content providers— Store data privately and make them available publicly.\n\n" +
                        "Firebase realtime database—Store and sync data with a NoSQL cloud database. Data is synced across all clients in " +
                        "real time, and remains available when your app goes offline.\n\n"
        ));
        list8.add(new AndroidTerm("Storing Data",
                "Shared preferences\n\n"+
                        "Using shared preferences is a way to read and write key-value pairs of information persistently to and from a file.\n\n"+
                        "Files\n\n"+
                        "Android uses a file system that's similar to disk-based file systems on other platforms such as Linux. File-based operations " +
                        "should be familiar to anyone who has used use Linux file I/O or the java.io package.\n\n" +
                        "All Android devices have two file storage areas: \"internal\" and \"external\" storage. These names come from the early days of " +
                        "Android, when most devices offered built-in non-volatile memory (internal storage), plus a removable storage medium such " +
                        "as a micro SD card (external storage).\n\n"+
                        "Internal storage\n\n"+
                        "You don't need any permissions to save files on the internal storage. Your application always has permission to read and " +
                        "write files in its internal storage directory.\n\n"+
                        "You can create files in two different directories:\n\n" +
                        "Permanent storage: getFilesDir()\n\n"+
                        "Temporary storage: getCacheDir().\n\n"+
                        "External storage\n\n"+
                        "Use external storage for files that should be permanently stored, even if your app is uninstalled, and be available freely to " +
                        "other users and apps, such as pictures, drawings, or documents made by your app.\n\n"+
                        "Some private files that are of no value to other apps can also be stored on external storage. Such files might be additional " +
                        "downloaded app resources, or temporary media files. Make sure you delete those when your app is uninstalled.\n\n"+
                        "SQLite database\n\n"+
                        "Saving data to a database is ideal for repeating or structured data, such as contact information. Android provides an SQL-" +
                        "like database for this purpose.\n\n"+
                        "Network connection\n\n"+
                        "You can use the network (when it's available) to store and retrieve data on your own web-based services. To do network " +
                        "operations, use classes in the following packages:\n\n" +
                        "java.net.*\n\n" +
                        "android.net.*\n\n"+
                        "Backing up app data\n\n"+
                        "Auto backup for Android 6.0 (API level 23) and higher\n\n"+
                        "The automatic backup feature preserves the data your app creates on a " +
                        "user device by uploading it to the user's Google Drive account and encrypting it.\n\n"+
                        "Automatic backups occur when the following conditions are met:\n\n" +
                        "The device is idle.\n\n" +
                        "The device is charging.\n\n" +
                        "The device is connected to a Wi-Fi network.\n\n" +
                        "At least 24 hours have elapsed since the last backup.\n\n"+
                        "Backup for Android 5.1 (API level 22) and lower\n\n"+
                        "For users with previous versions of Android, you need to use the Backup API to implement data backup. In summary, this " +
                        "requires you to:\n\n" +
                        "1. Register for the Android Backup Service to get a Backup Service Key.\n\n" +
                        "2. Configure your Manifest to use the Backup Service.\n\n" +
                        "3. Create a backup agent by extending the BackupAgentHelper class.\n\n" +
                        "4. Request backups when data has changed.\n\n"+
                        "Firebase\n\n"+
                        "Firebase is a mobile platform that helps you develop apps, grow your user base, and earn more money. Firebase is made " +
                        "up of complementary features that you can mix-and-match to fit your needs.\n\n"+
                        "For data management, Firebase offers a Realtime Database.\n\n" +
                        "Store and sync data with a NoSQL cloud database.\n\n" +
                        "Connected apps share data\n\n" +
                        "Hosted in the cloud\n\n" +
                        "Data is stored as JSON\n\n" +
                        "Data is synchronized in real time to every connected client\n\n" +
                        "Data remains available when your app goes offline"
        ));
        list8.add(new AndroidTerm("Shared Preferences",
                "Shared preferences allow you to read and write small amounts of primitive data as key/value pairs to a file on the device " +
                        "storage. The SharedPreference class provides APIs for getting a handle to a preference file and for reading, writing, and " +
                        "managing this data. The shared preferences file itself is managed by the framework and accessible to (shared with) all the " +
                        "components of your app. That data is not shared with or accessible to any other apps.\n\n"+
                        "Note: The SharedPreference APIs are also different from the Preference APIs. The Preference APIs can be used to build " +
                        "user interface for a settings page, and they do use shared preferences for their underlying implementation.\n\n"+
                        "App Settings\n\n"+
                        "Determining appropriate setting controls\n\n"+
                        "The initial default value for a setting should:\n\n" +
                        "Represent the value most users would choose, such as All contacts for \"Contacts to display\" in the Contacts app.\n\n" +
                        "Use less battery power. For example, in the Android Settings app, Bluetooth is set to off until the user turns it on.\n\n" +
                        "Pose the least risk to security and data loss. For example, the default setting for the Gmail app's default action is to " +
                        "archive rather than delete messages.\n\n" +
                        "Interrupt only when important. For example, the default setting for when calls and notifications arrive is to interrupt only " +
                        "when important.\n\n"+
                        "Providing navigation to Settings\n\n"+
                        "Follow these design guidelines for navigating to settings:\n\n" +
                        "If your app offers side navigation such as a navigation drawer, include Settings below all other items (except Help and " +
                        "Send Feedback).\n\n" +
                        "If your app doesn't offer side navigation, place Settings in the app bar menu's options menu below all other items " +
                        "(except Help and Send Feedback).\n\n" +
                        "Note: Use the word Settings in the app's navigation to access the settings. Do not use synonyms such as \"Options\" or " +
                        "\"Preferences.\"\n\n."+
                        "*Tip: Android Studio provides a shortcut for setting up an options menu with Settings.\n\n"+
                        "The Settings UI\n\n"+
                        "Settings should be well-organized, predictable, and contain a manageable number of options. A user should be able to " +
                        "quickly understand all available settings and their current values. Follow these design guidelines:\n\n" +
                        "7 or fewer settings: Arrange them according to priority with the most important ones at the top.\n\n" +
                        "7-15 settings: Group related settings under section dividers.\n\n"+
                        "16 or more settings: Group related settings into separate sub-screens.\n\n"
        ));
    }

    private void setTerms9() {
        list9.add(new AndroidTerm("SQLite Primer",
                "It is a refresher and quick reference to SQL database." +
                "SQL databases\n\n" +
                "Data is stored in tables of rows and columns.\n\n" +
                "A field is any row or column.\n\n" +
                "Fields contain data, references to other fields, or references to other tables.\n\n" +
                "Each rows is identified by unique IDs which are integers.\n\n" +
                "Each Columns is identified by names that are unique per table.\n\n" +
                "SQLite\n\n" +
                "A software package that make SQL database possible to implement.It is\n\n" +
                "● self-contained (requires no other components)\n\n" +
                "● serverless (requires no server backend)\n\n" +
                "● Zero-configurational (i.e does not need to be configured for your application)\n\n" +
                "● transactional (i.e changes within a single transaction in SQLite either occur " +
                "completely or not at all)\n\n" +
                "*SQLite is the most widely deployed database engine in the world\n\n"));
        list9.add(new AndroidTerm("Transactions and ACID",
                "A sequence of operations like insertion, deletion etc performed as a single logical " +
                        "unit of work.That work must exhibit four properties, called the atomicity, " +
                        "consistency, isolation, and durability (ACID) properties, to qualify as a transaction.\n\n " +
                        "Examples of transactions:\n\n" +
                        "● Transferring money from a savings account to a checking account.\n\n" +
                        "● Entering a term and definition into dictionary.\n\n" +
                        "● Committing a changelist to the master branch.\n\n" +
                        "ACID\n\n" +
                        "Atomicity\u200B - Either all of its data modifications are performed, or none of them are " +
                        "performed.\n\n" +
                        "Consistency-\u200B When completed, a transaction must leave all data in a consistent " +
                        "state.\n\n" +
                        "Isolation-\u200B Modifications made by concurrent transactions must be isolated from the " +
                        "modifications made by any other concurrent transactions. A transaction either " +
                        "recognizes data in the state it was in before another concurrent transaction " +
                        "modified it, or it recognizes the data after the second transaction has completed, " +
                        "but it does not recognize an intermediate state.\n\n" +
                        "Durability-\u200B After a transaction has completed, its effects are permanently in place " +
                        "in the system. The modifications persist even in the event of a system failure.\n\n"));
        list9.add(new AndroidTerm("Query language",
                "To interact with the SQL database you have to use a special query language\n\n" +
                        "-SQL(Structured Query Language).\n\n" +
                        "● A SQL query is highly structured and contains the following basic parts\n\n " +
                        "SELECT word, description FROM WORD_LIST_TABLE WHERE\n\n" +
                        "word=\"alpha\".\n\n" +
                        "A general one-\n\n" +
                        "SELECT columns FROM table WHERE column=\"value\"\n\n" +
                        "Parts:\n\n" +
                        "● SELECT columns\u200B —select the columns to return. Use * to return all columns.\n\n" +
                        "● FROM table\u200B — \u200B specify the table from which to get results.\n\n" +
                        "● WHERE\u200B — \u200B keyword for conditions that have to be met\u200B .\n\n" +
                        "column=\"value\"—the condition that has to be met.\n\n" +
                        "common operators: =, LIKE, <, >\n\n" +
                        "● AND, OR\u200B — \u200B connect multiple conditions with logic operators\u200B .\n\n" +
                        "● ORDER BY\u200B — \u200B omit for default order, or specify ASC for ascending, DESC for " +
                        "descending.\n\n" +
                        "● LIMIT\u200B is a very useful keyword if you want to only get a limited number of " +
                        "results.\n\n" +
                        "Queries for Android SQLite\n\n" +
                        "You can send queries to the SQLite database of the Android system as raw " +
                        "queries or as parameters.\n\n" +
                        "● rawQuery(String sql, String[] selectionArgs) runs the provided SQL and " +
                        "returns a Cursor of the result set.\n\n" +
                        "● query(String table, String[] columns, String selection, String[] selectionArgs, " +
                        "String groupBy, String having, String orderBy, String limit) queries the given " +
                        "table, returning a Cursor over the result set.\n\n" +
                        "Cursors\n\n" +
                        "A interface of object that provides random read-write access to the result set " +
                        "returned by a database query. It points to the first element in the result of the " +
                        "query.It acts as a pointer to the row of structured data. You can think of it as a " +
                        "pointer to table rows.When a method returns a Cursor object, you iterate over the " +
                        "result, extract the data, do something with the data, and finally " +
                        "close the cursor to release the memory.\n\n"));
        list9.add(new AndroidTerm("SQLite Database", "SQLite Database\n\n" +
                "It discusses the Android frameworks SQLite Database and " +
                "SQLiteOpenHelper classes.It is not an introduction to SQLite or SQL " +
                "databases.\n\n" +
                "When to use SQLite Database:\n\n" +
                "● An SQLite database is a good storage solution when you have " +
                "structured data that you need to store persistently and access, " +
                "search, and change frequently.\n\n" +
                "● You can use the database as the primary storage for user or app " +
                "data, or you can use it to cache and make available data fetched from " +
                "the cloud.\n\n" +
                "● If you can represent your data as rows and columns, consider a " +
                "SQLite database.\n\n" +
                "● Content providers work excellently with SQLite databases.\n\n" +
                "With SQLite Database all interactions with the database are through an " +
                "instance of the SQLiteOpenHelper class which executes your requests and " +
                "manages your database for you." +
                "Cursor\n\n" +
                "You can think of the data as an array of rows. A cursor point into one row of " +
                "that structured data. The Cursor class provides methods for moving the " +
                "cursor through the data structure, and methods to get the data from the " +
                "fields in each row.\n\n" +
                "The Cursor class has a number of subclasses that implement cursors for " +
                "specific types of data\n\n" +
                "SQLiteCursor \u200B exposes results from a query on a SQLiteDatabase.\n\n" +
                "MatrixCursor\u200B is an all-rounder, a mutable cursor implementation backed by " +
                "an array of objects that automatically expands internal capacity as needed.\n\n" +
                "ContentValues\n\n" +
                "Instance of ContentValues stores data as key-value pairs, where the key is " +
                "the name of the column and the value is the value for the cell. One instance " +
                "of ContentValues represents one row of a table.\n\n"));
        list9.add(new AndroidTerm("Implementing an SQLite database",
                "To implement a database for your Android app, you need to do the " +
                        "following.\n\n" +
                        "● Create a data model\u200B .\n\n" +
                        "It is a good practice to create a class that represents your data with " +
                        "getters and setters.\n\n" +
                        "For an SQLite database, an instance of this class could represent " +
                        "one record, and for a simple database, one row in a table.\n\n" +
                        "● Subclass SQLiteOpenHelper\n\n" +
                        "i. Use constants for table names and database creation query-This " +
                        "makes your code a lot more readable, makes it easier to change " +
                        "names, and your queries will end up looking a lot more like SQL.\n\n" +
                        "ii. Implement onCreate to create the SQLite Database with tables for " +
                        "your data.\n\n" +
                        "iii. Implement onUpgrade().\n\n" +
                        "iv. Implement optional methods.\n\n" +
                        "● Implement the query(), insert(), delete(), update(), count() methods in " +
                        "SQLiteOpenHelper.\n\n" +
                        "● In your MainActivity, create an instance of SQLiteOpenHelper.\n\n" +
                        "● Call methods of SQLiteOpenHelper to work with your database.\n\n"));
        list9.add(new AndroidTerm("Database operations",
                "query()\n\n" +
                        "The query method that you implement in your open helper class can take " +
                        "and return any data type that your user interface needs.Your query method " +
                        "should only allow queries that are needed by your app and not be general " +
                        "purpose.\n\n" +
                        "The database provides two methods for sending queries:\n\n" +
                        "SQLiteDatabase.rawQuery()\n\n" +
                        "The open helper query method can construct an SQL query and send it as " +
                        "a rawQuery to the database which returns a cursor. If your data is supplied " +
                        "by your app, and under your full control, you can use rawQuery().\n\n" +
                        "rawQuery(String sql, String[] selectionArgs)\n\n" +
                        "The first parameter to db.rawquery() is an SQLite query string.\n\n" +
                        "The second parameter contains the arguments.\n\n" +
                        "SQLiteDatabase.query()\n\n" +
                        "if you are processing user-supplied data, even after validation, it is more " +
                        "secure to construct a query and use a version of the " +
                        "SQLiteDatabase.query() method for the database.\n\n" +
                        "insert()\n\n" +
                        "The open helper's insert() method calls SQLiteDatabase.insert(), which is a " +
                        "SQLiteDatabase convenience method to insert " +
                        "a row into the database " +
                        "Format\n\n" +
                        "long insert(String table, String nullColumnHack, ContentValues values)\n\n" +
                        "The first argument is the \u200B table name\u200B .\n\n" +
                        "The second argument is a \u200B String nullColumnHack.\n\n" +
                        "It's a workaround that allows you to insert empty rows. Use null.\n\n" +
                        "The third argument must be a \u200B ContentValues container with values to fill " +
                        "the row.\n\n" +
                        "The database method returns the id of the newly inserted item, and you " +
                        "should pass that on to the application.\n\n" +
                        "delete()\n\n" +
                        "The open helper delete method calls the databases delete() method, which " +
                        "is a convenience method so that you do not have to write the full SQL " +
                        "query.\n\n" +
                        "Format\n\n" +
                        "int delete (String table, String whereClause, String[] whereArgs)\n\n" +
                        "The first argument is the table name.\n\n" +
                        "The second argument is a WHERE clause.\n\n" +
                        "The third argument are the arguments to the WHERE clause.\n\n" +
                        "You can delete using any criteria, and the method returns the number of " +
                        "items that were actually deleted, which the open helper should return also.\u200B \n\n" +
                        "update()\n\n" +
                        "The open helper update method calls the database's update() method, " +
                        "which is a convenience method so that you do not have to write the full " +
                        "SQL query. The arguments are familiar from previous methods, and the " +
                        "onUpdate returns the number of rows updated.\n\n" +
                        "Format\n\n" +
                        "int update(String table, ContentValues values, String whereClause, String[] " +
                        "whereArgs).\n\n" +
                        "count()\n\n" +
                        "The count() method returns the number of entries in the database. If you " +
                        "are using a RecyclerView.Adapter, it has to implement getItemCount(), " +
                        "which needs to get the number of rows from the open helper which needs " +
                        "to get it from the database.\n\n" +
                        "*To get a handle to the database, In MainActivity, in onCreate, call:\n\n" +
                        "mDB = new WordListOpenHelper(this);\n\n"));
        list9.add(new AndroidTerm("Working with the database",
                "It is a common pattern to combine a SQLiteDatabase backend with a " +
                        "RecyclerView to display the data.\n\n" +
                        "Transactions\n\n" +
                        "Use transactions\n\n" +
                        "1.When performing multiple operations that all need to complete to keep " +
                        "database consistent, for example, updating pricing of related items for a " +
                        "sale event.\n\n" +
                        "2.To batch multiple independent operations to improve performance, such " +
                        "as mass inserts.\n\n" +
                        "Final words-\n\n" +
                        "For a larger database, populating the database should be done in the " +
                        "background, and your app should not crash if there is no database yet, or " +
                        "the database is empty.\n\n"));


    }

    private void setTerms10() {
        list10.add(new AndroidTerm("Content Provider",
                "It is a component that interacts with a repository.\n\n" +
                "A content provider:\n\n" +
                "● Separates data from the app interface code\n\n" +
                "● Provides a standard way of accessing the data\n\n" +
                "● Makes it possible for apps to share data with other apps\n\n" +
                "● Is agnostic to the repository, which could by a database, a file system, or\n\n" +
                "the cloud."));
        list10.add(new AndroidTerm("Content Resolver",
                "To get data and interact with a content provider, an app uses a " +
                        "ContentResolver to send requests to the content provider.\n\n" +
                        "The ContentResolver object provides query(), insert(), update(), and delete() " +
                        "methods for accessing data from a content provider.\n\n" +
                        "Each request consists of a URI and a SQL-like query, and the response is a " +
                        "Cursor object.\n\n" +
                        "The following diagram shows the query flow from an activity using a content " +
                        "resolver to the content provider to data in a SQL database, and back.\n\n"));
        list10.add(new AndroidTerm("Benefits of Content Providers",
                "Content providers are useful for apps that want to make data available to " +
                        "other apps.\n\n" +
                        "● It allow multiple apps to securely access, use, and modify a single data " +
                        "source that your app provides.\n\n" +
                        "● For access control, you can specify levels of permissions for your content " +
                        "provider, specifying how other apps can access the data.\n\n" +
                        "● You can store data independently from the app, because the content " +
                        "provider sits between your user interface and your stored data.\n\n" +
                        "● Development teams can work independently on the user interface and " +
                        "data repository of your app.\n\n" +
                        "● There are other classes that expect to interact with a content provider.\n\n"));
        list10.add(new AndroidTerm("App Architecture with a Content Provider",
                "Architecturally, the content provider is a layer between the content-providing " +
                        "app's data storage backend and the rest of the app, separating the data and " +
                        "the interface.\n\n" +
                        "Data and Open Helper\n\n" +
                        "● The data could be in a database, a file, on the internet, generated " +
                        "dynamically, or even a mix of these.Data used with content providers is " +
                        "commonly stored in SQLite databases.\n\n" +
                        "Contract\n\n" +
                        "● The contract is a public class that exposes important information about " +
                        "the content provider to other apps.\n\n" +
                        "● This usually includes the URI schemes, important constants, and the " +
                        "structure of the data that will be returned.\n\n" +
                        "Content Provider\n\n" +
                        "● Provides query(), insert(), update(), and delete() methods for accessing " +
                        "the data.In addition, it provides a public and secure interface to the data, " +
                        "so that other apps can access the data with the appropriate permissions.\n\n" +
                        "● The app that owns the data specifies what permissions other apps need "  +
                        "to have to work with the content provider.\n\n" +
                        "Content Resolver\n\n" +
                        "● Content providers are always accessed through a content resolver. Think " +
                        "of the content resolver as a helper class that manages all the details of " +
                        "connecting to a content provider for you.\n\n" +
                        "● Mirroring the content provider's API,the ContentResolver object provides " +
                        "you with query(), insert(), update(), and delete() methods for accessing " +
                        "data of a content provider.\n\n"
        ));
        list10.add(new AndroidTerm("Implementing a Content Provider",
                "To implement a content provider you need:\n\n" +
                        "● Data, for example, in a database.\n\n" +
                        "● A way for accessing the data storage, for example, through an open " +
                        "helper for a database.\n\n" +
                        "● A declaration of your content provider in the Android Manifest to make it " +
                        "available to your own and other apps.\n\n" +
                        "● The subclass of ContentProvider that implements the query(), insert()," +
                        "delete(), update(), count(), and getType() methods.\n\n" +
                        "● Public contract class that exposes the URI scheme, table names, MIME " +
                        "type, and important constants to other classes and apps. While this is not " +
                        "mandatory, without it, other apps cannot know how to access your " +
                        "content provider.\n\n" +
                        "● A content resolver to access the content provider using the appropriate " +
                        "methods and queries.\n\n"));
        list10.add(new AndroidTerm("Implementing a Content Provider",
                "Data\n\n" +
                        "The data is often stored in a SQLite database, but this is not mandatory\u200B .\n\n" +
                        "● Data could be stored in a file or file system, on the internet, or created " +
                        "dynamically. Or even a mix of these options. Content resolver fetched " +
                        "data always as a Cursor object, as if it all came from the same source " +
                        "and in the same format.\n\n" +
                        "● The content provider might access the data directly in the case of files, or " +
                        "it might do so through a helper class. For example, apps typically use an " +
                        "open helper to interact with a SQLite database, and the content provider " +
                        "interacts with the open helper to get the data.\n\n" +
                        "Contract\n\n" +
                        "● The contract is a public class that exposes important information about " +
                        "an app's content provider so that other apps know how to access and " +
                        "use the content provider.\n\n" +
                        "● Using a contract separates the public from private information in app, " +
                        "design from implementation, and gives other apps one place to get all the " +
                        "information they need to work with a content provider.\n\n " +
                        "● The contract for a content provider typically includes Content URI and URI scheme\n\n" +
                        "The URI scheme shows how to build URIs to access the content " +
                        "provider's data. It's the API for the data.\n\n" +
                        "Table constants.\n\n" +
                        "Makes table and column names available as constants, because they are " +
                        "needed to extract data from the returned cursor object.\n\n" +
                        "MIME types" +
                        "It have information on the data format, so that the app can appropriately " +
                        "process returned data. For example, that data could be encoded in JSON " +
                        "or HTML, or use a custom format. Other shared constants that make it " +
                        "more convenient for an app to use the content provider.\n\n" +
                        "And,other shared constants that make it more convenient for an app to " +
                        "use the content provider.\n\n" +
                        "*Contracts are not limited to content providers. You can use a contract anytime " +
                        "you want to share constants across classes of your app or make information " +
                        "about your app available to other apps.\n\n" +
                        "URI Scheme & Content URI\n\n" +
                        "Apps send requests to the content provider using Uniform Resource Identifiers " +
                        "or URIs.\n\n" +
                        "A content URI for content providers has this general form: \n\n" +
                        "scheme://authority/path/ID\n\n" +
                        "● scheme\u200B is always content:// for content URIs.\n\n" +
                        "● authority\u200B represents the domain, and for content providers customarily " +
                        "ends in .provider \n\n" +
                        "● path\u200B is the path to the data.\n\n" +
                        "● ID \u200B uniquely identifies the data set to search.\n\n " +
                        "For ex, the following URI could be used to request all the entries in the \"words\" table,\n\n" +
                        "content://com.android.example.wordcontentprovider.provider/words\n\n" +
                        "The URI scheme for a content provider is defined in the Contract so that it is " +
                        "available to any app that wants to query this content provider.\n\n" +
                        "Customarily, this is done defining constants for\n\n" +
                        "AUTHORITY,CONTENT_PATH, and CONTENT_URI. \n\n" +
                        "AUTHORITY\u200B . Represents the domain. For content providers this includes the " +
                        "unique package name and ends in .provider\n\n " +
                        "CONTENT_PATH.\u200B The content path is an abstract semantic identifier of the " +
                        "data you are interested in. It does not predict or presume in what form the data " +
                        "is stored or organized in the background. As such, the path could resolve in " +
                        "the name of a table, the name of a file, or the name of the list. \n\n" +
                        "CONTENT_URI.\u200B This is a content:// style URI to one set of data. If you have " +
                        "multiple \"data containers\" in the backend,you would create a content URI for " +
                        "each. For example, you would create a content URI for each table that can be " +
                        "queried. Use the Uri helper class for building and manipulating URIs.\n\n" +
                        "Tables in the Contract\n\n " +
                        "A common way of organizing a contract class is to put definitions that are " +
                        "global to your database into the root level of the class. Usually, this is the name " +
                        "of the database\u200B .\n\n" +
                        "Create a static abstract inner class for each table with the column names. This " +
                        "inner class commonly implements the BaseColumns interface. By " +
                        "implementing the BaseColumns interface, \u200B your class can inherit a primary key " +
                        "field called _ID that some Android classes, such as cursor adapters, expect to " +
                        "exist.\u200B This is not required,but can help your database work harmoniously with " +
                        "the Android framework.\n\n" +
                        "MIME Type\n\n" +
                        "The MIME type tells an app, what type and format received data is in, so that it " +
                        "can process the data appropriately.Common MIME types include text/html for " +
                        "web pages, and application/json.If your content provider returns data in " +
                        "either of those standard formats, you should use the standard MIME types.\n\n" +
                        "For content URIs that point to a row or rows of table data, and that are thus " +
                        "unique to your app, the MIME type should be in Android's vendor-specific " +
                        "MIME format. The general format is:\n\n" +
                        "type.subtype/provider-specific-part\n\n" +
                        "*The MIME type does not tell the clients how to process that data. As such, the " +
                        "custom MIME type only provides a hint, and the contract should provide " +
                        "additional information to the client as to what the expected data formats are " +
                        "Methods: insert, delete, update, query \n\n"
        ));
        list10.add(new AndroidTerm("Methods: insert, delete, update, query",
                "The content resolver makes available query, insert, delete, and update " +
                        "methods, and the content provider implements those same methods to access " +
                        "the data.\n\n" +
                        "The following diagram shows the APIs between the conceptual building blocks " +
                        "of an app that uses a content provider to access data. Note in particular:\n\n" +
                        "● The methods are named the same and return the same data type " +
                        "throughout the stack (except for insert()).\n\n" +
                        "● Because it is common for a content provider to connect to a database, " +
                        "the query method returns a cursor. If your backend is not a database, the " +
                        "content provider must do the work of converting the returned data into " +
                        "the cursor format. \n\n" +
                        "● When you create a content provider by extending the ContentProvider " +
                        "class, you need to implement the insert, delete,update, and query " +
                        "methods.\n\n" +
                        "*The content provider receives the values to insert in the correct type, as " +
                        "contentValues, calls the database, and builds and returns the required Uri for " +
                        "the content resolver.\n\n" +
                        "URI Matching\n\n" +
                        "It is a good practice to use an instance of the UriMatcher class to match the " +
                        "URIs. UriMatcher is a helper class for matching URIs for content providers.\n\n " +
                        "Using a Content Resolver\n\n" +
                        "The ContentResolver object provides methods to query(), insert(), delete(), and " +
                        "update() data.Thus, the content resolver mirrors the content providers API and " +
                        "manages all interaction with the content provider for you.\n\n" +
                        "● Cursors\n\n" +
                        "1. The content provider always presents the query results as a Cursor in a " +
                        "table format that resembles of a SQL database.This is independent of " +
                        "how the data is actually stored.\n\n" +
                        "2. A cursor is a pointer into a row of structured data. You can think of it as a " +
                        "linked list of rows. The Cursor class provides methods for moving the " +
                        "cursor through that structure, and methods to get the data from the " +
                        "columns of each row.\n\n" +
                        "3. When a method returns a cursor, you iterate over the result, extract the " +
                        "data, do something with the data, and finally close the cursor to release " +
                        "the memory.\n\n"));
        list10.add(new AndroidTerm("query() ",
                "To make a query to the content provider:\n\n" +
                        "1. Create an SQL-style query.\n\n" +
                        "2. Use a content resolver to interact with the content provider to execute the " +
                        "query and return a Cursor.\n\n" +
                        "3. Process the results in the Cursor.\n\n" +
                        "The query method has the following signature:\n\n" +
                        "public Cursor query(Uri uri, String[] projection, String selection,String[] " +
                        "selectionArgs, String sortOrder){}\n\n" +
                        "Uri\n\n" +
                        "The complete content URI queried. This cannot be null. You get the " +
                        "information for the correct URI from the contract.\n\n" +
                        "Projection\n\n" +
                        "A string array with the names of the columns to return for each row. Setting this " +
                        "to null returns all columns.\n\n" +
                        "Selection\n\n" +
                        "Indicates which rows/records of the objects you want to access. This is a " +
                        "WHERE clause excluding the actual where.\n\n" +
                        "SelectionArgs\n\n" +
                        "Argument values for the selection criteria. If you include ?s in selection, they " +
                        "are replaced by values from selectionArgs, in the order that they appear.\n\n" +
                        "*It is a best security practice to always separate selection and selectionArgs.\n\n " +
                        "sortOrder\n\n" +
                        "The order in which to sort the results.Usually ASC or DESC; null requests the " +
                        "default sort order, which could be unordered.\n\n" +
                        "*The insert, delete, and update methods are provided for convenience and " +
                        "clarity. Technically, the query method could handle all requests, including " +
                        "those to insert, delete, and update data.\n\n"));
        list10.add(new AndroidTerm("Permissions for sharing",
                "By default, apps cannot access the data of other apps. Both apps involved in " +
                        "sharing data need to have permission to do so-\n\n" +
                        "1.The content provider must allow other apps to access it's data.\n\n" +
                        "2.The user must allow the client app to access the content provider.\n\n" +
                        "Permissions in from the content provider\n\n" +
                        "To make your content provider visible and available to other apps, you need to " +
                        "declare in the AndroidManifest of the provider.\n\n" +
                        "<provider android:name=\".WordListContentProvider\"\n\n" +
                        "android:authorities=\"com.android.example.wordlistsqlwithcontentprovider.provider\"\n\n" +
                        "android:exported=\"true\"/>\n\n" +
                        "The android:exported property makes it explicit that other apps can use this " +
                        "content provider.\n\n" +
                        "“With no permissions set explicitly, any other app can access the content " +
                        "provider for reading and writing.”\n\n" +
                        "1. The permission string should be unique to your content provider, so that " +
                        "it only grants privileges for your content provider.\n\n" +
                        "2. While the string can be anything, using the package name guarantees " +
                        "uniqueness.\n\n " +
                        "Permissions client app requests from user\n\n " +
                        "In order to access the content provider, the client app needs to declare " +
                        "permissions in the Android Manifest for that content provider. \n\n" +
                        "<uses-permission " +
                        "android:name=\"com.android.example.wordlistcontentprovider.PERMISSION\"/>\n\n"));
    }

    private void setTerms11() {
        list11.add(new AndroidTerm("Loaders",
                "“Research shows that if an app or page takes more than 3 " +
                        "seconds to load, 40% of users will not use it.”\n\n" +
                        "App load time is directly related to whatever happens on " +
                        "the UI thread.It is necessary to load most or all of your " +
                        "data in the background, while you show your users " +
                        "relevant information that you have stored locally.\n\n" +
                        "“Loaders are special purpose classes that manage loading " +
                        "and reloading updated data asynchronously in the " +
                        "background using AsyncTask.”\n" +
                        "Introduced in Android 3.0, loaders have these properties:\n\n" +
                        "● They are available to every Activity and Fragment.\n\n" +
                        "● They provide asynchronous loading of data in the " +
                        "background.\n\n" +
                        "● They monitor the source of their data, automatically " +
                        "deliver new results when the content changes. For " +
                        "example, if you are displaying data in RecyclerView, " +
                        "when the underlying data changes, the CursorLoader " +
                        "automatically loads an updated set of data, and when " +
                        "finished with loading, can notify RecyclerView.Adapter " +
                        "to update what it displays to the user.\n\n" +
                        "● Loaders automatically reconnect to the last loader's " +
                        "cursor when being recreated after a configuration " +
                        "change like screen orientation from portrait to " +
                        "landscape. Thus, they don't need to re-query their data " +
                        "to display it to you.\n\n" +
                        "“AsyncTask as a general purpose class for doing work in " +
                        "the background, and you used an AsyncTaskLoader to " +
                        "keep data available to your users through configuration " +
                        "changes.”\n\n" +
                        "*You can create custom loaders by subclassing the " +
                        "Loader class. Android framework provides CursorLoader " +
                        "which extends AsyncTaskLoader to specifically work with " +
                        "content providers, saving you a lot of work.\n\n"
        ));
        list11.add(new AndroidTerm("Loader architecture",
                "The loader replaces the content resolvers query call to the " +
                        "content provider it means it can directly query the content " +
                        "provider for any data. The following diagram shows a " +
                        "simplified version of app architecture with a loader. It " +
                        "performs querying of data in the background. \n\n" +
                        "It observes and see if any data changes if it so then it automatically " +
                        "gets a new set of data and hands it to the adapter\n\n" +
                        "Implementing a CursorLoader\n\n" +
                        "It typically includes the following:\n\n" +
                        "● An Activity or Fragment.\n\n" +
                        "● An instance of the LoaderManager.\n\n" +
                        "● A CursorLoader to load data backed by a Content " +
                        "Provider.\nAlternatively, you can implement your own " +
                        "subclass of Loader or AsyncTaskLoader to load data " +
                        "from some other source.\n\n" +
                        "● An implementation LoaderManager.LoaderCallbacks. " +
                        "This is where you create new loaders and manage " +
                        "your references to existing loaders.\n\n" +
                        "● A way of displaying the loader's data, such as a " +
                        "SimpleCursorAdapter or RecyclerView Adapter.\n\n" +
                        "● A data source, such as a Content Provider (with CursorLoader).\n\n"
        ));
        list11.add(new AndroidTerm("LoaderManager",
                "As it name suggest it is a convenience class that manages " +
                        "all your loaders. It typically get it in onCreate() of your " +
                        "activity, where you also register the loaders you are going " +
                        "to use.\n\n" +
                        "The only calls to the loader manager you need to make " +
                        "are for registering a loader, and restarting it when you " +
                        "need to " +
                        "discard all the loaded data. The first parameter is the ID of " +
                        "the loader, the second is optional arguments, and the third " +
                        "is the context where the callbacks are defined.\n\n" +
                        "getLoaderManager().initLoader(0, null, this);\n\n" +
                        "getLoaderManager().restartLoader(0, null, this);\n\n"));
        list11.add(new AndroidTerm("LoaderManager.LoaderCallbacks",
                "You have to implement a set of callbacks specified in the " +
                        "LoaderCallbacks interface of the LoaderManager. When " +
                        "the state of the loader changes, these methods are called " +
                        "accordingly.The methods are:\n\n" +
                        "onCreateLoader()\u200B —Called when a new loader is created.\n\n" +
                        "Associates loader with the data source it should load and " +
                        "observe. (You don't have to do anything additional for the " +
                        "loader to observer your data source)\n\n" +
                        "onLoadFinished()\u200B —Called every time the loader finishes " +
                        "loading. Trigger an update of user-visible data in this " +
                        "method.\n\n" +
                        "onLoaderReset()\u200B —When the loader is reset, you usually " +
                        "want to invalidate the currently held data until new data " +
                        "has been loaded.\n\n" +
                        "For these, you need to implement LoaderManager " +
                        "callbacks for the type of loader you have. For example-for " +
                        "a cursorloader, change the signature of your activity as " +
                        "follows, then implement the callbacks.\n\n" +
                        "public class MainActivity extends AppCompatActivity " +
                        "implements LoaderManager.LoaderCallbacks<Cursor>"));
        list11.add(new AndroidTerm("onCreateLoader()",
                "It instantiates and returns a new loader instance of the " +
                        "desired type. Since the loader manager can be " +
                        "managing multiple loaders, an ID argument identifies the " +
                        "loader to instantiate. Once created, the loader will start " +
                        "loading data, and it will observe your date for changes, " +
                        "and reload as necessary.\n\n" +
                        "Some terms that are used in creating a cursor loader \n\n" +
                        "uri\u200B —The URI for the content to retrieve from the content " +
                        "provider. This identifies the content provider and the data " +
                        "to observe to the loader.\n\n" +
                        "projection\u200B —A list of columns to return. Passing null will " +
                        "return all columns, which is inefficient. \n\n" +
                        "selection\u200B —A filter declaring which rows to return, " +
                        "formatted as a SQL WHERE clause (excluding the " +
                        "WHERE itself).\n\n" +
                        "Passing null will return all rows for the given URI.\n\n" +
                        "selectionArgs\u200B —You may include ?s in the selection, which " +
                        "will be replaced by the values from selectionArgs, in the " +
                        "order that they appear in the selection. The values will be " +
                        "bound as Strings.\n\n" +
                        "sortOrder \u200B — How to order the rows, formatted as an SQL " +
                        "ORDER BY clause (excluding the ORDER BY itself). " +
                        "Passing null will use the default sort order, which may be " +
                        "unordered.\n\n"));
        list11.add(new AndroidTerm("onLoadFinished()",
                "In this function you should:\n\n" +
                        "● Release the old data.\n\n" +
                        "● Save the new data and, for example, make it " +
                        "available to your adapter.\n\n" +
                        "Cursor loader monitors the data for you, so you do not do " +
                        "it yourself.It also cleans up after itself, so there is no need " +
                        "for you to close the cursor.\n\n" +
                        "If you are using a RecyclerView to display the data, all you " +
                        "need to do is hand the data over to the adapter whenever " +
                        "loading or reloading has finished."));
        list11.add(new AndroidTerm("onLoaderReset()",
                "Called when a previously created loader is being reset, " +
                        "and thus making its data unavailable.\n\n" +
                        "● “You should clean all references to the data at this " +
                        "point. Again, if you are passing the data to an adapter " +
                        "for display in RecyclerView, the adapter does the " +
                        "actual work, you just have to instruct it to do so.”\n\n" +
                        "The loader receives the data, it hands the data over to the " +
                        "adapter through, for example, a setData() call. The " +
                        "setData() method updates an instance variable in the " +
                        "adapter that holds the most current data set, and notifies " +
                        "the adapter that there is fresh data. " +
                        "Benefits of cursors\n\n" +
                        "● Database uses cursors, the content provider uses " +
                        "cursors, and the loader uses cursors.\n\n" +
                        "● Using the same data type throughout your backend, " +
                        "and only unpacking it in the adapter, where the " +
                        "contents of the cursor are prepared for display, makes " +
                        "for a uniform backend with clean interfaces.\n\n" +
                        "● This makes it easier to write the code, easier to test," +
                        "and easier to debug. It also makes the code simpler " +
                        "and shorter.\n\n"));
        list11.add(new AndroidTerm("Benefits of cursors",
                "● Database uses cursors, the content provider uses " +
                        "cursors, and the loader uses cursors.\n\n" +
                        "● Using the same data type throughout your backend, " +
                        "and only unpacking it in the adapter, where the " +
                        "contents of the cursor are prepared for display, makes " +
                        "for a uniform backend with clean interfaces.\n\n" +
                        "● This makes it easier to write the code, easier to test, " +
                        "and easier to debug. It also makes the code simpler " +
                        "and shorter.\n\n"));
    }

    private void setTerms12() {
        list12.add(new AndroidTerm("Permission",
                "This section gives a brief overview of permissions so that " +
                        "you understand how and when your app needs to ask for " +
                        "permission before it can perform and action.\n\n" +
                        "● Ask permission if it isn't yours.\n\n" +
                        "For example, your app must get permission to read " +
                        "the user's Contacts data, or to use the device's " +
                        "camera.\n\n" +
                        "● Requesting permission\n\n" +
                        "To request permission, add the <uses-permission> " +
                        "attribute to the Android manifest file, along with the " +
                        "name of the requested permission. For example, to " +
                        "get permission to use the camera:\n\n" +
                        "<uses-permission android:name=\"android.permission.CAMERA\"/>\n\n" +
                        "“The Android framework provides more than 100 " +
                        "predefined permissions.”\n\n" +
                        "Android also includes predefined permissions for initiating " +
                        "a phone call without requiring the user to confirm it, " +
                        "reading the call log, capturing video output, rebooting the " +
                        "device, changing the date and time zone, and many more.\n\n" +
                        "You can see all the system-defined permissions at\n\n" +
                        "https://developer.android.com/reference/android/Manifest.permission.html.\n\n"
        ));
        list12.add(new AndroidTerm("Normal and dangerous permissions",
                "Android classifies permissions as normal or dangerous.\n\n" +
                        "A normal permission is for actions that do not affect user " +
                        "privacy or user data, such as connecting to the Internet.\n\n" +
                        "A dangerous permission is for an action that does affect " +
                        "user privacy or user data, such as permission to write to " +
                        "the user's voicemail.\n\n" +
                        "“Note: Apps must list all permissions they use in the " +
                        "Android manifest, even normal permissions.”\n\n" +
                        "Before Marshmallow, Google Play asks the user to grant " +
                        "required dangerous permissions before installing the " +
                        "App.\n\n" +
                        "From Marshmallow onwards, then Google Play does not " +
                        "ask the user to grant dangerous permissions to the app " +
                        "before installing it. Instead, when the user starts to do " +
                        "something in the app that needs that level of permission," +
                        "Android shows a dialog box asking the user to grant " +
                        "permission.\n\n"
        ));
        list12.add(new AndroidTerm("Permissions Models",
                "In the “old” permissions model, the developer needed to " +
                        "do was to make sure that the app listed the permissions it " +
                        "needed in the Android manifest file.The developer did not " +
                        "need to write code to check if permission had been " +
                        "granted or not while the app is running.\n\n" +
                        "In the \"new\" permissions model, you can no longer " +
                        "assume that if the app is running, then the user has " +
                        "granted the needed permissions. The user could grant " +
                        "permission the first time they run the app, then, at any " +
                        "time, change their mind and revoke any or all of the " +
                        "permissions that the app needs. So the app must check " +
                        "whether it still has permission every time it does " +
                        "something that requires permission.\n\n"
        ));
        list12.add(new AndroidTerm("Performance",
                "Your app should be small, fast and efficient to make it " +
                        "stand out from the crowd. It should have low impact on the " +
                        "device’s battery, memory, space and user’s data plans.\n\n" +
                        "Following are some recommendations to follow:\n\n" +
                        "1. Keep long-running tasks off the main thread-\n\n" +
                        "Move work off the main thread into the background to help " +
                        "keep the UI smooth and responsive for the user because " +
                        "the hardware that renders the display to the screen " +
                        "typically updates the screen every 16 milliseconds, so if " +
                        "the main thread is doing work that takes longer than 16 " +
                        "milliseconds, the app might skip frames, stutter or hang, " +
                        "all of which are likely to annoy your users. \n\n" +
                        "You can check how well your app does at generating a " +
                        "frame from your app and displaying it on the screen within " +
                        "the 16 millisecond limit by using the Profile GPU " +
                        "Rendering tool on your Android device.Immediately you " +
                        "will start seeing colored bars on your screen.\n\n" +
                        "To read more about this tool you can check out this link\n\n" +
                        "https://developer.android.com/topic/performance/rendering/profile-gpu.html\n\n" +
                        "2. Simplify your UI \n\n" +
                        "If you spend time designing them in the most efficient way " +
                        "then your layouts will draw faster and use less power and " +
                        "battery. So try to avoid,\n\n" +
                        "1. Deeply nested layouts\n\n" +
                        "2. Overlapping views\n\n" +
                        "Reduce the number of nested levels in your app's view " +
                        "hierarchy.Be careful about using drawable backgrounds " +
                        "on overlapping views and only use them when they are " +
                        "visible.\n\n" +
                        "3. Monitor the performance\n\n" +
                        "Android Studio has tools to measure your app's memory " +
                        "usage, GPU, CPU, and Network performance. App " +
                        "crashes are often related to memory leaks, which is when " +
                        "your app allocates memory and does not release it.\n\n" +
                        "Use the Memory Monitor tool that comes with Android " +
                        "Studio to observe how your app uses memory.\n\n" +
                        "The monitors are:\n\n" +
                        "Memory monitor\u200B —Reports how your app allocates " +
                        "memory and helps you to visualize the memory your app " +
                        "uses.\n\n" +
                        "CPU monitor\u200B —Lets you monitor the central processing " +
                        "unit (CPU) usage of your app. It displays CPU usage in " +
                        "real time.\n\n" +
                        "GPU monitor\u200B —Gives a visual representation of how long " +
                        "the graphical processing unit (GPU) takes to render frames to the screen.\n\n" +
                        "Network Monitor\u200B—Shows when your application is making " +
                        "network requests. It lets you see how and when your app " +
                        "transfers data, and optimize the underlying code appropriately."
        ));
        list12.add(new AndroidTerm("Security",
                "● Handle the data of the user-\n\n" +
                        "Much of the burden of building secure apps is handled for " +
                        "you by the Android Framework. However, as an app " +
                        "developer, you have the responsibility to make sure your " +
                        "app treats the user's data safely and with " +
                        "integrity. Your app is also responsible for keeping its own " +
                        "data safe. Depending on how your app uses user data, you " +
                        "might also need to provide a written statement regarding " +
                        "privacy practices when you publish your app in the Google " +
                        "Play store.\n\n" +
                        "\"Important: Logs are a shared resource across all apps.\"\n\n" +
                        "Any app that has the READ_LOGS permission can read " +
                        "all the logs. Do not write any of the user's private data to the logs.\n\n" +
                        "● Public Wi-Fi\n\n" +
                        "Design your app to protect your user's data when they are " +
                        "connected on public Wi-Fi. Use " +
                        "Https rather than Http whenever possible to connect to " +
                        "websites. Encrypt any user data that gets transmitted, " +
                        "even data that might seem innocent like their name.\n\n" +
                        "For transmitting sensitive data, implement authenticated," +
                        "encrypted socket-level communication using the " +
                        "SSLSocket class. This class adds a layer of security " +
                        "protections over the underlying network transport protocol.\n\n" +
                        "Those protections include protection against modifications " +
                        "of messages by a wiretapper, enhanced authentication " +
                        "with the server, and increased privacy protection.\n\n" +
                        "● Validating user input\n\n" +
                        "If your app uses native code, reads data from files, " +
                        "receives data over the network, or receives data from any " +
                        "external source, it has the potential to introduce a security " +
                        "issue. The most common problems are buffer overflows, " +
                        "dangling pointers, and off-by-one errors. Android provides " +
                        "a number of technologies that reduce the exploitability of " +
                        "these errors, but they do not solve the underlying problem. " +
                        "You can prevent these vulnerabilities by carefully handling " +
                        "pointers and managing buffers.\n\n" +
                        "SQL Injection:\n\n" +
                        "If a app allows users to enter queries that are submitted to " +
                        "an SQL database or a content provider, you must guard " +
                        "against SQL injection. This is a technique where malicious " +
                        "users can inject SQL commands into a SQL statement by " +
                        "entering data in a field. Injected SQL commands can alter " +
                        "SQL statement and compromise the security of the " +
                        "application and the database.\n\n" +
                        "● Web Views\n\n" +
                        "One of the View classes in Android is WebView, which " +
                        "displays a web page. It is mentioned here because it does " +
                        "come with security concerns. Because WebView " +
                        "consumes web content that can include HTML and " +
                        "avaScript, it can introduce common web security issues " +
                        "such as cross-site-scripting (JavaScript injection).\n\n " +
                        "A WebView provides no browser-like widgets, does not " +
                        "enable JavaScript, and ignores web page errors.\n\n" +
                        "“Treat user data with care and keep it safe at all times”.\n\n"
        ));
    }

    private void setTerms13() {
        list13.add(new AndroidTerm("Firebase Analytics",
                "You can use Firebase to add features to your app,get a wider audience for " +
                        "your app, test your app, earn revenue from your app, and get analytics on " +
                        "the usage of your app.\n\n"+
                        "Firebase project.\n\n" +
                        "You can enable Firebase Analytics in your app to see data about how and " +
                        "where your app is used. You will be able to see data such as how many " +
                        "people use your app over time and where in the world they use it.\n\n" +
                        "To get usage data about your app, add the firebase-core library to your " +
                        "app, you will get a default set of data about how, when, and where people " +
                        "use your app.The analytics information you get by default includes:\n\n" +
                        "Number of users\n\n" +
                        "Devices your users used\n\n" +
                        "Location of the users\n\n" +
                        "Demographics such as gender\n\n" +
                        "App version\n\n" +
                        "User engagement\n\n" +
                        "And more\n\n" +
                        "To see usage data for your app beyond the default reports, you need to " +
                        "add code to your app to send an \"Analytics event\"at the appropriate point in " +
                        "your app"));
        list13.add(new AndroidTerm("Firebase Notification",
                "Using the Firebase console, you can send notifications to all your users, or " +
                        "to a subset of your users.\n\n" +
                        "Type the message in the Notifications section of the console, select the the " +
                        "audience segment to send the message to, and then send the message.\n\n" +
                        "To send the message to all users of your app, set the User Segment to " +
                        "App, and select the package for your app.\n\n" +
                        "Behind the scenes, Firebase uses Firebase Cloud Messaging to send the " +
                        "notification to the targeted devices where the selected app is installed."));
        list13.add(new AndroidTerm("Firebase Realtime Database",
                "Firebase offers a database that provides cloud-based data storage, " +
                        "allowing clients to all stay in sync as the data changes. If an app goes " +
                        "offline, the data remains available. When the app reconnects to the " +
                        "Internet, the data is synced to the latest state of the database.\n\n" +
                        "How Database works\n\n" +
                        "1. The Firebase Realtime Database is a NoSQL database. Data is " +
                        "stored as JSON objects\n\n" +
                        "2. It is a cloud-hosted JSON tree. Unlike a SQL database, there are no " +
                        "tables or records. When you add data to the JSON tree, it becomes a " +
                        "node in the existing JSON structure with an associated key.\n\n" +
                        "You can also import and export data in the console. To import data, you " +
                        "must format the data as JSON and save it in a file with a .json extension\n\n" +
                        "3. To use a Firebase database in your app, add the firebase-database " +
                        "library to your app, and then use methods on DatabaseReference. \n\nTo" +
                        "access the data from your Android app, use the methods in the " +
                        "DatabaseReference class to access, create, and update class represents a " +
                        "reference to a data item.\n\n" +
                        "To learn more about reading and writing Firebase data in your app\n\n" +
                        "https://firebase.google.com/docs/database/android/start/\n\n" +
                        "https://firebase.google.com/docs/database/android/read-and-write\n\n"
        ));
        list13.add(new AndroidTerm("Firebase Test Lab",
                "The Firebase Test Lab lets you test your app on a range of different " +
                        "devices hosted in Google's data centers and get reports on the results.\n\n" +
                        "The Test Lab creates tests called robo tests for you, and you can also " +
                        "create and run your own tests. To run your app in the Test Lab:\n\n" +
                        "To run your app in the Test Lab:\n\n" +
                        "1. In Android Studio: Build > Build APK.\n\n" +
                        "2. Locate the APK in your computer's file system. It will likely be in " +
                        "app/build/apk or app/build/outputs/apk in the " +
                        "directory where the Android Studio project is saved.\n\n" +
                        "On Mac, you can click Reveal in Finder to see the location of the APK.\n\n" +
                        "3. In the Firebase console select Test Lab > Run a Test.\n\n" +
                        "4. Upload your APK.\n\n" +
                        "5. From the matrix of devices and API levels that appears, choose the " +
                        "combination of devices to run your app on.\n\n" +
                        "6. Choose Start N Tests at the bottom right of the device matrix, where N is " +
                        "the valid combination of devices and API levels you have chosen.\n\n" +
                        "7. View the report when the tests have finished.\n\n"
        ));
        list13.add(new AndroidTerm("Firebase Demo",
                "There is a public Firebase demo project that you can use to explore the " +
                        "Firebase console. It means you can use Firebase Test Lab without adding " +
                        "your project to Firebase. The Firebase demo project is a standard Firebase " +
                        "project with fully functioning analytics, crash reporting, test lab, and more.\n\n" +
                        "Anyone with a Google account can access it. It's a great way to look at real " +
                        "app data and explore the Firebase feature set.\n\n" +
                        "The data in the demo project is real data from an app called Flood-It. You " +
                        "can download this app and use it to contribute to the data yourself. Flood-It " +
                        "is a simple game, where you see how quickly you can cover the board with " +
                        "a single color. Flood- It was created by Lab Pixies, which is now a Google " +
                        "company."
        ));
        list13.add(new AndroidTerm("Admob",
                "Assuming your app is robust and provides features that are useful, entertaining, or " +
                        "interesting, there are various ways for you to make money from your app.\n\n" +
                        "● Premium model—users pay to download app.\n\n" +
                        "● Freemium model:\n\n" +
                        "1.downloading the app is free.\n\n" +
                        "2.users pay for upgrades or in-app purchases.\n\n" +
                        "● Subscriptions—users pay a recurring fee for the app\n\n" +
                        "● Ads—the app is free but it displays ads.\n\n" +
                        "The most common to earn money from app is by displaying ads.\n\n" +
                        "If your app displays ads, always be considerate of the user. If your app " +
                        "shows so many ads that it annoys the user, they might stop using it or " +
                        "uninstall it.\n\nUse it carefully otherwise you can lose your adsense account.\n\n" +
                        "The best way to incorporate ads into your app is to use AdMob a google " +
                        "product.\n\n" +
                        "To display an ad in your app, add an AdView in the layout of an activity and " +
                        "write a small amount of boilerplate code to load the ad. When a user runs " +
                        "your app and goes to that activity, an ad appears in the AdView.\n\n" +
                        "How google pays you\n\n" +
                        "Google pays you when users click ads in your app. The exact amount you " +
                        "get paid depends on the ads that get shown, and how much the advertisers " +
                        "were willing to pay for their ads. The total amount paid by the advertisers is " +
                        "distributed between Google and the publisher of the website or app where " +
                        "the ad appears.\n\n" +
                        "“Don't click on ads in your own app\n\n”" +
                        "Create an AdMob account\n\n" +
                        "To enable AdMob use these steps:\n\n" +
                        "1. In the Firebase console, select AdMob in the left hand navigation, then " +
                        "select Sign Up For AdMob.\n\n" +
                        "You will be redirected to the AdMob console.\n\n" +
                        "2. Follow the sign up wizard to create your AdMob account and add your " +
                        "app to AdMob.\n\n" +
                        "To display an ad in your app, you need your AdMob app ID and an ad unit " +
                        "ID. You can get both of these in the AdMob console.\n\n"
        ));
    }

    private void setTerms14() {
        list14.add(new AndroidTerm("Publish your app",
                "After you realized that your app has been ready to publish into the play " +
                "store then you have to perform the following steps:\n\n" +
                "1. Buy the Google play developer console\n\n" +
                "2. Generate the signed APK of the app\n\n" +
                "3. Upload the APK to the Google Play developer console."));
        list14.add(new AndroidTerm("Important points",
                "1. Make sure to test your app on different android devices of different " +
                "screen sizes and orientation and it should runs normally in every possible " +
                "situation. For these you can use Firebase Test Lab to run your app on a range of " +
                "real devices in Google's data centers.\n\n" +
                "2. Specify the appropriate requirements that your app require in the " +
                "manifest. Ex- you can specify that your app uses hardware features " +
                "such as:\n\n" +
                "light sensor:\n\n" +
                "<uses-feature android:name=\"android.hardware.sensor.light\" />\n\n" +
                "3. Add a launcher icon or app icon by going into File->New->Vector " +
                "Asset in the android studio.\n\n"));
        list14.add(new AndroidTerm("Important points",
                "4. Specify a unique application ID defined in build. gradle file. It does " +
                        "not have to be the same as the app’s package name. It defines your " +
                        "application’s identity. It must remain the same after you publish your " +
                        "app if you change it, then the app becomes a different application and " +
                        "users of the previous app will not be able to update to the new app\n\n" +
                        "5. As you add new features, you will need to update the version " +
                        "number each time you release a new version to the Google Play store.\n\n" +
                        "6. Minimize the size of your apk by :\n\n" +
                        "1.Clean up your project to remove unused resources\n\n" +
                        "2.Reuse the resources\n\n" +
                        "3.Minimize resource try to use from libraries\n\n" +
                        "4.Reduce native and Java code\n\n" +
                        "5.Reduce space needs for images\n\n\n\n"+
                        "Android Studio has tools for generating your APK and signing it with a digital certificate go to " +
                        "build->generate signed apk. This helps Android ensure that any future " +
                        "updates to your APK are authentic and come from you, the original " +
                        "Author."));
        list14.add(new AndroidTerm("Final note",
                "When you've tested your app, cleaned it up, reduced its size, and " +
                        "generated the APK, you are ready to publish it to Google Play.\n\n" +
                        "You can run alpha and beta tests before releasing it to the public.\n\n" +
                        "Running alpha and beta tests lets you share your app with real users, " +
                        "and get feedback from them. This feedback does not appear as reviews " +
                        "in Google Play.\n\n" +
                        "Run alpha tests while you are developing your app. Use alpha tests for " +
                        "early experimental versions of your app that might contain incomplete or unstable functionality. Running alpha tests is also a good way to " +
                        "share your app with friends and family.\n\n" +
                        "Run beta tests with the limited number of real users, to do final testing " +
                        "before your app goes public.\n\n" ));
    }

    public ArrayList<AndroidTerm> getDay(int i) {
        switch (i) {
            case 0:
                setTerms0();
                return list0;
            case 1:
                setTerms1();
                return list1;
            case 2:
                setTerms2();
                return list2;
            case 3:
                setTerms3();
                return list3;
            case 4:
                setTerms4();
                return list4;
            case 5:
                setTerms5();
                return list5;
            case 6:
                setTerms6();
                return list6;
            case 7:
                setTerms7();
                return list7;
            case 8:
                setTerms8();
                return list8;
            case 9:
                setTerms9();
                return list9;
            case 10:
                setTerms10();
                return list10;
            case 11:
                setTerms11();
                return list11;
            case 12:
                setTerms12();
                return list12;
            case 13:
                setTerms13();
                return list13;
            case 14:
                setTerms14();
                return list14;
        }
        return null;
    }
}