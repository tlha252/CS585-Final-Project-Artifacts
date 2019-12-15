package org.springframework.samples.petclinic.two_seconds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.springframework.samples.petclinic.model.BaseEntity baseEntity0 = new org.springframework.samples.petclinic.model.BaseEntity();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        boolean boolean2 = pet0.isNew();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.springframework.samples.petclinic.vet.Vets vets0 = new org.springframework.samples.petclinic.vet.Vets();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList1 = vets0.getVetList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetList1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("hi!");
        String str3 = owner0.getTelephone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.springframework.samples.petclinic.model.Person person0 = new org.springframework.samples.petclinic.model.Person();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        String str6 = pet5.toString();
        owner0.addPet(pet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        String str1 = vet0.getFirstName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        visit0.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Class<?> wildcardClass1 = visit0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        java.time.LocalDate localDate5 = pet1.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet1 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate2 = pet1.getBirthDate();
        String str3 = pet1.getName();
        owner0.addPet(pet1);
        org.springframework.samples.petclinic.visit.Visit visit5 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int6 = visit5.getPetId();
        pet1.addVisit(visit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.springframework.samples.petclinic.visit.Visit visit0 = new org.springframework.samples.petclinic.visit.Visit();
        Integer int1 = visit0.getPetId();
        java.time.LocalDate localDate2 = null;
        visit0.setDate(localDate2);
        java.time.LocalDate localDate4 = null;
        visit0.setDate(localDate4);
        String str6 = visit0.getDescription();
        String str7 = visit0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setId((Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        String str1 = namedEntity0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.springframework.samples.petclinic.owner.PetRepository petRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = new org.springframework.samples.petclinic.owner.PetType();
        java.util.Locale locale3 = null;
        String str4 = petTypeFormatter1.print(petType2, locale3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        String str1 = pet0.toString();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        pet0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDate1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = null;
        vet0.addSpecialty(specialty1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        String str1 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        String str3 = pet2.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet2.setType(petType4);
        String str6 = pet2.toString();
        owner0.addPet(pet2);
        String str8 = owner0.getLastName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }
}

