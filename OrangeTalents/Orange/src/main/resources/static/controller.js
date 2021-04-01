var app = angular.module('myApp', []);

app.controller('myCtrl', function ($scope, $http) {

  $scope.cadastro = new Object();

  $scope.salvarUsuario = function () {
    $http.post("http://localhost:8080/cadastroUsuario", {
      'id': $scope.id,
      'nome': $scope.nome,
      'cpf': $scope.cpf,
      'email': $scope.email,
      'nascimento': $scope.nascimento

    }).then(resposta => {
      Swal.fire('Ok !!', 'Usuario cadastrado com sucesso!!', 'success')
    }).catch(erro => {

      Swal.fire('Erro !!', 'Erro 400!', 'error')

    })
  };

  $scope.salvarVacinado = function () {
    $http.post("http://localhost:8080/cadastroVacina", {
      'idVacina': $scope.idVacina,
      'nomeDaVacina': $scope.nomeDaVacina,
      'emailUsuario': $scope.emailUsuario,
      'dataAplicacao': $scope.dataAplicacao

    }).then(resposta => {
      Swal.fire('Ok !!', 'Vacinação registrada com sucesso!!', 'success')
    }).catch(erro => {

      Swal.fire('Erro !!', 'Erro 400!', 'error')

    })
  };
});