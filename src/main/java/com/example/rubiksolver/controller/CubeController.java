package com.example.rubiksolver.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rubiksolver.model.CubeRequest;
import com.example.rubiksolver.model.CubeResponse;
import com.example.rubiksolver.service.CubeService;

@RestController
@RequestMapping("/cube")
@CrossOrigin(origins = "*")
public class CubeController {

    private final CubeService cubeService;

    public CubeController(CubeService cubeService) {
        this.cubeService = cubeService;
    }

    @PostMapping("/scramble")
    public CubeResponse scramble(@RequestBody CubeRequest request) {
        return cubeService.scramble(request.getSteps());
    }

    @PostMapping("/solve")
    public CubeResponse solve(@RequestBody CubeRequest request) {
        return cubeService.solve(request.getCubeState());
    }

    @PostMapping("/solved")
    public boolean isSolved(@RequestBody CubeRequest request) {
        return cubeService.isSolved(request.getCubeState());
    }
}
