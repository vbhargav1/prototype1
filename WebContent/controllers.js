/**
 * New node file
 */
var webapp = angular.module('WebApp', [ 'ui.bootstrap' ]);

webapp.controller('SearchCtrl', function($scope, $http) {

	$scope.getResults = function(viewValue) {
		return ["",2,3,4];
		return $http.post('http://localhost:8080/gradstudyeval_prototype/search',
				{
					params : {
						keywords : viewValue,
					}
				}).then(function(response) {
			console.log(response.status);
			return response.data;
		});
	};
});