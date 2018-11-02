package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Created by OK on 02-Nov-18.
 */
@Data
@NoArgsConstructor
public class Observation {

    @Id
    private String uid;

    /* --- Collaborates --- */
}


