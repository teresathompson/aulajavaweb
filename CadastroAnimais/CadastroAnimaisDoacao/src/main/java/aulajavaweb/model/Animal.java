package aulajavaweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import aulajavaweb.model.enums.Especie;
import aulajavaweb.model.enums.RacaCao;
import aulajavaweb.model.enums.Sexo;
import aulajavaweb.model.enums.Temperamento;

@Entity
@XmlRootElement
public class Animal implements Model {
	
	@Id
	private Integer id;
	private String nomeAnimal;
	private Tutor nome;
	private Especie especie;
	private RacaCao raca;
	private Sexo sexo;
	private Integer meses;
	private Temperamento temperamento;
	private String pelagem;
	// em gramas
	private Integer peso;
	private HistoricoMedico historicoMedico;	
	
	@Override
	public Integer getId() {
		return id;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public RacaCao getRaca() {
		return raca;
	}

	public void setRaca(RacaCao raca) {
		this.raca = raca;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Integer getMeses() {
		return meses;
	}

	public void setMeses(Integer meses) {
		this.meses = meses;
	}

	public Temperamento getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(Temperamento temperamento) {
		this.temperamento = temperamento;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public HistoricoMedico getHistoricoMedico() {
		return historicoMedico;
	}

	public void setHistoricoMedico(HistoricoMedico historicoMedico) {
		this.historicoMedico = historicoMedico;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public Tutor getNome() {
		return nome;
	}

	public void setNome(Tutor nome) {
		this.nome = nome;
	}
	
}
