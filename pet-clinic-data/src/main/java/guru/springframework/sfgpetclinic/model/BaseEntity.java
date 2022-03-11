package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author @bkalika
 * Created on 11.03.2022 10:45 AM
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
