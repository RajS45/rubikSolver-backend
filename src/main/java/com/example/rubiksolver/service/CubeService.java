package com.example.rubiksolver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rubiksolver.model.CubeResponse;

@Service
public class CubeService {

    public CubeResponse scramble(int steps) {
        List<String> moves = List.of("R", "U", "R'", "U'");
        return new CubeResponse("SCRAMBLED_STATE", moves, false);
    }

    public CubeResponse solve(String cubeState) {
        List<String> solution = List.of("U", "R", "U'", "R'");
        return new CubeResponse("SOLVED_STATE", solution, true);
    }

    public boolean isSolved(String cubeState) {
        return "SOLVED_STATE".equals(cubeState);
    }
}
