package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String uid;
	private String name;
	private String email;
	private String password;
}
