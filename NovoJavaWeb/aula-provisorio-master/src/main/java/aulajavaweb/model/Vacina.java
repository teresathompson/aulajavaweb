package aulajavaweb.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import aulajavaweb.model.enums.FabricanteVacina;
import aulajavaweb.model.enums.TipoVacina;

@Entity
@XmlRootElement
public class Vacina implements Model {
	
	@Id
	private Integer id;
	private String nome;
	private TipoVacina tipoVacina;
	private FabricanteVacina fabricante;
	private String lote;
	private Date dataVencimento;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoVacina getTipoVacina() {
		return tipoVacina;
	}
	
	public void setTipoVacina(TipoVacina tipoVacina) {
		this.tipoVacina = tipoVacina;
	}
	
	public FabricanteVacina getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(FabricanteVacina fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getLote() {
		return lote;
	}
	
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	public Date getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
}
