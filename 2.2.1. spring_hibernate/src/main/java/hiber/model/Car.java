package hiber.model;

import javax.persistence.*;

@Entity
@Table( schema = "public",name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;
    @OneToOne(mappedBy = "cars",cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private User users;

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public Car(){}
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
