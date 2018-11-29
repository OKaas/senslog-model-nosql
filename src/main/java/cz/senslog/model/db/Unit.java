package cz.senslog.model.db;

import lombok.Data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "unit")
public class Unit {
	@Id
    private String uid;
	private String description;
	
	public Unit() {
        this.uid = ObjectId.get().toString();
    }
	
}
