# Exp5 - Android Notification Application

A professional and aesthetic Android application demonstrating the implementation of high-priority local notifications. This project covers modern Android notification requirements, including notification channels, runtime permissions for Android 13+, and interactive notification features.

## 🚀 Features

- **High Priority Notifications**: Configured as heads-up notifications that pop up at the top of the screen.
- **Interactive UI**: A clean, Material Design 3 based user interface using `MaterialCardView` and `MaterialButton`.
- **Notification Actions**: Includes an "Open App" action button directly in the notification.
- **Runtime Permissions**: Robust handling of `POST_NOTIFICATIONS` permission for Android 13 (API 33) and above.
- **Deep Linking**: Tapping the notification opens the app's main activity using `PendingIntent`.
- **Oreo Support**: Properly implemented `NotificationChannel` for Android 8.0+.

## 🛠️ Technical Implementation

### Notification Configuration
- **Channel ID**: `sample_notification_channel`
- **Importance**: `NotificationManager.IMPORTANCE_HIGH`
- **Priority**: `NotificationCompat.PRIORITY_HIGH`
- **Style**: `NotificationCompat.BigTextStyle` for long content.

### Permissions
The app requests the following permission in `AndroidManifest.xml`:
```xml
<uses-permission android:name="android.permission.POST_NOTIFICATIONS" />
```

### Build Requirements
- **Compile SDK**: 37
- **Min SDK**: 24
- **Target SDK**: 36

## 📱 Getting Started

1. **Clone the project**:
   ```bash
   git clone [repository-url]
   ```
2. **Open in Android Studio**:
   Open the root directory `Exp5`.
3. **Build and Run**:
   - Ensure you have an emulator or physical device running Android 7.0 (API 24) or higher.
   - Click the **"Send Notification"** button in the app.
   - On Android 13+, grant the notification permission when prompted.

## 🎨 UI Design
The application uses a centered card layout with:
- **Background**: Soft grey (#F5F5F5)
- **Primary Color**: Deep Purple (#6200EE)
- **Accent**: Modern teal and white accents for clarity.

---
Developed as a sample project to showcase Android Notification Best Practices.

## OUTPUT
[Screen Recording 2026-08-20 105106.mp4](Screen%20recording/Screen%20Recording%202026-08-20%20105106.mp4)
![Screenshot 2026-08-20 105206.png](Screen%20recording/Screenshot%202026-08-20%20105206.png)
![Screenshot 2026-08-20 105313.png](Screen%20recording/Screenshot%202026-08-20%20105313.png)