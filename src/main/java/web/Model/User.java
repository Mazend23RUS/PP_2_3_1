package web.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity // анатация сущность
@Table (name = "users")

public class User {
    @Id //анатация первичного ключа PRIMARY KEY(id)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // значение id генерируется автоматически
    @Column(name = "id")
    private Long id;

    private String name;

    private String lastName;


    public User() {

    }

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName);
    }

    @Override
    public String toString() {

        return "User{" +
                "id = " + id +
                ", name = " + name + '\'' +
                ", lastName = " + lastName + '\'' +
                '}';
    }

}
