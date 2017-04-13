app.controller('SignInController', function ($scope, signInService) {

    this.signIn = function () {

        if($scope.signInForm.$invalid)
        {
            console.log("Signin form is invalid");
            return;
        }

        console.log('Attempting signin with email: ' + $scope.email + ' and password: ' + $scope.password);
        signInService.signIn($scope.email, $scope.password)
    }

});
