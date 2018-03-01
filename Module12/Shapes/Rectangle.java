import java.awt.*;

public class Rectangle extends CanvasShape {
  public Rectangle(int topLeftX, int topLeftY, int width, int height) {
    super(topLeftX, topLeftY, width, height);
  }

  public void render(Graphics2D graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
  }
}
