package com.training.eg;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Component
@Data
//@AllArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Testing {
 int testId;
}
