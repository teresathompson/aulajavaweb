function animal() {
	var data = new FormData();
	$('input').each(function(i) {
		var attr = $('input')[i]; 
		data.append(attr.name, attr.value);
	});
	
	ajax(
		'http://localhost:8080/aulajavaweb/rest/animal',
		'GET',
		undefined,
		undefined,
		function(msg) {
			alert(msg);
		},
		function(jqXHR, status) {
			alert('Falha' + status);
		}
	);
};


