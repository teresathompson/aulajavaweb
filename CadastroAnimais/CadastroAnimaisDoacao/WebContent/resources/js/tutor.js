var view2 = {
	
		tipotutor: ko.observableArray(),
		estado: ko.observableArray()
		
	
};
ko.applyBindings(view2);

$(function() {
	
	$.ajax({url:'http://localhost:8080/aulajavaweb/rest/tipotutor',
			 // Whether this is a POST or GET request
		    type: "GET",
		 
		    // The type of data we expect back
		    dataType : "json",
			
	
		      success: function(msg) {
			
				view2.tipotutor(msg);
			}, error:function(jqXHR, status) {
				alert('Falha' + status);
			}});
	
	$.ajax({url:'http://localhost:8080/aulajavaweb/rest/estado',
		 // Whether this is a POST or GET request
	    type: "GET",
	 
	    // The type of data we expect back
	    dataType : "json",
		

	      success: function(msg) {
		
			view2.estado(msg);
		}, error:function(jqXHR, status) {
			alert('Falha' + status);
		}});

	
	

});

