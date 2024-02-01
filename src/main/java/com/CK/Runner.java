package com.CK;

import com.CK.entity.*;
import com.CK.repository.*;
import com.CK.utility.enums.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        BaseEntity be = new BaseEntity();
        be.setCreateat(System.currentTimeMillis());
        be.setUpdateat(System.currentTimeMillis());

        Competitors competitors1 = Competitors.builder()
                .name("Aegnora")
                .surname("Mirac")
                .gender(Gender.MALE)
                .baseEntity(be)
                .point(20)
                .build();
        Competitors competitors2 = Competitors.builder()
                .name("Kubisla")
                .surname("Eksi")
                .gender(Gender.MALE)
                .baseEntity(be)
                .point(10)
                .build();
        Competitors competitors3 = Competitors.builder()
                .name("Batisbat")
                .surname("Eksi")
                .gender(Gender.MALE)
                .baseEntity(be)
                .point(0)
                .build();

        new CompetitorsRepository().save(competitors1);
        new CompetitorsRepository().save(competitors2);
        new CompetitorsRepository().save(competitors3);

        Address address1 = Address.builder()
                .city("Istanbul")
                .town("Besiktas")
                .phone("123456789")
                .mail("a@a.com")
                .country("Turkey")
                .competitors(competitors1)
                .build();
        Address address2 = Address.builder()
                .city("Istanbul")
                .town("Acibadem")
                .phone("123456789")
                .mail("b@b.com")
                .country("Turkey")
                .competitors(competitors2)
                .build();
        Address address3 = Address.builder()
                .city("Istanbul")
                .town("Acibadem")
                .phone("123456789")
                .mail("b@b.com")
                .country("Turkey")
                .competitors(competitors3)
                .build();

        competitors1.setAddress(address1);
        competitors2.setAddress(address2);
        competitors3.setAddress(address3);

        new AddressRepository().save(address1);
        new AddressRepository().save(address2);
        new AddressRepository().save(address3);

        Vowels vowels1 = Vowels.builder()
                .fullName("Sezen Aksu")
                .imageUrl("https://upload.wikimedia.org/wikipedia/commons/8/8a/Sezen_Aksu.jpg")
                .baseEntity(be)
                .build();
        Vowels vowels2 = Vowels.builder()
                .fullName("Serdar Ortac")
                .imageUrl("https://upload.wikimedia.org/wikipedia/commons/8/8a/Serdar_Ortac.jpg")
                .baseEntity(be)
                .build();
        Vowels vowels3 = Vowels.builder()
                .fullName("Haluk Levent")
                .imageUrl("https://upload.wikimedia.org/wikipedia/commons/8/8a/Haluk_Levent.jpg")
                .baseEntity(be)
                .build();

        new VowelsRepository().save(vowels1);
        new VowelsRepository().save(vowels2);
        new VowelsRepository().save(vowels3);

        Characteristics characteristics1 = Characteristics.builder()
                .age(69)
                .gender(Gender.FEMALE)
                .eyeColor("brown")
                .hairColor("yellow")
                .skinColor("light brown")
                .height(171)
                .weight(70)
                .vowels(vowels1)
                .build();
        Characteristics characteristics2 = Characteristics.builder()
                .age(53)
                .gender(Gender.MALE)
                .eyeColor("brown")
                .hairColor("black")
                .skinColor("light brown")
                .height(168)
                .weight(78)
                .vowels(vowels2)
                .build();
        Characteristics characteristics3 = Characteristics.builder()
                .age(55)
                .gender(Gender.MALE)
                .eyeColor("brown")
                .hairColor("black")
                .skinColor("brown")
                .height(180)
                .weight(84)
                .vowels(vowels3)
                .build();

        vowels1.setCharacteristics(characteristics1);
        vowels2.setCharacteristics(characteristics2);
        vowels3.setCharacteristics(characteristics3);

        new CharacteristicsRepository().save(characteristics1);
        new CharacteristicsRepository().save(characteristics2);
        new CharacteristicsRepository().save(characteristics3);

        ArrayList<Characteristics> characteristicsList = new ArrayList<>();
        characteristicsList.add(characteristics1);
        characteristicsList.add(characteristics2);
        characteristicsList.add(characteristics3);

        HashMap<Long, String> answersQ1 = new HashMap<>();
        answersQ1.put(competitors1.getId(), "Answer1");
        answersQ1.put(competitors2.getId(), "Answer1");
        answersQ1.put(competitors3.getId(), "Answer1");

        HashMap<Long, String> answersQ2 = new HashMap<>();
        answersQ2.put(competitors1.getId(), "Answer2");
        answersQ2.put(competitors2.getId(), "Answer2");
        answersQ2.put(competitors3.getId(), "Answer2");

        HashMap<Long, String> answersQ3 = new HashMap<>();
        answersQ3.put(competitors1.getId(), "Answer3");
        answersQ3.put(competitors2.getId(), "Answer3");
        answersQ3.put(competitors3.getId(), "Answer3");

        Random random = new Random();

        Questions questions1 = Questions.builder()
                .characteristics(characteristicsList.get(random.nextInt(characteristicsList.size()-1)))
                .competitorAnswers(answersQ1)
                .sure(15)
                .build();
        Questions questions2 = Questions.builder()
                .characteristics(characteristicsList.get(random.nextInt(characteristicsList.size()-1)))
                .competitorAnswers(answersQ2)
                .sure(12)
                .build();
        Questions questions3 = Questions.builder()
                .characteristics(characteristicsList.get(random.nextInt(characteristicsList.size()-1)))
                .competitorAnswers(answersQ3)
                .sure(22)
                .build();

        new QuestionRepository().save(questions1);
        new QuestionRepository().save(questions2);
        new QuestionRepository().save(questions3);
    }
}
