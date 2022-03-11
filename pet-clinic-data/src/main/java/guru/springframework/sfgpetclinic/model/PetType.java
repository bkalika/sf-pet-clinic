package guru.springframework.sfgpetclinic.model;

/**
 * @author @bkalika
 * Created on 18.02.2022 12:31 AM
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
