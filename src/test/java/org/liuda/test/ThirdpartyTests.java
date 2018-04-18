package org.liuda.test;

import org.liuda.domain.Thirdparty;
import org.liuda.domain.dto.CreateThirdpartyDto;
import org.liuda.domain.dto.ResponseDto;
import org.liuda.domain.service.ThirdpartyService;
import org.liuda.repository.ThirdpartyRepository;
import org.liuda.Application;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

// @SpringBootTest(classes = ThirdpartyRepository.class)
@RunWith(SpringRunner.class)
// @ContextConfiguration(classes = {ThirdpartyService.class})
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
//@Transactional(propagation = Propagation.NOT_SUPPORTED)
// @Transactional(propagation = Propagation.NOT_SUPPORTED)
public class ThirdpartyTests {
    @Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    private ThirdpartyRepository repository;

    // @Autowired
    // private ThirdpartyService service;

    @Test
    public void testCreate() throws Exception {
        Thirdparty item = new Thirdparty();
        item.setName("Test_Third");
        item.setCode("TEST001");
        this.entityManager.persist(item);

        List<Thirdparty> result = repository.findAll();
    
        assertThat(result.isEmpty()).isFalse();
        assertThat(result.size()).isEqualTo(1);

        Thirdparty byCodeResult = repository.findByCode("TEST001");
        assertThat(byCodeResult.getName()).isEqualTo("Test_Third");
    }

    // @Test
    // public void testCreateService() throws Exception {
    //     CreateThirdpartyDto dto = new CreateThirdpartyDto();
    //     dto.setCode("00001");
    //     dto.setName("Test0001");

    //     ResponseDto result = service.create(dto);
    //     assertThat(result.getData()).isNotNull();
    // }
}