package univ.rouen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by valentin on 4/18/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"urouen.STB.controller"})
public class AppConfig {
}
