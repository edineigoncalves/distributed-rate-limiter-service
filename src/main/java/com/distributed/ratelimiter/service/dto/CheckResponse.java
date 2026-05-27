package com.distributed.ratelimiter.service.dto;

public record CheckResponse (

    /**
     * Number of tokens remaining in the bucket after the decision.
     */
    int remaining,

    /**
     * Total capacity of the bucket (the rate-limit threshold).
     */
    int limit,

    /**
     * Unix timestamp (seconds) when the bucket refills.
     */
    long resetAt

){}