package com.api_trabalhe_conosco.dto;

import java.time.LocalDateTime;

public record JobRequestSaveDTO(
        String title,
        String description,
        String location,
        String employmentType,
        String companyName,
        String workModality
){ }
