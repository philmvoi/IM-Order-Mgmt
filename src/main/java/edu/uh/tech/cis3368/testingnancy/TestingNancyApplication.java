package edu.uh.tech.cis3368.testingnancy;

import edu.uh.tech.cis3368.testingnancy.Entities.*;
import edu.uh.tech.cis3368.testingnancy.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.plaf.nimbus.State;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class TestingNancyApplication implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    CustomerStatusRepository customerStatusRepository;

    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @Autowired
    StateProvinceRepository stateProvinceRepository;


    public static void main(String[] args) {
        SpringApplication.run(TestingNancyApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        addCustomer();




    }


    private void addCustomer() {
        Country country = countryRepository.findByIdentity(1);

        CustomerType customerType = customerTypeRepository.findByIdentity(1) ;

        CustomerStatus customerStatus = customerStatusRepository.findByIdentity(1);

        StateProvince stateProvince = stateProvinceRepository.findByIdentity(43);


        Customer customer = new Customer();
        customer.setCountryId(country.getCountryId());
        customer.setCustomerStatusId(customerStatus.getCustomerStatusId());
        customer.setCustomerTypeId(customerType.getCustomerTypeId());
        customer.setStateProvinceId(stateProvince.getStateProvinceId());
        customer.setCustomerFirstName("Jack");
        customer.setCustomerLastName("Joseph");
        customer.setCustomerCity("Houston");
        customer.setCustomerEmail("jjoseph@yahoo.com");
        customer.setCustomerPhoneNumber("(832)-832-71777");
        customer.setCustomerStreetAddress("323 Kirkland Lane");
        customer.setCustomerZipcode("77004");



        Set<Customer> customers = new HashSet<>();
        customers.add(customer);



        country.setCustomers(customers);

        customerType.setCustomers(customers);

        customerStatus.setCustomers(customers);
        stateProvince.setCustomers(customers);

        customerRepository.save(customer);




        System.out.println(country.getCountryName() + " " + customerType.getCustomerType() + " "
                + customer.getCustomerFirstName() + " " + customer.getCustomerLastName());


    }
}

