package excella.project.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.training.model.Professor;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
@Component
@Data
@FieldDefaults(level =AccessLevel.PRIVATE)
public class College {
	@Autowired
//	@Qualifier("sandy")
//	Professor professor;
Professor prof;
}
