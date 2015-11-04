package aulajavaweb.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

import aulajavaweb.model.enums.FabricanteVermifugo;
import aulajavaweb.model.enums.TipoVermifugo;

@Entity
@XmlRootElement
public class Vermifugo implements Model {

	private Integer id;
	private Date dataVencimento;
	private TipoVermifugo tipo;
	private FabricanteVermifugo fabricante;

	@Override
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public TipoVermifugo getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoVermifugo tipo) {
		this.tipo = tipo;
	}
	
	public FabricanteVermifugo getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(FabricanteVermifugo fabricante) {
		this.fabricante = fabricante;
	}
	
}
