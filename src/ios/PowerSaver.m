/********* PowerSaver.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>

@interface PowerSaver : CDVPlugin {
  // Member variables go here.
}

- (void)isPowerSaverEnabled:(CDVInvokedUrlCommand*)command;
@end

@implementation PowerSaver

- (void)isPowerSaverEnabled:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];
    NSString* enabled = @"1";
    NSString* disabled = @"0";

    if ([[NSProcessInfo processInfo] isLowPowerModeEnabled]) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:enabled];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:disabled];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
