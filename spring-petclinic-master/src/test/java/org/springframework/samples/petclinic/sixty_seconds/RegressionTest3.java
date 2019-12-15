package org.springframework.samples.petclinic.sixty_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        String str2 = pet1.toString();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet1.getType();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet1.getOwner();
        pet1.setName("");
        org.springframework.samples.petclinic.owner.Owner owner7 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate9 = pet8.getBirthDate();
        String str10 = pet8.getName();
        owner7.addPet(pet8);
        org.springframework.samples.petclinic.visit.Visit visit12 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int13 = visit12.getPetId();
        pet8.addVisit(visit12);
        java.time.LocalDate localDate15 = pet8.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit16 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int17 = visit16.getPetId();
        java.time.LocalDate localDate18 = null;
        visit16.setDate(localDate18);
        java.time.LocalDate localDate20 = null;
        visit16.setDate(localDate20);
        pet8.addVisit(visit16);
        pet1.addVisit(visit16);
        String str24 = pet1.toString();
        pet1.setName("");
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        String str28 = pet27.toString();
        java.time.LocalDate localDate29 = null;
        pet27.setBirthDate(localDate29);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        String str32 = pet31.toString();
        java.time.LocalDate localDate33 = null;
        pet31.setBirthDate(localDate33);
        org.springframework.samples.petclinic.owner.Owner owner35 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet36 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate37 = pet36.getBirthDate();
        String str38 = pet36.getName();
        owner35.addPet(pet36);
        org.springframework.samples.petclinic.visit.Visit visit40 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int41 = visit40.getPetId();
        pet36.addVisit(visit40);
        Integer int43 = visit40.getPetId();
        Integer int44 = visit40.getPetId();
        boolean boolean45 = visit40.isNew();
        Integer int46 = visit40.getId();
        String str47 = visit40.getDescription();
        pet31.addVisit(visit40);
        visit40.setDescription("hi!");
        pet27.addVisit(visit40);
        String str52 = pet27.toString();
        org.springframework.samples.petclinic.owner.Pet pet53 = new org.springframework.samples.petclinic.owner.Pet();
        String str54 = pet53.toString();
        boolean boolean55 = pet53.isNew();
        String str56 = pet53.getName();
        org.springframework.samples.petclinic.visit.Visit visit57 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int58 = visit57.getPetId();
        visit57.setDescription("");
        visit57.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner63 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet64 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate65 = pet64.getBirthDate();
        String str66 = pet64.getName();
        owner63.addPet(pet64);
        org.springframework.samples.petclinic.visit.Visit visit68 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int69 = visit68.getPetId();
        pet64.addVisit(visit68);
        Integer int71 = visit68.getPetId();
        Integer int72 = visit68.getPetId();
        boolean boolean73 = visit68.isNew();
        Integer int74 = visit68.getId();
        java.time.LocalDate localDate75 = visit68.getDate();
        visit57.setDate(localDate75);
        pet53.setBirthDate(localDate75);
        pet27.setBirthDate(localDate75);
        pet1.setBirthDate(localDate75);
        org.springframework.validation.Errors errors80 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) localDate75, errors80);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.time.LocalDate cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.time.LocalDate is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate75);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getCity();
        String str5 = owner0.getLastName();
        String str6 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        java.time.LocalDate localDate5 = pet1.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet1.getType();
        pet1.setName("");
        org.springframework.samples.petclinic.owner.Owner owner9 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = pet10.getBirthDate();
        String str12 = pet10.getName();
        owner9.addPet(pet10);
        org.springframework.samples.petclinic.visit.Visit visit14 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int15 = visit14.getPetId();
        pet10.addVisit(visit14);
        Integer int17 = visit14.getPetId();
        Integer int18 = visit14.getPetId();
        String str19 = visit14.getDescription();
        java.time.LocalDate localDate20 = visit14.getDate();
        java.time.LocalDate localDate21 = visit14.getDate();
        pet1.addVisit(visit14);
        org.springframework.samples.petclinic.owner.PetType petType23 = pet1.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType23);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        owner0.setCity("");
        Integer int11 = owner0.getId();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        pet12.setName("hi!");
        pet12.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository18 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter19 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository18);
        org.springframework.samples.petclinic.owner.PetRepository petRepository20 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter21 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository20);
        org.springframework.samples.petclinic.owner.PetType petType22 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale23 = null;
        String str24 = petTypeFormatter21.print(petType22, locale23);
        org.springframework.samples.petclinic.owner.PetRepository petRepository25 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter26 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository25);
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale28 = null;
        String str29 = petTypeFormatter26.print(petType27, locale28);
        org.springframework.samples.petclinic.owner.PetType petType30 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale31 = null;
        String str32 = petTypeFormatter26.print(petType30, locale31);
        java.util.Locale locale33 = null;
        String str34 = petTypeFormatter21.print(petType30, locale33);
        java.util.Locale locale35 = null;
        String str36 = petTypeFormatter19.print(petType30, locale35);
        pet12.setType(petType30);
        org.springframework.samples.petclinic.owner.Owner owner38 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet39 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate40 = pet39.getBirthDate();
        String str41 = pet39.getName();
        owner38.addPet(pet39);
        org.springframework.samples.petclinic.owner.Pet pet43 = new org.springframework.samples.petclinic.owner.Pet();
        String str44 = pet43.toString();
        java.time.LocalDate localDate45 = null;
        pet43.setBirthDate(localDate45);
        String str47 = pet43.getName();
        org.springframework.samples.petclinic.owner.Owner owner48 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet49 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate50 = pet49.getBirthDate();
        String str51 = pet49.getName();
        owner48.addPet(pet49);
        org.springframework.samples.petclinic.visit.Visit visit53 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int54 = visit53.getPetId();
        pet49.addVisit(visit53);
        Integer int56 = visit53.getPetId();
        String str57 = visit53.getDescription();
        java.time.LocalDate localDate58 = visit53.getDate();
        pet43.addVisit(visit53);
        java.time.LocalDate localDate60 = pet43.getBirthDate();
        java.time.LocalDate localDate61 = pet43.getBirthDate();
        owner38.addPet(pet43);
        pet43.setName("");
        org.springframework.samples.petclinic.owner.Owner owner65 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet66 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate67 = pet66.getBirthDate();
        String str68 = pet66.getName();
        owner65.addPet(pet66);
        org.springframework.samples.petclinic.owner.Pet pet70 = new org.springframework.samples.petclinic.owner.Pet();
        String str71 = pet70.toString();
        owner65.addPet(pet70);
        org.springframework.samples.petclinic.owner.Owner owner73 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet74 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate75 = pet74.getBirthDate();
        String str76 = pet74.getName();
        owner73.addPet(pet74);
        org.springframework.samples.petclinic.visit.Visit visit78 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int79 = visit78.getPetId();
        pet74.addVisit(visit78);
        visit78.setDescription("");
        java.time.LocalDate localDate83 = visit78.getDate();
        pet70.setBirthDate(localDate83);
        pet43.setBirthDate(localDate83);
        pet12.setBirthDate(localDate83);
        owner0.addPet(pet12);
        owner0.setCity("hi!");
        boolean boolean90 = owner0.isNew();
        String str91 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "hi!" + "'", str91.equals("hi!"));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        Integer int8 = visit5.getPetId();
        Integer int9 = visit5.getPetId();
        boolean boolean10 = visit5.isNew();
        Integer int11 = visit5.getId();
        java.time.LocalDate localDate12 = visit5.getDate();
        visit5.setDescription("hi!");
        java.time.LocalDate localDate15 = null;
        visit5.setDate(localDate15);
        visit5.setDescription("hi!");
        visit5.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("hi!");
        owner0.setFirstName("");
        String str8 = owner0.getAddress();
        owner0.setCity("hi!");
        String str11 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        String str6 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        owner0.setAddress("");
        owner0.setFirstName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        boolean boolean4 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        java.time.LocalDate localDate16 = null;
        pet14.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate20 = pet19.getBirthDate();
        String str21 = pet19.getName();
        owner18.addPet(pet19);
        org.springframework.samples.petclinic.visit.Visit visit23 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int24 = visit23.getPetId();
        pet19.addVisit(visit23);
        Integer int26 = visit23.getPetId();
        Integer int27 = visit23.getPetId();
        boolean boolean28 = visit23.isNew();
        Integer int29 = visit23.getId();
        String str30 = visit23.getDescription();
        pet14.addVisit(visit23);
        pet0.addVisit(visit23);
        Class<?> wildcardClass33 = visit23.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate3 = pet2.getBirthDate();
        String str4 = pet2.getName();
        owner1.addPet(pet2);
        org.springframework.samples.petclinic.visit.Visit visit6 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int7 = visit6.getPetId();
        pet2.addVisit(visit6);
        Integer int9 = visit6.getPetId();
        Integer int10 = visit6.getPetId();
        boolean boolean11 = visit6.isNew();
        Integer int12 = visit6.getId();
        Integer int13 = visit6.getPetId();
        org.springframework.samples.petclinic.owner.Owner owner14 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate16 = pet15.getBirthDate();
        String str17 = pet15.getName();
        owner14.addPet(pet15);
        org.springframework.samples.petclinic.visit.Visit visit19 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int20 = visit19.getPetId();
        pet15.addVisit(visit19);
        Integer int22 = visit19.getPetId();
        String str23 = visit19.getDescription();
        Integer int24 = visit19.getPetId();
        java.time.LocalDate localDate25 = visit19.getDate();
        visit6.setDate(localDate25);
        visit6.setDescription("hi!");
        org.springframework.validation.Errors errors29 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) "hi!", errors29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.String is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        String str2 = owner1.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        String str4 = pet3.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet3.setType(petType5);
        String str7 = pet3.toString();
        owner1.addPet(pet3);
        owner1.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        String str12 = pet11.toString();
        boolean boolean13 = pet11.isNew();
        owner1.addPet(pet11);
        Integer int15 = owner1.getId();
        String str16 = owner1.getCity();
        String str17 = owner1.getAddress();
        boolean boolean18 = owner1.isNew();
        org.springframework.validation.Errors errors19 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) boolean18, errors19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getAddress();
        String str8 = owner0.getCity();
        owner0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        owner0.setTelephone("hi!");
        owner0.setLastName("");
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Owner owner14 = new org.springframework.samples.petclinic.owner.Owner();
        owner14.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        String str18 = pet17.toString();
        java.time.LocalDate localDate19 = null;
        pet17.setBirthDate(localDate19);
        String str21 = pet17.getName();
        owner14.addPet(pet17);
        owner0.addPet(pet17);
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        String str25 = pet24.toString();
        org.springframework.samples.petclinic.owner.PetType petType26 = null;
        pet24.setType(petType26);
        String str28 = pet24.toString();
        pet24.setId((Integer) 10);
        String str31 = pet24.toString();
        pet24.setId((Integer) 0);
        org.springframework.samples.petclinic.owner.Pet pet34 = new org.springframework.samples.petclinic.owner.Pet();
        String str35 = pet34.toString();
        org.springframework.samples.petclinic.owner.PetType petType36 = pet34.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository37 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter38 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository37);
        org.springframework.samples.petclinic.owner.PetType petType39 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale40 = null;
        String str41 = petTypeFormatter38.print(petType39, locale40);
        org.springframework.samples.petclinic.owner.PetType petType42 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale43 = null;
        String str44 = petTypeFormatter38.print(petType42, locale43);
        pet34.setType(petType42);
        org.springframework.samples.petclinic.owner.Owner owner46 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet47 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate48 = pet47.getBirthDate();
        String str49 = pet47.getName();
        owner46.addPet(pet47);
        org.springframework.samples.petclinic.visit.Visit visit51 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int52 = visit51.getPetId();
        pet47.addVisit(visit51);
        java.time.LocalDate localDate54 = visit51.getDate();
        pet34.setBirthDate(localDate54);
        org.springframework.samples.petclinic.owner.PetType petType56 = pet34.getType();
        petType56.setName("");
        pet24.setType(petType56);
        petType56.setName("hi!");
        pet17.setType(petType56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType56);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet2.getType();
        java.time.LocalDate localDate5 = pet2.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner6 = pet2.getOwner();
        String str7 = pet2.toString();
        pet2.setName("hi!");
        owner0.addPet(pet2);
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        String str12 = pet11.toString();
        org.springframework.samples.petclinic.owner.PetType petType13 = pet11.getType();
        org.springframework.samples.petclinic.owner.Owner owner14 = pet11.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner15 = pet11.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner16 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = pet17.getBirthDate();
        String str19 = pet17.getName();
        owner16.addPet(pet17);
        org.springframework.samples.petclinic.owner.Owner owner21 = pet17.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner22 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate24 = pet23.getBirthDate();
        String str25 = pet23.getName();
        owner22.addPet(pet23);
        org.springframework.samples.petclinic.visit.Visit visit27 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int28 = visit27.getPetId();
        pet23.addVisit(visit27);
        String str30 = visit27.getDescription();
        visit27.setPetId((Integer) (-1));
        pet17.addVisit(visit27);
        String str34 = visit27.getDescription();
        Integer int35 = visit27.getPetId();
        pet11.addVisit(visit27);
        java.time.LocalDate localDate37 = visit27.getDate();
        pet2.addVisit(visit27);
        String str39 = visit27.getDescription();
        org.springframework.samples.petclinic.visit.Visit visit40 = new org.springframework.samples.petclinic.visit.Visit();
        org.springframework.samples.petclinic.owner.Owner owner41 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet42 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate43 = pet42.getBirthDate();
        String str44 = pet42.getName();
        owner41.addPet(pet42);
        org.springframework.samples.petclinic.visit.Visit visit46 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int47 = visit46.getPetId();
        pet42.addVisit(visit46);
        java.time.LocalDate localDate49 = visit46.getDate();
        visit40.setDate(localDate49);
        java.time.LocalDate localDate51 = visit40.getDate();
        org.springframework.samples.petclinic.owner.Pet pet52 = new org.springframework.samples.petclinic.owner.Pet();
        String str53 = pet52.toString();
        org.springframework.samples.petclinic.owner.PetType petType54 = null;
        pet52.setType(petType54);
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int57 = visit56.getPetId();
        java.time.LocalDate localDate58 = null;
        visit56.setDate(localDate58);
        org.springframework.samples.petclinic.visit.Visit visit60 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int61 = visit60.getPetId();
        java.time.LocalDate localDate62 = null;
        visit60.setDate(localDate62);
        java.time.LocalDate localDate64 = null;
        visit60.setDate(localDate64);
        visit60.setDescription("");
        visit60.setPetId((Integer) (-1));
        visit60.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner72 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet73 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate74 = pet73.getBirthDate();
        String str75 = pet73.getName();
        owner72.addPet(pet73);
        org.springframework.samples.petclinic.visit.Visit visit77 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int78 = visit77.getPetId();
        pet73.addVisit(visit77);
        java.time.LocalDate localDate80 = visit77.getDate();
        visit60.setDate(localDate80);
        visit56.setDate(localDate80);
        visit56.setDescription("");
        pet52.addVisit(visit56);
        java.time.LocalDate localDate86 = visit56.getDate();
        visit40.setDate(localDate86);
        visit27.setDate(localDate86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate86);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!", true);
        owner0.setTelephone("");
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        org.springframework.samples.petclinic.owner.PetType petType16 = pet14.getType();
        org.springframework.samples.petclinic.visit.Visit visit17 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int18 = visit17.getPetId();
        java.time.LocalDate localDate19 = null;
        visit17.setDate(localDate19);
        org.springframework.samples.petclinic.visit.Visit visit21 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int22 = visit21.getPetId();
        java.time.LocalDate localDate23 = null;
        visit21.setDate(localDate23);
        java.time.LocalDate localDate25 = null;
        visit21.setDate(localDate25);
        visit21.setDescription("");
        visit21.setPetId((Integer) (-1));
        visit21.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner33 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet34 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate35 = pet34.getBirthDate();
        String str36 = pet34.getName();
        owner33.addPet(pet34);
        org.springframework.samples.petclinic.visit.Visit visit38 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int39 = visit38.getPetId();
        pet34.addVisit(visit38);
        java.time.LocalDate localDate41 = visit38.getDate();
        visit21.setDate(localDate41);
        visit17.setDate(localDate41);
        pet14.setBirthDate(localDate41);
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        String str46 = pet45.toString();
        org.springframework.samples.petclinic.owner.PetType petType47 = null;
        pet45.setType(petType47);
        org.springframework.samples.petclinic.visit.Visit visit49 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int50 = visit49.getPetId();
        java.time.LocalDate localDate51 = null;
        visit49.setDate(localDate51);
        org.springframework.samples.petclinic.visit.Visit visit53 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int54 = visit53.getPetId();
        java.time.LocalDate localDate55 = null;
        visit53.setDate(localDate55);
        java.time.LocalDate localDate57 = null;
        visit53.setDate(localDate57);
        visit53.setDescription("");
        visit53.setPetId((Integer) (-1));
        visit53.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner65 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet66 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate67 = pet66.getBirthDate();
        String str68 = pet66.getName();
        owner65.addPet(pet66);
        org.springframework.samples.petclinic.visit.Visit visit70 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int71 = visit70.getPetId();
        pet66.addVisit(visit70);
        java.time.LocalDate localDate73 = visit70.getDate();
        visit53.setDate(localDate73);
        visit49.setDate(localDate73);
        visit49.setDescription("");
        pet45.addVisit(visit49);
        org.springframework.samples.petclinic.owner.Owner owner79 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet80 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate81 = pet80.getBirthDate();
        String str82 = pet80.getName();
        owner79.addPet(pet80);
        org.springframework.samples.petclinic.visit.Visit visit84 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int85 = visit84.getPetId();
        pet80.addVisit(visit84);
        visit84.setDescription("");
        java.time.LocalDate localDate89 = visit84.getDate();
        visit49.setDate(localDate89);
        pet14.setBirthDate(localDate89);
        org.springframework.samples.petclinic.owner.Owner owner92 = pet14.getOwner();
        owner0.addPet(pet14);
        String str94 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        String str10 = pet9.toString();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet9.setType(petType11);
        String str13 = pet9.getName();
        owner0.addPet(pet9);
        String str15 = owner0.getFirstName();
        owner0.setId((Integer) 100);
        String str18 = owner0.getFirstName();
        String str19 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        owner0.setCity("hi!");
        String str7 = owner0.getTelephone();
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner10.getPet("hi!");
        owner10.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet17 = owner10.getPet("hi!", true);
        owner10.setTelephone("");
        String str20 = owner10.getCity();
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        String str22 = pet21.toString();
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet21.setType(petType23);
        String str25 = pet21.getName();
        boolean boolean26 = pet21.isNew();
        String str27 = pet21.getName();
        owner10.addPet(pet21);
        owner0.addPet(pet21);
        org.springframework.samples.petclinic.owner.PetType petType30 = null;
        pet21.setType(petType30);
        org.springframework.samples.petclinic.owner.Owner owner32 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate34 = pet33.getBirthDate();
        String str35 = pet33.getName();
        owner32.addPet(pet33);
        org.springframework.samples.petclinic.visit.Visit visit37 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int38 = visit37.getPetId();
        pet33.addVisit(visit37);
        java.time.LocalDate localDate40 = pet33.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit41 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int42 = visit41.getPetId();
        java.time.LocalDate localDate43 = null;
        visit41.setDate(localDate43);
        java.time.LocalDate localDate45 = null;
        visit41.setDate(localDate45);
        pet33.addVisit(visit41);
        pet21.addVisit(visit41);
        pet21.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        boolean boolean6 = owner5.isNew();
        String str7 = owner5.getTelephone();
        boolean boolean8 = owner5.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("hi!", true);
        owner0.setTelephone("");
        String str12 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        org.springframework.samples.petclinic.visit.Visit visit4 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int5 = visit4.getPetId();
        java.time.LocalDate localDate6 = null;
        visit4.setDate(localDate6);
        java.time.LocalDate localDate8 = null;
        visit4.setDate(localDate8);
        visit4.setDescription("");
        visit4.setPetId((Integer) (-1));
        visit4.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner16 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = pet17.getBirthDate();
        String str19 = pet17.getName();
        owner16.addPet(pet17);
        org.springframework.samples.petclinic.visit.Visit visit21 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int22 = visit21.getPetId();
        pet17.addVisit(visit21);
        java.time.LocalDate localDate24 = visit21.getDate();
        visit4.setDate(localDate24);
        visit0.setDate(localDate24);
        Integer int27 = visit0.getPetId();
        boolean boolean28 = visit0.isNew();
        visit0.setPetId((Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        org.springframework.samples.petclinic.visit.Visit visit10 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int11 = visit10.getPetId();
        pet6.addVisit(visit10);
        Integer int13 = visit10.getPetId();
        String str14 = visit10.getDescription();
        java.time.LocalDate localDate15 = visit10.getDate();
        pet0.addVisit(visit10);
        java.time.LocalDate localDate17 = pet0.getBirthDate();
        Integer int18 = pet0.getId();
        String str19 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType20 = pet0.getType();
        org.springframework.samples.petclinic.visit.Visit visit21 = new org.springframework.samples.petclinic.visit.Visit();
        org.springframework.samples.petclinic.visit.Visit visit22 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int23 = visit22.getPetId();
        visit22.setDescription("");
        visit22.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner28 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet29 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate30 = pet29.getBirthDate();
        String str31 = pet29.getName();
        owner28.addPet(pet29);
        org.springframework.samples.petclinic.visit.Visit visit33 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int34 = visit33.getPetId();
        pet29.addVisit(visit33);
        Integer int36 = visit33.getPetId();
        Integer int37 = visit33.getPetId();
        boolean boolean38 = visit33.isNew();
        Integer int39 = visit33.getId();
        java.time.LocalDate localDate40 = visit33.getDate();
        visit22.setDate(localDate40);
        java.time.LocalDate localDate42 = visit22.getDate();
        visit21.setDate(localDate42);
        pet0.setBirthDate(localDate42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate42);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        owner0.setTelephone("hi!");
        owner0.setLastName("");
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Owner owner14 = new org.springframework.samples.petclinic.owner.Owner();
        owner14.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        String str18 = pet17.toString();
        java.time.LocalDate localDate19 = null;
        pet17.setBirthDate(localDate19);
        String str21 = pet17.getName();
        owner14.addPet(pet17);
        owner0.addPet(pet17);
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet10.setType(petType12);
        boolean boolean14 = pet10.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository15 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter16 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository15);
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter16.print(petType17, locale18);
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter16.print(petType20, locale21);
        pet10.setType(petType20);
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        String str25 = pet24.toString();
        java.time.LocalDate localDate26 = null;
        pet24.setBirthDate(localDate26);
        org.springframework.samples.petclinic.owner.Owner owner28 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet29 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate30 = pet29.getBirthDate();
        String str31 = pet29.getName();
        owner28.addPet(pet29);
        org.springframework.samples.petclinic.visit.Visit visit33 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int34 = visit33.getPetId();
        pet29.addVisit(visit33);
        Integer int36 = visit33.getPetId();
        Integer int37 = visit33.getPetId();
        boolean boolean38 = visit33.isNew();
        Integer int39 = visit33.getId();
        String str40 = visit33.getDescription();
        pet24.addVisit(visit33);
        pet10.addVisit(visit33);
        org.springframework.samples.petclinic.visit.Visit visit43 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int44 = visit43.getPetId();
        java.time.LocalDate localDate45 = null;
        visit43.setDate(localDate45);
        java.time.LocalDate localDate47 = null;
        visit43.setDate(localDate47);
        org.springframework.samples.petclinic.owner.Owner owner49 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet50 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate51 = pet50.getBirthDate();
        String str52 = pet50.getName();
        owner49.addPet(pet50);
        org.springframework.samples.petclinic.visit.Visit visit54 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int55 = visit54.getPetId();
        pet50.addVisit(visit54);
        java.time.LocalDate localDate57 = visit54.getDate();
        visit43.setDate(localDate57);
        visit43.setPetId((Integer) 1);
        pet10.addVisit(visit43);
        owner0.addPet(pet10);
        org.springframework.samples.petclinic.owner.Pet pet65 = owner0.getPet("hi!", true);
        String str66 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        String str9 = pet8.toString();
        boolean boolean10 = pet8.isNew();
        owner0.addPet(pet8);
        String str12 = pet8.toString();
        Class<?> wildcardClass13 = pet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getAddress();
        String str8 = owner0.getAddress();
        String str9 = owner0.getLastName();
        boolean boolean10 = owner0.isNew();
        owner0.setId((Integer) 100);
        boolean boolean13 = owner0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setCity("");
        owner0.setAddress("");
        String str9 = owner0.getCity();
        String str10 = owner0.getCity();
        Integer int11 = owner0.getId();
        String str12 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        String str3 = owner0.getTelephone();
        Integer int4 = owner0.getId();
        String str5 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Owner owner6 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = pet7.getBirthDate();
        String str9 = pet7.getName();
        owner6.addPet(pet7);
        java.time.LocalDate localDate11 = pet7.getBirthDate();
        boolean boolean12 = pet7.isNew();
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        pet7.setType(petType13);
        org.springframework.samples.petclinic.owner.PetType petType15 = pet7.getType();
        java.time.LocalDate localDate16 = pet7.getBirthDate();
        owner0.addPet(pet7);
        org.springframework.samples.petclinic.owner.Owner owner18 = pet7.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner19 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = pet20.getBirthDate();
        String str22 = pet20.getName();
        owner19.addPet(pet20);
        org.springframework.samples.petclinic.visit.Visit visit24 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int25 = visit24.getPetId();
        pet20.addVisit(visit24);
        java.time.LocalDate localDate27 = visit24.getDate();
        org.springframework.samples.petclinic.owner.Pet pet28 = new org.springframework.samples.petclinic.owner.Pet();
        String str29 = pet28.toString();
        org.springframework.samples.petclinic.owner.PetType petType30 = pet28.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository31 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter32 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository31);
        org.springframework.samples.petclinic.owner.PetType petType33 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale34 = null;
        String str35 = petTypeFormatter32.print(petType33, locale34);
        org.springframework.samples.petclinic.owner.PetType petType36 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale37 = null;
        String str38 = petTypeFormatter32.print(petType36, locale37);
        pet28.setType(petType36);
        org.springframework.samples.petclinic.owner.Owner owner40 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet41 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate42 = pet41.getBirthDate();
        String str43 = pet41.getName();
        owner40.addPet(pet41);
        org.springframework.samples.petclinic.visit.Visit visit45 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int46 = visit45.getPetId();
        pet41.addVisit(visit45);
        java.time.LocalDate localDate48 = visit45.getDate();
        pet28.setBirthDate(localDate48);
        visit24.setDate(localDate48);
        pet7.setBirthDate(localDate48);
        Class<?> wildcardClass52 = localDate48.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        org.springframework.samples.petclinic.visit.Visit visit10 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int11 = visit10.getPetId();
        pet6.addVisit(visit10);
        Integer int13 = visit10.getPetId();
        Integer int14 = visit10.getPetId();
        boolean boolean15 = visit10.isNew();
        Integer int16 = visit10.getId();
        java.time.LocalDate localDate17 = visit10.getDate();
        visit10.setPetId((Integer) 1);
        visit10.setPetId((Integer) 0);
        java.time.LocalDate localDate22 = visit10.getDate();
        pet1.setBirthDate(localDate22);
        org.springframework.samples.petclinic.owner.PetType petType24 = pet1.getType();
        org.springframework.samples.petclinic.owner.Owner owner25 = pet1.getOwner();
        pet1.setName("");
        java.time.LocalDate localDate28 = pet1.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        boolean boolean4 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        java.time.LocalDate localDate16 = null;
        pet14.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate20 = pet19.getBirthDate();
        String str21 = pet19.getName();
        owner18.addPet(pet19);
        org.springframework.samples.petclinic.visit.Visit visit23 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int24 = visit23.getPetId();
        pet19.addVisit(visit23);
        Integer int26 = visit23.getPetId();
        Integer int27 = visit23.getPetId();
        boolean boolean28 = visit23.isNew();
        Integer int29 = visit23.getId();
        String str30 = visit23.getDescription();
        pet14.addVisit(visit23);
        pet0.addVisit(visit23);
        org.springframework.samples.petclinic.visit.Visit visit33 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int34 = visit33.getPetId();
        java.time.LocalDate localDate35 = null;
        visit33.setDate(localDate35);
        java.time.LocalDate localDate37 = null;
        visit33.setDate(localDate37);
        org.springframework.samples.petclinic.owner.Owner owner39 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet40 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate41 = pet40.getBirthDate();
        String str42 = pet40.getName();
        owner39.addPet(pet40);
        org.springframework.samples.petclinic.visit.Visit visit44 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int45 = visit44.getPetId();
        pet40.addVisit(visit44);
        java.time.LocalDate localDate47 = visit44.getDate();
        visit33.setDate(localDate47);
        visit33.setPetId((Integer) 1);
        pet0.addVisit(visit33);
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Owner owner54 = pet0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner54);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        String str7 = vet0.getLastName();
        int int8 = vet0.getNrOfSpecialties();
        vet0.setLastName("");
        int int11 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty12 = null;
        vet0.addSpecialty(specialty12);
        int int14 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty15 = null;
        vet0.addSpecialty(specialty15);
        int int17 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner5 = pet0.getOwner();
        String str6 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetRepository petRepository7 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter8 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository7);
        org.springframework.samples.petclinic.owner.PetType petType9 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale10 = null;
        String str11 = petTypeFormatter8.print(petType9, locale10);
        org.springframework.samples.petclinic.owner.PetRepository petRepository12 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter13 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository12);
        org.springframework.samples.petclinic.owner.PetType petType14 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale15 = null;
        String str16 = petTypeFormatter13.print(petType14, locale15);
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter13.print(petType17, locale18);
        java.util.Locale locale20 = null;
        String str21 = petTypeFormatter8.print(petType17, locale20);
        org.springframework.samples.petclinic.owner.Pet pet22 = new org.springframework.samples.petclinic.owner.Pet();
        String str23 = pet22.toString();
        org.springframework.samples.petclinic.owner.PetType petType24 = null;
        pet22.setType(petType24);
        String str26 = pet22.getName();
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        String str28 = pet27.toString();
        org.springframework.samples.petclinic.owner.PetType petType29 = null;
        pet27.setType(petType29);
        boolean boolean31 = pet27.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository32 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter33 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository32);
        org.springframework.samples.petclinic.owner.PetType petType34 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale35 = null;
        String str36 = petTypeFormatter33.print(petType34, locale35);
        org.springframework.samples.petclinic.owner.PetType petType37 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale38 = null;
        String str39 = petTypeFormatter33.print(petType37, locale38);
        pet27.setType(petType37);
        pet22.setType(petType37);
        petType37.setName("");
        java.util.Locale locale44 = null;
        String str45 = petTypeFormatter8.print(petType37, locale44);
        org.springframework.samples.petclinic.owner.Pet pet46 = new org.springframework.samples.petclinic.owner.Pet();
        String str47 = pet46.toString();
        org.springframework.samples.petclinic.owner.PetType petType48 = pet46.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository49 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter50 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository49);
        org.springframework.samples.petclinic.owner.PetType petType51 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale52 = null;
        String str53 = petTypeFormatter50.print(petType51, locale52);
        org.springframework.samples.petclinic.owner.PetType petType54 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale55 = null;
        String str56 = petTypeFormatter50.print(petType54, locale55);
        pet46.setType(petType54);
        org.springframework.samples.petclinic.owner.Owner owner58 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet59 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate60 = pet59.getBirthDate();
        String str61 = pet59.getName();
        owner58.addPet(pet59);
        org.springframework.samples.petclinic.visit.Visit visit63 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int64 = visit63.getPetId();
        pet59.addVisit(visit63);
        java.time.LocalDate localDate66 = visit63.getDate();
        pet46.setBirthDate(localDate66);
        org.springframework.samples.petclinic.owner.PetType petType68 = pet46.getType();
        petType68.setName("");
        java.util.Locale locale71 = null;
        String str72 = petTypeFormatter8.print(petType68, locale71);
        pet0.setType(petType68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        String str5 = owner0.getAddress();
        owner0.setFirstName("hi!");
        boolean boolean8 = owner0.isNew();
        Integer int9 = owner0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        String str3 = vet0.getLastName();
        vet0.setFirstName("");
        int int6 = vet0.getNrOfSpecialties();
        vet0.setFirstName("hi!");
        org.springframework.samples.petclinic.vet.Specialty specialty9 = null;
        vet0.addSpecialty(specialty9);
        vet0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        owner0.setAddress("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("hi!", true);
        owner0.setTelephone("");
        String str12 = owner0.getLastName();
        String str13 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        owner0.setCity("");
        owner0.setAddress("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        String str2 = pet0.getName();
        org.springframework.samples.petclinic.visit.Visit visit3 = new org.springframework.samples.petclinic.visit.Visit();
        visit3.setDescription("hi!");
        String str6 = visit3.getDescription();
        java.time.LocalDate localDate7 = visit3.getDate();
        pet0.setBirthDate(localDate7);
        org.springframework.samples.petclinic.owner.Owner owner9 = pet0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner9);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        String str5 = pet4.toString();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet4.setType(petType6);
        boolean boolean8 = pet4.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository9 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter10 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository9);
        org.springframework.samples.petclinic.owner.PetType petType11 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale12 = null;
        String str13 = petTypeFormatter10.print(petType11, locale12);
        org.springframework.samples.petclinic.owner.PetType petType14 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale15 = null;
        String str16 = petTypeFormatter10.print(petType14, locale15);
        pet4.setType(petType14);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        String str19 = pet18.toString();
        java.time.LocalDate localDate20 = null;
        pet18.setBirthDate(localDate20);
        org.springframework.samples.petclinic.owner.Owner owner22 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate24 = pet23.getBirthDate();
        String str25 = pet23.getName();
        owner22.addPet(pet23);
        org.springframework.samples.petclinic.visit.Visit visit27 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int28 = visit27.getPetId();
        pet23.addVisit(visit27);
        Integer int30 = visit27.getPetId();
        Integer int31 = visit27.getPetId();
        boolean boolean32 = visit27.isNew();
        Integer int33 = visit27.getId();
        String str34 = visit27.getDescription();
        pet18.addVisit(visit27);
        pet4.addVisit(visit27);
        owner0.addPet(pet4);
        org.springframework.samples.petclinic.owner.PetType petType38 = pet4.getType();
        java.time.LocalDate localDate39 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet40 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate41 = pet40.getBirthDate();
        pet40.setName("hi!");
        Integer int44 = pet40.getId();
        org.springframework.samples.petclinic.owner.PetRepository petRepository45 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter46 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository45);
        org.springframework.samples.petclinic.owner.PetType petType47 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale48 = null;
        String str49 = petTypeFormatter46.print(petType47, locale48);
        org.springframework.samples.petclinic.owner.PetType petType50 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale51 = null;
        String str52 = petTypeFormatter46.print(petType50, locale51);
        org.springframework.samples.petclinic.owner.Pet pet53 = new org.springframework.samples.petclinic.owner.Pet();
        String str54 = pet53.toString();
        org.springframework.samples.petclinic.owner.PetType petType55 = null;
        pet53.setType(petType55);
        String str57 = pet53.getName();
        org.springframework.samples.petclinic.owner.Pet pet58 = new org.springframework.samples.petclinic.owner.Pet();
        String str59 = pet58.toString();
        org.springframework.samples.petclinic.owner.PetType petType60 = null;
        pet58.setType(petType60);
        boolean boolean62 = pet58.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository63 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter64 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository63);
        org.springframework.samples.petclinic.owner.PetType petType65 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale66 = null;
        String str67 = petTypeFormatter64.print(petType65, locale66);
        org.springframework.samples.petclinic.owner.PetType petType68 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale69 = null;
        String str70 = petTypeFormatter64.print(petType68, locale69);
        pet58.setType(petType68);
        pet53.setType(petType68);
        java.util.Locale locale73 = null;
        String str74 = petTypeFormatter46.print(petType68, locale73);
        pet40.setType(petType68);
        String str76 = petType68.getName();
        pet4.setType(petType68);
        pet4.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        String str3 = pet0.getName();
        String str4 = pet0.toString();
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        pet0.setName("hi!");
        String str8 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getCity();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        java.time.LocalDate localDate12 = null;
        pet10.setBirthDate(localDate12);
        pet10.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet10.setType(petType16);
        org.springframework.samples.petclinic.owner.Owner owner18 = pet10.getOwner();
        String str19 = pet10.toString();
        org.springframework.samples.petclinic.owner.Owner owner20 = pet10.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType21 = pet10.getType();
        org.springframework.samples.petclinic.owner.PetType petType22 = pet10.getType();
        owner0.addPet(pet10);
        pet10.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType22);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        org.springframework.samples.petclinic.visit.Visit visit10 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int11 = visit10.getPetId();
        pet6.addVisit(visit10);
        Integer int13 = visit10.getPetId();
        Integer int14 = visit10.getPetId();
        boolean boolean15 = visit10.isNew();
        Integer int16 = visit10.getId();
        java.time.LocalDate localDate17 = visit10.getDate();
        visit10.setPetId((Integer) 1);
        visit10.setPetId((Integer) 0);
        java.time.LocalDate localDate22 = visit10.getDate();
        pet1.setBirthDate(localDate22);
        pet1.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        java.time.LocalDate localDate5 = pet1.getBirthDate();
        boolean boolean6 = pet1.isNew();
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        pet1.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet1.getType();
        Class<?> wildcardClass10 = petType9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter1.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        String str9 = pet8.toString();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet8.setType(petType10);
        boolean boolean12 = pet8.isNew();
        org.springframework.samples.petclinic.owner.PetType petType13 = pet8.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository14 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter15 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository14);
        org.springframework.samples.petclinic.owner.PetType petType16 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale17 = null;
        String str18 = petTypeFormatter15.print(petType16, locale17);
        String str19 = petType16.getName();
        Integer int20 = petType16.getId();
        pet8.setType(petType16);
        java.util.Locale locale22 = null;
        String str23 = petTypeFormatter1.print(petType16, locale22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        String str11 = pet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        String str6 = pet1.getName();
        boolean boolean7 = pet1.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) (-1));
        visit0.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner12 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate14 = pet13.getBirthDate();
        String str15 = pet13.getName();
        owner12.addPet(pet13);
        org.springframework.samples.petclinic.visit.Visit visit17 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int18 = visit17.getPetId();
        pet13.addVisit(visit17);
        java.time.LocalDate localDate20 = visit17.getDate();
        visit0.setDate(localDate20);
        Integer int22 = visit0.getPetId();
        Integer int23 = visit0.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23.equals((-1)));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        String str8 = owner0.getLastName();
        owner0.setFirstName("");
        owner0.setCity("hi!");
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        String str16 = pet15.toString();
        org.springframework.samples.petclinic.owner.PetType petType17 = pet15.getType();
        java.time.LocalDate localDate18 = pet15.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner19 = pet15.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner20 = pet15.getOwner();
        java.time.LocalDate localDate21 = pet15.getBirthDate();
        String str22 = pet15.getName();
        owner0.addPet(pet15);
        String str24 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        String str3 = pet0.getName();
        String str4 = pet0.toString();
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        String str7 = pet6.toString();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet6.setType(petType8);
        org.springframework.samples.petclinic.visit.Visit visit10 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int11 = visit10.getPetId();
        java.time.LocalDate localDate12 = null;
        visit10.setDate(localDate12);
        org.springframework.samples.petclinic.visit.Visit visit14 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int15 = visit14.getPetId();
        java.time.LocalDate localDate16 = null;
        visit14.setDate(localDate16);
        java.time.LocalDate localDate18 = null;
        visit14.setDate(localDate18);
        visit14.setDescription("");
        visit14.setPetId((Integer) (-1));
        visit14.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner26 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate28 = pet27.getBirthDate();
        String str29 = pet27.getName();
        owner26.addPet(pet27);
        org.springframework.samples.petclinic.visit.Visit visit31 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int32 = visit31.getPetId();
        pet27.addVisit(visit31);
        java.time.LocalDate localDate34 = visit31.getDate();
        visit14.setDate(localDate34);
        visit10.setDate(localDate34);
        visit10.setDescription("");
        pet6.addVisit(visit10);
        org.springframework.samples.petclinic.owner.Owner owner40 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet41 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate42 = pet41.getBirthDate();
        String str43 = pet41.getName();
        owner40.addPet(pet41);
        org.springframework.samples.petclinic.visit.Visit visit45 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int46 = visit45.getPetId();
        pet41.addVisit(visit45);
        Integer int48 = visit45.getPetId();
        Integer int49 = visit45.getPetId();
        boolean boolean50 = visit45.isNew();
        Integer int51 = visit45.getId();
        java.time.LocalDate localDate52 = visit45.getDate();
        visit45.setPetId((Integer) 1);
        visit45.setPetId((Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet57 = new org.springframework.samples.petclinic.owner.Pet();
        String str58 = pet57.toString();
        java.time.LocalDate localDate59 = null;
        pet57.setBirthDate(localDate59);
        pet57.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType63 = null;
        pet57.setType(petType63);
        org.springframework.samples.petclinic.owner.Owner owner65 = pet57.getOwner();
        String str66 = pet57.toString();
        org.springframework.samples.petclinic.owner.Owner owner67 = pet57.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType68 = pet57.getType();
        org.springframework.samples.petclinic.owner.PetType petType69 = pet57.getType();
        org.springframework.samples.petclinic.visit.Visit visit70 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int71 = visit70.getPetId();
        java.time.LocalDate localDate72 = null;
        visit70.setDate(localDate72);
        java.time.LocalDate localDate74 = null;
        visit70.setDate(localDate74);
        org.springframework.samples.petclinic.owner.Owner owner76 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet77 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate78 = pet77.getBirthDate();
        String str79 = pet77.getName();
        owner76.addPet(pet77);
        org.springframework.samples.petclinic.visit.Visit visit81 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int82 = visit81.getPetId();
        pet77.addVisit(visit81);
        java.time.LocalDate localDate84 = visit81.getDate();
        visit70.setDate(localDate84);
        pet57.setBirthDate(localDate84);
        visit45.setDate(localDate84);
        pet6.setBirthDate(localDate84);
        pet0.setBirthDate(localDate84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate84);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        String str5 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!", false);
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("");
        owner0.setTelephone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet2.getType();
        java.time.LocalDate localDate5 = pet2.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner6 = pet2.getOwner();
        String str7 = pet2.toString();
        pet2.setName("hi!");
        owner0.addPet(pet2);
        String str11 = pet2.getName();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        String str13 = pet12.toString();
        java.time.LocalDate localDate14 = null;
        pet12.setBirthDate(localDate14);
        String str16 = pet12.getName();
        org.springframework.samples.petclinic.owner.Owner owner17 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate19 = pet18.getBirthDate();
        String str20 = pet18.getName();
        owner17.addPet(pet18);
        org.springframework.samples.petclinic.visit.Visit visit22 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int23 = visit22.getPetId();
        pet18.addVisit(visit22);
        Integer int25 = visit22.getPetId();
        String str26 = visit22.getDescription();
        java.time.LocalDate localDate27 = visit22.getDate();
        pet12.addVisit(visit22);
        Integer int29 = visit22.getPetId();
        pet2.addVisit(visit22);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        String str32 = pet31.toString();
        java.time.LocalDate localDate33 = null;
        pet31.setBirthDate(localDate33);
        String str35 = pet31.getName();
        Integer int36 = pet31.getId();
        org.springframework.samples.petclinic.owner.Owner owner37 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate39 = pet38.getBirthDate();
        String str40 = pet38.getName();
        owner37.addPet(pet38);
        org.springframework.samples.petclinic.visit.Visit visit42 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int43 = visit42.getPetId();
        pet38.addVisit(visit42);
        Integer int45 = visit42.getPetId();
        Integer int46 = visit42.getPetId();
        String str47 = visit42.getDescription();
        java.time.LocalDate localDate48 = visit42.getDate();
        pet31.setBirthDate(localDate48);
        pet2.setBirthDate(localDate48);
        Integer int51 = pet2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int51);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setPetId((Integer) (-1));
        visit0.setDescription("hi!");
        org.springframework.samples.petclinic.visit.Visit visit10 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int11 = visit10.getPetId();
        java.time.LocalDate localDate12 = null;
        visit10.setDate(localDate12);
        java.time.LocalDate localDate14 = null;
        visit10.setDate(localDate14);
        String str16 = visit10.getDescription();
        String str17 = visit10.getDescription();
        visit10.setId((Integer) 100);
        Integer int20 = visit10.getPetId();
        org.springframework.samples.petclinic.owner.Owner owner21 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet22 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate23 = pet22.getBirthDate();
        String str24 = pet22.getName();
        owner21.addPet(pet22);
        org.springframework.samples.petclinic.visit.Visit visit26 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int27 = visit26.getPetId();
        pet22.addVisit(visit26);
        Integer int29 = visit26.getPetId();
        Integer int30 = visit26.getPetId();
        String str31 = visit26.getDescription();
        java.time.LocalDate localDate32 = visit26.getDate();
        java.time.LocalDate localDate33 = visit26.getDate();
        visit10.setDate(localDate33);
        visit0.setDate(localDate33);
        java.time.LocalDate localDate36 = visit0.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty2 = null;
        vet0.addSpecialty(specialty2);
        org.springframework.samples.petclinic.vet.Specialty specialty4 = null;
        vet0.addSpecialty(specialty4);
        int int6 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        String str4 = pet3.toString();
        java.time.LocalDate localDate5 = null;
        pet3.setBirthDate(localDate5);
        String str7 = pet3.getName();
        org.springframework.samples.petclinic.owner.Owner owner8 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = pet9.getBirthDate();
        String str11 = pet9.getName();
        owner8.addPet(pet9);
        org.springframework.samples.petclinic.visit.Visit visit13 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int14 = visit13.getPetId();
        pet9.addVisit(visit13);
        Integer int16 = visit13.getPetId();
        String str17 = visit13.getDescription();
        java.time.LocalDate localDate18 = visit13.getDate();
        pet3.addVisit(visit13);
        owner0.addPet(pet3);
        String str21 = owner0.getCity();
        Integer int22 = owner0.getId();
        org.springframework.samples.petclinic.owner.Owner owner23 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate25 = pet24.getBirthDate();
        String str26 = pet24.getName();
        owner23.addPet(pet24);
        org.springframework.samples.petclinic.owner.Pet pet28 = new org.springframework.samples.petclinic.owner.Pet();
        String str29 = pet28.toString();
        owner23.addPet(pet28);
        org.springframework.samples.petclinic.owner.Owner owner31 = pet28.getOwner();
        owner0.addPet(pet28);
        org.springframework.samples.petclinic.owner.Pet pet35 = owner0.getPet("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet35);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        java.time.LocalDate localDate8 = pet1.getBirthDate();
        String str9 = pet1.toString();
        java.time.LocalDate localDate10 = pet1.getBirthDate();
        org.springframework.samples.petclinic.owner.PetRepository petRepository11 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter12 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository11);
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale14 = null;
        String str15 = petTypeFormatter12.print(petType13, locale14);
        org.springframework.samples.petclinic.owner.PetRepository petRepository16 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter17 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository16);
        org.springframework.samples.petclinic.owner.PetType petType18 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale19 = null;
        String str20 = petTypeFormatter17.print(petType18, locale19);
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale22 = null;
        String str23 = petTypeFormatter17.print(petType21, locale22);
        java.util.Locale locale24 = null;
        String str25 = petTypeFormatter12.print(petType21, locale24);
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        String str27 = pet26.toString();
        org.springframework.samples.petclinic.owner.PetType petType28 = null;
        pet26.setType(petType28);
        String str30 = pet26.getName();
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        String str32 = pet31.toString();
        org.springframework.samples.petclinic.owner.PetType petType33 = null;
        pet31.setType(petType33);
        boolean boolean35 = pet31.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository36 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter37 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository36);
        org.springframework.samples.petclinic.owner.PetType petType38 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale39 = null;
        String str40 = petTypeFormatter37.print(petType38, locale39);
        org.springframework.samples.petclinic.owner.PetType petType41 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale42 = null;
        String str43 = petTypeFormatter37.print(petType41, locale42);
        pet31.setType(petType41);
        pet26.setType(petType41);
        petType41.setName("");
        java.util.Locale locale48 = null;
        String str49 = petTypeFormatter12.print(petType41, locale48);
        pet1.setType(petType41);
        pet1.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType53 = pet1.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType53);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getTelephone();
        String str9 = owner0.getFirstName();
        owner0.setAddress("");
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        String str13 = pet12.toString();
        org.springframework.samples.petclinic.owner.PetType petType14 = pet12.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository15 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter16 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository15);
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter16.print(petType17, locale18);
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter16.print(petType20, locale21);
        pet12.setType(petType20);
        org.springframework.samples.petclinic.owner.Owner owner24 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate26 = pet25.getBirthDate();
        String str27 = pet25.getName();
        owner24.addPet(pet25);
        org.springframework.samples.petclinic.visit.Visit visit29 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int30 = visit29.getPetId();
        pet25.addVisit(visit29);
        String str32 = visit29.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner33 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet34 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate35 = pet34.getBirthDate();
        String str36 = pet34.getName();
        owner33.addPet(pet34);
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        String str39 = pet38.toString();
        owner33.addPet(pet38);
        org.springframework.samples.petclinic.owner.Owner owner41 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet42 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate43 = pet42.getBirthDate();
        String str44 = pet42.getName();
        owner41.addPet(pet42);
        org.springframework.samples.petclinic.visit.Visit visit46 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int47 = visit46.getPetId();
        pet42.addVisit(visit46);
        visit46.setDescription("");
        java.time.LocalDate localDate51 = visit46.getDate();
        pet38.setBirthDate(localDate51);
        visit29.setDate(localDate51);
        visit29.setPetId((Integer) 0);
        pet12.addVisit(visit29);
        owner0.addPet(pet12);
        java.time.LocalDate localDate58 = pet12.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner59 = pet12.getOwner();
        owner59.setAddress("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner59);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        org.springframework.samples.petclinic.owner.Owner owner4 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = pet5.getBirthDate();
        String str7 = pet5.getName();
        owner4.addPet(pet5);
        org.springframework.samples.petclinic.visit.Visit visit9 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int10 = visit9.getPetId();
        pet5.addVisit(visit9);
        Integer int12 = visit9.getPetId();
        Integer int13 = visit9.getPetId();
        boolean boolean14 = visit9.isNew();
        Integer int15 = visit9.getId();
        String str16 = visit9.getDescription();
        pet0.addVisit(visit9);
        org.springframework.samples.petclinic.owner.PetType petType18 = pet0.getType();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        String str20 = pet19.toString();
        java.time.LocalDate localDate21 = null;
        pet19.setBirthDate(localDate21);
        String str23 = pet19.getName();
        org.springframework.samples.petclinic.owner.Owner owner24 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate26 = pet25.getBirthDate();
        String str27 = pet25.getName();
        owner24.addPet(pet25);
        org.springframework.samples.petclinic.visit.Visit visit29 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int30 = visit29.getPetId();
        pet25.addVisit(visit29);
        Integer int32 = visit29.getPetId();
        String str33 = visit29.getDescription();
        java.time.LocalDate localDate34 = visit29.getDate();
        pet19.addVisit(visit29);
        java.time.LocalDate localDate36 = visit29.getDate();
        pet0.setBirthDate(localDate36);
        String str38 = pet0.toString();
        pet0.setId((Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setCity("");
        String str7 = owner0.getFirstName();
        owner0.setLastName("");
        String str10 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        String str4 = owner0.getCity();
        String str5 = owner0.getCity();
        String str6 = owner0.getTelephone();
        String str7 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        org.springframework.samples.petclinic.visit.Visit visit10 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int11 = visit10.getPetId();
        pet6.addVisit(visit10);
        Integer int13 = visit10.getPetId();
        String str14 = visit10.getDescription();
        java.time.LocalDate localDate15 = visit10.getDate();
        pet0.addVisit(visit10);
        java.time.LocalDate localDate17 = pet0.getBirthDate();
        Integer int18 = pet0.getId();
        org.springframework.samples.petclinic.owner.Owner owner19 = pet0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner19);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getAddress();
        owner0.setLastName("hi!");
        String str10 = owner0.getAddress();
        boolean boolean11 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        String str13 = pet12.toString();
        org.springframework.samples.petclinic.owner.PetType petType14 = pet12.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository15 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter16 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository15);
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter16.print(petType17, locale18);
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter16.print(petType20, locale21);
        pet12.setType(petType20);
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        String str25 = pet24.toString();
        org.springframework.samples.petclinic.owner.PetType petType26 = null;
        pet24.setType(petType26);
        boolean boolean28 = pet24.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository29 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter30 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository29);
        org.springframework.samples.petclinic.owner.PetType petType31 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale32 = null;
        String str33 = petTypeFormatter30.print(petType31, locale32);
        org.springframework.samples.petclinic.owner.PetType petType34 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale35 = null;
        String str36 = petTypeFormatter30.print(petType34, locale35);
        pet24.setType(petType34);
        pet12.setType(petType34);
        org.springframework.samples.petclinic.visit.Visit visit39 = new org.springframework.samples.petclinic.visit.Visit();
        String str40 = visit39.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner41 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet42 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate43 = pet42.getBirthDate();
        String str44 = pet42.getName();
        owner41.addPet(pet42);
        org.springframework.samples.petclinic.visit.Visit visit46 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int47 = visit46.getPetId();
        pet42.addVisit(visit46);
        Integer int49 = visit46.getPetId();
        Integer int50 = visit46.getPetId();
        boolean boolean51 = visit46.isNew();
        Integer int52 = visit46.getId();
        java.time.LocalDate localDate53 = visit46.getDate();
        visit39.setDate(localDate53);
        pet12.setBirthDate(localDate53);
        String str56 = pet12.getName();
        owner0.addPet(pet12);
        owner0.setFirstName("");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.Pet pet62 = owner0.getPet("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("hi!");
        owner0.setCity("");
        owner0.setTelephone("hi!");
        String str16 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        java.time.LocalDate localDate7 = null;
        pet5.setBirthDate(localDate7);
        String str9 = pet5.getName();
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate12 = pet11.getBirthDate();
        String str13 = pet11.getName();
        owner10.addPet(pet11);
        org.springframework.samples.petclinic.visit.Visit visit15 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int16 = visit15.getPetId();
        pet11.addVisit(visit15);
        Integer int18 = visit15.getPetId();
        String str19 = visit15.getDescription();
        java.time.LocalDate localDate20 = visit15.getDate();
        pet5.addVisit(visit15);
        java.time.LocalDate localDate22 = pet5.getBirthDate();
        java.time.LocalDate localDate23 = pet5.getBirthDate();
        owner0.addPet(pet5);
        pet5.setName("");
        org.springframework.samples.petclinic.visit.Visit visit27 = new org.springframework.samples.petclinic.visit.Visit();
        String str28 = visit27.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner29 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate31 = pet30.getBirthDate();
        String str32 = pet30.getName();
        owner29.addPet(pet30);
        org.springframework.samples.petclinic.visit.Visit visit34 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int35 = visit34.getPetId();
        pet30.addVisit(visit34);
        Integer int37 = visit34.getPetId();
        Integer int38 = visit34.getPetId();
        boolean boolean39 = visit34.isNew();
        Integer int40 = visit34.getId();
        java.time.LocalDate localDate41 = visit34.getDate();
        visit27.setDate(localDate41);
        pet5.setBirthDate(localDate41);
        org.springframework.samples.petclinic.owner.Pet pet44 = new org.springframework.samples.petclinic.owner.Pet();
        String str45 = pet44.toString();
        org.springframework.samples.petclinic.owner.PetType petType46 = pet44.getType();
        java.time.LocalDate localDate47 = pet44.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner48 = pet44.getOwner();
        String str49 = pet44.toString();
        pet44.setName("hi!");
        org.springframework.samples.petclinic.owner.Owner owner52 = new org.springframework.samples.petclinic.owner.Owner();
        owner52.setLastName("");
        Integer int55 = owner52.getId();
        org.springframework.samples.petclinic.owner.Pet pet56 = new org.springframework.samples.petclinic.owner.Pet();
        String str57 = pet56.toString();
        org.springframework.samples.petclinic.owner.PetType petType58 = null;
        pet56.setType(petType58);
        boolean boolean60 = pet56.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository61 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter62 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository61);
        org.springframework.samples.petclinic.owner.PetType petType63 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale64 = null;
        String str65 = petTypeFormatter62.print(petType63, locale64);
        org.springframework.samples.petclinic.owner.PetType petType66 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale67 = null;
        String str68 = petTypeFormatter62.print(petType66, locale67);
        pet56.setType(petType66);
        org.springframework.samples.petclinic.owner.Pet pet70 = new org.springframework.samples.petclinic.owner.Pet();
        String str71 = pet70.toString();
        java.time.LocalDate localDate72 = null;
        pet70.setBirthDate(localDate72);
        org.springframework.samples.petclinic.owner.Owner owner74 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet75 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate76 = pet75.getBirthDate();
        String str77 = pet75.getName();
        owner74.addPet(pet75);
        org.springframework.samples.petclinic.visit.Visit visit79 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int80 = visit79.getPetId();
        pet75.addVisit(visit79);
        Integer int82 = visit79.getPetId();
        Integer int83 = visit79.getPetId();
        boolean boolean84 = visit79.isNew();
        Integer int85 = visit79.getId();
        String str86 = visit79.getDescription();
        pet70.addVisit(visit79);
        pet56.addVisit(visit79);
        owner52.addPet(pet56);
        org.springframework.samples.petclinic.owner.PetType petType90 = pet56.getType();
        pet44.setType(petType90);
        pet5.setType(petType90);
        org.springframework.samples.petclinic.owner.PetType petType93 = pet5.getType();
        org.springframework.samples.petclinic.owner.Owner owner94 = pet5.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner94);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setPetId((Integer) 0);
        visit0.setId((Integer) 10);
        visit0.setPetId((Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getTelephone();
        String str9 = owner0.getFirstName();
        String str10 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setName("hi!");
        pet0.setName("");
        pet0.setName("");
        boolean boolean12 = pet0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        String str8 = visit5.getDescription();
        visit5.setPetId((Integer) (-1));
        java.time.LocalDate localDate11 = visit5.getDate();
        boolean boolean12 = visit5.isNew();
        Integer int13 = visit5.getPetId();
        Integer int14 = visit5.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14.equals((-1)));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.vet.Vet vet1 = new org.springframework.samples.petclinic.vet.Vet();
        int int2 = vet1.getNrOfSpecialties();
        vet1.setId((Integer) 0);
        String str5 = vet1.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty6 = null;
        vet1.addSpecialty(specialty6);
        String str8 = vet1.getLastName();
        int int9 = vet1.getNrOfSpecialties();
        vet1.setLastName("");
        String str12 = vet1.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty13 = null;
        vet1.addSpecialty(specialty13);
        org.springframework.validation.Errors errors15 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) vet1, errors15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.vet.Vet cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.vet.Vet and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        owner0.setId((Integer) 0);
        String str7 = owner0.getTelephone();
        String str8 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        boolean boolean6 = owner5.isNew();
        String str7 = owner5.getTelephone();
        String str8 = owner5.getAddress();
        String str9 = owner5.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.visit.Visit visit1 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int2 = visit1.getPetId();
        java.time.LocalDate localDate3 = null;
        visit1.setDate(localDate3);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        java.time.LocalDate localDate7 = null;
        visit5.setDate(localDate7);
        java.time.LocalDate localDate9 = null;
        visit5.setDate(localDate9);
        visit5.setDescription("");
        visit5.setPetId((Integer) (-1));
        visit5.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner17 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate19 = pet18.getBirthDate();
        String str20 = pet18.getName();
        owner17.addPet(pet18);
        org.springframework.samples.petclinic.visit.Visit visit22 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int23 = visit22.getPetId();
        pet18.addVisit(visit22);
        java.time.LocalDate localDate25 = visit22.getDate();
        visit5.setDate(localDate25);
        visit1.setDate(localDate25);
        Integer int28 = visit1.getPetId();
        org.springframework.samples.petclinic.owner.Pet pet29 = new org.springframework.samples.petclinic.owner.Pet();
        String str30 = pet29.toString();
        org.springframework.samples.petclinic.owner.PetType petType31 = pet29.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository32 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter33 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository32);
        org.springframework.samples.petclinic.owner.PetType petType34 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale35 = null;
        String str36 = petTypeFormatter33.print(petType34, locale35);
        org.springframework.samples.petclinic.owner.PetType petType37 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale38 = null;
        String str39 = petTypeFormatter33.print(petType37, locale38);
        pet29.setType(petType37);
        org.springframework.samples.petclinic.owner.Owner owner41 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet42 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate43 = pet42.getBirthDate();
        String str44 = pet42.getName();
        owner41.addPet(pet42);
        org.springframework.samples.petclinic.visit.Visit visit46 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int47 = visit46.getPetId();
        pet42.addVisit(visit46);
        java.time.LocalDate localDate49 = visit46.getDate();
        pet29.setBirthDate(localDate49);
        java.time.LocalDate localDate51 = pet29.getBirthDate();
        java.time.LocalDate localDate52 = pet29.getBirthDate();
        visit1.setDate(localDate52);
        org.springframework.validation.Errors errors54 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) localDate52, errors54);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.time.LocalDate cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.time.LocalDate is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate52);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        owner0.setCity("");
        boolean boolean11 = owner0.isNew();
        String str12 = owner0.getLastName();
        String str13 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        org.springframework.samples.petclinic.owner.PetType petType16 = pet14.getType();
        java.time.LocalDate localDate17 = pet14.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner18 = pet14.getOwner();
        String str19 = pet14.toString();
        pet14.setId((Integer) 100);
        owner0.addPet(pet14);
        owner0.setAddress("");
        String str25 = owner0.getTelephone();
        String str26 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository3 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter4 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter4.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.PetType petType8 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale9 = null;
        String str10 = petTypeFormatter4.print(petType8, locale9);
        pet0.setType(petType8);
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        String str13 = pet12.toString();
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet12.setType(petType14);
        boolean boolean16 = pet12.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository17 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter18 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository17);
        org.springframework.samples.petclinic.owner.PetType petType19 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale20 = null;
        String str21 = petTypeFormatter18.print(petType19, locale20);
        org.springframework.samples.petclinic.owner.PetType petType22 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale23 = null;
        String str24 = petTypeFormatter18.print(petType22, locale23);
        pet12.setType(petType22);
        pet0.setType(petType22);
        org.springframework.samples.petclinic.visit.Visit visit27 = new org.springframework.samples.petclinic.visit.Visit();
        String str28 = visit27.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner29 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate31 = pet30.getBirthDate();
        String str32 = pet30.getName();
        owner29.addPet(pet30);
        org.springframework.samples.petclinic.visit.Visit visit34 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int35 = visit34.getPetId();
        pet30.addVisit(visit34);
        Integer int37 = visit34.getPetId();
        Integer int38 = visit34.getPetId();
        boolean boolean39 = visit34.isNew();
        Integer int40 = visit34.getId();
        java.time.LocalDate localDate41 = visit34.getDate();
        visit27.setDate(localDate41);
        pet0.setBirthDate(localDate41);
        String str44 = pet0.toString();
        String str45 = pet0.getName();
        java.time.LocalDate localDate46 = pet0.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit47 = new org.springframework.samples.petclinic.visit.Visit();
        String str48 = visit47.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner49 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet50 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate51 = pet50.getBirthDate();
        String str52 = pet50.getName();
        owner49.addPet(pet50);
        org.springframework.samples.petclinic.visit.Visit visit54 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int55 = visit54.getPetId();
        pet50.addVisit(visit54);
        Integer int57 = visit54.getPetId();
        Integer int58 = visit54.getPetId();
        boolean boolean59 = visit54.isNew();
        Integer int60 = visit54.getId();
        java.time.LocalDate localDate61 = visit54.getDate();
        visit47.setDate(localDate61);
        visit47.setDescription("hi!");
        visit47.setId((Integer) 10);
        visit47.setDescription("hi!");
        pet0.addVisit(visit47);
        java.time.LocalDate localDate70 = pet0.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate70);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        Integer int8 = visit5.getPetId();
        Integer int9 = visit5.getPetId();
        boolean boolean10 = visit5.isNew();
        Integer int11 = visit5.getId();
        Integer int12 = visit5.getPetId();
        org.springframework.samples.petclinic.owner.Owner owner13 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate15 = pet14.getBirthDate();
        String str16 = pet14.getName();
        owner13.addPet(pet14);
        org.springframework.samples.petclinic.visit.Visit visit18 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int19 = visit18.getPetId();
        pet14.addVisit(visit18);
        Integer int21 = visit18.getPetId();
        String str22 = visit18.getDescription();
        Integer int23 = visit18.getPetId();
        java.time.LocalDate localDate24 = visit18.getDate();
        visit5.setDate(localDate24);
        Integer int26 = visit5.getPetId();
        java.time.LocalDate localDate27 = visit5.getDate();
        String str28 = visit5.getDescription();
        boolean boolean29 = visit5.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("", false);
        org.springframework.samples.petclinic.owner.Owner owner7 = new org.springframework.samples.petclinic.owner.Owner();
        String str8 = owner7.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        String str10 = pet9.toString();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet9.setType(petType11);
        String str13 = pet9.toString();
        owner7.addPet(pet9);
        owner7.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        String str18 = pet17.toString();
        boolean boolean19 = pet17.isNew();
        owner7.addPet(pet17);
        org.springframework.samples.petclinic.visit.Visit visit21 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int22 = visit21.getPetId();
        pet17.addVisit(visit21);
        owner0.addPet(pet17);
        String str25 = owner0.getCity();
        String str26 = owner0.getTelephone();
        String str27 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        owner0.setCity("hi!");
        String str7 = owner0.getTelephone();
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner10.getPet("hi!");
        owner10.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet17 = owner10.getPet("hi!", true);
        owner10.setTelephone("");
        String str20 = owner10.getCity();
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        String str22 = pet21.toString();
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet21.setType(petType23);
        String str25 = pet21.getName();
        boolean boolean26 = pet21.isNew();
        String str27 = pet21.getName();
        owner10.addPet(pet21);
        owner0.addPet(pet21);
        org.springframework.samples.petclinic.visit.Visit visit30 = new org.springframework.samples.petclinic.visit.Visit();
        visit30.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner33 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet34 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate35 = pet34.getBirthDate();
        String str36 = pet34.getName();
        owner33.addPet(pet34);
        org.springframework.samples.petclinic.visit.Visit visit38 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int39 = visit38.getPetId();
        pet34.addVisit(visit38);
        Integer int41 = visit38.getPetId();
        Integer int42 = visit38.getPetId();
        boolean boolean43 = visit38.isNew();
        Integer int44 = visit38.getId();
        java.time.LocalDate localDate45 = visit38.getDate();
        visit30.setDate(localDate45);
        pet21.setBirthDate(localDate45);
        java.time.LocalDate localDate48 = pet21.getBirthDate();
        java.time.LocalDate localDate49 = pet21.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate49);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        pet0.setName("hi!");
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        String str9 = pet8.toString();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet8.setType(petType10);
        String str12 = pet8.getName();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        String str14 = pet13.toString();
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet13.setType(petType15);
        boolean boolean17 = pet13.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository18 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter19 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository18);
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter19.print(petType20, locale21);
        org.springframework.samples.petclinic.owner.PetType petType23 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale24 = null;
        String str25 = petTypeFormatter19.print(petType23, locale24);
        pet13.setType(petType23);
        pet8.setType(petType23);
        pet1.setType(petType23);
        boolean boolean29 = pet1.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        String str4 = vet0.getFirstName();
        int int5 = vet0.getNrOfSpecialties();
        int int6 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        int int5 = vet0.getNrOfSpecialties();
        vet0.setLastName("hi!");
        String str8 = vet0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        Class<?> wildcardClass9 = owner0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        org.springframework.samples.petclinic.owner.Owner owner8 = pet0.getOwner();
        String str9 = pet0.toString();
        org.springframework.samples.petclinic.owner.Owner owner10 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType12 = pet0.getType();
        pet0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType12);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        Integer int8 = visit5.getPetId();
        String str9 = visit5.getDescription();
        Integer int10 = visit5.getPetId();
        visit5.setPetId((Integer) 100);
        visit5.setPetId((Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        owner0.setCity("hi!");
        owner0.setAddress("");
        String str9 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("hi!", false);
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        String str16 = pet15.toString();
        java.time.LocalDate localDate17 = null;
        pet15.setBirthDate(localDate17);
        String str19 = pet15.getName();
        org.springframework.samples.petclinic.owner.Owner owner20 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate22 = pet21.getBirthDate();
        String str23 = pet21.getName();
        owner20.addPet(pet21);
        org.springframework.samples.petclinic.visit.Visit visit25 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int26 = visit25.getPetId();
        pet21.addVisit(visit25);
        Integer int28 = visit25.getPetId();
        String str29 = visit25.getDescription();
        java.time.LocalDate localDate30 = visit25.getDate();
        pet15.addVisit(visit25);
        owner0.addPet(pet15);
        String str33 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet0.getType();
        boolean boolean5 = pet0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getFirstName();
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        String str12 = pet11.toString();
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet11.setType(petType13);
        String str15 = pet11.toString();
        pet11.setId((Integer) 10);
        owner0.addPet(pet11);
        String str19 = owner0.getFirstName();
        String str20 = owner0.getFirstName();
        String str21 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        Integer int8 = visit5.getPetId();
        Integer int9 = visit5.getPetId();
        boolean boolean10 = visit5.isNew();
        Integer int11 = visit5.getId();
        Integer int12 = visit5.getPetId();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate14 = pet13.getBirthDate();
        pet13.setName("hi!");
        org.springframework.samples.petclinic.visit.Visit visit17 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int18 = visit17.getPetId();
        java.time.LocalDate localDate19 = null;
        visit17.setDate(localDate19);
        java.time.LocalDate localDate21 = null;
        visit17.setDate(localDate21);
        visit17.setDescription("");
        visit17.setPetId((Integer) (-1));
        visit17.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner29 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate31 = pet30.getBirthDate();
        String str32 = pet30.getName();
        owner29.addPet(pet30);
        org.springframework.samples.petclinic.visit.Visit visit34 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int35 = visit34.getPetId();
        pet30.addVisit(visit34);
        java.time.LocalDate localDate37 = visit34.getDate();
        visit17.setDate(localDate37);
        pet13.setBirthDate(localDate37);
        visit5.setDate(localDate37);
        visit5.setPetId((Integer) 10);
        java.time.LocalDate localDate43 = visit5.getDate();
        org.springframework.samples.petclinic.owner.Pet pet44 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate45 = pet44.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner46 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet47 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate48 = pet47.getBirthDate();
        String str49 = pet47.getName();
        owner46.addPet(pet47);
        org.springframework.samples.petclinic.visit.Visit visit51 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int52 = visit51.getPetId();
        pet47.addVisit(visit51);
        visit51.setDescription("");
        java.time.LocalDate localDate56 = visit51.getDate();
        pet44.setBirthDate(localDate56);
        java.time.LocalDate localDate58 = pet44.getBirthDate();
        visit5.setDate(localDate58);
        visit5.setDescription("");
        Integer int62 = visit5.getPetId();
        java.time.LocalDate localDate63 = null;
        visit5.setDate(localDate63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62.equals(10));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        java.time.LocalDate localDate8 = pet1.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit9 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int10 = visit9.getPetId();
        java.time.LocalDate localDate11 = null;
        visit9.setDate(localDate11);
        java.time.LocalDate localDate13 = null;
        visit9.setDate(localDate13);
        pet1.addVisit(visit9);
        String str16 = pet1.toString();
        org.springframework.samples.petclinic.owner.Owner owner17 = pet1.getOwner();
        org.springframework.samples.petclinic.owner.PetRepository petRepository18 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter19 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository18);
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter19.print(petType20, locale21);
        org.springframework.samples.petclinic.owner.PetRepository petRepository23 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter24 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository23);
        org.springframework.samples.petclinic.owner.PetType petType25 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale26 = null;
        String str27 = petTypeFormatter24.print(petType25, locale26);
        java.util.Locale locale28 = null;
        String str29 = petTypeFormatter19.print(petType25, locale28);
        org.springframework.samples.petclinic.owner.PetType petType30 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale31 = null;
        String str32 = petTypeFormatter19.print(petType30, locale31);
        org.springframework.samples.petclinic.owner.PetRepository petRepository33 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter34 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository33);
        org.springframework.samples.petclinic.owner.PetType petType35 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale36 = null;
        String str37 = petTypeFormatter34.print(petType35, locale36);
        org.springframework.samples.petclinic.owner.PetRepository petRepository38 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter39 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository38);
        org.springframework.samples.petclinic.owner.PetType petType40 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale41 = null;
        String str42 = petTypeFormatter39.print(petType40, locale41);
        org.springframework.samples.petclinic.owner.PetType petType43 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale44 = null;
        String str45 = petTypeFormatter39.print(petType43, locale44);
        java.util.Locale locale46 = null;
        String str47 = petTypeFormatter34.print(petType43, locale46);
        String str48 = petType43.toString();
        java.util.Locale locale49 = null;
        String str50 = petTypeFormatter19.print(petType43, locale49);
        org.springframework.samples.petclinic.owner.Pet pet51 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate52 = pet51.getBirthDate();
        pet51.setName("hi!");
        pet51.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository57 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter58 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository57);
        org.springframework.samples.petclinic.owner.PetRepository petRepository59 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter60 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository59);
        org.springframework.samples.petclinic.owner.PetType petType61 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale62 = null;
        String str63 = petTypeFormatter60.print(petType61, locale62);
        org.springframework.samples.petclinic.owner.PetRepository petRepository64 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter65 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository64);
        org.springframework.samples.petclinic.owner.PetType petType66 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale67 = null;
        String str68 = petTypeFormatter65.print(petType66, locale67);
        org.springframework.samples.petclinic.owner.PetType petType69 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale70 = null;
        String str71 = petTypeFormatter65.print(petType69, locale70);
        java.util.Locale locale72 = null;
        String str73 = petTypeFormatter60.print(petType69, locale72);
        java.util.Locale locale74 = null;
        String str75 = petTypeFormatter58.print(petType69, locale74);
        pet51.setType(petType69);
        java.util.Locale locale77 = null;
        String str78 = petTypeFormatter19.print(petType69, locale77);
        pet1.setType(petType69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getFirstName();
        String str9 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.springframework.samples.petclinic.model.Person person0 = new org.springframework.samples.petclinic.model.Person();
        person0.setLastName("hi!");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet2.getType();
        java.time.LocalDate localDate5 = pet2.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner6 = pet2.getOwner();
        String str7 = pet2.toString();
        pet2.setName("hi!");
        owner0.addPet(pet2);
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("hi!", true);
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        String str17 = pet16.toString();
        org.springframework.samples.petclinic.owner.PetType petType18 = pet16.getType();
        java.time.LocalDate localDate19 = pet16.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner20 = pet16.getOwner();
        String str21 = pet16.toString();
        pet16.setName("hi!");
        pet16.setName("");
        pet16.setName("");
        java.time.LocalDate localDate28 = pet16.getBirthDate();
        pet16.setId((Integer) (-1));
        java.time.LocalDate localDate31 = pet16.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType32 = pet16.getType();
        owner0.addPet(pet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType32);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        String str10 = pet9.toString();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet9.setType(petType11);
        String str13 = pet9.getName();
        owner0.addPet(pet9);
        String str15 = owner0.getFirstName();
        String str16 = owner0.getTelephone();
        Integer int17 = owner0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        org.springframework.samples.petclinic.owner.Owner owner4 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = pet5.getBirthDate();
        String str7 = pet5.getName();
        owner4.addPet(pet5);
        org.springframework.samples.petclinic.visit.Visit visit9 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int10 = visit9.getPetId();
        pet5.addVisit(visit9);
        Integer int12 = visit9.getPetId();
        Integer int13 = visit9.getPetId();
        boolean boolean14 = visit9.isNew();
        Integer int15 = visit9.getId();
        String str16 = visit9.getDescription();
        pet0.addVisit(visit9);
        org.springframework.samples.petclinic.owner.PetType petType18 = pet0.getType();
        org.springframework.samples.petclinic.owner.Owner owner19 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = pet20.getBirthDate();
        String str22 = pet20.getName();
        owner19.addPet(pet20);
        org.springframework.samples.petclinic.visit.Visit visit24 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int25 = visit24.getPetId();
        pet20.addVisit(visit24);
        Integer int27 = visit24.getPetId();
        Integer int28 = visit24.getPetId();
        boolean boolean29 = visit24.isNew();
        Integer int30 = visit24.getId();
        Integer int31 = visit24.getPetId();
        org.springframework.samples.petclinic.owner.Owner owner32 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate34 = pet33.getBirthDate();
        String str35 = pet33.getName();
        owner32.addPet(pet33);
        org.springframework.samples.petclinic.visit.Visit visit37 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int38 = visit37.getPetId();
        pet33.addVisit(visit37);
        Integer int40 = visit37.getPetId();
        String str41 = visit37.getDescription();
        Integer int42 = visit37.getPetId();
        java.time.LocalDate localDate43 = visit37.getDate();
        visit24.setDate(localDate43);
        pet0.setBirthDate(localDate43);
        Class<?> wildcardClass46 = pet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty2 = null;
        vet0.addSpecialty(specialty2);
        vet0.setFirstName("hi!");
        int int6 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty7 = null;
        vet0.addSpecialty(specialty7);
        vet0.setFirstName("");
        org.springframework.samples.petclinic.vet.Specialty specialty11 = null;
        vet0.addSpecialty(specialty11);
        int int13 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        String str9 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        Integer int8 = visit5.getPetId();
        Integer int9 = visit5.getPetId();
        boolean boolean10 = visit5.isNew();
        Integer int11 = visit5.getId();
        java.time.LocalDate localDate12 = visit5.getDate();
        visit5.setPetId((Integer) 1);
        Integer int15 = visit5.getPetId();
        String str16 = visit5.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("hi!");
        String str6 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty2 = null;
        vet0.addSpecialty(specialty2);
        String str4 = vet0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!", true);
        owner0.setTelephone("");
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Owner owner14 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate16 = pet15.getBirthDate();
        String str17 = pet15.getName();
        owner14.addPet(pet15);
        org.springframework.samples.petclinic.owner.Owner owner19 = pet15.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner20 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate22 = pet21.getBirthDate();
        String str23 = pet21.getName();
        owner20.addPet(pet21);
        org.springframework.samples.petclinic.visit.Visit visit25 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int26 = visit25.getPetId();
        pet21.addVisit(visit25);
        String str28 = visit25.getDescription();
        visit25.setPetId((Integer) (-1));
        pet15.addVisit(visit25);
        pet15.setName("hi!");
        pet15.setName("hi!");
        owner0.addPet(pet15);
        String str37 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Owner owner38 = new org.springframework.samples.petclinic.owner.Owner();
        owner38.setLastName("");
        Integer int41 = owner38.getId();
        owner38.setAddress("");
        String str44 = owner38.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet46 = owner38.getPet("hi!");
        String str47 = owner38.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet50 = owner38.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Owner owner51 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet52 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate53 = pet52.getBirthDate();
        String str54 = pet52.getName();
        owner51.addPet(pet52);
        org.springframework.samples.petclinic.owner.Owner owner56 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet57 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate58 = pet57.getBirthDate();
        String str59 = pet57.getName();
        owner56.addPet(pet57);
        org.springframework.samples.petclinic.visit.Visit visit61 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int62 = visit61.getPetId();
        pet57.addVisit(visit61);
        Integer int64 = visit61.getPetId();
        Integer int65 = visit61.getPetId();
        boolean boolean66 = visit61.isNew();
        Integer int67 = visit61.getId();
        java.time.LocalDate localDate68 = visit61.getDate();
        visit61.setPetId((Integer) 1);
        visit61.setPetId((Integer) 0);
        java.time.LocalDate localDate73 = visit61.getDate();
        pet52.setBirthDate(localDate73);
        owner38.addPet(pet52);
        java.time.LocalDate localDate76 = pet52.getBirthDate();
        owner0.addPet(pet52);
        owner0.setTelephone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate76);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        String str10 = pet9.toString();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet9.setType(petType11);
        boolean boolean13 = pet9.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository14 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter15 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository14);
        org.springframework.samples.petclinic.owner.PetType petType16 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale17 = null;
        String str18 = petTypeFormatter15.print(petType16, locale17);
        org.springframework.samples.petclinic.owner.PetType petType19 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale20 = null;
        String str21 = petTypeFormatter15.print(petType19, locale20);
        pet9.setType(petType19);
        owner0.addPet(pet9);
        owner0.setLastName("hi!");
        owner0.setTelephone("");
        owner0.setFirstName("");
        owner0.setLastName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        org.springframework.samples.petclinic.visit.Visit visit6 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int7 = visit6.getPetId();
        java.time.LocalDate localDate8 = null;
        visit6.setDate(localDate8);
        java.time.LocalDate localDate10 = null;
        visit6.setDate(localDate10);
        visit6.setPetId((Integer) (-1));
        visit6.setDescription("hi!");
        pet0.addVisit(visit6);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        String str18 = pet17.toString();
        org.springframework.samples.petclinic.owner.PetType petType19 = null;
        pet17.setType(petType19);
        String str21 = pet17.toString();
        org.springframework.samples.petclinic.owner.Pet pet22 = new org.springframework.samples.petclinic.owner.Pet();
        String str23 = pet22.toString();
        org.springframework.samples.petclinic.owner.PetType petType24 = pet22.getType();
        java.time.LocalDate localDate25 = pet22.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner26 = pet22.getOwner();
        String str27 = pet22.toString();
        pet22.setName("hi!");
        pet22.setName("");
        pet22.setName("");
        java.time.LocalDate localDate34 = pet22.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit35 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int36 = visit35.getPetId();
        java.time.LocalDate localDate37 = null;
        visit35.setDate(localDate37);
        java.time.LocalDate localDate39 = null;
        visit35.setDate(localDate39);
        visit35.setDescription("");
        visit35.setPetId((Integer) (-1));
        visit35.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner47 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet48 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate49 = pet48.getBirthDate();
        String str50 = pet48.getName();
        owner47.addPet(pet48);
        org.springframework.samples.petclinic.visit.Visit visit52 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int53 = visit52.getPetId();
        pet48.addVisit(visit52);
        java.time.LocalDate localDate55 = visit52.getDate();
        visit35.setDate(localDate55);
        pet22.setBirthDate(localDate55);
        pet17.setBirthDate(localDate55);
        pet0.setBirthDate(localDate55);
        java.time.LocalDate localDate60 = pet0.getBirthDate();
        Class<?> wildcardClass61 = localDate60.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        boolean boolean5 = owner0.isNew();
        owner0.setLastName("hi!");
        owner0.setTelephone("");
        String str10 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setName("hi!");
        pet0.setName("");
        pet0.setName("");
        pet0.setName("hi!");
        pet0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        vet0.setLastName("");
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        org.springframework.samples.petclinic.vet.Specialty specialty7 = null;
        vet0.addSpecialty(specialty7);
        org.springframework.samples.petclinic.vet.Specialty specialty9 = null;
        vet0.addSpecialty(specialty9);
        org.springframework.samples.petclinic.vet.Specialty specialty11 = null;
        vet0.addSpecialty(specialty11);
        org.springframework.samples.petclinic.vet.Specialty specialty13 = null;
        vet0.addSpecialty(specialty13);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty2 = null;
        vet0.addSpecialty(specialty2);
        int int4 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        java.util.Locale locale13 = null;
        String str14 = petTypeFormatter1.print(petType10, locale13);
        org.springframework.samples.petclinic.owner.PetRepository petRepository15 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter16 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository15);
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter16.print(petType17, locale18);
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter16.print(petType20, locale21);
        org.springframework.samples.petclinic.owner.PetRepository petRepository23 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter24 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository23);
        org.springframework.samples.petclinic.owner.PetType petType25 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale26 = null;
        String str27 = petTypeFormatter24.print(petType25, locale26);
        org.springframework.samples.petclinic.owner.PetRepository petRepository28 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter29 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository28);
        org.springframework.samples.petclinic.owner.PetType petType30 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale31 = null;
        String str32 = petTypeFormatter29.print(petType30, locale31);
        java.util.Locale locale33 = null;
        String str34 = petTypeFormatter24.print(petType30, locale33);
        String str35 = petType30.toString();
        java.util.Locale locale36 = null;
        String str37 = petTypeFormatter16.print(petType30, locale36);
        java.util.Locale locale38 = null;
        String str39 = petTypeFormatter1.print(petType30, locale38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        String str5 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        String str7 = pet6.toString();
        java.time.LocalDate localDate8 = null;
        pet6.setBirthDate(localDate8);
        String str10 = pet6.getName();
        org.springframework.samples.petclinic.owner.Owner owner11 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        String str14 = pet12.getName();
        owner11.addPet(pet12);
        org.springframework.samples.petclinic.visit.Visit visit16 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int17 = visit16.getPetId();
        pet12.addVisit(visit16);
        Integer int19 = visit16.getPetId();
        String str20 = visit16.getDescription();
        java.time.LocalDate localDate21 = visit16.getDate();
        pet6.addVisit(visit16);
        owner0.addPet(pet6);
        String str24 = owner0.getTelephone();
        owner0.setAddress("");
        String str27 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter1.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.PetRepository petRepository8 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter9 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter9.print(petType10, locale11);
        org.springframework.samples.petclinic.owner.PetRepository petRepository13 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter14 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository13);
        org.springframework.samples.petclinic.owner.PetType petType15 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale16 = null;
        String str17 = petTypeFormatter14.print(petType15, locale16);
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter9.print(petType15, locale18);
        String str20 = petType15.toString();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter1.print(petType15, locale21);
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        String str24 = pet23.toString();
        boolean boolean25 = pet23.isNew();
        org.springframework.samples.petclinic.owner.PetType petType26 = pet23.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository27 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter28 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository27);
        org.springframework.samples.petclinic.owner.PetType petType29 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale30 = null;
        String str31 = petTypeFormatter28.print(petType29, locale30);
        org.springframework.samples.petclinic.owner.PetType petType32 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale33 = null;
        String str34 = petTypeFormatter28.print(petType32, locale33);
        pet23.setType(petType32);
        Integer int36 = petType32.getId();
        java.util.Locale locale37 = null;
        String str38 = petTypeFormatter1.print(petType32, locale37);
        org.springframework.samples.petclinic.owner.Pet pet39 = new org.springframework.samples.petclinic.owner.Pet();
        String str40 = pet39.toString();
        org.springframework.samples.petclinic.owner.PetType petType41 = pet39.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository42 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter43 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository42);
        org.springframework.samples.petclinic.owner.PetType petType44 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale45 = null;
        String str46 = petTypeFormatter43.print(petType44, locale45);
        org.springframework.samples.petclinic.owner.PetType petType47 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale48 = null;
        String str49 = petTypeFormatter43.print(petType47, locale48);
        pet39.setType(petType47);
        org.springframework.samples.petclinic.owner.Owner owner51 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet52 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate53 = pet52.getBirthDate();
        String str54 = pet52.getName();
        owner51.addPet(pet52);
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int57 = visit56.getPetId();
        pet52.addVisit(visit56);
        java.time.LocalDate localDate59 = visit56.getDate();
        pet39.setBirthDate(localDate59);
        java.time.LocalDate localDate61 = pet39.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType62 = pet39.getType();
        java.util.Locale locale63 = null;
        String str64 = petTypeFormatter1.print(petType62, locale63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        owner0.setTelephone("hi!");
        owner0.setLastName("");
        String str12 = owner0.getFirstName();
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Owner owner15 = new org.springframework.samples.petclinic.owner.Owner();
        owner15.setLastName("");
        Integer int18 = owner15.getId();
        owner15.setAddress("");
        owner15.setTelephone("");
        String str23 = owner15.getFirstName();
        owner15.setLastName("hi!");
        String str26 = owner15.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate28 = pet27.getBirthDate();
        pet27.setName("hi!");
        pet27.setId((Integer) 1);
        owner15.addPet(pet27);
        pet27.setName("hi!");
        boolean boolean36 = pet27.isNew();
        org.springframework.samples.petclinic.visit.Visit visit37 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int38 = visit37.getPetId();
        java.time.LocalDate localDate39 = null;
        visit37.setDate(localDate39);
        org.springframework.samples.petclinic.visit.Visit visit41 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int42 = visit41.getPetId();
        java.time.LocalDate localDate43 = null;
        visit41.setDate(localDate43);
        java.time.LocalDate localDate45 = null;
        visit41.setDate(localDate45);
        visit41.setDescription("");
        visit41.setPetId((Integer) (-1));
        visit41.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner53 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet54 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate55 = pet54.getBirthDate();
        String str56 = pet54.getName();
        owner53.addPet(pet54);
        org.springframework.samples.petclinic.visit.Visit visit58 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int59 = visit58.getPetId();
        pet54.addVisit(visit58);
        java.time.LocalDate localDate61 = visit58.getDate();
        visit41.setDate(localDate61);
        visit37.setDate(localDate61);
        pet27.setBirthDate(localDate61);
        owner0.addPet(pet27);
        org.springframework.samples.petclinic.owner.Owner owner66 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet67 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate68 = pet67.getBirthDate();
        String str69 = pet67.getName();
        owner66.addPet(pet67);
        org.springframework.samples.petclinic.visit.Visit visit71 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int72 = visit71.getPetId();
        pet67.addVisit(visit71);
        String str74 = visit71.getDescription();
        visit71.setDescription("");
        String str77 = visit71.getDescription();
        pet27.addVisit(visit71);
        visit71.setPetId((Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("hi!");
        owner0.setId((Integer) (-1));
        boolean boolean14 = owner0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        String str4 = pet0.getName();
        Integer int5 = pet0.getId();
        org.springframework.samples.petclinic.owner.Owner owner6 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = pet7.getBirthDate();
        String str9 = pet7.getName();
        owner6.addPet(pet7);
        org.springframework.samples.petclinic.visit.Visit visit11 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int12 = visit11.getPetId();
        pet7.addVisit(visit11);
        Integer int14 = visit11.getPetId();
        Integer int15 = visit11.getPetId();
        String str16 = visit11.getDescription();
        java.time.LocalDate localDate17 = visit11.getDate();
        pet0.setBirthDate(localDate17);
        org.springframework.samples.petclinic.owner.PetType petType19 = pet0.getType();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Owner owner22 = pet0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner22);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        String str8 = visit0.getDescription();
        String str9 = visit0.getDescription();
        visit0.setId((Integer) 1);
        Integer int12 = visit0.getPetId();
        java.time.LocalDate localDate13 = visit0.getDate();
        java.time.LocalDate localDate14 = visit0.getDate();
        org.springframework.samples.petclinic.owner.Owner owner15 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate17 = pet16.getBirthDate();
        String str18 = pet16.getName();
        owner15.addPet(pet16);
        org.springframework.samples.petclinic.visit.Visit visit20 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int21 = visit20.getPetId();
        pet16.addVisit(visit20);
        java.time.LocalDate localDate23 = visit20.getDate();
        visit20.setPetId((Integer) 1);
        String str26 = visit20.getDescription();
        java.time.LocalDate localDate27 = visit20.getDate();
        visit0.setDate(localDate27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        java.time.LocalDate localDate8 = visit0.getDate();
        org.springframework.samples.petclinic.owner.Owner owner9 = new org.springframework.samples.petclinic.owner.Owner();
        owner9.setLastName("");
        Integer int12 = owner9.getId();
        owner9.setAddress("");
        owner9.setTelephone("");
        String str17 = owner9.getFirstName();
        owner9.setLastName("hi!");
        String str20 = owner9.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate22 = pet21.getBirthDate();
        pet21.setName("hi!");
        pet21.setId((Integer) 1);
        owner9.addPet(pet21);
        pet21.setName("hi!");
        boolean boolean30 = pet21.isNew();
        org.springframework.samples.petclinic.visit.Visit visit31 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int32 = visit31.getPetId();
        java.time.LocalDate localDate33 = null;
        visit31.setDate(localDate33);
        org.springframework.samples.petclinic.visit.Visit visit35 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int36 = visit35.getPetId();
        java.time.LocalDate localDate37 = null;
        visit35.setDate(localDate37);
        java.time.LocalDate localDate39 = null;
        visit35.setDate(localDate39);
        visit35.setDescription("");
        visit35.setPetId((Integer) (-1));
        visit35.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner47 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet48 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate49 = pet48.getBirthDate();
        String str50 = pet48.getName();
        owner47.addPet(pet48);
        org.springframework.samples.petclinic.visit.Visit visit52 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int53 = visit52.getPetId();
        pet48.addVisit(visit52);
        java.time.LocalDate localDate55 = visit52.getDate();
        visit35.setDate(localDate55);
        visit31.setDate(localDate55);
        pet21.setBirthDate(localDate55);
        visit0.setDate(localDate55);
        java.time.LocalDate localDate60 = visit0.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate60);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        owner0.setCity("hi!");
        owner0.setAddress("");
        String str9 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("hi!", false);
        String str13 = owner0.getCity();
        String str14 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getTelephone();
        String str9 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        String str5 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        String str7 = pet6.toString();
        java.time.LocalDate localDate8 = null;
        pet6.setBirthDate(localDate8);
        String str10 = pet6.getName();
        org.springframework.samples.petclinic.owner.Owner owner11 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        String str14 = pet12.getName();
        owner11.addPet(pet12);
        org.springframework.samples.petclinic.visit.Visit visit16 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int17 = visit16.getPetId();
        pet12.addVisit(visit16);
        Integer int19 = visit16.getPetId();
        String str20 = visit16.getDescription();
        java.time.LocalDate localDate21 = visit16.getDate();
        pet6.addVisit(visit16);
        owner0.addPet(pet6);
        String str24 = owner0.getAddress();
        String str25 = owner0.getCity();
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setId((Integer) 100);
        Integer int8 = pet0.getId();
        String str9 = pet0.toString();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        java.time.LocalDate localDate12 = null;
        pet10.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        java.time.LocalDate localDate16 = null;
        pet14.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate20 = pet19.getBirthDate();
        String str21 = pet19.getName();
        owner18.addPet(pet19);
        org.springframework.samples.petclinic.visit.Visit visit23 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int24 = visit23.getPetId();
        pet19.addVisit(visit23);
        Integer int26 = visit23.getPetId();
        Integer int27 = visit23.getPetId();
        boolean boolean28 = visit23.isNew();
        Integer int29 = visit23.getId();
        String str30 = visit23.getDescription();
        pet14.addVisit(visit23);
        visit23.setDescription("hi!");
        pet10.addVisit(visit23);
        pet0.addVisit(visit23);
        org.springframework.samples.petclinic.owner.Pet pet36 = new org.springframework.samples.petclinic.owner.Pet();
        String str37 = pet36.toString();
        java.time.LocalDate localDate38 = null;
        pet36.setBirthDate(localDate38);
        pet36.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType42 = null;
        pet36.setType(petType42);
        org.springframework.samples.petclinic.visit.Visit visit44 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int45 = visit44.getPetId();
        pet36.addVisit(visit44);
        org.springframework.samples.petclinic.owner.Owner owner47 = pet36.getOwner();
        org.springframework.samples.petclinic.owner.Pet pet48 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate49 = pet48.getBirthDate();
        pet48.setName("hi!");
        Integer int52 = pet48.getId();
        org.springframework.samples.petclinic.owner.PetRepository petRepository53 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter54 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository53);
        org.springframework.samples.petclinic.owner.PetType petType55 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale56 = null;
        String str57 = petTypeFormatter54.print(petType55, locale56);
        org.springframework.samples.petclinic.owner.PetType petType58 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale59 = null;
        String str60 = petTypeFormatter54.print(petType58, locale59);
        org.springframework.samples.petclinic.owner.Pet pet61 = new org.springframework.samples.petclinic.owner.Pet();
        String str62 = pet61.toString();
        org.springframework.samples.petclinic.owner.PetType petType63 = null;
        pet61.setType(petType63);
        String str65 = pet61.getName();
        org.springframework.samples.petclinic.owner.Pet pet66 = new org.springframework.samples.petclinic.owner.Pet();
        String str67 = pet66.toString();
        org.springframework.samples.petclinic.owner.PetType petType68 = null;
        pet66.setType(petType68);
        boolean boolean70 = pet66.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository71 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter72 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository71);
        org.springframework.samples.petclinic.owner.PetType petType73 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale74 = null;
        String str75 = petTypeFormatter72.print(petType73, locale74);
        org.springframework.samples.petclinic.owner.PetType petType76 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale77 = null;
        String str78 = petTypeFormatter72.print(petType76, locale77);
        pet66.setType(petType76);
        pet61.setType(petType76);
        java.util.Locale locale81 = null;
        String str82 = petTypeFormatter54.print(petType76, locale81);
        pet48.setType(petType76);
        String str84 = petType76.getName();
        pet36.setType(petType76);
        pet0.setType(petType76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        boolean boolean4 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        java.time.LocalDate localDate16 = null;
        pet14.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate20 = pet19.getBirthDate();
        String str21 = pet19.getName();
        owner18.addPet(pet19);
        org.springframework.samples.petclinic.visit.Visit visit23 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int24 = visit23.getPetId();
        pet19.addVisit(visit23);
        Integer int26 = visit23.getPetId();
        Integer int27 = visit23.getPetId();
        boolean boolean28 = visit23.isNew();
        Integer int29 = visit23.getId();
        String str30 = visit23.getDescription();
        pet14.addVisit(visit23);
        pet0.addVisit(visit23);
        Integer int33 = visit23.getPetId();
        org.springframework.samples.petclinic.visit.Visit visit34 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int35 = visit34.getPetId();
        java.time.LocalDate localDate36 = null;
        visit34.setDate(localDate36);
        java.time.LocalDate localDate38 = null;
        visit34.setDate(localDate38);
        visit34.setPetId((Integer) 0);
        org.springframework.samples.petclinic.owner.Pet pet42 = new org.springframework.samples.petclinic.owner.Pet();
        String str43 = pet42.toString();
        org.springframework.samples.petclinic.owner.PetType petType44 = pet42.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository45 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter46 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository45);
        org.springframework.samples.petclinic.owner.PetType petType47 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale48 = null;
        String str49 = petTypeFormatter46.print(petType47, locale48);
        org.springframework.samples.petclinic.owner.PetType petType50 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale51 = null;
        String str52 = petTypeFormatter46.print(petType50, locale51);
        pet42.setType(petType50);
        pet42.setName("");
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        visit56.setPetId((Integer) 10);
        org.springframework.samples.petclinic.visit.Visit visit59 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int60 = visit59.getPetId();
        java.time.LocalDate localDate61 = null;
        visit59.setDate(localDate61);
        java.time.LocalDate localDate63 = null;
        visit59.setDate(localDate63);
        org.springframework.samples.petclinic.owner.Owner owner65 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet66 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate67 = pet66.getBirthDate();
        String str68 = pet66.getName();
        owner65.addPet(pet66);
        org.springframework.samples.petclinic.visit.Visit visit70 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int71 = visit70.getPetId();
        pet66.addVisit(visit70);
        java.time.LocalDate localDate73 = visit70.getDate();
        visit59.setDate(localDate73);
        visit56.setDate(localDate73);
        pet42.setBirthDate(localDate73);
        visit34.setDate(localDate73);
        visit23.setDate(localDate73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate73);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        String str1 = visit0.getDescription();
        String str2 = visit0.getDescription();
        java.time.LocalDate localDate3 = visit0.getDate();
        String str4 = visit0.getDescription();
        java.time.LocalDate localDate5 = visit0.getDate();
        java.time.LocalDate localDate6 = visit0.getDate();
        Integer int7 = visit0.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        visit0.setDescription("hi!");
        visit0.setPetId((Integer) (-1));
        java.time.LocalDate localDate5 = visit0.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetRepository petRepository2 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter3 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository2);
        org.springframework.samples.petclinic.owner.PetType petType4 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale5 = null;
        String str6 = petTypeFormatter3.print(petType4, locale5);
        org.springframework.samples.petclinic.owner.PetRepository petRepository7 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter8 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository7);
        org.springframework.samples.petclinic.owner.PetType petType9 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale10 = null;
        String str11 = petTypeFormatter8.print(petType9, locale10);
        org.springframework.samples.petclinic.owner.PetType petType12 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale13 = null;
        String str14 = petTypeFormatter8.print(petType12, locale13);
        java.util.Locale locale15 = null;
        String str16 = petTypeFormatter3.print(petType12, locale15);
        java.util.Locale locale17 = null;
        String str18 = petTypeFormatter1.print(petType12, locale17);
        org.springframework.samples.petclinic.owner.PetRepository petRepository19 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter20 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository19);
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale22 = null;
        String str23 = petTypeFormatter20.print(petType21, locale22);
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale25 = null;
        String str26 = petTypeFormatter20.print(petType24, locale25);
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale28 = null;
        String str29 = petTypeFormatter20.print(petType27, locale28);
        org.springframework.samples.petclinic.owner.PetRepository petRepository30 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter31 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository30);
        org.springframework.samples.petclinic.owner.PetType petType32 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale33 = null;
        String str34 = petTypeFormatter31.print(petType32, locale33);
        org.springframework.samples.petclinic.owner.PetRepository petRepository35 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter36 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository35);
        org.springframework.samples.petclinic.owner.PetType petType37 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale38 = null;
        String str39 = petTypeFormatter36.print(petType37, locale38);
        java.util.Locale locale40 = null;
        String str41 = petTypeFormatter31.print(petType37, locale40);
        java.util.Locale locale42 = null;
        String str43 = petTypeFormatter20.print(petType37, locale42);
        java.util.Locale locale44 = null;
        String str45 = petTypeFormatter1.print(petType37, locale44);
        String str46 = petType37.getName();
        String str47 = petType37.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner6 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = pet7.getBirthDate();
        String str9 = pet7.getName();
        owner6.addPet(pet7);
        org.springframework.samples.petclinic.visit.Visit visit11 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int12 = visit11.getPetId();
        pet7.addVisit(visit11);
        String str14 = visit11.getDescription();
        visit11.setPetId((Integer) (-1));
        pet1.addVisit(visit11);
        String str18 = visit11.getDescription();
        Integer int19 = visit11.getPetId();
        java.time.LocalDate localDate20 = visit11.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setName("hi!");
        pet0.setName("");
        pet0.setName("");
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit13 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int14 = visit13.getPetId();
        java.time.LocalDate localDate15 = null;
        visit13.setDate(localDate15);
        java.time.LocalDate localDate17 = null;
        visit13.setDate(localDate17);
        visit13.setDescription("");
        visit13.setPetId((Integer) (-1));
        visit13.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner25 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate27 = pet26.getBirthDate();
        String str28 = pet26.getName();
        owner25.addPet(pet26);
        org.springframework.samples.petclinic.visit.Visit visit30 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int31 = visit30.getPetId();
        pet26.addVisit(visit30);
        java.time.LocalDate localDate33 = visit30.getDate();
        visit13.setDate(localDate33);
        pet0.setBirthDate(localDate33);
        org.springframework.samples.petclinic.owner.Pet pet36 = new org.springframework.samples.petclinic.owner.Pet();
        String str37 = pet36.toString();
        org.springframework.samples.petclinic.owner.PetType petType38 = pet36.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository39 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter40 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository39);
        org.springframework.samples.petclinic.owner.PetType petType41 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale42 = null;
        String str43 = petTypeFormatter40.print(petType41, locale42);
        org.springframework.samples.petclinic.owner.PetType petType44 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale45 = null;
        String str46 = petTypeFormatter40.print(petType44, locale45);
        pet36.setType(petType44);
        pet0.setType(petType44);
        String str49 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        String str8 = pet2.getName();
        org.springframework.samples.petclinic.owner.PetRepository petRepository9 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter10 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository9);
        org.springframework.samples.petclinic.owner.PetType petType11 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale12 = null;
        String str13 = petTypeFormatter10.print(petType11, locale12);
        org.springframework.samples.petclinic.owner.PetRepository petRepository14 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter15 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository14);
        org.springframework.samples.petclinic.owner.PetType petType16 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale17 = null;
        String str18 = petTypeFormatter15.print(petType16, locale17);
        java.util.Locale locale19 = null;
        String str20 = petTypeFormatter10.print(petType16, locale19);
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale22 = null;
        String str23 = petTypeFormatter10.print(petType21, locale22);
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        String str25 = pet24.toString();
        org.springframework.samples.petclinic.owner.PetType petType26 = pet24.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository27 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter28 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository27);
        org.springframework.samples.petclinic.owner.PetType petType29 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale30 = null;
        String str31 = petTypeFormatter28.print(petType29, locale30);
        org.springframework.samples.petclinic.owner.PetType petType32 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale33 = null;
        String str34 = petTypeFormatter28.print(petType32, locale33);
        pet24.setType(petType32);
        org.springframework.samples.petclinic.owner.Owner owner36 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet37 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate38 = pet37.getBirthDate();
        String str39 = pet37.getName();
        owner36.addPet(pet37);
        org.springframework.samples.petclinic.visit.Visit visit41 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int42 = visit41.getPetId();
        pet37.addVisit(visit41);
        java.time.LocalDate localDate44 = visit41.getDate();
        pet24.setBirthDate(localDate44);
        org.springframework.samples.petclinic.owner.PetType petType46 = pet24.getType();
        java.util.Locale locale47 = null;
        String str48 = petTypeFormatter10.print(petType46, locale47);
        pet2.setType(petType46);
        petType46.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        owner0.setCity("");
        Integer int11 = owner0.getId();
        String str12 = owner0.getTelephone();
        String str13 = owner0.getTelephone();
        owner0.setFirstName("hi!");
        String str16 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.visit.Visit visit4 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int5 = visit4.getPetId();
        java.time.LocalDate localDate6 = null;
        visit4.setDate(localDate6);
        java.time.LocalDate localDate8 = null;
        visit4.setDate(localDate8);
        visit4.setDescription("");
        visit4.setPetId((Integer) (-1));
        visit4.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner16 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = pet17.getBirthDate();
        String str19 = pet17.getName();
        owner16.addPet(pet17);
        org.springframework.samples.petclinic.visit.Visit visit21 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int22 = visit21.getPetId();
        pet17.addVisit(visit21);
        java.time.LocalDate localDate24 = visit21.getDate();
        visit4.setDate(localDate24);
        pet0.setBirthDate(localDate24);
        org.springframework.samples.petclinic.owner.PetRepository petRepository27 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter28 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository27);
        org.springframework.samples.petclinic.owner.PetType petType29 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale30 = null;
        String str31 = petTypeFormatter28.print(petType29, locale30);
        org.springframework.samples.petclinic.owner.PetType petType32 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale33 = null;
        String str34 = petTypeFormatter28.print(petType32, locale33);
        org.springframework.samples.petclinic.owner.PetRepository petRepository35 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter36 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository35);
        org.springframework.samples.petclinic.owner.PetType petType37 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale38 = null;
        String str39 = petTypeFormatter36.print(petType37, locale38);
        org.springframework.samples.petclinic.owner.PetRepository petRepository40 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter41 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository40);
        org.springframework.samples.petclinic.owner.PetType petType42 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale43 = null;
        String str44 = petTypeFormatter41.print(petType42, locale43);
        java.util.Locale locale45 = null;
        String str46 = petTypeFormatter36.print(petType42, locale45);
        String str47 = petType42.toString();
        java.util.Locale locale48 = null;
        String str49 = petTypeFormatter28.print(petType42, locale48);
        org.springframework.samples.petclinic.owner.Pet pet50 = new org.springframework.samples.petclinic.owner.Pet();
        String str51 = pet50.toString();
        boolean boolean52 = pet50.isNew();
        org.springframework.samples.petclinic.owner.PetType petType53 = pet50.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository54 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter55 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository54);
        org.springframework.samples.petclinic.owner.PetType petType56 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale57 = null;
        String str58 = petTypeFormatter55.print(petType56, locale57);
        org.springframework.samples.petclinic.owner.PetType petType59 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale60 = null;
        String str61 = petTypeFormatter55.print(petType59, locale60);
        pet50.setType(petType59);
        Integer int63 = petType59.getId();
        java.util.Locale locale64 = null;
        String str65 = petTypeFormatter28.print(petType59, locale64);
        pet0.setType(petType59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        boolean boolean4 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        java.time.LocalDate localDate16 = null;
        pet14.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate20 = pet19.getBirthDate();
        String str21 = pet19.getName();
        owner18.addPet(pet19);
        org.springframework.samples.petclinic.visit.Visit visit23 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int24 = visit23.getPetId();
        pet19.addVisit(visit23);
        Integer int26 = visit23.getPetId();
        Integer int27 = visit23.getPetId();
        boolean boolean28 = visit23.isNew();
        Integer int29 = visit23.getId();
        String str30 = visit23.getDescription();
        pet14.addVisit(visit23);
        pet0.addVisit(visit23);
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        String str34 = pet33.toString();
        java.time.LocalDate localDate35 = null;
        pet33.setBirthDate(localDate35);
        pet33.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType39 = null;
        pet33.setType(petType39);
        org.springframework.samples.petclinic.visit.Visit visit41 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int42 = visit41.getPetId();
        pet33.addVisit(visit41);
        visit41.setDescription("");
        visit41.setDescription("");
        pet0.addVisit(visit41);
        org.springframework.samples.petclinic.owner.Owner owner49 = pet0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner49);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        org.springframework.samples.petclinic.owner.Owner owner3 = pet0.getOwner();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Owner owner6 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = pet7.getBirthDate();
        String str9 = pet7.getName();
        owner6.addPet(pet7);
        org.springframework.samples.petclinic.visit.Visit visit11 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int12 = visit11.getPetId();
        pet7.addVisit(visit11);
        java.time.LocalDate localDate14 = pet7.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit15 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int16 = visit15.getPetId();
        java.time.LocalDate localDate17 = null;
        visit15.setDate(localDate17);
        java.time.LocalDate localDate19 = null;
        visit15.setDate(localDate19);
        pet7.addVisit(visit15);
        pet0.addVisit(visit15);
        String str23 = pet0.toString();
        org.springframework.samples.petclinic.owner.Owner owner24 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner25 = pet0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner25);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository3 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter4 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter4.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.PetType petType8 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale9 = null;
        String str10 = petTypeFormatter4.print(petType8, locale9);
        pet0.setType(petType8);
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        String str13 = pet12.toString();
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet12.setType(petType14);
        boolean boolean16 = pet12.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository17 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter18 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository17);
        org.springframework.samples.petclinic.owner.PetType petType19 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale20 = null;
        String str21 = petTypeFormatter18.print(petType19, locale20);
        org.springframework.samples.petclinic.owner.PetType petType22 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale23 = null;
        String str24 = petTypeFormatter18.print(petType22, locale23);
        pet12.setType(petType22);
        pet0.setType(petType22);
        org.springframework.samples.petclinic.visit.Visit visit27 = new org.springframework.samples.petclinic.visit.Visit();
        String str28 = visit27.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner29 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate31 = pet30.getBirthDate();
        String str32 = pet30.getName();
        owner29.addPet(pet30);
        org.springframework.samples.petclinic.visit.Visit visit34 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int35 = visit34.getPetId();
        pet30.addVisit(visit34);
        Integer int37 = visit34.getPetId();
        Integer int38 = visit34.getPetId();
        boolean boolean39 = visit34.isNew();
        Integer int40 = visit34.getId();
        java.time.LocalDate localDate41 = visit34.getDate();
        visit27.setDate(localDate41);
        pet0.setBirthDate(localDate41);
        String str44 = pet0.toString();
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        String str46 = pet45.toString();
        java.time.LocalDate localDate47 = null;
        pet45.setBirthDate(localDate47);
        java.time.LocalDate localDate49 = pet45.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner50 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet51 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate52 = pet51.getBirthDate();
        String str53 = pet51.getName();
        owner50.addPet(pet51);
        org.springframework.samples.petclinic.visit.Visit visit55 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int56 = visit55.getPetId();
        pet51.addVisit(visit55);
        visit55.setDescription("");
        pet45.addVisit(visit55);
        org.springframework.samples.petclinic.owner.Owner owner61 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet62 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate63 = pet62.getBirthDate();
        String str64 = pet62.getName();
        owner61.addPet(pet62);
        org.springframework.samples.petclinic.visit.Visit visit66 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int67 = visit66.getPetId();
        pet62.addVisit(visit66);
        Integer int69 = visit66.getPetId();
        Integer int70 = visit66.getPetId();
        boolean boolean71 = visit66.isNew();
        Integer int72 = visit66.getId();
        java.time.LocalDate localDate73 = visit66.getDate();
        java.time.LocalDate localDate74 = visit66.getDate();
        visit55.setDate(localDate74);
        pet0.addVisit(visit55);
        java.time.LocalDate localDate77 = pet0.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate77);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        org.springframework.samples.petclinic.owner.Owner owner8 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = pet9.getBirthDate();
        String str11 = pet9.getName();
        owner8.addPet(pet9);
        org.springframework.samples.petclinic.visit.Visit visit13 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int14 = visit13.getPetId();
        pet9.addVisit(visit13);
        visit13.setDescription("");
        java.time.LocalDate localDate18 = visit13.getDate();
        pet5.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.Owner owner20 = pet5.getOwner();
        String str21 = owner20.getFirstName();
        owner20.setAddress("hi!");
        String str24 = owner20.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        boolean boolean4 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        java.time.LocalDate localDate16 = null;
        pet14.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate20 = pet19.getBirthDate();
        String str21 = pet19.getName();
        owner18.addPet(pet19);
        org.springframework.samples.petclinic.visit.Visit visit23 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int24 = visit23.getPetId();
        pet19.addVisit(visit23);
        Integer int26 = visit23.getPetId();
        Integer int27 = visit23.getPetId();
        boolean boolean28 = visit23.isNew();
        Integer int29 = visit23.getId();
        String str30 = visit23.getDescription();
        pet14.addVisit(visit23);
        pet0.addVisit(visit23);
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        String str34 = pet33.toString();
        java.time.LocalDate localDate35 = null;
        pet33.setBirthDate(localDate35);
        pet33.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType39 = null;
        pet33.setType(petType39);
        org.springframework.samples.petclinic.visit.Visit visit41 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int42 = visit41.getPetId();
        pet33.addVisit(visit41);
        visit41.setDescription("");
        visit41.setDescription("");
        pet0.addVisit(visit41);
        pet0.setId((Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) (-1));
        Integer int10 = visit0.getPetId();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        String str12 = pet11.toString();
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet11.setType(petType13);
        String str15 = pet11.toString();
        Integer int16 = pet11.getId();
        java.time.LocalDate localDate17 = pet11.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate19 = pet18.getBirthDate();
        pet18.setName("hi!");
        pet18.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository24 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter25 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository24);
        org.springframework.samples.petclinic.owner.PetRepository petRepository26 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter27 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository26);
        org.springframework.samples.petclinic.owner.PetType petType28 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale29 = null;
        String str30 = petTypeFormatter27.print(petType28, locale29);
        org.springframework.samples.petclinic.owner.PetRepository petRepository31 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter32 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository31);
        org.springframework.samples.petclinic.owner.PetType petType33 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale34 = null;
        String str35 = petTypeFormatter32.print(petType33, locale34);
        org.springframework.samples.petclinic.owner.PetType petType36 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale37 = null;
        String str38 = petTypeFormatter32.print(petType36, locale37);
        java.util.Locale locale39 = null;
        String str40 = petTypeFormatter27.print(petType36, locale39);
        java.util.Locale locale41 = null;
        String str42 = petTypeFormatter25.print(petType36, locale41);
        pet18.setType(petType36);
        org.springframework.samples.petclinic.owner.Owner owner44 = new org.springframework.samples.petclinic.owner.Owner();
        owner44.setLastName("");
        Integer int47 = owner44.getId();
        owner44.setAddress("");
        owner44.setTelephone("");
        String str52 = owner44.getFirstName();
        owner44.setLastName("hi!");
        String str55 = owner44.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet56 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate57 = pet56.getBirthDate();
        pet56.setName("hi!");
        pet56.setId((Integer) 1);
        owner44.addPet(pet56);
        pet56.setName("hi!");
        boolean boolean65 = pet56.isNew();
        org.springframework.samples.petclinic.visit.Visit visit66 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int67 = visit66.getPetId();
        java.time.LocalDate localDate68 = null;
        visit66.setDate(localDate68);
        org.springframework.samples.petclinic.visit.Visit visit70 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int71 = visit70.getPetId();
        java.time.LocalDate localDate72 = null;
        visit70.setDate(localDate72);
        java.time.LocalDate localDate74 = null;
        visit70.setDate(localDate74);
        visit70.setDescription("");
        visit70.setPetId((Integer) (-1));
        visit70.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner82 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet83 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate84 = pet83.getBirthDate();
        String str85 = pet83.getName();
        owner82.addPet(pet83);
        org.springframework.samples.petclinic.visit.Visit visit87 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int88 = visit87.getPetId();
        pet83.addVisit(visit87);
        java.time.LocalDate localDate90 = visit87.getDate();
        visit70.setDate(localDate90);
        visit66.setDate(localDate90);
        pet56.setBirthDate(localDate90);
        pet18.setBirthDate(localDate90);
        pet11.setBirthDate(localDate90);
        visit0.setDate(localDate90);
        java.time.LocalDate localDate97 = visit0.getDate();
        String str98 = visit0.getDescription();
        java.time.LocalDate localDate99 = visit0.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "" + "'", str98.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate99);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        java.time.LocalDate localDate8 = pet5.getBirthDate();
        java.time.LocalDate localDate9 = pet5.getBirthDate();
        pet5.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType12 = pet5.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType12);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("");
        String str8 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet11 = owner0.getPet("", false);
        owner0.setLastName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet11);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        String str4 = pet0.getName();
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        visit5.setPetId((Integer) 10);
        org.springframework.samples.petclinic.visit.Visit visit8 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int9 = visit8.getPetId();
        java.time.LocalDate localDate10 = null;
        visit8.setDate(localDate10);
        java.time.LocalDate localDate12 = null;
        visit8.setDate(localDate12);
        org.springframework.samples.petclinic.owner.Owner owner14 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate16 = pet15.getBirthDate();
        String str17 = pet15.getName();
        owner14.addPet(pet15);
        org.springframework.samples.petclinic.visit.Visit visit19 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int20 = visit19.getPetId();
        pet15.addVisit(visit19);
        java.time.LocalDate localDate22 = visit19.getDate();
        visit8.setDate(localDate22);
        visit5.setDate(localDate22);
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        String str26 = pet25.toString();
        java.time.LocalDate localDate27 = null;
        pet25.setBirthDate(localDate27);
        String str29 = pet25.getName();
        org.springframework.samples.petclinic.owner.Owner owner30 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate32 = pet31.getBirthDate();
        String str33 = pet31.getName();
        owner30.addPet(pet31);
        org.springframework.samples.petclinic.visit.Visit visit35 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int36 = visit35.getPetId();
        pet31.addVisit(visit35);
        Integer int38 = visit35.getPetId();
        String str39 = visit35.getDescription();
        java.time.LocalDate localDate40 = visit35.getDate();
        pet25.addVisit(visit35);
        Integer int42 = visit35.getPetId();
        java.time.LocalDate localDate43 = visit35.getDate();
        visit5.setDate(localDate43);
        pet0.addVisit(visit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate43);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        String str7 = vet0.getLastName();
        int int8 = vet0.getNrOfSpecialties();
        int int9 = vet0.getNrOfSpecialties();
        int int10 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty11 = null;
        vet0.addSpecialty(specialty11);
        org.springframework.samples.petclinic.vet.Specialty specialty13 = null;
        vet0.addSpecialty(specialty13);
        org.springframework.samples.petclinic.vet.Specialty specialty15 = null;
        vet0.addSpecialty(specialty15);
        int int17 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        boolean boolean4 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        java.time.LocalDate localDate16 = null;
        pet14.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate20 = pet19.getBirthDate();
        String str21 = pet19.getName();
        owner18.addPet(pet19);
        org.springframework.samples.petclinic.visit.Visit visit23 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int24 = visit23.getPetId();
        pet19.addVisit(visit23);
        Integer int26 = visit23.getPetId();
        Integer int27 = visit23.getPetId();
        boolean boolean28 = visit23.isNew();
        Integer int29 = visit23.getId();
        String str30 = visit23.getDescription();
        pet14.addVisit(visit23);
        pet0.addVisit(visit23);
        java.time.LocalDate localDate33 = pet0.getBirthDate();
        java.time.LocalDate localDate34 = pet0.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate34);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        Integer int7 = pet0.getId();
        pet0.setId((Integer) (-1));
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        boolean boolean12 = pet10.isNew();
        owner0.addPet(pet10);
        org.springframework.samples.petclinic.visit.Visit visit14 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int15 = visit14.getPetId();
        pet10.addVisit(visit14);
        Integer int17 = visit14.getPetId();
        Integer int18 = visit14.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getFirstName();
        owner0.setLastName("hi!");
        String str11 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        pet12.setName("hi!");
        pet12.setId((Integer) 1);
        owner0.addPet(pet12);
        pet12.setName("hi!");
        boolean boolean21 = pet12.isNew();
        org.springframework.samples.petclinic.visit.Visit visit22 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int23 = visit22.getPetId();
        java.time.LocalDate localDate24 = null;
        visit22.setDate(localDate24);
        org.springframework.samples.petclinic.visit.Visit visit26 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int27 = visit26.getPetId();
        java.time.LocalDate localDate28 = null;
        visit26.setDate(localDate28);
        java.time.LocalDate localDate30 = null;
        visit26.setDate(localDate30);
        visit26.setDescription("");
        visit26.setPetId((Integer) (-1));
        visit26.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner38 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet39 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate40 = pet39.getBirthDate();
        String str41 = pet39.getName();
        owner38.addPet(pet39);
        org.springframework.samples.petclinic.visit.Visit visit43 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int44 = visit43.getPetId();
        pet39.addVisit(visit43);
        java.time.LocalDate localDate46 = visit43.getDate();
        visit26.setDate(localDate46);
        visit22.setDate(localDate46);
        pet12.setBirthDate(localDate46);
        pet12.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType52 = pet12.getType();
        java.time.LocalDate localDate53 = null;
        pet12.setBirthDate(localDate53);
        org.springframework.samples.petclinic.owner.PetType petType55 = pet12.getType();
        // The following exception was thrown during execution in test generation
        try {
            String str56 = petType55.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType55);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        boolean boolean12 = pet10.isNew();
        owner0.addPet(pet10);
        owner0.setAddress("hi!");
        String str16 = owner0.getCity();
        String str17 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        org.springframework.samples.petclinic.visit.Visit visit3 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int4 = visit3.getPetId();
        java.time.LocalDate localDate5 = null;
        visit3.setDate(localDate5);
        org.springframework.samples.petclinic.visit.Visit visit7 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int8 = visit7.getPetId();
        java.time.LocalDate localDate9 = null;
        visit7.setDate(localDate9);
        java.time.LocalDate localDate11 = null;
        visit7.setDate(localDate11);
        visit7.setDescription("");
        visit7.setPetId((Integer) (-1));
        visit7.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner19 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = pet20.getBirthDate();
        String str22 = pet20.getName();
        owner19.addPet(pet20);
        org.springframework.samples.petclinic.visit.Visit visit24 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int25 = visit24.getPetId();
        pet20.addVisit(visit24);
        java.time.LocalDate localDate27 = visit24.getDate();
        visit7.setDate(localDate27);
        visit3.setDate(localDate27);
        pet0.setBirthDate(localDate27);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        String str32 = pet31.toString();
        org.springframework.samples.petclinic.owner.PetType petType33 = null;
        pet31.setType(petType33);
        org.springframework.samples.petclinic.visit.Visit visit35 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int36 = visit35.getPetId();
        java.time.LocalDate localDate37 = null;
        visit35.setDate(localDate37);
        org.springframework.samples.petclinic.visit.Visit visit39 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int40 = visit39.getPetId();
        java.time.LocalDate localDate41 = null;
        visit39.setDate(localDate41);
        java.time.LocalDate localDate43 = null;
        visit39.setDate(localDate43);
        visit39.setDescription("");
        visit39.setPetId((Integer) (-1));
        visit39.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner51 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet52 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate53 = pet52.getBirthDate();
        String str54 = pet52.getName();
        owner51.addPet(pet52);
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int57 = visit56.getPetId();
        pet52.addVisit(visit56);
        java.time.LocalDate localDate59 = visit56.getDate();
        visit39.setDate(localDate59);
        visit35.setDate(localDate59);
        visit35.setDescription("");
        pet31.addVisit(visit35);
        org.springframework.samples.petclinic.owner.Owner owner65 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet66 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate67 = pet66.getBirthDate();
        String str68 = pet66.getName();
        owner65.addPet(pet66);
        org.springframework.samples.petclinic.visit.Visit visit70 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int71 = visit70.getPetId();
        pet66.addVisit(visit70);
        visit70.setDescription("");
        java.time.LocalDate localDate75 = visit70.getDate();
        visit35.setDate(localDate75);
        pet0.setBirthDate(localDate75);
        org.springframework.samples.petclinic.owner.Owner owner78 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType79 = pet0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType79);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        owner1.setLastName("");
        Integer int4 = owner1.getId();
        owner1.setAddress("");
        owner1.setTelephone("");
        String str9 = owner1.getFirstName();
        owner1.setLastName("hi!");
        String str12 = owner1.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate14 = pet13.getBirthDate();
        pet13.setName("hi!");
        pet13.setId((Integer) 1);
        owner1.addPet(pet13);
        org.springframework.samples.petclinic.owner.Owner owner20 = pet13.getOwner();
        String str21 = pet13.toString();
        org.springframework.samples.petclinic.owner.Pet pet22 = new org.springframework.samples.petclinic.owner.Pet();
        String str23 = pet22.toString();
        org.springframework.samples.petclinic.owner.PetType petType24 = pet22.getType();
        java.time.LocalDate localDate25 = pet22.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner26 = pet22.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType27 = pet22.getType();
        java.time.LocalDate localDate28 = pet22.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType29 = pet22.getType();
        org.springframework.samples.petclinic.owner.Owner owner30 = new org.springframework.samples.petclinic.owner.Owner();
        owner30.setLastName("");
        Integer int33 = owner30.getId();
        owner30.setAddress("");
        owner30.setTelephone("");
        String str38 = owner30.getFirstName();
        owner30.setLastName("hi!");
        String str41 = owner30.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet42 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate43 = pet42.getBirthDate();
        pet42.setName("hi!");
        pet42.setId((Integer) 1);
        owner30.addPet(pet42);
        pet42.setName("hi!");
        boolean boolean51 = pet42.isNew();
        org.springframework.samples.petclinic.visit.Visit visit52 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int53 = visit52.getPetId();
        java.time.LocalDate localDate54 = null;
        visit52.setDate(localDate54);
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int57 = visit56.getPetId();
        java.time.LocalDate localDate58 = null;
        visit56.setDate(localDate58);
        java.time.LocalDate localDate60 = null;
        visit56.setDate(localDate60);
        visit56.setDescription("");
        visit56.setPetId((Integer) (-1));
        visit56.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner68 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet69 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate70 = pet69.getBirthDate();
        String str71 = pet69.getName();
        owner68.addPet(pet69);
        org.springframework.samples.petclinic.visit.Visit visit73 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int74 = visit73.getPetId();
        pet69.addVisit(visit73);
        java.time.LocalDate localDate76 = visit73.getDate();
        visit56.setDate(localDate76);
        visit52.setDate(localDate76);
        pet42.setBirthDate(localDate76);
        pet22.setBirthDate(localDate76);
        pet13.setBirthDate(localDate76);
        org.springframework.validation.Errors errors82 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) localDate76, errors82);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.time.LocalDate cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.time.LocalDate is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate76);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        org.springframework.samples.petclinic.owner.PetType petType4 = pet0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType4);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty2 = null;
        vet0.addSpecialty(specialty2);
        vet0.setFirstName("hi!");
        int int6 = vet0.getNrOfSpecialties();
        int int7 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        String str9 = owner0.getLastName();
        String str10 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getFirstName();
        owner0.setAddress("hi!");
        String str11 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        String str8 = visit5.getDescription();
        visit5.setPetId((Integer) (-1));
        java.time.LocalDate localDate11 = visit5.getDate();
        visit5.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        boolean boolean5 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Owner owner6 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = pet7.getBirthDate();
        String str9 = pet7.getName();
        owner6.addPet(pet7);
        String str11 = pet7.toString();
        owner0.addPet(pet7);
        org.springframework.samples.petclinic.owner.PetType petType13 = pet7.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType13);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setId((Integer) 1);
        String str6 = pet0.getName();
        Class<?> wildcardClass7 = pet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetRepository petRepository2 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter3 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository2);
        org.springframework.samples.petclinic.owner.PetType petType4 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale5 = null;
        String str6 = petTypeFormatter3.print(petType4, locale5);
        org.springframework.samples.petclinic.owner.PetRepository petRepository7 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter8 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository7);
        org.springframework.samples.petclinic.owner.PetType petType9 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale10 = null;
        String str11 = petTypeFormatter8.print(petType9, locale10);
        org.springframework.samples.petclinic.owner.PetType petType12 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale13 = null;
        String str14 = petTypeFormatter8.print(petType12, locale13);
        java.util.Locale locale15 = null;
        String str16 = petTypeFormatter3.print(petType12, locale15);
        java.util.Locale locale17 = null;
        String str18 = petTypeFormatter1.print(petType12, locale17);
        org.springframework.samples.petclinic.owner.PetRepository petRepository19 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter20 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository19);
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale22 = null;
        String str23 = petTypeFormatter20.print(petType21, locale22);
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale25 = null;
        String str26 = petTypeFormatter20.print(petType24, locale25);
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale28 = null;
        String str29 = petTypeFormatter20.print(petType27, locale28);
        org.springframework.samples.petclinic.owner.PetRepository petRepository30 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter31 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository30);
        org.springframework.samples.petclinic.owner.PetType petType32 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale33 = null;
        String str34 = petTypeFormatter31.print(petType32, locale33);
        org.springframework.samples.petclinic.owner.PetRepository petRepository35 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter36 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository35);
        org.springframework.samples.petclinic.owner.PetType petType37 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale38 = null;
        String str39 = petTypeFormatter36.print(petType37, locale38);
        java.util.Locale locale40 = null;
        String str41 = petTypeFormatter31.print(petType37, locale40);
        java.util.Locale locale42 = null;
        String str43 = petTypeFormatter20.print(petType37, locale42);
        java.util.Locale locale44 = null;
        String str45 = petTypeFormatter1.print(petType37, locale44);
        org.springframework.samples.petclinic.owner.PetRepository petRepository46 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter47 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository46);
        org.springframework.samples.petclinic.owner.PetType petType48 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale49 = null;
        String str50 = petTypeFormatter47.print(petType48, locale49);
        org.springframework.samples.petclinic.owner.PetType petType51 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale52 = null;
        String str53 = petTypeFormatter47.print(petType51, locale52);
        org.springframework.samples.petclinic.owner.PetType petType54 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale55 = null;
        String str56 = petTypeFormatter47.print(petType54, locale55);
        boolean boolean57 = petType54.isNew();
        java.util.Locale locale58 = null;
        String str59 = petTypeFormatter1.print(petType54, locale58);
        String str60 = petType54.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("", false);
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        String str6 = owner5.getAddress();
        owner5.setCity("hi!");
        owner5.setFirstName("");
        String str11 = owner5.getFirstName();
        String str12 = owner5.getAddress();
        owner5.setFirstName("hi!");
        owner5.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        String str4 = pet0.getName();
        Integer int5 = pet0.getId();
        org.springframework.samples.petclinic.owner.Owner owner6 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = pet7.getBirthDate();
        String str9 = pet7.getName();
        owner6.addPet(pet7);
        org.springframework.samples.petclinic.visit.Visit visit11 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int12 = visit11.getPetId();
        pet7.addVisit(visit11);
        Integer int14 = visit11.getPetId();
        Integer int15 = visit11.getPetId();
        String str16 = visit11.getDescription();
        java.time.LocalDate localDate17 = visit11.getDate();
        pet0.setBirthDate(localDate17);
        org.springframework.samples.petclinic.owner.PetType petType19 = pet0.getType();
        pet0.setName("");
        boolean boolean22 = pet0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setName("hi!");
        pet0.setName("");
        pet0.setName("");
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner13 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate15 = pet14.getBirthDate();
        String str16 = pet14.getName();
        owner13.addPet(pet14);
        org.springframework.samples.petclinic.visit.Visit visit18 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int19 = visit18.getPetId();
        pet14.addVisit(visit18);
        String str21 = visit18.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner22 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate24 = pet23.getBirthDate();
        String str25 = pet23.getName();
        owner22.addPet(pet23);
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        String str28 = pet27.toString();
        owner22.addPet(pet27);
        org.springframework.samples.petclinic.owner.Owner owner30 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate32 = pet31.getBirthDate();
        String str33 = pet31.getName();
        owner30.addPet(pet31);
        org.springframework.samples.petclinic.visit.Visit visit35 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int36 = visit35.getPetId();
        pet31.addVisit(visit35);
        visit35.setDescription("");
        java.time.LocalDate localDate40 = visit35.getDate();
        pet27.setBirthDate(localDate40);
        visit18.setDate(localDate40);
        boolean boolean43 = visit18.isNew();
        String str44 = visit18.getDescription();
        pet0.addVisit(visit18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        String str5 = pet4.toString();
        java.time.LocalDate localDate6 = null;
        pet4.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Owner owner8 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = pet9.getBirthDate();
        String str11 = pet9.getName();
        owner8.addPet(pet9);
        org.springframework.samples.petclinic.visit.Visit visit13 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int14 = visit13.getPetId();
        pet9.addVisit(visit13);
        Integer int16 = visit13.getPetId();
        Integer int17 = visit13.getPetId();
        boolean boolean18 = visit13.isNew();
        Integer int19 = visit13.getId();
        String str20 = visit13.getDescription();
        pet4.addVisit(visit13);
        visit13.setDescription("hi!");
        pet0.addVisit(visit13);
        org.springframework.samples.petclinic.owner.Owner owner25 = pet0.getOwner();
        java.time.LocalDate localDate26 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner27 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetRepository petRepository28 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter29 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository28);
        org.springframework.samples.petclinic.owner.PetType petType30 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale31 = null;
        String str32 = petTypeFormatter29.print(petType30, locale31);
        org.springframework.samples.petclinic.owner.PetRepository petRepository33 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter34 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository33);
        org.springframework.samples.petclinic.owner.PetType petType35 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale36 = null;
        String str37 = petTypeFormatter34.print(petType35, locale36);
        String str38 = petType35.getName();
        Integer int39 = petType35.getId();
        java.util.Locale locale40 = null;
        String str41 = petTypeFormatter29.print(petType35, locale40);
        pet0.setType(petType35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository3 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter4 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter4.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.PetType petType8 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale9 = null;
        String str10 = petTypeFormatter4.print(petType8, locale9);
        pet0.setType(petType8);
        org.springframework.samples.petclinic.owner.Owner owner12 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate14 = pet13.getBirthDate();
        String str15 = pet13.getName();
        owner12.addPet(pet13);
        org.springframework.samples.petclinic.visit.Visit visit17 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int18 = visit17.getPetId();
        pet13.addVisit(visit17);
        java.time.LocalDate localDate20 = visit17.getDate();
        pet0.setBirthDate(localDate20);
        org.springframework.samples.petclinic.owner.PetType petType22 = pet0.getType();
        org.springframework.samples.petclinic.owner.Owner owner23 = pet0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner23);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getCity();
        owner0.setFirstName("hi!");
        String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        org.springframework.samples.petclinic.visit.Visit visit10 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int11 = visit10.getPetId();
        pet6.addVisit(visit10);
        visit10.setDescription("");
        pet0.addVisit(visit10);
        org.springframework.samples.petclinic.owner.Owner owner16 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = pet17.getBirthDate();
        String str19 = pet17.getName();
        owner16.addPet(pet17);
        org.springframework.samples.petclinic.visit.Visit visit21 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int22 = visit21.getPetId();
        pet17.addVisit(visit21);
        Integer int24 = visit21.getPetId();
        Integer int25 = visit21.getPetId();
        boolean boolean26 = visit21.isNew();
        Integer int27 = visit21.getId();
        java.time.LocalDate localDate28 = visit21.getDate();
        java.time.LocalDate localDate29 = visit21.getDate();
        visit10.setDate(localDate29);
        visit10.setPetId((Integer) (-1));
        Class<?> wildcardClass33 = visit10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        boolean boolean5 = owner0.isNew();
        String str6 = owner0.getFirstName();
        String str7 = owner0.getLastName();
        owner0.setLastName("hi!");
        owner0.setTelephone("");
        String str12 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        Integer int8 = visit5.getPetId();
        String str9 = visit5.getDescription();
        Integer int10 = visit5.getPetId();
        java.time.LocalDate localDate11 = visit5.getDate();
        visit5.setDescription("");
        Integer int14 = visit5.getPetId();
        Integer int15 = visit5.getPetId();
        visit5.setPetId((Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter1.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        String str9 = pet8.toString();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet8.setType(petType10);
        boolean boolean12 = pet8.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository13 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter14 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository13);
        org.springframework.samples.petclinic.owner.PetType petType15 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale16 = null;
        String str17 = petTypeFormatter14.print(petType15, locale16);
        org.springframework.samples.petclinic.owner.PetType petType18 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale19 = null;
        String str20 = petTypeFormatter14.print(petType18, locale19);
        pet8.setType(petType18);
        petType18.setName("");
        java.util.Locale locale24 = null;
        String str25 = petTypeFormatter1.print(petType18, locale24);
        org.springframework.samples.petclinic.owner.PetRepository petRepository26 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter27 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository26);
        org.springframework.samples.petclinic.owner.PetType petType28 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale29 = null;
        String str30 = petTypeFormatter27.print(petType28, locale29);
        org.springframework.samples.petclinic.owner.PetRepository petRepository31 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter32 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository31);
        org.springframework.samples.petclinic.owner.PetType petType33 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale34 = null;
        String str35 = petTypeFormatter32.print(petType33, locale34);
        java.util.Locale locale36 = null;
        String str37 = petTypeFormatter27.print(petType33, locale36);
        org.springframework.samples.petclinic.owner.PetType petType38 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale39 = null;
        String str40 = petTypeFormatter27.print(petType38, locale39);
        org.springframework.samples.petclinic.owner.PetRepository petRepository41 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter42 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository41);
        org.springframework.samples.petclinic.owner.PetType petType43 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale44 = null;
        String str45 = petTypeFormatter42.print(petType43, locale44);
        org.springframework.samples.petclinic.owner.PetRepository petRepository46 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter47 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository46);
        org.springframework.samples.petclinic.owner.PetType petType48 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale49 = null;
        String str50 = petTypeFormatter47.print(petType48, locale49);
        org.springframework.samples.petclinic.owner.PetType petType51 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale52 = null;
        String str53 = petTypeFormatter47.print(petType51, locale52);
        java.util.Locale locale54 = null;
        String str55 = petTypeFormatter42.print(petType51, locale54);
        String str56 = petType51.toString();
        java.util.Locale locale57 = null;
        String str58 = petTypeFormatter27.print(petType51, locale57);
        org.springframework.samples.petclinic.owner.Pet pet59 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate60 = pet59.getBirthDate();
        pet59.setName("hi!");
        pet59.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository65 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter66 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository65);
        org.springframework.samples.petclinic.owner.PetRepository petRepository67 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter68 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository67);
        org.springframework.samples.petclinic.owner.PetType petType69 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale70 = null;
        String str71 = petTypeFormatter68.print(petType69, locale70);
        org.springframework.samples.petclinic.owner.PetRepository petRepository72 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter73 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository72);
        org.springframework.samples.petclinic.owner.PetType petType74 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale75 = null;
        String str76 = petTypeFormatter73.print(petType74, locale75);
        org.springframework.samples.petclinic.owner.PetType petType77 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale78 = null;
        String str79 = petTypeFormatter73.print(petType77, locale78);
        java.util.Locale locale80 = null;
        String str81 = petTypeFormatter68.print(petType77, locale80);
        java.util.Locale locale82 = null;
        String str83 = petTypeFormatter66.print(petType77, locale82);
        pet59.setType(petType77);
        java.util.Locale locale85 = null;
        String str86 = petTypeFormatter27.print(petType77, locale85);
        java.util.Locale locale87 = null;
        String str88 = petTypeFormatter1.print(petType77, locale87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        String str9 = owner0.getFirstName();
        owner0.setCity("");
        owner0.setId((Integer) 1);
        owner0.setTelephone("");
        owner0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        boolean boolean12 = pet10.isNew();
        owner0.addPet(pet10);
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet18 = owner0.getPet("", true);
        org.springframework.samples.petclinic.owner.Owner owner19 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = pet20.getBirthDate();
        String str22 = pet20.getName();
        owner19.addPet(pet20);
        owner19.setFirstName("hi!");
        String str26 = owner19.getTelephone();
        owner19.setTelephone("hi!");
        String str29 = owner19.getFirstName();
        String str30 = owner19.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        String str32 = pet31.toString();
        java.time.LocalDate localDate33 = null;
        pet31.setBirthDate(localDate33);
        pet31.setId((Integer) 1);
        owner19.addPet(pet31);
        owner0.addPet(pet31);
        org.springframework.samples.petclinic.owner.Owner owner39 = pet31.getOwner();
        pet31.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner39);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        String str9 = pet8.toString();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet8.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository11 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter12 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository11);
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale14 = null;
        String str15 = petTypeFormatter12.print(petType13, locale14);
        org.springframework.samples.petclinic.owner.PetType petType16 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale17 = null;
        String str18 = petTypeFormatter12.print(petType16, locale17);
        pet8.setType(petType16);
        org.springframework.samples.petclinic.owner.Owner owner20 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate22 = pet21.getBirthDate();
        String str23 = pet21.getName();
        owner20.addPet(pet21);
        org.springframework.samples.petclinic.visit.Visit visit25 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int26 = visit25.getPetId();
        pet21.addVisit(visit25);
        java.time.LocalDate localDate28 = visit25.getDate();
        pet8.setBirthDate(localDate28);
        org.springframework.samples.petclinic.visit.Visit visit30 = new org.springframework.samples.petclinic.visit.Visit();
        String str31 = visit30.getDescription();
        pet8.addVisit(visit30);
        pet0.addVisit(visit30);
        Integer int34 = visit30.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int34);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        org.springframework.samples.petclinic.owner.Owner owner6 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = pet7.getBirthDate();
        String str9 = pet7.getName();
        owner6.addPet(pet7);
        org.springframework.samples.petclinic.visit.Visit visit11 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int12 = visit11.getPetId();
        pet7.addVisit(visit11);
        java.time.LocalDate localDate14 = visit11.getDate();
        visit0.setDate(localDate14);
        visit0.setPetId((Integer) 0);
        String str18 = visit0.getDescription();
        Integer int19 = visit0.getPetId();
        visit0.setPetId((Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19.equals(0));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setCity("");
        String str7 = owner0.getFirstName();
        owner0.setAddress("hi!");
        owner0.setTelephone("");
        owner0.setLastName("hi!");
        String str14 = owner0.getTelephone();
        String str15 = owner0.getCity();
        owner0.setLastName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        boolean boolean8 = visit5.isNew();
        Integer int9 = visit5.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!", true);
        owner0.setTelephone("");
        String str10 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        String str12 = pet11.toString();
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet11.setType(petType13);
        String str15 = pet11.getName();
        boolean boolean16 = pet11.isNew();
        String str17 = pet11.getName();
        owner0.addPet(pet11);
        owner0.setTelephone("hi!");
        owner0.setCity("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        org.springframework.samples.petclinic.owner.Owner owner6 = pet0.getOwner();
        org.springframework.samples.petclinic.visit.Visit visit7 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int8 = visit7.getPetId();
        java.time.LocalDate localDate9 = null;
        visit7.setDate(localDate9);
        java.time.LocalDate localDate11 = null;
        visit7.setDate(localDate11);
        visit7.setDescription("");
        visit7.setPetId((Integer) 10);
        pet0.addVisit(visit7);
        java.time.LocalDate localDate18 = visit7.getDate();
        boolean boolean19 = visit7.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        String str9 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Owner owner13 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate15 = pet14.getBirthDate();
        String str16 = pet14.getName();
        owner13.addPet(pet14);
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate20 = pet19.getBirthDate();
        String str21 = pet19.getName();
        owner18.addPet(pet19);
        org.springframework.samples.petclinic.visit.Visit visit23 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int24 = visit23.getPetId();
        pet19.addVisit(visit23);
        Integer int26 = visit23.getPetId();
        Integer int27 = visit23.getPetId();
        boolean boolean28 = visit23.isNew();
        Integer int29 = visit23.getId();
        java.time.LocalDate localDate30 = visit23.getDate();
        visit23.setPetId((Integer) 1);
        visit23.setPetId((Integer) 0);
        java.time.LocalDate localDate35 = visit23.getDate();
        pet14.setBirthDate(localDate35);
        owner0.addPet(pet14);
        Class<?> wildcardClass38 = pet14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        boolean boolean6 = owner5.isNew();
        owner5.setLastName("");
        String str9 = owner5.getCity();
        owner5.setFirstName("hi!");
        org.springframework.samples.petclinic.owner.Owner owner12 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate14 = pet13.getBirthDate();
        String str15 = pet13.getName();
        owner12.addPet(pet13);
        owner12.setFirstName("hi!");
        owner12.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        String str22 = pet21.toString();
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet21.setType(petType23);
        boolean boolean25 = pet21.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository26 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter27 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository26);
        org.springframework.samples.petclinic.owner.PetType petType28 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale29 = null;
        String str30 = petTypeFormatter27.print(petType28, locale29);
        org.springframework.samples.petclinic.owner.PetType petType31 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale32 = null;
        String str33 = petTypeFormatter27.print(petType31, locale32);
        pet21.setType(petType31);
        owner12.addPet(pet21);
        Integer int36 = pet21.getId();
        owner5.addPet(pet21);
        String str38 = owner5.getAddress();
        String str39 = owner5.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.visit.Visit visit1 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int2 = visit1.getPetId();
        java.time.LocalDate localDate3 = null;
        visit1.setDate(localDate3);
        java.time.LocalDate localDate5 = null;
        visit1.setDate(localDate5);
        visit1.setDescription("");
        visit1.setPetId((Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        String str12 = pet11.toString();
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet11.setType(petType13);
        org.springframework.samples.petclinic.visit.Visit visit15 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int16 = visit15.getPetId();
        java.time.LocalDate localDate17 = null;
        visit15.setDate(localDate17);
        org.springframework.samples.petclinic.visit.Visit visit19 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int20 = visit19.getPetId();
        java.time.LocalDate localDate21 = null;
        visit19.setDate(localDate21);
        java.time.LocalDate localDate23 = null;
        visit19.setDate(localDate23);
        visit19.setDescription("");
        visit19.setPetId((Integer) (-1));
        visit19.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner31 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet32 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate33 = pet32.getBirthDate();
        String str34 = pet32.getName();
        owner31.addPet(pet32);
        org.springframework.samples.petclinic.visit.Visit visit36 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int37 = visit36.getPetId();
        pet32.addVisit(visit36);
        java.time.LocalDate localDate39 = visit36.getDate();
        visit19.setDate(localDate39);
        visit15.setDate(localDate39);
        visit15.setDescription("");
        pet11.addVisit(visit15);
        org.springframework.samples.petclinic.owner.Owner owner45 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet46 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate47 = pet46.getBirthDate();
        String str48 = pet46.getName();
        owner45.addPet(pet46);
        org.springframework.samples.petclinic.visit.Visit visit50 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int51 = visit50.getPetId();
        pet46.addVisit(visit50);
        visit50.setDescription("");
        java.time.LocalDate localDate55 = visit50.getDate();
        visit15.setDate(localDate55);
        visit1.setDate(localDate55);
        visit1.setPetId((Integer) 100);
        org.springframework.validation.Errors errors60 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) 100, errors60);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Integer is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate55);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        String str4 = pet0.getName();
        Integer int5 = pet0.getId();
        org.springframework.samples.petclinic.owner.Owner owner6 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = pet7.getBirthDate();
        String str9 = pet7.getName();
        owner6.addPet(pet7);
        org.springframework.samples.petclinic.visit.Visit visit11 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int12 = visit11.getPetId();
        pet7.addVisit(visit11);
        Integer int14 = visit11.getPetId();
        Integer int15 = visit11.getPetId();
        String str16 = visit11.getDescription();
        java.time.LocalDate localDate17 = visit11.getDate();
        pet0.setBirthDate(localDate17);
        pet0.setId((Integer) 0);
        boolean boolean21 = pet0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        owner0.setCity("");
        Integer int11 = owner0.getId();
        String str12 = owner0.getTelephone();
        String str13 = owner0.getTelephone();
        String str14 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        org.springframework.samples.petclinic.owner.Owner owner8 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = pet9.getBirthDate();
        String str11 = pet9.getName();
        owner8.addPet(pet9);
        org.springframework.samples.petclinic.visit.Visit visit13 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int14 = visit13.getPetId();
        pet9.addVisit(visit13);
        visit13.setDescription("");
        java.time.LocalDate localDate18 = visit13.getDate();
        pet5.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.Owner owner20 = pet5.getOwner();
        String str21 = owner20.getFirstName();
        owner20.setAddress("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        Integer int2 = visit0.getPetId();
        java.time.LocalDate localDate3 = visit0.getDate();
        visit0.setDescription("hi!");
        Integer int6 = visit0.getPetId();
        Integer int7 = visit0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        String str10 = pet9.toString();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet9.setType(petType11);
        String str13 = pet9.getName();
        owner0.addPet(pet9);
        String str15 = owner0.getFirstName();
        owner0.setId((Integer) 100);
        String str18 = owner0.getCity();
        Integer int19 = owner0.getId();
        String str20 = owner0.getLastName();
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        boolean boolean6 = owner5.isNew();
        String str7 = owner5.getTelephone();
        String str8 = owner5.getTelephone();
        String str9 = owner5.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository3 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter4 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter4.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.PetType petType8 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale9 = null;
        String str10 = petTypeFormatter4.print(petType8, locale9);
        pet0.setType(petType8);
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        String str13 = pet12.toString();
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet12.setType(petType14);
        boolean boolean16 = pet12.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository17 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter18 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository17);
        org.springframework.samples.petclinic.owner.PetType petType19 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale20 = null;
        String str21 = petTypeFormatter18.print(petType19, locale20);
        org.springframework.samples.petclinic.owner.PetType petType22 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale23 = null;
        String str24 = petTypeFormatter18.print(petType22, locale23);
        pet12.setType(petType22);
        pet0.setType(petType22);
        org.springframework.samples.petclinic.visit.Visit visit27 = new org.springframework.samples.petclinic.visit.Visit();
        String str28 = visit27.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner29 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate31 = pet30.getBirthDate();
        String str32 = pet30.getName();
        owner29.addPet(pet30);
        org.springframework.samples.petclinic.visit.Visit visit34 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int35 = visit34.getPetId();
        pet30.addVisit(visit34);
        Integer int37 = visit34.getPetId();
        Integer int38 = visit34.getPetId();
        boolean boolean39 = visit34.isNew();
        Integer int40 = visit34.getId();
        java.time.LocalDate localDate41 = visit34.getDate();
        visit27.setDate(localDate41);
        pet0.setBirthDate(localDate41);
        String str44 = pet0.toString();
        String str45 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType46 = pet0.getType();
        petType46.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType46);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        java.time.LocalDate localDate8 = visit0.getDate();
        visit0.setId((Integer) 10);
        String str11 = visit0.getDescription();
        java.time.LocalDate localDate12 = visit0.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        owner0.setCity("");
        owner0.setTelephone("");
        String str9 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("hi!");
        owner0.setId((Integer) (-1));
        String str14 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet5.setType(petType7);
        boolean boolean9 = pet5.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository10 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter11 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository10);
        org.springframework.samples.petclinic.owner.PetType petType12 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale13 = null;
        String str14 = petTypeFormatter11.print(petType12, locale13);
        org.springframework.samples.petclinic.owner.PetType petType15 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale16 = null;
        String str17 = petTypeFormatter11.print(petType15, locale16);
        pet5.setType(petType15);
        pet0.setType(petType15);
        String str20 = pet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        visit0.setPetId((Integer) 10);
        org.springframework.samples.petclinic.visit.Visit visit3 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int4 = visit3.getPetId();
        java.time.LocalDate localDate5 = null;
        visit3.setDate(localDate5);
        java.time.LocalDate localDate7 = null;
        visit3.setDate(localDate7);
        org.springframework.samples.petclinic.owner.Owner owner9 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = pet10.getBirthDate();
        String str12 = pet10.getName();
        owner9.addPet(pet10);
        org.springframework.samples.petclinic.visit.Visit visit14 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int15 = visit14.getPetId();
        pet10.addVisit(visit14);
        java.time.LocalDate localDate17 = visit14.getDate();
        visit3.setDate(localDate17);
        visit0.setDate(localDate17);
        String str20 = visit0.getDescription();
        visit0.setPetId((Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        java.time.LocalDate localDate5 = pet1.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet1.getType();
        pet1.setName("");
        org.springframework.samples.petclinic.owner.Owner owner9 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = pet10.getBirthDate();
        String str12 = pet10.getName();
        owner9.addPet(pet10);
        org.springframework.samples.petclinic.visit.Visit visit14 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int15 = visit14.getPetId();
        pet10.addVisit(visit14);
        Integer int17 = visit14.getPetId();
        Integer int18 = visit14.getPetId();
        String str19 = visit14.getDescription();
        java.time.LocalDate localDate20 = visit14.getDate();
        java.time.LocalDate localDate21 = visit14.getDate();
        pet1.addVisit(visit14);
        pet1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        owner0.setTelephone("hi!");
        owner0.setLastName("");
        String str12 = owner0.getFirstName();
        owner0.setTelephone("");
        owner0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner7 = pet0.getOwner();
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        org.springframework.samples.petclinic.visit.Visit visit8 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int9 = visit8.getPetId();
        pet0.addVisit(visit8);
        visit8.setDescription("");
        org.springframework.samples.petclinic.owner.Owner owner13 = new org.springframework.samples.petclinic.owner.Owner();
        owner13.setLastName("");
        Integer int16 = owner13.getId();
        owner13.setAddress("");
        owner13.setTelephone("");
        String str21 = owner13.getFirstName();
        owner13.setLastName("hi!");
        String str24 = owner13.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate26 = pet25.getBirthDate();
        pet25.setName("hi!");
        pet25.setId((Integer) 1);
        owner13.addPet(pet25);
        pet25.setName("hi!");
        boolean boolean34 = pet25.isNew();
        org.springframework.samples.petclinic.visit.Visit visit35 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int36 = visit35.getPetId();
        java.time.LocalDate localDate37 = null;
        visit35.setDate(localDate37);
        org.springframework.samples.petclinic.visit.Visit visit39 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int40 = visit39.getPetId();
        java.time.LocalDate localDate41 = null;
        visit39.setDate(localDate41);
        java.time.LocalDate localDate43 = null;
        visit39.setDate(localDate43);
        visit39.setDescription("");
        visit39.setPetId((Integer) (-1));
        visit39.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner51 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet52 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate53 = pet52.getBirthDate();
        String str54 = pet52.getName();
        owner51.addPet(pet52);
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int57 = visit56.getPetId();
        pet52.addVisit(visit56);
        java.time.LocalDate localDate59 = visit56.getDate();
        visit39.setDate(localDate59);
        visit35.setDate(localDate59);
        pet25.setBirthDate(localDate59);
        org.springframework.samples.petclinic.visit.Visit visit63 = new org.springframework.samples.petclinic.visit.Visit();
        org.springframework.samples.petclinic.owner.Owner owner64 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet65 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate66 = pet65.getBirthDate();
        String str67 = pet65.getName();
        owner64.addPet(pet65);
        org.springframework.samples.petclinic.visit.Visit visit69 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int70 = visit69.getPetId();
        pet65.addVisit(visit69);
        java.time.LocalDate localDate72 = visit69.getDate();
        visit63.setDate(localDate72);
        pet25.setBirthDate(localDate72);
        visit8.setDate(localDate72);
        visit8.setPetId((Integer) (-1));
        boolean boolean78 = visit8.isNew();
        Integer int79 = visit8.getPetId();
        String str80 = visit8.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setPetId((Integer) 0);
        visit0.setId((Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        java.time.LocalDate localDate12 = null;
        pet10.setBirthDate(localDate12);
        java.time.LocalDate localDate14 = pet10.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner15 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate17 = pet16.getBirthDate();
        String str18 = pet16.getName();
        owner15.addPet(pet16);
        org.springframework.samples.petclinic.visit.Visit visit20 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int21 = visit20.getPetId();
        pet16.addVisit(visit20);
        visit20.setDescription("");
        pet10.addVisit(visit20);
        visit20.setPetId((Integer) 10);
        java.time.LocalDate localDate28 = visit20.getDate();
        org.springframework.samples.petclinic.visit.Visit visit29 = new org.springframework.samples.petclinic.visit.Visit();
        String str30 = visit29.getDescription();
        String str31 = visit29.getDescription();
        java.time.LocalDate localDate32 = visit29.getDate();
        String str33 = visit29.getDescription();
        java.time.LocalDate localDate34 = visit29.getDate();
        visit20.setDate(localDate34);
        visit0.setDate(localDate34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        boolean boolean12 = pet10.isNew();
        owner0.addPet(pet10);
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet18 = owner0.getPet("", true);
        owner0.setTelephone("hi!");
        String str21 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.springframework.samples.petclinic.vet.Vets vets0 = new org.springframework.samples.petclinic.vet.Vets();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList1 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList2 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList3 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList4 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList5 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList6 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList7 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList8 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList9 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList10 = vets0.getVetList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList10);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        String str2 = pet1.toString();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet1.getType();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet1.getOwner();
        pet1.setName("");
        org.springframework.samples.petclinic.owner.Owner owner7 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate9 = pet8.getBirthDate();
        String str10 = pet8.getName();
        owner7.addPet(pet8);
        org.springframework.samples.petclinic.visit.Visit visit12 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int13 = visit12.getPetId();
        pet8.addVisit(visit12);
        java.time.LocalDate localDate15 = pet8.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit16 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int17 = visit16.getPetId();
        java.time.LocalDate localDate18 = null;
        visit16.setDate(localDate18);
        java.time.LocalDate localDate20 = null;
        visit16.setDate(localDate20);
        pet8.addVisit(visit16);
        pet1.addVisit(visit16);
        Integer int24 = visit16.getPetId();
        Integer int25 = visit16.getPetId();
        Integer int26 = visit16.getPetId();
        org.springframework.validation.Errors errors27 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) visit16, errors27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.visit.Visit cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.visit.Visit and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        Integer int8 = visit5.getPetId();
        String str9 = visit5.getDescription();
        Integer int10 = visit5.getPetId();
        java.time.LocalDate localDate11 = visit5.getDate();
        visit5.setDescription("");
        visit5.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        String str4 = pet3.toString();
        java.time.LocalDate localDate5 = null;
        pet3.setBirthDate(localDate5);
        String str7 = pet3.getName();
        owner0.addPet(pet3);
        String str9 = owner0.getAddress();
        String str10 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet6);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        boolean boolean12 = pet10.isNew();
        owner0.addPet(pet10);
        owner0.setTelephone("hi!");
        owner0.setLastName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        boolean boolean12 = pet10.isNew();
        owner0.addPet(pet10);
        org.springframework.samples.petclinic.visit.Visit visit14 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int15 = visit14.getPetId();
        pet10.addVisit(visit14);
        String str17 = pet10.getName();
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        owner18.setId((Integer) 1);
        String str21 = owner18.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet23 = owner18.getPet("hi!");
        String str24 = owner18.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        String str26 = pet25.toString();
        org.springframework.samples.petclinic.owner.PetType petType27 = pet25.getType();
        java.time.LocalDate localDate28 = pet25.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner29 = pet25.getOwner();
        String str30 = pet25.toString();
        pet25.setName("hi!");
        pet25.setName("");
        pet25.setName("");
        pet25.setName("hi!");
        owner18.addPet(pet25);
        org.springframework.samples.petclinic.owner.PetRepository petRepository40 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter41 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository40);
        org.springframework.samples.petclinic.owner.PetType petType42 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale43 = null;
        String str44 = petTypeFormatter41.print(petType42, locale43);
        org.springframework.samples.petclinic.owner.PetRepository petRepository45 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter46 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository45);
        org.springframework.samples.petclinic.owner.PetType petType47 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale48 = null;
        String str49 = petTypeFormatter46.print(petType47, locale48);
        java.util.Locale locale50 = null;
        String str51 = petTypeFormatter41.print(petType47, locale50);
        org.springframework.samples.petclinic.owner.PetType petType52 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale53 = null;
        String str54 = petTypeFormatter41.print(petType52, locale53);
        org.springframework.samples.petclinic.owner.PetRepository petRepository55 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter56 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository55);
        org.springframework.samples.petclinic.owner.PetType petType57 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale58 = null;
        String str59 = petTypeFormatter56.print(petType57, locale58);
        org.springframework.samples.petclinic.owner.PetRepository petRepository60 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter61 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository60);
        org.springframework.samples.petclinic.owner.PetType petType62 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale63 = null;
        String str64 = petTypeFormatter61.print(petType62, locale63);
        org.springframework.samples.petclinic.owner.PetType petType65 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale66 = null;
        String str67 = petTypeFormatter61.print(petType65, locale66);
        java.util.Locale locale68 = null;
        String str69 = petTypeFormatter56.print(petType65, locale68);
        String str70 = petType65.toString();
        java.util.Locale locale71 = null;
        String str72 = petTypeFormatter41.print(petType65, locale71);
        String str73 = petType65.toString();
        pet25.setType(petType65);
        petType65.setId((Integer) 1);
        pet10.setType(petType65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        pet0.setName("hi!");
        String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        owner5.setFirstName("hi!");
        owner5.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet14.setType(petType16);
        boolean boolean18 = pet14.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository19 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter20 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository19);
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale22 = null;
        String str23 = petTypeFormatter20.print(petType21, locale22);
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale25 = null;
        String str26 = petTypeFormatter20.print(petType24, locale25);
        pet14.setType(petType24);
        owner5.addPet(pet14);
        Integer int29 = pet14.getId();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        String str31 = pet30.toString();
        org.springframework.samples.petclinic.owner.PetType petType32 = pet30.getType();
        java.time.LocalDate localDate33 = pet30.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner34 = pet30.getOwner();
        String str35 = pet30.toString();
        java.time.LocalDate localDate36 = pet30.getBirthDate();
        Integer int37 = pet30.getId();
        org.springframework.samples.petclinic.visit.Visit visit38 = new org.springframework.samples.petclinic.visit.Visit();
        visit38.setPetId((Integer) 10);
        org.springframework.samples.petclinic.visit.Visit visit41 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int42 = visit41.getPetId();
        java.time.LocalDate localDate43 = null;
        visit41.setDate(localDate43);
        java.time.LocalDate localDate45 = null;
        visit41.setDate(localDate45);
        org.springframework.samples.petclinic.owner.Owner owner47 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet48 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate49 = pet48.getBirthDate();
        String str50 = pet48.getName();
        owner47.addPet(pet48);
        org.springframework.samples.petclinic.visit.Visit visit52 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int53 = visit52.getPetId();
        pet48.addVisit(visit52);
        java.time.LocalDate localDate55 = visit52.getDate();
        visit41.setDate(localDate55);
        visit38.setDate(localDate55);
        pet30.setBirthDate(localDate55);
        pet14.setBirthDate(localDate55);
        pet0.setBirthDate(localDate55);
        org.springframework.samples.petclinic.owner.Owner owner61 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet62 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate63 = pet62.getBirthDate();
        String str64 = pet62.getName();
        owner61.addPet(pet62);
        org.springframework.samples.petclinic.visit.Visit visit66 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int67 = visit66.getPetId();
        pet62.addVisit(visit66);
        java.time.LocalDate localDate69 = visit66.getDate();
        visit66.setPetId((Integer) 1);
        String str72 = visit66.getDescription();
        java.time.LocalDate localDate73 = visit66.getDate();
        pet0.addVisit(visit66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate73);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate3 = pet2.getBirthDate();
        String str4 = pet2.getName();
        owner1.addPet(pet2);
        java.time.LocalDate localDate6 = pet2.getBirthDate();
        boolean boolean7 = pet2.isNew();
        org.springframework.samples.petclinic.owner.PetType petType8 = new org.springframework.samples.petclinic.owner.PetType();
        pet2.setType(petType8);
        org.springframework.samples.petclinic.owner.PetType petType10 = pet2.getType();
        java.time.LocalDate localDate11 = pet2.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner12 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate14 = pet13.getBirthDate();
        String str15 = pet13.getName();
        owner12.addPet(pet13);
        java.time.LocalDate localDate17 = pet13.getBirthDate();
        boolean boolean18 = pet13.isNew();
        org.springframework.samples.petclinic.owner.Owner owner19 = new org.springframework.samples.petclinic.owner.Owner();
        owner19.setLastName("");
        Integer int22 = owner19.getId();
        owner19.setAddress("");
        String str25 = owner19.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet27 = owner19.getPet("hi!");
        String str28 = owner19.getFirstName();
        owner19.setCity("");
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate32 = pet31.getBirthDate();
        owner19.addPet(pet31);
        org.springframework.samples.petclinic.owner.Pet pet34 = new org.springframework.samples.petclinic.owner.Pet();
        String str35 = pet34.toString();
        org.springframework.samples.petclinic.owner.PetType petType36 = pet34.getType();
        org.springframework.samples.petclinic.visit.Visit visit37 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int38 = visit37.getPetId();
        java.time.LocalDate localDate39 = null;
        visit37.setDate(localDate39);
        org.springframework.samples.petclinic.visit.Visit visit41 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int42 = visit41.getPetId();
        java.time.LocalDate localDate43 = null;
        visit41.setDate(localDate43);
        java.time.LocalDate localDate45 = null;
        visit41.setDate(localDate45);
        visit41.setDescription("");
        visit41.setPetId((Integer) (-1));
        visit41.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner53 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet54 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate55 = pet54.getBirthDate();
        String str56 = pet54.getName();
        owner53.addPet(pet54);
        org.springframework.samples.petclinic.visit.Visit visit58 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int59 = visit58.getPetId();
        pet54.addVisit(visit58);
        java.time.LocalDate localDate61 = visit58.getDate();
        visit41.setDate(localDate61);
        visit37.setDate(localDate61);
        pet34.setBirthDate(localDate61);
        pet31.setBirthDate(localDate61);
        pet13.setBirthDate(localDate61);
        pet2.setBirthDate(localDate61);
        org.springframework.samples.petclinic.owner.Pet pet68 = new org.springframework.samples.petclinic.owner.Pet();
        String str69 = pet68.toString();
        org.springframework.samples.petclinic.owner.PetType petType70 = pet68.getType();
        org.springframework.samples.petclinic.owner.Owner owner71 = pet68.getOwner();
        pet68.setName("");
        org.springframework.samples.petclinic.owner.Owner owner74 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet75 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate76 = pet75.getBirthDate();
        String str77 = pet75.getName();
        owner74.addPet(pet75);
        org.springframework.samples.petclinic.visit.Visit visit79 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int80 = visit79.getPetId();
        pet75.addVisit(visit79);
        java.time.LocalDate localDate82 = pet75.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit83 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int84 = visit83.getPetId();
        java.time.LocalDate localDate85 = null;
        visit83.setDate(localDate85);
        java.time.LocalDate localDate87 = null;
        visit83.setDate(localDate87);
        pet75.addVisit(visit83);
        pet68.addVisit(visit83);
        String str91 = visit83.getDescription();
        java.time.LocalDate localDate92 = visit83.getDate();
        pet2.addVisit(visit83);
        org.springframework.validation.Errors errors94 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) visit83, errors94);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.visit.Visit cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.visit.Visit and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate92);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        String str1 = visit0.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner2 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate4 = pet3.getBirthDate();
        String str5 = pet3.getName();
        owner2.addPet(pet3);
        org.springframework.samples.petclinic.visit.Visit visit7 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int8 = visit7.getPetId();
        pet3.addVisit(visit7);
        Integer int10 = visit7.getPetId();
        Integer int11 = visit7.getPetId();
        boolean boolean12 = visit7.isNew();
        Integer int13 = visit7.getId();
        java.time.LocalDate localDate14 = visit7.getDate();
        visit0.setDate(localDate14);
        visit0.setDescription("hi!");
        visit0.setId((Integer) 10);
        boolean boolean20 = visit0.isNew();
        String str21 = visit0.getDescription();
        visit0.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        java.util.Locale locale13 = null;
        String str14 = petTypeFormatter1.print(petType10, locale13);
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        String str16 = pet15.toString();
        org.springframework.samples.petclinic.owner.PetType petType17 = null;
        pet15.setType(petType17);
        String str19 = pet15.getName();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        String str21 = pet20.toString();
        org.springframework.samples.petclinic.owner.PetType petType22 = null;
        pet20.setType(petType22);
        boolean boolean24 = pet20.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository25 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter26 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository25);
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale28 = null;
        String str29 = petTypeFormatter26.print(petType27, locale28);
        org.springframework.samples.petclinic.owner.PetType petType30 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale31 = null;
        String str32 = petTypeFormatter26.print(petType30, locale31);
        pet20.setType(petType30);
        pet15.setType(petType30);
        petType30.setName("");
        java.util.Locale locale37 = null;
        String str38 = petTypeFormatter1.print(petType30, locale37);
        org.springframework.samples.petclinic.owner.Pet pet39 = new org.springframework.samples.petclinic.owner.Pet();
        String str40 = pet39.toString();
        org.springframework.samples.petclinic.owner.PetType petType41 = pet39.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository42 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter43 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository42);
        org.springframework.samples.petclinic.owner.PetType petType44 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale45 = null;
        String str46 = petTypeFormatter43.print(petType44, locale45);
        org.springframework.samples.petclinic.owner.PetType petType47 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale48 = null;
        String str49 = petTypeFormatter43.print(petType47, locale48);
        pet39.setType(petType47);
        org.springframework.samples.petclinic.owner.Owner owner51 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet52 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate53 = pet52.getBirthDate();
        String str54 = pet52.getName();
        owner51.addPet(pet52);
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int57 = visit56.getPetId();
        pet52.addVisit(visit56);
        java.time.LocalDate localDate59 = visit56.getDate();
        pet39.setBirthDate(localDate59);
        org.springframework.samples.petclinic.owner.PetType petType61 = pet39.getType();
        petType61.setName("");
        java.util.Locale locale64 = null;
        String str65 = petTypeFormatter1.print(petType61, locale64);
        org.springframework.samples.petclinic.owner.PetType petType66 = new org.springframework.samples.petclinic.owner.PetType();
        boolean boolean67 = petType66.isNew();
        java.util.Locale locale68 = null;
        String str69 = petTypeFormatter1.print(petType66, locale68);
        java.util.Locale locale71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType72 = petTypeFormatter1.parse("hi!", locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter1.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.PetRepository petRepository8 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter9 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter9.print(petType10, locale11);
        org.springframework.samples.petclinic.owner.PetRepository petRepository13 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter14 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository13);
        org.springframework.samples.petclinic.owner.PetType petType15 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale16 = null;
        String str17 = petTypeFormatter14.print(petType15, locale16);
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter9.print(petType15, locale18);
        String str20 = petType15.toString();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter1.print(petType15, locale21);
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        String str24 = pet23.toString();
        boolean boolean25 = pet23.isNew();
        org.springframework.samples.petclinic.owner.PetType petType26 = pet23.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository27 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter28 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository27);
        org.springframework.samples.petclinic.owner.PetType petType29 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale30 = null;
        String str31 = petTypeFormatter28.print(petType29, locale30);
        org.springframework.samples.petclinic.owner.PetType petType32 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale33 = null;
        String str34 = petTypeFormatter28.print(petType32, locale33);
        pet23.setType(petType32);
        Integer int36 = petType32.getId();
        java.util.Locale locale37 = null;
        String str38 = petTypeFormatter1.print(petType32, locale37);
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType41 = petTypeFormatter1.parse("hi!", locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        String str4 = pet3.toString();
        java.time.LocalDate localDate5 = null;
        pet3.setBirthDate(localDate5);
        String str7 = pet3.getName();
        owner0.addPet(pet3);
        owner0.setCity("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        String str9 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        org.springframework.samples.petclinic.owner.Owner owner4 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = pet5.getBirthDate();
        String str7 = pet5.getName();
        owner4.addPet(pet5);
        org.springframework.samples.petclinic.visit.Visit visit9 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int10 = visit9.getPetId();
        pet5.addVisit(visit9);
        Integer int12 = visit9.getPetId();
        Integer int13 = visit9.getPetId();
        boolean boolean14 = visit9.isNew();
        Integer int15 = visit9.getId();
        String str16 = visit9.getDescription();
        pet0.addVisit(visit9);
        org.springframework.samples.petclinic.owner.PetType petType18 = pet0.getType();
        String str19 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        boolean boolean21 = petType20.isNew();
        pet0.setType(petType20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        String str8 = owner0.getLastName();
        owner0.setFirstName("");
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("", true);
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet13);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        org.springframework.samples.petclinic.owner.Owner owner8 = pet5.getOwner();
        String str9 = owner8.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = pet10.getBirthDate();
        String str12 = pet10.getName();
        org.springframework.samples.petclinic.visit.Visit visit13 = new org.springframework.samples.petclinic.visit.Visit();
        visit13.setDescription("hi!");
        String str16 = visit13.getDescription();
        java.time.LocalDate localDate17 = visit13.getDate();
        pet10.setBirthDate(localDate17);
        owner8.addPet(pet10);
        java.time.LocalDate localDate20 = pet10.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        owner0.setLastName("hi!");
        owner0.setTelephone("");
        owner0.setCity("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        owner0.setCity("");
        Integer int11 = owner0.getId();
        org.springframework.samples.petclinic.owner.Owner owner12 = new org.springframework.samples.petclinic.owner.Owner();
        owner12.setLastName("");
        Integer int15 = owner12.getId();
        owner12.setAddress("");
        owner12.setTelephone("");
        String str20 = owner12.getFirstName();
        owner12.setLastName("hi!");
        String str23 = owner12.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate25 = pet24.getBirthDate();
        pet24.setName("hi!");
        pet24.setId((Integer) 1);
        owner12.addPet(pet24);
        owner0.addPet(pet24);
        org.springframework.samples.petclinic.owner.Pet pet32 = new org.springframework.samples.petclinic.owner.Pet();
        String str33 = pet32.toString();
        org.springframework.samples.petclinic.owner.PetType petType34 = pet32.getType();
        java.time.LocalDate localDate35 = pet32.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner36 = pet32.getOwner();
        String str37 = pet32.toString();
        pet32.setName("hi!");
        pet32.setName("");
        String str42 = pet32.toString();
        owner0.addPet(pet32);
        org.springframework.samples.petclinic.owner.PetRepository petRepository44 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter45 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository44);
        org.springframework.samples.petclinic.owner.PetType petType46 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale47 = null;
        String str48 = petTypeFormatter45.print(petType46, locale47);
        String str49 = petType46.getName();
        Integer int50 = petType46.getId();
        pet32.setType(petType46);
        petType46.setId((Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int50);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        owner0.setAddress("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        String str7 = vet0.getLastName();
        int int8 = vet0.getNrOfSpecialties();
        int int9 = vet0.getNrOfSpecialties();
        int int10 = vet0.getNrOfSpecialties();
        Integer int11 = vet0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11.equals(0));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        String str11 = pet10.toString();
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet10.setType(petType12);
        org.springframework.samples.petclinic.visit.Visit visit14 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int15 = visit14.getPetId();
        java.time.LocalDate localDate16 = null;
        visit14.setDate(localDate16);
        org.springframework.samples.petclinic.visit.Visit visit18 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int19 = visit18.getPetId();
        java.time.LocalDate localDate20 = null;
        visit18.setDate(localDate20);
        java.time.LocalDate localDate22 = null;
        visit18.setDate(localDate22);
        visit18.setDescription("");
        visit18.setPetId((Integer) (-1));
        visit18.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner30 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate32 = pet31.getBirthDate();
        String str33 = pet31.getName();
        owner30.addPet(pet31);
        org.springframework.samples.petclinic.visit.Visit visit35 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int36 = visit35.getPetId();
        pet31.addVisit(visit35);
        java.time.LocalDate localDate38 = visit35.getDate();
        visit18.setDate(localDate38);
        visit14.setDate(localDate38);
        visit14.setDescription("");
        pet10.addVisit(visit14);
        org.springframework.samples.petclinic.owner.Owner owner44 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate46 = pet45.getBirthDate();
        String str47 = pet45.getName();
        owner44.addPet(pet45);
        org.springframework.samples.petclinic.visit.Visit visit49 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int50 = visit49.getPetId();
        pet45.addVisit(visit49);
        visit49.setDescription("");
        java.time.LocalDate localDate54 = visit49.getDate();
        visit14.setDate(localDate54);
        visit0.setDate(localDate54);
        visit0.setPetId((Integer) 100);
        java.time.LocalDate localDate59 = visit0.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate59);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = visit0.getDate();
        visit0.setId((Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate4);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getFirstName();
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        String str12 = pet11.toString();
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet11.setType(petType13);
        String str15 = pet11.toString();
        pet11.setId((Integer) 10);
        owner0.addPet(pet11);
        String str19 = owner0.getFirstName();
        String str20 = owner0.getFirstName();
        String str21 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        String str5 = owner0.getTelephone();
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        Integer int11 = owner0.getId();
        String str12 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        String str9 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("hi!", false);
        owner0.setAddress("");
        String str15 = owner0.getAddress();
        owner0.setTelephone("");
        owner0.setTelephone("");
        String str20 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        java.time.LocalDate localDate8 = pet1.getBirthDate();
        String str9 = pet1.toString();
        java.time.LocalDate localDate10 = pet1.getBirthDate();
        org.springframework.samples.petclinic.owner.PetRepository petRepository11 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter12 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository11);
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale14 = null;
        String str15 = petTypeFormatter12.print(petType13, locale14);
        org.springframework.samples.petclinic.owner.PetRepository petRepository16 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter17 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository16);
        org.springframework.samples.petclinic.owner.PetType petType18 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale19 = null;
        String str20 = petTypeFormatter17.print(petType18, locale19);
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale22 = null;
        String str23 = petTypeFormatter17.print(petType21, locale22);
        java.util.Locale locale24 = null;
        String str25 = petTypeFormatter12.print(petType21, locale24);
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        String str27 = pet26.toString();
        org.springframework.samples.petclinic.owner.PetType petType28 = null;
        pet26.setType(petType28);
        String str30 = pet26.getName();
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        String str32 = pet31.toString();
        org.springframework.samples.petclinic.owner.PetType petType33 = null;
        pet31.setType(petType33);
        boolean boolean35 = pet31.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository36 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter37 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository36);
        org.springframework.samples.petclinic.owner.PetType petType38 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale39 = null;
        String str40 = petTypeFormatter37.print(petType38, locale39);
        org.springframework.samples.petclinic.owner.PetType petType41 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale42 = null;
        String str43 = petTypeFormatter37.print(petType41, locale42);
        pet31.setType(petType41);
        pet26.setType(petType41);
        petType41.setName("");
        java.util.Locale locale48 = null;
        String str49 = petTypeFormatter12.print(petType41, locale48);
        pet1.setType(petType41);
        pet1.setName("hi!");
        String str53 = pet1.getName();
        Integer int54 = pet1.getId();
        pet1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int54);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate3 = pet2.getBirthDate();
        String str4 = pet2.getName();
        owner1.addPet(pet2);
        owner1.setFirstName("hi!");
        String str8 = owner1.getAddress();
        String str9 = owner1.getAddress();
        String str10 = owner1.getLastName();
        boolean boolean11 = owner1.isNew();
        org.springframework.validation.Errors errors12 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) owner1, errors12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.owner.Owner cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.owner.Owner and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        String str9 = owner0.getTelephone();
        owner0.setTelephone("");
        owner0.setTelephone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner7 = pet0.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            Integer int8 = owner7.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner7);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        Integer int7 = pet0.getId();
        pet0.setId((Integer) (-1));
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate12 = pet11.getBirthDate();
        String str13 = pet11.getName();
        owner10.addPet(pet11);
        org.springframework.samples.petclinic.owner.Owner owner15 = pet11.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner16 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = pet17.getBirthDate();
        String str19 = pet17.getName();
        owner16.addPet(pet17);
        org.springframework.samples.petclinic.visit.Visit visit21 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int22 = visit21.getPetId();
        pet17.addVisit(visit21);
        String str24 = visit21.getDescription();
        visit21.setPetId((Integer) (-1));
        pet11.addVisit(visit21);
        String str28 = visit21.getDescription();
        visit21.setPetId((Integer) 0);
        pet0.addVisit(visit21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        owner5.setFirstName("hi!");
        owner5.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet14.setType(petType16);
        boolean boolean18 = pet14.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository19 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter20 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository19);
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale22 = null;
        String str23 = petTypeFormatter20.print(petType21, locale22);
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale25 = null;
        String str26 = petTypeFormatter20.print(petType24, locale25);
        pet14.setType(petType24);
        owner5.addPet(pet14);
        owner0.addPet(pet14);
        org.springframework.samples.petclinic.owner.Owner owner30 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate32 = pet31.getBirthDate();
        String str33 = pet31.getName();
        owner30.addPet(pet31);
        org.springframework.samples.petclinic.visit.Visit visit35 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int36 = visit35.getPetId();
        pet31.addVisit(visit35);
        Integer int38 = visit35.getPetId();
        Integer int39 = visit35.getPetId();
        boolean boolean40 = visit35.isNew();
        Integer int41 = visit35.getId();
        Integer int42 = visit35.getPetId();
        org.springframework.samples.petclinic.owner.Owner owner43 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet44 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate45 = pet44.getBirthDate();
        String str46 = pet44.getName();
        owner43.addPet(pet44);
        org.springframework.samples.petclinic.visit.Visit visit48 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int49 = visit48.getPetId();
        pet44.addVisit(visit48);
        Integer int51 = visit48.getPetId();
        String str52 = visit48.getDescription();
        Integer int53 = visit48.getPetId();
        java.time.LocalDate localDate54 = visit48.getDate();
        visit35.setDate(localDate54);
        pet14.addVisit(visit35);
        visit35.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate54);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        vet0.setLastName("");
        vet0.setLastName("hi!");
        org.springframework.samples.petclinic.vet.Specialty specialty7 = null;
        vet0.addSpecialty(specialty7);
        org.springframework.samples.petclinic.vet.Specialty specialty9 = null;
        vet0.addSpecialty(specialty9);
        org.springframework.samples.petclinic.vet.Specialty specialty11 = null;
        vet0.addSpecialty(specialty11);
        int int13 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        pet0.setId((Integer) 10);
        String str7 = pet0.toString();
        String str8 = pet0.toString();
        String str9 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty2 = null;
        vet0.addSpecialty(specialty2);
        vet0.setFirstName("hi!");
        int int6 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty7 = null;
        vet0.addSpecialty(specialty7);
        vet0.setFirstName("");
        org.springframework.samples.petclinic.vet.Specialty specialty11 = null;
        vet0.addSpecialty(specialty11);
        boolean boolean13 = vet0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        org.springframework.samples.petclinic.owner.Owner owner8 = pet5.getOwner();
        owner8.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner8);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        visit0.setDescription("hi!");
        String str3 = visit0.getDescription();
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        boolean boolean6 = visit0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        boolean boolean5 = owner0.isNew();
        String str6 = owner0.getFirstName();
        String str7 = owner0.getLastName();
        owner0.setTelephone("hi!");
        String str10 = owner0.getFirstName();
        owner0.setAddress("hi!");
        owner0.setLastName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) 1);
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate12 = pet11.getBirthDate();
        String str13 = pet11.getName();
        owner10.addPet(pet11);
        java.time.LocalDate localDate15 = pet11.getBirthDate();
        boolean boolean16 = pet11.isNew();
        org.springframework.samples.petclinic.owner.Owner owner17 = new org.springframework.samples.petclinic.owner.Owner();
        owner17.setLastName("");
        Integer int20 = owner17.getId();
        owner17.setAddress("");
        String str23 = owner17.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet25 = owner17.getPet("hi!");
        String str26 = owner17.getFirstName();
        owner17.setCity("");
        org.springframework.samples.petclinic.owner.Pet pet29 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate30 = pet29.getBirthDate();
        owner17.addPet(pet29);
        org.springframework.samples.petclinic.owner.Pet pet32 = new org.springframework.samples.petclinic.owner.Pet();
        String str33 = pet32.toString();
        org.springframework.samples.petclinic.owner.PetType petType34 = pet32.getType();
        org.springframework.samples.petclinic.visit.Visit visit35 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int36 = visit35.getPetId();
        java.time.LocalDate localDate37 = null;
        visit35.setDate(localDate37);
        org.springframework.samples.petclinic.visit.Visit visit39 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int40 = visit39.getPetId();
        java.time.LocalDate localDate41 = null;
        visit39.setDate(localDate41);
        java.time.LocalDate localDate43 = null;
        visit39.setDate(localDate43);
        visit39.setDescription("");
        visit39.setPetId((Integer) (-1));
        visit39.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner51 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet52 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate53 = pet52.getBirthDate();
        String str54 = pet52.getName();
        owner51.addPet(pet52);
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int57 = visit56.getPetId();
        pet52.addVisit(visit56);
        java.time.LocalDate localDate59 = visit56.getDate();
        visit39.setDate(localDate59);
        visit35.setDate(localDate59);
        pet32.setBirthDate(localDate59);
        pet29.setBirthDate(localDate59);
        pet11.setBirthDate(localDate59);
        visit0.setDate(localDate59);
        java.time.LocalDate localDate66 = visit0.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate66);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        java.time.LocalDate localDate5 = pet1.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet1.getType();
        String str7 = pet1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        visit0.setDescription("");
        org.springframework.samples.petclinic.owner.Owner owner4 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = pet5.getBirthDate();
        String str7 = pet5.getName();
        owner4.addPet(pet5);
        org.springframework.samples.petclinic.visit.Visit visit9 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int10 = visit9.getPetId();
        pet5.addVisit(visit9);
        String str12 = visit9.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner13 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate15 = pet14.getBirthDate();
        String str16 = pet14.getName();
        owner13.addPet(pet14);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        String str19 = pet18.toString();
        owner13.addPet(pet18);
        org.springframework.samples.petclinic.owner.Owner owner21 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet22 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate23 = pet22.getBirthDate();
        String str24 = pet22.getName();
        owner21.addPet(pet22);
        org.springframework.samples.petclinic.visit.Visit visit26 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int27 = visit26.getPetId();
        pet22.addVisit(visit26);
        visit26.setDescription("");
        java.time.LocalDate localDate31 = visit26.getDate();
        pet18.setBirthDate(localDate31);
        visit9.setDate(localDate31);
        visit9.setPetId((Integer) 0);
        String str36 = visit9.getDescription();
        org.springframework.samples.petclinic.owner.Pet pet37 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate38 = pet37.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner39 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet40 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate41 = pet40.getBirthDate();
        String str42 = pet40.getName();
        owner39.addPet(pet40);
        org.springframework.samples.petclinic.visit.Visit visit44 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int45 = visit44.getPetId();
        pet40.addVisit(visit44);
        visit44.setDescription("");
        java.time.LocalDate localDate49 = visit44.getDate();
        pet37.setBirthDate(localDate49);
        java.time.LocalDate localDate51 = pet37.getBirthDate();
        visit9.setDate(localDate51);
        visit0.setDate(localDate51);
        String str54 = visit0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getCity();
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        java.time.LocalDate localDate8 = null;
        visit5.setDate(localDate8);
        visit5.setDescription("hi!");
        java.time.LocalDate localDate12 = visit5.getDate();
        String str13 = visit5.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet5.setType(petType7);
        boolean boolean9 = pet5.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository10 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter11 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository10);
        org.springframework.samples.petclinic.owner.PetType petType12 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale13 = null;
        String str14 = petTypeFormatter11.print(petType12, locale13);
        org.springframework.samples.petclinic.owner.PetType petType15 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale16 = null;
        String str17 = petTypeFormatter11.print(petType15, locale16);
        pet5.setType(petType15);
        pet0.setType(petType15);
        String str20 = petType15.getName();
        boolean boolean21 = petType15.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        owner0.setAddress("hi!");
        owner0.setFirstName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        org.springframework.samples.petclinic.visit.Visit visit10 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int11 = visit10.getPetId();
        pet6.addVisit(visit10);
        visit10.setDescription("");
        pet0.addVisit(visit10);
        String str16 = pet0.toString();
        String str17 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        java.util.Locale locale13 = null;
        String str14 = petTypeFormatter1.print(petType10, locale13);
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        String str16 = pet15.toString();
        org.springframework.samples.petclinic.owner.PetType petType17 = null;
        pet15.setType(petType17);
        String str19 = pet15.getName();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        String str21 = pet20.toString();
        org.springframework.samples.petclinic.owner.PetType petType22 = null;
        pet20.setType(petType22);
        boolean boolean24 = pet20.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository25 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter26 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository25);
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale28 = null;
        String str29 = petTypeFormatter26.print(petType27, locale28);
        org.springframework.samples.petclinic.owner.PetType petType30 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale31 = null;
        String str32 = petTypeFormatter26.print(petType30, locale31);
        pet20.setType(petType30);
        pet15.setType(petType30);
        petType30.setName("");
        java.util.Locale locale37 = null;
        String str38 = petTypeFormatter1.print(petType30, locale37);
        org.springframework.samples.petclinic.owner.Owner owner39 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet40 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate41 = pet40.getBirthDate();
        String str42 = pet40.getName();
        owner39.addPet(pet40);
        java.time.LocalDate localDate44 = pet40.getBirthDate();
        boolean boolean45 = pet40.isNew();
        org.springframework.samples.petclinic.owner.PetType petType46 = new org.springframework.samples.petclinic.owner.PetType();
        pet40.setType(petType46);
        org.springframework.samples.petclinic.owner.PetType petType48 = pet40.getType();
        java.util.Locale locale49 = null;
        String str50 = petTypeFormatter1.print(petType48, locale49);
        org.springframework.samples.petclinic.owner.PetRepository petRepository51 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter52 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository51);
        org.springframework.samples.petclinic.owner.PetType petType53 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale54 = null;
        String str55 = petTypeFormatter52.print(petType53, locale54);
        org.springframework.samples.petclinic.owner.PetType petType56 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale57 = null;
        String str58 = petTypeFormatter52.print(petType56, locale57);
        org.springframework.samples.petclinic.owner.PetRepository petRepository59 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter60 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository59);
        org.springframework.samples.petclinic.owner.PetType petType61 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale62 = null;
        String str63 = petTypeFormatter60.print(petType61, locale62);
        org.springframework.samples.petclinic.owner.PetRepository petRepository64 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter65 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository64);
        org.springframework.samples.petclinic.owner.PetType petType66 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale67 = null;
        String str68 = petTypeFormatter65.print(petType66, locale67);
        java.util.Locale locale69 = null;
        String str70 = petTypeFormatter60.print(petType66, locale69);
        String str71 = petType66.toString();
        java.util.Locale locale72 = null;
        String str73 = petTypeFormatter52.print(petType66, locale72);
        java.util.Locale locale74 = null;
        String str75 = petTypeFormatter1.print(petType66, locale74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = owner1.getPet("hi!");
        owner1.setAddress("hi!");
        owner1.setAddress("hi!");
        owner1.setTelephone("hi!");
        String str10 = owner1.getAddress();
        org.springframework.validation.Errors errors11 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) str10, errors11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.String is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        String str9 = pet8.toString();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet8.getType();
        java.time.LocalDate localDate11 = pet8.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner12 = pet8.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType13 = pet8.getType();
        java.time.LocalDate localDate14 = pet8.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit15 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int16 = visit15.getPetId();
        java.time.LocalDate localDate17 = null;
        visit15.setDate(localDate17);
        java.time.LocalDate localDate19 = null;
        visit15.setDate(localDate19);
        Integer int21 = visit15.getPetId();
        pet8.addVisit(visit15);
        owner0.addPet(pet8);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.Pet pet25 = owner0.getPet("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int21);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        String str10 = pet9.toString();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet9.setType(petType11);
        boolean boolean13 = pet9.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository14 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter15 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository14);
        org.springframework.samples.petclinic.owner.PetType petType16 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale17 = null;
        String str18 = petTypeFormatter15.print(petType16, locale17);
        org.springframework.samples.petclinic.owner.PetType petType19 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale20 = null;
        String str21 = petTypeFormatter15.print(petType19, locale20);
        pet9.setType(petType19);
        owner0.addPet(pet9);
        owner0.setLastName("hi!");
        String str26 = owner0.getFirstName();
        String str27 = owner0.getTelephone();
        String str28 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getFirstName();
        owner0.setLastName("hi!");
        String str11 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        pet12.setName("hi!");
        pet12.setId((Integer) 1);
        owner0.addPet(pet12);
        String str19 = owner0.getCity();
        String str20 = owner0.getTelephone();
        String str21 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!", true);
        owner0.setTelephone("");
        String str10 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        String str12 = pet11.toString();
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet11.setType(petType13);
        String str15 = pet11.getName();
        boolean boolean16 = pet11.isNew();
        String str17 = pet11.getName();
        owner0.addPet(pet11);
        String str19 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        String str21 = pet20.toString();
        boolean boolean22 = pet20.isNew();
        org.springframework.samples.petclinic.owner.PetType petType23 = pet20.getType();
        org.springframework.samples.petclinic.owner.PetType petType24 = pet20.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository25 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter26 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository25);
        org.springframework.samples.petclinic.owner.PetRepository petRepository27 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter28 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository27);
        org.springframework.samples.petclinic.owner.PetType petType29 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale30 = null;
        String str31 = petTypeFormatter28.print(petType29, locale30);
        org.springframework.samples.petclinic.owner.PetRepository petRepository32 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter33 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository32);
        org.springframework.samples.petclinic.owner.PetType petType34 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale35 = null;
        String str36 = petTypeFormatter33.print(petType34, locale35);
        org.springframework.samples.petclinic.owner.PetType petType37 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale38 = null;
        String str39 = petTypeFormatter33.print(petType37, locale38);
        java.util.Locale locale40 = null;
        String str41 = petTypeFormatter28.print(petType37, locale40);
        java.util.Locale locale42 = null;
        String str43 = petTypeFormatter26.print(petType37, locale42);
        org.springframework.samples.petclinic.owner.Pet pet44 = new org.springframework.samples.petclinic.owner.Pet();
        String str45 = pet44.toString();
        org.springframework.samples.petclinic.owner.PetType petType46 = pet44.getType();
        java.time.LocalDate localDate47 = pet44.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner48 = pet44.getOwner();
        String str49 = pet44.toString();
        pet44.setName("hi!");
        pet44.setName("");
        String str54 = pet44.toString();
        org.springframework.samples.petclinic.owner.Pet pet55 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate56 = pet55.getBirthDate();
        pet55.setName("hi!");
        pet55.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository61 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter62 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository61);
        org.springframework.samples.petclinic.owner.PetRepository petRepository63 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter64 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository63);
        org.springframework.samples.petclinic.owner.PetType petType65 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale66 = null;
        String str67 = petTypeFormatter64.print(petType65, locale66);
        org.springframework.samples.petclinic.owner.PetRepository petRepository68 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter69 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository68);
        org.springframework.samples.petclinic.owner.PetType petType70 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale71 = null;
        String str72 = petTypeFormatter69.print(petType70, locale71);
        org.springframework.samples.petclinic.owner.PetType petType73 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale74 = null;
        String str75 = petTypeFormatter69.print(petType73, locale74);
        java.util.Locale locale76 = null;
        String str77 = petTypeFormatter64.print(petType73, locale76);
        java.util.Locale locale78 = null;
        String str79 = petTypeFormatter62.print(petType73, locale78);
        pet55.setType(petType73);
        String str81 = petType73.toString();
        pet44.setType(petType73);
        java.util.Locale locale83 = null;
        String str84 = petTypeFormatter26.print(petType73, locale83);
        pet20.setType(petType73);
        owner0.addPet(pet20);
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        java.time.LocalDate localDate8 = null;
        visit5.setDate(localDate8);
        visit5.setDescription("hi!");
        java.time.LocalDate localDate12 = visit5.getDate();
        org.springframework.samples.petclinic.visit.Visit visit13 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int14 = visit13.getPetId();
        visit13.setDescription("");
        org.springframework.samples.petclinic.owner.Owner owner17 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate19 = pet18.getBirthDate();
        String str20 = pet18.getName();
        owner17.addPet(pet18);
        org.springframework.samples.petclinic.visit.Visit visit22 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int23 = visit22.getPetId();
        pet18.addVisit(visit22);
        String str25 = visit22.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner26 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate28 = pet27.getBirthDate();
        String str29 = pet27.getName();
        owner26.addPet(pet27);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        String str32 = pet31.toString();
        owner26.addPet(pet31);
        org.springframework.samples.petclinic.owner.Owner owner34 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet35 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate36 = pet35.getBirthDate();
        String str37 = pet35.getName();
        owner34.addPet(pet35);
        org.springframework.samples.petclinic.visit.Visit visit39 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int40 = visit39.getPetId();
        pet35.addVisit(visit39);
        visit39.setDescription("");
        java.time.LocalDate localDate44 = visit39.getDate();
        pet31.setBirthDate(localDate44);
        visit22.setDate(localDate44);
        visit22.setPetId((Integer) 0);
        String str49 = visit22.getDescription();
        org.springframework.samples.petclinic.owner.Pet pet50 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate51 = pet50.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner52 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet53 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate54 = pet53.getBirthDate();
        String str55 = pet53.getName();
        owner52.addPet(pet53);
        org.springframework.samples.petclinic.visit.Visit visit57 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int58 = visit57.getPetId();
        pet53.addVisit(visit57);
        visit57.setDescription("");
        java.time.LocalDate localDate62 = visit57.getDate();
        pet50.setBirthDate(localDate62);
        java.time.LocalDate localDate64 = pet50.getBirthDate();
        visit22.setDate(localDate64);
        visit13.setDate(localDate64);
        visit5.setDate(localDate64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate64);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        Integer int8 = visit5.getPetId();
        Integer int9 = visit5.getPetId();
        String str10 = visit5.getDescription();
        String str11 = visit5.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner12 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate14 = pet13.getBirthDate();
        String str15 = pet13.getName();
        owner12.addPet(pet13);
        org.springframework.samples.petclinic.visit.Visit visit17 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int18 = visit17.getPetId();
        pet13.addVisit(visit17);
        Integer int20 = visit17.getPetId();
        Integer int21 = visit17.getPetId();
        boolean boolean22 = visit17.isNew();
        Integer int23 = visit17.getId();
        java.time.LocalDate localDate24 = visit17.getDate();
        visit5.setDate(localDate24);
        Integer int26 = visit5.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        java.time.LocalDate localDate5 = pet1.getBirthDate();
        boolean boolean6 = pet1.isNew();
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        pet1.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet1.getType();
        java.time.LocalDate localDate10 = pet1.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner11 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        String str14 = pet12.getName();
        owner11.addPet(pet12);
        java.time.LocalDate localDate16 = pet12.getBirthDate();
        boolean boolean17 = pet12.isNew();
        org.springframework.samples.petclinic.owner.Owner owner18 = new org.springframework.samples.petclinic.owner.Owner();
        owner18.setLastName("");
        Integer int21 = owner18.getId();
        owner18.setAddress("");
        String str24 = owner18.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet26 = owner18.getPet("hi!");
        String str27 = owner18.getFirstName();
        owner18.setCity("");
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate31 = pet30.getBirthDate();
        owner18.addPet(pet30);
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        String str34 = pet33.toString();
        org.springframework.samples.petclinic.owner.PetType petType35 = pet33.getType();
        org.springframework.samples.petclinic.visit.Visit visit36 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int37 = visit36.getPetId();
        java.time.LocalDate localDate38 = null;
        visit36.setDate(localDate38);
        org.springframework.samples.petclinic.visit.Visit visit40 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int41 = visit40.getPetId();
        java.time.LocalDate localDate42 = null;
        visit40.setDate(localDate42);
        java.time.LocalDate localDate44 = null;
        visit40.setDate(localDate44);
        visit40.setDescription("");
        visit40.setPetId((Integer) (-1));
        visit40.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner52 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet53 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate54 = pet53.getBirthDate();
        String str55 = pet53.getName();
        owner52.addPet(pet53);
        org.springframework.samples.petclinic.visit.Visit visit57 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int58 = visit57.getPetId();
        pet53.addVisit(visit57);
        java.time.LocalDate localDate60 = visit57.getDate();
        visit40.setDate(localDate60);
        visit36.setDate(localDate60);
        pet33.setBirthDate(localDate60);
        pet30.setBirthDate(localDate60);
        pet12.setBirthDate(localDate60);
        pet1.setBirthDate(localDate60);
        org.springframework.samples.petclinic.owner.Pet pet67 = new org.springframework.samples.petclinic.owner.Pet();
        String str68 = pet67.toString();
        org.springframework.samples.petclinic.owner.PetType petType69 = pet67.getType();
        org.springframework.samples.petclinic.owner.Owner owner70 = pet67.getOwner();
        pet67.setName("");
        org.springframework.samples.petclinic.owner.Owner owner73 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet74 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate75 = pet74.getBirthDate();
        String str76 = pet74.getName();
        owner73.addPet(pet74);
        org.springframework.samples.petclinic.visit.Visit visit78 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int79 = visit78.getPetId();
        pet74.addVisit(visit78);
        java.time.LocalDate localDate81 = pet74.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit82 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int83 = visit82.getPetId();
        java.time.LocalDate localDate84 = null;
        visit82.setDate(localDate84);
        java.time.LocalDate localDate86 = null;
        visit82.setDate(localDate86);
        pet74.addVisit(visit82);
        pet67.addVisit(visit82);
        String str90 = visit82.getDescription();
        java.time.LocalDate localDate91 = visit82.getDate();
        pet1.addVisit(visit82);
        visit82.setId((Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate91);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("", true);
        owner0.setFirstName("");
        Class<?> wildcardClass12 = owner0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        String str10 = pet9.toString();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet9.setType(petType11);
        String str13 = pet9.getName();
        owner0.addPet(pet9);
        org.springframework.samples.petclinic.owner.Owner owner15 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate17 = pet16.getBirthDate();
        String str18 = pet16.getName();
        owner15.addPet(pet16);
        org.springframework.samples.petclinic.visit.Visit visit20 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int21 = visit20.getPetId();
        pet16.addVisit(visit20);
        org.springframework.samples.petclinic.owner.PetRepository petRepository23 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter24 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository23);
        org.springframework.samples.petclinic.owner.PetType petType25 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale26 = null;
        String str27 = petTypeFormatter24.print(petType25, locale26);
        org.springframework.samples.petclinic.owner.PetRepository petRepository28 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter29 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository28);
        org.springframework.samples.petclinic.owner.PetType petType30 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale31 = null;
        String str32 = petTypeFormatter29.print(petType30, locale31);
        org.springframework.samples.petclinic.owner.PetType petType33 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale34 = null;
        String str35 = petTypeFormatter29.print(petType33, locale34);
        java.util.Locale locale36 = null;
        String str37 = petTypeFormatter24.print(petType33, locale36);
        String str38 = petType33.toString();
        pet16.setType(petType33);
        pet9.setType(petType33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        java.util.Locale locale10 = null;
        String str11 = petTypeFormatter1.print(petType7, locale10);
        org.springframework.samples.petclinic.owner.PetType petType12 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale13 = null;
        String str14 = petTypeFormatter1.print(petType12, locale13);
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        String str16 = pet15.toString();
        org.springframework.samples.petclinic.owner.PetType petType17 = pet15.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository18 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter19 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository18);
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter19.print(petType20, locale21);
        org.springframework.samples.petclinic.owner.PetType petType23 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale24 = null;
        String str25 = petTypeFormatter19.print(petType23, locale24);
        pet15.setType(petType23);
        org.springframework.samples.petclinic.owner.Owner owner27 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet28 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate29 = pet28.getBirthDate();
        String str30 = pet28.getName();
        owner27.addPet(pet28);
        org.springframework.samples.petclinic.visit.Visit visit32 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int33 = visit32.getPetId();
        pet28.addVisit(visit32);
        java.time.LocalDate localDate35 = visit32.getDate();
        pet15.setBirthDate(localDate35);
        org.springframework.samples.petclinic.owner.PetType petType37 = pet15.getType();
        java.util.Locale locale38 = null;
        String str39 = petTypeFormatter1.print(petType37, locale38);
        org.springframework.samples.petclinic.owner.Pet pet40 = new org.springframework.samples.petclinic.owner.Pet();
        String str41 = pet40.toString();
        org.springframework.samples.petclinic.owner.PetType petType42 = pet40.getType();
        java.time.LocalDate localDate43 = pet40.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner44 = pet40.getOwner();
        String str45 = pet40.toString();
        pet40.setId((Integer) 100);
        org.springframework.samples.petclinic.visit.Visit visit48 = new org.springframework.samples.petclinic.visit.Visit();
        String str49 = visit48.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner50 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet51 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate52 = pet51.getBirthDate();
        String str53 = pet51.getName();
        owner50.addPet(pet51);
        org.springframework.samples.petclinic.visit.Visit visit55 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int56 = visit55.getPetId();
        pet51.addVisit(visit55);
        Integer int58 = visit55.getPetId();
        Integer int59 = visit55.getPetId();
        boolean boolean60 = visit55.isNew();
        Integer int61 = visit55.getId();
        java.time.LocalDate localDate62 = visit55.getDate();
        visit48.setDate(localDate62);
        pet40.setBirthDate(localDate62);
        org.springframework.samples.petclinic.owner.Owner owner65 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet66 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate67 = pet66.getBirthDate();
        String str68 = pet66.getName();
        owner65.addPet(pet66);
        java.time.LocalDate localDate70 = pet66.getBirthDate();
        boolean boolean71 = pet66.isNew();
        org.springframework.samples.petclinic.owner.PetType petType72 = new org.springframework.samples.petclinic.owner.PetType();
        pet66.setType(petType72);
        pet40.setType(petType72);
        java.util.Locale locale75 = null;
        String str76 = petTypeFormatter1.print(petType72, locale75);
        org.springframework.samples.petclinic.owner.Pet pet77 = new org.springframework.samples.petclinic.owner.Pet();
        String str78 = pet77.toString();
        org.springframework.samples.petclinic.owner.PetType petType79 = null;
        pet77.setType(petType79);
        boolean boolean81 = pet77.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository82 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter83 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository82);
        org.springframework.samples.petclinic.owner.PetType petType84 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale85 = null;
        String str86 = petTypeFormatter83.print(petType84, locale85);
        org.springframework.samples.petclinic.owner.PetType petType87 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale88 = null;
        String str89 = petTypeFormatter83.print(petType87, locale88);
        pet77.setType(petType87);
        petType87.setName("");
        java.util.Locale locale93 = null;
        String str94 = petTypeFormatter1.print(petType87, locale93);
        java.util.Locale locale96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType97 = petTypeFormatter1.parse("hi!", locale96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "" + "'", str94.equals(""));
    }
}

