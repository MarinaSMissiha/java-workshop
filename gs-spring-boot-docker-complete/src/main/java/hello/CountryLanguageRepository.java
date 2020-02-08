package hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage,String> {

	CountryLanguage findByCountryCode(String country_code);

}
