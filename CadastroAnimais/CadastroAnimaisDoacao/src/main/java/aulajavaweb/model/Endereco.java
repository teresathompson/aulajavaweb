package aulajavaweb.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import javax.xml.bind.annotation.XmlRootElement;

import aulajavaweb.model.enums.Estado;

@XmlRootElement
public class Endereco implements Model {

	@Id
	private Integer id;

	@Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Enumerated(EnumType.STRING)
	private Estado estado;

	private String cidade;

	private String logradouro;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}