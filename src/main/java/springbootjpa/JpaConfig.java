/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbootjpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author sihai
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "springbootjpa")
@EntityScan(basePackages="springbootjpa")
@Configuration
public class JpaConfig {

    @Bean
    PersistenceExceptionTranslationPostProcessor ex() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
