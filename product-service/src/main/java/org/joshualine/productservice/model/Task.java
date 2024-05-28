package org.joshualine.productservice.model;

import java.time.LocalDateTime;

public record Task(
        Integer id, String title, String description, Priority priority, boolean isCompleted,
        LocalDateTime dateCreated, LocalDateTime dateUpdated
) {

}
