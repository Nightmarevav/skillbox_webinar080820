package game;

public enum ActionType {
  ADDITION("+"),
  SUBTRACTION("-"),
  MULTIPLICATION("×"),
  DIVISION("÷");

  private final String sign;

  ActionType(String sign) {
    this.sign = sign;
  }

  public String getSign() {
    return sign;
  }
}
