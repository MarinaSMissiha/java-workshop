package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	
	private long id;
	private String name;
	private String countryCode;
	private String district;
	private int population;	
	
	@Id
	@Column(name="id")
	public long getId() {
		return id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	
	@Column(name="country_code")
	public String getCountryCode() {
		return countryCode;
	}
	
	@Column(name="district")
	public String getDistrict() {
		return district;
	}
	
	@Column(name="population")
	public int getPopulation() {
		return population;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
}
