class Man {
  
  private String color1;
  private int height1;
  
  public void setColor(String inputColor)
  {
    color1 = inputColor;
  }
  
  public void setHeight(int inputHeight)
  {
    height1 = inputHeight;
  }

  public String getColor()
  {
    return color1;
  }

  public int getHeight()
  {
    return height1;
  }
  public Man(String color, int height)
  {
    color1 = color;
    height1 = height;
  }
  
}