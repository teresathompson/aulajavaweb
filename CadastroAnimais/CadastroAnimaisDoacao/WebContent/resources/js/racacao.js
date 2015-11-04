function racaCao() {
	
	var data = new FormData();
	$('input').each(function(i) {
		var attr = $('input')[i]; 
		data.append(attr.name, attr.value);
	});
	
	$.ajax({
		url: 'http://localhost:8080/aulajavaweb/rest/racacao',  
		method: 'GET',
		success: success,
		fail: fail
	}
	);
};