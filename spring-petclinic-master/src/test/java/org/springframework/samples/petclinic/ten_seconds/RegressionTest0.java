package org.springframework.samples.petclinic.ten_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.springframework.samples.petclinic.model.BaseEntity baseEntity0 = new org.springframework.samples.petclinic.model.BaseEntity();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Class<?> wildcardClass1 = visit0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        String str1 = namedEntity0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            String str3 = petType2.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.validation.Errors errors2 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) owner1, errors2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.owner.Owner cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.owner.Owner and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        Class<?> wildcardClass5 = owner0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        String str3 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.PetRepository petRepository1 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter2 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository1);
        org.springframework.validation.Errors errors3 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) petRepository1, errors3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        Integer int6 = visit0.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        String str3 = vet0.getLastName();
        vet0.setFirstName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType7 = petTypeFormatter1.parse("", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        Integer int5 = pet0.getId();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        String str7 = pet6.toString();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet6.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository9 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter10 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository9);
        org.springframework.samples.petclinic.owner.PetType petType11 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale12 = null;
        String str13 = petTypeFormatter10.print(petType11, locale12);
        org.springframework.samples.petclinic.owner.PetType petType14 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale15 = null;
        String str16 = petTypeFormatter10.print(petType14, locale15);
        pet6.setType(petType14);
        pet0.setType(petType14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
        Class<?> wildcardClass10 = visit5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.Owner owner1 = new org.springframework.samples.petclinic.owner.Owner();
        String str2 = owner1.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        String str4 = pet3.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet3.setType(petType5);
        String str7 = pet3.toString();
        owner1.addPet(pet3);
        org.springframework.validation.Errors errors9 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) owner1, errors9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.owner.Owner cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.owner.Owner and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType7 = petTypeFormatter1.parse("hi!", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
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
        String str15 = petType10.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        String str5 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
        String str10 = visit6.getDescription();
        java.time.LocalDate localDate11 = visit6.getDate();
        org.springframework.validation.Errors errors12 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) localDate11, errors12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.time.LocalDate cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.time.LocalDate is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.visit.Visit visit1 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int2 = visit1.getPetId();
        java.time.LocalDate localDate3 = null;
        visit1.setDate(localDate3);
        java.time.LocalDate localDate5 = null;
        visit1.setDate(localDate5);
        visit1.setPetId((Integer) (-1));
        org.springframework.validation.Errors errors9 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) visit1, errors9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.visit.Visit cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.visit.Visit and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
        org.springframework.samples.petclinic.visit.Visit visit22 = new org.springframework.samples.petclinic.visit.Visit();
        String str23 = visit22.getDescription();
        pet0.addVisit(visit22);
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        String str4 = pet0.getName();
        Integer int5 = pet0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.validation.Errors errors2 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) true, errors2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        String str5 = owner0.getTelephone();
        String str6 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        visit0.setDescription("hi!");
        visit0.setPetId((Integer) (-1));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setId((Integer) 100);
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("");
        owner0.setAddress("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        String str6 = visit0.getDescription();
        String str7 = visit0.getDescription();
        Class<?> wildcardClass8 = visit0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setCity("");
        owner0.setAddress("");
        String str9 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        Integer int2 = visit0.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            Class<?> wildcardClass3 = petType2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        boolean boolean6 = owner5.isNew();
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        String str10 = owner0.getFirstName();
        String str11 = owner0.getCity();
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
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.vet.Vet vet1 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty2 = null;
        vet1.addSpecialty(specialty2);
        org.springframework.validation.Errors errors4 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) specialty2, errors4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        java.time.LocalDate localDate8 = pet5.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        owner0.setTelephone("hi!");
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType17 = petTypeFormatter1.parse("", locale16);
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setTelephone("");
        String str8 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.getName();
        boolean boolean5 = pet0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        Integer int17 = visit10.getPetId();
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
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        Class<?> wildcardClass5 = pet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty2 = null;
        vet0.addSpecialty(specialty2);
        int int4 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        String str4 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        pet0.setName("hi!");
        String str4 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        namedEntity0.setName("hi!");
        Class<?> wildcardClass3 = namedEntity0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        pet5.setId((Integer) 10);
        org.springframework.samples.petclinic.owner.Owner owner10 = pet5.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        String str6 = visit0.getDescription();
        String str7 = visit0.getDescription();
        visit0.setId((Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        Integer int5 = pet0.getId();
        String str6 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        String str10 = owner0.getFirstName();
        Class<?> wildcardClass11 = owner0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType17 = petTypeFormatter1.parse("hi!", locale16);
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        owner0.setLastName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        java.time.LocalDate localDate8 = visit0.getDate();
        Integer int9 = visit0.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        owner0.setLastName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        String str4 = pet0.getName();
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        String str4 = pet0.getName();
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        vet0.setFirstName("hi!");
        String str7 = vet0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        org.springframework.samples.petclinic.owner.Owner owner6 = pet0.getOwner();
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
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setCity("");
        boolean boolean7 = owner0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty2 = null;
        vet0.addSpecialty(specialty2);
        vet0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        Integer int5 = owner0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
        String str13 = owner0.getCity();
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
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        java.time.LocalDate localDate5 = pet1.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet1.getType();
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        org.springframework.samples.petclinic.vet.Specialty specialty4 = null;
        vet0.addSpecialty(specialty4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        owner0.setTelephone("hi!");
        owner0.setId((Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        String str4 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.getName();
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        pet0.setId((Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        boolean boolean5 = owner0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        petType22.setName("");
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
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        String str7 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        String str1 = vet0.getFirstName();
        int int2 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        String str5 = vet0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
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
        String str10 = visit6.getDescription();
        java.time.LocalDate localDate11 = visit6.getDate();
        org.springframework.validation.Errors errors12 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) visit6, errors12);
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
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        String str6 = owner5.getAddress();
        owner5.setCity("hi!");
        owner5.setCity("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        Integer int5 = vet0.getId();
        org.springframework.samples.petclinic.vet.Specialty specialty6 = null;
        vet0.addSpecialty(specialty6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        pet0.setName("hi!");
        pet0.setName("");
        String str10 = pet0.toString();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        boolean boolean4 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Owner owner5 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = pet6.getBirthDate();
        String str8 = pet6.getName();
        owner5.addPet(pet6);
        org.springframework.samples.petclinic.visit.Visit visit10 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int11 = visit10.getPetId();
        pet6.addVisit(visit10);
        visit10.setDescription("");
        java.time.LocalDate localDate15 = visit10.getDate();
        pet0.addVisit(visit10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) (-1));
        Integer int10 = visit0.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10.equals((-1)));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        String str9 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("hi!", false);
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
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.springframework.samples.petclinic.model.Person person0 = new org.springframework.samples.petclinic.model.Person();
        person0.setLastName("");
        String str3 = person0.getLastName();
        person0.setLastName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        boolean boolean5 = owner0.isNew();
        owner0.setLastName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        String str1 = vet0.getFirstName();
        String str2 = vet0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!");
        String str7 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        boolean boolean2 = pet0.isNew();
        String str3 = pet0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        java.time.LocalDate localDate8 = visit5.getDate();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        String str10 = pet9.toString();
        org.springframework.samples.petclinic.owner.PetType petType11 = pet9.getType();
        org.springframework.samples.petclinic.owner.PetRepository petRepository12 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter13 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository12);
        org.springframework.samples.petclinic.owner.PetType petType14 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale15 = null;
        String str16 = petTypeFormatter13.print(petType14, locale15);
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale18 = null;
        String str19 = petTypeFormatter13.print(petType17, locale18);
        pet9.setType(petType17);
        org.springframework.samples.petclinic.owner.Owner owner21 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet22 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate23 = pet22.getBirthDate();
        String str24 = pet22.getName();
        owner21.addPet(pet22);
        org.springframework.samples.petclinic.visit.Visit visit26 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int27 = visit26.getPetId();
        pet22.addVisit(visit26);
        java.time.LocalDate localDate29 = visit26.getDate();
        pet9.setBirthDate(localDate29);
        visit5.setDate(localDate29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType11);
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
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        visit0.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Owner owner3 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = pet4.getBirthDate();
        String str6 = pet4.getName();
        owner3.addPet(pet4);
        org.springframework.samples.petclinic.visit.Visit visit8 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int9 = visit8.getPetId();
        pet4.addVisit(visit8);
        Integer int11 = visit8.getPetId();
        Integer int12 = visit8.getPetId();
        boolean boolean13 = visit8.isNew();
        Integer int14 = visit8.getId();
        java.time.LocalDate localDate15 = visit8.getDate();
        visit0.setDate(localDate15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        String str6 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) 1);
        visit0.setPetId((Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        String str2 = pet0.getName();
        pet0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        Integer int7 = pet0.getId();
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
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        owner0.setLastName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        String str8 = visit5.getDescription();
        String str9 = visit5.getDescription();
        visit5.setPetId((Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        String str9 = owner0.getFirstName();
        owner0.setCity("");
        owner0.setAddress("hi!");
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        String str4 = pet3.toString();
        java.time.LocalDate localDate5 = null;
        pet3.setBirthDate(localDate5);
        String str7 = pet3.getName();
        owner0.addPet(pet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        Integer int5 = pet0.getId();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner7 = pet0.getOwner();
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
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType4 = petTypeFormatter1.parse("", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("hi!");
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
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        Integer int14 = owner0.getId();
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
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        String str12 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        vet0.setLastName("");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        pet5.setId((Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.springframework.samples.petclinic.vet.Vets vets0 = new org.springframework.samples.petclinic.vet.Vets();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList1 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList2 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList3 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList4 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList5 = vets0.getVetList();
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
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner2 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate4 = pet3.getBirthDate();
        String str5 = pet3.getName();
        owner2.addPet(pet3);
        org.springframework.samples.petclinic.visit.Visit visit7 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int8 = visit7.getPetId();
        pet3.addVisit(visit7);
        visit7.setDescription("");
        java.time.LocalDate localDate12 = visit7.getDate();
        pet0.setBirthDate(localDate12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
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
        Class<?> wildcardClass13 = owner0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        vet0.setFirstName("hi!");
        int int7 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType13 = petTypeFormatter1.parse("", locale12);
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
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        Integer int5 = vet0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        Integer int1 = pet0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
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
        String str11 = owner1.getFirstName();
        org.springframework.validation.Errors errors12 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) str11, errors12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.Owner owner5 = pet0.getOwner();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
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
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
        Integer int21 = pet5.getId();
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
        org.junit.Assert.assertNull(int21);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setCity("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        String str7 = vet0.getLastName();
        int int8 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        String str8 = visit0.getDescription();
        visit0.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        boolean boolean3 = vet0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        String str6 = visit0.getDescription();
        String str7 = visit0.getDescription();
        String str8 = visit0.getDescription();
        Class<?> wildcardClass9 = visit0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str14 = petTypeFormatter1.print(petType12, locale13);
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
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        visit0.setDescription("hi!");
        String str3 = visit0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        pet0.setId((Integer) 10);
        String str7 = pet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner7 = pet0.getOwner();
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        vet0.setFirstName("hi!");
        Integer int7 = vet0.getId();
        Integer int8 = vet0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        java.time.LocalDate localDate22 = visit0.getDate();
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
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        String str14 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        visit0.setPetId((Integer) 10);
        visit0.setId((Integer) 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        java.util.Locale locale37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType38 = petTypeFormatter1.parse("hi!", locale37);
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
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        String str3 = owner0.getTelephone();
        Integer int4 = owner0.getId();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        org.springframework.samples.petclinic.owner.Owner owner3 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(owner3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!");
        owner0.setCity("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        namedEntity0.setName("hi!");
        String str3 = namedEntity0.getName();
        String str4 = namedEntity0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.validation.Errors errors2 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((Object) (-1), errors2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Integer is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        String str6 = owner5.getAddress();
        owner5.setCity("hi!");
        String str9 = owner5.getAddress();
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
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setAddress("");
        String str6 = owner0.getLastName();
        owner0.setCity("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType13 = petTypeFormatter1.parse("hi!", locale12);
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
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!", true);
        owner0.setTelephone("");
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.springframework.samples.petclinic.owner.PetType petType0 = new org.springframework.samples.petclinic.owner.PetType();
        String str1 = petType0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        Integer int3 = owner0.getId();
        owner0.setTelephone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
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
        org.junit.Assert.assertNull(petType7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        java.time.LocalDate localDate18 = pet1.getBirthDate();
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
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        org.springframework.samples.petclinic.owner.PetType petType14 = pet10.getType();
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
        org.junit.Assert.assertNull(petType14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        String str8 = visit0.getDescription();
        String str9 = visit0.getDescription();
        Integer int10 = visit0.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        Integer int24 = pet9.getId();
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
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("hi!");
        org.springframework.samples.petclinic.owner.Owner owner6 = new org.springframework.samples.petclinic.owner.Owner();
        String str7 = owner6.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        String str9 = pet8.toString();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet8.setType(petType10);
        String str12 = pet8.toString();
        owner6.addPet(pet8);
        owner0.addPet(pet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        String str9 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        String str3 = owner0.getTelephone();
        Integer int4 = owner0.getId();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
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
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        owner0.setTelephone("");
        owner0.setFirstName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        boolean boolean4 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(petType5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setLastName("");
        String str3 = owner0.getFirstName();
        String str4 = owner0.getTelephone();
        owner0.setCity("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        visit4.setDescription("");
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
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner4 = pet0.getOwner();
        String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
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
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        visit0.setDescription("");
        visit0.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        vet0.setFirstName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        String str6 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        String str3 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("hi!");
        String str6 = owner0.getTelephone();
        String str7 = owner0.getCity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getAddress();
        String str8 = owner0.getAddress();
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
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
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
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        java.util.Locale locale47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType48 = petTypeFormatter1.parse("", locale47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) (-1));
        visit0.setDescription("hi!");
        Integer int12 = visit0.getPetId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12.equals((-1)));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        String str7 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        owner0.setTelephone("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        owner5.setCity("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setId((Integer) 1);
        owner0.setCity("");
        boolean boolean5 = owner0.isNew();
        String str6 = owner0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Owner owner5 = pet1.getOwner();
        String str6 = owner5.getAddress();
        owner5.setCity("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(owner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        String str3 = vet0.getLastName();
        int int4 = vet0.getNrOfSpecialties();
        int int5 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
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
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        java.time.LocalDate localDate11 = visit0.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        String str4 = pet0.toString();
        pet0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        vet0.setId((Integer) 0);
        String str4 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = null;
        vet0.addSpecialty(specialty5);
        String str7 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty8 = null;
        vet0.addSpecialty(specialty8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        String str5 = owner0.getLastName();
        Integer int6 = owner0.getId();
        owner0.setCity("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        String str2 = owner0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        owner0.setAddress("hi!");
        String str5 = owner0.getAddress();
        owner0.setLastName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        visit0.setDescription("");
        visit0.setPetId((Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        String str5 = owner0.getLastName();
        owner0.setCity("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
        Class<?> wildcardClass18 = visit9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        int int3 = vet0.getNrOfSpecialties();
        String str4 = vet0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        java.time.LocalDate localDate18 = pet0.getBirthDate();
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
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        String str5 = vet0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        String str9 = owner0.getTelephone();
        owner0.setAddress("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        Object obj1 = null;
        org.springframework.validation.Errors errors2 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate(obj1, errors2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        // Expected exception.
        }
    }
}

