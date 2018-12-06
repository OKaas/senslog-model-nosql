package cz.senslog.model.dto.create;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class UserGroupCreate {

    private String name;

    private String description;

    private List<ObjectId> usersIds = new ArrayList<>();
}
