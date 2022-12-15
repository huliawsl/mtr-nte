package cn.zbx1425.sowcer.math;

import net.minecraft.util.Mth;

public class Vector3f {

    protected final com.mojang.math.Vector3f impl;

    public Vector3f(float x, float y, float z) {
        this.impl = new com.mojang.math.Vector3f(x, y, z);
    }

    public float x() { return impl.x(); }
    public float y() { return impl.y(); }
    public float z() { return impl.z(); }

    private Vector3f(Vector3f other) {
        this.impl = other.impl.copy();
    }

    public Vector3f copy() {
        return new Vector3f(this);
    }

    public void normalize() {
        impl.normalize();
    }

    public void add(float x, float y, float z) {
        impl.add(x, y, z);
    }

    public void add(Vector3f other) {
        impl.add(other.impl);
    }

    public void sub(Vector3f other) {
        impl.sub(other.impl);
    }

    public void mul(float x, float y, float z) {
        impl.mul(x, y, z);
    }

    public void mul(float n) {
        impl.mul(n);
    }

    public void rot(Vector3f axis, float rad) {
        impl.transform(axis.impl.rotation(rad));
    }

    public void rotDeg(Vector3f axis, float deg) {
        impl.transform(axis.impl.rotationDegrees(deg));
    }

    public void rotX(float rad) {
        impl.transform(com.mojang.math.Vector3f.XP.rotation(rad));
    }

    public void rotY(float rad) {
        impl.transform(com.mojang.math.Vector3f.YP.rotation(rad));
    }

    public void rotZ(float rad) {
        impl.transform(com.mojang.math.Vector3f.ZP.rotation(rad));
    }

    public void cross(Vector3f other) {
        impl.cross(other.impl);
    }
}