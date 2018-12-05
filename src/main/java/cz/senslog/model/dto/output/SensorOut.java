package cz.senslog.model.dto.output;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
public class SensorOut {

    private String uid;

    private String description;

    private String phenomenonId;

    private String unitGroupId;

    private String unitId;
}
