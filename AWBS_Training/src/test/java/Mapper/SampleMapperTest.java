package Mapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleMapperTest {

    @Test
    void test_insert() {
        //given
        GivenSampleMessage sampleMessage = new GivenSampleMessage(1L, "Aubrey", 23L, "Female");

        //when
        SampleMapper mapper = new SampleMapper();
        Person actual = mapper.map(sampleMessage, null);

        //then
        assertEquals(1L, actual.getMessageId());
        assertEquals("Aubrey", actual.getName());
        assertEquals(false, actual.getSeniorCitizen()); //REQ: if below 60 then false
        assertEquals("Black", actual.getGenderColor()); //REQ: if sampleMessage.gender is Female then Black
    }

    @Test
    void test_update() {
        //given
        GivenSampleMessage sampleMessage = new GivenSampleMessage(1L, "Aubs", 61L, "Male");

        //when
        SampleMapper mapper = new SampleMapper();
        Person actual = mapper.map(sampleMessage, buildTobeUpdatedPerson());

        //then
        assertEquals(buildTobeUpdatedPerson(), actual);
        assertEquals(1L, actual.getMessageId());
        assertEquals("Aubs", actual.getName());
        assertEquals(false, actual.getSeniorCitizen()); //REQ: if below 60 then false else true
        assertEquals("Pink", actual.getGenderColor()); //REQ: if sampleMessage.gender is Male then OBlack
    }

    private Person buildTobeUpdatedPerson() {
        Person person = new Person();
        person.setMessageId(1L);
        person.setName("Aubrey");
        person.setSeniorCitizen(false);
        person.setGenderColor("Black");

        return person;
    }
}