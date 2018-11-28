package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data

@Document(collection = "unit")
public class Unit {
	@Id
    private ObjectId _id;
	private String description;
	
	public Unit() {
        this._id = ObjectId.get();
    }
	
}
