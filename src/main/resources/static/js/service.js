app.service('signInService', ['$http', function ($http) {

    this.signIn = function (email, password) {

        var signInRef = this;
        signInRef.response = {};

        $http.post('placeholder', {}).success(function (data) {
            signInRef.response = data;
            console.log(data);
        });
    };

}]);
