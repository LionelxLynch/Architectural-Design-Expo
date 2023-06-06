package dev.lioneltlynch.architectureexpo.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "buildings")
public class Buildings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "Text"
    )
    private String name;

    @Column(
            name = "height",
            nullable = false
    )
    private int height;

    @Column(
            name = "location",
            nullable = false,
            columnDefinition = "Text"
    )
    private String location;

    @Column(
            name = "year",
            nullable = false
   )
    private int year;

    @Column(
            name = "style",
            nullable = false,
            columnDefinition = "Text"
    )
    private String style;

    @Column(
            name = "fact",
            nullable = false,
            columnDefinition = "Text"
    )
    private String fact;

    public Buildings(
            String name,
            int height, String location,
            int year,
            String style,
            String fact) {
        this.name = name;
        this.height = height;
        this.location = location;
        this.year = year;
        this.style = style;
        this.fact = fact;
    }

    @Override
    public String toString() {
        return "Buildings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", location='" + location + '\'' +
                ", year=" + year +
                ", style='" + style + '\'' +
                ", fact='" + fact + '\'' +
                '}';
    }
}