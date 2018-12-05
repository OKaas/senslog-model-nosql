package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "unit_group")
@CompoundIndexes({
        @CompoundIndex(name = "unit_group_unit_idx", def = "{'units._id': 1}"),
})
public class UnitGroup {

    @Id
    private ObjectId uid;
    private String description;
    private List<Unit> units = new ArrayList<>();
}
