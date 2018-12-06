package cz.senslog.model.dto.output;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class UserGroupOut {

    private String uid;

    private String name;

    private String description;

    private List<String> usersIds = new ArrayList<>();
}
