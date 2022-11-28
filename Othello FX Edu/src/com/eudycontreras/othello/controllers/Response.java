package com.eudycontreras.othello.controllers;

import com.eudycontreras.othello.capsules.ObjectiveWrapper;

public class Response {

    private int eval;
    private ObjectiveWrapper move;

    public Response() {

    }

    public Response( ObjectiveWrapper move) {
        this.move = move;
    }

    public Response(int eval) {
        this.eval = eval;
    }


    public Response(int eval, ObjectiveWrapper move) {
        this.eval = eval;
        this.move = move;
    }

    public int getEval() {
        return eval;
    }

    public void setEval(int eval) {
        this.eval = eval;
    }

    public ObjectiveWrapper getMove() {
        return move;
    }

    public void setMove(ObjectiveWrapper move) {
        this.move = move;
    }
}