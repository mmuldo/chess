package com.example.chess;

import java.util.List;

public class Piece {
    private Vector position;
    private List<Vector> potentialMoves;
    private boolean isWhite;

    /**
     * Represents a piece in a game of chess
     * @param position position of piece on board
     * @param potentialMoves potential moves piece can make
     * @param isWhite true if piece is white, false if black
     */
    public Piece(Vector position, List<Vector> potentialMoves, boolean isWhite) {
        this.position = position;
        this.potentialMoves = potentialMoves;
        this.isWhite = isWhite;
    }

    /**
     * moves piece
     * @param potentialMoveIndex index of move in potentialMoves
     * @return position of piece after move
     */
    public Vector move(int potentialMoveIndex) {
        this.position = this.position.add(this.potentialMoves.get(potentialMoveIndex));
        return this.position;
    }

    /**
     * @return position of piece
     */
    public Vector getPosition() {
        return this.position;
    }

    /**
     * @return list of piece's potential moves
     */
    public List<Vector> getPotentialMoves() {
        return this.potentialMoves;
    }

    /**
     * @return color of piece
     */
    public String getColor() {
        return isWhite ? "white" : "black";
    }

    /**
     * @param position new position of piece
     */
    public void setPosition(Vector position) {
        this.position = position;
    }

    /**
     * @param x new x coord of piece
     * @param y new y coord of piece
     */
    public void setPosition(int x, int y) {
        this.position = new Vector(x,y);
    }

    /**
     * @param potentialMoves new list of potential moves
     */
    public void setPotentialMoves(List<Vector> potentialMoves) {

        this.potentialMoves = potentialMoves;
    }

    /**
     * @param potentialMove new potential move to be added
     */
    public void addPotentialMove(Vector potentialMove) {
        this.potentialMoves.add(potentialMove);
    }

    /**
     * @param color new color of piece
     * @throws Exception if specified color is not white or black
     */
    public void setColor(String color) throws Exception {
        if (color.equals("white")) {
            this.isWhite = true;
        } else if (color.equals("black")) {
            this.isWhite = false;
        } else {
            throw new Exception("Color must be 'white' or 'black'");
        }
    }
}
