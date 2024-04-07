package ch.zhaw.iwi.devops.christmaslight;

public class CoordinatePair {

    private final int leftTopX;
    private final int leftTopY;
    private final int rightBottomX;
    private final int rightBottomY;
    
    private CoordinatePair(int leftTopX, int leftTopY, int rightBottomX, int rightBottomY) {
    
        this. leftTopX = leftTopX;
        this. leftTopY = leftTopY;
        this.rightBottomX = rightBottomX;
        this. rightBottomY = rightBottomY;
    }
    public static CoordinatePair of(int leftTopX, int leftTopY, int rightBottomX, int rightBottomY) {
    return new CoordinatePair(leftTopX, leftTopY, rightBottomX, rightBottomY);
    }
}