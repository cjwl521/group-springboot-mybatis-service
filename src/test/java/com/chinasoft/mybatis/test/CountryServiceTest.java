package com.chinasoft.mybatis.test;

import com.chinasoft.mybatis.MybatisApplication;
import com.chinasoft.mybatis.model.Country;
import com.chinasoft.mybatis.service.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author liuzh
 * @since 2017/9/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Import(MybatisApplication.class)
public class CountryServiceTest {

    @Autowired
    private CountryService countryService;

    @Test
    public void test() {
        Country country = new Country();
        List<Country> all = countryService.getAll(country);
        for (Country c : all) {
            System.out.println(c.getCountryname());
        }
    }
}
