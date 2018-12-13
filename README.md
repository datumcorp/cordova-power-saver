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
* iOS (9+)

## Roadmap

* Adding the observable method that will allow subscribing to changes in power saver mode
    * [iOS Reference](https://useyourloaf.com/blog/detecting-low-power-mode/)

### Intended usage 

```
    PowerSaver.powerSaverChange()
        .subscribe((isActive) => {
            console.log('Power saving mode has changed to', isActive);
        });
```

## Warning 

This plugin is still being tested so please don't use it just yet