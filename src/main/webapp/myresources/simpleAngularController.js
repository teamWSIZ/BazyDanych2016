
var app = angular.module('myApp', []);


app.controller('myCtl', function ($scope, $http, $filter) {
    $scope.user = 'Anonymous';

});