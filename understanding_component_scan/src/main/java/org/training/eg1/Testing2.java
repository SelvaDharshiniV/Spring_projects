package org.training.eg1;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Component
@Data
//@AllArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Testing2 {
 int test2Id;
}
