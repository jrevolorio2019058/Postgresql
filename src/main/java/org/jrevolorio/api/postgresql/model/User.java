package org.jrevolorio.api.postgresql.model;

import jakarta.persistence.*;
import lombok.*;
import org.jrevolorio.api.postgresql.dto.UserDTO;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String email;

    public User(UserDTO userDto) {
        this.name = userDto.getName();
        this.email = userDto.getEmail();
    }

}
