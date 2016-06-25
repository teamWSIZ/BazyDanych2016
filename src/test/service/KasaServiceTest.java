package service;

import static org.junit.Assert.*;

/**
 * Created on 25.06.16, at 09:44
 */


import model.Persona;
import model.PersonaRe;
import model.SnapshotRe;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void testAddPerson() throws Exception {
        personaRe.save(Persona.builder().name("XXXTest").money(10).pass("123").build());
        Persona p = personaRe.findByNameStartsWith("XXXT").get(0);
        assertThat(p.getMoney()).isEqualTo(10);

    }
}