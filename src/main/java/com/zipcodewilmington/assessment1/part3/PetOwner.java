package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part1.IntegerArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public String name;
    public Pet[] pets;
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets == null) {

            this.pets = new Pet[1];
        } else {
            this.pets = pets;
        }
        pets[0].setOwner(this);
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(pets.length == 1 && pets[0] == null){
            pets[0] = pet;
        }
        else {
            pets = Arrays.copyOf(pets, pets.length + 1);
            pets[pets.length - 1] = pet;
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
//        ArrayList<Pet> petsList = new ArrayList<>(Arrays.asList(pets));
//        petsList.remove(pet);
//        Object[] petObjectArray = petsList.toArray();
//        pets = Arrays.copyOf(petObjectArray,petObjectArray.length,Pet[].class);
        int index = 0;
        for(Pet currentPet : pets){

            if(currentPet.equals(pet)){
                pets[index] = null;
            }
            index++;
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet currentPet : pets){
            if(currentPet.equals(pet)){
                return true;
            }
        }

        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {
        int youngestAge = 1000;
        for(Pet currentPet : pets){
            if(currentPet.getAge() < youngestAge){
                youngestAge = currentPet.getAge();
            }
        }
        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldestAge = 0;
        for(Pet currentPet : pets){
            if(currentPet.getAge() > oldestAge){
                oldestAge = currentPet.getAge();
            }
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer[] petAges = new Integer[pets.length];
        int index = 0;
        for(Pet thisPet : pets){
            petAges[index] = thisPet.getAge();
            index++;
        }
        double doubleAvg = IntegerArrayUtils.getAverage(petAges);
        Float averagePetAge = (float) doubleAvg;
        return averagePetAge;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
