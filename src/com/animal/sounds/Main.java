package com.animal.sounds;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class subAnimalClass extends Animal {
    String pig;
    String cat;

    public void subAnimalSound() {
        System.out.println("cat meows, pig oinks");

    }
}
class cats extends subAnimalClass {
    public void subAnimalSoundCat(int num) {
        num = 2;
        System.out.println("the cat meows" + num + "times per minute");

    }

    class pigs extends subAnimalClass {
        public void subAnimalSoundCat(int num) {
            num = 2;
            System.out.println("the pig oink" + num + "times per minute");

        }

    }

    public class Main {

        public static void main(String[] args) {
            subAnimalClass obj = new subAnimalClass();
            obj.animalSound();
            obj.subAnimalSound();
        }
    }
}


