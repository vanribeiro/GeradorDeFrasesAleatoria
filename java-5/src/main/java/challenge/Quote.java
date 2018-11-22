package challenge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="scripts")
@Table(name="scripts")
public class Quote {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;

	private String actor;
	private String detail;
	
	public Quote() {
		
	}
	
	public Quote(String actor) {
		this.actor = actor;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return detail;
	}

	public void setQuote(String quote) {
		this.detail = quote;
	}

}