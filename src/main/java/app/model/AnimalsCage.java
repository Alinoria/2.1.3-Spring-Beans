package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Timer time;
    private Animal animal;

    @Autowired
    public AnimalsCage(Timer time, @Qualifier("dog") Animal animal) {
        this.time = time;
        this.animal = animal;
    }

    public Timer getTimer() {
        return time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(time.getTime());
        System.out.println("________________________");
    }
}
