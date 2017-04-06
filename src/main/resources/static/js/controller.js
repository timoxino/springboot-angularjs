app.controller('signInController', function($scope, signInService) {
    
    this.login = function () {
        signInService.signIn($scope.email,$scope.password)
    };

});
