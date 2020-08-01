package org.liskovsutiution;

/**
 * 长方形
 */
public class Rectangle implements QuadRangle{

    private Long height;
    private Long width;

    @Override
    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    @Override
    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}
