package edu.dws.ejemploWeb.Web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebConfiguracionContexto {

	@Bean
    public ViewResolver mapeo() {
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix("/vistas/");
        irvr.setSuffix(".jsp");
        return irvr;
    }
}
