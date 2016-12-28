public class Rectangle {
  private int mLength;
  private int mWidth;

  public Rectangle(int length, int width) {
    mLength = length;
    mWidth = width;
  }

  public boolean isSquare() {
    return mLength == mWidth;
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }
}
