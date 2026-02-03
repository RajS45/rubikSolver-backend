package com.example.rubiksolver.model;

public class CubeRequest {

    private int steps;
    private String cubeState;

    public CubeRequest() {
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public String getCubeState() {
        return cubeState;
    }

    public void setCubeState(String cubeState) {
        this.cubeState = cubeState;
    }
}