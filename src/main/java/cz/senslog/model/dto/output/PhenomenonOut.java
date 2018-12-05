package cz.senslog.model.dto.output;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
public class PhenomenonOut {

    private String uid;
    private String physicalUnit;
    private String description;
}
