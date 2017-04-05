app.controller('SigninController', function($scope) {
    
    this.email = $scope.email;
    this.password = $scope.password;

    this.login = function () {
        console.log(this.email + ' - ' + this.password);
    };

});
