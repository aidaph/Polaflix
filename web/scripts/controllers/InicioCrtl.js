navApp.controller("InicioCtrl", ["$scope",function($scope) {
  $scope.getClass = function (path) {
  return ($location.path().substr(0, path.length) === path) ? 'active' : '';
}
}]);



navApp.controller('seriesEmpezadasCtrl', function( $scope, $http, $localStorage, $location) {
    $http.get('http://localhost:8080/usuario/1/Empezadas').
        then(function(response) {
            $scope.seriesEmpezadas = response.data;
    });
    this.goToSerie = function (id) {
       $localStorage.serieId = id;
       $http.get('http://localhost:8080/usuario/1/'+id+"/UltimaTempo").
           then(function(response) {
               $localStorage.tempo_id = response.data.id;
       });
       //$localStorage.userId = userId;
       $location.path("/VerSerie");
    }

    $scope.linkClicked = function(link){
  };
});
navApp.controller('seriesPendientesCtrl', function( $scope, $http, $localStorage, $location) {
    $http.get('http://localhost:8080/usuario/1/Pendientes').
        then(function(response) {
            $scope.seriesPendientes = response.data;
    });
    this.goToSerie = function (id) {
       $localStorage.serieId = id;
       $http.get('http://localhost:8080/usuario/1/'+id+"/UltimaTempo").
           then(function(response) {
               $localStorage.tempo_id = response.data.id;
       });
       $location.path("/VerSerie");
    }
    $scope.linkClicked = function(link){
  };
});
navApp.controller('seriesTerminadasCtrl', function( $scope, $http, $localStorage, $location) {
    $http.get('http://localhost:8080/usuario/1/Terminadas').
        then(function(response) {
            $scope.series = response.data;
    });
    this.goToSerie = function (id) {
       $localStorage.serieId = id;
       $http.get('http://localhost:8080/usuario/1/'+id+"/UltimaTempo").
           then(function(response) {
               $localStorage.tempo_id = response.data.id;
       });
       $http.get('http://localhost:8080/usuario/1/'+id+"/UltimoCapi").
           then(function(response) {
               $localStorage.ult_capi_id = response.data.id;
       });
       $location.path("/VerSerie");
    }
    $scope.linkClicked = function(link){
  };
});
