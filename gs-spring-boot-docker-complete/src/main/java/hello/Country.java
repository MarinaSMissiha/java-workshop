package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	private String code;
	private String name;
	private String continent;
	private String region;
	private double surface_area;
	private int indep_year;
	private int population;
	private double life_expectancy;
	private int gnp;
	private int gnp_old;
    private String local_name;
    private String government_form;
    private String head_of_state;
    private int capital;
	private String code2;
	
	@Id
	@Column(name="code")
	public String getCode() {
		return code;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	
	@Column(name="continent")
	public String getContinent() {
		return continent;
	}
	
	@Column(name="region")
	public String getRegion() {
		return region;
	}
	
	@Column(name="surface_area")
	public double getSurface_area() {
		return surface_area;
	}
	
	@Column(name="indep_year")
	public int getIndep_year() {
		return indep_year;
	}
	
	@Column(name="population")
	public int getPopulation() {
		return population;
	}
	
	@Column(name="life_expectancy")
	public double getLife_expectancy() {
		return life_expectancy;
	}
	
	@Column(name="gnp")
	public int getGnp() {
		return gnp;
	}
	
	@Column(name="gnp_old")
	public int getGnp_old() {
		return gnp_old;
	}
	
	@Column(name="local_name")
	public String getLocal_name() {
		return local_name;
	}
	
	@Column(name="government_form")
	public String getGovernment_form() {
		return government_form;
	}
	
	@Column(name="head_of_state")
	public String getHead_of_state() {
		return head_of_state;
	}
	
	@Column(name="capital")
	public int getCapital() {
		return capital;
	}
	
	@Column(name="code2")
	public String getCode2() {
		return code2;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setSurface_area(double surface_area) {
		this.surface_area = surface_area;
	}

	public void setIndep_year(int indep_year) {
		this.indep_year = indep_year;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setLife_expectancy(double life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public void setGnp(int gnp) {
		this.gnp = gnp;
	}

	public void setGnp_old(int gnp_old) {
		this.gnp_old = gnp_old;
	}

	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}

	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}

	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

}
