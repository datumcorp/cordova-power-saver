var exec = require('cordova/exec');

var PowerSaver = function() {
    console.log('PowerSaver Cordova Plugin instanced');
};

PowerSaver.prototype.isPowerSaverEnabled = function() {
    return new Promise(function(resolve, reject) {
        var successCallback = function(obj) {
            resolve(1 === parseInt(obj));
        };
    
        exec(successCallback, successCallback, 'PowerSaver', 'isPowerSaverEnabled', []);
    });
};

module.exports = new PowerSaver();