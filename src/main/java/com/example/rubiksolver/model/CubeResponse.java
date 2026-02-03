package com.example.rubiksolver.model;

import java.util.List;

public class CubeResponse {

    private String cubeState;
    private List<String> moves;
    private boolean solved;

    public CubeResponse(String cubeState, List<String> moves, boolean solved) {
        this.cubeState = cubeState;
        this.moves = moves;
        this.solved = solved;
    }

    public String getCubeState() {
        return cubeState;
    }

    public List<String> getMoves() {
        return moves;
    }

    public boolean isSolved() {
        return solved;
    }
}
