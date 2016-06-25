package service;

import static org.junit.Assert.*;

/**
 * Created on 25.06.16, at 09:44
 */


import model.Persona;
import model.PersonaRe;
import model.SnapshotRe;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * Testy wykorzystujące pełny spring-context w tym działające na bazach danych.
 *
 * ToDo: testy __działają narazie na bazie produkcyjnej__; powinny mieć osobną in-memory DB setupowaną przed testem.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class KasaServiceTest {
    @Autowired
    KasaService testee;         //tą klasę będzymy testowali
    @Autowired
    PersonaRe personaRe;        //te beany się przydadzą do setupu testów
    @Autowired
    SnapshotRe snapshotRe;

    @Before
    public void setUp() throws Exception {
        personaRe.save(Persona.builder().name("XXXTest1").money(10).pass("123").build());
        personaRe.save(Persona.builder().name("XXXTest2").money(10).pass("123").build());
        personaRe.save(Persona.builder().name("XXXTest3").money(10).pass("123").build());
    }

    @After
    public void tearDown() throws Exception {
        List<Persona> toDelete = new ArrayList<>();
        for(Persona p : personaRe.findAll()) {
            if (p.getName().startsWith("XXX")) toDelete.add(p);
        }
        personaRe.delete(toDelete);
    }

    @Test
    public void testAddPerson() throws Exception {
        personaRe.save(Persona.builder().name("YYYT").money(11).build());
        Persona p = personaRe.findByNameStartsWith("YYYT").get(0);
        assertThat(p.getMoney()).isEqualTo(11);
    }

}