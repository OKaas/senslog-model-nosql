package cz.senslog.model.dto.create;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
public class PhenomenonCreate {

    private String physicalUnit;
    private String description;
}
