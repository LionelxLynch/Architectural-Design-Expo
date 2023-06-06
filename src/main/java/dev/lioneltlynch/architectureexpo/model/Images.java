package dev.lioneltlynch.architectureexpo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id",
            nullable = false,
            updatable = false
    )
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "building_id",
            nullable = false,
            updatable = false)
    private Buildings building;

    @Column(
            name = "image_url",
            nullable = false
    )
    private String image_url;

    public Images(
            Buildings building,
            String image_url) {
        this.building = building;
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "Images{" +
                "building=" + building +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}

