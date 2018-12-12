var exec = require('cordova/exec');

var PowerSaver = function() {
    console.log('PowerSaver Cordova Plugin instanced');
};

PowerSaver.prototype.isPowerSaverEnabled = function(msg, onSuccess) {
    var successCallback = function(obj) {
        onSuccess(1 === parseInt(obj));
    };

    exec(successCallback, successCallback, 'PowerSaver', 'isPowerSaverEnabled', [msg]);
};

module.exports = new PowerSaver();