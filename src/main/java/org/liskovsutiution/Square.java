package org.liskovsutiution;

/**
 * 正方形
 */
public class Square implements QuadRangle{
    private Long length;


    @Override
    public Long getHeight() {
        return getLength();
    }

    @Override
    public Long getWidth() {
        return getLength();
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }
}
