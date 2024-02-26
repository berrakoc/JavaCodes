public class Timer {
    private ClockHand secondsHand;
    private ClockHand hundredthsHand;

    public Timer(){
        this.secondsHand= new ClockHand(60);
        this.hundredthsHand= new ClockHand(100);
    }

    public void advance(){
        hundredthsHand.advance();
        if (hundredthsHand.value()== 0){
            secondsHand.advance();
        }
    }

    public String toString(){
        return secondsHand+":"+hundredthsHand;
    }
}
