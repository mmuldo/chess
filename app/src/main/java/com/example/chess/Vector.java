package com.example.chess;

public class Vector {
    private double x;
    private double y;
    private double z;

    /**
     * Represents vector in 0D space
     */
    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     * Represents vector in 1D space
     * @param x x coord of vector
     */
    public Vector(double x) {
        this.x = x;
        this.y = 0;
        this.z = 0;
    }

    /**
     * Represents vector in 2D space
     * @param x x coord of vector
     * @param y y coord of vector
     */
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    /**
     * Represents vector in 3D space
     * @param x x coord of vector
     * @param y y coord of vector
     * @param z z coord of vector
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Adds two vectors together
     * @param v vector being added
     * @return vector sum
     */
    public Vector add(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    /**
     * Scales a vector by specified value
     * @param k scalar
     * @return scaled vector
     */
    public Vector scale(double k) {
        return new Vector(this.x * k, this.y * k, this.z * k);
    }

    /**
     * @return magnitude of vector
     */
    public double magnitude() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    /**
     * @return x coord
     */
    public double getX() {
        return this.x;
    }

    /**
     * @return y coord
     */
    public double getY() {
        return this.y;
    }

    /**
     * @return z coord
     */
    public double getZ() {
        return this.z;
    }

    /**
     * @param x new x coord
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @param y new y coord
     */
    public void setY(double y) {
        this.y = z;
    }

    /**
     * @param z new z coord
     */
    public void setZ(double z) {
        this.z = z;
    }
}
