package com.test.Service

import com.Customer
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import javax.inject.Inject

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 3:41 PM
 */
@ContextConfiguration(classes = [com.GroovyConfig.class])
class CustomerSpec extends Specification {
    @Inject
    Customer customer

    def "test customer"() {
        when:
        def i = 0;
        then:
        customer.toString().equals('Akhil Shastri');
//        assert 1==1;//customer.toString().equals('Akhil Shastri');
    }
}