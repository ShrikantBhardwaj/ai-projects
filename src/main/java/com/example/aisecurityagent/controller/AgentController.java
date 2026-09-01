package com.example.aisecurityagent.controller;

import com.example.aisecurityagent.service.AgentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agent")
public class AgentController {

    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "AI Security Agent is running!";
    }

    @PostMapping("/chat")
    public String chat(@RequestBody String message) {
        System.out.println("Message received: " + message);
        return "Received: " + message;
    }

}