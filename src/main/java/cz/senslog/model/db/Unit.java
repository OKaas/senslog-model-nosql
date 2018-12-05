package cz.senslog.model.db;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Data
@Document(collection = "unit")
public class Unit {
    @Id
    private ObjectId uid;
    private String description;

    public Unit() {
        this.uid = ObjectId.get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Objects.equals(uid, unit.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
}
