package hello;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
public class ControllerTest {
	
  private MockMvc mockMvc;
  
  @MockBean 
  private CountryRepository cp;

  @Test
  public void countryNotFound() throws Exception {
    when(cp.findByCode("xxx")).thenReturn(null);
    mockMvc.perform(get("/xxx") 
          .accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isNotFound());
  }
  
}  