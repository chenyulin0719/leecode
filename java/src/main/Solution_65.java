public class Solution_65 {
  public boolean isNumber(String s) {
    if (s == null)
      return false;
    else
      s = s.trim();

    StateMachine stateMachine = new StateMachine();
    for (char c : s.toCharArray()) {
      stateMachine.eatChar(c);
    }
    return stateMachine.isNumber();
  }

  public class EmptyState implements State {
    private StateMachine stateMachine;

    EmptyState(StateMachine stateMachine) {
      this.stateMachine = stateMachine;
    }

    @Override
    public boolean isNumber() {
      return false;
    }

    @Override
    public void eatNextChar(char c) {
      CharType type = stateMachine.getCharType(c);
      if (type == CharType.SIGN)
        stateMachine.setState(stateMachine.getFirstSignState());
      else if (type == CharType.NUMBER)
        stateMachine.setState(stateMachine.getFirstNumberState());
      else if (type == CharType.POINT)
        stateMachine.setState(stateMachine.getSinglePointState());
      else
        stateMachine.setState(stateMachine.getFalseState());
    }
  }

  public class FirstSignState implements State {
    private StateMachine stateMachine;

    FirstSignState(StateMachine stateMachine) {
      this.stateMachine = stateMachine;
    }

    @Override
    public boolean isNumber() {
      return false;
    }

    @Override
    public void eatNextChar(char c) {
      CharType type = stateMachine.getCharType(c);
      if (type == CharType.NUMBER)
        stateMachine.setState(stateMachine.getFirstNumberState());
      else if (type == CharType.POINT)
        stateMachine.setState(stateMachine.getSinglePointState());
      else
        stateMachine.setState(stateMachine.getFalseState());
    }
  }

  public class FirstNumberState implements State {
    private StateMachine stateMachine;

    FirstNumberState(StateMachine stateMachine) {
      this.stateMachine = stateMachine;
    }

    @Override
    public boolean isNumber() {
      return true;
    }

    @Override
    public void eatNextChar(char c) {
      CharType type = stateMachine.getCharType(c);
      if (type == CharType.NUMBER) {
        //do nothing
      } else if (type == CharType.EXPONENTIAL)
        stateMachine.setState(stateMachine.getExponentialState());
      else if (type == CharType.POINT)
        stateMachine.setState(stateMachine.getPointState());
      else
        stateMachine.setState(stateMachine.getFalseState());
    }
  }

  public class PointState implements State {
    private StateMachine stateMachine;

    PointState(StateMachine stateMachine) {
      this.stateMachine = stateMachine;
    }

    @Override
    public boolean isNumber() {
      return true;
    }

    @Override
    public void eatNextChar(char c) {
      CharType type = stateMachine.getCharType(c);
      if (type == CharType.NUMBER)
        stateMachine.setState(stateMachine.getPointNumberState());
      else if (type == CharType.EXPONENTIAL)
        stateMachine.setState(stateMachine.getExponentialState());
      else
        stateMachine.setState(stateMachine.getFalseState());
    }
  }

  public class SinglePointState implements State {
    private StateMachine stateMachine;

    SinglePointState(StateMachine stateMachine) {
      this.stateMachine = stateMachine;
    }

    @Override
    public boolean isNumber() {
      return false;
    }

    @Override
    public void eatNextChar(char c) {
      CharType type = stateMachine.getCharType(c);
      if (type == CharType.NUMBER)
        stateMachine.setState(stateMachine.getPointNumberState());
      else
        stateMachine.setState(stateMachine.getFalseState());
    }
  }


  public class PointNumberState implements State {
    private StateMachine stateMachine;

    PointNumberState(StateMachine stateMachine) {
      this.stateMachine = stateMachine;
    }

    @Override
    public boolean isNumber() {
      return true;
    }

    @Override
    public void eatNextChar(char c) {
      CharType type = stateMachine.getCharType(c);
      switch (type) {
        case NUMBER:
          break;
        case EXPONENTIAL:
          stateMachine.setState(stateMachine.getExponentialState());
          break;
        default:
          stateMachine.setState(stateMachine.getFalseState());
          break;
      }
    }
  }

  public class ExponentialState implements State {
    private StateMachine stateMachine;

    ExponentialState(StateMachine stateMachine) {
      this.stateMachine = stateMachine;
    }

    @Override
    public boolean isNumber() {
      return false;
    }

    @Override
    public void eatNextChar(char c) {
      CharType type = stateMachine.getCharType(c);
      if (type == CharType.NUMBER)
        stateMachine.setState(stateMachine.getSecondNumberState());
      else if (type == CharType.SIGN)
        stateMachine.setState(stateMachine.getSecondSignState());
      else
        stateMachine.setState(stateMachine.getFalseState());
    }
  }

  public class SecondSignState implements State {
    private StateMachine stateMachine;

    SecondSignState(StateMachine stateMachine) {
      this.stateMachine = stateMachine;
    }

    @Override
    public boolean isNumber() {
      return false;
    }

    @Override
    public void eatNextChar(char c) {
      CharType type = stateMachine.getCharType(c);
      if (type == CharType.NUMBER)
        stateMachine.setState(stateMachine.getSecondNumberState());
      else
        stateMachine.setState(stateMachine.getFalseState());
    }
  }

  public class SecondNumberState implements State {
    private StateMachine stateMachine;

    SecondNumberState(StateMachine stateMachine) {
      this.stateMachine = stateMachine;
    }

    @Override
    public boolean isNumber() {
      return true;
    }

    @Override
    public void eatNextChar(char c) {
      CharType type = stateMachine.getCharType(c);
      if (type == CharType.NUMBER)
        stateMachine.setState(stateMachine.getSecondNumberState());
      else
        stateMachine.setState(stateMachine.getFalseState());
    }
  }

  public class FalseState implements State {
    @Override
    public boolean isNumber() {
      return false;
    }

    @Override
    public void eatNextChar(char c) {
      //do nothing
    }
  }

  public class StateMachine {
    State currentState;
    State emptyState;
    State firstSignState;
    State firstNumberState;
    State pointState;
    State singlePointState;
    State pointNumberState;
    State exponentialState;
    State secondSignState;
    State secondNumberState;
    State falseState;

    StateMachine() {
      emptyState = new EmptyState(this);
      firstSignState = new FirstSignState(this);
      firstNumberState = new FirstNumberState(this);
      pointState = new PointState(this);
      singlePointState = new SinglePointState(this);
      pointNumberState = new PointNumberState(this);
      exponentialState = new ExponentialState(this);
      secondSignState = new SecondSignState(this);
      secondNumberState = new SecondNumberState(this);
      falseState = new FalseState();
      currentState = emptyState;
    }

    void eatChar(char c) {
      currentState.eatNextChar(c);
    }

    boolean isNumber() {
      return currentState.isNumber();
    }

    public void setState(State state) {
      this.currentState = state;
    }

    public CharType getCharType(char c) {
      if (c >= '0' && c <= '9') {
        return CharType.NUMBER;
      } else if (c == '+' || c == '-') {
        return CharType.SIGN;
      } else if (c == 'e') {
        return CharType.EXPONENTIAL;
      } else if (c == '.') {
        return CharType.POINT;
      } else {
        return CharType.OTHER;
      }
    }

    public State getFirstSignState() {
      return firstSignState;
    }

    public State getFirstNumberState() {
      return firstNumberState;
    }

    public State getPointState() {
      return pointState;
    }

    public State getSinglePointState() {
      return singlePointState;
    }

    public State getPointNumberState() {
      return pointNumberState;
    }

    public State getExponentialState() {
      return exponentialState;
    }

    public State getSecondSignState() {
      return secondSignState;
    }

    public State getSecondNumberState() {
      return secondNumberState;
    }

    public State getFalseState() {
      return falseState;
    }
  }

  interface State {
    boolean isNumber();

    void eatNextChar(char c);
  }

  enum CharType {
    NUMBER, SIGN, EXPONENTIAL, POINT, OTHER
  }
}