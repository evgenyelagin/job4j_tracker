package ru.job4j.tracker.oop;

class Diagnos {
        public String diagnos;
        public String cure;
        public String name;

        public Diagnos(String diagnos, String cure, String name) {
                this.diagnos = diagnos;
                this.cure = cure;
                this.name = name;
        }

}

public class Doctor extends Profession {
        public String instrument;

        public Doctor(String name, String surname, String education, String birthday, String instrument) {
                super(name, surname, education, birthday);
                this.instrument = instrument;
        }

        public void doSomething(){
                super.setName("Vasya");
        }
        public Diagnos heal(Profession p){
                return new Diagnos("virus", "antibiotics", p.getName());
        }

}

