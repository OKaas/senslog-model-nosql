package cz.senslog.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class UserGroup {

    private ObjectId uid;

    private String name;

    private String description;

    private List<ObjectId> usersIds = new ArrayList<>();
}
