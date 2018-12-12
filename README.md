# cordova-power-saver

Cordova Power Saver plugin is a small plugin that allows applications to check if device is in power saving mode

## Usage

```
    PowerSaver.isPowerSaverEnabled()
        .then((isActive) => {
            console.log('Power saving mode is active', isActive);
        });
```

## Platforms

* Android (5+)
* iOS