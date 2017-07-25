angular.module('menuNavegacion', []).component('menuNavegacion', {
  templateUrl: 'menuNavegacion/menuNavegacion.template.html',
  controller: function NavegadorController($scope)
    {
        this.buttonClicked = function(value) {
          this.activeButton = value;
          this.onEntryChanged({entryValue:value});
        };

        this.$onInit = function() {
          this.activeButton = this.menuEntries[0].value;
          this.onEntryChanged({entryValue:this.activeButton});
        }
    },
    bindings : {
      menuEntries : '<',
      onEntryChanged : '&'
    }
});
