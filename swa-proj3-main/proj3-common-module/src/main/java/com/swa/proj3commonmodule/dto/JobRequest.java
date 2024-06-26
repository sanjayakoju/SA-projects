package com.swa.proj3commonmodule.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobRequest {

    private String jobId;
    private String candidateId;
}

