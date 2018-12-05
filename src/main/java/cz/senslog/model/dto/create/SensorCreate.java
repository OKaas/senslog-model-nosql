package cz.senslog.model.dto.create;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
public class SensorCreate {

    private String description;

    private ObjectId phenomenonId;

    private ObjectId unitGroupId;

    private ObjectId unitId;
}
