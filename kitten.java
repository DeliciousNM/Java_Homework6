package homework6;

import java.util.Objects;

public class kitten {
    private String name;
    private int age;
    
    public kitten(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        kitten kitten = (kitten) o;
        return age == kitten.age && name == kitten.name;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    
    @Override
    public String toString() {
        return String.format("Имя: %s - возраст: %d", name, age);
    }
}

