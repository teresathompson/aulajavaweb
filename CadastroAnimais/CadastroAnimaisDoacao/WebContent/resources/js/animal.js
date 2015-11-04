
var view = {
	
		listaanimais: ko.observableArray(),
		sexo: ko.observableArray(),
		racacao: ko.observableArray(),
		temperamento: ko.observableArray()
	
};
ko.applyBindings(view);

$(function() {
	
	$.ajax({url:'http://localhost:8080/aulajavaweb/rest/especie',
			 // Whether this is a POST or GET request
		    type: "GET",
		 
		    // The type of data we expect back
		    dataType : "json",
			
	
		      success: function(msg) {
			
				view.listaanimais(msg);
			}, error:function(jqXHR, status) {
				alert('Falha' + status);
			}});
	
	$.ajax({url:'http://localhost:8080/aulajavaweb/rest/racacao',
		 // Whether this is a POST or GET request
	    type: "GET",
	 
	    // The type of data we expect back
	    dataType : "json",
		

	      success: function(msg) {
		
			view.racacao(msg);
		}, error:function(jqXHR, status) {
			alert('Falha' + status);
		}});

	
	$.ajax({url:'http://localhost:8080/aulajavaweb/rest/sexo',
		 // Whether this is a POST or GET request
	    type: "GET",
	 
	    // The type of data we expect back
	    dataType : "json",
		

	      success: function(msg) {
		
			view.sexo(msg);
		}, error:function(jqXHR, status) {
			alert('Falha' + status);
		}});

	$.ajax({url:'http://localhost:8080/aulajavaweb/rest/temperamento',
		 // Whether this is a POST or GET request
	    type: "GET",
	 
	    // The type of data we expect back
    dataType : "json",
		
	      success: function(msg) {
		
			view.temperamento(msg);
		}, error:function(jqXHR, status) {
			alert('Falha' + status);
		}});


});

