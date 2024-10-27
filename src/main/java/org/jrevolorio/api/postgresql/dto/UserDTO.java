package org.jrevolorio.api.postgresql.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

    private String name;

    private String email;

}
