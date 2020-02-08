package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class Controller {

	@Autowired
	CountryRepository countryRep;
	
	@Autowired
	CountryLanguageRepository countryLangRep;
	
	@GetMapping("/{code}")
    public CountryInfo onResRequest(@PathVariable(value = "code") String code){
       
    	CountryInfo countryInfo = new CountryInfo();
    	
    	Country country = countryRep.findByCode(code);
    	CountryLanguage countryLang = countryLangRep.findByCountryCode(code);
    	
    	if (country == null || countryLang == null)
    		throw new CountryNotFoundException();
    	
    	countryInfo.setName(country.getName());
    	countryInfo.setPopulation(country.getPopulation());
    	countryInfo.setContinent(country.getContinent());
    	countryInfo.setLife_expectancy(country.getLife_expectancy());
    	countryInfo.setCountry_language(countryLang.getLanguage());
    		
        return countryInfo;
    }

}
