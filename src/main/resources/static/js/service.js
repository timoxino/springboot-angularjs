app.service('signInService', ['$http', function ($http) {

    this.signIn = function (email, password) {

        var instance = this;
        instance.response = {};

        // $http.get('http://localhost:8080/account?email=' + email).success(function (data) {
        $http.post('http://localhost:8080/account/signIn', {email : email, password : password}).success(function (data) {
            console.log(data);
            instance.response = data;
        });
    };

}]);
