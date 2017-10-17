package uk.co.codingadventure.springbootwebapp.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"uk.co.codingadventure.springbootwebapp.domain"})
@EnableJpaRepositories(basePackages = {"uk.co.codingadventure.springbootwebapp.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
	
}