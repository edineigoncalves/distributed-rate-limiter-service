package com.distributed.ratelimiter.service.controller;

import com.distributed.ratelimiter.service.dto.CheckRequest;
import com.distributed.ratelimiter.service.dto.CheckResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class RateLimitControllerV1 {

    @PostMapping(path = "/check")
    public ResponseEntity<CheckResponse> postCheck(@RequestBody CheckRequest request) {
        return ResponseEntity.ok(new CheckResponse(99, 100, System.currentTimeMillis() / 1000 + 60));
    }
}
