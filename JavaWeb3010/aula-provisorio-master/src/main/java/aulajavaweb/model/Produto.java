package aulajavaweb.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto implements Model {
	
	private Integer id;
	private String name;
	
	public Produto() {
	}
	
	private Produto(Builder b) {
		id = b.id;
		name = b.name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static final class Builder {
		
		private Integer id;
		private String name;
		
		private Builder() {
		}
		
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Produto build() {
			return new Produto(this);
		}
		
	}
	
}
