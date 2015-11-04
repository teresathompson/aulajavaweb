function montaComboBox(resp) {
	var str = '<select>'; 
	
	str += '<option></option>';
		for(var key in resp) {
		str += '<option>' + resp[key] + '</option>';
		}
	
	str += '</select>';
	$('body').append(str);
}