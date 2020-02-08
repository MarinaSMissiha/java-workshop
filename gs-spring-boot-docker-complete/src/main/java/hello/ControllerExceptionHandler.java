package hello;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

	  private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	  @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	  @ExceptionHandler(CountryNotFoundException.class)
	  public void handleNotFound(CountryNotFoundException ex) {
		  LOGGER.error("INVALID_COUNTRY_CODE");
	  }
	  
	  @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	  @ExceptionHandler(SQLException.class)
	  public void handleDatabaseDown() {
		  LOGGER.error("INTERNAL_ERROR");
	  }
}
