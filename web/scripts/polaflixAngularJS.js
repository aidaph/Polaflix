/*var polaflixApp = angular.module('Polaflix',['menuNavegacion']);

polaflixApp.controller('polaflixController',
            function polaflixController($scope){
              $scope.menuEntries =
              [
                { 'name':'Inicio', 'value':'Inicio'},
                { 'name':'Agregar Serie', 'value':'Agregar Serie'},
                { 'name': 'Ver Cargos', 'value':'Ver Cargos'}
              ]
})*/

var navList = angular.module('navList', []);

var navApp = angular.module('navApp', ['ngRoute', 'ngStorage']);
navApp.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
    .when('/', {
        templateUrl: 'menuNavegacion/Inicio.html',
        controller: "InicioCtrl",
    })
    .when('/Inicio', {
        templateUrl: 'menuNavegacion/Inicio.html',
        controller: "InicioCtrl",
    })
    .when('/Agregar', {
        templateUrl: 'menuNavegacion/tempAgregar/Agregar.html',
        controller: "AgregarCtrl",
    })
    .when('/AgregarByInitialShort', {
        templateUrl: 'menuNavegacion/tempAgregar/AgregarInitial.html',
    })
    .when('/AgregarByInitialLarge', {
        templateUrl: 'menuNavegacion/tempAgregar/AgregarInitialLarge.html',
    })
    .when('/AgregarNoExiste', {
        templateUrl: 'menuNavegacion/tempAgregar/AgregarNoExiste.html',
    })
    .when('/VerSerie', {
        templateUrl: 'menuNavegacion/serie.html',
    })
    .when('/Cargos', {
        templateUrl: 'menuNavegacion/templatesCargos/Cargos.html',
        controller: "CargosCtrl",
    })
}]);
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
navApp.directive('myOnKeyDownCall', function () {
 return function (scope, element, attrs) {
     element.bind("keydown keypress", function (event) {
             scope.$apply(function (){
                 scope.$eval(attrs.ngEnter);
             });
             event.preventDefault();
     });
 };
});
navApp.controller('AgregarCtrl', function( $scope, $http, $localStorage, $location) {
  $scope.listaABC = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N',
  'O','P','Q','R','S','T','U','V','W','X','Y','Z', '0-9'];
  $http.get('http://localhost:8080/serie/').
      then(function(response) {
          $scope.series = response.data;
          $scope.temporadas = response.data.listaTemporadas;
  });
  $scope.getActores = function(serieId){
      $scope.actores = [];
      angular.forEach($scope.series, function(serie){
        $http.get('http://localhost:8080/serie/'+serie.id+'/listaActores')
        .then(
           function(response){
               $scope.actores.push(response.data);
           });
      });
  }
  this.goToSerie = function (id) {
     $localStorage.serieId = id;
     $location.path("/VerSerie");
  };
  this.searchSerie = function(texto){
    $http.get('http://localhost:8080/serie/search/'+texto).
        then(function(response) {
          $scope.seriesInit = response.data;
        if ($scope.seriesInit.length ==0){
          $localStorage.messageErrorAgre= "No se encuentra la serie que está buscando";
          $location.path("/AgregarNoExiste");
        } else if ($scope.seriesInit.length==1) {
          $localStorage.serieInit = $scope.seriesInit[0];
          $location.path("/AgregarByInitialShort");
        }else{
          $localStorage.seriesInit = $scope.seriesInit;
          $location.path("/AgregarByInitialLarge");
        }
    });
  }
  this.addSerieToPendiente = function (serie) {
    $scope.messageError = " ";
     var userId = {"userId":1};
     var postData = {
       "id" : serie.id,
       "name": serie.name,
       "tipoSerie":serie.tipoSerie,
       "descripcion":serie.descripcion,
       "creador":serie.creador,
       "imageUrl":serie.imageUrl,
       "listaActores":serie.listaActores,
       "listaTemporadas":serie.listaTemporadas
     };
     $scope.listaSeries = [];
     $http.get('http://localhost:8080/usuario/1/Empezadas').
         then(function(response) {
             $scope.seriesEmpezadas = response.data;
             for (var i =0; i< $scope.seriesEmpezadas.length; i++){
               $scope.listaSeries.push($scope.seriesEmpezadas[i].id);
             };
             $http.get('http://localhost:8080/usuario/1/Pendientes').
                 then(function(response) {
                     $scope.seriesPendientes = response.data;
                     for (var i =0; i< $scope.seriesPendientes.length; i++){
                       $scope.listaSeries.push($scope.seriesPendientes[i].id);
                     };
                     $http.get('http://localhost:8080/usuario/1/Terminadas').
                         then(function(response) {
                             $scope.seriesTerminadas = response.data;
                             for (var i =0; i< $scope.seriesTerminadas.length; i++){
                               $scope.listaSeries.push($scope.seriesTerminadas[i].id);
                             };
                             if ( $scope.listaSeries.indexOf(postData.id) !== -1){
                               console.log("La serie esta en la lista");
                               $scope.messageError = "La serie ya está en la lista de series del Usuario";
                             }else{
                               console.log("La serie no esta en la lista");
                               $scope.messageError = "Serie añadida a lista de Pendientes";
                               $http({
                                 method: 'POST',
                                 url: 'http://localhost:8080/usuario/1/Pendientes/',
                                 headers: {
                                   'Content-Type':'application/json'
                                 },
                                 data: postData })
                             }
                });
            });
        });
  };
    this.showSerieByInitial = function(initial){
      $http.get('http://localhost:8080/serie/init/'+initial).
       then(function(response) {
          $scope.seriesInit = response.data;
          if ($scope.seriesInit.length < 1) {
            $localStorage.messageErrorAgre =  "No hay series que empiecen por esta letra";
            $location.path("/AgregarNoExiste");
          }
          else if ($scope.seriesInit.length == 1){
            $localStorage.serieInit = $scope.seriesInit[0];
            $location.path("/AgregarByInitialShort");
          }else{
            $scope.seriesInit = response.data;
            $location.path("/AgregarByInitialLarge");
          }
      });
    };
});

navApp.controller("AgregarInitCtrl", function( $scope, $http, $localStorage, $location) {
   $scope.serieInit = $localStorage.serieInit;
   $scope.messageErrorAgre=$localStorage.messageErrorAgre;
   console.log("El nombre de serieInit es "+ $scope.serieInit.name);
   this.goToSerie = function (id) {
      $localStorage.serieId = id;
      $location.path("/VerSerie");
   }
});

navApp.controller("AgregarInitLargeCtrl", function( $scope, $http, $localStorage, $location) {
   $scope.seriesInit = $localStorage.seriesInit;
   this.goToSerie = function (id) {
      $localStorage.serieId = id;
      $location.path("/VerSerie");
   }
});

navApp.config(function ($httpProvider) {
  $httpProvider.defaults.headers.common = {};
  $httpProvider.defaults.headers.post["Content-Type"] = "application/json";
  $httpProvider.defaults.headers.put = {};
  $httpProvider.defaults.headers.patch = {};
});

navApp.controller("serieCtrl", function( $scope, $http, $localStorage, $location) {
    $scope.selectedTempo = $localStorage.tempo_id;
    $http.get('http://localhost:8080/serie/'+ $localStorage.serieId+'/temporada/'+$scope.selectedTempo).
        then(function(response) {
            $scope.capitulos = response.data.listaCapitulos;
    });
    $http.get('http://localhost:8080/serie/'+ $localStorage.serieId).
        then(function(response) {
            $scope.serie = response.data;
            $scope.temporadas = response.data.listaTemporadas;

    });
    // Cap visto?
    $scope.capVisto = function(capId) {
      $scope.visto = "";
      $http.get('http://localhost:8080/usuario/1/facturas').
          then(function(response) {
              $scope.facturas = response.data;
              $scope.visto=[];
              for (var i = 0; i < response.data.length; i++) {
                $http.get('http://localhost:8080/usuario/1/facturas/'+response.data[i].id+'/capis/')
                .then(
                   function(response){
                       $scope.capitulosVistos = response.data;
                       //console.log("Length capitulos vistos "+$scope.capitulosVistos.length);
                       for (var j = 0; j < $scope.capitulosVistos.length; j++) {
                           //console.log("id Capitulo dentro de CapituloVisto "+ $scope.capitulosVistos[j].capitulo.id);
                           if ($scope.capitulosVistos[j].capitulo.id == capId ){
                               $scope.visto = "Visto";
                           }else{
                               $scope.visto = "No visto";
                           }
                       };
                   }); //http CapitulosVistos
               }; //for
       }); //Http Facturas
  }; //

      $scope.getActores = function(serieId){
          $scope.actores = [];
          angular.forEach($scope.series, function(serie){
            $http.get('http://localhost:8080/serie/'+serie.id+'/listaActores')
            .then(
               function(response){
                   $scope.actores.push(response.data);
               });
          });
      $scope.capVistos = [];
      angular.forEach($scope.series, function(serie){
        $http.get('http://localhost:8080/serie/'+serie.id+'/listaActores')
        .then(
           function(response){
               $scope.actores.push(response.data);
               console.log(response.data)
           });
      });
    };
    //};
    this.getCapis = function (num_tempo) {
      $http.get('http://localhost:8080/serie/'+ $localStorage.serieId+'/temporada/'+num_tempo).
          then(function(response) {
              $scope.capitulos = response.data.listaCapitulos;
              $scope.IsVisible = false;
      });
    };
    this.showDescripcion = function () {
      $scope.IsVisible = $scope.IsVisible ? false : true;
    };
    this.addCapVisto = function(capitulo) {
      //TODO: Acceder a la ultima factura
      // Una vez accedida la ultima factura hacer un post
      $http.get('http://localhost:8080/usuario/1/facturas/').
            then(function(response) {
                $scope.facturas = response.data;
                $localStorage.lastFact = $scope.facturas.length;
      });
      $scope.messageError = "Capitulo Visto";
      var postData = {
          "id": Math.floor((Math.random() * 150) + 15),
          "fecha":new Date(),
          "capitulo": {
            "id": capitulo.id,
            "nombre": capitulo.nombre,
            "num":capitulo.num,
            "precio": capitulo.precio,
            "des": capitulo.des
          },
          "factura": $localStorage.lastFact
      };
      $http({
        method: 'POST',
        url: 'http://localhost:8080/usuario/1/facturas/'+$localStorage.lastFact,
        headers: {
          'Content-Type':'application/json'
        },
        data: postData})
    };
});


navApp.controller("CargosCtrl", function( $scope, $http, $localStorage, $location) {
  // Get ultima factura, que es la que se va a mostrar en Cargos.html
  $http.get('http://localhost:8080/usuario/1/facturas/').
        then(function(response) {
            $scope.facturas = response.data;
            $localStorage.countFacturas = $scope.facturas.length;
            $scope.ultimaFact=$localStorage.countFacturas;
  });
  $http.get('http://localhost:8080/usuario/1/')
  .then(
    function(response){
        $scope.cuota = response.data.cuotaFija;
    });
  $http.get('http://localhost:8080/usuario/1/facturas/'+ $localStorage.countFacturas).
    then(function(response) {
        $scope.capitulosVistos = response.data;
        $scope.capitulosVistos = $scope.capitulosVistos;
        $scope.numFactura = $localStorage.countFacturas;
        $scope.numTempo = [];
        $scope.nombreSerie = [];
        angular.forEach($scope.capitulosVistos, function(capiV){
          $http.get('http://localhost:8080/usuario/1/facturas/'+$scope.numFactura+'/capis/'+capiV.id+'/tempo')
          .then(
               function(response){
                   $scope.numTempo.push(response.data.num);
               });
          $http.get('http://localhost:8080/usuario/1/facturas/'+$scope.numFactura+'/capis/'+capiV.id+'/serie')
          .then(
              function(response){
                  $scope.nombreSerie.push(response.data.name);
              });
        });
        $scope.fechaFactura = response.data[0].fecha;
        $scope.getTotal = function(){
            var total = 0;
              console.log($scope.cuota);
            if ($scope.cuota == true){
                total = 20;
            }
            else {
                for(var i = 0; i < $scope.capitulosVistos.length; i++){
                    var capitulo = $scope.capitulosVistos[i].capitulo;
                    total += (capitulo.precio);
                }
            }
            return total;
        }
    });
    this.getFactura = function (fact_Id){
      $scope.message = ""
      $http.get('http://localhost:8080/usuario/1/facturas/'+ fact_Id)
      .then(function(response) {
            $scope.capitulosVistos = response.data;
            $scope.capitulosVistos = $scope.capitulosVistos;
            $scope.numFactura = fact_Id;
            $scope.numTempo = [];
            $scope.nombreSerie = [];
            angular.forEach($scope.capitulosVistos, function(capiV){
              $http.get('http://localhost:8080/usuario/1/facturas/'+fact_Id+'/capis/'+capiV.id+'/tempo')
              .then(
                   function(response){
                       $scope.numTempo.push(response.data.num);
                   });
              $http.get('http://localhost:8080/usuario/1/facturas/'+fact_Id+'/capis/'+capiV.id+'/serie')
              .then(
                  function(response){
                      $scope.nombreSerie.push(response.data.name);
                  });
            });
            $scope.fechaFactura = response.data[0].fecha;
            $scope.getTotal = function(){
                var total = 0;
                for(var i = 0; i < $scope.capitulosVistos.length; i++){
                    var capitulo = $scope.capitulosVistos[i].capitulo;
                    total += (capitulo.precio);
                }
                return total;
            }
        })
        .catch(function(data) {
          $scope.message = "No hay más facturas"
        })
    }

});
navApp.controller('navCtrl', ['$scope', '$location', function ($scope, $location) {
    $scope.navClass = function (page) {
        var currentRoute = $location.path().substring(1) || 'Inicio';
        return page === currentRoute ? 'active' : '';
    };
}]);
