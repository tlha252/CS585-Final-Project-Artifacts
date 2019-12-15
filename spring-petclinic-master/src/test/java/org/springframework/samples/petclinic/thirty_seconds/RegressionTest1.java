package org.springframework.samples.petclinic.thirty_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        visit0.setPetId((Integer) 10);
        visit0.setId((Integer) 1);
        visit0.setPetId((Integer) 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter1.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.PetType petType8 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale9 = null;
        String str10 = petTypeFormatter1.print(petType8, locale9);
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
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter12.print(petType18, locale21);
        java.util.Locale locale23 = null;
        String str24 = petTypeFormatter1.print(petType18, locale23);
        org.springframework.samples.petclinic.owner.PetRepository petRepository25 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter26 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository25);
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale28 = null;
        String str29 = petTypeFormatter26.print(petType27, locale28);
        org.springframework.samples.petclinic.owner.PetRepository petRepository30 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter31 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository30);
        org.springframework.samples.petclinic.owner.PetType petType32 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale33 = null;
        String str34 = petTypeFormatter31.print(petType32, locale33);
        java.util.Locale locale35 = null;
        String str36 = petTypeFormatter26.print(petType32, locale35);
        org.springframework.samples.petclinic.owner.PetType petType37 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale38 = null;
        String str39 = petTypeFormatter26.print(petType37, locale38);
        java.util.Locale locale40 = null;
        String str41 = petTypeFormatter1.print(petType37, locale40);
        org.springframework.samples.petclinic.owner.Owner owner42 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet43 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate44 = pet43.getBirthDate();
        String str45 = pet43.getName();
        owner42.addPet(pet43);
        org.springframework.samples.petclinic.visit.Visit visit47 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int48 = visit47.getPetId();
        pet43.addVisit(visit47);
        java.time.LocalDate localDate50 = pet43.getBirthDate();
        String str51 = pet43.toString();
        java.time.LocalDate localDate52 = pet43.getBirthDate();
        org.springframework.samples.petclinic.owner.PetRepository petRepository53 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter54 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository53);
        org.springframework.samples.petclinic.owner.PetType petType55 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale56 = null;
        String str57 = petTypeFormatter54.print(petType55, locale56);
        org.springframework.samples.petclinic.owner.PetRepository petRepository58 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter59 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository58);
        org.springframework.samples.petclinic.owner.PetType petType60 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale61 = null;
        String str62 = petTypeFormatter59.print(petType60, locale61);
        org.springframework.samples.petclinic.owner.PetType petType63 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale64 = null;
        String str65 = petTypeFormatter59.print(petType63, locale64);
        java.util.Locale locale66 = null;
        String str67 = petTypeFormatter54.print(petType63, locale66);
        org.springframework.samples.petclinic.owner.Pet pet68 = new org.springframework.samples.petclinic.owner.Pet();
        String str69 = pet68.toString();
        org.springframework.samples.petclinic.owner.PetType petType70 = null;
        pet68.setType(petType70);
        String str72 = pet68.getName();
        org.springframework.samples.petclinic.owner.Pet pet73 = new org.springframework.samples.petclinic.owner.Pet();
        String str74 = pet73.toString();
        org.springframework.samples.petclinic.owner.PetType petType75 = null;
        pet73.setType(petType75);
        boolean boolean77 = pet73.isNew();
        org.springframework.samples.petclinic.owner.PetRepository petRepository78 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter79 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository78);
        org.springframework.samples.petclinic.owner.PetType petType80 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale81 = null;
        String str82 = petTypeFormatter79.print(petType80, locale81);
        org.springframework.samples.petclinic.owner.PetType petType83 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale84 = null;
        String str85 = petTypeFormatter79.print(petType83, locale84);
        pet73.setType(petType83);
        pet68.setType(petType83);
        petType83.setName("");
        java.util.Locale locale90 = null;
        String str91 = petTypeFormatter54.print(petType83, locale90);
        pet43.setType(petType83);
        java.util.Locale locale93 = null;
        String str94 = petTypeFormatter1.print(petType83, locale93);
        String str95 = petType83.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "" + "'", str91.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "" + "'", str94.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "" + "'", str95.equals(""));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        String str2 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType3);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        String str44 = visit5.getDescription();
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
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        int int3 = vet0.getNrOfSpecialties();
        int int4 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        Class<?> wildcardClass7 = vet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str17 = petTypeFormatter1.print(petType15, locale16);
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
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        owner0.setTelephone("");
        owner0.setFirstName("hi!");
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        owner0.setAddress("hi!");
        String str7 = owner0.getTelephone();
        String str8 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            owner0.addPet(pet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        pet0.setName("hi!");
        pet0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository6 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter7 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository6);
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
        org.springframework.samples.petclinic.owner.PetType petType18 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale19 = null;
        String str20 = petTypeFormatter14.print(petType18, locale19);
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter9.print(petType18, locale21);
        java.util.Locale locale23 = null;
        String str24 = petTypeFormatter7.print(petType18, locale23);
        pet0.setType(petType18);
        org.springframework.samples.petclinic.owner.Owner owner26 = new org.springframework.samples.petclinic.owner.Owner();
        owner26.setLastName("");
        Integer int29 = owner26.getId();
        owner26.setAddress("");
        owner26.setTelephone("");
        String str34 = owner26.getFirstName();
        owner26.setLastName("hi!");
        String str37 = owner26.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate39 = pet38.getBirthDate();
        pet38.setName("hi!");
        pet38.setId((Integer) 1);
        owner26.addPet(pet38);
        pet38.setName("hi!");
        boolean boolean47 = pet38.isNew();
        org.springframework.samples.petclinic.visit.Visit visit48 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int49 = visit48.getPetId();
        java.time.LocalDate localDate50 = null;
        visit48.setDate(localDate50);
        org.springframework.samples.petclinic.visit.Visit visit52 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int53 = visit52.getPetId();
        java.time.LocalDate localDate54 = null;
        visit52.setDate(localDate54);
        java.time.LocalDate localDate56 = null;
        visit52.setDate(localDate56);
        visit52.setDescription("");
        visit52.setPetId((Integer) (-1));
        visit52.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner64 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet65 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate66 = pet65.getBirthDate();
        String str67 = pet65.getName();
        owner64.addPet(pet65);
        org.springframework.samples.petclinic.visit.Visit visit69 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int70 = visit69.getPetId();
        pet65.addVisit(visit69);
        java.time.LocalDate localDate72 = visit69.getDate();
        visit52.setDate(localDate72);
        visit48.setDate(localDate72);
        pet38.setBirthDate(localDate72);
        pet0.setBirthDate(localDate72);
        org.springframework.samples.petclinic.owner.Owner owner77 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet78 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate79 = pet78.getBirthDate();
        String str80 = pet78.getName();
        owner77.addPet(pet78);
        org.springframework.samples.petclinic.visit.Visit visit82 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int83 = visit82.getPetId();
        pet78.addVisit(visit82);
        Integer int85 = visit82.getPetId();
        Integer int86 = visit82.getPetId();
        boolean boolean87 = visit82.isNew();
        Integer int88 = visit82.getId();
        java.time.LocalDate localDate89 = visit82.getDate();
        java.time.LocalDate localDate90 = visit82.getDate();
        pet0.setBirthDate(localDate90);
        String str92 = pet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "hi!" + "'", str92.equals("hi!"));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getAddress();
        String str8 = owner0.getTelephone();
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
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        owner0.setLastName("");
        owner0.setFirstName("");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        Integer int5 = pet0.getId();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner7 = pet0.getOwner();
        org.springframework.samples.petclinic.visit.Visit visit8 = new org.springframework.samples.petclinic.visit.Visit();
        org.springframework.samples.petclinic.owner.Owner owner9 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = pet10.getBirthDate();
        String str12 = pet10.getName();
        owner9.addPet(pet10);
        org.springframework.samples.petclinic.visit.Visit visit14 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int15 = visit14.getPetId();
        pet10.addVisit(visit14);
        java.time.LocalDate localDate17 = visit14.getDate();
        visit8.setDate(localDate17);
        java.time.LocalDate localDate19 = visit8.getDate();
        pet0.setBirthDate(localDate19);
        Class<?> wildcardClass21 = pet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        pet0.setId((Integer) (-1));
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
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        String str3 = owner0.getTelephone();
        Integer int4 = owner0.getId();
        String str5 = owner0.getAddress();
        Integer int6 = owner0.getId();
        owner0.setLastName("hi!");
        String str9 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setId((Integer) 100);
        Integer int8 = pet0.getId();
        String str9 = pet0.toString();
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        String str11 = pet0.getName();
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
        org.junit.Assert.assertNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        org.springframework.samples.petclinic.owner.Owner owner3 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        org.springframework.samples.petclinic.owner.Owner owner10 = pet6.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner11 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        String str14 = pet12.getName();
        owner11.addPet(pet12);
        org.springframework.samples.petclinic.visit.Visit visit16 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int17 = visit16.getPetId();
        pet12.addVisit(visit16);
        String str19 = visit16.getDescription();
        visit16.setPetId((Integer) (-1));
        pet6.addVisit(visit16);
        String str23 = visit16.getDescription();
        Integer int24 = visit16.getPetId();
        pet0.addVisit(visit16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!", true);
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet9);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        java.time.LocalDate localDate23 = pet0.getBirthDate();
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
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        String str6 = owner5.getAddress();
        owner5.setCity("hi!");
        owner5.setCity("");
        String str11 = owner5.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        pet0.setName("");
        String str14 = pet0.toString();
        pet0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        String str7 = vet0.getLastName();
        int int8 = vet0.getNrOfSpecialties();
        vet0.setLastName("");
        String str11 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty12 = null;
        vet0.addSpecialty(specialty12);
        int int14 = vet0.getNrOfSpecialties();
        int int15 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        String str8 = visit5.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner9 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = pet10.getBirthDate();
        String str12 = pet10.getName();
        owner9.addPet(pet10);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        owner9.addPet(pet14);
        org.springframework.samples.petclinic.owner.Owner owner17 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate19 = pet18.getBirthDate();
        String str20 = pet18.getName();
        owner17.addPet(pet18);
        org.springframework.samples.petclinic.visit.Visit visit22 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int23 = visit22.getPetId();
        pet18.addVisit(visit22);
        visit22.setDescription("");
        java.time.LocalDate localDate27 = visit22.getDate();
        pet14.setBirthDate(localDate27);
        visit5.setDate(localDate27);
        boolean boolean30 = visit5.isNew();
        String str31 = visit5.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        org.springframework.samples.petclinic.owner.Owner owner12 = pet8.getOwner();
        String str13 = owner12.getAddress();
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
        org.junit.Assert.assertNotNull(owner12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        owner0.setFirstName("");
        String str23 = owner0.getLastName();
        owner0.setCity("");
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        String str21 = visit13.getDescription();
        Integer int22 = visit13.getId();
        pet0.addVisit(visit13);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        org.springframework.samples.petclinic.owner.PetType petType24 = pet0.getType();
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
        org.junit.Assert.assertNull(petType24);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        String str1 = visit0.getDescription();
        String str2 = visit0.getDescription();
        java.time.LocalDate localDate3 = visit0.getDate();
        String str4 = visit0.getDescription();
        java.time.LocalDate localDate5 = visit0.getDate();
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
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getCity();
        owner0.setCity("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        String str8 = visit5.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner9 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = pet10.getBirthDate();
        String str12 = pet10.getName();
        owner9.addPet(pet10);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        String str15 = pet14.toString();
        owner9.addPet(pet14);
        org.springframework.samples.petclinic.owner.Owner owner17 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate19 = pet18.getBirthDate();
        String str20 = pet18.getName();
        owner17.addPet(pet18);
        org.springframework.samples.petclinic.visit.Visit visit22 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int23 = visit22.getPetId();
        pet18.addVisit(visit22);
        visit22.setDescription("");
        java.time.LocalDate localDate27 = visit22.getDate();
        pet14.setBirthDate(localDate27);
        visit5.setDate(localDate27);
        visit5.setPetId((Integer) 0);
        visit5.setPetId((Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        org.springframework.samples.petclinic.visit.Visit visit50 = new org.springframework.samples.petclinic.visit.Visit();
        org.springframework.samples.petclinic.owner.Owner owner51 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet52 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate53 = pet52.getBirthDate();
        String str54 = pet52.getName();
        owner51.addPet(pet52);
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int57 = visit56.getPetId();
        pet52.addVisit(visit56);
        java.time.LocalDate localDate59 = visit56.getDate();
        visit50.setDate(localDate59);
        pet12.setBirthDate(localDate59);
        pet12.setName("");
        String str64 = pet12.toString();
        org.springframework.samples.petclinic.owner.PetType petType65 = pet12.getType();
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
        org.junit.Assert.assertNull(localDate53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType65);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        org.springframework.samples.petclinic.owner.Owner owner19 = pet12.getOwner();
        String str20 = owner19.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        Integer int12 = visit5.getPetId();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12.equals((-1)));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        owner0.setCity("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        Integer int21 = pet3.getId();
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
        org.junit.Assert.assertNull(int21);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        owner0.setCity("");
        owner0.setCity("hi!");
        String str13 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet16 = owner0.getPet("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            pet16.setId((Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet16);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        org.springframework.samples.petclinic.owner.Owner owner57 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet58 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate59 = pet58.getBirthDate();
        String str60 = pet58.getName();
        owner57.addPet(pet58);
        org.springframework.samples.petclinic.visit.Visit visit62 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int63 = visit62.getPetId();
        pet58.addVisit(visit62);
        Integer int65 = visit62.getPetId();
        Integer int66 = visit62.getPetId();
        boolean boolean67 = visit62.isNew();
        Integer int68 = visit62.getId();
        pet14.addVisit(visit62);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int68);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        boolean boolean5 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        pet0.setId((Integer) 10);
        String str7 = pet0.toString();
        String str8 = pet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.visit.Visit visit1 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int2 = visit1.getPetId();
        java.time.LocalDate localDate3 = null;
        visit1.setDate(localDate3);
        java.time.LocalDate localDate5 = null;
        visit1.setDate(localDate5);
        visit1.setDescription("");
        String str9 = visit1.getDescription();
        String str10 = visit1.getDescription();
        visit1.setId((Integer) 1);
        String str13 = visit1.getDescription();
        String str14 = visit1.getDescription();
        org.springframework.validation.Errors errors15 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) str14, errors15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.String is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        java.time.LocalDate localDate10 = visit5.getDate();
        String str11 = visit5.getDescription();
        Integer int12 = visit5.getPetId();
        String str13 = visit5.getDescription();
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
        org.junit.Assert.assertNotNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        owner0.setId((Integer) 0);
        String str7 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        owner0.setAddress("hi!");
        String str7 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        owner5.setCity("hi!");
        String str8 = owner5.getCity();
        String str9 = owner5.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        visit6.setDescription("hi!");
        visit6.setPetId((Integer) 100);
        org.springframework.validation.Errors errors16 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) visit6, errors16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.visit.Visit cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.visit.Visit and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
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
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        owner0.setCity("hi!");
        String str9 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        String str66 = pet27.getName();
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
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setCity("");
        String str7 = owner0.getFirstName();
        String str8 = owner0.getCity();
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        owner0.setAddress("hi!");
        String str10 = owner0.getTelephone();
        String str11 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        String str7 = vet0.getLastName();
        int int8 = vet0.getNrOfSpecialties();
        int int9 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty10 = null;
        vet0.addSpecialty(specialty10);
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
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter1.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate9 = pet8.getBirthDate();
        pet8.setName("hi!");
        pet8.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository14 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter15 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository14);
        org.springframework.samples.petclinic.owner.PetRepository petRepository16 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter17 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository16);
        org.springframework.samples.petclinic.owner.PetType petType18 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale19 = null;
        String str20 = petTypeFormatter17.print(petType18, locale19);
        org.springframework.samples.petclinic.owner.PetRepository petRepository21 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter22 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository21);
        org.springframework.samples.petclinic.owner.PetType petType23 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale24 = null;
        String str25 = petTypeFormatter22.print(petType23, locale24);
        org.springframework.samples.petclinic.owner.PetType petType26 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale27 = null;
        String str28 = petTypeFormatter22.print(petType26, locale27);
        java.util.Locale locale29 = null;
        String str30 = petTypeFormatter17.print(petType26, locale29);
        java.util.Locale locale31 = null;
        String str32 = petTypeFormatter15.print(petType26, locale31);
        pet8.setType(petType26);
        java.util.Locale locale34 = null;
        String str35 = petTypeFormatter1.print(petType26, locale34);
        org.springframework.samples.petclinic.owner.PetRepository petRepository36 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter37 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository36);
        org.springframework.samples.petclinic.owner.PetType petType38 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale39 = null;
        String str40 = petTypeFormatter37.print(petType38, locale39);
        org.springframework.samples.petclinic.owner.PetRepository petRepository41 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter42 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository41);
        org.springframework.samples.petclinic.owner.PetType petType43 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale44 = null;
        String str45 = petTypeFormatter42.print(petType43, locale44);
        java.util.Locale locale46 = null;
        String str47 = petTypeFormatter37.print(petType43, locale46);
        org.springframework.samples.petclinic.owner.PetType petType48 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale49 = null;
        String str50 = petTypeFormatter37.print(petType48, locale49);
        org.springframework.samples.petclinic.owner.Pet pet51 = new org.springframework.samples.petclinic.owner.Pet();
        String str52 = pet51.toString();
        org.springframework.samples.petclinic.owner.PetType petType53 = pet51.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository54 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter55 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository54);
        org.springframework.samples.petclinic.owner.PetType petType56 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale57 = null;
        String str58 = petTypeFormatter55.print(petType56, locale57);
        org.springframework.samples.petclinic.owner.PetType petType59 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale60 = null;
        String str61 = petTypeFormatter55.print(petType59, locale60);
        pet51.setType(petType59);
        org.springframework.samples.petclinic.owner.Owner owner63 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet64 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate65 = pet64.getBirthDate();
        String str66 = pet64.getName();
        owner63.addPet(pet64);
        org.springframework.samples.petclinic.visit.Visit visit68 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int69 = visit68.getPetId();
        pet64.addVisit(visit68);
        java.time.LocalDate localDate71 = visit68.getDate();
        pet51.setBirthDate(localDate71);
        org.springframework.samples.petclinic.owner.PetType petType73 = pet51.getType();
        java.util.Locale locale74 = null;
        String str75 = petTypeFormatter37.print(petType73, locale74);
        java.util.Locale locale76 = null;
        String str77 = petTypeFormatter1.print(petType73, locale76);
        org.springframework.samples.petclinic.owner.PetRepository petRepository78 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter79 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository78);
        org.springframework.samples.petclinic.owner.PetType petType80 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale81 = null;
        String str82 = petTypeFormatter79.print(petType80, locale81);
        org.springframework.samples.petclinic.owner.PetRepository petRepository83 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter84 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository83);
        org.springframework.samples.petclinic.owner.PetType petType85 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale86 = null;
        String str87 = petTypeFormatter84.print(petType85, locale86);
        java.util.Locale locale88 = null;
        String str89 = petTypeFormatter79.print(petType85, locale88);
        String str90 = petType85.toString();
        java.util.Locale locale91 = null;
        String str92 = petTypeFormatter1.print(petType85, locale91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(petType73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str92);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
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
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        String str22 = pet21.toString();
        org.springframework.samples.petclinic.owner.PetType petType23 = pet21.getType();
        org.springframework.samples.petclinic.owner.Owner owner24 = pet21.getOwner();
        pet21.setName("");
        org.springframework.samples.petclinic.owner.Owner owner27 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet28 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate29 = pet28.getBirthDate();
        String str30 = pet28.getName();
        owner27.addPet(pet28);
        org.springframework.samples.petclinic.visit.Visit visit32 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int33 = visit32.getPetId();
        pet28.addVisit(visit32);
        java.time.LocalDate localDate35 = pet28.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit36 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int37 = visit36.getPetId();
        java.time.LocalDate localDate38 = null;
        visit36.setDate(localDate38);
        java.time.LocalDate localDate40 = null;
        visit36.setDate(localDate40);
        pet28.addVisit(visit36);
        pet21.addVisit(visit36);
        owner20.addPet(pet21);
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
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        String str44 = pet5.getName();
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
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setPetId((Integer) 0);
        visit0.setId((Integer) 10);
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
        Integer int20 = visit15.getPetId();
        java.time.LocalDate localDate21 = visit15.getDate();
        visit0.setDate(localDate21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
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
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!");
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("");
        String str11 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        String str7 = vet0.getLastName();
        String str8 = vet0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        String str12 = pet11.toString();
        org.springframework.samples.petclinic.owner.PetType petType13 = pet11.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository14 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter15 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository14);
        org.springframework.samples.petclinic.owner.PetType petType16 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale17 = null;
        String str18 = petTypeFormatter15.print(petType16, locale17);
        org.springframework.samples.petclinic.owner.PetType petType19 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale20 = null;
        String str21 = petTypeFormatter15.print(petType19, locale20);
        pet11.setType(petType19);
        org.springframework.samples.petclinic.owner.Owner owner23 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate25 = pet24.getBirthDate();
        String str26 = pet24.getName();
        owner23.addPet(pet24);
        org.springframework.samples.petclinic.visit.Visit visit28 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int29 = visit28.getPetId();
        pet24.addVisit(visit28);
        java.time.LocalDate localDate31 = visit28.getDate();
        pet11.setBirthDate(localDate31);
        visit5.setDate(localDate31);
        visit5.setPetId((Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        java.time.LocalDate localDate13 = visit5.getDate();
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
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        String str9 = owner0.getFirstName();
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        owner0.addPet(pet12);
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        String str16 = pet15.toString();
        org.springframework.samples.petclinic.owner.PetType petType17 = pet15.getType();
        org.springframework.samples.petclinic.visit.Visit visit18 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int19 = visit18.getPetId();
        java.time.LocalDate localDate20 = null;
        visit18.setDate(localDate20);
        org.springframework.samples.petclinic.visit.Visit visit22 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int23 = visit22.getPetId();
        java.time.LocalDate localDate24 = null;
        visit22.setDate(localDate24);
        java.time.LocalDate localDate26 = null;
        visit22.setDate(localDate26);
        visit22.setDescription("");
        visit22.setPetId((Integer) (-1));
        visit22.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner34 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet35 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate36 = pet35.getBirthDate();
        String str37 = pet35.getName();
        owner34.addPet(pet35);
        org.springframework.samples.petclinic.visit.Visit visit39 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int40 = visit39.getPetId();
        pet35.addVisit(visit39);
        java.time.LocalDate localDate42 = visit39.getDate();
        visit22.setDate(localDate42);
        visit18.setDate(localDate42);
        pet15.setBirthDate(localDate42);
        pet12.setBirthDate(localDate42);
        String str47 = pet12.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.validation.Errors errors2 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) 1.0d, errors2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Double is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        java.time.LocalDate localDate5 = pet1.getBirthDate();
        java.time.LocalDate localDate6 = null;
        pet1.setBirthDate(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        String str9 = owner0.getFirstName();
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        owner0.addPet(pet12);
        owner0.setTelephone("");
        owner0.setLastName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        String str3 = vet0.getLastName();
        vet0.setFirstName("");
        org.springframework.samples.petclinic.vet.Specialty specialty6 = null;
        vet0.addSpecialty(specialty6);
        org.springframework.samples.petclinic.vet.Specialty specialty8 = null;
        vet0.addSpecialty(specialty8);
        org.springframework.samples.petclinic.vet.Specialty specialty10 = null;
        vet0.addSpecialty(specialty10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        String str16 = owner0.getAddress();
        String str17 = owner0.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        String str6 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("hi!");
        String str6 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getFirstName();
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("hi!");
        owner0.setFirstName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        pet0.setName("hi!");
        Integer int4 = pet0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!", true);
        owner0.setTelephone("");
        owner0.setTelephone("");
        Class<?> wildcardClass12 = owner0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        org.springframework.samples.petclinic.visit.Visit visit4 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int5 = visit4.getPetId();
        java.time.LocalDate localDate6 = null;
        visit4.setDate(localDate6);
        org.springframework.samples.petclinic.visit.Visit visit8 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int9 = visit8.getPetId();
        java.time.LocalDate localDate10 = null;
        visit8.setDate(localDate10);
        java.time.LocalDate localDate12 = null;
        visit8.setDate(localDate12);
        visit8.setDescription("");
        visit8.setPetId((Integer) (-1));
        visit8.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner20 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate22 = pet21.getBirthDate();
        String str23 = pet21.getName();
        owner20.addPet(pet21);
        org.springframework.samples.petclinic.visit.Visit visit25 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int26 = visit25.getPetId();
        pet21.addVisit(visit25);
        java.time.LocalDate localDate28 = visit25.getDate();
        visit8.setDate(localDate28);
        visit4.setDate(localDate28);
        visit4.setDescription("");
        pet0.addVisit(visit4);
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
        visit4.setDate(localDate44);
        String str46 = visit4.getDescription();
        String str47 = visit4.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("");
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        visit0.setDescription("");
        String str4 = visit0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        java.time.LocalDate localDate22 = pet0.getBirthDate();
        java.time.LocalDate localDate23 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner24 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate26 = pet25.getBirthDate();
        String str27 = pet25.getName();
        owner24.addPet(pet25);
        org.springframework.samples.petclinic.visit.Visit visit29 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int30 = visit29.getPetId();
        pet25.addVisit(visit29);
        String str32 = visit29.getDescription();
        visit29.setPetId((Integer) (-1));
        java.time.LocalDate localDate35 = visit29.getDate();
        pet0.setBirthDate(localDate35);
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
        org.junit.Assert.assertNotNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate35);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        String str20 = pet19.toString();
        org.springframework.samples.petclinic.owner.PetType petType21 = pet19.getType();
        java.time.LocalDate localDate22 = pet19.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner23 = pet19.getOwner();
        String str24 = pet19.toString();
        pet19.setName("hi!");
        pet19.setName("");
        String str29 = pet19.toString();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate31 = pet30.getBirthDate();
        pet30.setName("hi!");
        pet30.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository36 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter37 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository36);
        org.springframework.samples.petclinic.owner.PetRepository petRepository38 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter39 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository38);
        org.springframework.samples.petclinic.owner.PetType petType40 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale41 = null;
        String str42 = petTypeFormatter39.print(petType40, locale41);
        org.springframework.samples.petclinic.owner.PetRepository petRepository43 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter44 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository43);
        org.springframework.samples.petclinic.owner.PetType petType45 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale46 = null;
        String str47 = petTypeFormatter44.print(petType45, locale46);
        org.springframework.samples.petclinic.owner.PetType petType48 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale49 = null;
        String str50 = petTypeFormatter44.print(petType48, locale49);
        java.util.Locale locale51 = null;
        String str52 = petTypeFormatter39.print(petType48, locale51);
        java.util.Locale locale53 = null;
        String str54 = petTypeFormatter37.print(petType48, locale53);
        pet30.setType(petType48);
        String str56 = petType48.toString();
        pet19.setType(petType48);
        java.util.Locale locale58 = null;
        String str59 = petTypeFormatter1.print(petType48, locale58);
        org.springframework.samples.petclinic.owner.PetRepository petRepository60 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter61 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository60);
        org.springframework.samples.petclinic.owner.PetType petType62 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale63 = null;
        String str64 = petTypeFormatter61.print(petType62, locale63);
        org.springframework.samples.petclinic.owner.PetRepository petRepository65 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter66 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository65);
        org.springframework.samples.petclinic.owner.PetType petType67 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale68 = null;
        String str69 = petTypeFormatter66.print(petType67, locale68);
        org.springframework.samples.petclinic.owner.PetType petType70 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale71 = null;
        String str72 = petTypeFormatter66.print(petType70, locale71);
        java.util.Locale locale73 = null;
        String str74 = petTypeFormatter61.print(petType70, locale73);
        String str75 = petType70.toString();
        java.util.Locale locale76 = null;
        String str77 = petTypeFormatter1.print(petType70, locale76);
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
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository4 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter5 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository4);
        org.springframework.samples.petclinic.owner.PetType petType6 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale7 = null;
        String str8 = petTypeFormatter5.print(petType6, locale7);
        org.springframework.samples.petclinic.owner.PetType petType9 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale10 = null;
        String str11 = petTypeFormatter5.print(petType9, locale10);
        pet0.setType(petType9);
        Integer int13 = petType9.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        String str10 = owner0.getFirstName();
        String str11 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        String str13 = pet12.toString();
        java.time.LocalDate localDate14 = null;
        pet12.setBirthDate(localDate14);
        pet12.setId((Integer) 1);
        owner0.addPet(pet12);
        Integer int19 = pet12.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19.equals(1));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter1.print(petType5, locale6);
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType10 = petTypeFormatter1.parse("", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        String str14 = owner0.getAddress();
        owner0.setCity("");
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        vet0.setLastName("");
        vet0.setLastName("hi!");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        owner0.setCity("hi!");
        owner0.setAddress("");
        String str9 = owner0.getFirstName();
        owner0.setId((Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        org.springframework.samples.petclinic.owner.Pet pet14 = owner0.getPet("hi!");
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
        org.junit.Assert.assertNotNull(pet14);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner3 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = pet4.getBirthDate();
        String str6 = pet4.getName();
        owner3.addPet(pet4);
        org.springframework.samples.petclinic.visit.Visit visit8 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int9 = visit8.getPetId();
        pet4.addVisit(visit8);
        visit8.setDescription("");
        java.time.LocalDate localDate13 = visit8.getDate();
        pet1.setBirthDate(localDate13);
        java.time.LocalDate localDate15 = pet1.getBirthDate();
        org.springframework.validation.Errors errors16 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) localDate15, errors16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.time.LocalDate cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.time.LocalDate is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        String str30 = owner0.getCity();
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
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
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
        Integer int16 = visit0.getId();
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
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.visit.Visit visit1 = new org.springframework.samples.petclinic.visit.Visit();
        org.springframework.validation.Errors errors2 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) visit1, errors2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.visit.Visit cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.visit.Visit and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        Integer int14 = visit11.getPetId();
        String str15 = visit11.getDescription();
        java.time.LocalDate localDate16 = visit11.getDate();
        visit0.setDate(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        String str7 = owner0.getAddress();
        String str8 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        String str8 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            owner0.addPet(pet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        owner0.setCity("");
        owner0.setAddress("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setCity("");
        owner0.setAddress("");
        String str9 = owner0.getCity();
        String str10 = owner0.getCity();
        owner0.setAddress("hi!");
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setCity("");
        String str7 = owner0.getFirstName();
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        String str17 = pet1.getName();
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
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
        visit0.setPetId((Integer) 1);
        java.time.LocalDate localDate18 = null;
        visit0.setDate(localDate18);
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
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) (-1));
        String str10 = visit0.getDescription();
        boolean boolean11 = visit0.isNew();
        boolean boolean12 = visit0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        String str14 = pet13.toString();
        org.springframework.samples.petclinic.owner.PetType petType15 = pet13.getType();
        java.time.LocalDate localDate16 = pet13.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner17 = pet13.getOwner();
        String str18 = pet13.toString();
        pet13.setId((Integer) 100);
        org.springframework.samples.petclinic.visit.Visit visit21 = new org.springframework.samples.petclinic.visit.Visit();
        String str22 = visit21.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner23 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate25 = pet24.getBirthDate();
        String str26 = pet24.getName();
        owner23.addPet(pet24);
        org.springframework.samples.petclinic.visit.Visit visit28 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int29 = visit28.getPetId();
        pet24.addVisit(visit28);
        Integer int31 = visit28.getPetId();
        Integer int32 = visit28.getPetId();
        boolean boolean33 = visit28.isNew();
        Integer int34 = visit28.getId();
        java.time.LocalDate localDate35 = visit28.getDate();
        visit21.setDate(localDate35);
        pet13.setBirthDate(localDate35);
        visit0.setDate(localDate35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate35);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        org.springframework.samples.petclinic.owner.Owner owner3 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        java.time.LocalDate localDate10 = pet6.getBirthDate();
        boolean boolean11 = pet6.isNew();
        org.springframework.samples.petclinic.owner.PetType petType12 = new org.springframework.samples.petclinic.owner.PetType();
        pet6.setType(petType12);
        pet0.setType(petType12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
        owner0.setCity("");
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
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        int int4 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        java.time.LocalDate localDate18 = visit9.getDate();
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
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        String str1 = visit0.getDescription();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet2.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository5 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter6 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository5);
        org.springframework.samples.petclinic.owner.PetType petType7 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale8 = null;
        String str9 = petTypeFormatter6.print(petType7, locale8);
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale11 = null;
        String str12 = petTypeFormatter6.print(petType10, locale11);
        pet2.setType(petType10);
        org.springframework.samples.petclinic.owner.Owner owner14 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate16 = pet15.getBirthDate();
        String str17 = pet15.getName();
        owner14.addPet(pet15);
        org.springframework.samples.petclinic.visit.Visit visit19 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int20 = visit19.getPetId();
        pet15.addVisit(visit19);
        java.time.LocalDate localDate22 = visit19.getDate();
        pet2.setBirthDate(localDate22);
        org.springframework.samples.petclinic.visit.Visit visit24 = new org.springframework.samples.petclinic.visit.Visit();
        String str25 = visit24.getDescription();
        pet2.addVisit(visit24);
        java.time.LocalDate localDate27 = visit24.getDate();
        visit0.setDate(localDate27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        owner0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        owner0.setCity("hi!");
        String str7 = owner0.getTelephone();
        String str8 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        String str10 = pet9.toString();
        java.time.LocalDate localDate11 = null;
        pet9.setBirthDate(localDate11);
        String str13 = pet9.getName();
        Integer int14 = pet9.getId();
        org.springframework.samples.petclinic.owner.Owner owner15 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate17 = pet16.getBirthDate();
        String str18 = pet16.getName();
        owner15.addPet(pet16);
        org.springframework.samples.petclinic.visit.Visit visit20 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int21 = visit20.getPetId();
        pet16.addVisit(visit20);
        Integer int23 = visit20.getPetId();
        Integer int24 = visit20.getPetId();
        String str25 = visit20.getDescription();
        java.time.LocalDate localDate26 = visit20.getDate();
        pet9.setBirthDate(localDate26);
        org.springframework.samples.petclinic.visit.Visit visit28 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int29 = visit28.getPetId();
        java.time.LocalDate localDate30 = null;
        visit28.setDate(localDate30);
        java.time.LocalDate localDate32 = null;
        visit28.setDate(localDate32);
        visit28.setPetId((Integer) 0);
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
        pet36.setName("");
        org.springframework.samples.petclinic.visit.Visit visit50 = new org.springframework.samples.petclinic.visit.Visit();
        visit50.setPetId((Integer) 10);
        org.springframework.samples.petclinic.visit.Visit visit53 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int54 = visit53.getPetId();
        java.time.LocalDate localDate55 = null;
        visit53.setDate(localDate55);
        java.time.LocalDate localDate57 = null;
        visit53.setDate(localDate57);
        org.springframework.samples.petclinic.owner.Owner owner59 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet60 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate61 = pet60.getBirthDate();
        String str62 = pet60.getName();
        owner59.addPet(pet60);
        org.springframework.samples.petclinic.visit.Visit visit64 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int65 = visit64.getPetId();
        pet60.addVisit(visit64);
        java.time.LocalDate localDate67 = visit64.getDate();
        visit53.setDate(localDate67);
        visit50.setDate(localDate67);
        pet36.setBirthDate(localDate67);
        visit28.setDate(localDate67);
        pet9.setBirthDate(localDate67);
        owner0.addPet(pet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate67);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
        java.time.LocalDate localDate23 = visit15.getDate();
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
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
        org.springframework.samples.petclinic.owner.PetType petType47 = null;
        pet45.setType(petType47);
        String str49 = pet45.toString();
        org.springframework.samples.petclinic.owner.Pet pet50 = new org.springframework.samples.petclinic.owner.Pet();
        String str51 = pet50.toString();
        org.springframework.samples.petclinic.owner.PetType petType52 = pet50.getType();
        java.time.LocalDate localDate53 = pet50.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner54 = pet50.getOwner();
        String str55 = pet50.toString();
        pet50.setName("hi!");
        pet50.setName("");
        pet50.setName("");
        java.time.LocalDate localDate62 = pet50.getBirthDate();
        org.springframework.samples.petclinic.visit.Visit visit63 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int64 = visit63.getPetId();
        java.time.LocalDate localDate65 = null;
        visit63.setDate(localDate65);
        java.time.LocalDate localDate67 = null;
        visit63.setDate(localDate67);
        visit63.setDescription("");
        visit63.setPetId((Integer) (-1));
        visit63.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner75 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet76 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate77 = pet76.getBirthDate();
        String str78 = pet76.getName();
        owner75.addPet(pet76);
        org.springframework.samples.petclinic.visit.Visit visit80 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int81 = visit80.getPetId();
        pet76.addVisit(visit80);
        java.time.LocalDate localDate83 = visit80.getDate();
        visit63.setDate(localDate83);
        pet50.setBirthDate(localDate83);
        pet45.setBirthDate(localDate83);
        pet0.setBirthDate(localDate83);
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
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate83);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
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
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
        String str15 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
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
        visit5.setPetId((Integer) 0);
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
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        owner0.setTelephone("hi!");
        String str9 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        boolean boolean5 = owner0.isNew();
        String str6 = owner0.getFirstName();
        String str7 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        owner0.setCity("");
        String str11 = owner0.getCity();
        boolean boolean12 = owner0.isNew();
        String str13 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        pet5.setId((Integer) 10);
        String str10 = pet5.getName();
        org.springframework.samples.petclinic.owner.PetType petType11 = pet5.getType();
        // The following exception was thrown during execution in test generation
        try {
            String str12 = petType11.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType11);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
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
        String str13 = owner0.getFirstName();
        String str14 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter1.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.PetType petType8 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale9 = null;
        String str10 = petTypeFormatter1.print(petType8, locale9);
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
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter12.print(petType18, locale21);
        java.util.Locale locale23 = null;
        String str24 = petTypeFormatter1.print(petType18, locale23);
        org.springframework.samples.petclinic.owner.PetType petType25 = null;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str27 = petTypeFormatter1.print(petType25, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        String str4 = vet0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) 1);
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
        java.time.LocalDate localDate56 = visit14.getDate();
        visit0.setDate(localDate56);
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
        org.junit.Assert.assertNotNull(localDate56);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("hi!");
        String str6 = owner0.getAddress();
        owner0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        owner20.setAddress("hi!");
        String str23 = owner20.getTelephone();
        String str24 = owner20.getAddress();
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
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        java.time.LocalDate localDate8 = visit5.getDate();
        visit5.setPetId((Integer) 1);
        Integer int11 = visit5.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11.equals(1));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
        String str12 = visit0.getDescription();
        boolean boolean13 = visit0.isNew();
        visit0.setPetId((Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        String str6 = visit0.getDescription();
        String str7 = visit0.getDescription();
        visit0.setId((Integer) 100);
        Integer int10 = visit0.getPetId();
        org.springframework.samples.petclinic.owner.Owner owner11 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = pet12.getBirthDate();
        String str14 = pet12.getName();
        owner11.addPet(pet12);
        org.springframework.samples.petclinic.visit.Visit visit16 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int17 = visit16.getPetId();
        pet12.addVisit(visit16);
        Integer int19 = visit16.getPetId();
        Integer int20 = visit16.getPetId();
        String str21 = visit16.getDescription();
        java.time.LocalDate localDate22 = visit16.getDate();
        java.time.LocalDate localDate23 = visit16.getDate();
        visit0.setDate(localDate23);
        Integer int25 = visit0.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int25);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        owner0.setFirstName("");
        Integer int8 = owner0.getId();
        org.springframework.samples.petclinic.owner.Pet pet11 = owner0.getPet("", true);
        String str12 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        java.time.LocalDate localDate5 = pet1.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet1.getType();
        pet1.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!", true);
        owner0.setLastName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
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
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
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
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate12 = pet11.getBirthDate();
        String str13 = pet11.getName();
        owner10.addPet(pet11);
        org.springframework.samples.petclinic.visit.Visit visit15 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int16 = visit15.getPetId();
        pet11.addVisit(visit15);
        java.time.LocalDate localDate18 = visit15.getDate();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        String str20 = pet19.toString();
        org.springframework.samples.petclinic.owner.PetType petType21 = pet19.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository22 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter23 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository22);
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale25 = null;
        String str26 = petTypeFormatter23.print(petType24, locale25);
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale28 = null;
        String str29 = petTypeFormatter23.print(petType27, locale28);
        pet19.setType(petType27);
        org.springframework.samples.petclinic.owner.Owner owner31 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet32 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate33 = pet32.getBirthDate();
        String str34 = pet32.getName();
        owner31.addPet(pet32);
        org.springframework.samples.petclinic.visit.Visit visit36 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int37 = visit36.getPetId();
        pet32.addVisit(visit36);
        java.time.LocalDate localDate39 = visit36.getDate();
        pet19.setBirthDate(localDate39);
        visit15.setDate(localDate39);
        pet5.setBirthDate(localDate39);
        org.springframework.samples.petclinic.owner.PetType petType43 = pet5.getType();
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
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType43);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        String str8 = visit0.getDescription();
        Integer int9 = visit0.getId();
        String str10 = visit0.getDescription();
        org.springframework.samples.petclinic.visit.Visit visit11 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int12 = visit11.getPetId();
        java.time.LocalDate localDate13 = null;
        visit11.setDate(localDate13);
        java.time.LocalDate localDate15 = null;
        visit11.setDate(localDate15);
        visit11.setDescription("");
        visit11.setPetId((Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        String str22 = pet21.toString();
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet21.setType(petType23);
        org.springframework.samples.petclinic.visit.Visit visit25 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int26 = visit25.getPetId();
        java.time.LocalDate localDate27 = null;
        visit25.setDate(localDate27);
        org.springframework.samples.petclinic.visit.Visit visit29 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int30 = visit29.getPetId();
        java.time.LocalDate localDate31 = null;
        visit29.setDate(localDate31);
        java.time.LocalDate localDate33 = null;
        visit29.setDate(localDate33);
        visit29.setDescription("");
        visit29.setPetId((Integer) (-1));
        visit29.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner41 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet42 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate43 = pet42.getBirthDate();
        String str44 = pet42.getName();
        owner41.addPet(pet42);
        org.springframework.samples.petclinic.visit.Visit visit46 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int47 = visit46.getPetId();
        pet42.addVisit(visit46);
        java.time.LocalDate localDate49 = visit46.getDate();
        visit29.setDate(localDate49);
        visit25.setDate(localDate49);
        visit25.setDescription("");
        pet21.addVisit(visit25);
        org.springframework.samples.petclinic.owner.Owner owner55 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet56 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate57 = pet56.getBirthDate();
        String str58 = pet56.getName();
        owner55.addPet(pet56);
        org.springframework.samples.petclinic.visit.Visit visit60 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int61 = visit60.getPetId();
        pet56.addVisit(visit60);
        visit60.setDescription("");
        java.time.LocalDate localDate65 = visit60.getDate();
        visit25.setDate(localDate65);
        visit11.setDate(localDate65);
        visit0.setDate(localDate65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate65);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        vet0.setFirstName("hi!");
        org.springframework.samples.petclinic.vet.Specialty specialty7 = null;
        vet0.addSpecialty(specialty7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        owner0.setCity("hi!");
        owner0.setAddress("");
        String str9 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("hi!", false);
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet12);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.getName();
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        pet0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        String str9 = pet0.toString();
        String str10 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
        // The following exception was thrown during execution in test generation
        try {
            String str13 = petType12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
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
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        visit5.setPetId((Integer) (-1));
        visit5.setPetId((Integer) 0);
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
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        String str10 = owner0.getFirstName();
        String str11 = owner0.getAddress();
        String str12 = owner0.getCity();
        boolean boolean13 = owner0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setFirstName("");
        owner0.setLastName("");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getFirstName();
        owner0.setLastName("hi!");
        owner0.setFirstName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
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
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
        visit33.setPetId((Integer) (-1));
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
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
        visit0.setDescription("hi!");
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
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.PetRepository petRepository1 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter2 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository1);
        org.springframework.samples.petclinic.owner.PetType petType3 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale4 = null;
        String str5 = petTypeFormatter2.print(petType3, locale4);
        org.springframework.validation.Errors errors6 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) petType3, errors6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.owner.PetType cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.owner.PetType and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
        String str12 = pet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner5 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        org.springframework.samples.petclinic.visit.Visit visit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pet0.addVisit(visit7);
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
        org.junit.Assert.assertNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        String str8 = visit0.getDescription();
        visit0.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.visit.Visit visit1 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int2 = visit1.getPetId();
        java.time.LocalDate localDate3 = null;
        visit1.setDate(localDate3);
        java.time.LocalDate localDate5 = visit1.getDate();
        org.springframework.validation.Errors errors6 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) localDate5, errors6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        Integer int5 = pet0.getId();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = pet7.getBirthDate();
        pet7.setName("hi!");
        pet7.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository13 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter14 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository13);
        org.springframework.samples.petclinic.owner.PetRepository petRepository15 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter16 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository15);
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter16.print(petType17, locale18);
        org.springframework.samples.petclinic.owner.PetRepository petRepository20 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter21 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository20);
        org.springframework.samples.petclinic.owner.PetType petType22 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale23 = null;
        String str24 = petTypeFormatter21.print(petType22, locale23);
        org.springframework.samples.petclinic.owner.PetType petType25 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale26 = null;
        String str27 = petTypeFormatter21.print(petType25, locale26);
        java.util.Locale locale28 = null;
        String str29 = petTypeFormatter16.print(petType25, locale28);
        java.util.Locale locale30 = null;
        String str31 = petTypeFormatter14.print(petType25, locale30);
        pet7.setType(petType25);
        org.springframework.samples.petclinic.owner.Owner owner33 = new org.springframework.samples.petclinic.owner.Owner();
        owner33.setLastName("");
        Integer int36 = owner33.getId();
        owner33.setAddress("");
        owner33.setTelephone("");
        String str41 = owner33.getFirstName();
        owner33.setLastName("hi!");
        String str44 = owner33.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate46 = pet45.getBirthDate();
        pet45.setName("hi!");
        pet45.setId((Integer) 1);
        owner33.addPet(pet45);
        pet45.setName("hi!");
        boolean boolean54 = pet45.isNew();
        org.springframework.samples.petclinic.visit.Visit visit55 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int56 = visit55.getPetId();
        java.time.LocalDate localDate57 = null;
        visit55.setDate(localDate57);
        org.springframework.samples.petclinic.visit.Visit visit59 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int60 = visit59.getPetId();
        java.time.LocalDate localDate61 = null;
        visit59.setDate(localDate61);
        java.time.LocalDate localDate63 = null;
        visit59.setDate(localDate63);
        visit59.setDescription("");
        visit59.setPetId((Integer) (-1));
        visit59.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner71 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet72 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate73 = pet72.getBirthDate();
        String str74 = pet72.getName();
        owner71.addPet(pet72);
        org.springframework.samples.petclinic.visit.Visit visit76 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int77 = visit76.getPetId();
        pet72.addVisit(visit76);
        java.time.LocalDate localDate79 = visit76.getDate();
        visit59.setDate(localDate79);
        visit55.setDate(localDate79);
        pet45.setBirthDate(localDate79);
        pet7.setBirthDate(localDate79);
        pet0.setBirthDate(localDate79);
        Class<?> wildcardClass85 = localDate79.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        owner0.setCity("");
        owner0.setTelephone("hi!");
        owner0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
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
        Integer int23 = visit15.getPetId();
        Integer int24 = visit15.getPetId();
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
        org.junit.Assert.assertNull(int23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        pet0.setId((Integer) 10);
        String str7 = pet0.toString();
        String str8 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        vet0.setLastName("");
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        org.springframework.samples.petclinic.vet.Specialty specialty7 = null;
        vet0.addSpecialty(specialty7);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        boolean boolean5 = owner0.isNew();
        String str6 = owner0.getFirstName();
        String str7 = owner0.getLastName();
        owner0.setTelephone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
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
        pet14.setName("");
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
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        owner0.setCity("");
        owner0.setTelephone("hi!");
        String str13 = owner0.getTelephone();
        String str14 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
        visit0.setPetId((Integer) 1);
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
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate3 = pet2.getBirthDate();
        String str4 = pet2.getName();
        owner1.addPet(pet2);
        owner1.setFirstName("hi!");
        owner1.setTelephone("");
        owner1.setCity("");
        boolean boolean12 = owner1.isNew();
        String str13 = owner1.getLastName();
        Class<?> wildcardClass14 = owner1.getClass();
        org.springframework.validation.Errors errors15 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) wildcardClass14, errors15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Class is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        Class<?> wildcardClass4 = pet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate3 = pet2.getBirthDate();
        String str4 = pet2.getName();
        owner1.addPet(pet2);
        org.springframework.samples.petclinic.visit.Visit visit6 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int7 = visit6.getPetId();
        pet2.addVisit(visit6);
        java.time.LocalDate localDate9 = visit6.getDate();
        visit0.setDate(localDate9);
        visit0.setDescription("hi!");
        visit0.setPetId((Integer) 10);
        String str15 = visit0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
        visit8.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        owner0.setLastName("hi!");
        String str11 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
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
        org.springframework.samples.petclinic.owner.PetType petType51 = null;
        java.util.Locale locale52 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str53 = petTypeFormatter1.print(petType51, locale52);
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
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
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
        org.springframework.samples.petclinic.owner.Owner owner22 = pet12.getOwner();
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        String str24 = pet23.toString();
        java.time.LocalDate localDate25 = null;
        pet23.setBirthDate(localDate25);
        org.springframework.samples.petclinic.owner.Owner owner27 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet28 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate29 = pet28.getBirthDate();
        String str30 = pet28.getName();
        owner27.addPet(pet28);
        org.springframework.samples.petclinic.visit.Visit visit32 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int33 = visit32.getPetId();
        pet28.addVisit(visit32);
        Integer int35 = visit32.getPetId();
        Integer int36 = visit32.getPetId();
        boolean boolean37 = visit32.isNew();
        Integer int38 = visit32.getId();
        String str39 = visit32.getDescription();
        pet23.addVisit(visit32);
        org.springframework.samples.petclinic.owner.PetType petType41 = pet23.getType();
        org.springframework.samples.petclinic.owner.Owner owner42 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet43 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate44 = pet43.getBirthDate();
        String str45 = pet43.getName();
        owner42.addPet(pet43);
        org.springframework.samples.petclinic.visit.Visit visit47 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int48 = visit47.getPetId();
        pet43.addVisit(visit47);
        Integer int50 = visit47.getPetId();
        Integer int51 = visit47.getPetId();
        boolean boolean52 = visit47.isNew();
        Integer int53 = visit47.getId();
        Integer int54 = visit47.getPetId();
        org.springframework.samples.petclinic.owner.Owner owner55 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet56 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate57 = pet56.getBirthDate();
        String str58 = pet56.getName();
        owner55.addPet(pet56);
        org.springframework.samples.petclinic.visit.Visit visit60 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int61 = visit60.getPetId();
        pet56.addVisit(visit60);
        Integer int63 = visit60.getPetId();
        String str64 = visit60.getDescription();
        Integer int65 = visit60.getPetId();
        java.time.LocalDate localDate66 = visit60.getDate();
        visit47.setDate(localDate66);
        pet23.setBirthDate(localDate66);
        pet12.setBirthDate(localDate66);
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
        org.junit.Assert.assertNotNull(owner22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate66);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
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
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getAddress();
        String str8 = owner0.getCity();
        String str9 = owner0.getLastName();
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
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
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
        visit0.setDescription("");
        visit0.setId((Integer) 0);
        java.time.LocalDate localDate22 = visit0.getDate();
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
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setPetId((Integer) (-1));
        visit0.setDescription("hi!");
        visit0.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        String str13 = pet12.toString();
        java.time.LocalDate localDate14 = null;
        pet12.setBirthDate(localDate14);
        String str16 = pet12.getName();
        Integer int17 = pet12.getId();
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
        String str28 = visit23.getDescription();
        java.time.LocalDate localDate29 = visit23.getDate();
        pet12.setBirthDate(localDate29);
        org.springframework.samples.petclinic.visit.Visit visit31 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int32 = visit31.getPetId();
        java.time.LocalDate localDate33 = null;
        visit31.setDate(localDate33);
        java.time.LocalDate localDate35 = null;
        visit31.setDate(localDate35);
        visit31.setPetId((Integer) 0);
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
        pet39.setName("");
        org.springframework.samples.petclinic.visit.Visit visit53 = new org.springframework.samples.petclinic.visit.Visit();
        visit53.setPetId((Integer) 10);
        org.springframework.samples.petclinic.visit.Visit visit56 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int57 = visit56.getPetId();
        java.time.LocalDate localDate58 = null;
        visit56.setDate(localDate58);
        java.time.LocalDate localDate60 = null;
        visit56.setDate(localDate60);
        org.springframework.samples.petclinic.owner.Owner owner62 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet63 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate64 = pet63.getBirthDate();
        String str65 = pet63.getName();
        owner62.addPet(pet63);
        org.springframework.samples.petclinic.visit.Visit visit67 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int68 = visit67.getPetId();
        pet63.addVisit(visit67);
        java.time.LocalDate localDate70 = visit67.getDate();
        visit56.setDate(localDate70);
        visit53.setDate(localDate70);
        pet39.setBirthDate(localDate70);
        visit31.setDate(localDate70);
        pet12.setBirthDate(localDate70);
        visit0.setDate(localDate70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
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
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate70);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        visit0.setDescription("hi!");
        visit0.setPetId((Integer) (-1));
        String str5 = visit0.getDescription();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        String str7 = pet6.toString();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet6.getType();
        java.time.LocalDate localDate9 = pet6.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner10 = pet6.getOwner();
        String str11 = pet6.toString();
        java.time.LocalDate localDate12 = pet6.getBirthDate();
        Integer int13 = pet6.getId();
        org.springframework.samples.petclinic.visit.Visit visit14 = new org.springframework.samples.petclinic.visit.Visit();
        visit14.setPetId((Integer) 10);
        org.springframework.samples.petclinic.visit.Visit visit17 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int18 = visit17.getPetId();
        java.time.LocalDate localDate19 = null;
        visit17.setDate(localDate19);
        java.time.LocalDate localDate21 = null;
        visit17.setDate(localDate21);
        org.springframework.samples.petclinic.owner.Owner owner23 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate25 = pet24.getBirthDate();
        String str26 = pet24.getName();
        owner23.addPet(pet24);
        org.springframework.samples.petclinic.visit.Visit visit28 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int29 = visit28.getPetId();
        pet24.addVisit(visit28);
        java.time.LocalDate localDate31 = visit28.getDate();
        visit17.setDate(localDate31);
        visit14.setDate(localDate31);
        pet6.setBirthDate(localDate31);
        visit0.setDate(localDate31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        boolean boolean4 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository6 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter7 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository6);
        org.springframework.samples.petclinic.owner.PetType petType8 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale9 = null;
        String str10 = petTypeFormatter7.print(petType8, locale9);
        String str11 = petType8.getName();
        Integer int12 = petType8.getId();
        pet0.setType(petType8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        boolean boolean5 = owner0.isNew();
        String str6 = owner0.getFirstName();
        String str7 = owner0.getLastName();
        owner0.setLastName("hi!");
        owner0.setTelephone("");
        String str12 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
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
        owner0.setId((Integer) 1);
        String str23 = owner0.getCity();
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        String str6 = owner5.getAddress();
        owner5.setCity("hi!");
        String str9 = owner5.getAddress();
        owner5.setFirstName("");
        owner5.setCity("hi!");
        owner5.setTelephone("hi!");
        String str16 = owner5.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
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
        String str21 = visit13.getDescription();
        Integer int22 = visit13.getId();
        pet0.addVisit(visit13);
        visit13.setPetId((Integer) 0);
        java.time.LocalDate localDate26 = visit13.getDate();
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
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setName("hi!");
        pet0.setName("");
        pet0.setName("");
        String str12 = pet0.toString();
        pet0.setName("");
        org.springframework.samples.petclinic.visit.Visit visit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pet0.addVisit(visit15);
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
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setFirstName("");
        String str5 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        boolean boolean6 = owner5.isNew();
        owner5.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            owner5.addPet(pet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getAddress();
        String str9 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        String str1 = vet0.getFirstName();
        int int2 = vet0.getNrOfSpecialties();
        int int3 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        String str1 = vet0.getFirstName();
        boolean boolean2 = vet0.isNew();
        vet0.setFirstName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        vet0.setFirstName("hi!");
        Integer int7 = vet0.getId();
        Integer int8 = vet0.getId();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = null;
        vet0.addSpecialty(specialty9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale6 = null;
        String str7 = petTypeFormatter1.print(petType5, locale6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate9 = pet8.getBirthDate();
        pet8.setName("hi!");
        pet8.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository14 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter15 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository14);
        org.springframework.samples.petclinic.owner.PetRepository petRepository16 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter17 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository16);
        org.springframework.samples.petclinic.owner.PetType petType18 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale19 = null;
        String str20 = petTypeFormatter17.print(petType18, locale19);
        org.springframework.samples.petclinic.owner.PetRepository petRepository21 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter22 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository21);
        org.springframework.samples.petclinic.owner.PetType petType23 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale24 = null;
        String str25 = petTypeFormatter22.print(petType23, locale24);
        org.springframework.samples.petclinic.owner.PetType petType26 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale27 = null;
        String str28 = petTypeFormatter22.print(petType26, locale27);
        java.util.Locale locale29 = null;
        String str30 = petTypeFormatter17.print(petType26, locale29);
        java.util.Locale locale31 = null;
        String str32 = petTypeFormatter15.print(petType26, locale31);
        pet8.setType(petType26);
        java.util.Locale locale34 = null;
        String str35 = petTypeFormatter1.print(petType26, locale34);
        org.springframework.samples.petclinic.owner.Pet pet36 = new org.springframework.samples.petclinic.owner.Pet();
        String str37 = pet36.toString();
        org.springframework.samples.petclinic.owner.PetType petType38 = pet36.getType();
        java.time.LocalDate localDate39 = pet36.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner40 = pet36.getOwner();
        String str41 = pet36.toString();
        pet36.setId((Integer) 100);
        org.springframework.samples.petclinic.visit.Visit visit44 = new org.springframework.samples.petclinic.visit.Visit();
        String str45 = visit44.getDescription();
        org.springframework.samples.petclinic.owner.Owner owner46 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet47 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate48 = pet47.getBirthDate();
        String str49 = pet47.getName();
        owner46.addPet(pet47);
        org.springframework.samples.petclinic.visit.Visit visit51 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int52 = visit51.getPetId();
        pet47.addVisit(visit51);
        Integer int54 = visit51.getPetId();
        Integer int55 = visit51.getPetId();
        boolean boolean56 = visit51.isNew();
        Integer int57 = visit51.getId();
        java.time.LocalDate localDate58 = visit51.getDate();
        visit44.setDate(localDate58);
        pet36.setBirthDate(localDate58);
        org.springframework.samples.petclinic.owner.Owner owner61 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet62 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate63 = pet62.getBirthDate();
        String str64 = pet62.getName();
        owner61.addPet(pet62);
        java.time.LocalDate localDate66 = pet62.getBirthDate();
        boolean boolean67 = pet62.isNew();
        org.springframework.samples.petclinic.owner.PetType petType68 = new org.springframework.samples.petclinic.owner.PetType();
        pet62.setType(petType68);
        pet36.setType(petType68);
        java.util.Locale locale71 = null;
        String str72 = petTypeFormatter1.print(petType68, locale71);
        java.util.Locale locale74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType75 = petTypeFormatter1.parse("hi!", locale74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        vet0.setId((Integer) 0);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        String str10 = owner0.getFirstName();
        String str11 = owner0.getFirstName();
        owner0.setAddress("hi!");
        boolean boolean14 = owner0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("hi!");
        owner0.setFirstName("");
        String str8 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
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
        Integer int20 = visit11.getPetId();
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
        org.junit.Assert.assertNull(int20);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
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
        org.springframework.samples.petclinic.owner.PetRepository petRepository15 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter16 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository15);
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter16.print(petType17, locale18);
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter16.print(petType20, locale21);
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate24 = pet23.getBirthDate();
        pet23.setName("hi!");
        pet23.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository29 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter30 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository29);
        org.springframework.samples.petclinic.owner.PetRepository petRepository31 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter32 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository31);
        org.springframework.samples.petclinic.owner.PetType petType33 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale34 = null;
        String str35 = petTypeFormatter32.print(petType33, locale34);
        org.springframework.samples.petclinic.owner.PetRepository petRepository36 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter37 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository36);
        org.springframework.samples.petclinic.owner.PetType petType38 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale39 = null;
        String str40 = petTypeFormatter37.print(petType38, locale39);
        org.springframework.samples.petclinic.owner.PetType petType41 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale42 = null;
        String str43 = petTypeFormatter37.print(petType41, locale42);
        java.util.Locale locale44 = null;
        String str45 = petTypeFormatter32.print(petType41, locale44);
        java.util.Locale locale46 = null;
        String str47 = petTypeFormatter30.print(petType41, locale46);
        pet23.setType(petType41);
        java.util.Locale locale49 = null;
        String str50 = petTypeFormatter16.print(petType41, locale49);
        org.springframework.samples.petclinic.owner.Owner owner51 = new org.springframework.samples.petclinic.owner.Owner();
        owner51.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.Pet pet54 = new org.springframework.samples.petclinic.owner.Pet();
        String str55 = pet54.toString();
        java.time.LocalDate localDate56 = null;
        pet54.setBirthDate(localDate56);
        String str58 = pet54.getName();
        owner51.addPet(pet54);
        org.springframework.samples.petclinic.owner.Pet pet60 = new org.springframework.samples.petclinic.owner.Pet();
        String str61 = pet60.toString();
        org.springframework.samples.petclinic.owner.PetType petType62 = pet60.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository63 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter64 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository63);
        org.springframework.samples.petclinic.owner.PetType petType65 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale66 = null;
        String str67 = petTypeFormatter64.print(petType65, locale66);
        org.springframework.samples.petclinic.owner.PetType petType68 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale69 = null;
        String str70 = petTypeFormatter64.print(petType68, locale69);
        pet60.setType(petType68);
        pet54.setType(petType68);
        java.util.Locale locale73 = null;
        String str74 = petTypeFormatter16.print(petType68, locale73);
        java.util.Locale locale75 = null;
        String str76 = petTypeFormatter1.print(petType68, locale75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType62);
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
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!");
        String str7 = owner0.getCity();
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
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
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        pet0.setName("hi!");
        pet0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetRepository petRepository6 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter7 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository6);
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
        org.springframework.samples.petclinic.owner.PetType petType18 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale19 = null;
        String str20 = petTypeFormatter14.print(petType18, locale19);
        java.util.Locale locale21 = null;
        String str22 = petTypeFormatter9.print(petType18, locale21);
        java.util.Locale locale23 = null;
        String str24 = petTypeFormatter7.print(petType18, locale23);
        pet0.setType(petType18);
        org.springframework.samples.petclinic.owner.Owner owner26 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate28 = pet27.getBirthDate();
        String str29 = pet27.getName();
        owner26.addPet(pet27);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        String str32 = pet31.toString();
        java.time.LocalDate localDate33 = null;
        pet31.setBirthDate(localDate33);
        String str35 = pet31.getName();
        org.springframework.samples.petclinic.owner.Owner owner36 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet37 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate38 = pet37.getBirthDate();
        String str39 = pet37.getName();
        owner36.addPet(pet37);
        org.springframework.samples.petclinic.visit.Visit visit41 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int42 = visit41.getPetId();
        pet37.addVisit(visit41);
        Integer int44 = visit41.getPetId();
        String str45 = visit41.getDescription();
        java.time.LocalDate localDate46 = visit41.getDate();
        pet31.addVisit(visit41);
        java.time.LocalDate localDate48 = pet31.getBirthDate();
        java.time.LocalDate localDate49 = pet31.getBirthDate();
        owner26.addPet(pet31);
        pet31.setName("");
        org.springframework.samples.petclinic.owner.Owner owner53 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet54 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate55 = pet54.getBirthDate();
        String str56 = pet54.getName();
        owner53.addPet(pet54);
        org.springframework.samples.petclinic.owner.Pet pet58 = new org.springframework.samples.petclinic.owner.Pet();
        String str59 = pet58.toString();
        owner53.addPet(pet58);
        org.springframework.samples.petclinic.owner.Owner owner61 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet62 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate63 = pet62.getBirthDate();
        String str64 = pet62.getName();
        owner61.addPet(pet62);
        org.springframework.samples.petclinic.visit.Visit visit66 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int67 = visit66.getPetId();
        pet62.addVisit(visit66);
        visit66.setDescription("");
        java.time.LocalDate localDate71 = visit66.getDate();
        pet58.setBirthDate(localDate71);
        pet31.setBirthDate(localDate71);
        pet0.setBirthDate(localDate71);
        java.time.LocalDate localDate75 = pet0.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate75);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
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
        String str16 = owner0.getAddress();
        String str17 = owner0.getTelephone();
        String str18 = owner0.getAddress();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setName("hi!");
        String str8 = pet0.getName();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
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
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = visit0.getDate();
        boolean boolean5 = visit0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
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
    }
}

