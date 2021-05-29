package com.benjamin.sentinelstudy.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author Ben Li.
 * @since: 2021/5/29 下午5:52
 */
@Service
public class MainService {

    @SentinelResource(value = "hi", fallback = "fallbackHi")
    public String hi() {
        return "hi...";
    }

    public String fallbackHi() {
        return "fallback...hi...";
    }
}
