package co.edu.uptc.gerencia.model;

public class Course {
    private String name;
    private String description;

    public Course(String nombre, String descripción) {
        this.name = nombre;
        this.description = descripción;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
